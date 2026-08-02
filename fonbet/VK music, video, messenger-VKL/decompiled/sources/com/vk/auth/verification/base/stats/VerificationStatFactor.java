package com.vk.auth.verification.base.stats;

import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationStat.kt */
/* loaded from: classes15.dex */
public final class VerificationStatFactor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VerificationStatFactor[] $VALUES;
    public static final VerificationStatFactor FIRST;
    public static final VerificationStatFactor SECOND;
    private final int value;

    static {
        VerificationStatFactor verificationStatFactor = new VerificationStatFactor("FIRST", 0, 1);
        FIRST = verificationStatFactor;
        VerificationStatFactor verificationStatFactor2 = new VerificationStatFactor("SECOND", 1, 2);
        SECOND = verificationStatFactor2;
        VerificationStatFactor[] verificationStatFactorArr = {verificationStatFactor, verificationStatFactor2};
        $VALUES = verificationStatFactorArr;
        $ENTRIES = new asp(verificationStatFactorArr);
    }

    public VerificationStatFactor(String str, int i, int i2) {
        this.value = i2;
    }

    public static VerificationStatFactor valueOf(String str) {
        return (VerificationStatFactor) Enum.valueOf(VerificationStatFactor.class, str);
    }

    public static VerificationStatFactor[] values() {
        return (VerificationStatFactor[]) $VALUES.clone();
    }

    public final SchemeStatSak$RegistrationFieldItem h() {
        return new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.VERIFICATION_FACTOR_NUMBER, "", "", String.valueOf(this.value));
    }
}
