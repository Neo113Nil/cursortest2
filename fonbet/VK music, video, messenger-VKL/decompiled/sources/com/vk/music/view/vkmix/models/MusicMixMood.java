package com.vk.music.view.vkmix.models;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicMixMood.kt */
/* loaded from: classes3.dex */
public final class MusicMixMood {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicMixMood[] $VALUES;
    public static final MusicMixMood Active;
    public static final MusicMixMood Calm;
    public static final a Companion;
    public static final MusicMixMood Familiar;
    public static final MusicMixMood Idle;
    public static final MusicMixMood Joy;
    public static final MusicMixMood Love;
    public static final MusicMixMood MyMix;
    public static final MusicMixMood NewYear;
    public static final MusicMixMood Novelty;
    public static final MusicMixMood Play;
    public static final MusicMixMood Sad;
    public static final MusicMixMood Unfamiliar;
    private final String id;

    /* compiled from: MusicMixMood.kt */
    public static final class a {
    }

    static {
        MusicMixMood musicMixMood = new MusicMixMood("Idle", 0, "idle");
        Idle = musicMixMood;
        MusicMixMood musicMixMood2 = new MusicMixMood("Play", 1, "play");
        Play = musicMixMood2;
        MusicMixMood musicMixMood3 = new MusicMixMood("MyMix", 2, "mymusic");
        MyMix = musicMixMood3;
        MusicMixMood musicMixMood4 = new MusicMixMood("Love", 3, "love");
        Love = musicMixMood4;
        MusicMixMood musicMixMood5 = new MusicMixMood("Active", 4, SignalingProtocol.KEY_ACTIVE);
        Active = musicMixMood5;
        MusicMixMood musicMixMood6 = new MusicMixMood("Joy", 5, "happy");
        Joy = musicMixMood6;
        MusicMixMood musicMixMood7 = new MusicMixMood("Sad", 6, "sad");
        Sad = musicMixMood7;
        MusicMixMood musicMixMood8 = new MusicMixMood("Calm", 7, "calm");
        Calm = musicMixMood8;
        MusicMixMood musicMixMood9 = new MusicMixMood("NewYear", 8, "new_year");
        NewYear = musicMixMood9;
        MusicMixMood musicMixMood10 = new MusicMixMood("Novelty", 9, "fresh");
        Novelty = musicMixMood10;
        MusicMixMood musicMixMood11 = new MusicMixMood("Unfamiliar", 10, "unknown");
        Unfamiliar = musicMixMood11;
        MusicMixMood musicMixMood12 = new MusicMixMood("Familiar", 11, "known");
        Familiar = musicMixMood12;
        MusicMixMood[] musicMixMoodArr = {musicMixMood, musicMixMood2, musicMixMood3, musicMixMood4, musicMixMood5, musicMixMood6, musicMixMood7, musicMixMood8, musicMixMood9, musicMixMood10, musicMixMood11, musicMixMood12};
        $VALUES = musicMixMoodArr;
        $ENTRIES = new asp(musicMixMoodArr);
        Companion = new a();
    }

    public MusicMixMood(String str, int i, String str2) {
        this.id = str2;
    }

    public static zrp<MusicMixMood> h() {
        return $ENTRIES;
    }

    public static MusicMixMood valueOf(String str) {
        return (MusicMixMood) Enum.valueOf(MusicMixMood.class, str);
    }

    public static MusicMixMood[] values() {
        return (MusicMixMood[]) $VALUES.clone();
    }
}
