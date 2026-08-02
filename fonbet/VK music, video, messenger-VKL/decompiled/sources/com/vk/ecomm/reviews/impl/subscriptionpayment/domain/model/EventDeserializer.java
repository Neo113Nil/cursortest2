package com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import xsna.a9y;
import xsna.b9y;
import xsna.z8y;

/* compiled from: BillingEvent.kt */
/* loaded from: classes18.dex */
public final class EventDeserializer implements a9y<EventType> {
    @Override // xsna.a9y
    public final Object a(b9y b9yVar, z8y z8yVar) {
        try {
            EventType eventType = (EventType) new Gson().fromJson(b9yVar, EventType.class);
            return eventType == null ? EventType.UNKNOWN : eventType;
        } catch (JsonParseException unused) {
            return EventType.UNKNOWN;
        }
    }
}
