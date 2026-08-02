package com.vk.core.files;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivateLocation.kt */
/* loaded from: classes.dex */
public final class PrivateLocation$Optional {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PrivateLocation$Optional[] $VALUES;
    public static final PrivateLocation$Optional EXTERNAL_CACHE;
    public static final PrivateLocation$Optional EXTERNAL_STORAGE;
    public static final PrivateLocation$Optional SD_CARD_CACHE;
    public static final PrivateLocation$Optional SD_CARD_STORAGE;

    static {
        PrivateLocation$Optional privateLocation$Optional = new PrivateLocation$Optional("EXTERNAL_STORAGE", 0);
        EXTERNAL_STORAGE = privateLocation$Optional;
        PrivateLocation$Optional privateLocation$Optional2 = new PrivateLocation$Optional("SD_CARD_STORAGE", 1);
        SD_CARD_STORAGE = privateLocation$Optional2;
        PrivateLocation$Optional privateLocation$Optional3 = new PrivateLocation$Optional("EXTERNAL_CACHE", 2);
        EXTERNAL_CACHE = privateLocation$Optional3;
        PrivateLocation$Optional privateLocation$Optional4 = new PrivateLocation$Optional("SD_CARD_CACHE", 3);
        SD_CARD_CACHE = privateLocation$Optional4;
        PrivateLocation$Optional[] privateLocation$OptionalArr = {privateLocation$Optional, privateLocation$Optional2, privateLocation$Optional3, privateLocation$Optional4};
        $VALUES = privateLocation$OptionalArr;
        $ENTRIES = new asp(privateLocation$OptionalArr);
    }

    public PrivateLocation$Optional() {
        throw null;
    }

    public static PrivateLocation$Optional valueOf(String str) {
        return (PrivateLocation$Optional) Enum.valueOf(PrivateLocation$Optional.class, str);
    }

    public static PrivateLocation$Optional[] values() {
        return (PrivateLocation$Optional[]) $VALUES.clone();
    }
}
