package io.ably.lib.network;

/* loaded from: classes9.dex */
public class DefaultHttpEngineFactory implements HttpEngineFactory {
    @Override // io.ably.lib.network.HttpEngineFactory
    public HttpEngine create(HttpEngineConfig httpEngineConfig) {
        return new DefaultHttpEngine(httpEngineConfig);
    }

    @Override // io.ably.lib.network.HttpEngineFactory
    public EngineType getEngineType() {
        return EngineType.DEFAULT;
    }
}
