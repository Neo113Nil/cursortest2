package com.vk.clips.sdk.drafts.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClearDraftMode.kt */
/* loaded from: classes17.dex */
public final class ClearDraftMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClearDraftMode[] $VALUES;
    public static final ClearDraftMode CLEAN_ALL;
    public static final ClearDraftMode CLEAN_VIDEO;
    public static final ClearDraftMode NONE;

    static {
        ClearDraftMode clearDraftMode = new ClearDraftMode("NONE", 0);
        NONE = clearDraftMode;
        ClearDraftMode clearDraftMode2 = new ClearDraftMode("CLEAN_VIDEO", 1);
        CLEAN_VIDEO = clearDraftMode2;
        ClearDraftMode clearDraftMode3 = new ClearDraftMode("CLEAN_ALL", 2);
        CLEAN_ALL = clearDraftMode3;
        ClearDraftMode[] clearDraftModeArr = {clearDraftMode, clearDraftMode2, clearDraftMode3};
        $VALUES = clearDraftModeArr;
        $ENTRIES = new asp(clearDraftModeArr);
    }

    public ClearDraftMode() {
        throw null;
    }

    public static ClearDraftMode valueOf(String str) {
        return (ClearDraftMode) Enum.valueOf(ClearDraftMode.class, str);
    }

    public static ClearDraftMode[] values() {
        return (ClearDraftMode[]) $VALUES.clone();
    }
}
