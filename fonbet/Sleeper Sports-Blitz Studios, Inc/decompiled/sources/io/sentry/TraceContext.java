package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class TraceContext implements JsonUnknown, JsonSerializable {
    private final String environment;
    private final String publicKey;
    private final String release;
    private final SentryId replayId;
    private final String sampleRand;
    private final String sampleRate;
    private final String sampled;
    private final SentryId traceId;
    private final String transaction;
    private Map<String, Object> unknown;
    private final String userId;

    public static final class JsonKeys {
        public static final String ENVIRONMENT = "environment";
        public static final String PUBLIC_KEY = "public_key";
        public static final String RELEASE = "release";
        public static final String REPLAY_ID = "replay_id";
        public static final String SAMPLED = "sampled";
        public static final String SAMPLE_RAND = "sample_rand";
        public static final String SAMPLE_RATE = "sample_rate";
        public static final String TRACE_ID = "trace_id";
        public static final String TRANSACTION = "transaction";
        public static final String USER_ID = "user_id";
    }

    TraceContext(SentryId sentryId, String str) {
        this(sentryId, str, null, null, null, null, null, null, null);
    }

    @Deprecated
    TraceContext(SentryId sentryId, String str, String str2, String str3, String str4, String str5, String str6, String str7, SentryId sentryId2) {
        this(sentryId, str, str2, str3, str4, str5, str6, str7, sentryId2, null);
    }

    TraceContext(SentryId sentryId, String str, String str2, String str3, String str4, String str5, String str6, String str7, SentryId sentryId2, String str8) {
        this.traceId = sentryId;
        this.publicKey = str;
        this.release = str2;
        this.environment = str3;
        this.userId = str4;
        this.transaction = str5;
        this.sampleRate = str6;
        this.sampled = str7;
        this.replayId = sentryId2;
        this.sampleRand = str8;
    }

    private static String getUserId(SentryOptions sentryOptions, User user) {
        if (!sentryOptions.isSendDefaultPii() || user == null) {
            return null;
        }
        return user.getId();
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getRelease() {
        return this.release;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getTransaction() {
        return this.transaction;
    }

    public String getSampleRate() {
        return this.sampleRate;
    }

    public String getSampleRand() {
        return this.sampleRand;
    }

    public String getSampled() {
        return this.sampled;
    }

    public SentryId getReplayId() {
        return this.replayId;
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
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name("public_key").value(this.publicKey);
        if (this.release != null) {
            objectWriter.name("release").value(this.release);
        }
        if (this.environment != null) {
            objectWriter.name("environment").value(this.environment);
        }
        if (this.userId != null) {
            objectWriter.name("user_id").value(this.userId);
        }
        if (this.transaction != null) {
            objectWriter.name("transaction").value(this.transaction);
        }
        if (this.sampleRate != null) {
            objectWriter.name(JsonKeys.SAMPLE_RATE).value(this.sampleRate);
        }
        if (this.sampleRand != null) {
            objectWriter.name(JsonKeys.SAMPLE_RAND).value(this.sampleRand);
        }
        if (this.sampled != null) {
            objectWriter.name(JsonKeys.SAMPLED).value(this.sampled);
        }
        if (this.replayId != null) {
            objectWriter.name("replay_id").value(iLogger, this.replayId);
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

    public static final class Deserializer implements JsonDeserializer<TraceContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public TraceContext deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String nextName;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            SentryId sentryId = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            SentryId sentryId2 = null;
            String str8 = null;
            while (true) {
                SentryId sentryId3 = sentryId;
                String str9 = str;
                if (objectReader.peek() != JsonToken.NAME) {
                    if (sentryId3 == null) {
                        throw missingRequiredFieldException("trace_id", iLogger);
                    }
                    if (str9 == null) {
                        throw missingRequiredFieldException("public_key", iLogger);
                    }
                    TraceContext traceContext = new TraceContext(sentryId3, str9, str2, str3, str4, str5, str6, str7, sentryId2, str8);
                    traceContext.setUnknown(concurrentHashMap);
                    objectReader.endObject();
                    return traceContext;
                }
                nextName = objectReader.nextName();
                nextName.hashCode();
                switch (nextName) {
                    case "replay_id":
                        sentryId2 = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        sentryId = sentryId3;
                        str = str9;
                        break;
                    case "user_id":
                        str4 = objectReader.nextStringOrNull();
                        sentryId = sentryId3;
                        str = str9;
                        break;
                    case "environment":
                        str3 = objectReader.nextStringOrNull();
                        sentryId = sentryId3;
                        str = str9;
                        break;
                    case "sample_rand":
                        str8 = objectReader.nextStringOrNull();
                        sentryId = sentryId3;
                        str = str9;
                        break;
                    case "sample_rate":
                        str6 = objectReader.nextStringOrNull();
                        sentryId = sentryId3;
                        str = str9;
                        break;
                    case "release":
                        str2 = objectReader.nextStringOrNull();
                        sentryId = sentryId3;
                        str = str9;
                        break;
                    case "trace_id":
                        sentryId = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        str = str9;
                        break;
                    case "sampled":
                        str7 = objectReader.nextStringOrNull();
                        sentryId = sentryId3;
                        str = str9;
                        break;
                    case "public_key":
                        str = objectReader.nextString();
                        sentryId = sentryId3;
                        break;
                    case "transaction":
                        str5 = objectReader.nextStringOrNull();
                        sentryId = sentryId3;
                        str = str9;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                        sentryId = sentryId3;
                        str = str9;
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
