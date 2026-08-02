package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.b9y;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetLaunchParams.kt */
/* loaded from: classes6.dex */
public final class GetLaunchParams$Response implements bd6 {

    @pmi0("data")
    private final b9y data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetLaunchParams$Response(String str, b9y b9yVar, String str2) {
        this.type = str;
        this.data = b9yVar;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetLaunchParams$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLaunchParams$Response)) {
            return false;
        }
        GetLaunchParams$Response getLaunchParams$Response = (GetLaunchParams$Response) obj;
        return epx.f(this.type, getLaunchParams$Response.type) && epx.f(this.data, getLaunchParams$Response.data) && epx.f(this.requestId, getLaunchParams$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ GetLaunchParams$Response(String str, b9y b9yVar, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetLaunchParamsResult" : str, b9yVar, str2);
    }
}
