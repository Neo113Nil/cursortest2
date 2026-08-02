package org.chromium.base;

/* loaded from: classes10.dex */
public class MutableIntParamWithSafeDefault extends MutableParamWithSafeDefault<Integer> {
    public MutableIntParamWithSafeDefault(FeatureMap featureMap, String featureName, String paramName, int defaultValue) {
        super(featureMap, featureName, paramName, Integer.valueOf(defaultValue));
    }

    public int getValue() {
        return getValueBoxed().intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.chromium.base.MutableParamWithSafeDefault
    public Integer readValueFromFeatureMap() {
        return Integer.valueOf(this.mFeatureMap.getFieldTrialParamByFeatureAsInt(this.mFeatureName, this.mParamName, ((Integer) this.mDefaultValue).intValue()));
    }
}
