package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SetPaymentToken.kt */
/* loaded from: classes6.dex */
public final class SetPaymentToken$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("token")
    private final String token;

    public SetPaymentToken$Parameters(String str, String str2) {
        this.requestId = str;
        this.token = str2;
    }

    public static final SetPaymentToken$Parameters a(SetPaymentToken$Parameters setPaymentToken$Parameters) {
        return setPaymentToken$Parameters.requestId == null ? new SetPaymentToken$Parameters("default_request_id", setPaymentToken$Parameters.token) : setPaymentToken$Parameters;
    }

    public static final void b(SetPaymentToken$Parameters setPaymentToken$Parameters) {
        if (setPaymentToken$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetPaymentToken$Parameters)) {
            return false;
        }
        SetPaymentToken$Parameters setPaymentToken$Parameters = (SetPaymentToken$Parameters) obj;
        return epx.f(this.requestId, setPaymentToken$Parameters.requestId) && epx.f(this.token, setPaymentToken$Parameters.token);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", token=");
        return ho8.a(sb, this.token, ')');
    }

    public /* synthetic */ SetPaymentToken$Parameters(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
