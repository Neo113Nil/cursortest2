package com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model;

import xsna.pmi0;
import xsna.zcl;

/* compiled from: BillingEvent.kt */
/* loaded from: classes18.dex */
public final class ActionParams {

    @pmi0("status")
    private final ActionParamsStatus status;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final ActionParamsStatus a() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionParams) && this.status == ((ActionParams) obj).status;
    }

    public final int hashCode() {
        return this.status.hashCode();
    }

    public final String toString() {
        return "ActionParams(status=" + this.status + ')';
    }

    public ActionParams(ActionParamsStatus actionParamsStatus) {
        this.status = actionParamsStatus;
    }

    public /* synthetic */ ActionParams(ActionParamsStatus actionParamsStatus, int i, zcl zclVar) {
        this((i & 1) != 0 ? ActionParamsStatus.UNKNOWN : actionParamsStatus);
    }
}
