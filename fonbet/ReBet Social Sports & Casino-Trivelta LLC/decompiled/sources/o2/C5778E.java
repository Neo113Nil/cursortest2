package o2;

import e1.Q;
import e1.Z;
import o2.L;

/* renamed from: o2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5778E implements L {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5777D f58928a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.J f58929b = new e1.J(32);

    /* renamed from: c, reason: collision with root package name */
    public int f58930c;

    /* renamed from: d, reason: collision with root package name */
    public int f58931d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f58932e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58933f;

    public C5778E(InterfaceC5777D interfaceC5777D) {
        this.f58928a = interfaceC5777D;
    }

    @Override // o2.L
    public void a(e1.J j10, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int g10 = z10 ? j10.g() + j10.M() : -1;
        if (this.f58933f) {
            if (!z10) {
                return;
            }
            this.f58933f = false;
            j10.b0(g10);
            this.f58931d = 0;
        }
        while (j10.a() > 0) {
            int i11 = this.f58931d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int M10 = j10.M();
                    j10.b0(j10.g() - 1);
                    if (M10 == 255) {
                        this.f58933f = true;
                        return;
                    }
                }
                int min = Math.min(j10.a(), 3 - this.f58931d);
                j10.q(this.f58929b.f(), this.f58931d, min);
                int i12 = this.f58931d + min;
                this.f58931d = i12;
                if (i12 == 3) {
                    this.f58929b.b0(0);
                    this.f58929b.a0(3);
                    this.f58929b.c0(1);
                    int M11 = this.f58929b.M();
                    int M12 = this.f58929b.M();
                    this.f58932e = (M11 & 128) != 0;
                    this.f58930c = (((M11 & 15) << 8) | M12) + 3;
                    int b10 = this.f58929b.b();
                    int i13 = this.f58930c;
                    if (b10 < i13) {
                        this.f58929b.d(Math.min(4098, Math.max(i13, this.f58929b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(j10.a(), this.f58930c - this.f58931d);
                j10.q(this.f58929b.f(), this.f58931d, min2);
                int i14 = this.f58931d + min2;
                this.f58931d = i14;
                int i15 = this.f58930c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f58932e) {
                        this.f58929b.a0(i15);
                    } else {
                        if (Z.w(this.f58929b.f(), 0, this.f58930c, -1) != 0) {
                            this.f58933f = true;
                            return;
                        }
                        this.f58929b.a0(this.f58930c - 4);
                    }
                    this.f58929b.b0(0);
                    this.f58928a.a(this.f58929b);
                    this.f58931d = 0;
                }
            }
        }
    }

    @Override // o2.L
    public void b() {
        this.f58933f = true;
    }

    @Override // o2.L
    public void c(Q q10, H1.r rVar, L.d dVar) {
        this.f58928a.c(q10, rVar, dVar);
        this.f58933f = true;
    }
}
