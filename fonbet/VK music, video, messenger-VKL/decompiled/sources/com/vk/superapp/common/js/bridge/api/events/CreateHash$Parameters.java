package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CreateHash.kt */
/* loaded from: classes6.dex */
public final class CreateHash$Parameters implements ad6 {

    @pmi0("payload")
    private final String payload;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public CreateHash$Parameters(String str, String str2) {
        this.requestId = str;
        this.payload = str2;
    }

    public static final CreateHash$Parameters a(CreateHash$Parameters createHash$Parameters) {
        return createHash$Parameters.requestId == null ? new CreateHash$Parameters("default_request_id", createHash$Parameters.payload) : createHash$Parameters;
    }

    public static final void b(CreateHash$Parameters createHash$Parameters) {
        if (createHash$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateHash$Parameters)) {
            return false;
        }
        CreateHash$Parameters createHash$Parameters = (CreateHash$Parameters) obj;
        return epx.f(this.requestId, createHash$Parameters.requestId) && epx.f(this.payload, createHash$Parameters.payload);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.payload;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", payload=");
        return ho8.a(sb, this.payload, ')');
    }

    public /* synthetic */ CreateHash$Parameters(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
