package com.vk.superapp.api.dto.auth;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InitPasswordCheckAccessFactor.kt */
/* loaded from: classes6.dex */
public final class InitPasswordCheckAccessFactor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InitPasswordCheckAccessFactor[] $VALUES;
    public static final InitPasswordCheckAccessFactor SMS_CODE;
    private final String value = "sms_code";

    static {
        InitPasswordCheckAccessFactor initPasswordCheckAccessFactor = new InitPasswordCheckAccessFactor();
        SMS_CODE = initPasswordCheckAccessFactor;
        InitPasswordCheckAccessFactor[] initPasswordCheckAccessFactorArr = {initPasswordCheckAccessFactor};
        $VALUES = initPasswordCheckAccessFactorArr;
        $ENTRIES = new asp(initPasswordCheckAccessFactorArr);
    }

    public static InitPasswordCheckAccessFactor valueOf(String str) {
        return (InitPasswordCheckAccessFactor) Enum.valueOf(InitPasswordCheckAccessFactor.class, str);
    }

    public static InitPasswordCheckAccessFactor[] values() {
        return (InitPasswordCheckAccessFactor[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
