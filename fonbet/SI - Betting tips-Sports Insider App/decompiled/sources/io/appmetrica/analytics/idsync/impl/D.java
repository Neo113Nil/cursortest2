package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f11828a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11829b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11830c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11831d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11832e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f11833f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f11834g;

    public D(String str, boolean z5, String str2, boolean z7, int i5, byte[] bArr, Map map) {
        this.f11828a = str;
        this.f11829b = z5;
        this.f11830c = str2;
        this.f11831d = z7;
        this.f11832e = i5;
        this.f11833f = bArr;
        this.f11834g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f11828a + "', isCompleted=" + this.f11829b + ", url=" + this.f11830c + ", responseCodeIsValid=" + this.f11831d + ", responseCode=" + this.f11832e + ", responseBody=" + this.f11833f + ", responseHeaders=" + this.f11834g + ')';
    }
}
