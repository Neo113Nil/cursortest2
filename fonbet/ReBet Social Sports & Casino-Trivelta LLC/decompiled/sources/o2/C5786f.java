package o2;

import H1.AbstractC1170c;
import androidx.media3.common.a;
import e1.AbstractC4134a;
import o2.L;

/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5786f implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final e1.I f59017a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.J f59018b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59019c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59020d;

    /* renamed from: e, reason: collision with root package name */
    public final String f59021e;

    /* renamed from: f, reason: collision with root package name */
    public String f59022f;

    /* renamed from: g, reason: collision with root package name */
    public H1.O f59023g;

    /* renamed from: h, reason: collision with root package name */
    public int f59024h;

    /* renamed from: i, reason: collision with root package name */
    public int f59025i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59026j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59027k;

    /* renamed from: l, reason: collision with root package name */
    public long f59028l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.media3.common.a f59029m;

    /* renamed from: n, reason: collision with root package name */
    public int f59030n;

    /* renamed from: o, reason: collision with root package name */
    public long f59031o;

    public C5786f(String str) {
        this(null, 0, str);
    }

    private boolean f(e1.J j10, byte[] bArr, int i10) {
        int min = Math.min(j10.a(), i10 - this.f59025i);
        j10.q(bArr, this.f59025i, min);
        int i11 = this.f59025i + min;
        this.f59025i = i11;
        return i11 == i10;
    }

    private void g() {
        this.f59017a.p(0);
        AbstractC1170c.C0096c g10 = AbstractC1170c.g(this.f59017a);
        androidx.media3.common.a aVar = this.f59029m;
        if (aVar == null || g10.f4396c != aVar.f20518F || g10.f4395b != aVar.f20519G || !"audio/ac4".equals(aVar.f20543o)) {
            androidx.media3.common.a P10 = new a.b().j0(this.f59022f).W(this.f59021e).y0("audio/ac4").T(g10.f4396c).z0(g10.f4395b).n0(this.f59019c).w0(this.f59020d).P();
            this.f59029m = P10;
            this.f59023g.c(P10);
        }
        this.f59030n = g10.f4397d;
        this.f59028l = (g10.f4398e * 1000000) / this.f59029m.f20519G;
    }

    private boolean h(e1.J j10) {
        int M10;
        while (true) {
            if (j10.a() <= 0) {
                return false;
            }
            if (this.f59026j) {
                M10 = j10.M();
                this.f59026j = M10 == 172;
                if (M10 == 64 || M10 == 65) {
                    break;
                }
            } else {
                this.f59026j = j10.M() == 172;
            }
        }
        this.f59027k = M10 == 65;
        return true;
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        AbstractC4134a.i(this.f59023g);
        while (j10.a() > 0) {
            int i10 = this.f59024h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(j10.a(), this.f59030n - this.f59025i);
                        this.f59023g.a(j10, min);
                        int i11 = this.f59025i + min;
                        this.f59025i = i11;
                        if (i11 == this.f59030n) {
                            AbstractC4134a.g(this.f59031o != -9223372036854775807L);
                            this.f59023g.g(this.f59031o, 1, this.f59030n, 0, null);
                            this.f59031o += this.f59028l;
                            this.f59024h = 0;
                        }
                    }
                } else if (f(j10, this.f59018b.f(), 16)) {
                    g();
                    this.f59018b.b0(0);
                    this.f59023g.a(this.f59018b, 16);
                    this.f59024h = 2;
                }
            } else if (h(j10)) {
                this.f59024h = 1;
                this.f59018b.f()[0] = -84;
                this.f59018b.f()[1] = (byte) (this.f59027k ? 65 : 64);
                this.f59025i = 2;
            }
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59024h = 0;
        this.f59025i = 0;
        this.f59026j = false;
        this.f59027k = false;
        this.f59031o = -9223372036854775807L;
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59022f = dVar.b();
        this.f59023g = rVar.c(dVar.c(), 1);
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59031o = j10;
    }

    public C5786f(String str, int i10, String str2) {
        e1.I i11 = new e1.I(new byte[16]);
        this.f59017a = i11;
        this.f59018b = new e1.J(i11.data);
        this.f59024h = 0;
        this.f59025i = 0;
        this.f59026j = false;
        this.f59027k = false;
        this.f59031o = -9223372036854775807L;
        this.f59019c = str;
        this.f59020d = i10;
        this.f59021e = str2;
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
    }
}
