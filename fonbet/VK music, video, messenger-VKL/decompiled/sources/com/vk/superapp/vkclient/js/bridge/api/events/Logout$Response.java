package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Logout.kt */
/* loaded from: classes6.dex */
public final class Logout$Response implements bd6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public Logout$Response(String str, String str2) {
        this.type = str;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new Logout$Response(this.type, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Logout$Response)) {
            return false;
        }
        Logout$Response logout$Response = (Logout$Response) obj;
        return epx.f(this.type, logout$Response.type) && epx.f(this.requestId, logout$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ Logout$Response(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppLogoutResult" : str, str2);
    }
}
