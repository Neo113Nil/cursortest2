package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.braze.managers.x$$ExternalSyntheticApiModelOutline0;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.Hint;
import io.sentry.IScopes;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.hints.BlockingFlushHint;
import io.sentry.protocol.SentryId;
import io.sentry.transport.ICurrentDateProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
final class ApplicationExitInfoHistoryDispatcher implements Runnable {
    static final long NINETY_DAYS_THRESHOLD = TimeUnit.DAYS.toMillis(91);
    private final Context context;
    private final SentryAndroidOptions options;
    private final ApplicationExitInfoPolicy policy;
    private final IScopes scopes;
    private final long threshold;

    interface ApplicationExitInfoPolicy {
        Report buildReport(ApplicationExitInfo applicationExitInfo, boolean z);

        String getLabel();

        Long getLastReportedTimestamp();

        int getTargetReason();

        boolean shouldReportHistorical();
    }

    ApplicationExitInfoHistoryDispatcher(Context context, IScopes iScopes, SentryAndroidOptions sentryAndroidOptions, ICurrentDateProvider iCurrentDateProvider, ApplicationExitInfoPolicy applicationExitInfoPolicy) {
        this.context = ContextUtils.getApplicationContext(context);
        this.scopes = iScopes;
        this.options = sentryAndroidOptions;
        this.policy = applicationExitInfoPolicy;
        this.threshold = iCurrentDateProvider.getCurrentTimeMillis() - NINETY_DAYS_THRESHOLD;
    }

    @Override // java.lang.Runnable
    public void run() {
        List historicalProcessExitReasons;
        long timestamp;
        long timestamp2;
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
        if (activityManager == null) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        waitPreviousSessionFlush();
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        Long lastReportedTimestamp = this.policy.getLastReportedTimestamp();
        ApplicationExitInfo removeLatest = removeLatest(arrayList);
        if (removeLatest == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No %ss have been found in the historical exit reasons list.", this.policy.getLabel());
            return;
        }
        timestamp = removeLatest.getTimestamp();
        if (timestamp < this.threshold) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Latest %s happened too long ago, returning early.", this.policy.getLabel());
            return;
        }
        if (lastReportedTimestamp != null) {
            timestamp2 = removeLatest.getTimestamp();
            if (timestamp2 <= lastReportedTimestamp.longValue()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Latest %s has already been reported, returning early.", this.policy.getLabel());
                return;
            }
        }
        if (this.policy.shouldReportHistorical()) {
            reportHistorical(arrayList, lastReportedTimestamp);
        }
        report(removeLatest, true);
    }

    private void waitPreviousSessionFlush() {
        IEnvelopeCache envelopeDiskCache = this.options.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof EnvelopeCache) && this.options.isEnableAutoSessionTracking()) {
            EnvelopeCache envelopeCache = (EnvelopeCache) envelopeDiskCache;
            if (envelopeCache.waitPreviousSessionFlush()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
            envelopeCache.flushPreviousSession();
        }
    }

    private ApplicationExitInfo removeLatest(List<ApplicationExitInfo> list) {
        int reason;
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo m = x$$ExternalSyntheticApiModelOutline0.m((Object) it.next());
            reason = m.getReason();
            if (reason == this.policy.getTargetReason()) {
                it.remove();
                return m;
            }
        }
        return null;
    }

    private void reportHistorical(List<ApplicationExitInfo> list, Long l) {
        int reason;
        long timestamp;
        long timestamp2;
        Collections.reverse(list);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo m = x$$ExternalSyntheticApiModelOutline0.m((Object) it.next());
            reason = m.getReason();
            if (reason == this.policy.getTargetReason()) {
                timestamp = m.getTimestamp();
                if (timestamp < this.threshold) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "%s happened too long ago %s.", this.policy.getLabel(), m);
                } else {
                    if (l != null) {
                        timestamp2 = m.getTimestamp();
                        if (timestamp2 <= l.longValue()) {
                            this.options.getLogger().log(SentryLevel.DEBUG, "%s has already been reported %s.", this.policy.getLabel(), m);
                        }
                    }
                    report(m, false);
                }
            }
        }
    }

    private void report(ApplicationExitInfo applicationExitInfo, boolean z) {
        BlockingFlushHint flushHint;
        Report buildReport = this.policy.buildReport(applicationExitInfo, z);
        if (buildReport == null || this.scopes.captureEvent(buildReport.getEvent(), buildReport.getHint()).equals(SentryId.EMPTY_ID) || (flushHint = buildReport.getFlushHint()) == null || flushHint.waitFlush()) {
            return;
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", this.policy.getLabel(), buildReport.getEvent().getEventId());
    }

    public static final class Report {
        private final SentryEvent event;
        private final BlockingFlushHint flushHint;
        private final Hint hint;

        Report(SentryEvent sentryEvent, Hint hint, BlockingFlushHint blockingFlushHint) {
            this.event = sentryEvent;
            this.hint = hint;
            this.flushHint = blockingFlushHint;
        }

        public SentryEvent getEvent() {
            return this.event;
        }

        public Hint getHint() {
            return this.hint;
        }

        public BlockingFlushHint getFlushHint() {
            return this.flushHint;
        }
    }
}
