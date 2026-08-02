package com.facebook.imagepipeline.core;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownsampleMode.kt */
/* loaded from: classes.dex */
public final class DownsampleMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DownsampleMode[] $VALUES;
    public static final DownsampleMode ALWAYS;
    public static final DownsampleMode AUTO;
    public static final DownsampleMode NEVER;

    static {
        DownsampleMode downsampleMode = new DownsampleMode("ALWAYS", 0);
        ALWAYS = downsampleMode;
        DownsampleMode downsampleMode2 = new DownsampleMode("AUTO", 1);
        AUTO = downsampleMode2;
        DownsampleMode downsampleMode3 = new DownsampleMode("NEVER", 2);
        NEVER = downsampleMode3;
        DownsampleMode[] downsampleModeArr = {downsampleMode, downsampleMode2, downsampleMode3};
        $VALUES = downsampleModeArr;
        $ENTRIES = new asp(downsampleModeArr);
    }

    public DownsampleMode() {
        throw null;
    }

    public static DownsampleMode valueOf(String str) {
        return (DownsampleMode) Enum.valueOf(DownsampleMode.class, str);
    }

    public static DownsampleMode[] values() {
        return (DownsampleMode[]) $VALUES.clone();
    }
}
