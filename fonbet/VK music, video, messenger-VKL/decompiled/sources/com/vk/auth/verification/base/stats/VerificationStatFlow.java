package com.vk.auth.verification.base.stats;

import com.coremedia.iso.boxes.AuthorBox;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationStatEnum.kt */
/* loaded from: classes15.dex */
public final class VerificationStatFlow {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VerificationStatFlow[] $VALUES;
    public static final VerificationStatFlow AUTH;
    public static final VerificationStatFlow SIGN_UP;
    public static final VerificationStatFlow VALIDATION;
    private final String value;

    static {
        VerificationStatFlow verificationStatFlow = new VerificationStatFlow("AUTH", 0, AuthorBox.TYPE);
        AUTH = verificationStatFlow;
        VerificationStatFlow verificationStatFlow2 = new VerificationStatFlow("SIGN_UP", 1, "sign_up");
        SIGN_UP = verificationStatFlow2;
        VerificationStatFlow verificationStatFlow3 = new VerificationStatFlow("VALIDATION", 2, "validation");
        VALIDATION = verificationStatFlow3;
        VerificationStatFlow[] verificationStatFlowArr = {verificationStatFlow, verificationStatFlow2, verificationStatFlow3};
        $VALUES = verificationStatFlowArr;
        $ENTRIES = new asp(verificationStatFlowArr);
    }

    public VerificationStatFlow(String str, int i, String str2) {
        this.value = str2;
    }

    public static VerificationStatFlow valueOf(String str) {
        return (VerificationStatFlow) Enum.valueOf(VerificationStatFlow.class, str);
    }

    public static VerificationStatFlow[] values() {
        return (VerificationStatFlow[]) $VALUES.clone();
    }

    public final SchemeStatSak$RegistrationFieldItem h() {
        return new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.VERIFICATION_FLOW, "", "", this.value);
    }
}
