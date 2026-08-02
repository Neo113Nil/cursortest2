package com.vk.stickers.api.models.time;

import java.util.List;
import xsna.asp;
import xsna.e43;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimeStickerStyle.kt */
/* loaded from: classes5.dex */
public final class TimeStickerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TimeStickerStyle[] $VALUES;
    public static final a Companion;
    public static final TimeStickerStyle STYLE_TIME_STICKER_BLACK;
    public static final TimeStickerStyle STYLE_TIME_STICKER_DATE;
    public static final TimeStickerStyle STYLE_TIME_STICKER_GREEN;
    public static final TimeStickerStyle STYLE_TIME_STICKER_MEMORIES;
    public static final TimeStickerStyle STYLE_TIME_STICKER_TEXT;
    public static final TimeStickerStyle STYLE_TIME_STICKER_WHITE;
    private static final List<TimeStickerStyle> entries;
    private final int code;
    private final String value;

    /* compiled from: TimeStickerStyle.kt */
    public static final class a {
    }

    static {
        TimeStickerStyle timeStickerStyle = new TimeStickerStyle("STYLE_TIME_STICKER_BLACK", 0, "black", 6);
        STYLE_TIME_STICKER_BLACK = timeStickerStyle;
        TimeStickerStyle timeStickerStyle2 = new TimeStickerStyle("STYLE_TIME_STICKER_WHITE", 1, "white", 5);
        STYLE_TIME_STICKER_WHITE = timeStickerStyle2;
        TimeStickerStyle timeStickerStyle3 = new TimeStickerStyle("STYLE_TIME_STICKER_GREEN", 2, "green", 0);
        STYLE_TIME_STICKER_GREEN = timeStickerStyle3;
        TimeStickerStyle timeStickerStyle4 = new TimeStickerStyle("STYLE_TIME_STICKER_TEXT", 3, "text", 7);
        STYLE_TIME_STICKER_TEXT = timeStickerStyle4;
        TimeStickerStyle timeStickerStyle5 = new TimeStickerStyle("STYLE_TIME_STICKER_DATE", 4, "date", 4);
        STYLE_TIME_STICKER_DATE = timeStickerStyle5;
        TimeStickerStyle timeStickerStyle6 = new TimeStickerStyle("STYLE_TIME_STICKER_MEMORIES", 5, "memories", 0);
        STYLE_TIME_STICKER_MEMORIES = timeStickerStyle6;
        TimeStickerStyle[] timeStickerStyleArr = {timeStickerStyle, timeStickerStyle2, timeStickerStyle3, timeStickerStyle4, timeStickerStyle5, timeStickerStyle6};
        $VALUES = timeStickerStyleArr;
        $ENTRIES = new asp(timeStickerStyleArr);
        Companion = new a();
        entries = e43.l(timeStickerStyle, timeStickerStyle2, timeStickerStyle4, timeStickerStyle5);
    }

    public TimeStickerStyle(String str, int i, String str2, int i2) {
        this.value = str2;
        this.code = i2;
    }

    public static TimeStickerStyle valueOf(String str) {
        return (TimeStickerStyle) Enum.valueOf(TimeStickerStyle.class, str);
    }

    public static TimeStickerStyle[] values() {
        return (TimeStickerStyle[]) $VALUES.clone();
    }

    public final int i() {
        return this.code;
    }

    public final String j() {
        return this.value;
    }
}
