package m1;

import android.os.SystemClock;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2346O;
import b1.C2340I;
import com.google.common.collect.AbstractC3445z;
import java.util.List;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: u, reason: collision with root package name */
    public static final D.b f56217u = new D.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2346O f56218a;

    /* renamed from: b, reason: collision with root package name */
    public final D.b f56219b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56220c;

    /* renamed from: d, reason: collision with root package name */
    public final long f56221d;

    /* renamed from: e, reason: collision with root package name */
    public final int f56222e;

    /* renamed from: f, reason: collision with root package name */
    public final I f56223f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f56224g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.m0 f56225h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.G f56226i;

    /* renamed from: j, reason: collision with root package name */
    public final List f56227j;

    /* renamed from: k, reason: collision with root package name */
    public final D.b f56228k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f56229l;

    /* renamed from: m, reason: collision with root package name */
    public final int f56230m;

    /* renamed from: n, reason: collision with root package name */
    public final int f56231n;

    /* renamed from: o, reason: collision with root package name */
    public final C2340I f56232o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f56233p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f56234q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f56235r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f56236s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f56237t;

    public h1(AbstractC2346O abstractC2346O, D.b bVar, long j10, long j11, int i10, I i11, boolean z10, androidx.media3.exoplayer.source.m0 m0Var, androidx.media3.exoplayer.trackselection.G g10, List list, D.b bVar2, boolean z11, int i12, int i13, C2340I c2340i, long j12, long j13, long j14, long j15, boolean z12) {
        this.f56218a = abstractC2346O;
        this.f56219b = bVar;
        this.f56220c = j10;
        this.f56221d = j11;
        this.f56222e = i10;
        this.f56223f = i11;
        this.f56224g = z10;
        this.f56225h = m0Var;
        this.f56226i = g10;
        this.f56227j = list;
        this.f56228k = bVar2;
        this.f56229l = z11;
        this.f56230m = i12;
        this.f56231n = i13;
        this.f56232o = c2340i;
        this.f56234q = j12;
        this.f56235r = j13;
        this.f56236s = j14;
        this.f56237t = j15;
        this.f56233p = z12;
    }

    public static h1 k(androidx.media3.exoplayer.trackselection.G g10) {
        AbstractC2346O abstractC2346O = AbstractC2346O.f24345a;
        D.b bVar = f56217u;
        return new h1(abstractC2346O, bVar, -9223372036854775807L, 0L, 1, null, false, androidx.media3.exoplayer.source.m0.f21830d, g10, AbstractC3445z.t(), bVar, false, 1, 0, C2340I.f24312d, 0L, 0L, 0L, 0L, false);
    }

    public static D.b l() {
        return f56217u;
    }

    public h1 a() {
        return new h1(this.f56218a, this.f56219b, this.f56220c, this.f56221d, this.f56222e, this.f56223f, this.f56224g, this.f56225h, this.f56226i, this.f56227j, this.f56228k, this.f56229l, this.f56230m, this.f56231n, this.f56232o, this.f56234q, this.f56235r, m(), SystemClock.elapsedRealtime(), this.f56233p);
    }

    public h1 b(boolean z10) {
        return new h1(this.f56218a, this.f56219b, this.f56220c, this.f56221d, this.f56222e, this.f56223f, z10, this.f56225h, this.f56226i, this.f56227j, this.f56228k, this.f56229l, this.f56230m, this.f56231n, this.f56232o, this.f56234q, this.f56235r, this.f56236s, this.f56237t, this.f56233p);
    }

    public h1 c(D.b bVar) {
        return new h1(this.f56218a, this.f56219b, this.f56220c, this.f56221d, this.f56222e, this.f56223f, this.f56224g, this.f56225h, this.f56226i, this.f56227j, bVar, this.f56229l, this.f56230m, this.f56231n, this.f56232o, this.f56234q, this.f56235r, this.f56236s, this.f56237t, this.f56233p);
    }

    public h1 d(D.b bVar, long j10, long j11, long j12, long j13, androidx.media3.exoplayer.source.m0 m0Var, androidx.media3.exoplayer.trackselection.G g10, List list) {
        return new h1(this.f56218a, bVar, j11, j12, this.f56222e, this.f56223f, this.f56224g, m0Var, g10, list, this.f56228k, this.f56229l, this.f56230m, this.f56231n, this.f56232o, this.f56234q, j13, j10, SystemClock.elapsedRealtime(), this.f56233p);
    }

    public h1 e(boolean z10, int i10, int i11) {
        return new h1(this.f56218a, this.f56219b, this.f56220c, this.f56221d, this.f56222e, this.f56223f, this.f56224g, this.f56225h, this.f56226i, this.f56227j, this.f56228k, z10, i10, i11, this.f56232o, this.f56234q, this.f56235r, this.f56236s, this.f56237t, this.f56233p);
    }

    public h1 f(I i10) {
        return new h1(this.f56218a, this.f56219b, this.f56220c, this.f56221d, this.f56222e, i10, this.f56224g, this.f56225h, this.f56226i, this.f56227j, this.f56228k, this.f56229l, this.f56230m, this.f56231n, this.f56232o, this.f56234q, this.f56235r, this.f56236s, this.f56237t, this.f56233p);
    }

    public h1 g(C2340I c2340i) {
        return new h1(this.f56218a, this.f56219b, this.f56220c, this.f56221d, this.f56222e, this.f56223f, this.f56224g, this.f56225h, this.f56226i, this.f56227j, this.f56228k, this.f56229l, this.f56230m, this.f56231n, c2340i, this.f56234q, this.f56235r, this.f56236s, this.f56237t, this.f56233p);
    }

    public h1 h(int i10) {
        return new h1(this.f56218a, this.f56219b, this.f56220c, this.f56221d, i10, this.f56223f, this.f56224g, this.f56225h, this.f56226i, this.f56227j, this.f56228k, this.f56229l, this.f56230m, this.f56231n, this.f56232o, this.f56234q, this.f56235r, this.f56236s, this.f56237t, this.f56233p);
    }

    public h1 i(boolean z10) {
        return new h1(this.f56218a, this.f56219b, this.f56220c, this.f56221d, this.f56222e, this.f56223f, this.f56224g, this.f56225h, this.f56226i, this.f56227j, this.f56228k, this.f56229l, this.f56230m, this.f56231n, this.f56232o, this.f56234q, this.f56235r, this.f56236s, this.f56237t, z10);
    }

    public h1 j(AbstractC2346O abstractC2346O) {
        return new h1(abstractC2346O, this.f56219b, this.f56220c, this.f56221d, this.f56222e, this.f56223f, this.f56224g, this.f56225h, this.f56226i, this.f56227j, this.f56228k, this.f56229l, this.f56230m, this.f56231n, this.f56232o, this.f56234q, this.f56235r, this.f56236s, this.f56237t, this.f56233p);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f56236s;
        }
        do {
            j10 = this.f56237t;
            j11 = this.f56236s;
        } while (j10 != this.f56237t);
        return e1.Z.a1(e1.Z.J1(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f56232o.f24315a)));
    }

    public boolean n() {
        return this.f56222e == 3 && this.f56229l && this.f56231n == 0;
    }

    public void o(long j10) {
        this.f56236s = j10;
        this.f56237t = SystemClock.elapsedRealtime();
    }
}
