package io.sentry.featureflags;

import io.sentry.protocol.FeatureFlags;

/* loaded from: classes9.dex */
public final class NoOpFeatureFlagBuffer implements IFeatureFlagBuffer {
    private static final NoOpFeatureFlagBuffer instance = new NoOpFeatureFlagBuffer();

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public void add(String str, Boolean bool) {
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public FeatureFlags getFeatureFlags() {
        return null;
    }

    public static NoOpFeatureFlagBuffer getInstance() {
        return instance;
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IFeatureFlagBuffer m13429clone() {
        return instance;
    }
}
