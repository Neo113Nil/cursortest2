package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkPayFeatures.kt */
/* loaded from: classes11.dex */
public final class VkPayFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkPayFeatures[] $VALUES;
    public static final VkPayFeatures FEATURE_VKPAY_SBP_DIALOG_SIMPLIFIED_UI;
    private final String key = "vkpay_sbp_dialog_simplified_ui";

    static {
        VkPayFeatures vkPayFeatures = new VkPayFeatures();
        FEATURE_VKPAY_SBP_DIALOG_SIMPLIFIED_UI = vkPayFeatures;
        VkPayFeatures[] vkPayFeaturesArr = {vkPayFeatures};
        $VALUES = vkPayFeaturesArr;
        $ENTRIES = new asp(vkPayFeaturesArr);
    }

    public static zrp<VkPayFeatures> i() {
        return $ENTRIES;
    }

    public static VkPayFeatures valueOf(String str) {
        return (VkPayFeatures) Enum.valueOf(VkPayFeatures.class, str);
    }

    public static VkPayFeatures[] values() {
        return (VkPayFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
