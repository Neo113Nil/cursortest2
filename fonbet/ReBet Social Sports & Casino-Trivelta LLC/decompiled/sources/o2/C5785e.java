package o2;

import H1.AbstractC1170c;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import o2.L;

/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5785e implements InterfaceC1183p {

    /* renamed from: d, reason: collision with root package name */
    public static final H1.u f59013d = new H1.u() { // from class: o2.d
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return C5785e.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final C5786f f59014a = new C5786f("audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    public final e1.J f59015b = new e1.J(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f59016c;

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new C5785e()};
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f59016c = false;
        this.f59014a.b();
    }

    @Override // H1.InterfaceC1183p
    public void c(H1.r rVar) {
        this.f59014a.d(rVar, new L.d(0, 1));
        rVar.s();
        rVar.q(new J.b(-9223372036854775807L));
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, H1.I i10) {
        int read = interfaceC1184q.read(this.f59015b.f(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f59015b.b0(0);
        this.f59015b.a0(read);
        if (!this.f59016c) {
            this.f59014a.e(0L, 4);
            this.f59016c = true;
        }
        this.f59014a.a(this.f59015b);
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
            interfaceC1184q.n(j10.f(), 0, 7);
            j10.b0(0);
            int U10 = j10.U();
            if (U10 == 44096 || U10 == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int h10 = AbstractC1170c.h(j10.f(), U10);
                if (h10 == -1) {
                    return false;
                }
                interfaceC1184q.j(h10 - 7);
            } else {
                interfaceC1184q.g();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC1184q.j(i12);
                i11 = 0;
            }
        }
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
