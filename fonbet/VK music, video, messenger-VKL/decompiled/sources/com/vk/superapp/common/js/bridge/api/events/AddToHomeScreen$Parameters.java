package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AddToHomeScreen.kt */
/* loaded from: classes6.dex */
public final class AddToHomeScreen$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AddToHomeScreen$Parameters(String str) {
        this.requestId = str;
    }

    public static final AddToHomeScreen$Parameters a(AddToHomeScreen$Parameters addToHomeScreen$Parameters) {
        return addToHomeScreen$Parameters.requestId == null ? new AddToHomeScreen$Parameters("default_request_id") : addToHomeScreen$Parameters;
    }

    public static final void b(AddToHomeScreen$Parameters addToHomeScreen$Parameters) {
        if (addToHomeScreen$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddToHomeScreen$Parameters) && epx.f(this.requestId, ((AddToHomeScreen$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
