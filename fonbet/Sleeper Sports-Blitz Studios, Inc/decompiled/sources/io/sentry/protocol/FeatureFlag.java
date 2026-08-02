package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class FeatureFlag implements JsonUnknown, JsonSerializable {
    public static final String DATA_PREFIX = "flag.evaluation.";
    private String flag;
    private boolean result;
    private Map<String, Object> unknown;

    public static final class JsonKeys {
        public static final String FLAG = "flag";
        public static final String RESULT = "result";
    }

    public FeatureFlag(String str, boolean z) {
        this.flag = str;
        this.result = z;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String str) {
        this.flag = str;
    }

    public Boolean getResult() {
        return Boolean.valueOf(this.result);
    }

    public void setResult(Boolean bool) {
        this.result = bool.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FeatureFlag featureFlag = (FeatureFlag) obj;
            if (Objects.equals(this.flag, featureFlag.flag) && Objects.equals(Boolean.valueOf(this.result), Boolean.valueOf(featureFlag.result))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.flag, Boolean.valueOf(this.result));
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name("flag").value(this.flag);
        objectWriter.name("result").value(this.result);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public static final class Deserializer implements JsonDeserializer<FeatureFlag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public FeatureFlag deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            objectReader.beginObject();
            String str = null;
            Boolean bool = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.hashCode();
                if (nextName.equals("result")) {
                    bool = objectReader.nextBooleanOrNull();
                } else if (nextName.equals("flag")) {
                    str = objectReader.nextStringOrNull();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                }
            }
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (bool == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            FeatureFlag featureFlag = new FeatureFlag(str, bool.booleanValue());
            featureFlag.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return featureFlag;
        }
    }
}
