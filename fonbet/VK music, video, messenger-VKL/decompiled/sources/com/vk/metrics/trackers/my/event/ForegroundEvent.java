package com.vk.metrics.trackers.my.event;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ForegroundEvent.kt */
/* loaded from: classes3.dex */
public final class ForegroundEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ForegroundEvent[] $VALUES;
    public static final ForegroundEvent CALLS;
    public static final ForegroundEvent CLIPS;
    public static final ForegroundEvent CLIP_PLAYER_ANY;
    public static final ForegroundEvent CLIP_PLAYER_FULLSCREEN;
    public static final ForegroundEvent DATING;
    public static final ForegroundEvent DZEN;
    public static final ForegroundEvent FEED;
    public static final ForegroundEvent MESSENGER;
    public static final ForegroundEvent MUSIC;
    public static final ForegroundEvent SERVICES;
    public static final ForegroundEvent SFERUM;
    public static final ForegroundEvent VIDEO;
    public static final ForegroundEvent VIDEO_PLAYER;
    private final int id;

    static {
        ForegroundEvent foregroundEvent = new ForegroundEvent("CALLS", 0, 81);
        CALLS = foregroundEvent;
        ForegroundEvent foregroundEvent2 = new ForegroundEvent("CLIPS", 1, 98);
        CLIPS = foregroundEvent2;
        ForegroundEvent foregroundEvent3 = new ForegroundEvent("DATING", 2, 67);
        DATING = foregroundEvent3;
        ForegroundEvent foregroundEvent4 = new ForegroundEvent("FEED", 3, 5);
        FEED = foregroundEvent4;
        ForegroundEvent foregroundEvent5 = new ForegroundEvent("DZEN", 4, 39);
        DZEN = foregroundEvent5;
        ForegroundEvent foregroundEvent6 = new ForegroundEvent("MESSENGER", 5, 7);
        MESSENGER = foregroundEvent6;
        ForegroundEvent foregroundEvent7 = new ForegroundEvent("MUSIC", 6, 80);
        MUSIC = foregroundEvent7;
        ForegroundEvent foregroundEvent8 = new ForegroundEvent("SERVICES", 7, 75);
        SERVICES = foregroundEvent8;
        ForegroundEvent foregroundEvent9 = new ForegroundEvent(SignalingProtocol.MEDIA_OPTION_VIDEO, 8, 63);
        VIDEO = foregroundEvent9;
        ForegroundEvent foregroundEvent10 = new ForegroundEvent("SFERUM", 9, 78);
        SFERUM = foregroundEvent10;
        ForegroundEvent foregroundEvent11 = new ForegroundEvent("VIDEO_PLAYER", 10, 20);
        VIDEO_PLAYER = foregroundEvent11;
        ForegroundEvent foregroundEvent12 = new ForegroundEvent("CLIP_PLAYER_ANY", 11, 96);
        CLIP_PLAYER_ANY = foregroundEvent12;
        ForegroundEvent foregroundEvent13 = new ForegroundEvent("CLIP_PLAYER_FULLSCREEN", 12, 97);
        CLIP_PLAYER_FULLSCREEN = foregroundEvent13;
        ForegroundEvent[] foregroundEventArr = {foregroundEvent, foregroundEvent2, foregroundEvent3, foregroundEvent4, foregroundEvent5, foregroundEvent6, foregroundEvent7, foregroundEvent8, foregroundEvent9, foregroundEvent10, foregroundEvent11, foregroundEvent12, foregroundEvent13};
        $VALUES = foregroundEventArr;
        $ENTRIES = new asp(foregroundEventArr);
    }

    public ForegroundEvent(String str, int i, int i2) {
        this.id = i2;
    }

    public static ForegroundEvent valueOf(String str) {
        return (ForegroundEvent) Enum.valueOf(ForegroundEvent.class, str);
    }

    public static ForegroundEvent[] values() {
        return (ForegroundEvent[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
