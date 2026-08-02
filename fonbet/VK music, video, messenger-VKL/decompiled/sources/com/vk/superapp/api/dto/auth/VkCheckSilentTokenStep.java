package com.vk.superapp.api.dto.auth;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCheckSilentTokenStep.kt */
/* loaded from: classes6.dex */
public final class VkCheckSilentTokenStep {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkCheckSilentTokenStep[] $VALUES;
    public static final VkCheckSilentTokenStep PHONE_VALIDATION;
    private final String alias = "phone_validation_required";

    static {
        VkCheckSilentTokenStep vkCheckSilentTokenStep = new VkCheckSilentTokenStep();
        PHONE_VALIDATION = vkCheckSilentTokenStep;
        VkCheckSilentTokenStep[] vkCheckSilentTokenStepArr = {vkCheckSilentTokenStep};
        $VALUES = vkCheckSilentTokenStepArr;
        $ENTRIES = new asp(vkCheckSilentTokenStepArr);
    }

    public static VkCheckSilentTokenStep valueOf(String str) {
        return (VkCheckSilentTokenStep) Enum.valueOf(VkCheckSilentTokenStep.class, str);
    }

    public static VkCheckSilentTokenStep[] values() {
        return (VkCheckSilentTokenStep[]) $VALUES.clone();
    }

    public final String h() {
        return this.alias;
    }
}
