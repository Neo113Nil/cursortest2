package org.chromium.base;

/* loaded from: classes10.dex */
public class PostNativeFlag extends Flag {
    private Boolean mInMemoryCachedValue;

    public PostNativeFlag(FeatureMap featureMap, String featureName) {
        super(featureMap, featureName);
    }

    @Override // org.chromium.base.Flag
    public boolean isEnabled() {
        Boolean bool = this.mInMemoryCachedValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (FeatureOverrides.hasTestFeature(this.mFeatureName)) {
            return this.mFeatureMap.isEnabledInNative(this.mFeatureName);
        }
        Boolean valueOf = Boolean.valueOf(this.mFeatureMap.isEnabledInNative(this.mFeatureName));
        this.mInMemoryCachedValue = valueOf;
        return valueOf.booleanValue();
    }

    @Override // org.chromium.base.Flag
    protected void clearInMemoryCachedValueForTesting() {
        this.mInMemoryCachedValue = null;
    }
}
