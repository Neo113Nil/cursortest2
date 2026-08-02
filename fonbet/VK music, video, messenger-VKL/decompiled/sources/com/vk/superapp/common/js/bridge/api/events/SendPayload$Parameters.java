package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.b9y;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SendPayload.kt */
/* loaded from: classes6.dex */
public final class SendPayload$Parameters implements ad6 {

    @pmi0("group_id")
    private final int groupId;

    @pmi0("payload")
    private final b9y payload;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public SendPayload$Parameters(int i, b9y b9yVar, String str) {
        this.groupId = i;
        this.payload = b9yVar;
        this.requestId = str;
    }

    public static final SendPayload$Parameters a(SendPayload$Parameters sendPayload$Parameters) {
        return sendPayload$Parameters.requestId == null ? new SendPayload$Parameters(sendPayload$Parameters.groupId, sendPayload$Parameters.payload, "default_request_id") : sendPayload$Parameters;
    }

    public static final void b(SendPayload$Parameters sendPayload$Parameters) {
        if (sendPayload$Parameters.groupId < 1) {
            throw new IllegalArgumentException("Value groupId cannot be less than 1");
        }
    }

    public static final void c(SendPayload$Parameters sendPayload$Parameters) {
        if (sendPayload$Parameters.payload == null) {
            throw new IllegalArgumentException("Value of non-nullable member payload cannot be\n                        null");
        }
        if (sendPayload$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendPayload$Parameters)) {
            return false;
        }
        SendPayload$Parameters sendPayload$Parameters = (SendPayload$Parameters) obj;
        return this.groupId == sendPayload$Parameters.groupId && epx.f(this.payload, sendPayload$Parameters.payload) && epx.f(this.requestId, sendPayload$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + ((this.payload.hashCode() + (Integer.hashCode(this.groupId) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(groupId=");
        sb.append(this.groupId);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
