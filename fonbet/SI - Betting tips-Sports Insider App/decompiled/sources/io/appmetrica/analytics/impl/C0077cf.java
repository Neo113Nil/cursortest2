package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077cf {

    /* renamed from: a, reason: collision with root package name */
    public final String f13522a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f13523b;

    /* renamed from: c, reason: collision with root package name */
    public final S7 f13524c;

    public C0077cf(String str, JSONObject jSONObject, S7 s72) {
        this.f13522a = str;
        this.f13523b = jSONObject;
        this.f13524c = s72;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f13522a + "', additionalParams=" + this.f13523b + ", source=" + this.f13524c + '}';
    }
}
