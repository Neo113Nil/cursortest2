package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import defpackage.pap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class AdsRequestImpl$AutoPlayState {
    private static final /* synthetic */ AdsRequestImpl$AutoPlayState[] $VALUES;

    @NonNull
    @pap(zza = "auto")
    public static final AdsRequestImpl$AutoPlayState AUTO;

    @NonNull
    @pap(zza = "click")
    public static final AdsRequestImpl$AutoPlayState CLICK;

    @NonNull
    @pap(zza = "unknown")
    public static final AdsRequestImpl$AutoPlayState UNKNOWN;

    static {
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState = new AdsRequestImpl$AutoPlayState("AUTO", 0);
        AUTO = adsRequestImpl$AutoPlayState;
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState2 = new AdsRequestImpl$AutoPlayState("CLICK", 1);
        CLICK = adsRequestImpl$AutoPlayState2;
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState3 = new AdsRequestImpl$AutoPlayState("UNKNOWN", 2);
        UNKNOWN = adsRequestImpl$AutoPlayState3;
        $VALUES = new AdsRequestImpl$AutoPlayState[]{adsRequestImpl$AutoPlayState, adsRequestImpl$AutoPlayState2, adsRequestImpl$AutoPlayState3};
    }

    @NonNull
    public static AdsRequestImpl$AutoPlayState[] values() {
        return (AdsRequestImpl$AutoPlayState[]) $VALUES.clone();
    }
}
