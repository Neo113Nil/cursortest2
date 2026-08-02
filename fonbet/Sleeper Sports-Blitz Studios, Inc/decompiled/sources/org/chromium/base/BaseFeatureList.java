package org.chromium.base;

/* loaded from: classes10.dex */
public class BaseFeatureList {
    public static final MutableIntParamWithSafeDefault sMaxDeferredSharedRebindServiceConnection;
    public static final MutableFlagWithSafeDefault sUseSharedRebindServiceConnection;
    public static final MutableFlagWithSafeDefault sBackgroundNotPerceptibleBinding = new MutableFlagWithSafeDefault(BaseFeatureMap.getInstance(), BaseFeatures.BACKGROUND_NOT_PERCEPTIBLE_BINDING, false);
    public static final MutableFlagWithSafeDefault sEffectiveBindingState = new MutableFlagWithSafeDefault(BaseFeatureMap.getInstance(), BaseFeatures.EFFECTIVE_BINDING_STATE, false);
    public static final MutableFlagWithSafeDefault sRebindingChildServiceConnectionController = new MutableFlagWithSafeDefault(BaseFeatureMap.getInstance(), BaseFeatures.REBINDING_CHILD_SERVICE_CONNECTION_CONTROLLER, false);
    public static final MutableFlagWithSafeDefault sUpdateStateBeforeUnbinding = new MutableFlagWithSafeDefault(BaseFeatureMap.getInstance(), BaseFeatures.UPDATE_STATE_BEFORE_UNBINDING, false);
    public static final MutableFlagWithSafeDefault sUseIsUnboundCheck = new MutableFlagWithSafeDefault(BaseFeatureMap.getInstance(), BaseFeatures.USE_IS_UNBOUND_CHECK, false);

    private BaseFeatureList() {
    }

    static {
        MutableFlagWithSafeDefault mutableFlagWithSafeDefault = new MutableFlagWithSafeDefault(BaseFeatureMap.getInstance(), BaseFeatures.USE_SHARED_REBIND_SERVICE_CONNECTION, false);
        sUseSharedRebindServiceConnection = mutableFlagWithSafeDefault;
        sMaxDeferredSharedRebindServiceConnection = mutableFlagWithSafeDefault.newIntParam("max-deferred-bindings", 10);
    }
}
