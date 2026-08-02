package com.vk.video.polls.entrypoint.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UxPollType.kt */
/* loaded from: classes6.dex */
public final class UxPollType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UxPollType[] $VALUES;
    public static final UxPollType DiscoveryPoll;
    public static final UxPollType RecommendationsPoll;

    static {
        UxPollType uxPollType = new UxPollType("DiscoveryPoll", 0);
        DiscoveryPoll = uxPollType;
        UxPollType uxPollType2 = new UxPollType("RecommendationsPoll", 1);
        RecommendationsPoll = uxPollType2;
        UxPollType[] uxPollTypeArr = {uxPollType, uxPollType2};
        $VALUES = uxPollTypeArr;
        $ENTRIES = new asp(uxPollTypeArr);
    }

    public UxPollType() {
        throw null;
    }

    public static UxPollType valueOf(String str) {
        return (UxPollType) Enum.valueOf(UxPollType.class, str);
    }

    public static UxPollType[] values() {
        return (UxPollType[]) $VALUES.clone();
    }
}
