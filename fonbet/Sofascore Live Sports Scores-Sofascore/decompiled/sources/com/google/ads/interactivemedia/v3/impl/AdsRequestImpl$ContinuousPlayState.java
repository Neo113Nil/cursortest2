package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import defpackage.pap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class AdsRequestImpl$ContinuousPlayState {
    private static final /* synthetic */ AdsRequestImpl$ContinuousPlayState[] $VALUES;

    @NonNull
    @pap(zza = "1")
    public static final AdsRequestImpl$ContinuousPlayState OFF;

    @NonNull
    @pap(zza = "2")
    public static final AdsRequestImpl$ContinuousPlayState ON;

    @NonNull
    @pap(zza = "0")
    public static final AdsRequestImpl$ContinuousPlayState UNKNOWN;

    static {
        AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState = new AdsRequestImpl$ContinuousPlayState("OFF", 0);
        OFF = adsRequestImpl$ContinuousPlayState;
        AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState2 = new AdsRequestImpl$ContinuousPlayState("ON", 1);
        ON = adsRequestImpl$ContinuousPlayState2;
        AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState3 = new AdsRequestImpl$ContinuousPlayState("UNKNOWN", 2);
        UNKNOWN = adsRequestImpl$ContinuousPlayState3;
        $VALUES = new AdsRequestImpl$ContinuousPlayState[]{adsRequestImpl$ContinuousPlayState, adsRequestImpl$ContinuousPlayState2, adsRequestImpl$ContinuousPlayState3};
    }

    @NonNull
    public static AdsRequestImpl$ContinuousPlayState[] values() {
        return (AdsRequestImpl$ContinuousPlayState[]) $VALUES.clone();
    }
}
