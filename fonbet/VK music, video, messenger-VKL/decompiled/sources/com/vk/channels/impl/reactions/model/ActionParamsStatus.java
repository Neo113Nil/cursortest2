package com.vk.channels.impl.reactions.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BillingEvent.kt */
/* loaded from: classes16.dex */
public final class ActionParamsStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionParamsStatus[] $VALUES;
    public static final ActionParamsStatus CANCEL;
    public static final ActionParamsStatus ERROR;
    public static final ActionParamsStatus OK;
    public static final ActionParamsStatus TIMEOUT;
    public static final ActionParamsStatus UNKNOWN;

    static {
        ActionParamsStatus actionParamsStatus = new ActionParamsStatus("OK", 0);
        OK = actionParamsStatus;
        ActionParamsStatus actionParamsStatus2 = new ActionParamsStatus("TIMEOUT", 1);
        TIMEOUT = actionParamsStatus2;
        ActionParamsStatus actionParamsStatus3 = new ActionParamsStatus("ERROR", 2);
        ERROR = actionParamsStatus3;
        ActionParamsStatus actionParamsStatus4 = new ActionParamsStatus("CANCEL", 3);
        CANCEL = actionParamsStatus4;
        ActionParamsStatus actionParamsStatus5 = new ActionParamsStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        UNKNOWN = actionParamsStatus5;
        ActionParamsStatus[] actionParamsStatusArr = {actionParamsStatus, actionParamsStatus2, actionParamsStatus3, actionParamsStatus4, actionParamsStatus5};
        $VALUES = actionParamsStatusArr;
        $ENTRIES = new asp(actionParamsStatusArr);
    }

    public ActionParamsStatus() {
        throw null;
    }

    public static ActionParamsStatus valueOf(String str) {
        return (ActionParamsStatus) Enum.valueOf(ActionParamsStatus.class, str);
    }

    public static ActionParamsStatus[] values() {
        return (ActionParamsStatus[]) $VALUES.clone();
    }
}
