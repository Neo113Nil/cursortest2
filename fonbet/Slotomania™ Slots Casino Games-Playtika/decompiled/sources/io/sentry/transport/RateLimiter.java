package io.sentry.transport;

import io.ktor.sse.ServerSentEventKt;
import io.sentry.DataCategory;
import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.CollectionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class RateLimiter implements Closeable {
    private static final int HTTP_RETRY_AFTER_DEFAULT_DELAY_MILLIS = 60000;
    private final ICurrentDateProvider currentDateProvider;
    private final SentryOptions options;
    private final List<IRateLimitObserver> rateLimitObservers;
    private final Map<DataCategory, Date> sentryRetryAfterLimit;
    private Timer timer;
    private final Object timerLock;

    public interface IRateLimitObserver {
        void onRateLimitChanged(RateLimiter rateLimiter);
    }

    public RateLimiter(ICurrentDateProvider iCurrentDateProvider, SentryOptions sentryOptions) {
        this.sentryRetryAfterLimit = new ConcurrentHashMap();
        this.rateLimitObservers = new CopyOnWriteArrayList();
        this.timer = null;
        this.timerLock = new Object();
        this.currentDateProvider = iCurrentDateProvider;
        this.options = sentryOptions;
    }

    public RateLimiter(SentryOptions sentryOptions) {
        this(CurrentDateProvider.getInstance(), sentryOptions);
    }

    public SentryEnvelope filter(SentryEnvelope sentryEnvelope, Hint hint) {
        ArrayList arrayList = null;
        for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            if (isRetryAfter(sentryEnvelopeItem.getHeader().getType().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(sentryEnvelopeItem);
                this.options.getClientReportRecorder().recordLostEnvelopeItem(DiscardReason.RATELIMIT_BACKOFF, sentryEnvelopeItem);
            }
        }
        if (arrayList == null) {
            return sentryEnvelope;
        }
        this.options.getLogger().log(SentryLevel.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (SentryEnvelopeItem sentryEnvelopeItem2 : sentryEnvelope.getItems()) {
            if (!arrayList.contains(sentryEnvelopeItem2)) {
                arrayList2.add(sentryEnvelopeItem2);
            }
        }
        if (arrayList2.isEmpty()) {
            this.options.getLogger().log(SentryLevel.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
            markHintWhenSendingFailed(hint, false);
            return null;
        }
        return new SentryEnvelope(sentryEnvelope.getHeader(), arrayList2);
    }

    public boolean isActiveForCategory(DataCategory dataCategory) {
        Date date;
        Date date2 = new Date(this.currentDateProvider.getCurrentTimeMillis());
        Date date3 = this.sentryRetryAfterLimit.get(DataCategory.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (DataCategory.Unknown.equals(dataCategory) || (date = this.sentryRetryAfterLimit.get(dataCategory)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean isAnyRateLimitActive() {
        Date date = new Date(this.currentDateProvider.getCurrentTimeMillis());
        Iterator<DataCategory> it = this.sentryRetryAfterLimit.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = this.sentryRetryAfterLimit.get(it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    private static void markHintWhenSendingFailed(Hint hint, final boolean z) {
        HintUtils.runIfHasType(hint, SubmissionResult.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.RateLimiter$$ExternalSyntheticLambda0
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                ((SubmissionResult) obj).setResult(false);
            }
        });
        HintUtils.runIfHasType(hint, Retryable.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.RateLimiter$$ExternalSyntheticLambda1
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                ((Retryable) obj).setRetry(z);
            }
        });
    }

    private boolean isRetryAfter(String str) {
        return isActiveForCategory(getCategoryFromItemType(str));
    }

    private DataCategory getCategoryFromItemType(String str) {
        str.hashCode();
        switch (str) {
            case "attachment":
                return DataCategory.Attachment;
            case "replay_video":
                return DataCategory.Replay;
            case "statsd":
                return DataCategory.MetricBucket;
            case "profile":
                return DataCategory.Profile;
            case "event":
                return DataCategory.Error;
            case "check_in":
                return DataCategory.Monitor;
            case "session":
                return DataCategory.Session;
            case "transaction":
                return DataCategory.Transaction;
            default:
                return DataCategory.Unknown;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateRetryAfterLimits(String str, String str2, int i) {
        String[] strArr;
        int i2;
        String[] strArr2;
        int i3;
        if (str == null) {
            if (i == 429) {
                applyRetryAfterOnlyIfLonger(DataCategory.All, new Date(this.currentDateProvider.getCurrentTimeMillis() + parseRetryAfterOrDefault(str2)));
                return;
            }
            return;
        }
        int i4 = -1;
        String[] split = str.split(",", -1);
        int length = split.length;
        int i5 = 0;
        int i6 = 0;
        while (i6 < length) {
            String[] split2 = split[i6].replace(ServerSentEventKt.SPACE, "").split(":", i4);
            String str3 = split2.length > 4 ? split2[4] : null;
            if (split2.length > 0) {
                long parseRetryAfterOrDefault = parseRetryAfterOrDefault(split2[i5]);
                if (split2.length > 1) {
                    String str4 = split2[1];
                    Date date = new Date(this.currentDateProvider.getCurrentTimeMillis() + parseRetryAfterOrDefault);
                    if (str4 != null && !str4.isEmpty()) {
                        String[] split3 = str4.split(";", i4);
                        int length2 = split3.length;
                        int i7 = i5;
                        while (i7 < length2) {
                            String str5 = split3[i7];
                            DataCategory dataCategory = DataCategory.Unknown;
                            try {
                                String camelCase = StringUtils.camelCase(str5);
                                if (camelCase != null) {
                                    dataCategory = DataCategory.valueOf(camelCase);
                                    strArr2 = split;
                                } else {
                                    strArr2 = split;
                                    try {
                                        this.options.getLogger().log(SentryLevel.ERROR, "Couldn't capitalize: %s", str5);
                                    } catch (IllegalArgumentException e) {
                                        e = e;
                                        this.options.getLogger().log(SentryLevel.INFO, e, "Unknown category: %s", str5);
                                        if (DataCategory.Unknown.equals(dataCategory)) {
                                        }
                                        i7++;
                                        i4 = i3;
                                        split = strArr2;
                                    }
                                }
                            } catch (IllegalArgumentException e2) {
                                e = e2;
                                strArr2 = split;
                            }
                            if (DataCategory.Unknown.equals(dataCategory)) {
                                if (!DataCategory.MetricBucket.equals(dataCategory) || str3 == null || str3.equals("")) {
                                    i3 = -1;
                                } else {
                                    i3 = -1;
                                    String[] split4 = str3.split(";", -1);
                                    if (split4.length > 0 && !CollectionUtils.contains(split4, "custom")) {
                                    }
                                }
                                applyRetryAfterOnlyIfLonger(dataCategory, date);
                            } else {
                                i3 = -1;
                            }
                            i7++;
                            i4 = i3;
                            split = strArr2;
                        }
                    } else {
                        strArr = split;
                        i2 = i4;
                        applyRetryAfterOnlyIfLonger(DataCategory.All, date);
                        i6++;
                        i4 = i2;
                        i5 = 0;
                        split = strArr;
                    }
                }
            }
            strArr = split;
            i2 = i4;
            i6++;
            i4 = i2;
            i5 = 0;
            split = strArr;
        }
    }

    private void applyRetryAfterOnlyIfLonger(DataCategory dataCategory, Date date) {
        Date date2 = this.sentryRetryAfterLimit.get(dataCategory);
        if (date2 == null || date.after(date2)) {
            this.sentryRetryAfterLimit.put(dataCategory, date);
            notifyRateLimitObservers();
            synchronized (this.timerLock) {
                if (this.timer == null) {
                    this.timer = new Timer(true);
                }
                this.timer.schedule(new TimerTask() { // from class: io.sentry.transport.RateLimiter.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        RateLimiter.this.notifyRateLimitObservers();
                    }
                }, date);
            }
        }
    }

    private long parseRetryAfterOrDefault(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRateLimitObservers() {
        Iterator<IRateLimitObserver> it = this.rateLimitObservers.iterator();
        while (it.hasNext()) {
            it.next().onRateLimitChanged(this);
        }
    }

    public void addRateLimitObserver(IRateLimitObserver iRateLimitObserver) {
        this.rateLimitObservers.add(iRateLimitObserver);
    }

    public void removeRateLimitObserver(IRateLimitObserver iRateLimitObserver) {
        this.rateLimitObservers.remove(iRateLimitObserver);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.timerLock) {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
        }
        this.rateLimitObservers.clear();
    }
}
