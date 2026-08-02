package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AllowNotifications.kt */
/* loaded from: classes6.dex */
public final class AllowNotifications$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AllowNotifications$Parameters(String str) {
        this.requestId = str;
    }

    public static final AllowNotifications$Parameters a(AllowNotifications$Parameters allowNotifications$Parameters) {
        return allowNotifications$Parameters.requestId == null ? new AllowNotifications$Parameters("default_request_id") : allowNotifications$Parameters;
    }

    public static final void b(AllowNotifications$Parameters allowNotifications$Parameters) {
        if (allowNotifications$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllowNotifications$Parameters) && epx.f(this.requestId, ((AllowNotifications$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
