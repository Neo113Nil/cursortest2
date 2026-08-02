package o2;

import H1.AbstractC1182o;
import androidx.media3.common.a;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import o2.L;

/* renamed from: o2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5791k implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final e1.J f59070a;

    /* renamed from: c, reason: collision with root package name */
    public final String f59072c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59073d;

    /* renamed from: e, reason: collision with root package name */
    public final String f59074e;

    /* renamed from: f, reason: collision with root package name */
    public String f59075f;

    /* renamed from: g, reason: collision with root package name */
    public H1.O f59076g;

    /* renamed from: i, reason: collision with root package name */
    public int f59078i;

    /* renamed from: j, reason: collision with root package name */
    public int f59079j;

    /* renamed from: k, reason: collision with root package name */
    public long f59080k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.media3.common.a f59081l;

    /* renamed from: m, reason: collision with root package name */
    public int f59082m;

    /* renamed from: n, reason: collision with root package name */
    public int f59083n;

    /* renamed from: h, reason: collision with root package name */
    public int f59077h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f59086q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f59071b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public int f59084o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f59085p = -1;

    public C5791k(String str, int i10, int i11, String str2) {
        this.f59070a = new e1.J(new byte[i11]);
        this.f59072c = str;
        this.f59073d = i10;
        this.f59074e = str2;
    }

    private boolean f(e1.J j10, byte[] bArr, int i10) {
        int min = Math.min(j10.a(), i10 - this.f59078i);
        j10.q(bArr, this.f59078i, min);
        int i11 = this.f59078i + min;
        this.f59078i = i11;
        return i11 == i10;
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        AbstractC4134a.i(this.f59076g);
        while (j10.a() > 0) {
            switch (this.f59077h) {
                case 0:
                    if (!j(j10)) {
                        break;
                    } else {
                        int i10 = this.f59083n;
                        if (i10 != 3 && i10 != 4) {
                            if (i10 != 1) {
                                this.f59077h = 2;
                                break;
                            } else {
                                this.f59077h = 1;
                                break;
                            }
                        } else {
                            this.f59077h = 4;
                            break;
                        }
                    }
                case 1:
                    if (!f(j10, this.f59070a.f(), 18)) {
                        break;
                    } else {
                        g();
                        this.f59070a.b0(0);
                        this.f59076g.a(this.f59070a, 18);
                        this.f59077h = 6;
                        break;
                    }
                case 2:
                    if (!f(j10, this.f59070a.f(), 7)) {
                        break;
                    } else {
                        this.f59084o = AbstractC1182o.j(this.f59070a.f());
                        this.f59077h = 3;
                        break;
                    }
                case 3:
                    if (!f(j10, this.f59070a.f(), this.f59084o)) {
                        break;
                    } else {
                        h();
                        this.f59070a.b0(0);
                        this.f59076g.a(this.f59070a, this.f59084o);
                        this.f59077h = 6;
                        break;
                    }
                case 4:
                    if (!f(j10, this.f59070a.f(), 6)) {
                        break;
                    } else {
                        int l10 = AbstractC1182o.l(this.f59070a.f());
                        this.f59085p = l10;
                        int i11 = this.f59078i;
                        if (i11 > l10) {
                            int i12 = i11 - l10;
                            this.f59078i = i11 - i12;
                            j10.b0(j10.g() - i12);
                        }
                        this.f59077h = 5;
                        break;
                    }
                case 5:
                    if (!f(j10, this.f59070a.f(), this.f59085p)) {
                        break;
                    } else {
                        i();
                        this.f59070a.b0(0);
                        this.f59076g.a(this.f59070a, this.f59085p);
                        this.f59077h = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(j10.a(), this.f59082m - this.f59078i);
                    this.f59076g.a(j10, min);
                    int i13 = this.f59078i + min;
                    this.f59078i = i13;
                    if (i13 == this.f59082m) {
                        AbstractC4134a.g(this.f59086q != -9223372036854775807L);
                        this.f59076g.g(this.f59086q, this.f59083n == 4 ? 0 : 1, this.f59082m, 0, null);
                        this.f59086q += this.f59080k;
                        this.f59077h = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59077h = 0;
        this.f59078i = 0;
        this.f59079j = 0;
        this.f59086q = -9223372036854775807L;
        this.f59071b.set(0);
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59075f = dVar.b();
        this.f59076g = rVar.c(dVar.c(), 1);
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59086q = j10;
    }

    public final void g() {
        byte[] f10 = this.f59070a.f();
        if (this.f59081l == null) {
            androidx.media3.common.a h10 = AbstractC1182o.h(f10, this.f59075f, this.f59072c, this.f59073d, this.f59074e, null);
            this.f59081l = h10;
            this.f59076g.c(h10);
        }
        this.f59082m = AbstractC1182o.b(f10);
        this.f59080k = com.google.common.primitives.f.e(Z.o1(AbstractC1182o.g(f10), this.f59081l.f20519G));
    }

    public final void h() {
        AbstractC1182o.b i10 = AbstractC1182o.i(this.f59070a.f());
        k(i10);
        this.f59082m = i10.f4474d;
        long j10 = i10.f4475e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f59080k = j10;
    }

    public final void i() {
        AbstractC1182o.b k10 = AbstractC1182o.k(this.f59070a.f(), this.f59071b);
        if (this.f59083n == 3) {
            k(k10);
        }
        this.f59082m = k10.f4474d;
        long j10 = k10.f4475e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f59080k = j10;
    }

    public final boolean j(e1.J j10) {
        while (j10.a() > 0) {
            int i10 = this.f59079j << 8;
            this.f59079j = i10;
            int M10 = i10 | j10.M();
            this.f59079j = M10;
            int c10 = AbstractC1182o.c(M10);
            this.f59083n = c10;
            if (c10 != 0) {
                byte[] f10 = this.f59070a.f();
                int i11 = this.f59079j;
                f10[0] = (byte) ((i11 >> 24) & 255);
                f10[1] = (byte) ((i11 >> 16) & 255);
                f10[2] = (byte) ((i11 >> 8) & 255);
                f10[3] = (byte) (i11 & 255);
                this.f59078i = 4;
                this.f59079j = 0;
                return true;
            }
        }
        return false;
    }

    public final void k(AbstractC1182o.b bVar) {
        int i10;
        int i11 = bVar.f4472b;
        if (i11 == -2147483647 || (i10 = bVar.f4473c) == -1) {
            return;
        }
        androidx.media3.common.a aVar = this.f59081l;
        if (aVar != null && i10 == aVar.f20518F && i11 == aVar.f20519G && Objects.equals(bVar.f4471a, aVar.f20543o)) {
            return;
        }
        androidx.media3.common.a aVar2 = this.f59081l;
        androidx.media3.common.a P10 = (aVar2 == null ? new a.b() : aVar2.b()).j0(this.f59075f).W(this.f59074e).y0(bVar.f4471a).T(bVar.f4473c).z0(bVar.f4472b).n0(this.f59072c).w0(this.f59073d).P();
        this.f59081l = P10;
        this.f59076g.c(P10);
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
    }
}
