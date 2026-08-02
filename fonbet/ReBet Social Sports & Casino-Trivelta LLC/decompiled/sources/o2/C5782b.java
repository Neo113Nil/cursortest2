package o2;

import H1.AbstractC1169b;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import o2.L;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5782b implements InterfaceC1183p {

    /* renamed from: d, reason: collision with root package name */
    public static final H1.u f58995d = new H1.u() { // from class: o2.a
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return C5782b.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final C5783c f58996a = new C5783c("audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    public final e1.J f58997b = new e1.J(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f58998c;

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new C5782b()};
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f58998c = false;
        this.f58996a.b();
    }

    @Override // H1.InterfaceC1183p
    public void c(H1.r rVar) {
        this.f58996a.d(rVar, new L.d(0, 1));
        rVar.s();
        rVar.q(new J.b(-9223372036854775807L));
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, H1.I i10) {
        int read = interfaceC1184q.read(this.f58997b.f(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f58997b.b0(0);
        this.f58997b.a0(read);
        if (!this.f58998c) {
            this.f58996a.e(0L, 4);
            this.f58998c = true;
        }
        this.f58996a.a(this.f58997b);
        return 0;
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        e1.J j10 = new e1.J(10);
        int i10 = 0;
        while (true) {
            interfaceC1184q.n(j10.f(), 0, 10);
            j10.b0(0);
            if (j10.P() != 4801587) {
                break;
            }
            j10.c0(3);
            int L10 = j10.L();
            i10 += L10 + 10;
            interfaceC1184q.j(L10);
        }
        interfaceC1184q.g();
        interfaceC1184q.j(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            interfaceC1184q.n(j10.f(), 0, 6);
            j10.b0(0);
            if (j10.U() != 2935) {
                interfaceC1184q.g();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC1184q.j(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int g10 = AbstractC1169b.g(j10.f());
                if (g10 == -1) {
                    return false;
                }
                interfaceC1184q.j(g10 - 6);
            }
        }
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
