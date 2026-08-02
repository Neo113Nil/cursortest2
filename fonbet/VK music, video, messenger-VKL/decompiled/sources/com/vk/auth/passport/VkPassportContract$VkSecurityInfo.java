package com.vk.auth.passport;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkPassportContract.kt */
/* loaded from: classes15.dex */
public final class VkPassportContract$VkSecurityInfo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkPassportContract$VkSecurityInfo[] $VALUES;
    public static final VkPassportContract$VkSecurityInfo CRITICAL_WARNING;
    public static final VkPassportContract$VkSecurityInfo NORMAL_WARNING;
    public static final VkPassportContract$VkSecurityInfo NO_WARNING;

    static {
        VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo = new VkPassportContract$VkSecurityInfo("CRITICAL_WARNING", 0);
        CRITICAL_WARNING = vkPassportContract$VkSecurityInfo;
        VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo2 = new VkPassportContract$VkSecurityInfo("NORMAL_WARNING", 1);
        NORMAL_WARNING = vkPassportContract$VkSecurityInfo2;
        VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo3 = new VkPassportContract$VkSecurityInfo("NO_WARNING", 2);
        NO_WARNING = vkPassportContract$VkSecurityInfo3;
        VkPassportContract$VkSecurityInfo[] vkPassportContract$VkSecurityInfoArr = {vkPassportContract$VkSecurityInfo, vkPassportContract$VkSecurityInfo2, vkPassportContract$VkSecurityInfo3};
        $VALUES = vkPassportContract$VkSecurityInfoArr;
        $ENTRIES = new asp(vkPassportContract$VkSecurityInfoArr);
    }

    public VkPassportContract$VkSecurityInfo() {
        throw null;
    }

    public static VkPassportContract$VkSecurityInfo valueOf(String str) {
        return (VkPassportContract$VkSecurityInfo) Enum.valueOf(VkPassportContract$VkSecurityInfo.class, str);
    }

    public static VkPassportContract$VkSecurityInfo[] values() {
        return (VkPassportContract$VkSecurityInfo[]) $VALUES.clone();
    }
}
