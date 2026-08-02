package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.b9y;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CustomMessage.kt */
/* loaded from: classes6.dex */
public final class CustomMessage$Parameters implements ad6 {

    @pmi0("action")
    private final String action;

    @pmi0("payload")
    private final b9y payload;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public CustomMessage$Parameters(String str, String str2, b9y b9yVar) {
        this.requestId = str;
        this.action = str2;
        this.payload = b9yVar;
    }

    public static final CustomMessage$Parameters a(CustomMessage$Parameters customMessage$Parameters) {
        return customMessage$Parameters.requestId == null ? new CustomMessage$Parameters("default_request_id", customMessage$Parameters.action, customMessage$Parameters.payload) : customMessage$Parameters;
    }

    public static final void b(CustomMessage$Parameters customMessage$Parameters) {
        if (customMessage$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
        if (customMessage$Parameters.action == null) {
            throw new IllegalArgumentException("Value of non-nullable member action cannot be\n                        null");
        }
    }

    public final String c() {
        return this.action;
    }

    public final b9y d() {
        return this.payload;
    }

    public final String e() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomMessage$Parameters)) {
            return false;
        }
        CustomMessage$Parameters customMessage$Parameters = (CustomMessage$Parameters) obj;
        return epx.f(this.requestId, customMessage$Parameters.requestId) && epx.f(this.action, customMessage$Parameters.action) && epx.f(this.payload, customMessage$Parameters.payload);
    }

    public final int hashCode() {
        int a = urd0.a(this.requestId.hashCode() * 31, 31, this.action);
        b9y b9yVar = this.payload;
        return a + (b9yVar == null ? 0 : b9yVar.hashCode());
    }

    public final String toString() {
        return "Parameters(requestId=" + this.requestId + ", action=" + this.action + ", payload=" + this.payload + ')';
    }

    public /* synthetic */ CustomMessage$Parameters(String str, String str2, b9y b9yVar, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : b9yVar);
    }
}
