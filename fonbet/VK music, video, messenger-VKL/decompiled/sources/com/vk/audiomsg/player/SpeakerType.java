package com.vk.audiomsg.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SpeakerType.kt */
/* loaded from: classes.dex */
public final class SpeakerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SpeakerType[] $VALUES;
    public static final a Companion;
    public static final SpeakerType INNER;
    public static final SpeakerType OUTER;
    private final int id;

    /* compiled from: SpeakerType.kt */
    public static final class a {
    }

    static {
        SpeakerType speakerType = new SpeakerType("INNER", 0, 1);
        INNER = speakerType;
        SpeakerType speakerType2 = new SpeakerType("OUTER", 1, 2);
        OUTER = speakerType2;
        SpeakerType[] speakerTypeArr = {speakerType, speakerType2};
        $VALUES = speakerTypeArr;
        $ENTRIES = new asp(speakerTypeArr);
        Companion = new a();
    }

    public SpeakerType(String str, int i, int i2) {
        this.id = i2;
    }

    public static SpeakerType valueOf(String str) {
        return (SpeakerType) Enum.valueOf(SpeakerType.class, str);
    }

    public static SpeakerType[] values() {
        return (SpeakerType[]) $VALUES.clone();
    }
}
