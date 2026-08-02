package com.vk.auth.oauth;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOAuthRouterInfo.kt */
/* loaded from: classes.dex */
public final class VkOAuthGoal {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkOAuthGoal[] $VALUES;
    public static final VkOAuthGoal ACTIVATION;
    public static final VkOAuthGoal ADDITIONAL_OAUTH_AUTH;
    public static final VkOAuthGoal AUTH;

    static {
        VkOAuthGoal vkOAuthGoal = new VkOAuthGoal("AUTH", 0);
        AUTH = vkOAuthGoal;
        VkOAuthGoal vkOAuthGoal2 = new VkOAuthGoal("ACTIVATION", 1);
        ACTIVATION = vkOAuthGoal2;
        VkOAuthGoal vkOAuthGoal3 = new VkOAuthGoal("ADDITIONAL_OAUTH_AUTH", 2);
        ADDITIONAL_OAUTH_AUTH = vkOAuthGoal3;
        VkOAuthGoal[] vkOAuthGoalArr = {vkOAuthGoal, vkOAuthGoal2, vkOAuthGoal3};
        $VALUES = vkOAuthGoalArr;
        $ENTRIES = new asp(vkOAuthGoalArr);
    }

    public VkOAuthGoal() {
        throw null;
    }

    public static VkOAuthGoal valueOf(String str) {
        return (VkOAuthGoal) Enum.valueOf(VkOAuthGoal.class, str);
    }

    public static VkOAuthGoal[] values() {
        return (VkOAuthGoal[]) $VALUES.clone();
    }
}
