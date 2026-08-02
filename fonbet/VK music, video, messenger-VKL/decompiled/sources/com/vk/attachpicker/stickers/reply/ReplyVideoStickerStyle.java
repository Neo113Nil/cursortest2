package com.vk.attachpicker.stickers.reply;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReplyVideoStickerInfo.kt */
/* loaded from: classes15.dex */
public final class ReplyVideoStickerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReplyVideoStickerStyle[] $VALUES;
    public static final ReplyVideoStickerStyle FULLSCREEN;
    public static final ReplyVideoStickerStyle MINIATURE;
    public static final ReplyVideoStickerStyle PREVIEW;
    private final String value;

    static {
        ReplyVideoStickerStyle replyVideoStickerStyle = new ReplyVideoStickerStyle("PREVIEW", 0, "preview");
        PREVIEW = replyVideoStickerStyle;
        ReplyVideoStickerStyle replyVideoStickerStyle2 = new ReplyVideoStickerStyle("MINIATURE", 1, "miniature");
        MINIATURE = replyVideoStickerStyle2;
        ReplyVideoStickerStyle replyVideoStickerStyle3 = new ReplyVideoStickerStyle("FULLSCREEN", 2, "fullview");
        FULLSCREEN = replyVideoStickerStyle3;
        ReplyVideoStickerStyle[] replyVideoStickerStyleArr = {replyVideoStickerStyle, replyVideoStickerStyle2, replyVideoStickerStyle3};
        $VALUES = replyVideoStickerStyleArr;
        $ENTRIES = new asp(replyVideoStickerStyleArr);
    }

    public ReplyVideoStickerStyle(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<ReplyVideoStickerStyle> h() {
        return $ENTRIES;
    }

    public static ReplyVideoStickerStyle valueOf(String str) {
        return (ReplyVideoStickerStyle) Enum.valueOf(ReplyVideoStickerStyle.class, str);
    }

    public static ReplyVideoStickerStyle[] values() {
        return (ReplyVideoStickerStyle[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
