package com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.api.core.ApiUris;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BillingEvent.kt */
/* loaded from: classes18.dex */
public final class ActionParamsStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionParamsStatus[] $VALUES;

    @pmi0("cancel")
    public static final ActionParamsStatus CANCEL;

    @pmi0("error")
    public static final ActionParamsStatus ERROR;

    @pmi0(ApiUris.SCHEME_OK)
    public static final ActionParamsStatus OK;

    @pmi0("timeout")
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

    private ActionParamsStatus(String str, int i) {
    }

    public static ActionParamsStatus valueOf(String str) {
        return (ActionParamsStatus) Enum.valueOf(ActionParamsStatus.class, str);
    }

    public static ActionParamsStatus[] values() {
        return (ActionParamsStatus[]) $VALUES.clone();
    }
}
