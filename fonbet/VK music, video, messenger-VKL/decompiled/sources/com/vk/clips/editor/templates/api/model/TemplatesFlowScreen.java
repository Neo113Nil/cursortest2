package com.vk.clips.editor.templates.api.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TemplatesFlowScreen.kt */
/* loaded from: classes.dex */
public final class TemplatesFlowScreen {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TemplatesFlowScreen[] $VALUES;
    public static final TemplatesFlowScreen CAMERA;
    public static final TemplatesFlowScreen CATALOG;
    public static final TemplatesFlowScreen CLIP_FEED;
    public static final TemplatesFlowScreen EDITOR;
    public static final TemplatesFlowScreen ENTRY_POINTS;
    public static final TemplatesFlowScreen MUSIC_GRID;
    public static final TemplatesFlowScreen PREVIEW;
    public static final TemplatesFlowScreen UNDEFINED;

    static {
        TemplatesFlowScreen templatesFlowScreen = new TemplatesFlowScreen("UNDEFINED", 0);
        UNDEFINED = templatesFlowScreen;
        TemplatesFlowScreen templatesFlowScreen2 = new TemplatesFlowScreen("MUSIC_GRID", 1);
        MUSIC_GRID = templatesFlowScreen2;
        TemplatesFlowScreen templatesFlowScreen3 = new TemplatesFlowScreen("CATALOG", 2);
        CATALOG = templatesFlowScreen3;
        TemplatesFlowScreen templatesFlowScreen4 = new TemplatesFlowScreen("PREVIEW", 3);
        PREVIEW = templatesFlowScreen4;
        TemplatesFlowScreen templatesFlowScreen5 = new TemplatesFlowScreen("CAMERA", 4);
        CAMERA = templatesFlowScreen5;
        TemplatesFlowScreen templatesFlowScreen6 = new TemplatesFlowScreen("CLIP_FEED", 5);
        CLIP_FEED = templatesFlowScreen6;
        TemplatesFlowScreen templatesFlowScreen7 = new TemplatesFlowScreen("EDITOR", 6);
        EDITOR = templatesFlowScreen7;
        TemplatesFlowScreen templatesFlowScreen8 = new TemplatesFlowScreen("ENTRY_POINTS", 7);
        ENTRY_POINTS = templatesFlowScreen8;
        TemplatesFlowScreen[] templatesFlowScreenArr = {templatesFlowScreen, templatesFlowScreen2, templatesFlowScreen3, templatesFlowScreen4, templatesFlowScreen5, templatesFlowScreen6, templatesFlowScreen7, templatesFlowScreen8};
        $VALUES = templatesFlowScreenArr;
        $ENTRIES = new asp(templatesFlowScreenArr);
    }

    public TemplatesFlowScreen() {
        throw null;
    }

    public static TemplatesFlowScreen valueOf(String str) {
        return (TemplatesFlowScreen) Enum.valueOf(TemplatesFlowScreen.class, str);
    }

    public static TemplatesFlowScreen[] values() {
        return (TemplatesFlowScreen[]) $VALUES.clone();
    }
}
