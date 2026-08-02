package com.vk.pullfromtopofrecycler;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PullFromTopMode.kt */
/* loaded from: classes5.dex */
public final class PullFromTopMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PullFromTopMode[] $VALUES;
    public static final PullFromTopMode ALWAYS_HIDDEN;
    public static final PullFromTopMode ALWAYS_VISIBLE;
    public static final PullFromTopMode DEFAULT;

    static {
        PullFromTopMode pullFromTopMode = new PullFromTopMode("ALWAYS_HIDDEN", 0);
        ALWAYS_HIDDEN = pullFromTopMode;
        PullFromTopMode pullFromTopMode2 = new PullFromTopMode("DEFAULT", 1);
        DEFAULT = pullFromTopMode2;
        PullFromTopMode pullFromTopMode3 = new PullFromTopMode("ALWAYS_VISIBLE", 2);
        ALWAYS_VISIBLE = pullFromTopMode3;
        PullFromTopMode[] pullFromTopModeArr = {pullFromTopMode, pullFromTopMode2, pullFromTopMode3};
        $VALUES = pullFromTopModeArr;
        $ENTRIES = new asp(pullFromTopModeArr);
    }

    public PullFromTopMode() {
        throw null;
    }

    public static PullFromTopMode valueOf(String str) {
        return (PullFromTopMode) Enum.valueOf(PullFromTopMode.class, str);
    }

    public static PullFromTopMode[] values() {
        return (PullFromTopMode[]) $VALUES.clone();
    }
}
