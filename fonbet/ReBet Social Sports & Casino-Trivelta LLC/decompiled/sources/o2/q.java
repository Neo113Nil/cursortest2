package o2;

import androidx.media3.common.a;
import b1.C2357k;
import e1.AbstractC4134a;
import e1.AbstractC4144k;
import e1.Z;
import f1.AbstractC4230h;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;
import o2.L;

/* loaded from: classes.dex */
public final class q implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final C5780G f59184a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59185b;

    /* renamed from: c, reason: collision with root package name */
    public String f59186c;

    /* renamed from: d, reason: collision with root package name */
    public H1.O f59187d;

    /* renamed from: e, reason: collision with root package name */
    public a f59188e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f59189f;

    /* renamed from: l, reason: collision with root package name */
    public long f59195l;
    private final boolean[] prefixFlags = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final w f59190g = new w(32, 128);

    /* renamed from: h, reason: collision with root package name */
    public final w f59191h = new w(33, 128);

    /* renamed from: i, reason: collision with root package name */
    public final w f59192i = new w(34, 128);

    /* renamed from: j, reason: collision with root package name */
    public final w f59193j = new w(39, 128);

    /* renamed from: k, reason: collision with root package name */
    public final w f59194k = new w(40, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f59196m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final e1.J f59197n = new e1.J();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final H1.O f59198a;

        /* renamed from: b, reason: collision with root package name */
        public long f59199b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f59200c;

        /* renamed from: d, reason: collision with root package name */
        public int f59201d;

        /* renamed from: e, reason: collision with root package name */
        public long f59202e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f59203f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f59204g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f59205h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f59206i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f59207j;

        /* renamed from: k, reason: collision with root package name */
        public long f59208k;

        /* renamed from: l, reason: collision with root package name */
        public long f59209l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f59210m;

        public a(H1.O o10) {
            this.f59198a = o10;
        }

        public static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        public static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f59207j && this.f59204g) {
                this.f59210m = this.f59200c;
                this.f59207j = false;
            } else if (this.f59205h || this.f59204g) {
                if (z10 && this.f59206i) {
                    d(i10 + ((int) (j10 - this.f59199b)));
                }
                this.f59208k = this.f59199b;
                this.f59209l = this.f59202e;
                this.f59210m = this.f59200c;
                this.f59206i = true;
            }
        }

        public final void d(int i10) {
            long j10 = this.f59209l;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f59199b;
                long j12 = this.f59208k;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f59198a.g(j10, this.f59210m ? 1 : 0, i11, i10, null);
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f59203f) {
                int i12 = this.f59201d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f59201d = i12 + (i11 - i10);
                } else {
                    this.f59204g = (bArr[i13] & ByteCompanionObject.MIN_VALUE) != 0;
                    this.f59203f = false;
                }
            }
        }

        public void f() {
            this.f59203f = false;
            this.f59204g = false;
            this.f59205h = false;
            this.f59206i = false;
            this.f59207j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f59204g = false;
            this.f59205h = false;
            this.f59202e = j11;
            this.f59201d = 0;
            this.f59199b = j10;
            if (!c(i11)) {
                if (this.f59206i && !this.f59207j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f59206i = false;
                }
                if (b(i11)) {
                    this.f59205h = !this.f59207j;
                    this.f59207j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f59200c = z11;
            this.f59203f = z11 || i11 <= 9;
        }
    }

    public q(C5780G c5780g, String str) {
        this.f59184a = c5780g;
        this.f59185b = str;
    }

    private void f() {
        AbstractC4134a.i(this.f59187d);
        Z.i(this.f59188e);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f59188e.a(j10, i10, this.f59189f);
        if (!this.f59189f) {
            this.f59190g.b(i11);
            this.f59191h.b(i11);
            this.f59192i.b(i11);
            if (this.f59190g.c() && this.f59191h.c() && this.f59192i.c()) {
                androidx.media3.common.a i12 = i(this.f59186c, this.f59190g, this.f59191h, this.f59192i, this.f59185b);
                this.f59187d.c(i12);
                Ra.n.p(i12.f20545q != -1);
                this.f59184a.f(i12.f20545q);
                this.f59189f = true;
            }
        }
        if (this.f59193j.b(i11)) {
            w wVar = this.f59193j;
            this.f59197n.Z(this.f59193j.nalData, AbstractC4230h.L(wVar.nalData, wVar.f59286d));
            this.f59197n.c0(5);
            this.f59184a.c(j11, this.f59197n);
        }
        if (this.f59194k.b(i11)) {
            w wVar2 = this.f59194k;
            this.f59197n.Z(this.f59194k.nalData, AbstractC4230h.L(wVar2.nalData, wVar2.f59286d));
            this.f59197n.c0(5);
            this.f59184a.c(j11, this.f59197n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f59188e.e(bArr, i10, i11);
        if (!this.f59189f) {
            this.f59190g.a(bArr, i10, i11);
            this.f59191h.a(bArr, i10, i11);
            this.f59192i.a(bArr, i10, i11);
        }
        this.f59193j.a(bArr, i10, i11);
        this.f59194k.a(bArr, i10, i11);
    }

    public static androidx.media3.common.a i(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i10 = wVar.f59286d;
        byte[] bArr = new byte[wVar2.f59286d + i10 + wVar3.f59286d];
        System.arraycopy(wVar.nalData, 0, bArr, 0, i10);
        System.arraycopy(wVar2.nalData, 0, bArr, wVar.f59286d, wVar2.f59286d);
        System.arraycopy(wVar3.nalData, 0, bArr, wVar.f59286d + wVar2.f59286d, wVar3.f59286d);
        AbstractC4230h.C0670h u10 = AbstractC4230h.u(wVar2.nalData, 3, wVar2.f59286d, null);
        AbstractC4230h.c cVar = u10.f46214c;
        return new a.b().j0(str).W(str2).y0("video/hevc").U(cVar != null ? AbstractC4144k.j(cVar.f46191a, cVar.f46192b, cVar.f46193c, cVar.f46194d, cVar.constraintBytes, cVar.f46195e) : null).F0(u10.f46219h).h0(u10.f46220i).b0(u10.f46221j).a0(u10.f46222k).V(new C2357k.b().d(u10.f46225n).c(u10.f46226o).e(u10.f46227p).g(u10.f46216e + 8).b(u10.f46217f + 8).a()).u0(u10.f46223l).p0(u10.f46224m).q0(u10.f46213b + 1).k0(Collections.singletonList(bArr)).P();
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        int i10;
        f();
        while (j10.a() > 0) {
            int g10 = j10.g();
            int j11 = j10.j();
            byte[] f10 = j10.f();
            this.f59195l += j10.a();
            this.f59187d.a(j10, j10.a());
            while (g10 < j11) {
                int e10 = AbstractC4230h.e(f10, g10, j11, this.prefixFlags);
                if (e10 == j11) {
                    h(f10, g10, j11);
                    return;
                }
                int i11 = AbstractC4230h.i(f10, e10);
                if (e10 <= 0 || f10[e10 - 1] != 0) {
                    i10 = 3;
                } else {
                    e10--;
                    i10 = 4;
                }
                int i12 = e10;
                int i13 = i10;
                int i14 = i12 - g10;
                if (i14 > 0) {
                    h(f10, g10, i12);
                }
                int i15 = j11 - i12;
                long j12 = this.f59195l - i15;
                g(j12, i15, i14 < 0 ? -i14 : 0, this.f59196m);
                j(j12, i15, i11, this.f59196m);
                g10 = i12 + i13;
            }
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59195l = 0L;
        this.f59196m = -9223372036854775807L;
        AbstractC4230h.c(this.prefixFlags);
        this.f59190g.d();
        this.f59191h.d();
        this.f59192i.d();
        this.f59193j.d();
        this.f59194k.d();
        this.f59184a.b();
        a aVar = this.f59188e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
        f();
        if (z10) {
            this.f59184a.e();
            g(this.f59195l, 0, 0, this.f59196m);
            j(this.f59195l, 0, 48, this.f59196m);
        }
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59186c = dVar.b();
        H1.O c10 = rVar.c(dVar.c(), 2);
        this.f59187d = c10;
        this.f59188e = new a(c10);
        this.f59184a.d(rVar, dVar);
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59196m = j10;
    }

    public final void j(long j10, int i10, int i11, long j11) {
        this.f59188e.g(j10, i10, i11, j11, this.f59189f);
        if (!this.f59189f) {
            this.f59190g.e(i11);
            this.f59191h.e(i11);
            this.f59192i.e(i11);
        }
        this.f59193j.e(i11);
        this.f59194k.e(i11);
    }
}
