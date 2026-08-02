package io.sentry;

import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SpanId;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SentryMetricsEvent implements JsonUnknown, JsonSerializable {
    private Map<String, SentryLogEventAttributeValue> attributes;
    private String name;
    private SpanId spanId;
    private Double timestamp;
    private SentryId traceId;
    private String type;
    private String unit;
    private Map<String, Object> unknown;
    private Double value;

    public static final class JsonKeys {
        public static final String ATTRIBUTES = "attributes";
        public static final String NAME = "name";
        public static final String SPAN_ID = "span_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
        public static final String TYPE = "type";
        public static final String UNIT = "unit";
        public static final String VALUE = "value";
    }

    public SentryMetricsEvent(SentryId sentryId, SentryDate sentryDate, String str, String str2, Double d) {
        this(sentryId, Double.valueOf(DateUtils.nanosToSeconds(sentryDate.nanoTimestamp())), str, str2, d);
    }

    public SentryMetricsEvent(SentryId sentryId, Double d, String str, String str2, Double d2) {
        this.traceId = sentryId;
        this.timestamp = d;
        this.name = str;
        this.type = str2;
        this.value = d2;
    }

    public Double getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Double d) {
        this.timestamp = d;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public void setSpanId(SpanId spanId) {
        this.spanId = spanId;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public void setTraceId(SentryId sentryId) {
        this.traceId = sentryId;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double d) {
        this.value = d;
    }

    public Map<String, SentryLogEventAttributeValue> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(Map<String, SentryLogEventAttributeValue> map) {
        this.attributes = map;
    }

    public void setAttribute(String str, SentryLogEventAttributeValue sentryLogEventAttributeValue) {
        if (str == null) {
            return;
        }
        if (this.attributes == null) {
            this.attributes = new HashMap();
        }
        this.attributes.put(str, sentryLogEventAttributeValue);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, DateUtils.doubleToBigDecimal(this.timestamp));
        objectWriter.name("type").value(this.type);
        objectWriter.name("name").value(this.name);
        objectWriter.name("value").value(this.value);
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        if (this.spanId != null) {
            objectWriter.name("span_id").value(iLogger, this.spanId);
        }
        if (this.unit != null) {
            objectWriter.name("unit").value(iLogger, this.unit);
        }
        if (this.attributes != null) {
            objectWriter.name("attributes").value(iLogger, this.attributes);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public static final class Deserializer implements JsonDeserializer<SentryMetricsEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryMetricsEvent deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String nextName;
            objectReader.beginObject();
            HashMap hashMap = null;
            SentryId sentryId = null;
            Double d = null;
            String str = null;
            String str2 = null;
            Double d2 = null;
            Map<String, SentryLogEventAttributeValue> map = null;
            SpanId spanId = null;
            String str3 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                nextName = objectReader.nextName();
                nextName.hashCode();
                switch (nextName) {
                    case "span_id":
                        spanId = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        break;
                    case "name":
                        str = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        str2 = objectReader.nextStringOrNull();
                        break;
                    case "unit":
                        str3 = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        d = objectReader.nextDoubleOrNull();
                        break;
                    case "value":
                        d2 = objectReader.nextDoubleOrNull();
                        break;
                    case "attributes":
                        map = objectReader.nextMapOrNull(iLogger, new SentryLogEventAttributeValue.Deserializer());
                        break;
                    case "trace_id":
                        sentryId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, hashMap, nextName);
                        break;
                }
            }
            objectReader.endObject();
            if (sentryId == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (d == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (str2 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"type\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (str == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException4);
                throw illegalStateException4;
            }
            if (d2 == null) {
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"value\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException5);
                throw illegalStateException5;
            }
            SentryMetricsEvent sentryMetricsEvent = new SentryMetricsEvent(sentryId, d, str, str2, d2);
            sentryMetricsEvent.setAttributes(map);
            sentryMetricsEvent.setSpanId(spanId);
            sentryMetricsEvent.setUnit(str3);
            sentryMetricsEvent.setUnknown(hashMap);
            return sentryMetricsEvent;
        }
    }
}
