package com.braze.triggers.events;

import com.braze.models.k;
import com.braze.models.outgoing.BrazeProperties;

/* loaded from: classes6.dex */
public final class a extends j {
    public final String f;

    public a(String str, BrazeProperties brazeProperties, k kVar) {
        super(brazeProperties, kVar);
        this.f = str;
    }

    @Override // com.braze.triggers.events.b
    public final String a() {
        return "custom_event";
    }
}
