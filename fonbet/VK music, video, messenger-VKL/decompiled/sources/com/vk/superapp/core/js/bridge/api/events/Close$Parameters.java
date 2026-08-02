package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.b9y;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Close.kt */
/* loaded from: classes6.dex */
public final class Close$Parameters implements ad6 {

    @pmi0("clear_cache")
    private final Boolean clearCache;

    @pmi0("payload")
    private final b9y payload;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("status")
    private final String status;

    @pmi0("text")
    private final String text;

    public Close$Parameters(String str, String str2, Boolean bool, b9y b9yVar, String str3) {
        this.requestId = str;
        this.status = str2;
        this.clearCache = bool;
        this.payload = b9yVar;
        this.text = str3;
    }

    public static final Close$Parameters a(Close$Parameters close$Parameters) {
        return close$Parameters.requestId == null ? new Close$Parameters("default_request_id", close$Parameters.status, close$Parameters.clearCache, close$Parameters.payload, close$Parameters.text) : close$Parameters;
    }

    public static final void b(Close$Parameters close$Parameters) {
        if (close$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final b9y c() {
        return this.payload;
    }

    public final String d() {
        return this.requestId;
    }

    public final String e() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Close$Parameters)) {
            return false;
        }
        Close$Parameters close$Parameters = (Close$Parameters) obj;
        return epx.f(this.requestId, close$Parameters.requestId) && epx.f(this.status, close$Parameters.status) && epx.f(this.clearCache, close$Parameters.clearCache) && epx.f(this.payload, close$Parameters.payload) && epx.f(this.text, close$Parameters.text);
    }

    public final String f() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.clearCache;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        b9y b9yVar = this.payload;
        int hashCode4 = (hashCode3 + (b9yVar == null ? 0 : b9yVar.hashCode())) * 31;
        String str2 = this.text;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", clearCache=");
        sb.append(this.clearCache);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    public /* synthetic */ Close$Parameters(String str, String str2, Boolean bool, b9y b9yVar, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : b9yVar, (i & 16) != 0 ? null : str3);
    }
}
