package com.vk.clips.editor.provider;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsStickerSelectionProvider.kt */
/* loaded from: classes16.dex */
public final class StickerEditResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StickerEditResult[] $VALUES;
    public static final StickerEditResult EDIT_HASHTAG;
    public static final StickerEditResult EDIT_MENTION;
    public static final StickerEditResult EDIT_TEXT;
    public static final StickerEditResult NOTHING;
    public static final StickerEditResult STYLE_SWITCH;

    static {
        StickerEditResult stickerEditResult = new StickerEditResult("STYLE_SWITCH", 0);
        STYLE_SWITCH = stickerEditResult;
        StickerEditResult stickerEditResult2 = new StickerEditResult("EDIT_TEXT", 1);
        EDIT_TEXT = stickerEditResult2;
        StickerEditResult stickerEditResult3 = new StickerEditResult("EDIT_MENTION", 2);
        EDIT_MENTION = stickerEditResult3;
        StickerEditResult stickerEditResult4 = new StickerEditResult("EDIT_HASHTAG", 3);
        EDIT_HASHTAG = stickerEditResult4;
        StickerEditResult stickerEditResult5 = new StickerEditResult("NOTHING", 4);
        NOTHING = stickerEditResult5;
        StickerEditResult[] stickerEditResultArr = {stickerEditResult, stickerEditResult2, stickerEditResult3, stickerEditResult4, stickerEditResult5};
        $VALUES = stickerEditResultArr;
        $ENTRIES = new asp(stickerEditResultArr);
    }

    public StickerEditResult() {
        throw null;
    }

    public static StickerEditResult valueOf(String str) {
        return (StickerEditResult) Enum.valueOf(StickerEditResult.class, str);
    }

    public static StickerEditResult[] values() {
        return (StickerEditResult[]) $VALUES.clone();
    }
}
