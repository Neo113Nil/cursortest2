package r1;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import a2.C1914f;
import b2.C2378h;
import e1.AbstractC4134a;
import e1.Q;
import e2.s;
import o2.C5782b;
import o2.C5785e;
import o2.C5788h;
import o2.K;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6197b implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final I f63739f = new I();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1183p f63740a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.a f63741b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f63742c;

    /* renamed from: d, reason: collision with root package name */
    public final s.a f63743d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63744e;

    public C6197b(InterfaceC1183p interfaceC1183p, androidx.media3.common.a aVar, Q q10, s.a aVar2, boolean z10) {
        this.f63740a = interfaceC1183p;
        this.f63741b = aVar;
        this.f63742c = q10;
        this.f63743d = aVar2;
        this.f63744e = z10;
    }

    @Override // r1.k
    public boolean a(InterfaceC1184q interfaceC1184q) {
        return this.f63740a.g(interfaceC1184q, f63739f) == 0;
    }

    @Override // r1.k
    public void b() {
        this.f63740a.a(0L, 0L);
    }

    @Override // r1.k
    public void c(H1.r rVar) {
        this.f63740a.c(rVar);
    }

    @Override // r1.k
    public boolean d() {
        InterfaceC1183p f10 = this.f63740a.f();
        return (f10 instanceof K) || (f10 instanceof C2378h);
    }

    @Override // r1.k
    public boolean e() {
        InterfaceC1183p f10 = this.f63740a.f();
        return (f10 instanceof C5788h) || (f10 instanceof C5782b) || (f10 instanceof C5785e) || (f10 instanceof C1914f);
    }

    @Override // r1.k
    public k f() {
        InterfaceC1183p c1914f;
        AbstractC4134a.g(!d());
        AbstractC4134a.h(this.f63740a.f() == this.f63740a, "Can't recreate wrapped extractors. Outer type: " + this.f63740a.getClass());
        InterfaceC1183p interfaceC1183p = this.f63740a;
        if (interfaceC1183p instanceof w) {
            c1914f = new w(this.f63741b.f20532d, this.f63742c, this.f63743d, this.f63744e);
        } else if (interfaceC1183p instanceof C5788h) {
            c1914f = new C5788h();
        } else if (interfaceC1183p instanceof C5782b) {
            c1914f = new C5782b();
        } else if (interfaceC1183p instanceof C5785e) {
            c1914f = new C5785e();
        } else {
            if (!(interfaceC1183p instanceof C1914f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f63740a.getClass().getSimpleName());
            }
            c1914f = new C1914f();
        }
        return new C6197b(c1914f, this.f63741b, this.f63742c, this.f63743d, this.f63744e);
    }
}
