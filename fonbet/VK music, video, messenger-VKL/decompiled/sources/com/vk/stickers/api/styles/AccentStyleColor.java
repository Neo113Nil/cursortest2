package com.vk.stickers.api.styles;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccentStyleColor.kt */
/* loaded from: classes5.dex */
public final class AccentStyleColor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccentStyleColor[] $VALUES;
    public static final AccentStyleColor GEO_PLACE;
    public static final AccentStyleColor HASHTAG;
    public static final AccentStyleColor LINK;
    public static final AccentStyleColor MENTION;
    private final int colorResId;

    static {
        AccentStyleColor accentStyleColor = new AccentStyleColor("MENTION", 0, R.color.vk_purple_neon);
        MENTION = accentStyleColor;
        AccentStyleColor accentStyleColor2 = new AccentStyleColor("HASHTAG", 1, R.color.vk_orange_tangerine);
        HASHTAG = accentStyleColor2;
        AccentStyleColor accentStyleColor3 = new AccentStyleColor("GEO_PLACE", 2, R.color.vk_green_emerald);
        GEO_PLACE = accentStyleColor3;
        AccentStyleColor accentStyleColor4 = new AccentStyleColor("LINK", 3, R.color.vk_azure_A100);
        LINK = accentStyleColor4;
        AccentStyleColor[] accentStyleColorArr = {accentStyleColor, accentStyleColor2, accentStyleColor3, accentStyleColor4};
        $VALUES = accentStyleColorArr;
        $ENTRIES = new asp(accentStyleColorArr);
    }

    public AccentStyleColor(String str, int i, int i2) {
        this.colorResId = i2;
    }

    public static AccentStyleColor valueOf(String str) {
        return (AccentStyleColor) Enum.valueOf(AccentStyleColor.class, str);
    }

    public static AccentStyleColor[] values() {
        return (AccentStyleColor[]) $VALUES.clone();
    }

    public final int h() {
        return this.colorResId;
    }
}
