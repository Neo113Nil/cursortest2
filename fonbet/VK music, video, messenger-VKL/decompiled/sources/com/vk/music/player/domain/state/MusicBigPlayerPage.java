package com.vk.music.player.domain.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicBigPlayerPage.kt */
/* loaded from: classes3.dex */
public final class MusicBigPlayerPage {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicBigPlayerPage[] $VALUES;
    public static final MusicBigPlayerPage CONTROLS;
    public static final a Companion;
    private static final MusicBigPlayerPage DEFAULT_PAGE;
    public static final MusicBigPlayerPage TRACK_LIST;

    /* compiled from: MusicBigPlayerPage.kt */
    public static final class a {
    }

    static {
        MusicBigPlayerPage musicBigPlayerPage = new MusicBigPlayerPage("CONTROLS", 0);
        CONTROLS = musicBigPlayerPage;
        MusicBigPlayerPage musicBigPlayerPage2 = new MusicBigPlayerPage("TRACK_LIST", 1);
        TRACK_LIST = musicBigPlayerPage2;
        MusicBigPlayerPage[] musicBigPlayerPageArr = {musicBigPlayerPage, musicBigPlayerPage2};
        $VALUES = musicBigPlayerPageArr;
        $ENTRIES = new asp(musicBigPlayerPageArr);
        Companion = new a();
        DEFAULT_PAGE = musicBigPlayerPage;
    }

    public MusicBigPlayerPage() {
        throw null;
    }

    public static MusicBigPlayerPage valueOf(String str) {
        return (MusicBigPlayerPage) Enum.valueOf(MusicBigPlayerPage.class, str);
    }

    public static MusicBigPlayerPage[] values() {
        return (MusicBigPlayerPage[]) $VALUES.clone();
    }
}
