package com.vk.superapp.dating.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AllowLocationPermission.kt */
/* loaded from: classes6.dex */
public final class AllowLocationPermission$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AllowLocationPermission$Parameters(String str) {
        this.requestId = str;
    }

    public static final AllowLocationPermission$Parameters a(AllowLocationPermission$Parameters allowLocationPermission$Parameters) {
        return allowLocationPermission$Parameters.requestId == null ? new AllowLocationPermission$Parameters("default_request_id") : allowLocationPermission$Parameters;
    }

    public static final void b(AllowLocationPermission$Parameters allowLocationPermission$Parameters) {
        if (allowLocationPermission$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllowLocationPermission$Parameters) && epx.f(this.requestId, ((AllowLocationPermission$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
