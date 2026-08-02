package io.sentry;

/* loaded from: classes8.dex */
public interface JsonDeserializer<T> {
    T deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception;
}
