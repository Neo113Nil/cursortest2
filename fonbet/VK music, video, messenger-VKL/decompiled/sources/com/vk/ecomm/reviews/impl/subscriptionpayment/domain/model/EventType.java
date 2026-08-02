package com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BillingEvent.kt */
/* loaded from: classes18.dex */
public final class EventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;

    @pmi0("billing")
    public static final EventType BILLING;
    public static final EventType UNKNOWN;

    static {
        EventType eventType = new EventType("BILLING", 0);
        BILLING = eventType;
        EventType eventType2 = new EventType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
        UNKNOWN = eventType2;
        EventType[] eventTypeArr = {eventType, eventType2};
        $VALUES = eventTypeArr;
        $ENTRIES = new asp(eventTypeArr);
    }

    private EventType(String str, int i) {
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }
}
