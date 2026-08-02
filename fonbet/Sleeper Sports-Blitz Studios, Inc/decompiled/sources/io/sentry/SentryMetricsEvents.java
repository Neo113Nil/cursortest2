package io.sentry;

import io.sentry.SentryMetricsEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SentryMetricsEvents implements JsonUnknown, JsonSerializable {
    private List<SentryMetricsEvent> items;
    private Map<String, Object> unknown;

    public static final class JsonKeys {
        public static final String ITEMS = "items";
    }

    public SentryMetricsEvents(List<SentryMetricsEvent> list) {
        this.items = list;
    }

    public List<SentryMetricsEvent> getItems() {
        return this.items;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name("items").value(iLogger, this.items);
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

    public static final class Deserializer implements JsonDeserializer<SentryMetricsEvents> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryMetricsEvents deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            objectReader.beginObject();
            List list = null;
            HashMap hashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.hashCode();
                if (nextName.equals("items")) {
                    list = objectReader.nextListOrNull(iLogger, new SentryMetricsEvent.Deserializer());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, hashMap, nextName);
                }
            }
            objectReader.endObject();
            if (list == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"items\"", illegalStateException);
                throw illegalStateException;
            }
            SentryMetricsEvents sentryMetricsEvents = new SentryMetricsEvents(list);
            sentryMetricsEvents.setUnknown(hashMap);
            return sentryMetricsEvents;
        }
    }
}
