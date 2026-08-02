package com.vk.im.engine.models.sync;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImBgSyncMode.kt */
/* loaded from: classes.dex */
public final class ImBgSyncMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImBgSyncMode[] $VALUES;
    public static final a Companion;
    public static final ImBgSyncMode FULL;
    public static final ImBgSyncMode LITE;
    private static final ImBgSyncMode[] VALUES;
    private final String id;

    /* compiled from: ImBgSyncMode.kt */
    public static final class a {
    }

    static {
        ImBgSyncMode imBgSyncMode = new ImBgSyncMode("LITE", 0, "lite");
        LITE = imBgSyncMode;
        ImBgSyncMode imBgSyncMode2 = new ImBgSyncMode("FULL", 1, "full");
        FULL = imBgSyncMode2;
        ImBgSyncMode[] imBgSyncModeArr = {imBgSyncMode, imBgSyncMode2};
        $VALUES = imBgSyncModeArr;
        $ENTRIES = new asp(imBgSyncModeArr);
        Companion = new a();
        VALUES = values();
    }

    public ImBgSyncMode(String str, int i, String str2) {
        this.id = str2;
    }

    public static ImBgSyncMode valueOf(String str) {
        return (ImBgSyncMode) Enum.valueOf(ImBgSyncMode.class, str);
    }

    public static ImBgSyncMode[] values() {
        return (ImBgSyncMode[]) $VALUES.clone();
    }
}
