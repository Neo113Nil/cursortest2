package com.sleeperbot;

import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlagsDefaults;
import kotlin.Metadata;

/* compiled from: SleeperFeatureFlags.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/sleeperbot/SleeperFeatureFlags;", "Lcom/facebook/react/internal/featureflags/ReactNativeNewArchitectureFeatureFlagsDefaults;", "<init>", "()V", "useSharedAnimatedBackend", "", "cxxNativeAnimatedEnabled", "preventShadowTreeCommitExhaustion", "app_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SleeperFeatureFlags extends ReactNativeNewArchitectureFeatureFlagsDefaults {
    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cxxNativeAnimatedEnabled() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean preventShadowTreeCommitExhaustion() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useSharedAnimatedBackend() {
        return false;
    }
}
