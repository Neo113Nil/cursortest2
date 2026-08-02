package com.vk.music.player.core.audioeffect.fade;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FadeDirection.kt */
/* loaded from: classes3.dex */
public final class FadeDirection {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FadeDirection[] $VALUES;
    public static final FadeDirection IN;
    public static final FadeDirection OUT;

    static {
        FadeDirection fadeDirection = new FadeDirection("IN", 0);
        IN = fadeDirection;
        FadeDirection fadeDirection2 = new FadeDirection("OUT", 1);
        OUT = fadeDirection2;
        FadeDirection[] fadeDirectionArr = {fadeDirection, fadeDirection2};
        $VALUES = fadeDirectionArr;
        $ENTRIES = new asp(fadeDirectionArr);
    }

    public FadeDirection() {
        throw null;
    }

    public static FadeDirection valueOf(String str) {
        return (FadeDirection) Enum.valueOf(FadeDirection.class, str);
    }

    public static FadeDirection[] values() {
        return (FadeDirection[]) $VALUES.clone();
    }
}
