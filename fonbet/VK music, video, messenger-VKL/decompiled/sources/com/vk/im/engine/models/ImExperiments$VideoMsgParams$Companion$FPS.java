package com.vk.im.engine.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImExperiments.kt */
/* loaded from: classes2.dex */
public final class ImExperiments$VideoMsgParams$Companion$FPS {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImExperiments$VideoMsgParams$Companion$FPS[] $VALUES;
    public static final ImExperiments$VideoMsgParams$Companion$FPS FPS_30;
    public static final ImExperiments$VideoMsgParams$Companion$FPS FPS_60;
    private final int value;

    static {
        ImExperiments$VideoMsgParams$Companion$FPS imExperiments$VideoMsgParams$Companion$FPS = new ImExperiments$VideoMsgParams$Companion$FPS("FPS_30", 0, 30);
        FPS_30 = imExperiments$VideoMsgParams$Companion$FPS;
        ImExperiments$VideoMsgParams$Companion$FPS imExperiments$VideoMsgParams$Companion$FPS2 = new ImExperiments$VideoMsgParams$Companion$FPS("FPS_60", 1, 60);
        FPS_60 = imExperiments$VideoMsgParams$Companion$FPS2;
        ImExperiments$VideoMsgParams$Companion$FPS[] imExperiments$VideoMsgParams$Companion$FPSArr = {imExperiments$VideoMsgParams$Companion$FPS, imExperiments$VideoMsgParams$Companion$FPS2};
        $VALUES = imExperiments$VideoMsgParams$Companion$FPSArr;
        $ENTRIES = new asp(imExperiments$VideoMsgParams$Companion$FPSArr);
    }

    public ImExperiments$VideoMsgParams$Companion$FPS(String str, int i, int i2) {
        this.value = i2;
    }

    public static ImExperiments$VideoMsgParams$Companion$FPS valueOf(String str) {
        return (ImExperiments$VideoMsgParams$Companion$FPS) Enum.valueOf(ImExperiments$VideoMsgParams$Companion$FPS.class, str);
    }

    public static ImExperiments$VideoMsgParams$Companion$FPS[] values() {
        return (ImExperiments$VideoMsgParams$Companion$FPS[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
