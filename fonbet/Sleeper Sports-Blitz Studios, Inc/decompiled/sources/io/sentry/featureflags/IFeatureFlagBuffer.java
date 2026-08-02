package io.sentry.featureflags;

import io.sentry.protocol.FeatureFlags;

/* loaded from: classes9.dex */
public interface IFeatureFlagBuffer {
    void add(String str, Boolean bool);

    IFeatureFlagBuffer clone();

    FeatureFlags getFeatureFlags();
}
