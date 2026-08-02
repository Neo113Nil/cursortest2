package u4;

import Ij.C3261b;
import m3.C8049B;
import m3.C8050C;
import m3.C8056I;
import u4.J;

/* loaded from: classes8.dex */
public final class x implements J {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9958l f100272a;

    /* renamed from: b, reason: collision with root package name */
    private final C8049B f100273b = new C8049B(10, new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f100274c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f100275d;

    /* renamed from: e, reason: collision with root package name */
    private C8056I f100276e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f100277f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f100278g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f100279h;

    /* renamed from: i, reason: collision with root package name */
    private int f100280i;

    /* renamed from: j, reason: collision with root package name */
    private int f100281j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f100282k;

    /* renamed from: l, reason: collision with root package name */
    private long f100283l;

    public x(InterfaceC9958l interfaceC9958l) {
        this.f100272a = interfaceC9958l;
    }

    private boolean e(C8050C c8050c, byte[] bArr, int i11) {
        int min = Math.min(c8050c.a(), i11 - this.f100275d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c8050c.S(min);
        } else {
            c8050c.n(this.f100275d, min, bArr);
        }
        int i12 = this.f100275d + min;
        this.f100275d = i12;
        return i12 == i11;
    }

    private boolean f() {
        C8049B c8049b = this.f100273b;
        c8049b.n(0);
        int h11 = c8049b.h(24);
        if (h11 != 1) {
            C3261b.f(h11, "Unexpected start code prefix: ", "PesReader");
            this.f100281j = -1;
            return false;
        }
        c8049b.p(8);
        int h12 = c8049b.h(16);
        c8049b.p(5);
        this.f100282k = c8049b.g();
        c8049b.p(2);
        this.f100277f = c8049b.g();
        this.f100278g = c8049b.g();
        c8049b.p(6);
        int h13 = c8049b.h(8);
        this.f100280i = h13;
        if (h12 == 0) {
            this.f100281j = -1;
        } else {
            int i11 = (h12 - 3) - h13;
            this.f100281j = i11;
            if (i11 < 0) {
                m3.s.f("PesReader", "Found negative packet payload size: " + this.f100281j);
                this.f100281j = -1;
            }
        }
        return true;
    }

    @Override // u4.J
    public final void a(C8056I c8056i, N3.r rVar, J.d dVar) {
        this.f100276e = c8056i;
        this.f100272a.e(rVar, dVar);
    }

    @Override // u4.J
    public final void b() {
        this.f100274c = 0;
        this.f100275d = 0;
        this.f100279h = false;
        this.f100272a.b();
    }

    @Override // u4.J
    public final void c(int i11, C8050C c8050c) throws j3.v {
        G10.a.i(this.f100276e);
        int i12 = i11 & 1;
        InterfaceC9958l interfaceC9958l = this.f100272a;
        int i13 = -1;
        int i14 = 2;
        if (i12 != 0) {
            int i15 = this.f100274c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    m3.s.f("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f100281j != -1) {
                        m3.s.f("PesReader", "Unexpected start indicator: expected " + this.f100281j + " more bytes");
                    }
                    interfaceC9958l.f(c8050c.i() == 0);
                }
            }
            this.f100274c = 1;
            this.f100275d = 0;
        }
        int i16 = i11;
        while (c8050c.a() > 0) {
            int i17 = this.f100274c;
            if (i17 != 0) {
                C8049B c8049b = this.f100273b;
                if (i17 != 1) {
                    if (i17 == i14) {
                        if (e(c8050c, c8049b.f74257a, Math.min(10, this.f100280i)) && e(c8050c, null, this.f100280i)) {
                            c8049b.n(0);
                            this.f100283l = -9223372036854775807L;
                            if (this.f100277f) {
                                c8049b.p(4);
                                c8049b.p(1);
                                c8049b.p(1);
                                long h11 = (c8049b.h(15) << 15) | (c8049b.h(3) << 30) | c8049b.h(15);
                                c8049b.p(1);
                                if (!this.f100279h && this.f100278g) {
                                    c8049b.p(4);
                                    c8049b.p(1);
                                    c8049b.p(1);
                                    c8049b.p(1);
                                    this.f100276e.b((c8049b.h(3) << 30) | (c8049b.h(15) << 15) | c8049b.h(15));
                                    this.f100279h = true;
                                }
                                this.f100283l = this.f100276e.b(h11);
                            }
                            i16 |= this.f100282k ? 4 : 0;
                            interfaceC9958l.d(i16, this.f100283l);
                            this.f100274c = 3;
                            this.f100275d = 0;
                        }
                    } else {
                        if (i17 != 3) {
                            throw new IllegalStateException();
                        }
                        int a11 = c8050c.a();
                        int i18 = this.f100281j;
                        int i19 = i18 == i13 ? 0 : a11 - i18;
                        if (i19 > 0) {
                            a11 -= i19;
                            c8050c.Q(c8050c.f() + a11);
                        }
                        interfaceC9958l.c(c8050c);
                        int i21 = this.f100281j;
                        if (i21 != i13) {
                            int i22 = i21 - a11;
                            this.f100281j = i22;
                            if (i22 == 0) {
                                interfaceC9958l.f(false);
                                this.f100274c = 1;
                                this.f100275d = 0;
                            }
                        }
                    }
                } else if (e(c8050c, c8049b.f74257a, 9)) {
                    this.f100274c = f() ? 2 : 0;
                    this.f100275d = 0;
                }
            } else {
                c8050c.S(c8050c.a());
            }
            i13 = -1;
            i14 = 2;
        }
    }

    public final boolean d(boolean z11) {
        return this.f100274c == 3 && this.f100281j == -1 && !(z11 && (this.f100272a instanceof m)) && (!z11 || f());
    }
}
