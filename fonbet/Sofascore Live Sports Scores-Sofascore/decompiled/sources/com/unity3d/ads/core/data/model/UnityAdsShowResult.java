package com.unity3d.ads.core.data.model;

import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/model/UnityAdsShowResult;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "NOT_READY", "VIDEO_PLAYER_ERROR", "INVALID_ARGUMENT", "NO_CONNECTION", "ALREADY_SHOWING", "INTERNAL_ERROR", Payload.RESPONSE_TIMEOUT, "SUCCESS", "FAILURE", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnityAdsShowResult {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ UnityAdsShowResult[] $VALUES;
    public static final UnityAdsShowResult NOT_INITIALIZED = new UnityAdsShowResult("NOT_INITIALIZED", 0);
    public static final UnityAdsShowResult NOT_READY = new UnityAdsShowResult("NOT_READY", 1);
    public static final UnityAdsShowResult VIDEO_PLAYER_ERROR = new UnityAdsShowResult("VIDEO_PLAYER_ERROR", 2);
    public static final UnityAdsShowResult INVALID_ARGUMENT = new UnityAdsShowResult("INVALID_ARGUMENT", 3);
    public static final UnityAdsShowResult NO_CONNECTION = new UnityAdsShowResult("NO_CONNECTION", 4);
    public static final UnityAdsShowResult ALREADY_SHOWING = new UnityAdsShowResult("ALREADY_SHOWING", 5);
    public static final UnityAdsShowResult INTERNAL_ERROR = new UnityAdsShowResult("INTERNAL_ERROR", 6);
    public static final UnityAdsShowResult TIMEOUT = new UnityAdsShowResult(Payload.RESPONSE_TIMEOUT, 7);
    public static final UnityAdsShowResult SUCCESS = new UnityAdsShowResult("SUCCESS", 8);
    public static final UnityAdsShowResult FAILURE = new UnityAdsShowResult("FAILURE", 9);

    private static final /* synthetic */ UnityAdsShowResult[] $values() {
        return new UnityAdsShowResult[]{NOT_INITIALIZED, NOT_READY, VIDEO_PLAYER_ERROR, INVALID_ARGUMENT, NO_CONNECTION, ALREADY_SHOWING, INTERNAL_ERROR, TIMEOUT, SUCCESS, FAILURE};
    }

    static {
        UnityAdsShowResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private UnityAdsShowResult(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static UnityAdsShowResult valueOf(String str) {
        return (UnityAdsShowResult) Enum.valueOf(UnityAdsShowResult.class, str);
    }

    public static UnityAdsShowResult[] values() {
        return (UnityAdsShowResult[]) $VALUES.clone();
    }
}
