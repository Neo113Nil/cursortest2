package com.vk.dto.attaches;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Merchant.kt */
/* loaded from: classes18.dex */
public final class Merchant {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Merchant[] $VALUES;
    public static final Merchant ALIEXPRESS;
    public static final a Companion;
    public static final Merchant NONE;
    private final String alias;

    /* compiled from: Merchant.kt */
    public static final class a {
    }

    static {
        Merchant merchant = new Merchant("NONE", 0, "none");
        NONE = merchant;
        Merchant merchant2 = new Merchant("ALIEXPRESS", 1, "aliexpress");
        ALIEXPRESS = merchant2;
        Merchant[] merchantArr = {merchant, merchant2};
        $VALUES = merchantArr;
        $ENTRIES = new asp(merchantArr);
        Companion = new a();
    }

    public Merchant(String str, int i, String str2) {
        this.alias = str2;
    }

    public static Merchant valueOf(String str) {
        return (Merchant) Enum.valueOf(Merchant.class, str);
    }

    public static Merchant[] values() {
        return (Merchant[]) $VALUES.clone();
    }

    public final String h() {
        return this.alias;
    }
}
