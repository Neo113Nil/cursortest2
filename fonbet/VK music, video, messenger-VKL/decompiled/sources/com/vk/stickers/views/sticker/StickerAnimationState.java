package com.vk.stickers.views.sticker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StickerAnimationState.kt */
/* loaded from: classes6.dex */
public final class StickerAnimationState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StickerAnimationState[] $VALUES;
    public static final StickerAnimationState DISABLE;
    public static final StickerAnimationState PAUSE;
    public static final StickerAnimationState PLAY;

    static {
        StickerAnimationState stickerAnimationState = new StickerAnimationState("DISABLE", 0);
        DISABLE = stickerAnimationState;
        StickerAnimationState stickerAnimationState2 = new StickerAnimationState("PAUSE", 1);
        PAUSE = stickerAnimationState2;
        StickerAnimationState stickerAnimationState3 = new StickerAnimationState("PLAY", 2);
        PLAY = stickerAnimationState3;
        StickerAnimationState[] stickerAnimationStateArr = {stickerAnimationState, stickerAnimationState2, stickerAnimationState3};
        $VALUES = stickerAnimationStateArr;
        $ENTRIES = new asp(stickerAnimationStateArr);
    }

    public StickerAnimationState() {
        throw null;
    }

    public static StickerAnimationState valueOf(String str) {
        return (StickerAnimationState) Enum.valueOf(StickerAnimationState.class, str);
    }

    public static StickerAnimationState[] values() {
        return (StickerAnimationState[]) $VALUES.clone();
    }
}
