package com.vk.music.player.analytics.impl.tracker.timespent;

import com.vk.metrics.trackers.my.event.ServiceEvent;
import com.vk.metrics.trackers.my.event.SingleEvent;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicTimespentEventType.kt */
/* loaded from: classes3.dex */
public final class MusicTimespentEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicTimespentEventType[] $VALUES;
    public static final MusicTimespentEventType AUDIO;
    public static final MusicTimespentEventType AUDIOBOOK;
    public static final a Companion;
    public static final MusicTimespentEventType PODCAST;
    public static final MusicTimespentEventType RADIO;
    public static final MusicTimespentEventType SNIPPET;
    private final ServiceEvent serviceEvent;
    private final SingleEvent singleEvent;

    /* compiled from: MusicTimespentEventType.kt */
    public static final class a {
    }

    static {
        MusicTimespentEventType musicTimespentEventType = new MusicTimespentEventType(SignalingProtocol.MEDIA_OPTION_AUDIO, 0, ServiceEvent.MUSIC_PLAYER_AUDIO, SingleEvent.MUSIC_AUDIO_30S);
        AUDIO = musicTimespentEventType;
        MusicTimespentEventType musicTimespentEventType2 = new MusicTimespentEventType("PODCAST", 1, ServiceEvent.MUSIC_PLAYER_PODCAST, SingleEvent.MUSIC_PODCAST_30S);
        PODCAST = musicTimespentEventType2;
        MusicTimespentEventType musicTimespentEventType3 = new MusicTimespentEventType("AUDIOBOOK", 2, ServiceEvent.MUSIC_PLAYER_AUDIOBOOK, SingleEvent.MUSIC_AUDIOBOOK_30S);
        AUDIOBOOK = musicTimespentEventType3;
        MusicTimespentEventType musicTimespentEventType4 = new MusicTimespentEventType("RADIO", 3, ServiceEvent.MUSIC_PLAYER_RADIO, SingleEvent.MUSIC_RADIO_30S);
        RADIO = musicTimespentEventType4;
        MusicTimespentEventType musicTimespentEventType5 = new MusicTimespentEventType("SNIPPET", 4, ServiceEvent.MUSIC_PLAYER_SNIPPET, SingleEvent.MUSIC_SNIPPET_30S);
        SNIPPET = musicTimespentEventType5;
        MusicTimespentEventType[] musicTimespentEventTypeArr = {musicTimespentEventType, musicTimespentEventType2, musicTimespentEventType3, musicTimespentEventType4, musicTimespentEventType5};
        $VALUES = musicTimespentEventTypeArr;
        $ENTRIES = new asp(musicTimespentEventTypeArr);
        Companion = new a();
    }

    public MusicTimespentEventType(String str, int i, ServiceEvent serviceEvent, SingleEvent singleEvent) {
        this.serviceEvent = serviceEvent;
        this.singleEvent = singleEvent;
    }

    public static MusicTimespentEventType valueOf(String str) {
        return (MusicTimespentEventType) Enum.valueOf(MusicTimespentEventType.class, str);
    }

    public static MusicTimespentEventType[] values() {
        return (MusicTimespentEventType[]) $VALUES.clone();
    }

    public final ServiceEvent h() {
        return this.serviceEvent;
    }

    public final SingleEvent i() {
        return this.singleEvent;
    }
}
