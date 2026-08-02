package com.vk.dto.stories.model.ads;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DisclaimerType.kt */
/* loaded from: classes18.dex */
public final class DisclaimerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DisclaimerType[] $VALUES;
    public static final DisclaimerType BANKRUPTCY;
    public static final DisclaimerType DECLARATION;
    public static final DisclaimerType DRUGS;
    public static final DisclaimerType ENERGETICS;
    public static final DisclaimerType LOANS;
    public static final DisclaimerType SUPPLEMENTS;

    static {
        DisclaimerType disclaimerType = new DisclaimerType("SUPPLEMENTS", 0);
        SUPPLEMENTS = disclaimerType;
        DisclaimerType disclaimerType2 = new DisclaimerType("DRUGS", 1);
        DRUGS = disclaimerType2;
        DisclaimerType disclaimerType3 = new DisclaimerType("DECLARATION", 2);
        DECLARATION = disclaimerType3;
        DisclaimerType disclaimerType4 = new DisclaimerType("LOANS", 3);
        LOANS = disclaimerType4;
        DisclaimerType disclaimerType5 = new DisclaimerType("BANKRUPTCY", 4);
        BANKRUPTCY = disclaimerType5;
        DisclaimerType disclaimerType6 = new DisclaimerType("ENERGETICS", 5);
        ENERGETICS = disclaimerType6;
        DisclaimerType[] disclaimerTypeArr = {disclaimerType, disclaimerType2, disclaimerType3, disclaimerType4, disclaimerType5, disclaimerType6};
        $VALUES = disclaimerTypeArr;
        $ENTRIES = new asp(disclaimerTypeArr);
    }

    public DisclaimerType() {
        throw null;
    }

    public static DisclaimerType valueOf(String str) {
        return (DisclaimerType) Enum.valueOf(DisclaimerType.class, str);
    }

    public static DisclaimerType[] values() {
        return (DisclaimerType[]) $VALUES.clone();
    }
}
