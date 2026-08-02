package o2;

import H1.F;
import androidx.media3.common.a;
import e1.AbstractC4134a;
import kotlin.UByte;
import o2.L;

/* loaded from: classes.dex */
public final class t implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final e1.J f59241a;

    /* renamed from: b, reason: collision with root package name */
    public final F.a f59242b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59243c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59244d;

    /* renamed from: e, reason: collision with root package name */
    public final String f59245e;

    /* renamed from: f, reason: collision with root package name */
    public H1.O f59246f;

    /* renamed from: g, reason: collision with root package name */
    public String f59247g;

    /* renamed from: h, reason: collision with root package name */
    public int f59248h;

    /* renamed from: i, reason: collision with root package name */
    public int f59249i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59250j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59251k;

    /* renamed from: l, reason: collision with root package name */
    public long f59252l;

    /* renamed from: m, reason: collision with root package name */
    public int f59253m;

    /* renamed from: n, reason: collision with root package name */
    public long f59254n;

    public t(String str) {
        this(null, 0, str);
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        AbstractC4134a.i(this.f59246f);
        while (j10.a() > 0) {
            int i10 = this.f59248h;
            if (i10 == 0) {
                f(j10);
            } else if (i10 == 1) {
                h(j10);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(j10);
            }
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59248h = 0;
        this.f59249i = 0;
        this.f59251k = false;
        this.f59254n = -9223372036854775807L;
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59247g = dVar.b();
        this.f59246f = rVar.c(dVar.c(), 1);
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59254n = j10;
    }

    public final void f(e1.J j10) {
        byte[] f10 = j10.f();
        int j11 = j10.j();
        for (int g10 = j10.g(); g10 < j11; g10++) {
            byte b10 = f10[g10];
            boolean z10 = (b10 & UByte.MAX_VALUE) == 255;
            boolean z11 = this.f59251k && (b10 & 224) == 224;
            this.f59251k = z10;
            if (z11) {
                j10.b0(g10 + 1);
                this.f59251k = false;
                this.f59241a.f()[1] = f10[g10];
                this.f59249i = 2;
                this.f59248h = 1;
                return;
            }
        }
        j10.b0(j11);
    }

    public final void g(e1.J j10) {
        int min = Math.min(j10.a(), this.f59253m - this.f59249i);
        this.f59246f.a(j10, min);
        int i10 = this.f59249i + min;
        this.f59249i = i10;
        if (i10 < this.f59253m) {
            return;
        }
        AbstractC4134a.g(this.f59254n != -9223372036854775807L);
        this.f59246f.g(this.f59254n, 1, this.f59253m, 0, null);
        this.f59254n += this.f59252l;
        this.f59249i = 0;
        this.f59248h = 0;
    }

    public final void h(e1.J j10) {
        int min = Math.min(j10.a(), 4 - this.f59249i);
        j10.q(this.f59241a.f(), this.f59249i, min);
        int i10 = this.f59249i + min;
        this.f59249i = i10;
        if (i10 < 4) {
            return;
        }
        this.f59241a.b0(0);
        if (!this.f59242b.a(this.f59241a.v())) {
            this.f59249i = 0;
            this.f59248h = 1;
            return;
        }
        this.f59253m = this.f59242b.f4328c;
        if (!this.f59250j) {
            this.f59252l = (r8.f4332g * 1000000) / r8.f4329d;
            this.f59246f.c(new a.b().j0(this.f59247g).W(this.f59245e).y0(this.f59242b.f4327b).o0(4096).T(this.f59242b.f4330e).z0(this.f59242b.f4329d).n0(this.f59243c).w0(this.f59244d).P());
            this.f59250j = true;
        }
        this.f59241a.b0(0);
        this.f59246f.a(this.f59241a, 4);
        this.f59248h = 2;
    }

    public t(String str, int i10, String str2) {
        this.f59248h = 0;
        e1.J j10 = new e1.J(4);
        this.f59241a = j10;
        j10.f()[0] = -1;
        this.f59242b = new F.a();
        this.f59254n = -9223372036854775807L;
        this.f59243c = str;
        this.f59244d = i10;
        this.f59245e = str2;
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
    }
}
