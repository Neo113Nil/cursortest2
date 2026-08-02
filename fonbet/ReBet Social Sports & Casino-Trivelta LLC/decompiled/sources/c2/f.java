package c2;

import H1.AbstractC1185s;
import H1.InterfaceC1184q;
import b1.C2338G;
import e1.AbstractC4134a;
import e1.J;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f26875a;

    /* renamed from: b, reason: collision with root package name */
    public int f26876b;

    /* renamed from: c, reason: collision with root package name */
    public long f26877c;

    /* renamed from: d, reason: collision with root package name */
    public long f26878d;

    /* renamed from: e, reason: collision with root package name */
    public long f26879e;

    /* renamed from: f, reason: collision with root package name */
    public long f26880f;

    /* renamed from: g, reason: collision with root package name */
    public int f26881g;

    /* renamed from: h, reason: collision with root package name */
    public int f26882h;

    /* renamed from: i, reason: collision with root package name */
    public int f26883i;
    public final int[] laces = new int[255];

    /* renamed from: j, reason: collision with root package name */
    public final J f26884j = new J(255);

    public boolean a(InterfaceC1184q interfaceC1184q, boolean z10) {
        b();
        this.f26884j.X(27);
        if (!AbstractC1185s.c(interfaceC1184q, this.f26884j.f(), 0, 27, z10) || this.f26884j.O() != 1332176723) {
            return false;
        }
        int M10 = this.f26884j.M();
        this.f26875a = M10;
        if (M10 != 0) {
            if (z10) {
                return false;
            }
            throw C2338G.d("unsupported bit stream revision");
        }
        this.f26876b = this.f26884j.M();
        this.f26877c = this.f26884j.A();
        this.f26878d = this.f26884j.C();
        this.f26879e = this.f26884j.C();
        this.f26880f = this.f26884j.C();
        int M11 = this.f26884j.M();
        this.f26881g = M11;
        this.f26882h = M11 + 27;
        this.f26884j.X(M11);
        if (!AbstractC1185s.c(interfaceC1184q, this.f26884j.f(), 0, this.f26881g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f26881g; i10++) {
            this.laces[i10] = this.f26884j.M();
            this.f26883i += this.laces[i10];
        }
        return true;
    }

    public void b() {
        this.f26875a = 0;
        this.f26876b = 0;
        this.f26877c = 0L;
        this.f26878d = 0L;
        this.f26879e = 0L;
        this.f26880f = 0L;
        this.f26881g = 0;
        this.f26882h = 0;
        this.f26883i = 0;
    }

    public boolean c(InterfaceC1184q interfaceC1184q) {
        return d(interfaceC1184q, -1L);
    }

    public boolean d(InterfaceC1184q interfaceC1184q, long j10) {
        AbstractC4134a.a(interfaceC1184q.getPosition() == interfaceC1184q.i());
        this.f26884j.X(4);
        while (true) {
            if ((j10 == -1 || interfaceC1184q.getPosition() + 4 < j10) && AbstractC1185s.c(interfaceC1184q, this.f26884j.f(), 0, 4, true)) {
                this.f26884j.b0(0);
                if (this.f26884j.O() == 1332176723) {
                    interfaceC1184q.g();
                    return true;
                }
                interfaceC1184q.l(1);
            }
        }
        do {
            if (j10 != -1 && interfaceC1184q.getPosition() >= j10) {
                break;
            }
        } while (interfaceC1184q.a(1) != -1);
        return false;
    }
}
