package com.vk.dto.attachments;

import java.util.Locale;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Product.kt */
/* loaded from: classes18.dex */
public final class Merchant {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Merchant[] $VALUES;
    public static final Merchant ALIEXPRESS;
    public static final a Companion;
    public static final Merchant NONE;
    public static final Merchant YOULA;
    private final String serverName;

    /* compiled from: Product.kt */
    public static final class a {
        public static Merchant a(String str) {
            if (str == null) {
                return Merchant.NONE;
            }
            String lowerCase = str.toLowerCase(Locale.getDefault());
            Merchant merchant = Merchant.ALIEXPRESS;
            if (lowerCase.equals(merchant.h())) {
                return merchant;
            }
            Merchant merchant2 = Merchant.YOULA;
            return lowerCase.equals(merchant2.h()) ? merchant2 : Merchant.NONE;
        }
    }

    static {
        Merchant merchant = new Merchant("NONE", 0, "none");
        NONE = merchant;
        Merchant merchant2 = new Merchant("ALIEXPRESS", 1, "aliexpress");
        ALIEXPRESS = merchant2;
        Merchant merchant3 = new Merchant("YOULA", 2, "youla");
        YOULA = merchant3;
        Merchant[] merchantArr = {merchant, merchant2, merchant3};
        $VALUES = merchantArr;
        $ENTRIES = new asp(merchantArr);
        Companion = new a();
    }

    public Merchant(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static Merchant valueOf(String str) {
        return (Merchant) Enum.valueOf(Merchant.class, str);
    }

    public static Merchant[] values() {
        return (Merchant[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverName;
    }
}
