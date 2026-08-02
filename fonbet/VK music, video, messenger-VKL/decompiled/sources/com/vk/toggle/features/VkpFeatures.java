package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkpFeatures.kt */
/* loaded from: classes11.dex */
public final class VkpFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkpFeatures[] $VALUES;
    public static final VkpFeatures AUTO_BOOST_RECOMMENDATIONS;
    public static final VkpFeatures UNBAN_RECOMMENDATIONS;
    private final String key;

    static {
        VkpFeatures vkpFeatures = new VkpFeatures("AUTO_BOOST_RECOMMENDATIONS", 0, "vkp_burger_open_rec_lk");
        AUTO_BOOST_RECOMMENDATIONS = vkpFeatures;
        VkpFeatures vkpFeatures2 = new VkpFeatures("UNBAN_RECOMMENDATIONS", 1, "vkp_unban_recommendations");
        UNBAN_RECOMMENDATIONS = vkpFeatures2;
        VkpFeatures[] vkpFeaturesArr = {vkpFeatures, vkpFeatures2};
        $VALUES = vkpFeaturesArr;
        $ENTRIES = new asp(vkpFeaturesArr);
    }

    public VkpFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<VkpFeatures> i() {
        return $ENTRIES;
    }

    public static VkpFeatures valueOf(String str) {
        return (VkpFeatures) Enum.valueOf(VkpFeatures.class, str);
    }

    public static VkpFeatures[] values() {
        return (VkpFeatures[]) $VALUES.clone();
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
