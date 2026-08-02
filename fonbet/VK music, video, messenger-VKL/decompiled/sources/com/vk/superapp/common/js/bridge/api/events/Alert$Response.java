package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.b9y;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Alert.kt */
/* loaded from: classes6.dex */
public final class Alert$Response implements bd6 {

    @pmi0("data")
    private final b9y data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public Alert$Response(String str, b9y b9yVar, String str2) {
        this.type = str;
        this.data = b9yVar;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new Alert$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alert$Response)) {
            return false;
        }
        Alert$Response alert$Response = (Alert$Response) obj;
        return epx.f(this.type, alert$Response.type) && epx.f(this.data, alert$Response.data) && epx.f(this.requestId, alert$Response.requestId);
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

    public /* synthetic */ Alert$Response(String str, b9y b9yVar, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAlertResult" : str, b9yVar, str2);
    }
}
