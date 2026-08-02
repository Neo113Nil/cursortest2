package com.vk.media.ok;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OkEffects.kt */
/* loaded from: classes3.dex */
public final class InitStage {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InitStage[] $VALUES;
    public static final InitStage BUFFER1;
    public static final InitStage BUFFER2;
    public static final InitStage DONE;
    public static final InitStage EFFECT;
    public static final InitStage TENS1;
    public static final InitStage TENS2;

    static {
        InitStage initStage = new InitStage("EFFECT", 0);
        EFFECT = initStage;
        InitStage initStage2 = new InitStage("TENS1", 1);
        TENS1 = initStage2;
        InitStage initStage3 = new InitStage("TENS2", 2);
        TENS2 = initStage3;
        InitStage initStage4 = new InitStage("BUFFER1", 3);
        BUFFER1 = initStage4;
        InitStage initStage5 = new InitStage("BUFFER2", 4);
        BUFFER2 = initStage5;
        InitStage initStage6 = new InitStage("DONE", 5);
        DONE = initStage6;
        InitStage[] initStageArr = {initStage, initStage2, initStage3, initStage4, initStage5, initStage6};
        $VALUES = initStageArr;
        $ENTRIES = new asp(initStageArr);
    }

    public InitStage() {
        throw null;
    }

    public static InitStage valueOf(String str) {
        return (InitStage) Enum.valueOf(InitStage.class, str);
    }

    public static InitStage[] values() {
        return (InitStage[]) $VALUES.clone();
    }
}
