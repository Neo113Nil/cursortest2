package androidx.media3.exoplayer.source;

import android.net.Uri;
import b1.AbstractC2346O;
import b1.z;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class f0 extends AbstractC2346O {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f21751r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final b1.z f21752s = new z.c().d("SinglePeriodTimeline").i(Uri.EMPTY).a();

    /* renamed from: e, reason: collision with root package name */
    public final long f21753e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21754f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21755g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21756h;

    /* renamed from: i, reason: collision with root package name */
    public final long f21757i;

    /* renamed from: j, reason: collision with root package name */
    public final long f21758j;

    /* renamed from: k, reason: collision with root package name */
    public final long f21759k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21760l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f21761m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f21762n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f21763o;

    /* renamed from: p, reason: collision with root package name */
    public final b1.z f21764p;

    /* renamed from: q, reason: collision with root package name */
    public final z.g f21765q;

    public f0(long j10, boolean z10, boolean z11, boolean z12, Object obj, b1.z zVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, zVar);
    }

    @Override // b1.AbstractC2346O
    public int b(Object obj) {
        return f21751r.equals(obj) ? 0 : -1;
    }

    @Override // b1.AbstractC2346O
    public AbstractC2346O.b g(int i10, AbstractC2346O.b bVar, boolean z10) {
        AbstractC4134a.c(i10, 0, 1);
        return bVar.t(null, z10 ? f21751r : null, 0, this.f21756h, -this.f21758j);
    }

    @Override // b1.AbstractC2346O
    public int i() {
        return 1;
    }

    @Override // b1.AbstractC2346O
    public Object m(int i10) {
        AbstractC4134a.c(i10, 0, 1);
        return f21751r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // b1.AbstractC2346O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2346O.c o(int i10, AbstractC2346O.c cVar, long j10) {
        long j11;
        AbstractC4134a.c(i10, 0, 1);
        long j12 = this.f21759k;
        boolean z10 = this.f21761m;
        if (z10 && !this.f21762n && j10 != 0) {
            long j13 = this.f21757i;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
            }
            j11 = -9223372036854775807L;
            return cVar.g(AbstractC2346O.c.f24367q, this.f21764p, this.f21763o, this.f21753e, this.f21754f, this.f21755g, this.f21760l, z10, this.f21765q, j11, this.f21757i, 0, 0, this.f21758j);
        }
        j11 = j12;
        return cVar.g(AbstractC2346O.c.f24367q, this.f21764p, this.f21763o, this.f21753e, this.f21754f, this.f21755g, this.f21760l, z10, this.f21765q, j11, this.f21757i, 0, 0, this.f21758j);
    }

    @Override // b1.AbstractC2346O
    public int p() {
        return 1;
    }

    public f0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, b1.z zVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, zVar, z12 ? zVar.f24657d : null);
    }

    public f0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, b1.z zVar, z.g gVar) {
        this.f21753e = j10;
        this.f21754f = j11;
        this.f21755g = j12;
        this.f21756h = j13;
        this.f21757i = j14;
        this.f21758j = j15;
        this.f21759k = j16;
        this.f21760l = z10;
        this.f21761m = z11;
        this.f21762n = z12;
        this.f21763o = obj;
        this.f21764p = (b1.z) AbstractC4134a.e(zVar);
        this.f21765q = gVar;
    }
}
