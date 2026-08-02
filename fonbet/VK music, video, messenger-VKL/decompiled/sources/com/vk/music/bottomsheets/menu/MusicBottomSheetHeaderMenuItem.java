package com.vk.music.bottomsheets.menu;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicBottomSheetHeaderMenuItem.kt */
/* loaded from: classes3.dex */
public final class MusicBottomSheetHeaderMenuItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicBottomSheetHeaderMenuItem[] $VALUES;
    public static final MusicBottomSheetHeaderMenuItem Share;
    public static final MusicBottomSheetHeaderMenuItem ToggleBroadcast;
    public static final MusicBottomSheetHeaderMenuItem ToggleDownload;

    static {
        MusicBottomSheetHeaderMenuItem musicBottomSheetHeaderMenuItem = new MusicBottomSheetHeaderMenuItem("Share", 0);
        Share = musicBottomSheetHeaderMenuItem;
        MusicBottomSheetHeaderMenuItem musicBottomSheetHeaderMenuItem2 = new MusicBottomSheetHeaderMenuItem("ToggleBroadcast", 1);
        ToggleBroadcast = musicBottomSheetHeaderMenuItem2;
        MusicBottomSheetHeaderMenuItem musicBottomSheetHeaderMenuItem3 = new MusicBottomSheetHeaderMenuItem("ToggleDownload", 2);
        ToggleDownload = musicBottomSheetHeaderMenuItem3;
        MusicBottomSheetHeaderMenuItem[] musicBottomSheetHeaderMenuItemArr = {musicBottomSheetHeaderMenuItem, musicBottomSheetHeaderMenuItem2, musicBottomSheetHeaderMenuItem3};
        $VALUES = musicBottomSheetHeaderMenuItemArr;
        $ENTRIES = new asp(musicBottomSheetHeaderMenuItemArr);
    }

    public MusicBottomSheetHeaderMenuItem() {
        throw null;
    }

    public static MusicBottomSheetHeaderMenuItem valueOf(String str) {
        return (MusicBottomSheetHeaderMenuItem) Enum.valueOf(MusicBottomSheetHeaderMenuItem.class, str);
    }

    public static MusicBottomSheetHeaderMenuItem[] values() {
        return (MusicBottomSheetHeaderMenuItem[]) $VALUES.clone();
    }
}
