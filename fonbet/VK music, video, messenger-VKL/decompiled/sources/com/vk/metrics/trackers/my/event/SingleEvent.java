package com.vk.metrics.trackers.my.event;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SingleEvent.kt */
/* loaded from: classes.dex */
public final class SingleEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SingleEvent[] $VALUES;
    public static final SingleEvent CLIPS;
    public static final SingleEvent CLIP_UPLOAD;
    public static final SingleEvent CLIP_USER_BECAME_ACTIVE;
    public static final SingleEvent CLIP_VIEW;
    public static final SingleEvent COMMUNITY_JOIN;
    public static final SingleEvent CONTACTS_SYNCED;
    public static final SingleEvent FEED;
    public static final SingleEvent FEED_DZEN_BLOCK;
    public static final SingleEvent MESSAGE_SENT_EVENT;
    public static final SingleEvent MUSIC_AUDIOBOOK_30S;
    public static final SingleEvent MUSIC_AUDIO_30S;
    public static final SingleEvent MUSIC_PODCAST_30S;
    public static final SingleEvent MUSIC_RADIO_30S;
    public static final SingleEvent MUSIC_SNIPPET_30S;
    public static final SingleEvent POST;
    public static final SingleEvent PUSHES_ENABLED;
    public static final SingleEvent VOIP_CALL_WITH_CAMERA;
    public static final SingleEvent VOIP_GROUP_CALL;
    public static final SingleEvent VOIP_ONE_TO_ONE_CALL;
    private final int id;

    static {
        SingleEvent singleEvent = new SingleEvent("FEED", 0, 6);
        FEED = singleEvent;
        SingleEvent singleEvent2 = new SingleEvent("FEED_DZEN_BLOCK", 1, 82);
        FEED_DZEN_BLOCK = singleEvent2;
        SingleEvent singleEvent3 = new SingleEvent("VOIP_ONE_TO_ONE_CALL", 2, 22);
        VOIP_ONE_TO_ONE_CALL = singleEvent3;
        SingleEvent singleEvent4 = new SingleEvent("VOIP_GROUP_CALL", 3, 23);
        VOIP_GROUP_CALL = singleEvent4;
        SingleEvent singleEvent5 = new SingleEvent("VOIP_CALL_WITH_CAMERA", 4, 24);
        VOIP_CALL_WITH_CAMERA = singleEvent5;
        SingleEvent singleEvent6 = new SingleEvent("MESSAGE_SENT_EVENT", 5, 26);
        MESSAGE_SENT_EVENT = singleEvent6;
        SingleEvent singleEvent7 = new SingleEvent("POST", 6, 13);
        POST = singleEvent7;
        SingleEvent singleEvent8 = new SingleEvent("MUSIC_AUDIO_30S", 7, 2);
        MUSIC_AUDIO_30S = singleEvent8;
        SingleEvent singleEvent9 = new SingleEvent("MUSIC_PODCAST_30S", 8, 92);
        MUSIC_PODCAST_30S = singleEvent9;
        SingleEvent singleEvent10 = new SingleEvent("MUSIC_AUDIOBOOK_30S", 9, 93);
        MUSIC_AUDIOBOOK_30S = singleEvent10;
        SingleEvent singleEvent11 = new SingleEvent("MUSIC_RADIO_30S", 10, 94);
        MUSIC_RADIO_30S = singleEvent11;
        SingleEvent singleEvent12 = new SingleEvent("MUSIC_SNIPPET_30S", 11, 95);
        MUSIC_SNIPPET_30S = singleEvent12;
        SingleEvent singleEvent13 = new SingleEvent("CLIP_USER_BECAME_ACTIVE", 12, 4);
        CLIP_USER_BECAME_ACTIVE = singleEvent13;
        SingleEvent singleEvent14 = new SingleEvent("CLIP_VIEW", 13, 18);
        CLIP_VIEW = singleEvent14;
        SingleEvent singleEvent15 = new SingleEvent("CLIP_UPLOAD", 14, 19);
        CLIP_UPLOAD = singleEvent15;
        SingleEvent singleEvent16 = new SingleEvent("CLIPS", 15, 19);
        CLIPS = singleEvent16;
        SingleEvent singleEvent17 = new SingleEvent("COMMUNITY_JOIN", 16, 11);
        COMMUNITY_JOIN = singleEvent17;
        SingleEvent singleEvent18 = new SingleEvent("PUSHES_ENABLED", 17, 100);
        PUSHES_ENABLED = singleEvent18;
        SingleEvent singleEvent19 = new SingleEvent("CONTACTS_SYNCED", 18, 101);
        CONTACTS_SYNCED = singleEvent19;
        SingleEvent[] singleEventArr = {singleEvent, singleEvent2, singleEvent3, singleEvent4, singleEvent5, singleEvent6, singleEvent7, singleEvent8, singleEvent9, singleEvent10, singleEvent11, singleEvent12, singleEvent13, singleEvent14, singleEvent15, singleEvent16, singleEvent17, singleEvent18, singleEvent19};
        $VALUES = singleEventArr;
        $ENTRIES = new asp(singleEventArr);
    }

    public SingleEvent(String str, int i, int i2) {
        this.id = i2;
    }

    public static SingleEvent valueOf(String str) {
        return (SingleEvent) Enum.valueOf(SingleEvent.class, str);
    }

    public static SingleEvent[] values() {
        return (SingleEvent[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
