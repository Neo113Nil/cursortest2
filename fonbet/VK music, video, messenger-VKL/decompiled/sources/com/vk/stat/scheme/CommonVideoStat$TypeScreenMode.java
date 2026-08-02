package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeScreenMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonVideoStat$TypeScreenMode[] $VALUES;

    @pmi0("discovery")
    public static final CommonVideoStat$TypeScreenMode DISCOVERY;

    @pmi0("fullscreen_landscape")
    public static final CommonVideoStat$TypeScreenMode FULLSCREEN_LANDSCAPE;

    @pmi0("fullscreen_portrait")
    public static final CommonVideoStat$TypeScreenMode FULLSCREEN_PORTRAIT;

    @pmi0("preview")
    public static final CommonVideoStat$TypeScreenMode PREVIEW;

    static {
        CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode = new CommonVideoStat$TypeScreenMode("DISCOVERY", 0);
        DISCOVERY = commonVideoStat$TypeScreenMode;
        CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode2 = new CommonVideoStat$TypeScreenMode("PREVIEW", 1);
        PREVIEW = commonVideoStat$TypeScreenMode2;
        CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode3 = new CommonVideoStat$TypeScreenMode("FULLSCREEN_LANDSCAPE", 2);
        FULLSCREEN_LANDSCAPE = commonVideoStat$TypeScreenMode3;
        CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode4 = new CommonVideoStat$TypeScreenMode("FULLSCREEN_PORTRAIT", 3);
        FULLSCREEN_PORTRAIT = commonVideoStat$TypeScreenMode4;
        CommonVideoStat$TypeScreenMode[] commonVideoStat$TypeScreenModeArr = {commonVideoStat$TypeScreenMode, commonVideoStat$TypeScreenMode2, commonVideoStat$TypeScreenMode3, commonVideoStat$TypeScreenMode4};
        $VALUES = commonVideoStat$TypeScreenModeArr;
        $ENTRIES = new asp(commonVideoStat$TypeScreenModeArr);
    }

    private CommonVideoStat$TypeScreenMode(String str, int i) {
    }

    public static CommonVideoStat$TypeScreenMode valueOf(String str) {
        return (CommonVideoStat$TypeScreenMode) Enum.valueOf(CommonVideoStat$TypeScreenMode.class, str);
    }

    public static CommonVideoStat$TypeScreenMode[] values() {
        return (CommonVideoStat$TypeScreenMode[]) $VALUES.clone();
    }
}
