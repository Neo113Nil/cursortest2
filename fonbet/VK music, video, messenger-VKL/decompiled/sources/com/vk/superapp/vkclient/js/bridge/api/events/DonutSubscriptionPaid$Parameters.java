package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: DonutSubscriptionPaid.kt */
/* loaded from: classes6.dex */
public final class DonutSubscriptionPaid$Parameters implements ad6 {

    @pmi0("owner_id")
    private final int ownerId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public DonutSubscriptionPaid$Parameters(int i, String str) {
        this.ownerId = i;
        this.requestId = str;
    }

    public static final DonutSubscriptionPaid$Parameters a(DonutSubscriptionPaid$Parameters donutSubscriptionPaid$Parameters) {
        return donutSubscriptionPaid$Parameters.requestId == null ? new DonutSubscriptionPaid$Parameters(donutSubscriptionPaid$Parameters.ownerId, "default_request_id") : donutSubscriptionPaid$Parameters;
    }

    public static final void b(DonutSubscriptionPaid$Parameters donutSubscriptionPaid$Parameters) {
        if (donutSubscriptionPaid$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutSubscriptionPaid$Parameters)) {
            return false;
        }
        DonutSubscriptionPaid$Parameters donutSubscriptionPaid$Parameters = (DonutSubscriptionPaid$Parameters) obj;
        return this.ownerId == donutSubscriptionPaid$Parameters.ownerId && epx.f(this.requestId, donutSubscriptionPaid$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (Integer.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(ownerId=");
        sb.append(this.ownerId);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
