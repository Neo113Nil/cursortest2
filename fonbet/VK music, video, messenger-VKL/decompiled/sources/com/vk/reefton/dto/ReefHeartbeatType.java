package com.vk.reefton.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReefHeartbeatType.kt */
/* loaded from: classes5.dex */
public final class ReefHeartbeatType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReefHeartbeatType[] $VALUES;
    public static final ReefHeartbeatType APP;
    public static final ReefHeartbeatType PLAYER;

    static {
        ReefHeartbeatType reefHeartbeatType = new ReefHeartbeatType("PLAYER", 0);
        PLAYER = reefHeartbeatType;
        ReefHeartbeatType reefHeartbeatType2 = new ReefHeartbeatType("APP", 1);
        APP = reefHeartbeatType2;
        ReefHeartbeatType[] reefHeartbeatTypeArr = {reefHeartbeatType, reefHeartbeatType2};
        $VALUES = reefHeartbeatTypeArr;
        $ENTRIES = new asp(reefHeartbeatTypeArr);
    }

    public ReefHeartbeatType() {
        throw null;
    }

    public static ReefHeartbeatType valueOf(String str) {
        return (ReefHeartbeatType) Enum.valueOf(ReefHeartbeatType.class, str);
    }

    public static ReefHeartbeatType[] values() {
        return (ReefHeartbeatType[]) $VALUES.clone();
    }
}
