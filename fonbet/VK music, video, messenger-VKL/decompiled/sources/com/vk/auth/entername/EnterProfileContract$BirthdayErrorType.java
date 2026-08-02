package com.vk.auth.entername;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.gpp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EnterProfileContract.kt */
/* loaded from: classes15.dex */
public final class EnterProfileContract$BirthdayErrorType implements gpp {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EnterProfileContract$BirthdayErrorType[] $VALUES;
    public static final EnterProfileContract$BirthdayErrorType INCORRECT_DATE;
    public static final EnterProfileContract$BirthdayErrorType TOO_OLD;
    public static final EnterProfileContract$BirthdayErrorType TOO_YOUNG;
    private final int textId;

    static {
        EnterProfileContract$BirthdayErrorType enterProfileContract$BirthdayErrorType = new EnterProfileContract$BirthdayErrorType("INCORRECT_DATE", 0, R.string.vk_auth_sign_up_enter_birthday_incorrect);
        INCORRECT_DATE = enterProfileContract$BirthdayErrorType;
        EnterProfileContract$BirthdayErrorType enterProfileContract$BirthdayErrorType2 = new EnterProfileContract$BirthdayErrorType("TOO_YOUNG", 1, R.string.vk_auth_sign_up_enter_birthday_too_young);
        TOO_YOUNG = enterProfileContract$BirthdayErrorType2;
        EnterProfileContract$BirthdayErrorType enterProfileContract$BirthdayErrorType3 = new EnterProfileContract$BirthdayErrorType("TOO_OLD", 2, R.string.vk_auth_sign_up_enter_birthday_too_old);
        TOO_OLD = enterProfileContract$BirthdayErrorType3;
        EnterProfileContract$BirthdayErrorType[] enterProfileContract$BirthdayErrorTypeArr = {enterProfileContract$BirthdayErrorType, enterProfileContract$BirthdayErrorType2, enterProfileContract$BirthdayErrorType3};
        $VALUES = enterProfileContract$BirthdayErrorTypeArr;
        $ENTRIES = new asp(enterProfileContract$BirthdayErrorTypeArr);
    }

    public EnterProfileContract$BirthdayErrorType(String str, int i, int i2) {
        this.textId = i2;
    }

    public static EnterProfileContract$BirthdayErrorType valueOf(String str) {
        return (EnterProfileContract$BirthdayErrorType) Enum.valueOf(EnterProfileContract$BirthdayErrorType.class, str);
    }

    public static EnterProfileContract$BirthdayErrorType[] values() {
        return (EnterProfileContract$BirthdayErrorType[]) $VALUES.clone();
    }

    public final int h() {
        return this.textId;
    }
}
