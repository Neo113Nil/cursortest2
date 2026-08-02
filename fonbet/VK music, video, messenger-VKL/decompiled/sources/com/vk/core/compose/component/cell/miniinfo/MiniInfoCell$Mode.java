package com.vk.core.compose.component.cell.miniinfo;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniInfoCell.kt */
/* loaded from: classes17.dex */
public final class MiniInfoCell$Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MiniInfoCell$Mode[] $VALUES;
    public static final MiniInfoCell$Mode AddInfo;
    public static final MiniInfoCell$Mode Base;
    public static final MiniInfoCell$Mode BaseAccent;
    public static final MiniInfoCell$Mode Link;
    public static final MiniInfoCell$Mode MoreInfo;

    static {
        MiniInfoCell$Mode miniInfoCell$Mode = new MiniInfoCell$Mode("Base", 0);
        Base = miniInfoCell$Mode;
        MiniInfoCell$Mode miniInfoCell$Mode2 = new MiniInfoCell$Mode("BaseAccent", 1);
        BaseAccent = miniInfoCell$Mode2;
        MiniInfoCell$Mode miniInfoCell$Mode3 = new MiniInfoCell$Mode("Link", 2);
        Link = miniInfoCell$Mode3;
        MiniInfoCell$Mode miniInfoCell$Mode4 = new MiniInfoCell$Mode("AddInfo", 3);
        AddInfo = miniInfoCell$Mode4;
        MiniInfoCell$Mode miniInfoCell$Mode5 = new MiniInfoCell$Mode("MoreInfo", 4);
        MoreInfo = miniInfoCell$Mode5;
        MiniInfoCell$Mode[] miniInfoCell$ModeArr = {miniInfoCell$Mode, miniInfoCell$Mode2, miniInfoCell$Mode3, miniInfoCell$Mode4, miniInfoCell$Mode5};
        $VALUES = miniInfoCell$ModeArr;
        $ENTRIES = new asp(miniInfoCell$ModeArr);
    }

    public MiniInfoCell$Mode() {
        throw null;
    }

    public static MiniInfoCell$Mode valueOf(String str) {
        return (MiniInfoCell$Mode) Enum.valueOf(MiniInfoCell$Mode.class, str);
    }

    public static MiniInfoCell$Mode[] values() {
        return (MiniInfoCell$Mode[]) $VALUES.clone();
    }
}
