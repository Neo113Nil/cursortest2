package com.vk.reefton.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReefRequestReason.kt */
/* loaded from: classes5.dex */
public final class ReefRequestReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReefRequestReason[] $VALUES;
    public static final ReefRequestReason APP_BACKGROUND;
    public static final ReefRequestReason APP_WAKEUP;
    public static final ReefRequestReason AUDIO_FRAGMENT_LOADED;
    public static final ReefRequestReason AUDIO_FRAGMENT_STALLED;
    public static final ReefRequestReason BITRATE_CHANGED_ACTUAL;
    public static final ReefRequestReason BITRATE_CHANGED_AUTOMATICALLY;
    public static final ReefRequestReason BITRATE_CHANGED_MANUALLY;
    public static final ReefRequestReason BUFFERING_ENDED;
    public static final ReefRequestReason BUFFERING_STARTED;
    public static final ReefRequestReason BUFFERING_UPDATED;
    public static final ReefRequestReason HEARTBEAT_APP;
    public static final ReefRequestReason HEARTBEAT_PLAYER;
    public static final ReefRequestReason IMAGES_IMAGE_LOADED;
    public static final ReefRequestReason NETWORK_CHANGED;
    public static final ReefRequestReason PLAYBACK_ERROR;
    public static final ReefRequestReason PLAYBACK_PAUSE;
    public static final ReefRequestReason PLAYBACK_RESUME;
    public static final ReefRequestReason PLAYBACK_SEEK_END;
    public static final ReefRequestReason PLAYBACK_SEEK_START;
    public static final ReefRequestReason PLAYBACK_START;
    public static final ReefRequestReason PLAYBACK_STOP;
    public static final ReefRequestReason REACHABILITY_CHANGED;
    public static final ReefRequestReason UNKNOWN;
    public static final ReefRequestReason UX_PLAYBACK_PLAY;

    static {
        ReefRequestReason reefRequestReason = new ReefRequestReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = reefRequestReason;
        ReefRequestReason reefRequestReason2 = new ReefRequestReason("NETWORK_CHANGED", 1);
        NETWORK_CHANGED = reefRequestReason2;
        ReefRequestReason reefRequestReason3 = new ReefRequestReason("REACHABILITY_CHANGED", 2);
        REACHABILITY_CHANGED = reefRequestReason3;
        ReefRequestReason reefRequestReason4 = new ReefRequestReason("HEARTBEAT_PLAYER", 3);
        HEARTBEAT_PLAYER = reefRequestReason4;
        ReefRequestReason reefRequestReason5 = new ReefRequestReason("HEARTBEAT_APP", 4);
        HEARTBEAT_APP = reefRequestReason5;
        ReefRequestReason reefRequestReason6 = new ReefRequestReason("PLAYBACK_STOP", 5);
        PLAYBACK_STOP = reefRequestReason6;
        ReefRequestReason reefRequestReason7 = new ReefRequestReason("PLAYBACK_START", 6);
        PLAYBACK_START = reefRequestReason7;
        ReefRequestReason reefRequestReason8 = new ReefRequestReason("PLAYBACK_ERROR", 7);
        PLAYBACK_ERROR = reefRequestReason8;
        ReefRequestReason reefRequestReason9 = new ReefRequestReason("PLAYBACK_PAUSE", 8);
        PLAYBACK_PAUSE = reefRequestReason9;
        ReefRequestReason reefRequestReason10 = new ReefRequestReason("PLAYBACK_RESUME", 9);
        PLAYBACK_RESUME = reefRequestReason10;
        ReefRequestReason reefRequestReason11 = new ReefRequestReason("BUFFERING_STARTED", 10);
        BUFFERING_STARTED = reefRequestReason11;
        ReefRequestReason reefRequestReason12 = new ReefRequestReason("BUFFERING_ENDED", 11);
        BUFFERING_ENDED = reefRequestReason12;
        ReefRequestReason reefRequestReason13 = new ReefRequestReason("BUFFERING_UPDATED", 12);
        BUFFERING_UPDATED = reefRequestReason13;
        ReefRequestReason reefRequestReason14 = new ReefRequestReason("BITRATE_CHANGED_MANUALLY", 13);
        BITRATE_CHANGED_MANUALLY = reefRequestReason14;
        ReefRequestReason reefRequestReason15 = new ReefRequestReason("BITRATE_CHANGED_AUTOMATICALLY", 14);
        BITRATE_CHANGED_AUTOMATICALLY = reefRequestReason15;
        ReefRequestReason reefRequestReason16 = new ReefRequestReason("BITRATE_CHANGED_ACTUAL", 15);
        BITRATE_CHANGED_ACTUAL = reefRequestReason16;
        ReefRequestReason reefRequestReason17 = new ReefRequestReason("PLAYBACK_SEEK_START", 16);
        PLAYBACK_SEEK_START = reefRequestReason17;
        ReefRequestReason reefRequestReason18 = new ReefRequestReason("PLAYBACK_SEEK_END", 17);
        PLAYBACK_SEEK_END = reefRequestReason18;
        ReefRequestReason reefRequestReason19 = new ReefRequestReason("UX_PLAYBACK_PLAY", 18);
        UX_PLAYBACK_PLAY = reefRequestReason19;
        ReefRequestReason reefRequestReason20 = new ReefRequestReason("APP_WAKEUP", 19);
        APP_WAKEUP = reefRequestReason20;
        ReefRequestReason reefRequestReason21 = new ReefRequestReason("APP_BACKGROUND", 20);
        APP_BACKGROUND = reefRequestReason21;
        ReefRequestReason reefRequestReason22 = new ReefRequestReason("AUDIO_FRAGMENT_LOADED", 21);
        AUDIO_FRAGMENT_LOADED = reefRequestReason22;
        ReefRequestReason reefRequestReason23 = new ReefRequestReason("AUDIO_FRAGMENT_STALLED", 22);
        AUDIO_FRAGMENT_STALLED = reefRequestReason23;
        ReefRequestReason reefRequestReason24 = new ReefRequestReason("IMAGES_IMAGE_LOADED", 23);
        IMAGES_IMAGE_LOADED = reefRequestReason24;
        ReefRequestReason[] reefRequestReasonArr = {reefRequestReason, reefRequestReason2, reefRequestReason3, reefRequestReason4, reefRequestReason5, reefRequestReason6, reefRequestReason7, reefRequestReason8, reefRequestReason9, reefRequestReason10, reefRequestReason11, reefRequestReason12, reefRequestReason13, reefRequestReason14, reefRequestReason15, reefRequestReason16, reefRequestReason17, reefRequestReason18, reefRequestReason19, reefRequestReason20, reefRequestReason21, reefRequestReason22, reefRequestReason23, reefRequestReason24};
        $VALUES = reefRequestReasonArr;
        $ENTRIES = new asp(reefRequestReasonArr);
    }

    public ReefRequestReason() {
        throw null;
    }

    public static ReefRequestReason valueOf(String str) {
        return (ReefRequestReason) Enum.valueOf(ReefRequestReason.class, str);
    }

    public static ReefRequestReason[] values() {
        return (ReefRequestReason[]) $VALUES.clone();
    }
}
