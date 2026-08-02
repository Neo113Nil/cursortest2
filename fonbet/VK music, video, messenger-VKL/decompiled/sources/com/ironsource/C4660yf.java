package com.ironsource;

/* renamed from: com.ironsource.yf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4660yf extends Vg {
    private final Vc d;
    private final Pg e;
    private final H f;

    public C4660yf(V0 v0, Vc vc, Pg pg, H h) {
        super(v0, vc);
        this.d = vc;
        this.e = pg;
        this.f = h;
    }

    @Override // com.ironsource.Vg
    public void a(B b) {
        B a;
        if (this.f.a(b)) {
            this.d.a(this.e.b(), b);
        } else {
            if (!this.f.a() || (a = this.f.c().a()) == null) {
                return;
            }
            this.d.a(this.e.b(), a);
        }
    }

    @Override // com.ironsource.Vg
    public void c(B b) {
        this.d.a(this.e.b(), b);
    }

    @Override // com.ironsource.Vg
    public void a() {
        B a = this.f.c().a();
        if (a != null) {
            this.d.a(this.e.b(), a);
        }
    }

    @Override // com.ironsource.Vg
    public void b(B b) {
    }
}
