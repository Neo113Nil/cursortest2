package com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BillingEvent.kt */
/* loaded from: classes18.dex */
public final class EventAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EventAction[] $VALUES;

    @pmi0("closeWindow")
    public static final EventAction CLOSE_WINDOW;

    @pmi0("payError")
    public static final EventAction ERROR;

    @pmi0("formLoad")
    public static final EventAction FORM_LOAD;

    @pmi0("openWindow")
    public static final EventAction OPEN_WINDOW;

    @pmi0("payFail")
    public static final EventAction PAY_FAIL;

    @pmi0("paySuccess")
    public static final EventAction PAY_SUCCESS;
    public static final EventAction UNKNOWN;

    static {
        EventAction eventAction = new EventAction("PAY_SUCCESS", 0);
        PAY_SUCCESS = eventAction;
        EventAction eventAction2 = new EventAction("OPEN_WINDOW", 1);
        OPEN_WINDOW = eventAction2;
        EventAction eventAction3 = new EventAction("FORM_LOAD", 2);
        FORM_LOAD = eventAction3;
        EventAction eventAction4 = new EventAction("PAY_FAIL", 3);
        PAY_FAIL = eventAction4;
        EventAction eventAction5 = new EventAction("CLOSE_WINDOW", 4);
        CLOSE_WINDOW = eventAction5;
        EventAction eventAction6 = new EventAction("ERROR", 5);
        ERROR = eventAction6;
        EventAction eventAction7 = new EventAction(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
        UNKNOWN = eventAction7;
        EventAction[] eventActionArr = {eventAction, eventAction2, eventAction3, eventAction4, eventAction5, eventAction6, eventAction7};
        $VALUES = eventActionArr;
        $ENTRIES = new asp(eventActionArr);
    }

    private EventAction(String str, int i) {
    }

    public static EventAction valueOf(String str) {
        return (EventAction) Enum.valueOf(EventAction.class, str);
    }

    public static EventAction[] values() {
        return (EventAction[]) $VALUES.clone();
    }
}
