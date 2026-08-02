package com.vk.superapp.permission.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetGrantedPermissions.kt */
/* loaded from: classes6.dex */
public final class GetGrantedPermissions$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetGrantedPermissions$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetGrantedPermissions$Parameters a(GetGrantedPermissions$Parameters getGrantedPermissions$Parameters) {
        return getGrantedPermissions$Parameters.requestId == null ? new GetGrantedPermissions$Parameters("default_request_id") : getGrantedPermissions$Parameters;
    }

    public static final void b(GetGrantedPermissions$Parameters getGrantedPermissions$Parameters) {
        if (getGrantedPermissions$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetGrantedPermissions$Parameters) && epx.f(this.requestId, ((GetGrantedPermissions$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
