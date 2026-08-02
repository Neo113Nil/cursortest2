package com.vk.superapp.vkclient.js.bridge.api.events;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowStoryBox.kt */
/* loaded from: classes6.dex */
public final class ShowStoryBox$Parameters$Stickers$StickerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShowStoryBox$Parameters$Stickers$StickerType[] $VALUES;

    @pmi0("native")
    public static final ShowStoryBox$Parameters$Stickers$StickerType NATIVE;

    @pmi0("renderable")
    public static final ShowStoryBox$Parameters$Stickers$StickerType RENDERABLE;

    static {
        ShowStoryBox$Parameters$Stickers$StickerType showStoryBox$Parameters$Stickers$StickerType = new ShowStoryBox$Parameters$Stickers$StickerType("NATIVE", 0);
        NATIVE = showStoryBox$Parameters$Stickers$StickerType;
        ShowStoryBox$Parameters$Stickers$StickerType showStoryBox$Parameters$Stickers$StickerType2 = new ShowStoryBox$Parameters$Stickers$StickerType("RENDERABLE", 1);
        RENDERABLE = showStoryBox$Parameters$Stickers$StickerType2;
        ShowStoryBox$Parameters$Stickers$StickerType[] showStoryBox$Parameters$Stickers$StickerTypeArr = {showStoryBox$Parameters$Stickers$StickerType, showStoryBox$Parameters$Stickers$StickerType2};
        $VALUES = showStoryBox$Parameters$Stickers$StickerTypeArr;
        $ENTRIES = new asp(showStoryBox$Parameters$Stickers$StickerTypeArr);
    }

    private ShowStoryBox$Parameters$Stickers$StickerType(String str, int i) {
    }

    public static ShowStoryBox$Parameters$Stickers$StickerType valueOf(String str) {
        return (ShowStoryBox$Parameters$Stickers$StickerType) Enum.valueOf(ShowStoryBox$Parameters$Stickers$StickerType.class, str);
    }

    public static ShowStoryBox$Parameters$Stickers$StickerType[] values() {
        return (ShowStoryBox$Parameters$Stickers$StickerType[]) $VALUES.clone();
    }
}
