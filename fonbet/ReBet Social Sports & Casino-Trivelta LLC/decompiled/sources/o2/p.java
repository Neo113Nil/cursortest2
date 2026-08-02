package o2;

import android.util.SparseArray;
import androidx.media3.common.a;
import b1.C2357k;
import e1.AbstractC4134a;
import e1.AbstractC4144k;
import e1.Z;
import f1.AbstractC4230h;
import f1.C4232j;
import java.util.ArrayList;
import java.util.Arrays;
import o2.L;

/* loaded from: classes.dex */
public final class p implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final C5780G f59135a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f59136b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59137c;

    /* renamed from: d, reason: collision with root package name */
    public final String f59138d;

    /* renamed from: h, reason: collision with root package name */
    public long f59142h;

    /* renamed from: i, reason: collision with root package name */
    public String f59143i;

    /* renamed from: j, reason: collision with root package name */
    public H1.O f59144j;

    /* renamed from: k, reason: collision with root package name */
    public b f59145k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f59146l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f59148n;
    private final boolean[] prefixFlags = new boolean[3];

    /* renamed from: e, reason: collision with root package name */
    public final w f59139e = new w(7, 128);

    /* renamed from: f, reason: collision with root package name */
    public final w f59140f = new w(8, 128);

    /* renamed from: g, reason: collision with root package name */
    public final w f59141g = new w(6, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f59147m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final e1.J f59149o = new e1.J();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final H1.O f59150a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f59151b;
        private byte[] buffer;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f59152c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f59153d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f59154e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final C4232j f59155f;

        /* renamed from: g, reason: collision with root package name */
        public int f59156g;

        /* renamed from: h, reason: collision with root package name */
        public int f59157h;

        /* renamed from: i, reason: collision with root package name */
        public long f59158i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f59159j;

        /* renamed from: k, reason: collision with root package name */
        public long f59160k;

        /* renamed from: l, reason: collision with root package name */
        public a f59161l;

        /* renamed from: m, reason: collision with root package name */
        public a f59162m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f59163n;

        /* renamed from: o, reason: collision with root package name */
        public long f59164o;

        /* renamed from: p, reason: collision with root package name */
        public long f59165p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f59166q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f59167r;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f59168a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f59169b;

            /* renamed from: c, reason: collision with root package name */
            public AbstractC4230h.m f59170c;

            /* renamed from: d, reason: collision with root package name */
            public int f59171d;

            /* renamed from: e, reason: collision with root package name */
            public int f59172e;

            /* renamed from: f, reason: collision with root package name */
            public int f59173f;

            /* renamed from: g, reason: collision with root package name */
            public int f59174g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f59175h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f59176i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f59177j;

            /* renamed from: k, reason: collision with root package name */
            public boolean f59178k;

            /* renamed from: l, reason: collision with root package name */
            public int f59179l;

            /* renamed from: m, reason: collision with root package name */
            public int f59180m;

            /* renamed from: n, reason: collision with root package name */
            public int f59181n;

            /* renamed from: o, reason: collision with root package name */
            public int f59182o;

            /* renamed from: p, reason: collision with root package name */
            public int f59183p;

            public a() {
            }

            public void b() {
                this.f59169b = false;
                this.f59168a = false;
            }

            public final boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f59168a) {
                    return false;
                }
                if (!aVar.f59168a) {
                    return true;
                }
                AbstractC4230h.m mVar = (AbstractC4230h.m) AbstractC4134a.i(this.f59170c);
                AbstractC4230h.m mVar2 = (AbstractC4230h.m) AbstractC4134a.i(aVar.f59170c);
                return (this.f59173f == aVar.f59173f && this.f59174g == aVar.f59174g && this.f59175h == aVar.f59175h && (!this.f59176i || !aVar.f59176i || this.f59177j == aVar.f59177j) && (((i10 = this.f59171d) == (i11 = aVar.f59171d) || (i10 != 0 && i11 != 0)) && (((i12 = mVar.f46253n) != 0 || mVar2.f46253n != 0 || (this.f59180m == aVar.f59180m && this.f59181n == aVar.f59181n)) && ((i12 != 1 || mVar2.f46253n != 1 || (this.f59182o == aVar.f59182o && this.f59183p == aVar.f59183p)) && (z10 = this.f59178k) == aVar.f59178k && (!z10 || this.f59179l == aVar.f59179l))))) ? false : true;
            }

            public boolean d() {
                if (!this.f59169b) {
                    return false;
                }
                int i10 = this.f59172e;
                return i10 == 7 || i10 == 2;
            }

            public void e(AbstractC4230h.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f59170c = mVar;
                this.f59171d = i10;
                this.f59172e = i11;
                this.f59173f = i12;
                this.f59174g = i13;
                this.f59175h = z10;
                this.f59176i = z11;
                this.f59177j = z12;
                this.f59178k = z13;
                this.f59179l = i14;
                this.f59180m = i15;
                this.f59181n = i16;
                this.f59182o = i17;
                this.f59183p = i18;
                this.f59168a = true;
                this.f59169b = true;
            }

            public void f(int i10) {
                this.f59172e = i10;
                this.f59169b = true;
            }
        }

        public b(H1.O o10, boolean z10, boolean z11) {
            this.f59150a = o10;
            this.f59151b = z10;
            this.f59152c = z11;
            this.f59161l = new a();
            this.f59162m = new a();
            byte[] bArr = new byte[128];
            this.buffer = bArr;
            this.f59155f = new C4232j(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            if (this.f59159j) {
                int i18 = i11 - i10;
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i19 = this.f59156g;
                if (length < i19 + i18) {
                    this.buffer = Arrays.copyOf(bArr2, (i19 + i18) * 2);
                }
                System.arraycopy(bArr, i10, this.buffer, this.f59156g, i18);
                int i20 = this.f59156g + i18;
                this.f59156g = i20;
                this.f59155f.j(this.buffer, 0, i20);
                if (this.f59155f.c(8)) {
                    this.f59155f.l();
                    int f10 = this.f59155f.f(2);
                    this.f59155f.m(5);
                    if (this.f59155f.d()) {
                        this.f59155f.i();
                        if (this.f59155f.d()) {
                            int i21 = this.f59155f.i();
                            if (!this.f59152c) {
                                this.f59159j = false;
                                this.f59162m.f(i21);
                                return;
                            }
                            if (this.f59155f.d()) {
                                int i22 = this.f59155f.i();
                                if (this.f59154e.indexOfKey(i22) < 0) {
                                    this.f59159j = false;
                                    return;
                                }
                                AbstractC4230h.l lVar = (AbstractC4230h.l) this.f59154e.get(i22);
                                AbstractC4230h.m mVar = (AbstractC4230h.m) this.f59153d.get(lVar.f46238b);
                                if (mVar.f46250k) {
                                    if (!this.f59155f.c(2)) {
                                        return;
                                    } else {
                                        this.f59155f.m(2);
                                    }
                                }
                                if (this.f59155f.c(mVar.f46252m)) {
                                    int f11 = this.f59155f.f(mVar.f46252m);
                                    if (mVar.f46251l) {
                                        z10 = false;
                                        z11 = false;
                                    } else {
                                        if (!this.f59155f.c(1)) {
                                            return;
                                        }
                                        boolean e10 = this.f59155f.e();
                                        if (e10) {
                                            if (this.f59155f.c(1)) {
                                                z10 = e10;
                                                z11 = true;
                                                z12 = this.f59155f.e();
                                                z13 = this.f59157h != 5;
                                                if (z13) {
                                                    i12 = 0;
                                                } else if (!this.f59155f.d()) {
                                                    return;
                                                } else {
                                                    i12 = this.f59155f.i();
                                                }
                                                i13 = mVar.f46253n;
                                                if (i13 != 0) {
                                                    if (!this.f59155f.c(mVar.f46254o)) {
                                                        return;
                                                    }
                                                    int f12 = this.f59155f.f(mVar.f46254o);
                                                    if (lVar.f46239c && !z10) {
                                                        if (this.f59155f.d()) {
                                                            i15 = this.f59155f.h();
                                                            i14 = f12;
                                                            i16 = 0;
                                                            i17 = i16;
                                                            this.f59162m.e(mVar, f10, i21, f11, i22, z10, z11, z12, z13, i12, i14, i15, i16, i17);
                                                            this.f59159j = false;
                                                        }
                                                        return;
                                                    }
                                                    i14 = f12;
                                                    i15 = 0;
                                                } else {
                                                    if (i13 == 1 && !mVar.f46255p) {
                                                        if (this.f59155f.d()) {
                                                            int h10 = this.f59155f.h();
                                                            if (!lVar.f46239c || z10) {
                                                                i16 = h10;
                                                                i14 = 0;
                                                                i15 = 0;
                                                                i17 = 0;
                                                            } else {
                                                                if (!this.f59155f.d()) {
                                                                    return;
                                                                }
                                                                i17 = this.f59155f.h();
                                                                i16 = h10;
                                                                i14 = 0;
                                                                i15 = 0;
                                                            }
                                                            this.f59162m.e(mVar, f10, i21, f11, i22, z10, z11, z12, z13, i12, i14, i15, i16, i17);
                                                            this.f59159j = false;
                                                        }
                                                        return;
                                                    }
                                                    i14 = 0;
                                                    i15 = 0;
                                                }
                                                i16 = i15;
                                                i17 = i16;
                                                this.f59162m.e(mVar, f10, i21, f11, i22, z10, z11, z12, z13, i12, i14, i15, i16, i17);
                                                this.f59159j = false;
                                            }
                                            return;
                                        }
                                        z10 = e10;
                                        z11 = false;
                                    }
                                    z12 = z11;
                                    if (this.f59157h != 5) {
                                    }
                                    if (z13) {
                                    }
                                    i13 = mVar.f46253n;
                                    if (i13 != 0) {
                                    }
                                    i16 = i15;
                                    i17 = i16;
                                    this.f59162m.e(mVar, f10, i21, f11, i22, z10, z11, z12, z13, i12, i14, i15, i16, i17);
                                    this.f59159j = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j10, int i10, boolean z10) {
            if (this.f59157h == 9 || (this.f59152c && this.f59162m.c(this.f59161l))) {
                if (z10 && this.f59163n) {
                    d(i10 + ((int) (j10 - this.f59158i)));
                }
                this.f59164o = this.f59158i;
                this.f59165p = this.f59160k;
                this.f59166q = false;
                this.f59163n = true;
            }
            h();
            this.f59157h = 24;
            return this.f59166q;
        }

        public boolean c() {
            return this.f59152c;
        }

        public final void d(int i10) {
            long j10 = this.f59165p;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f59158i;
                long j12 = this.f59164o;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f59150a.g(j10, this.f59166q ? 1 : 0, i11, i10, null);
            }
        }

        public void e(AbstractC4230h.l lVar) {
            this.f59154e.append(lVar.f46237a, lVar);
        }

        public void f(AbstractC4230h.m mVar) {
            this.f59153d.append(mVar.f46243d, mVar);
        }

        public void g() {
            this.f59159j = false;
            this.f59163n = false;
            this.f59162m.b();
        }

        public final void h() {
            boolean d10 = this.f59151b ? this.f59162m.d() : this.f59167r;
            boolean z10 = this.f59166q;
            int i10 = this.f59157h;
            boolean z11 = true;
            if (i10 != 5 && (!d10 || i10 != 1)) {
                z11 = false;
            }
            this.f59166q = z10 | z11;
        }

        public void i(long j10, int i10, long j11, boolean z10) {
            this.f59157h = i10;
            this.f59160k = j11;
            this.f59158i = j10;
            this.f59167r = z10;
            if (!this.f59151b || i10 != 1) {
                if (!this.f59152c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f59161l;
            this.f59161l = this.f59162m;
            this.f59162m = aVar;
            aVar.b();
            this.f59156g = 0;
            this.f59159j = true;
        }
    }

    public p(C5780G c5780g, boolean z10, boolean z11, String str) {
        this.f59135a = c5780g;
        this.f59136b = z10;
        this.f59137c = z11;
        this.f59138d = str;
    }

    private void f() {
        AbstractC4134a.i(this.f59144j);
        Z.i(this.f59145k);
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        int i10;
        f();
        int g10 = j10.g();
        int j11 = j10.j();
        byte[] f10 = j10.f();
        this.f59142h += j10.a();
        this.f59144j.a(j10, j10.a());
        while (true) {
            int e10 = AbstractC4230h.e(f10, g10, j11, this.prefixFlags);
            if (e10 == j11) {
                h(f10, g10, j11);
                return;
            }
            int j12 = AbstractC4230h.j(f10, e10);
            if (e10 <= 0 || f10[e10 - 1] != 0) {
                i10 = 3;
            } else {
                e10--;
                i10 = 4;
            }
            int i11 = e10;
            int i12 = i10;
            int i13 = i11 - g10;
            if (i13 > 0) {
                h(f10, g10, i11);
            }
            int i14 = j11 - i11;
            long j13 = this.f59142h - i14;
            g(j13, i14, i13 < 0 ? -i13 : 0, this.f59147m);
            i(j13, j12, this.f59147m);
            g10 = i11 + i12;
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59142h = 0L;
        this.f59148n = false;
        this.f59147m = -9223372036854775807L;
        AbstractC4230h.c(this.prefixFlags);
        this.f59139e.d();
        this.f59140f.d();
        this.f59141g.d();
        this.f59135a.b();
        b bVar = this.f59145k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
        f();
        if (z10) {
            this.f59135a.e();
            g(this.f59142h, 0, 0, this.f59147m);
            i(this.f59142h, 9, this.f59147m);
            g(this.f59142h, 0, 0, this.f59147m);
        }
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59143i = dVar.b();
        H1.O c10 = rVar.c(dVar.c(), 2);
        this.f59144j = c10;
        this.f59145k = new b(c10, this.f59136b, this.f59137c);
        this.f59135a.d(rVar, dVar);
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59147m = j10;
        this.f59148n |= (i10 & 2) != 0;
    }

    public final void g(long j10, int i10, int i11, long j11) {
        if (!this.f59146l || this.f59145k.c()) {
            this.f59139e.b(i11);
            this.f59140f.b(i11);
            if (this.f59146l) {
                if (this.f59139e.c()) {
                    w wVar = this.f59139e;
                    AbstractC4230h.m C10 = AbstractC4230h.C(wVar.nalData, 3, wVar.f59286d);
                    this.f59135a.f(C10.f46259t);
                    this.f59145k.f(C10);
                    this.f59139e.d();
                } else if (this.f59140f.c()) {
                    w wVar2 = this.f59140f;
                    this.f59145k.e(AbstractC4230h.A(wVar2.nalData, 3, wVar2.f59286d));
                    this.f59140f.d();
                }
            } else if (this.f59139e.c() && this.f59140f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f59139e;
                arrayList.add(Arrays.copyOf(wVar3.nalData, wVar3.f59286d));
                w wVar4 = this.f59140f;
                arrayList.add(Arrays.copyOf(wVar4.nalData, wVar4.f59286d));
                w wVar5 = this.f59139e;
                AbstractC4230h.m C11 = AbstractC4230h.C(wVar5.nalData, 3, wVar5.f59286d);
                w wVar6 = this.f59140f;
                AbstractC4230h.l A10 = AbstractC4230h.A(wVar6.nalData, 3, wVar6.f59286d);
                this.f59144j.c(new a.b().j0(this.f59143i).W(this.f59138d).y0("video/avc").U(AbstractC4144k.f(C11.f46240a, C11.f46241b, C11.f46242c)).F0(C11.f46245f).h0(C11.f46246g).V(new C2357k.b().d(C11.f46256q).c(C11.f46257r).e(C11.f46258s).g(C11.f46248i + 8).b(C11.f46249j + 8).a()).u0(C11.f46247h).k0(arrayList).p0(C11.f46259t).P());
                this.f59146l = true;
                this.f59135a.f(C11.f46259t);
                this.f59145k.f(C11);
                this.f59145k.e(A10);
                this.f59139e.d();
                this.f59140f.d();
            }
        }
        if (this.f59141g.b(i11)) {
            w wVar7 = this.f59141g;
            this.f59149o.Z(this.f59141g.nalData, AbstractC4230h.L(wVar7.nalData, wVar7.f59286d));
            this.f59149o.b0(4);
            this.f59135a.c(j11, this.f59149o);
        }
        if (this.f59145k.b(j10, i10, this.f59146l)) {
            this.f59148n = false;
        }
    }

    public final void h(byte[] bArr, int i10, int i11) {
        if (!this.f59146l || this.f59145k.c()) {
            this.f59139e.a(bArr, i10, i11);
            this.f59140f.a(bArr, i10, i11);
        }
        this.f59141g.a(bArr, i10, i11);
        this.f59145k.a(bArr, i10, i11);
    }

    public final void i(long j10, int i10, long j11) {
        if (!this.f59146l || this.f59145k.c()) {
            this.f59139e.e(i10);
            this.f59140f.e(i10);
        }
        this.f59141g.e(i10);
        this.f59145k.i(j10, i10, j11, this.f59148n);
    }
}
