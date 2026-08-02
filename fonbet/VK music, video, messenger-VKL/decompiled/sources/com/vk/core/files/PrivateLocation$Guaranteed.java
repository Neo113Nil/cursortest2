package com.vk.core.files;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivateLocation.kt */
/* loaded from: classes.dex */
public final class PrivateLocation$Guaranteed {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PrivateLocation$Guaranteed[] $VALUES;
    public static final PrivateLocation$Guaranteed EXTERNAL_OR_INTERNAL_CACHE;
    public static final PrivateLocation$Guaranteed EXTERNAL_OR_INTERNAL_STORAGE;
    public static final PrivateLocation$Guaranteed INTERNAL_CACHE;
    public static final PrivateLocation$Guaranteed INTERNAL_STORAGE;
    public static final PrivateLocation$Guaranteed SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE;
    public static final PrivateLocation$Guaranteed SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE;

    static {
        PrivateLocation$Guaranteed privateLocation$Guaranteed = new PrivateLocation$Guaranteed("INTERNAL_STORAGE", 0);
        INTERNAL_STORAGE = privateLocation$Guaranteed;
        PrivateLocation$Guaranteed privateLocation$Guaranteed2 = new PrivateLocation$Guaranteed("EXTERNAL_OR_INTERNAL_STORAGE", 1);
        EXTERNAL_OR_INTERNAL_STORAGE = privateLocation$Guaranteed2;
        PrivateLocation$Guaranteed privateLocation$Guaranteed3 = new PrivateLocation$Guaranteed("SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE", 2);
        SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE = privateLocation$Guaranteed3;
        PrivateLocation$Guaranteed privateLocation$Guaranteed4 = new PrivateLocation$Guaranteed("INTERNAL_CACHE", 3);
        INTERNAL_CACHE = privateLocation$Guaranteed4;
        PrivateLocation$Guaranteed privateLocation$Guaranteed5 = new PrivateLocation$Guaranteed("EXTERNAL_OR_INTERNAL_CACHE", 4);
        EXTERNAL_OR_INTERNAL_CACHE = privateLocation$Guaranteed5;
        PrivateLocation$Guaranteed privateLocation$Guaranteed6 = new PrivateLocation$Guaranteed("SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE", 5);
        SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE = privateLocation$Guaranteed6;
        PrivateLocation$Guaranteed[] privateLocation$GuaranteedArr = {privateLocation$Guaranteed, privateLocation$Guaranteed2, privateLocation$Guaranteed3, privateLocation$Guaranteed4, privateLocation$Guaranteed5, privateLocation$Guaranteed6};
        $VALUES = privateLocation$GuaranteedArr;
        $ENTRIES = new asp(privateLocation$GuaranteedArr);
    }

    public PrivateLocation$Guaranteed() {
        throw null;
    }

    public static PrivateLocation$Guaranteed valueOf(String str) {
        return (PrivateLocation$Guaranteed) Enum.valueOf(PrivateLocation$Guaranteed.class, str);
    }

    public static PrivateLocation$Guaranteed[] values() {
        return (PrivateLocation$Guaranteed[]) $VALUES.clone();
    }
}
