package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5434a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5435b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5436c;

    public e0(Object obj, Object obj2, Object obj3) {
        this.f5434a = obj;
        this.f5435b = obj2;
        this.f5436c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f5434a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f5435b);
        return new IllegalArgumentException(d9.e.m(r4.k.q("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f5436c)));
    }
}
