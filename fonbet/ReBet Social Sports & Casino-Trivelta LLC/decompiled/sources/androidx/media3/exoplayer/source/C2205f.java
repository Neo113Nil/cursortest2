package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.D;
import b1.AbstractC2346O;
import e1.AbstractC4134a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: androidx.media3.exoplayer.source.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2205f extends o0 {

    /* renamed from: m, reason: collision with root package name */
    public final long f21726m;

    /* renamed from: n, reason: collision with root package name */
    public final long f21727n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f21728o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f21729p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f21730q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f21731r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f21732s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC2346O.c f21733t;

    /* renamed from: u, reason: collision with root package name */
    public c f21734u;

    /* renamed from: v, reason: collision with root package name */
    public d f21735v;

    /* renamed from: w, reason: collision with root package name */
    public long f21736w;

    /* renamed from: x, reason: collision with root package name */
    public long f21737x;

    /* renamed from: androidx.media3.exoplayer.source.f$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final D f21738a;

        /* renamed from: b, reason: collision with root package name */
        public long f21739b;

        /* renamed from: e, reason: collision with root package name */
        public boolean f21742e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f21743f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f21744g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f21745h;

        /* renamed from: d, reason: collision with root package name */
        public boolean f21741d = true;

        /* renamed from: c, reason: collision with root package name */
        public long f21740c = Long.MIN_VALUE;

        public b(D d10) {
            this.f21738a = (D) AbstractC4134a.e(d10);
        }

        public C2205f h() {
            this.f21745h = true;
            return new C2205f(this);
        }

        public b i(boolean z10) {
            AbstractC4134a.g(!this.f21745h);
            this.f21742e = z10;
            return this;
        }

        public b j(boolean z10) {
            AbstractC4134a.g(!this.f21745h);
            this.f21744g = z10;
            return this;
        }

        public b k(boolean z10) {
            AbstractC4134a.g(!this.f21745h);
            this.f21741d = z10;
            return this;
        }

        public b l(long j10) {
            AbstractC4134a.g(!this.f21745h);
            this.f21740c = j10;
            return this;
        }

        public b m(boolean z10) {
            AbstractC4134a.g(!this.f21745h);
            this.f21743f = z10;
            return this;
        }

        public b n(long j10) {
            AbstractC4134a.a(j10 >= 0);
            AbstractC4134a.g(!this.f21745h);
            this.f21739b = j10;
            return this;
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.f$c */
    public static final class c extends AbstractC2221w {

        /* renamed from: f, reason: collision with root package name */
        public final long f21746f;

        /* renamed from: g, reason: collision with root package name */
        public final long f21747g;

        /* renamed from: h, reason: collision with root package name */
        public final long f21748h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f21749i;

        public c(AbstractC2346O abstractC2346O, long j10, long j11, boolean z10) {
            super(abstractC2346O);
            if (j11 != Long.MIN_VALUE && j11 < j10) {
                throw new d(2, j10, j11);
            }
            boolean z11 = false;
            if (abstractC2346O.i() != 1) {
                throw new d(0);
            }
            AbstractC2346O.c n10 = abstractC2346O.n(0, new AbstractC2346O.c());
            long max = Math.max(0L, j10);
            if (!z10 && !n10.f24387k && max != 0 && !n10.f24384h) {
                throw new d(1);
            }
            long max2 = j11 == Long.MIN_VALUE ? n10.f24389m : Math.max(0L, j11);
            long j12 = n10.f24389m;
            if (j12 != -9223372036854775807L) {
                max2 = max2 > j12 ? j12 : max2;
                if (max > max2) {
                    max = max2;
                }
            }
            this.f21746f = max;
            this.f21747g = max2;
            this.f21748h = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (n10.f24385i && (max2 == -9223372036854775807L || (j12 != -9223372036854775807L && max2 == j12))) {
                z11 = true;
            }
            this.f21749i = z11;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public AbstractC2346O.b g(int i10, AbstractC2346O.b bVar, boolean z10) {
            this.f21882e.g(0, bVar, z10);
            long o10 = bVar.o() - this.f21746f;
            long j10 = this.f21748h;
            return bVar.t(bVar.f24354a, bVar.f24355b, 0, j10 != -9223372036854775807L ? j10 - o10 : -9223372036854775807L, o10);
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public AbstractC2346O.c o(int i10, AbstractC2346O.c cVar, long j10) {
            this.f21882e.o(0, cVar, 0L);
            long j11 = cVar.f24392p;
            long j12 = this.f21746f;
            cVar.f24392p = j11 + j12;
            cVar.f24389m = this.f21748h;
            cVar.f24385i = this.f21749i;
            long j13 = cVar.f24388l;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                cVar.f24388l = max;
                long j14 = this.f21747g;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                cVar.f24388l = max - this.f21746f;
            }
            long J12 = e1.Z.J1(this.f21746f);
            long j15 = cVar.f24381e;
            if (j15 != -9223372036854775807L) {
                cVar.f24381e = j15 + J12;
            }
            long j16 = cVar.f24382f;
            if (j16 != -9223372036854775807L) {
                cVar.f24382f = j16 + J12;
            }
            return cVar;
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.f$d */
    public static final class d extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f21750a;

        public d(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        public static String a(int i10, long j10, long j11) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return "unknown";
            }
            AbstractC4134a.g((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }

        public d(int i10, long j10, long j11) {
            super("Illegal clipping: " + a(i10, j10, j11));
            this.f21750a = i10;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h, androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
        super.F();
        this.f21735v = null;
        this.f21734u = null;
    }

    @Override // androidx.media3.exoplayer.source.o0
    public void S(AbstractC2346O abstractC2346O) {
        if (this.f21735v != null) {
            return;
        }
        W(abstractC2346O);
    }

    public final void W(AbstractC2346O abstractC2346O) {
        long j10;
        abstractC2346O.n(0, this.f21733t);
        long e10 = this.f21733t.e();
        if (this.f21734u == null || this.f21732s.isEmpty() || this.f21729p) {
            j10 = this.f21726m;
            long j11 = this.f21727n;
            if (this.f21730q) {
                long c10 = this.f21733t.c();
                j10 += c10;
                j11 += c10;
            }
            this.f21736w = e10 + j10;
            this.f21737x = this.f21727n != Long.MIN_VALUE ? e10 + j11 : Long.MIN_VALUE;
            int size = this.f21732s.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C2204e) this.f21732s.get(i10)).x(this.f21736w, this.f21737x);
            }
            r6 = j11;
        } else {
            j10 = this.f21736w - e10;
            if (this.f21727n != Long.MIN_VALUE) {
                r6 = this.f21737x - e10;
            }
        }
        try {
            c cVar = new c(abstractC2346O, j10, r6, this.f21731r);
            this.f21734u = cVar;
            E(cVar);
        } catch (d e11) {
            this.f21735v = e11;
            for (int i11 = 0; i11 < this.f21732s.size(); i11++) {
                ((C2204e) this.f21732s.get(i11)).s(this.f21735v);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.D
    public C c(D.b bVar, D1.b bVar2, long j10) {
        C2204e c2204e = new C2204e(this.f21842k.c(bVar, bVar2, j10), this.f21728o, this.f21736w, this.f21737x);
        this.f21732s.add(c2204e);
        return c2204e;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void f(C c10) {
        AbstractC4134a.g(this.f21732s.remove(c10));
        this.f21842k.f(((C2204e) c10).f21716a);
        if (!this.f21732s.isEmpty() || this.f21729p) {
            return;
        }
        W(((c) AbstractC4134a.e(this.f21734u)).f21882e);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h, androidx.media3.exoplayer.source.D
    public void q() {
        d dVar = this.f21735v;
        if (dVar != null) {
            throw dVar;
        }
        super.q();
    }

    public C2205f(D d10, long j10, long j11) {
        this(new b(d10).n(j10).l(j11));
    }

    public C2205f(b bVar) {
        super(bVar.f21738a);
        this.f21726m = bVar.f21739b;
        this.f21727n = bVar.f21740c;
        this.f21728o = bVar.f21741d;
        this.f21729p = bVar.f21742e;
        this.f21730q = bVar.f21743f;
        this.f21731r = bVar.f21744g;
        this.f21732s = new ArrayList();
        this.f21733t = new AbstractC2346O.c();
    }
}
