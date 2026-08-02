package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.b9y;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CallAPIMethod.kt */
/* loaded from: classes6.dex */
public final class CallAPIMethod$Parameters implements ad6 {

    @pmi0("method")
    private final String method;

    @pmi0("params")
    private final b9y params;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("use_local")
    private final Boolean useLocal;

    public CallAPIMethod$Parameters(String str, b9y b9yVar, String str2, Boolean bool) {
        this.method = str;
        this.params = b9yVar;
        this.requestId = str2;
        this.useLocal = bool;
    }

    public static final CallAPIMethod$Parameters a(CallAPIMethod$Parameters callAPIMethod$Parameters) {
        return callAPIMethod$Parameters.requestId == null ? new CallAPIMethod$Parameters(callAPIMethod$Parameters.method, callAPIMethod$Parameters.params, "default_request_id", callAPIMethod$Parameters.useLocal) : callAPIMethod$Parameters;
    }

    public static final void b(CallAPIMethod$Parameters callAPIMethod$Parameters) {
        if (callAPIMethod$Parameters.method == null) {
            throw new IllegalArgumentException("Value of non-nullable member method cannot be\n                        null");
        }
        if (callAPIMethod$Parameters.params == null) {
            throw new IllegalArgumentException("Value of non-nullable member params cannot be\n                        null");
        }
        if (callAPIMethod$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.method;
    }

    public final b9y d() {
        return this.params;
    }

    public final String e() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallAPIMethod$Parameters)) {
            return false;
        }
        CallAPIMethod$Parameters callAPIMethod$Parameters = (CallAPIMethod$Parameters) obj;
        return epx.f(this.method, callAPIMethod$Parameters.method) && epx.f(this.params, callAPIMethod$Parameters.params) && epx.f(this.requestId, callAPIMethod$Parameters.requestId) && epx.f(this.useLocal, callAPIMethod$Parameters.useLocal);
    }

    public final Boolean f() {
        return this.useLocal;
    }

    public final int hashCode() {
        int a = urd0.a((this.params.hashCode() + (this.method.hashCode() * 31)) * 31, 31, this.requestId);
        Boolean bool = this.useLocal;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(method=");
        sb.append(this.method);
        sb.append(", params=");
        sb.append(this.params);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", useLocal=");
        return tn.a(sb, this.useLocal, ')');
    }

    public /* synthetic */ CallAPIMethod$Parameters(String str, b9y b9yVar, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, b9yVar, str2, (i & 8) != 0 ? null : bool);
    }
}
