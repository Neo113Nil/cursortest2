package org.chromium.base;

/* loaded from: classes10.dex */
public class MutableFlagWithSafeDefault extends Flag {
    private final boolean mDefaultValue;
    private Boolean mInMemoryCachedValue;

    public MutableFlagWithSafeDefault(FeatureMap featureMap, String featureName, boolean defaultValue) {
        super(featureMap, featureName);
        this.mDefaultValue = defaultValue;
    }

    public MutableBooleanParamWithSafeDefault newBooleanParam(String paramName, boolean defaultValue) {
        return new MutableBooleanParamWithSafeDefault(this.mFeatureMap, this.mFeatureName, paramName, defaultValue);
    }

    public MutableIntParamWithSafeDefault newIntParam(String paramName, int defaultValue) {
        return new MutableIntParamWithSafeDefault(this.mFeatureMap, this.mFeatureName, paramName, defaultValue);
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
        if (FeatureList.isNativeInitialized()) {
            Boolean valueOf = Boolean.valueOf(this.mFeatureMap.isEnabledInNative(this.mFeatureName));
            this.mInMemoryCachedValue = valueOf;
            return valueOf.booleanValue();
        }
        return this.mDefaultValue;
    }

    @Override // org.chromium.base.Flag
    protected void clearInMemoryCachedValueForTesting() {
        this.mInMemoryCachedValue = null;
    }
}
