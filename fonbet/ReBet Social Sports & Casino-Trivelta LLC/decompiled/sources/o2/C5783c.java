package o2;

import H1.AbstractC1169b;
import androidx.media3.common.a;
import e1.AbstractC4134a;
import java.util.Objects;
import o2.L;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5783c implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final e1.I f58999a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.J f59000b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59001c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59002d;

    /* renamed from: e, reason: collision with root package name */
    public final String f59003e;

    /* renamed from: f, reason: collision with root package name */
    public String f59004f;

    /* renamed from: g, reason: collision with root package name */
    public H1.O f59005g;

    /* renamed from: h, reason: collision with root package name */
    public int f59006h;

    /* renamed from: i, reason: collision with root package name */
    public int f59007i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59008j;

    /* renamed from: k, reason: collision with root package name */
    public long f59009k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.media3.common.a f59010l;

    /* renamed from: m, reason: collision with root package name */
    public int f59011m;

    /* renamed from: n, reason: collision with root package name */
    public long f59012n;

    public C5783c(String str) {
        this(null, 0, str);
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        AbstractC4134a.i(this.f59005g);
        while (j10.a() > 0) {
            int i10 = this.f59006h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(j10.a(), this.f59011m - this.f59007i);
                        this.f59005g.a(j10, min);
                        int i11 = this.f59007i + min;
                        this.f59007i = i11;
                        if (i11 == this.f59011m) {
                            AbstractC4134a.g(this.f59012n != -9223372036854775807L);
                            this.f59005g.g(this.f59012n, 1, this.f59011m, 0, null);
                            this.f59012n += this.f59009k;
                            this.f59006h = 0;
                        }
                    }
                } else if (f(j10, this.f59000b.f(), 128)) {
                    g();
                    this.f59000b.b0(0);
                    this.f59005g.a(this.f59000b, 128);
                    this.f59006h = 2;
                }
            } else if (h(j10)) {
                this.f59006h = 1;
                this.f59000b.f()[0] = 11;
                this.f59000b.f()[1] = 119;
                this.f59007i = 2;
            }
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59006h = 0;
        this.f59007i = 0;
        this.f59008j = false;
        this.f59012n = -9223372036854775807L;
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59004f = dVar.b();
        this.f59005g = rVar.c(dVar.c(), 1);
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59012n = j10;
    }

    public final boolean f(e1.J j10, byte[] bArr, int i10) {
        int min = Math.min(j10.a(), i10 - this.f59007i);
        j10.q(bArr, this.f59007i, min);
        int i11 = this.f59007i + min;
        this.f59007i = i11;
        return i11 == i10;
    }

    public final void g() {
        this.f58999a.p(0);
        AbstractC1169b.C0095b f10 = AbstractC1169b.f(this.f58999a);
        androidx.media3.common.a aVar = this.f59010l;
        if (aVar == null || f10.f4383d != aVar.f20518F || f10.f4382c != aVar.f20519G || !Objects.equals(f10.f4380a, aVar.f20543o)) {
            a.b t02 = new a.b().j0(this.f59004f).W(this.f59003e).y0(f10.f4380a).T(f10.f4383d).z0(f10.f4382c).n0(this.f59001c).w0(this.f59002d).t0(f10.f4386g);
            if ("audio/ac3".equals(f10.f4380a)) {
                t02.S(f10.f4386g);
            }
            androidx.media3.common.a P10 = t02.P();
            this.f59010l = P10;
            this.f59005g.c(P10);
        }
        this.f59011m = f10.f4384e;
        this.f59009k = (f10.f4385f * 1000000) / this.f59010l.f20519G;
    }

    public final boolean h(e1.J j10) {
        while (true) {
            if (j10.a() <= 0) {
                return false;
            }
            if (this.f59008j) {
                int M10 = j10.M();
                if (M10 == 119) {
                    this.f59008j = false;
                    return true;
                }
                this.f59008j = M10 == 11;
            } else {
                this.f59008j = j10.M() == 11;
            }
        }
    }

    public C5783c(String str, int i10, String str2) {
        e1.I i11 = new e1.I(new byte[128]);
        this.f58999a = i11;
        this.f59000b = new e1.J(i11.data);
        this.f59006h = 0;
        this.f59012n = -9223372036854775807L;
        this.f59001c = str;
        this.f59002d = i10;
        this.f59003e = str2;
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
    }
}
