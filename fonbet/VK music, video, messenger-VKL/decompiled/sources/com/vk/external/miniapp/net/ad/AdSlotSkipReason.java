package com.vk.external.miniapp.net.ad;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdSlotSkipReason.kt */
/* loaded from: classes18.dex */
public final class AdSlotSkipReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdSlotSkipReason[] $VALUES;
    public static final AdSlotSkipReason NETWORK_ERROR;
    public static final AdSlotSkipReason NETWORK_NO_AD;
    public static final AdSlotSkipReason TIMEOUT;

    static {
        AdSlotSkipReason adSlotSkipReason = new AdSlotSkipReason("TIMEOUT", 0);
        TIMEOUT = adSlotSkipReason;
        AdSlotSkipReason adSlotSkipReason2 = new AdSlotSkipReason("NETWORK_NO_AD", 1);
        NETWORK_NO_AD = adSlotSkipReason2;
        AdSlotSkipReason adSlotSkipReason3 = new AdSlotSkipReason("NETWORK_ERROR", 2);
        NETWORK_ERROR = adSlotSkipReason3;
        AdSlotSkipReason[] adSlotSkipReasonArr = {adSlotSkipReason, adSlotSkipReason2, adSlotSkipReason3};
        $VALUES = adSlotSkipReasonArr;
        $ENTRIES = new asp(adSlotSkipReasonArr);
    }

    public AdSlotSkipReason() {
        throw null;
    }

    public static zrp<AdSlotSkipReason> h() {
        return $ENTRIES;
    }

    public static AdSlotSkipReason valueOf(String str) {
        return (AdSlotSkipReason) Enum.valueOf(AdSlotSkipReason.class, str);
    }

    public static AdSlotSkipReason[] values() {
        return (AdSlotSkipReason[]) $VALUES.clone();
    }
}
