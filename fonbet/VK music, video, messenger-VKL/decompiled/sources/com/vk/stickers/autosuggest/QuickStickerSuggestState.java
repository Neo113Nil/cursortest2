package com.vk.stickers.autosuggest;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IAutoSuggestStickersPopupWindow.kt */
/* loaded from: classes5.dex */
public final class QuickStickerSuggestState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QuickStickerSuggestState[] $VALUES;
    public static final QuickStickerSuggestState CLIPS;
    public static final QuickStickerSuggestState DISABLED;
    public static final QuickStickerSuggestState POSTS;

    static {
        QuickStickerSuggestState quickStickerSuggestState = new QuickStickerSuggestState("CLIPS", 0);
        CLIPS = quickStickerSuggestState;
        QuickStickerSuggestState quickStickerSuggestState2 = new QuickStickerSuggestState("POSTS", 1);
        POSTS = quickStickerSuggestState2;
        QuickStickerSuggestState quickStickerSuggestState3 = new QuickStickerSuggestState("DISABLED", 2);
        DISABLED = quickStickerSuggestState3;
        QuickStickerSuggestState[] quickStickerSuggestStateArr = {quickStickerSuggestState, quickStickerSuggestState2, quickStickerSuggestState3};
        $VALUES = quickStickerSuggestStateArr;
        $ENTRIES = new asp(quickStickerSuggestStateArr);
    }

    public QuickStickerSuggestState() {
        throw null;
    }

    public static QuickStickerSuggestState valueOf(String str) {
        return (QuickStickerSuggestState) Enum.valueOf(QuickStickerSuggestState.class, str);
    }

    public static QuickStickerSuggestState[] values() {
        return (QuickStickerSuggestState[]) $VALUES.clone();
    }
}
