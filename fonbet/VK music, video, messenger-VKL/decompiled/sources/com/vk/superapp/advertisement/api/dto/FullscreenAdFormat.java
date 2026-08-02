package com.vk.superapp.advertisement.api.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FullscreenAdFormat.kt */
/* loaded from: classes6.dex */
public final class FullscreenAdFormat {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FullscreenAdFormat[] $VALUES;
    public static final FullscreenAdFormat INTERSTITIAL;
    public static final FullscreenAdFormat MULTI_INTERSTITIAL;
    public static final FullscreenAdFormat REWARD;

    static {
        FullscreenAdFormat fullscreenAdFormat = new FullscreenAdFormat("REWARD", 0);
        REWARD = fullscreenAdFormat;
        FullscreenAdFormat fullscreenAdFormat2 = new FullscreenAdFormat("MULTI_INTERSTITIAL", 1);
        MULTI_INTERSTITIAL = fullscreenAdFormat2;
        FullscreenAdFormat fullscreenAdFormat3 = new FullscreenAdFormat("INTERSTITIAL", 2);
        INTERSTITIAL = fullscreenAdFormat3;
        FullscreenAdFormat[] fullscreenAdFormatArr = {fullscreenAdFormat, fullscreenAdFormat2, fullscreenAdFormat3};
        $VALUES = fullscreenAdFormatArr;
        $ENTRIES = new asp(fullscreenAdFormatArr);
    }

    public FullscreenAdFormat() {
        throw null;
    }

    public static FullscreenAdFormat valueOf(String str) {
        return (FullscreenAdFormat) Enum.valueOf(FullscreenAdFormat.class, str);
    }

    public static FullscreenAdFormat[] values() {
        return (FullscreenAdFormat[]) $VALUES.clone();
    }
}
