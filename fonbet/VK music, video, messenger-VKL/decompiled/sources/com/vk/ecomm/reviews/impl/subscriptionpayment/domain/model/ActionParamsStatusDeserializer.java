package com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import xsna.a9y;
import xsna.b9y;
import xsna.z8y;

/* compiled from: BillingEvent.kt */
/* loaded from: classes18.dex */
public final class ActionParamsStatusDeserializer implements a9y<ActionParamsStatus> {
    @Override // xsna.a9y
    public final Object a(b9y b9yVar, z8y z8yVar) {
        try {
            ActionParamsStatus actionParamsStatus = (ActionParamsStatus) new Gson().fromJson(b9yVar, ActionParamsStatus.class);
            return actionParamsStatus == null ? ActionParamsStatus.UNKNOWN : actionParamsStatus;
        } catch (JsonParseException unused) {
            return ActionParamsStatus.UNKNOWN;
        }
    }
}
