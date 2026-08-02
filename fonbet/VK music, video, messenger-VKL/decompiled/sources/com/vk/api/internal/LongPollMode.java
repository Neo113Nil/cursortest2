package com.vk.api.internal;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongPollMode.kt */
/* loaded from: classes15.dex */
public final class LongPollMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LongPollMode[] $VALUES;
    public static final LongPollMode ATTACH_INFO;
    public static final LongPollMode EXTENDED;
    public static final LongPollMode ONLINE_PLATFORM;
    public static final LongPollMode PTS;
    public static final LongPollMode RANDOM_ID;
    public static final LongPollMode RECEIVE_BUSINESS_NOTIFY;
    private final int id;

    static {
        LongPollMode longPollMode = new LongPollMode("ATTACH_INFO", 0, 2);
        ATTACH_INFO = longPollMode;
        LongPollMode longPollMode2 = new LongPollMode("EXTENDED", 1, 8);
        EXTENDED = longPollMode2;
        LongPollMode longPollMode3 = new LongPollMode("PTS", 2, 32);
        PTS = longPollMode3;
        LongPollMode longPollMode4 = new LongPollMode("ONLINE_PLATFORM", 3, 64);
        ONLINE_PLATFORM = longPollMode4;
        LongPollMode longPollMode5 = new LongPollMode("RANDOM_ID", 4, 128);
        RANDOM_ID = longPollMode5;
        LongPollMode longPollMode6 = new LongPollMode("RECEIVE_BUSINESS_NOTIFY", 5, 512);
        RECEIVE_BUSINESS_NOTIFY = longPollMode6;
        LongPollMode[] longPollModeArr = {longPollMode, longPollMode2, longPollMode3, longPollMode4, longPollMode5, longPollMode6};
        $VALUES = longPollModeArr;
        $ENTRIES = new asp(longPollModeArr);
    }

    public LongPollMode(String str, int i, int i2) {
        this.id = i2;
    }

    public static LongPollMode valueOf(String str) {
        return (LongPollMode) Enum.valueOf(LongPollMode.class, str);
    }

    public static LongPollMode[] values() {
        return (LongPollMode[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
