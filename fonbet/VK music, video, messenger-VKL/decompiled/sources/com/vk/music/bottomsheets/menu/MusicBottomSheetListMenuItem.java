package com.vk.music.bottomsheets.menu;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicBottomSheetListMenuItem.kt */
/* loaded from: classes3.dex */
public final class MusicBottomSheetListMenuItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicBottomSheetListMenuItem[] $VALUES;
    public static final MusicBottomSheetListMenuItem AddToMyMusic;
    public static final MusicBottomSheetListMenuItem AddToPlaylist;
    public static final MusicBottomSheetListMenuItem ChangeVolume;
    public static final MusicBottomSheetListMenuItem Equalizer;
    public static final MusicBottomSheetListMenuItem GoToAlbum;
    public static final MusicBottomSheetListMenuItem GoToArtist;
    public static final MusicBottomSheetListMenuItem MixByTrack;
    public static final MusicBottomSheetListMenuItem PlayNext;
    public static final MusicBottomSheetListMenuItem PlaySimilar;
    public static final MusicBottomSheetListMenuItem PlayerSettingsMenu;
    public static final MusicBottomSheetListMenuItem Radio;
    public static final MusicBottomSheetListMenuItem RemoveFromMyMusic;
    public static final MusicBottomSheetListMenuItem RemoveFromPlaylist;
    public static final MusicBottomSheetListMenuItem RemoveFromQueue;
    public static final MusicBottomSheetListMenuItem RemoveRadio;
    public static final MusicBottomSheetListMenuItem Separator;
    public static final MusicBottomSheetListMenuItem SetTimer;
    public static final MusicBottomSheetListMenuItem ShareToStory;

    static {
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem = new MusicBottomSheetListMenuItem("Radio", 0);
        Radio = musicBottomSheetListMenuItem;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem2 = new MusicBottomSheetListMenuItem("Equalizer", 1);
        Equalizer = musicBottomSheetListMenuItem2;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem3 = new MusicBottomSheetListMenuItem("SetTimer", 2);
        SetTimer = musicBottomSheetListMenuItem3;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem4 = new MusicBottomSheetListMenuItem("RemoveRadio", 3);
        RemoveRadio = musicBottomSheetListMenuItem4;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem5 = new MusicBottomSheetListMenuItem("AddToMyMusic", 4);
        AddToMyMusic = musicBottomSheetListMenuItem5;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem6 = new MusicBottomSheetListMenuItem("AddToPlaylist", 5);
        AddToPlaylist = musicBottomSheetListMenuItem6;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem7 = new MusicBottomSheetListMenuItem("ShareToStory", 6);
        ShareToStory = musicBottomSheetListMenuItem7;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem8 = new MusicBottomSheetListMenuItem("GoToArtist", 7);
        GoToArtist = musicBottomSheetListMenuItem8;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem9 = new MusicBottomSheetListMenuItem("GoToAlbum", 8);
        GoToAlbum = musicBottomSheetListMenuItem9;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem10 = new MusicBottomSheetListMenuItem("MixByTrack", 9);
        MixByTrack = musicBottomSheetListMenuItem10;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem11 = new MusicBottomSheetListMenuItem("PlaySimilar", 10);
        PlaySimilar = musicBottomSheetListMenuItem11;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem12 = new MusicBottomSheetListMenuItem("PlayerSettingsMenu", 11);
        PlayerSettingsMenu = musicBottomSheetListMenuItem12;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem13 = new MusicBottomSheetListMenuItem("RemoveFromQueue", 12);
        RemoveFromQueue = musicBottomSheetListMenuItem13;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem14 = new MusicBottomSheetListMenuItem("RemoveFromMyMusic", 13);
        RemoveFromMyMusic = musicBottomSheetListMenuItem14;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem15 = new MusicBottomSheetListMenuItem("Separator", 14);
        Separator = musicBottomSheetListMenuItem15;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem16 = new MusicBottomSheetListMenuItem("ChangeVolume", 15);
        ChangeVolume = musicBottomSheetListMenuItem16;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem17 = new MusicBottomSheetListMenuItem("PlayNext", 16);
        PlayNext = musicBottomSheetListMenuItem17;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem18 = new MusicBottomSheetListMenuItem("RemoveFromPlaylist", 17);
        RemoveFromPlaylist = musicBottomSheetListMenuItem18;
        MusicBottomSheetListMenuItem[] musicBottomSheetListMenuItemArr = {musicBottomSheetListMenuItem, musicBottomSheetListMenuItem2, musicBottomSheetListMenuItem3, musicBottomSheetListMenuItem4, musicBottomSheetListMenuItem5, musicBottomSheetListMenuItem6, musicBottomSheetListMenuItem7, musicBottomSheetListMenuItem8, musicBottomSheetListMenuItem9, musicBottomSheetListMenuItem10, musicBottomSheetListMenuItem11, musicBottomSheetListMenuItem12, musicBottomSheetListMenuItem13, musicBottomSheetListMenuItem14, musicBottomSheetListMenuItem15, musicBottomSheetListMenuItem16, musicBottomSheetListMenuItem17, musicBottomSheetListMenuItem18};
        $VALUES = musicBottomSheetListMenuItemArr;
        $ENTRIES = new asp(musicBottomSheetListMenuItemArr);
    }

    public MusicBottomSheetListMenuItem() {
        throw null;
    }

    public static MusicBottomSheetListMenuItem valueOf(String str) {
        return (MusicBottomSheetListMenuItem) Enum.valueOf(MusicBottomSheetListMenuItem.class, str);
    }

    public static MusicBottomSheetListMenuItem[] values() {
        return (MusicBottomSheetListMenuItem[]) $VALUES.clone();
    }
}
