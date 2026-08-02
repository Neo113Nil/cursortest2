package com.vk.regionsdrawer.drawer;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DrawMode.kt */
/* loaded from: classes5.dex */
public final class DrawMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DrawMode[] $VALUES;
    public static final DrawMode OFFSCREEN_BITMAP;
    public static final DrawMode OFFSCREEN_LAYER;

    static {
        DrawMode drawMode = new DrawMode("OFFSCREEN_LAYER", 0);
        OFFSCREEN_LAYER = drawMode;
        DrawMode drawMode2 = new DrawMode("OFFSCREEN_BITMAP", 1);
        OFFSCREEN_BITMAP = drawMode2;
        DrawMode[] drawModeArr = {drawMode, drawMode2};
        $VALUES = drawModeArr;
        $ENTRIES = new asp(drawModeArr);
    }

    public DrawMode() {
        throw null;
    }

    public static DrawMode valueOf(String str) {
        return (DrawMode) Enum.valueOf(DrawMode.class, str);
    }

    public static DrawMode[] values() {
        return (DrawMode[]) $VALUES.clone();
    }
}
