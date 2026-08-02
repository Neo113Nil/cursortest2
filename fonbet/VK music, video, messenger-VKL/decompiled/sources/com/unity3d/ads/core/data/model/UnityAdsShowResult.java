package com.unity3d.ads.core.data.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnityAdsShowResult.kt */
/* loaded from: classes14.dex */
public final class UnityAdsShowResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UnityAdsShowResult[] $VALUES;
    public static final UnityAdsShowResult NOT_INITIALIZED = new UnityAdsShowResult("NOT_INITIALIZED", 0);
    public static final UnityAdsShowResult NOT_READY = new UnityAdsShowResult("NOT_READY", 1);
    public static final UnityAdsShowResult VIDEO_PLAYER_ERROR = new UnityAdsShowResult("VIDEO_PLAYER_ERROR", 2);
    public static final UnityAdsShowResult INVALID_ARGUMENT = new UnityAdsShowResult("INVALID_ARGUMENT", 3);
    public static final UnityAdsShowResult NO_CONNECTION = new UnityAdsShowResult("NO_CONNECTION", 4);
    public static final UnityAdsShowResult ALREADY_SHOWING = new UnityAdsShowResult("ALREADY_SHOWING", 5);
    public static final UnityAdsShowResult INTERNAL_ERROR = new UnityAdsShowResult("INTERNAL_ERROR", 6);
    public static final UnityAdsShowResult TIMEOUT = new UnityAdsShowResult("TIMEOUT", 7);
    public static final UnityAdsShowResult SUCCESS = new UnityAdsShowResult("SUCCESS", 8);
    public static final UnityAdsShowResult FAILURE = new UnityAdsShowResult("FAILURE", 9);

    private static final /* synthetic */ UnityAdsShowResult[] $values() {
        return new UnityAdsShowResult[]{NOT_INITIALIZED, NOT_READY, VIDEO_PLAYER_ERROR, INVALID_ARGUMENT, NO_CONNECTION, ALREADY_SHOWING, INTERNAL_ERROR, TIMEOUT, SUCCESS, FAILURE};
    }

    static {
        UnityAdsShowResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private UnityAdsShowResult(String str, int i) {
    }

    public static zrp<UnityAdsShowResult> getEntries() {
        return $ENTRIES;
    }

    public static UnityAdsShowResult valueOf(String str) {
        return (UnityAdsShowResult) Enum.valueOf(UnityAdsShowResult.class, str);
    }

    public static UnityAdsShowResult[] values() {
        return (UnityAdsShowResult[]) $VALUES.clone();
    }
}
