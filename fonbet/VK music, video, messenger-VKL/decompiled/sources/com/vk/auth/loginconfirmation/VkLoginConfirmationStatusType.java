package com.vk.auth.loginconfirmation;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkLoginConfirmationStatusType.kt */
/* loaded from: classes15.dex */
public final class VkLoginConfirmationStatusType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkLoginConfirmationStatusType[] $VALUES;
    public static final VkLoginConfirmationStatusType ALREADY_ALLOWED;
    public static final VkLoginConfirmationStatusType ALREADY_CONFIRMED;
    public static final VkLoginConfirmationStatusType ALREADY_DENIED;
    public static final VkLoginConfirmationStatusType ERROR_ALLOW;
    public static final VkLoginConfirmationStatusType ERROR_DENY;
    public static final VkLoginConfirmationStatusType SUCCESS_ALLOW;
    public static final VkLoginConfirmationStatusType SUCCESS_DENY;
    public static final VkLoginConfirmationStatusType UNKNOWN_CONFIRMATION;
    private final int buttonResId;
    private final int iconColorAttrId;
    private final int iconResId;
    private final Integer subtitleResId;
    private final int titleResId;

    static {
        VkLoginConfirmationStatusType vkLoginConfirmationStatusType = new VkLoginConfirmationStatusType(0, R.drawable.vk_icon_error_outline_56, "ERROR_DENY", R.attr.vk_ui_background_negative, R.string.vk_login_confirmation_error_title, R.string.vk_common_retry, Integer.valueOf(R.string.vk_login_confirmation_deny_error_subtitle));
        ERROR_DENY = vkLoginConfirmationStatusType;
        VkLoginConfirmationStatusType vkLoginConfirmationStatusType2 = new VkLoginConfirmationStatusType(1, R.drawable.vk_icon_error_outline_56, "ERROR_ALLOW", R.attr.vk_ui_background_negative, R.string.vk_login_confirmation_error_title, R.string.vk_common_retry, Integer.valueOf(R.string.vk_login_confirmation_allow_error_subtitle));
        ERROR_ALLOW = vkLoginConfirmationStatusType2;
        VkLoginConfirmationStatusType vkLoginConfirmationStatusType3 = new VkLoginConfirmationStatusType(2, R.drawable.vk_icon_check_shield_outline_56, "SUCCESS_DENY", R.attr.vk_ui_icon_accent, R.string.vk_login_confirmation_deny_title, R.string.vk_login_confirmation_continue, Integer.valueOf(R.string.vk_login_confirmation_deny_subtitle));
        SUCCESS_DENY = vkLoginConfirmationStatusType3;
        VkLoginConfirmationStatusType vkLoginConfirmationStatusType4 = new VkLoginConfirmationStatusType(3, R.drawable.vk_icon_check_shield_outline_56, "SUCCESS_ALLOW", R.attr.vk_ui_icon_accent, R.string.vk_login_confirmation_allow_title, R.string.vk_login_confirmation_continue, null);
        SUCCESS_ALLOW = vkLoginConfirmationStatusType4;
        VkLoginConfirmationStatusType vkLoginConfirmationStatusType5 = new VkLoginConfirmationStatusType(4, R.drawable.vk_icon_error_outline_56, "ALREADY_DENIED", R.attr.vk_ui_icon_accent, R.string.vk_login_confirmation_already_denied_title, R.string.vk_login_confirmation_close, Integer.valueOf(R.string.vk_login_confirmation_already_denied_subtitle));
        ALREADY_DENIED = vkLoginConfirmationStatusType5;
        VkLoginConfirmationStatusType vkLoginConfirmationStatusType6 = new VkLoginConfirmationStatusType(5, R.drawable.vk_icon_check_circle_device_outline_56, "ALREADY_ALLOWED", R.attr.vk_ui_icon_accent, R.string.vk_login_confirmation_already_allowed_title, R.string.vk_login_confirmation_close, Integer.valueOf(R.string.vk_login_confirmation_already_allowed_subtitle));
        ALREADY_ALLOWED = vkLoginConfirmationStatusType6;
        VkLoginConfirmationStatusType vkLoginConfirmationStatusType7 = new VkLoginConfirmationStatusType(6, R.drawable.vk_icon_arrow_right_door_outline_56, "ALREADY_CONFIRMED", R.attr.vk_ui_icon_accent, R.string.vk_login_confirmation_already_confirmed_title, R.string.vk_login_confirmation_close, Integer.valueOf(R.string.vk_login_confirmation_already_confirmed_subtitle));
        ALREADY_CONFIRMED = vkLoginConfirmationStatusType7;
        VkLoginConfirmationStatusType vkLoginConfirmationStatusType8 = new VkLoginConfirmationStatusType(7, R.drawable.vk_icon_arrow_right_door_outline_56, "UNKNOWN_CONFIRMATION", R.attr.vk_ui_icon_accent, R.string.vk_login_confirmation_already_confirmed_title, R.string.vk_login_confirmation_close, null);
        UNKNOWN_CONFIRMATION = vkLoginConfirmationStatusType8;
        VkLoginConfirmationStatusType[] vkLoginConfirmationStatusTypeArr = {vkLoginConfirmationStatusType, vkLoginConfirmationStatusType2, vkLoginConfirmationStatusType3, vkLoginConfirmationStatusType4, vkLoginConfirmationStatusType5, vkLoginConfirmationStatusType6, vkLoginConfirmationStatusType7, vkLoginConfirmationStatusType8};
        $VALUES = vkLoginConfirmationStatusTypeArr;
        $ENTRIES = new asp(vkLoginConfirmationStatusTypeArr);
    }

    public VkLoginConfirmationStatusType(int i, int i2, String str, int i3, int i4, int i5, Integer num) {
        this.iconResId = i2;
        this.iconColorAttrId = i3;
        this.titleResId = i4;
        this.subtitleResId = num;
        this.buttonResId = i5;
    }

    public static VkLoginConfirmationStatusType valueOf(String str) {
        return (VkLoginConfirmationStatusType) Enum.valueOf(VkLoginConfirmationStatusType.class, str);
    }

    public static VkLoginConfirmationStatusType[] values() {
        return (VkLoginConfirmationStatusType[]) $VALUES.clone();
    }

    public final int h() {
        return this.buttonResId;
    }

    public final int i() {
        return this.iconColorAttrId;
    }

    public final int j() {
        return this.iconResId;
    }

    public final Integer k() {
        return this.subtitleResId;
    }

    public final int l() {
        return this.titleResId;
    }
}
