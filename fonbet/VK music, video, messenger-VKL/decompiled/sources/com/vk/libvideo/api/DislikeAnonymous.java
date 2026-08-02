package com.vk.libvideo.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsControllersConfig.kt */
/* loaded from: classes2.dex */
public final class DislikeAnonymous {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DislikeAnonymous[] $VALUES;
    public static final DislikeAnonymous AVAILABLE;
    public static final DislikeAnonymous UNAVAILABLE;

    static {
        DislikeAnonymous dislikeAnonymous = new DislikeAnonymous("AVAILABLE", 0);
        AVAILABLE = dislikeAnonymous;
        DislikeAnonymous dislikeAnonymous2 = new DislikeAnonymous("UNAVAILABLE", 1);
        UNAVAILABLE = dislikeAnonymous2;
        DislikeAnonymous[] dislikeAnonymousArr = {dislikeAnonymous, dislikeAnonymous2};
        $VALUES = dislikeAnonymousArr;
        $ENTRIES = new asp(dislikeAnonymousArr);
    }

    public DislikeAnonymous() {
        throw null;
    }

    public static DislikeAnonymous valueOf(String str) {
        return (DislikeAnonymous) Enum.valueOf(DislikeAnonymous.class, str);
    }

    public static DislikeAnonymous[] values() {
        return (DislikeAnonymous[]) $VALUES.clone();
    }
}
