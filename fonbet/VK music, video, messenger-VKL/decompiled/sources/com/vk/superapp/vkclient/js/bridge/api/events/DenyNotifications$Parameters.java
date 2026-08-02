package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: DenyNotifications.kt */
/* loaded from: classes6.dex */
public final class DenyNotifications$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public DenyNotifications$Parameters(String str) {
        this.requestId = str;
    }

    public static final DenyNotifications$Parameters a(DenyNotifications$Parameters denyNotifications$Parameters) {
        return denyNotifications$Parameters.requestId == null ? new DenyNotifications$Parameters("default_request_id") : denyNotifications$Parameters;
    }

    public static final void b(DenyNotifications$Parameters denyNotifications$Parameters) {
        if (denyNotifications$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DenyNotifications$Parameters) && epx.f(this.requestId, ((DenyNotifications$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
