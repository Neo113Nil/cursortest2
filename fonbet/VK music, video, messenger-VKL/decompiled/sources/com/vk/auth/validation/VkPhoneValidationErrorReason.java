package com.vk.auth.validation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkPhoneValidationErrorReason.kt */
/* loaded from: classes15.dex */
public final class VkPhoneValidationErrorReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkPhoneValidationErrorReason[] $VALUES;
    public static final VkPhoneValidationErrorReason API;
    public static final VkPhoneValidationErrorReason CANCEL;
    public static final VkPhoneValidationErrorReason CANCEL_ROUTER;
    public static final VkPhoneValidationErrorReason LATER;
    public static final VkPhoneValidationErrorReason LOGGED_OUT;
    public static final VkPhoneValidationErrorReason LOGOUT;
    public static final VkPhoneValidationErrorReason UNLINK;

    static {
        VkPhoneValidationErrorReason vkPhoneValidationErrorReason = new VkPhoneValidationErrorReason("LOGGED_OUT", 0);
        LOGGED_OUT = vkPhoneValidationErrorReason;
        VkPhoneValidationErrorReason vkPhoneValidationErrorReason2 = new VkPhoneValidationErrorReason("LOGOUT", 1);
        LOGOUT = vkPhoneValidationErrorReason2;
        VkPhoneValidationErrorReason vkPhoneValidationErrorReason3 = new VkPhoneValidationErrorReason("LATER", 2);
        LATER = vkPhoneValidationErrorReason3;
        VkPhoneValidationErrorReason vkPhoneValidationErrorReason4 = new VkPhoneValidationErrorReason("CANCEL", 3);
        CANCEL = vkPhoneValidationErrorReason4;
        VkPhoneValidationErrorReason vkPhoneValidationErrorReason5 = new VkPhoneValidationErrorReason("CANCEL_ROUTER", 4);
        CANCEL_ROUTER = vkPhoneValidationErrorReason5;
        VkPhoneValidationErrorReason vkPhoneValidationErrorReason6 = new VkPhoneValidationErrorReason("API", 5);
        API = vkPhoneValidationErrorReason6;
        VkPhoneValidationErrorReason vkPhoneValidationErrorReason7 = new VkPhoneValidationErrorReason("UNLINK", 6);
        UNLINK = vkPhoneValidationErrorReason7;
        VkPhoneValidationErrorReason[] vkPhoneValidationErrorReasonArr = {vkPhoneValidationErrorReason, vkPhoneValidationErrorReason2, vkPhoneValidationErrorReason3, vkPhoneValidationErrorReason4, vkPhoneValidationErrorReason5, vkPhoneValidationErrorReason6, vkPhoneValidationErrorReason7};
        $VALUES = vkPhoneValidationErrorReasonArr;
        $ENTRIES = new asp(vkPhoneValidationErrorReasonArr);
    }

    public VkPhoneValidationErrorReason() {
        throw null;
    }

    public static VkPhoneValidationErrorReason valueOf(String str) {
        return (VkPhoneValidationErrorReason) Enum.valueOf(VkPhoneValidationErrorReason.class, str);
    }

    public static VkPhoneValidationErrorReason[] values() {
        return (VkPhoneValidationErrorReason[]) $VALUES.clone();
    }
}
