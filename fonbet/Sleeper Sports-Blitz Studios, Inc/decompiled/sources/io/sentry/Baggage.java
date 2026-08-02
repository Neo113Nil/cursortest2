package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.SampleRateUtils;
import io.sentry.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public final class Baggage {
    static final String CHARSET = "UTF-8";
    static final String SENTRY_BAGGAGE_PREFIX = "sentry-";
    private final ConcurrentHashMap<String, String> keyValues;
    private final AutoClosableReentrantLock keyValuesLock;
    final ILogger logger;
    private boolean mutable;
    private Double sampleRand;
    private Double sampleRate;
    private final boolean shouldFreeze;
    private final String thirdPartyHeader;
    static final Integer MAX_BAGGAGE_STRING_LENGTH = 8192;
    static final Integer MAX_BAGGAGE_LIST_MEMBER_COUNT = 64;
    private static final DecimalFormatterThreadLocal decimalFormatter = new DecimalFormatterThreadLocal();

    public static final class DSCKeys {
        public static final String TRACE_ID = "sentry-trace_id";
        public static final String PUBLIC_KEY = "sentry-public_key";
        public static final String RELEASE = "sentry-release";
        public static final String USER_ID = "sentry-user_id";
        public static final String ENVIRONMENT = "sentry-environment";
        public static final String TRANSACTION = "sentry-transaction";
        public static final String SAMPLE_RATE = "sentry-sample_rate";
        public static final String SAMPLE_RAND = "sentry-sample_rand";
        public static final String SAMPLED = "sentry-sampled";
        public static final String REPLAY_ID = "sentry-replay_id";
        public static final List<String> ALL = Arrays.asList(TRACE_ID, PUBLIC_KEY, RELEASE, USER_ID, ENVIRONMENT, TRANSACTION, SAMPLE_RATE, SAMPLE_RAND, SAMPLED, REPLAY_ID);
    }

    private static class DecimalFormatterThreadLocal extends ThreadLocal<DecimalFormat> {
        private DecimalFormatterThreadLocal() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public static Baggage fromHeader(String str) {
        return fromHeader(str, false, ScopesAdapter.getInstance().getOptions().getLogger());
    }

    public static Baggage fromHeader(List<String> list) {
        return fromHeader(list, false, ScopesAdapter.getInstance().getOptions().getLogger());
    }

    public static Baggage fromHeader(String str, ILogger iLogger) {
        return fromHeader(str, false, iLogger);
    }

    public static Baggage fromHeader(List<String> list, ILogger iLogger) {
        return fromHeader(list, false, iLogger);
    }

    public static Baggage fromHeader(List<String> list, boolean z, ILogger iLogger) {
        if (list != null) {
            return fromHeader(StringUtils.join(",", list), z, iLogger);
        }
        return fromHeader((String) null, z, iLogger);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Baggage fromHeader(String str, boolean z, ILogger iLogger) {
        boolean z2;
        Double d;
        Double d2;
        boolean z3;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (str != null) {
            try {
                String[] split = str.split(",", -1);
                int length = split.length;
                int i2 = 0;
                boolean z4 = false;
                d = null;
                d2 = null;
                while (i2 < length) {
                    try {
                        String str2 = split[i2];
                        if (str2.trim().startsWith(SENTRY_BAGGAGE_PREFIX)) {
                            try {
                                int indexOf = str2.indexOf("=");
                                String trim = str2.substring(i, indexOf).trim();
                                String decode = decode(trim);
                                String decode2 = decode(str2.substring(indexOf + 1).trim());
                                if (DSCKeys.SAMPLE_RATE.equals(decode)) {
                                    d = toDouble(decode2);
                                } else if (DSCKeys.SAMPLE_RAND.equals(decode)) {
                                    d2 = toDouble(decode2);
                                } else {
                                    concurrentHashMap.put(decode, decode2);
                                }
                                if (!DSCKeys.SAMPLE_RAND.equalsIgnoreCase(trim)) {
                                    z4 = true;
                                }
                            } catch (Throwable th) {
                                iLogger.log(SentryLevel.ERROR, th, "Unable to decode baggage key value pair %s", str2);
                            }
                        } else if (z) {
                            arrayList.add(str2.trim());
                        }
                        i2++;
                        i = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = z4;
                        iLogger.log(SentryLevel.ERROR, th, "Unable to decode baggage header %s", str);
                        z2 = z3;
                        return new Baggage(concurrentHashMap, d, d2, !arrayList.isEmpty() ? null : StringUtils.join(",", arrayList), true, z2, iLogger);
                    }
                }
                z2 = z4;
            } catch (Throwable th3) {
                th = th3;
                z3 = false;
                d = null;
                d2 = null;
            }
        } else {
            z2 = false;
            d = null;
            d2 = null;
        }
        return new Baggage(concurrentHashMap, d, d2, !arrayList.isEmpty() ? null : StringUtils.join(",", arrayList), true, z2, iLogger);
    }

    public static Baggage fromEvent(SentryBaseEvent sentryBaseEvent, String str, SentryOptions sentryOptions) {
        Baggage baggage = new Baggage(sentryOptions.getLogger());
        SpanContext trace = sentryBaseEvent.getContexts().getTrace();
        baggage.setTraceId(trace != null ? trace.getTraceId().toString() : null);
        baggage.setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        baggage.setRelease(sentryBaseEvent.getRelease());
        baggage.setEnvironment(sentryBaseEvent.getEnvironment());
        baggage.setTransaction(str);
        baggage.setSampleRate(null);
        baggage.setSampled(null);
        baggage.setSampleRand(null);
        Object obj = sentryBaseEvent.getContexts().get("replay_id");
        if (obj != null && !obj.toString().equals(SentryId.EMPTY_ID.toString())) {
            baggage.setReplayId(obj.toString());
            sentryBaseEvent.getContexts().remove("replay_id");
        }
        baggage.freeze();
        return baggage;
    }

    public Baggage(ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, true, false, iLogger);
    }

    public Baggage(Baggage baggage) {
        this(baggage.keyValues, baggage.sampleRate, baggage.sampleRand, baggage.thirdPartyHeader, baggage.mutable, baggage.shouldFreeze, baggage.logger);
    }

    public Baggage(ConcurrentHashMap<String, String> concurrentHashMap, Double d, Double d2, String str, boolean z, boolean z2, ILogger iLogger) {
        this.keyValuesLock = new AutoClosableReentrantLock();
        this.keyValues = concurrentHashMap;
        this.sampleRate = d;
        this.sampleRand = d2;
        this.logger = iLogger;
        this.thirdPartyHeader = str;
        this.mutable = z;
        this.shouldFreeze = z2;
    }

    public void freeze() {
        this.mutable = false;
    }

    public boolean isMutable() {
        return this.mutable;
    }

    public boolean isShouldFreeze() {
        return this.shouldFreeze;
    }

    public String getThirdPartyHeader() {
        return this.thirdPartyHeader;
    }

    public String toHeaderString(String str) {
        String str2;
        int i;
        String str3;
        StringBuilder sb = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            sb.append(str);
            i = StringUtils.countOf(str, AbstractJsonLexerKt.COMMA) + 1;
            str2 = ",";
        } else {
            str2 = "";
            i = 0;
        }
        ISentryLifecycleToken acquire = this.keyValuesLock.acquire();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(this.keyValues.keys()));
            if (acquire != null) {
                acquire.close();
            }
            treeSet.add(DSCKeys.SAMPLE_RATE);
            treeSet.add(DSCKeys.SAMPLE_RAND);
            for (String str4 : treeSet) {
                if (DSCKeys.SAMPLE_RATE.equals(str4)) {
                    str3 = sampleRateToString(this.sampleRate);
                } else if (DSCKeys.SAMPLE_RAND.equals(str4)) {
                    str3 = sampleRateToString(this.sampleRand);
                } else {
                    str3 = this.keyValues.get(str4);
                }
                if (str3 != null) {
                    Integer num = MAX_BAGGAGE_LIST_MEMBER_COUNT;
                    if (i >= num.intValue()) {
                        this.logger.log(SentryLevel.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str4, num);
                    } else {
                        try {
                            String str5 = str2 + encode(str4) + "=" + encode(str3);
                            int length = sb.length() + str5.length();
                            Integer num2 = MAX_BAGGAGE_STRING_LENGTH;
                            if (length > num2.intValue()) {
                                this.logger.log(SentryLevel.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str4, num2);
                            } else {
                                i++;
                                sb.append(str5);
                                str2 = ",";
                            }
                        } catch (Throwable th) {
                            this.logger.log(SentryLevel.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str4, str3);
                        }
                    }
                }
            }
            return sb.toString();
        } catch (Throwable th2) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private String encode(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    private static String decode(String str) throws UnsupportedEncodingException {
        return URLDecoder.decode(str, "UTF-8");
    }

    public String get(String str) {
        if (str == null) {
            return null;
        }
        return this.keyValues.get(str);
    }

    public String getTraceId() {
        return get(DSCKeys.TRACE_ID);
    }

    public void setTraceId(String str) {
        set(DSCKeys.TRACE_ID, str);
    }

    public String getPublicKey() {
        return get(DSCKeys.PUBLIC_KEY);
    }

    public void setPublicKey(String str) {
        set(DSCKeys.PUBLIC_KEY, str);
    }

    public String getEnvironment() {
        return get(DSCKeys.ENVIRONMENT);
    }

    public void setEnvironment(String str) {
        set(DSCKeys.ENVIRONMENT, str);
    }

    public String getRelease() {
        return get(DSCKeys.RELEASE);
    }

    public void setRelease(String str) {
        set(DSCKeys.RELEASE, str);
    }

    public String getUserId() {
        return get(DSCKeys.USER_ID);
    }

    public void setUserId(String str) {
        set(DSCKeys.USER_ID, str);
    }

    public String getTransaction() {
        return get(DSCKeys.TRANSACTION);
    }

    public void setTransaction(String str) {
        set(DSCKeys.TRANSACTION, str);
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public String getSampled() {
        return get(DSCKeys.SAMPLED);
    }

    public void setSampleRate(Double d) {
        if (isMutable()) {
            this.sampleRate = d;
        }
    }

    public void forceSetSampleRate(Double d) {
        this.sampleRate = d;
    }

    public Double getSampleRand() {
        return this.sampleRand;
    }

    public void setSampleRand(Double d) {
        if (isMutable()) {
            this.sampleRand = d;
        }
    }

    public void setSampled(String str) {
        set(DSCKeys.SAMPLED, str);
    }

    public String getReplayId() {
        return get(DSCKeys.REPLAY_ID);
    }

    public void setReplayId(String str) {
        set(DSCKeys.REPLAY_ID, str);
    }

    public void set(String str, String str2) {
        if (this.mutable) {
            if (str2 == null) {
                this.keyValues.remove(str);
            } else {
                this.keyValues.put(str, str2);
            }
        }
    }

    public Map<String, Object> getUnknown() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ISentryLifecycleToken acquire = this.keyValuesLock.acquire();
        try {
            for (Map.Entry<String, String> entry : this.keyValues.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!DSCKeys.ALL.contains(key) && value != null) {
                    concurrentHashMap.put(key.replaceFirst(SENTRY_BAGGAGE_PREFIX, ""), value);
                }
            }
            if (acquire != null) {
                acquire.close();
            }
            return concurrentHashMap;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void setValuesFromTransaction(SentryId sentryId, SentryId sentryId2, SentryOptions sentryOptions, TracesSamplingDecision tracesSamplingDecision, String str, TransactionNameSource transactionNameSource) {
        setTraceId(sentryId.toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!isHighQualityTransactionName(transactionNameSource)) {
            str = null;
        }
        setTransaction(str);
        if (sentryId2 != null && !SentryId.EMPTY_ID.equals(sentryId2)) {
            setReplayId(sentryId2.toString());
        }
        setSampleRate(sampleRate(tracesSamplingDecision));
        setSampled(StringUtils.toString(sampled(tracesSamplingDecision)));
        setSampleRand(sampleRand(tracesSamplingDecision));
    }

    public void setValuesFromSamplingDecision(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return;
        }
        setSampled(StringUtils.toString(sampled(tracesSamplingDecision)));
        if (tracesSamplingDecision.getSampleRand() != null) {
            setSampleRand(sampleRand(tracesSamplingDecision));
        }
        if (tracesSamplingDecision.getSampleRate() != null) {
            forceSetSampleRate(sampleRate(tracesSamplingDecision));
        }
    }

    public void setValuesFromScope(IScope iScope, SentryOptions sentryOptions) {
        PropagationContext propagationContext = iScope.getPropagationContext();
        SentryId replayId = iScope.getReplayId();
        setTraceId(propagationContext.getTraceId().toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!SentryId.EMPTY_ID.equals(replayId)) {
            setReplayId(replayId.toString());
        }
        setTransaction(null);
        setSampleRate(null);
        setSampled(null);
    }

    private static Double sampleRate(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRate();
    }

    private static Double sampleRand(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRand();
    }

    private static String sampleRateToString(Double d) {
        if (SampleRateUtils.isValidTracesSampleRate(d, false)) {
            return decimalFormatter.get().format(d);
        }
        return null;
    }

    private static Boolean sampled(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampled();
    }

    private static boolean isHighQualityTransactionName(TransactionNameSource transactionNameSource) {
        return (transactionNameSource == null || TransactionNameSource.URL.equals(transactionNameSource)) ? false : true;
    }

    private static Double toDouble(String str) {
        if (str != null) {
            try {
                double parseDouble = Double.parseDouble(str);
                if (SampleRateUtils.isValidTracesSampleRate(Double.valueOf(parseDouble), false)) {
                    return Double.valueOf(parseDouble);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public TraceContext toTraceContext() {
        String traceId = getTraceId();
        String replayId = getReplayId();
        String publicKey = getPublicKey();
        if (traceId == null || publicKey == null) {
            return null;
        }
        SentryId sentryId = new SentryId(traceId);
        SentryId sentryId2 = null;
        String release = getRelease();
        String environment = getEnvironment();
        String userId = getUserId();
        String transaction = getTransaction();
        String sampleRateToString = sampleRateToString(getSampleRate());
        String sampled = getSampled();
        if (replayId != null) {
            sentryId2 = new SentryId(replayId);
        }
        TraceContext traceContext = new TraceContext(sentryId, publicKey, release, environment, userId, transaction, sampleRateToString, sampled, sentryId2, sampleRateToString(getSampleRand()));
        traceContext.setUnknown(getUnknown());
        return traceContext;
    }
}
