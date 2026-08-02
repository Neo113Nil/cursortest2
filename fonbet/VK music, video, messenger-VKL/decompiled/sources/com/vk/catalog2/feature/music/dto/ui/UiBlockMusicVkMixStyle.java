package com.vk.catalog2.feature.music.dto.ui;

import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiBlockMusicVkMixStyle.kt */
/* loaded from: classes16.dex */
public final class UiBlockMusicVkMixStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UiBlockMusicVkMixStyle[] $VALUES;
    public static final a Companion;
    public static final UiBlockMusicVkMixStyle DEFAULT;
    public static final UiBlockMusicVkMixStyle SECONDARY;
    private final String value;

    /* compiled from: UiBlockMusicVkMixStyle.kt */
    public static final class a {
        public static UiBlockMusicVkMixStyle a(String str) {
            UiBlockMusicVkMixStyle uiBlockMusicVkMixStyle;
            UiBlockMusicVkMixStyle[] values = UiBlockMusicVkMixStyle.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    uiBlockMusicVkMixStyle = null;
                    break;
                }
                uiBlockMusicVkMixStyle = values[i];
                if (epx.f(uiBlockMusicVkMixStyle.h(), str)) {
                    break;
                }
                i++;
            }
            return uiBlockMusicVkMixStyle == null ? UiBlockMusicVkMixStyle.DEFAULT : uiBlockMusicVkMixStyle;
        }
    }

    static {
        UiBlockMusicVkMixStyle uiBlockMusicVkMixStyle = new UiBlockMusicVkMixStyle("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = uiBlockMusicVkMixStyle;
        UiBlockMusicVkMixStyle uiBlockMusicVkMixStyle2 = new UiBlockMusicVkMixStyle("SECONDARY", 1, X3.i.Y);
        SECONDARY = uiBlockMusicVkMixStyle2;
        UiBlockMusicVkMixStyle[] uiBlockMusicVkMixStyleArr = {uiBlockMusicVkMixStyle, uiBlockMusicVkMixStyle2};
        $VALUES = uiBlockMusicVkMixStyleArr;
        $ENTRIES = new asp(uiBlockMusicVkMixStyleArr);
        Companion = new a();
    }

    public UiBlockMusicVkMixStyle(String str, int i, String str2) {
        this.value = str2;
    }

    public static UiBlockMusicVkMixStyle valueOf(String str) {
        return (UiBlockMusicVkMixStyle) Enum.valueOf(UiBlockMusicVkMixStyle.class, str);
    }

    public static UiBlockMusicVkMixStyle[] values() {
        return (UiBlockMusicVkMixStyle[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
