package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: OpenLiveCoverCamera.kt */
/* loaded from: classes6.dex */
public final class OpenLiveCoverCamera$Parameters implements ad6 {

    @pmi0("group_id")
    private final String groupId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public OpenLiveCoverCamera$Parameters(String str, String str2) {
        this.groupId = str;
        this.requestId = str2;
    }

    public static final OpenLiveCoverCamera$Parameters a(OpenLiveCoverCamera$Parameters openLiveCoverCamera$Parameters) {
        return openLiveCoverCamera$Parameters.requestId == null ? new OpenLiveCoverCamera$Parameters(openLiveCoverCamera$Parameters.groupId, "default_request_id") : openLiveCoverCamera$Parameters;
    }

    public static final void b(OpenLiveCoverCamera$Parameters openLiveCoverCamera$Parameters) {
        if (openLiveCoverCamera$Parameters.groupId == null) {
            throw new IllegalArgumentException("Value of non-nullable member groupId cannot be\n                        null");
        }
        if (openLiveCoverCamera$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenLiveCoverCamera$Parameters)) {
            return false;
        }
        OpenLiveCoverCamera$Parameters openLiveCoverCamera$Parameters = (OpenLiveCoverCamera$Parameters) obj;
        return epx.f(this.groupId, openLiveCoverCamera$Parameters.groupId) && epx.f(this.requestId, openLiveCoverCamera$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.groupId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(groupId=");
        sb.append(this.groupId);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
