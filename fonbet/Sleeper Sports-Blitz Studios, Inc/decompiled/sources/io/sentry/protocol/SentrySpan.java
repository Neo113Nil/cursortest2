package io.sentry.protocol;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.Span;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class SentrySpan implements JsonUnknown, JsonSerializable {
    private Map<String, Object> data;
    private final String description;
    private final Map<String, MeasurementValue> measurements;
    private final String op;
    private final String origin;
    private final SpanId parentSpanId;
    private final SpanId spanId;
    private final Double startTimestamp;
    private final SpanStatus status;
    private final Map<String, String> tags;
    private final Double timestamp;
    private final SentryId traceId;
    private Map<String, Object> unknown;

    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String DESCRIPTION = "description";
        public static final String MEASUREMENTS = "measurements";
        public static final String OP = "op";
        public static final String ORIGIN = "origin";
        public static final String PARENT_SPAN_ID = "parent_span_id";
        public static final String SPAN_ID = "span_id";
        public static final String START_TIMESTAMP = "start_timestamp";
        public static final String STATUS = "status";
        public static final String TAGS = "tags";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
    }

    public SentrySpan(Span span) {
        this(span, span.getData());
    }

    public SentrySpan(Span span, Map<String, Object> map) {
        Objects.requireNonNull(span, "span is required");
        this.description = span.getDescription();
        this.op = span.getOperation();
        this.spanId = span.getSpanId();
        this.parentSpanId = span.getParentSpanId();
        this.traceId = span.getTraceId();
        this.status = span.getStatus();
        this.origin = span.getSpanContext().getOrigin();
        Map<String, String> newConcurrentHashMap = CollectionUtils.newConcurrentHashMap(span.getTags());
        this.tags = newConcurrentHashMap == null ? new ConcurrentHashMap<>() : newConcurrentHashMap;
        Map<String, MeasurementValue> newConcurrentHashMap2 = CollectionUtils.newConcurrentHashMap(span.getMeasurements());
        this.measurements = newConcurrentHashMap2 == null ? new ConcurrentHashMap<>() : newConcurrentHashMap2;
        this.timestamp = span.getFinishDate() == null ? null : Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().laterDateNanosTimestampByDiff(span.getFinishDate())));
        this.startTimestamp = Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().nanoTimestamp()));
        this.data = map;
        FeatureFlags featureFlags = span.getSpanContext().getFeatureFlagBuffer().getFeatureFlags();
        if (featureFlags != null) {
            if (this.data == null) {
                this.data = new HashMap();
            }
            for (FeatureFlag featureFlag : featureFlags.getValues()) {
                this.data.put(FeatureFlag.DATA_PREFIX + featureFlag.getFlag(), featureFlag.getResult());
            }
        }
    }

    public SentrySpan(Double d, Double d2, SentryId sentryId, SpanId spanId, SpanId spanId2, String str, String str2, SpanStatus spanStatus, String str3, Map<String, String> map, Map<String, MeasurementValue> map2, Map<String, Object> map3) {
        this.startTimestamp = d;
        this.timestamp = d2;
        this.traceId = sentryId;
        this.spanId = spanId;
        this.parentSpanId = spanId2;
        this.op = str;
        this.description = str2;
        this.status = spanStatus;
        this.origin = str3;
        this.tags = map;
        this.measurements = map2;
        this.data = map3;
    }

    public boolean isFinished() {
        return this.timestamp != null;
    }

    public Double getStartTimestamp() {
        return this.startTimestamp;
    }

    public Double getTimestamp() {
        return this.timestamp;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public String getOp() {
        return this.op;
    }

    public String getDescription() {
        return this.description;
    }

    public SpanStatus getStatus() {
        return this.status;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> map) {
        this.data = map;
    }

    public String getOrigin() {
        return this.origin;
    }

    public Map<String, MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name("start_timestamp").value(iLogger, doubleToBigDecimal(this.startTimestamp));
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(this.timestamp));
        }
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name("span_id").value(iLogger, this.spanId);
        if (this.parentSpanId != null) {
            objectWriter.name("parent_span_id").value(iLogger, this.parentSpanId);
        }
        objectWriter.name("op").value(this.op);
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        if (this.status != null) {
            objectWriter.name("status").value(iLogger, this.status);
        }
        if (this.origin != null) {
            objectWriter.name("origin").value(iLogger, this.origin);
        }
        if (!this.tags.isEmpty()) {
            objectWriter.name("tags").value(iLogger, this.tags);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        if (!this.measurements.isEmpty()) {
            objectWriter.name("measurements").value(iLogger, this.measurements);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    private BigDecimal doubleToBigDecimal(Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public static final class Deserializer implements JsonDeserializer<SentrySpan> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Map] */
        @Override // io.sentry.JsonDeserializer
        public SentrySpan deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String nextName;
            HashMap hashMap;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            Double d = null;
            HashMap hashMap2 = null;
            SentryId sentryId = null;
            SpanId spanId = null;
            Map map = null;
            String str = null;
            Double d2 = null;
            SpanId spanId2 = null;
            String str2 = null;
            SpanStatus spanStatus = null;
            String str3 = null;
            Map map2 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d3 = d;
                HashMap hashMap3 = hashMap2;
                SentryId sentryId2 = sentryId;
                SpanId spanId3 = spanId;
                if (objectReader.peek() != JsonToken.NAME) {
                    if (d3 == null) {
                        throw missingRequiredFieldException("start_timestamp", iLogger);
                    }
                    if (sentryId2 == null) {
                        throw missingRequiredFieldException("trace_id", iLogger);
                    }
                    if (spanId3 == null) {
                        throw missingRequiredFieldException("span_id", iLogger);
                    }
                    if (str == null) {
                        throw missingRequiredFieldException("op", iLogger);
                    }
                    HashMap hashMap4 = hashMap3 == null ? new HashMap() : hashMap3;
                    if (map == null) {
                        map = new HashMap();
                    }
                    SentrySpan sentrySpan = new SentrySpan(d3, d2, sentryId2, spanId3, spanId2, str, str2, spanStatus, str3, hashMap4, map, map2);
                    sentrySpan.setUnknown(concurrentHashMap2);
                    objectReader.endObject();
                    return sentrySpan;
                }
                nextName = objectReader.nextName();
                nextName.hashCode();
                switch (nextName) {
                    case "span_id":
                        spanId = new SpanId.Deserializer().deserialize(objectReader, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap2 = hashMap3;
                        sentryId = sentryId2;
                        break;
                    case "parent_span_id":
                        spanId2 = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "description":
                        str2 = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "start_timestamp":
                        try {
                            d = objectReader.nextDoubleOrNull();
                        } catch (NumberFormatException unused) {
                            Date nextDateOrNull = objectReader.nextDateOrNull(iLogger);
                            d = nextDateOrNull != null ? Double.valueOf(DateUtils.dateToSeconds(nextDateOrNull)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "origin":
                        str3 = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "status":
                        spanStatus = (SpanStatus) objectReader.nextOrNull(iLogger, new SpanStatus.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "measurements":
                        map = objectReader.nextMapOrNull(iLogger, new MeasurementValue.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "op":
                        str = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "data":
                        map2 = (Map) objectReader.nextObjectOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "tags":
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap = (Map) objectReader.nextObjectOrNull();
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "timestamp":
                        try {
                            d2 = objectReader.nextDoubleOrNull();
                        } catch (NumberFormatException unused2) {
                            Date nextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                            d2 = nextDateOrNull2 != null ? Double.valueOf(DateUtils.dateToSeconds(nextDateOrNull2)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                    case "trace_id":
                        sentryId = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        d = d3;
                        hashMap2 = hashMap3;
                        spanId = spanId3;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                        d = d3;
                        hashMap = hashMap3;
                        sentryId = sentryId2;
                        hashMap2 = hashMap;
                        spanId = spanId3;
                        break;
                }
            }
        }

        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.log(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }
    }
}
