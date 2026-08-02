package org.chromium.base;

/* loaded from: classes10.dex */
public class MutableBooleanParamWithSafeDefault extends MutableParamWithSafeDefault<Boolean> {
    public MutableBooleanParamWithSafeDefault(FeatureMap featureMap, String featureName, String paramName, boolean defaultValue) {
        super(featureMap, featureName, paramName, Boolean.valueOf(defaultValue));
    }

    public boolean getValue() {
        return getValueBoxed().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.chromium.base.MutableParamWithSafeDefault
    public Boolean readValueFromFeatureMap() {
        return Boolean.valueOf(this.mFeatureMap.getFieldTrialParamByFeatureAsBoolean(this.mFeatureName, this.mParamName, ((Boolean) this.mDefaultValue).booleanValue()));
    }
}
