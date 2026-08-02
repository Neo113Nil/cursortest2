package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$AppsAdsSkippedReasonItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStat$AppsAdsSkippedReasonItem[] $VALUES;

    @pmi0("network_error")
    public static final SchemeStat$AppsAdsSkippedReasonItem NETWORK_ERROR;

    @pmi0("network_no_ad")
    public static final SchemeStat$AppsAdsSkippedReasonItem NETWORK_NO_AD;

    @pmi0("timeout")
    public static final SchemeStat$AppsAdsSkippedReasonItem TIMEOUT;

    static {
        SchemeStat$AppsAdsSkippedReasonItem schemeStat$AppsAdsSkippedReasonItem = new SchemeStat$AppsAdsSkippedReasonItem("TIMEOUT", 0);
        TIMEOUT = schemeStat$AppsAdsSkippedReasonItem;
        SchemeStat$AppsAdsSkippedReasonItem schemeStat$AppsAdsSkippedReasonItem2 = new SchemeStat$AppsAdsSkippedReasonItem("NETWORK_NO_AD", 1);
        NETWORK_NO_AD = schemeStat$AppsAdsSkippedReasonItem2;
        SchemeStat$AppsAdsSkippedReasonItem schemeStat$AppsAdsSkippedReasonItem3 = new SchemeStat$AppsAdsSkippedReasonItem("NETWORK_ERROR", 2);
        NETWORK_ERROR = schemeStat$AppsAdsSkippedReasonItem3;
        SchemeStat$AppsAdsSkippedReasonItem[] schemeStat$AppsAdsSkippedReasonItemArr = {schemeStat$AppsAdsSkippedReasonItem, schemeStat$AppsAdsSkippedReasonItem2, schemeStat$AppsAdsSkippedReasonItem3};
        $VALUES = schemeStat$AppsAdsSkippedReasonItemArr;
        $ENTRIES = new asp(schemeStat$AppsAdsSkippedReasonItemArr);
    }

    private SchemeStat$AppsAdsSkippedReasonItem(String str, int i) {
    }

    public static SchemeStat$AppsAdsSkippedReasonItem valueOf(String str) {
        return (SchemeStat$AppsAdsSkippedReasonItem) Enum.valueOf(SchemeStat$AppsAdsSkippedReasonItem.class, str);
    }

    public static SchemeStat$AppsAdsSkippedReasonItem[] values() {
        return (SchemeStat$AppsAdsSkippedReasonItem[]) $VALUES.clone();
    }
}
