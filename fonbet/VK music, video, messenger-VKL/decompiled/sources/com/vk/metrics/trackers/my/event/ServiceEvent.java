package com.vk.metrics.trackers.my.event;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServiceEvent.kt */
/* loaded from: classes3.dex */
public final class ServiceEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ServiceEvent[] $VALUES;
    public static final ServiceEvent MUSIC_PLAYER_AUDIO;
    public static final ServiceEvent MUSIC_PLAYER_AUDIOBOOK;
    public static final ServiceEvent MUSIC_PLAYER_PODCAST;
    public static final ServiceEvent MUSIC_PLAYER_RADIO;
    public static final ServiceEvent MUSIC_PLAYER_SNIPPET;
    public static final ServiceEvent VIDEO_PLAYER_30S;
    public static final ServiceEvent VOIP_ACTIVE_CALL;
    private final int id;

    static {
        ServiceEvent serviceEvent = new ServiceEvent("MUSIC_PLAYER_AUDIO", 0, 85);
        MUSIC_PLAYER_AUDIO = serviceEvent;
        ServiceEvent serviceEvent2 = new ServiceEvent("MUSIC_PLAYER_SNIPPET", 1, 86);
        MUSIC_PLAYER_SNIPPET = serviceEvent2;
        ServiceEvent serviceEvent3 = new ServiceEvent("MUSIC_PLAYER_AUDIOBOOK", 2, 87);
        MUSIC_PLAYER_AUDIOBOOK = serviceEvent3;
        ServiceEvent serviceEvent4 = new ServiceEvent("MUSIC_PLAYER_PODCAST", 3, 88);
        MUSIC_PLAYER_PODCAST = serviceEvent4;
        ServiceEvent serviceEvent5 = new ServiceEvent("MUSIC_PLAYER_RADIO", 4, 89);
        MUSIC_PLAYER_RADIO = serviceEvent5;
        ServiceEvent serviceEvent6 = new ServiceEvent("VOIP_ACTIVE_CALL", 5, 21);
        VOIP_ACTIVE_CALL = serviceEvent6;
        ServiceEvent serviceEvent7 = new ServiceEvent("VIDEO_PLAYER_30S", 6, 77);
        VIDEO_PLAYER_30S = serviceEvent7;
        ServiceEvent[] serviceEventArr = {serviceEvent, serviceEvent2, serviceEvent3, serviceEvent4, serviceEvent5, serviceEvent6, serviceEvent7};
        $VALUES = serviceEventArr;
        $ENTRIES = new asp(serviceEventArr);
    }

    public ServiceEvent(String str, int i, int i2) {
        this.id = i2;
    }

    public static ServiceEvent valueOf(String str) {
        return (ServiceEvent) Enum.valueOf(ServiceEvent.class, str);
    }

    public static ServiceEvent[] values() {
        return (ServiceEvent[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
