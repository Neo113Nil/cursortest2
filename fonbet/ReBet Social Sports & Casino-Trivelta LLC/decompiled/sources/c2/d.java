package c2;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.O;
import H1.r;
import H1.u;
import b1.C2338G;
import e1.AbstractC4134a;
import e1.J;

/* loaded from: classes.dex */
public class d implements InterfaceC1183p {

    /* renamed from: d, reason: collision with root package name */
    public static final u f26866d = new u() { // from class: c2.c
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return d.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public r f26867a;

    /* renamed from: b, reason: collision with root package name */
    public i f26868b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26869c;

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new d()};
    }

    public static J d(J j10) {
        j10.b0(0);
        return j10;
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        i iVar = this.f26868b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f26867a = rVar;
    }

    public final boolean e(InterfaceC1184q interfaceC1184q) {
        f fVar = new f();
        if (fVar.a(interfaceC1184q, true) && (fVar.f26876b & 2) == 2) {
            int min = Math.min(fVar.f26883i, 8);
            J j10 = new J(min);
            interfaceC1184q.n(j10.f(), 0, min);
            if (C2487b.p(d(j10))) {
                this.f26868b = new C2487b();
            } else if (j.r(d(j10))) {
                this.f26868b = new j();
            } else if (h.o(d(j10))) {
                this.f26868b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        AbstractC4134a.i(this.f26867a);
        if (this.f26868b == null) {
            if (!e(interfaceC1184q)) {
                throw C2338G.a("Failed to determine bitstream type", null);
            }
            interfaceC1184q.g();
        }
        if (!this.f26869c) {
            O c10 = this.f26867a.c(0, 1);
            this.f26867a.s();
            this.f26868b.d(this.f26867a, c10);
            this.f26869c = true;
        }
        return this.f26868b.g(interfaceC1184q, i10);
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        try {
            return e(interfaceC1184q);
        } catch (C2338G unused) {
            return false;
        }
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
