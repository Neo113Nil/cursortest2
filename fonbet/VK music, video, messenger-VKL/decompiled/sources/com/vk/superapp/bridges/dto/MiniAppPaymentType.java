package com.vk.superapp.bridges.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniAppPaymentType.kt */
/* loaded from: classes6.dex */
public final class MiniAppPaymentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MiniAppPaymentType[] $VALUES;
    public static final MiniAppPaymentType Balance;
    public static final a Companion;
    public static final MiniAppPaymentType Inapp;
    public static final MiniAppPaymentType Subs;

    /* compiled from: MiniAppPaymentType.kt */
    public static final class a {
    }

    static {
        MiniAppPaymentType miniAppPaymentType = new MiniAppPaymentType("Inapp", 0);
        Inapp = miniAppPaymentType;
        MiniAppPaymentType miniAppPaymentType2 = new MiniAppPaymentType("Subs", 1);
        Subs = miniAppPaymentType2;
        MiniAppPaymentType miniAppPaymentType3 = new MiniAppPaymentType("Balance", 2);
        Balance = miniAppPaymentType3;
        MiniAppPaymentType[] miniAppPaymentTypeArr = {miniAppPaymentType, miniAppPaymentType2, miniAppPaymentType3};
        $VALUES = miniAppPaymentTypeArr;
        $ENTRIES = new asp(miniAppPaymentTypeArr);
        Companion = new a();
    }

    public MiniAppPaymentType() {
        throw null;
    }

    public static MiniAppPaymentType valueOf(String str) {
        return (MiniAppPaymentType) Enum.valueOf(MiniAppPaymentType.class, str);
    }

    public static MiniAppPaymentType[] values() {
        return (MiniAppPaymentType[]) $VALUES.clone();
    }
}
