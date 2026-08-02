package com.braze.communication;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f474a;
    public final Map b;
    public final JSONObject c;

    public d(int i, Map responseHeaders, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        this.f474a = i;
        this.b = responseHeaders;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f474a == dVar.f474a && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.f474a) * 31)) * 31;
        JSONObject jSONObject = this.c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "HttpConnectorResult(responseCode=" + this.f474a + ", responseHeaders=" + this.b + ", jsonResponse=" + this.c + ")";
    }

    public /* synthetic */ d(int i, Map map, int i2) {
        this(i, (i2 & 2) != 0 ? MapsKt.emptyMap() : map, (JSONObject) null);
    }
}
