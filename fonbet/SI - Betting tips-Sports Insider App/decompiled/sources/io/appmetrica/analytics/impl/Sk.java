package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Sk {

    /* renamed from: a, reason: collision with root package name */
    public final String f12882a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12883b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12884c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12885d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12886e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12887f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12888g;

    public Sk(JSONObject jSONObject) {
        this.f12882a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f12883b = jSONObject.optString("kitBuildNumber", "");
        this.f12884c = jSONObject.optString("appVer", "");
        this.f12885d = jSONObject.optString("appBuild", "");
        this.f12886e = jSONObject.optString("osVer", "");
        this.f12887f = jSONObject.optInt("osApiLev", -1);
        this.f12888g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionRequestParams(kitVersionName='");
        sb2.append(this.f12882a);
        sb2.append("', kitBuildNumber='");
        sb2.append(this.f12883b);
        sb2.append("', appVersion='");
        sb2.append(this.f12884c);
        sb2.append("', appBuild='");
        sb2.append(this.f12885d);
        sb2.append("', osVersion='");
        sb2.append(this.f12886e);
        sb2.append("', apiLevel=");
        sb2.append(this.f12887f);
        sb2.append(", attributionId=");
        return d9.e.i(sb2, this.f12888g, ')');
    }
}
