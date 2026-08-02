package com.vk.music.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoopMode.kt */
/* loaded from: classes.dex */
public final class LoopMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoopMode[] $VALUES;
    public static final a Companion;
    public static final LoopMode LIST;
    public static final LoopMode NONE;
    public static final LoopMode TRACK;
    public static final LoopMode[] VALUES;

    /* compiled from: LoopMode.kt */
    public static final class a {
        public static LoopMode a(LoopMode loopMode) {
            int ordinal = (loopMode.ordinal() + 1) % LoopMode.values().length;
            LoopMode loopMode2 = LoopMode.LIST;
            if (ordinal == loopMode2.ordinal()) {
                return loopMode2;
            }
            LoopMode loopMode3 = LoopMode.TRACK;
            return ordinal == loopMode3.ordinal() ? loopMode3 : LoopMode.NONE;
        }
    }

    static {
        LoopMode loopMode = new LoopMode("NONE", 0);
        NONE = loopMode;
        LoopMode loopMode2 = new LoopMode("LIST", 1);
        LIST = loopMode2;
        LoopMode loopMode3 = new LoopMode("TRACK", 2);
        TRACK = loopMode3;
        LoopMode[] loopModeArr = {loopMode, loopMode2, loopMode3};
        $VALUES = loopModeArr;
        $ENTRIES = new asp(loopModeArr);
        Companion = new a();
        VALUES = values();
    }

    public LoopMode() {
        throw null;
    }

    public static LoopMode valueOf(String str) {
        return (LoopMode) Enum.valueOf(LoopMode.class, str);
    }

    public static LoopMode[] values() {
        return (LoopMode[]) $VALUES.clone();
    }
}
