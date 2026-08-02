package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AddToCommunity.kt */
/* loaded from: classes6.dex */
public final class AddToCommunity$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AddToCommunity$Parameters(String str) {
        this.requestId = str;
    }

    public static final AddToCommunity$Parameters a(AddToCommunity$Parameters addToCommunity$Parameters) {
        return addToCommunity$Parameters.requestId == null ? new AddToCommunity$Parameters("default_request_id") : addToCommunity$Parameters;
    }

    public static final void b(AddToCommunity$Parameters addToCommunity$Parameters) {
        if (addToCommunity$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddToCommunity$Parameters) && epx.f(this.requestId, ((AddToCommunity$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
