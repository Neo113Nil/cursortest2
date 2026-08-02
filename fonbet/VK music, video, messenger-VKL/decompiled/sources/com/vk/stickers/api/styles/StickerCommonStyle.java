package com.vk.stickers.api.styles;

import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StickerCommonStyle.kt */
/* loaded from: classes5.dex */
public final class StickerCommonStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StickerCommonStyle[] $VALUES;
    public static final StickerCommonStyle ACCENT;
    public static final StickerCommonStyle ACCENT_BACKGROUND;
    public static final StickerCommonStyle ACCENT_CONTENT;
    public static final a Companion;
    public static final StickerCommonStyle DARK;
    public static final StickerCommonStyle DARK_UNIQUE;
    public static final StickerCommonStyle DARK_WITHOUT_BACKGROUND;
    public static final StickerCommonStyle LIGHT;
    public static final StickerCommonStyle LIGHT_UNIQUE;
    public static final StickerCommonStyle LIGHT_WITHOUT_BACKGROUND;
    private final String styleName;

    /* compiled from: StickerCommonStyle.kt */
    public static final class a {
        public static StickerCommonStyle a(String str, StickerCommonStyle stickerCommonStyle) {
            Object obj;
            Iterator<E> it = StickerCommonStyle.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((StickerCommonStyle) obj).i(), str)) {
                    break;
                }
            }
            StickerCommonStyle stickerCommonStyle2 = (StickerCommonStyle) obj;
            return stickerCommonStyle2 == null ? stickerCommonStyle : stickerCommonStyle2;
        }
    }

    static {
        StickerCommonStyle stickerCommonStyle = new StickerCommonStyle("DARK", 0, "dark");
        DARK = stickerCommonStyle;
        StickerCommonStyle stickerCommonStyle2 = new StickerCommonStyle("LIGHT", 1, "light");
        LIGHT = stickerCommonStyle2;
        StickerCommonStyle stickerCommonStyle3 = new StickerCommonStyle("ACCENT", 2, "accent");
        ACCENT = stickerCommonStyle3;
        StickerCommonStyle stickerCommonStyle4 = new StickerCommonStyle("ACCENT_BACKGROUND", 3, "accent_background");
        ACCENT_BACKGROUND = stickerCommonStyle4;
        StickerCommonStyle stickerCommonStyle5 = new StickerCommonStyle("ACCENT_CONTENT", 4, "accent_text");
        ACCENT_CONTENT = stickerCommonStyle5;
        StickerCommonStyle stickerCommonStyle6 = new StickerCommonStyle("DARK_WITHOUT_BACKGROUND", 5, "dark_text");
        DARK_WITHOUT_BACKGROUND = stickerCommonStyle6;
        StickerCommonStyle stickerCommonStyle7 = new StickerCommonStyle("LIGHT_WITHOUT_BACKGROUND", 6, "light_text");
        LIGHT_WITHOUT_BACKGROUND = stickerCommonStyle7;
        StickerCommonStyle stickerCommonStyle8 = new StickerCommonStyle("DARK_UNIQUE", 7, "dark_unique");
        DARK_UNIQUE = stickerCommonStyle8;
        StickerCommonStyle stickerCommonStyle9 = new StickerCommonStyle("LIGHT_UNIQUE", 8, "light_unique");
        LIGHT_UNIQUE = stickerCommonStyle9;
        StickerCommonStyle[] stickerCommonStyleArr = {stickerCommonStyle, stickerCommonStyle2, stickerCommonStyle3, stickerCommonStyle4, stickerCommonStyle5, stickerCommonStyle6, stickerCommonStyle7, stickerCommonStyle8, stickerCommonStyle9};
        $VALUES = stickerCommonStyleArr;
        $ENTRIES = new asp(stickerCommonStyleArr);
        Companion = new a();
    }

    public StickerCommonStyle(String str, int i, String str2) {
        this.styleName = str2;
    }

    public static zrp<StickerCommonStyle> h() {
        return $ENTRIES;
    }

    public static StickerCommonStyle valueOf(String str) {
        return (StickerCommonStyle) Enum.valueOf(StickerCommonStyle.class, str);
    }

    public static StickerCommonStyle[] values() {
        return (StickerCommonStyle[]) $VALUES.clone();
    }

    public final String i() {
        return this.styleName;
    }
}
