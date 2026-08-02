package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import defpackage.pap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class AdsRequestImpl$MutePlayState {
    private static final /* synthetic */ AdsRequestImpl$MutePlayState[] $VALUES;

    @NonNull
    @pap(zza = "muted")
    public static final AdsRequestImpl$MutePlayState MUTED;

    @NonNull
    @pap(zza = "unknown")
    public static final AdsRequestImpl$MutePlayState UNKNOWN;

    @NonNull
    @pap(zza = "unmuted")
    public static final AdsRequestImpl$MutePlayState UNMUTED;

    static {
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState = new AdsRequestImpl$MutePlayState("MUTED", 0);
        MUTED = adsRequestImpl$MutePlayState;
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState2 = new AdsRequestImpl$MutePlayState("UNKNOWN", 1);
        UNKNOWN = adsRequestImpl$MutePlayState2;
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState3 = new AdsRequestImpl$MutePlayState("UNMUTED", 2);
        UNMUTED = adsRequestImpl$MutePlayState3;
        $VALUES = new AdsRequestImpl$MutePlayState[]{adsRequestImpl$MutePlayState, adsRequestImpl$MutePlayState2, adsRequestImpl$MutePlayState3};
    }

    @NonNull
    public static AdsRequestImpl$MutePlayState[] values() {
        return (AdsRequestImpl$MutePlayState[]) $VALUES.clone();
    }
}
