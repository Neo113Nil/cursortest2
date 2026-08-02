package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646z4 {

    /* renamed from: a, reason: collision with root package name */
    public final Fb f14986a;

    public C0646z4() {
        this(C0353na.k().l());
    }

    public static E4 a(C0596x4 c0596x4) {
        return new E4(new C4(c0596x4), c0596x4);
    }

    public C0646z4(Fb fb2) {
        this.f14986a = fb2;
    }

    public final C0316ln a(C0596x4 c0596x4, Am am) {
        C0316ln c0316ln = new C0316ln(c0596x4, new Ig(am));
        Fb fb2 = this.f14986a;
        synchronized (fb2) {
            fb2.f12222c.add(c0316ln);
        }
        return c0316ln;
    }
}
