package org.chromium.base;

/* loaded from: classes10.dex */
public abstract class MutableParamWithSafeDefault<T> extends FeatureParam<T> {
    protected abstract T readValueFromFeatureMap();

    public MutableParamWithSafeDefault(FeatureMap featureMap, String featureName, String paramName, T defaultValue) {
        super(featureMap, featureName, paramName, defaultValue);
    }

    protected T getValueBoxed() {
        if (this.mInMemoryCachedValue != null) {
            return (T) this.mInMemoryCachedValue;
        }
        if (FeatureOverrides.hasTestParam(this.mFeatureName, this.mParamName)) {
            return readValueFromFeatureMap();
        }
        if (FeatureList.isNativeInitialized()) {
            this.mInMemoryCachedValue = readValueFromFeatureMap();
            return (T) this.mInMemoryCachedValue;
        }
        return (T) this.mDefaultValue;
    }
}
