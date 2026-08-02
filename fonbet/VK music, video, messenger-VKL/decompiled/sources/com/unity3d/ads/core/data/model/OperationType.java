package com.unity3d.ads.core.data.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OperationType.kt */
/* loaded from: classes14.dex */
public final class OperationType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OperationType[] $VALUES;
    public static final OperationType UNKNOWN = new OperationType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
    public static final OperationType INITIALIZATION = new OperationType("INITIALIZATION", 1);
    public static final OperationType LOAD = new OperationType("LOAD", 2);
    public static final OperationType LOAD_HEADER_BIDDING = new OperationType("LOAD_HEADER_BIDDING", 3);
    public static final OperationType SHOW = new OperationType("SHOW", 4);
    public static final OperationType REFRESH = new OperationType("REFRESH", 5);
    public static final OperationType PRIVACY_UPDATE = new OperationType("PRIVACY_UPDATE", 6);
    public static final OperationType INITIALIZATION_COMPLETED = new OperationType("INITIALIZATION_COMPLETED", 7);
    public static final OperationType TRANSACTION_EVENT = new OperationType("TRANSACTION_EVENT", 8);
    public static final OperationType AD_REVENUE_EVENT = new OperationType("AD_REVENUE_EVENT", 9);
    public static final OperationType LIFECYCLE_EVENT = new OperationType("LIFECYCLE_EVENT", 10);
    public static final OperationType GET_TOKEN = new OperationType("GET_TOKEN", 11);
    public static final OperationType DIAGNOSTIC_EVENT = new OperationType("DIAGNOSTIC_EVENT", 12);
    public static final OperationType OPERATIVE_EVENT = new OperationType("OPERATIVE_EVENT", 13);
    public static final OperationType UNIVERSAL_EVENT = new OperationType("UNIVERSAL_EVENT", 14);

    private static final /* synthetic */ OperationType[] $values() {
        return new OperationType[]{UNKNOWN, INITIALIZATION, LOAD, LOAD_HEADER_BIDDING, SHOW, REFRESH, PRIVACY_UPDATE, INITIALIZATION_COMPLETED, TRANSACTION_EVENT, AD_REVENUE_EVENT, LIFECYCLE_EVENT, GET_TOKEN, DIAGNOSTIC_EVENT, OPERATIVE_EVENT, UNIVERSAL_EVENT};
    }

    static {
        OperationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private OperationType(String str, int i) {
    }

    public static zrp<OperationType> getEntries() {
        return $ENTRIES;
    }

    public static OperationType valueOf(String str) {
        return (OperationType) Enum.valueOf(OperationType.class, str);
    }

    public static OperationType[] values() {
        return (OperationType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
