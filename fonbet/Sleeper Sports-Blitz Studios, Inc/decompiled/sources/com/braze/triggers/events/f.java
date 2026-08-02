package com.braze.triggers.events;

import com.braze.models.k;
import com.braze.models.outgoing.BrazeProperties;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class f extends j {
    public final String f;

    public f(String str, BrazeProperties brazeProperties, k kVar) {
        super(brazeProperties, kVar);
        this.f = str;
    }

    @Override // com.braze.triggers.events.b
    public final String a() {
        return FirebaseAnalytics.Event.PURCHASE;
    }
}
