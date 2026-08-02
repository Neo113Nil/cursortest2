package com.vk.im.engine.models;

import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongPollType.kt */
/* loaded from: classes.dex */
public final class LongPollType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LongPollType[] $VALUES;
    public static final LongPollType CHANNELS;
    public static final LongPollType MESSAGES;
    private final String statKey;

    static {
        LongPollType longPollType = new LongPollType("MESSAGES", 0, "messages");
        MESSAGES = longPollType;
        LongPollType longPollType2 = new LongPollType("CHANNELS", 1, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = longPollType2;
        LongPollType[] longPollTypeArr = {longPollType, longPollType2};
        $VALUES = longPollTypeArr;
        $ENTRIES = new asp(longPollTypeArr);
    }

    public LongPollType(String str, int i, String str2) {
        this.statKey = str2;
    }

    public static LongPollType valueOf(String str) {
        return (LongPollType) Enum.valueOf(LongPollType.class, str);
    }

    public static LongPollType[] values() {
        return (LongPollType[]) $VALUES.clone();
    }

    public final String h() {
        return this.statKey;
    }
}
