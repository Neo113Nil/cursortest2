package com.vk.clips.sdk.drafts.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsDraftAudioEffectType.kt */
/* loaded from: classes17.dex */
public final class ClipsDraftAudioEffectType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsDraftAudioEffectType[] $VALUES;
    public static final ClipsDraftAudioEffectType BALLOON;
    public static final ClipsDraftAudioEffectType CATHEDRAL;
    public static final ClipsDraftAudioEffectType DEFAULT;
    public static final ClipsDraftAudioEffectType ECHO;
    public static final ClipsDraftAudioEffectType EVIL;
    public static final ClipsDraftAudioEffectType GIANT;
    public static final ClipsDraftAudioEffectType HALL;
    public static final ClipsDraftAudioEffectType ROBOT;
    public static final ClipsDraftAudioEffectType SQUIRREL;

    static {
        ClipsDraftAudioEffectType clipsDraftAudioEffectType = new ClipsDraftAudioEffectType("DEFAULT", 0);
        DEFAULT = clipsDraftAudioEffectType;
        ClipsDraftAudioEffectType clipsDraftAudioEffectType2 = new ClipsDraftAudioEffectType("HALL", 1);
        HALL = clipsDraftAudioEffectType2;
        ClipsDraftAudioEffectType clipsDraftAudioEffectType3 = new ClipsDraftAudioEffectType("ECHO", 2);
        ECHO = clipsDraftAudioEffectType3;
        ClipsDraftAudioEffectType clipsDraftAudioEffectType4 = new ClipsDraftAudioEffectType("CATHEDRAL", 3);
        CATHEDRAL = clipsDraftAudioEffectType4;
        ClipsDraftAudioEffectType clipsDraftAudioEffectType5 = new ClipsDraftAudioEffectType("ROBOT", 4);
        ROBOT = clipsDraftAudioEffectType5;
        ClipsDraftAudioEffectType clipsDraftAudioEffectType6 = new ClipsDraftAudioEffectType("GIANT", 5);
        GIANT = clipsDraftAudioEffectType6;
        ClipsDraftAudioEffectType clipsDraftAudioEffectType7 = new ClipsDraftAudioEffectType("SQUIRREL", 6);
        SQUIRREL = clipsDraftAudioEffectType7;
        ClipsDraftAudioEffectType clipsDraftAudioEffectType8 = new ClipsDraftAudioEffectType("BALLOON", 7);
        BALLOON = clipsDraftAudioEffectType8;
        ClipsDraftAudioEffectType clipsDraftAudioEffectType9 = new ClipsDraftAudioEffectType("EVIL", 8);
        EVIL = clipsDraftAudioEffectType9;
        ClipsDraftAudioEffectType[] clipsDraftAudioEffectTypeArr = {clipsDraftAudioEffectType, clipsDraftAudioEffectType2, clipsDraftAudioEffectType3, clipsDraftAudioEffectType4, clipsDraftAudioEffectType5, clipsDraftAudioEffectType6, clipsDraftAudioEffectType7, clipsDraftAudioEffectType8, clipsDraftAudioEffectType9};
        $VALUES = clipsDraftAudioEffectTypeArr;
        $ENTRIES = new asp(clipsDraftAudioEffectTypeArr);
    }

    public ClipsDraftAudioEffectType() {
        throw null;
    }

    public static zrp<ClipsDraftAudioEffectType> h() {
        return $ENTRIES;
    }

    public static ClipsDraftAudioEffectType valueOf(String str) {
        return (ClipsDraftAudioEffectType) Enum.valueOf(ClipsDraftAudioEffectType.class, str);
    }

    public static ClipsDraftAudioEffectType[] values() {
        return (ClipsDraftAudioEffectType[]) $VALUES.clone();
    }
}
