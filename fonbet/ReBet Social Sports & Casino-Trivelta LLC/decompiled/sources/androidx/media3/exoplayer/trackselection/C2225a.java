package androidx.media3.exoplayer.trackselection;

import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.trackselection.y;
import b1.AbstractC2346O;
import b1.P;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.I;
import com.google.common.collect.K;
import e1.AbstractC4156x;
import e1.InterfaceC4143j;
import e1.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.trackselection.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2225a extends AbstractC2227c {

    /* renamed from: f, reason: collision with root package name */
    public final D1.d f21916f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21917g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21918h;

    /* renamed from: i, reason: collision with root package name */
    public final long f21919i;

    /* renamed from: j, reason: collision with root package name */
    public final int f21920j;

    /* renamed from: k, reason: collision with root package name */
    public final int f21921k;

    /* renamed from: l, reason: collision with root package name */
    public final float f21922l;

    /* renamed from: m, reason: collision with root package name */
    public final float f21923m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC3445z f21924n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC4143j f21925o;

    /* renamed from: p, reason: collision with root package name */
    public float f21926p;

    /* renamed from: q, reason: collision with root package name */
    public int f21927q;

    /* renamed from: r, reason: collision with root package name */
    public int f21928r;

    /* renamed from: s, reason: collision with root package name */
    public long f21929s;

    /* renamed from: t, reason: collision with root package name */
    public B1.m f21930t;

    /* renamed from: u, reason: collision with root package name */
    public long f21931u;

    /* renamed from: androidx.media3.exoplayer.trackselection.a$a, reason: collision with other inner class name */
    public static final class C0393a {

        /* renamed from: a, reason: collision with root package name */
        public final long f21932a;

        /* renamed from: b, reason: collision with root package name */
        public final long f21933b;

        public C0393a(long j10, long j11) {
            this.f21932a = j10;
            this.f21933b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0393a)) {
                return false;
            }
            C0393a c0393a = (C0393a) obj;
            return this.f21932a == c0393a.f21932a && this.f21933b == c0393a.f21933b;
        }

        public int hashCode() {
            return (((int) this.f21932a) * 31) + ((int) this.f21933b);
        }
    }

    /* renamed from: androidx.media3.exoplayer.trackselection.a$b */
    public static class b implements y.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f21934a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21935b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21936c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21937d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21938e;

        /* renamed from: f, reason: collision with root package name */
        public final float f21939f;

        /* renamed from: g, reason: collision with root package name */
        public final float f21940g;

        /* renamed from: h, reason: collision with root package name */
        public final InterfaceC4143j f21941h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        @Override // androidx.media3.exoplayer.trackselection.y.b
        public final y[] a(y.a[] aVarArr, D1.d dVar, D.b bVar, AbstractC2346O abstractC2346O) {
            D1.d dVar2;
            y b10;
            AbstractC3445z z10 = C2225a.z(aVarArr);
            y[] yVarArr = new y[aVarArr.length];
            int i10 = 0;
            while (i10 < aVarArr.length) {
                y.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.tracks;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            b10 = new z(aVar.f22086a, iArr[0], aVar.f22087b);
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            b10 = b(aVar.f22086a, iArr, aVar.f22087b, dVar2, (AbstractC3445z) z10.get(i10));
                        }
                        yVarArr[i10] = b10;
                        i10++;
                        dVar = dVar2;
                    }
                }
                dVar2 = dVar;
                i10++;
                dVar = dVar2;
            }
            return yVarArr;
        }

        public C2225a b(P p10, int[] iArr, int i10, D1.d dVar, AbstractC3445z abstractC3445z) {
            return new C2225a(p10, iArr, i10, dVar, this.f21934a, this.f21935b, this.f21936c, this.f21937d, this.f21938e, this.f21939f, this.f21940g, abstractC3445z, this.f21941h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, InterfaceC4143j.f45530a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, InterfaceC4143j interfaceC4143j) {
            this.f21934a = i10;
            this.f21935b = i11;
            this.f21936c = i12;
            this.f21937d = i13;
            this.f21938e = i14;
            this.f21939f = f10;
            this.f21940g = f11;
            this.f21941h = interfaceC4143j;
        }
    }

    public C2225a(P p10, int[] iArr, int i10, D1.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, InterfaceC4143j interfaceC4143j) {
        super(p10, iArr, i10);
        long j13;
        if (j12 < j10) {
            AbstractC4156x.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f21916f = dVar;
        this.f21917g = j10 * 1000;
        this.f21918h = j11 * 1000;
        this.f21919i = j13 * 1000;
        this.f21920j = i11;
        this.f21921k = i12;
        this.f21922l = f10;
        this.f21923m = f11;
        this.f21924n = AbstractC3445z.o(list);
        this.f21925o = interfaceC4143j;
        this.f21926p = 1.0f;
        this.f21928r = 0;
        this.f21929s = -9223372036854775807L;
        this.f21931u = -2147483647L;
    }

    public static long[][] E(y.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            y.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.tracks.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.tracks;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f22086a.a(iArr[i11]).f20538j;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    public static AbstractC3445z F(long[][] jArr) {
        K e10 = com.google.common.collect.P.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double d10 = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        d10 = Math.log(j10);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    e10.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return AbstractC3445z.o(e10.values());
    }

    public static void w(List list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            AbstractC3445z.a aVar = (AbstractC3445z.a) list.get(i10);
            if (aVar != null) {
                aVar.a(new C0393a(j10, jArr[i10]));
            }
        }
    }

    public static AbstractC3445z z(y.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (y.a aVar : aVarArr) {
            if (aVar == null || aVar.tracks.length <= 1) {
                arrayList.add(null);
            } else {
                AbstractC3445z.a k10 = AbstractC3445z.k();
                k10.a(new C0393a(0L, 0L));
                arrayList.add(k10);
            }
        }
        long[][] E10 = E(aVarArr);
        int[] iArr = new int[E10.length];
        long[] jArr = new long[E10.length];
        for (int i10 = 0; i10 < E10.length; i10++) {
            long[] jArr2 = E10[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        w(arrayList, jArr);
        AbstractC3445z F10 = F(E10);
        for (int i11 = 0; i11 < F10.size(); i11++) {
            int intValue = ((Integer) F10.get(i11)).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr[intValue] = E10[intValue][i12];
            w(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        w(arrayList, jArr);
        AbstractC3445z.a k11 = AbstractC3445z.k();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            AbstractC3445z.a aVar2 = (AbstractC3445z.a) arrayList.get(i14);
            k11.a(aVar2 == null ? AbstractC3445z.t() : aVar2.m());
        }
        return k11.m();
    }

    public final long A(long j10) {
        long G10 = G(j10);
        if (this.f21924n.isEmpty()) {
            return G10;
        }
        int i10 = 1;
        while (i10 < this.f21924n.size() - 1 && ((C0393a) this.f21924n.get(i10)).f21932a < G10) {
            i10++;
        }
        C0393a c0393a = (C0393a) this.f21924n.get(i10 - 1);
        C0393a c0393a2 = (C0393a) this.f21924n.get(i10);
        long j11 = c0393a.f21932a;
        float f10 = (G10 - j11) / (c0393a2.f21932a - j11);
        return c0393a.f21933b + ((long) (f10 * (c0393a2.f21933b - r2)));
    }

    public final long B(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        B1.m mVar = (B1.m) I.f(list);
        long j10 = mVar.f562g;
        if (j10 != -9223372036854775807L) {
            long j11 = mVar.f563h;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
        }
        return -9223372036854775807L;
    }

    public long C() {
        return this.f21919i;
    }

    public final long D(B1.n[] nVarArr, List list) {
        int i10 = this.f21927q;
        if (i10 < nVarArr.length && nVarArr[i10].next()) {
            B1.n nVar = nVarArr[this.f21927q];
            return nVar.b() - nVar.a();
        }
        for (B1.n nVar2 : nVarArr) {
            if (nVar2.next()) {
                return nVar2.b() - nVar2.a();
            }
        }
        return B(list);
    }

    public final long G(long j10) {
        long h10 = this.f21916f.h();
        this.f21931u = h10;
        long j11 = (long) (h10 * this.f21922l);
        long b10 = this.f21916f.b();
        if (b10 == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (j11 / this.f21926p);
        }
        float f10 = j10;
        return (long) ((j11 * Math.max((f10 / this.f21926p) - b10, 0.0f)) / f10);
    }

    public final long H(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f21917g;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (j10 * this.f21923m), this.f21917g);
    }

    public boolean I(long j10, List list) {
        long j11 = this.f21929s;
        if (j11 == -9223372036854775807L || j10 - j11 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((B1.m) I.f(list)).equals(this.f21930t)) ? false : true;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public long a() {
        return this.f21931u;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public int d() {
        return this.f21927q;
    }

    @Override // androidx.media3.exoplayer.trackselection.AbstractC2227c, androidx.media3.exoplayer.trackselection.y
    public void disable() {
        this.f21930t = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.AbstractC2227c, androidx.media3.exoplayer.trackselection.y
    public void enable() {
        this.f21929s = -9223372036854775807L;
        this.f21930t = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.AbstractC2227c, androidx.media3.exoplayer.trackselection.y
    public void i(float f10) {
        this.f21926p = f10;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public Object j() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public void n(long j10, long j11, long j12, List list, B1.n[] nVarArr) {
        long b10 = this.f21925o.b();
        long D10 = D(nVarArr, list);
        int i10 = this.f21928r;
        if (i10 == 0) {
            this.f21928r = 1;
            this.f21927q = y(b10, D10);
            return;
        }
        int i11 = this.f21927q;
        int c10 = list.isEmpty() ? -1 : c(((B1.m) I.f(list)).f559d);
        if (c10 != -1) {
            i10 = ((B1.m) I.f(list)).f560e;
            i11 = c10;
        }
        int y10 = y(b10, D10);
        if (y10 != i11 && !b(i11, b10)) {
            androidx.media3.common.a e10 = e(i11);
            androidx.media3.common.a e11 = e(y10);
            long H10 = H(j12, D10);
            int i12 = e11.f20538j;
            int i13 = e10.f20538j;
            if ((i12 > i13 && j11 < H10) || (i12 < i13 && j11 >= this.f21918h)) {
                y10 = i11;
            }
        }
        if (y10 != i11) {
            i10 = 3;
        }
        this.f21928r = i10;
        this.f21927q = y10;
    }

    @Override // androidx.media3.exoplayer.trackselection.AbstractC2227c, androidx.media3.exoplayer.trackselection.y
    public int p(long j10, List list) {
        int i10;
        int i11;
        long b10 = this.f21925o.b();
        if (!I(b10, list)) {
            return list.size();
        }
        this.f21929s = b10;
        this.f21930t = list.isEmpty() ? null : (B1.m) I.f(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long r02 = Z.r0(((B1.m) list.get(size - 1)).f562g - j10, this.f21926p);
        long C10 = C();
        if (r02 >= C10) {
            androidx.media3.common.a e10 = e(y(b10, B(list)));
            for (int i12 = 0; i12 < size; i12++) {
                B1.m mVar = (B1.m) list.get(i12);
                androidx.media3.common.a aVar = mVar.f559d;
                if (Z.r0(mVar.f562g - j10, this.f21926p) >= C10 && aVar.f20538j < e10.f20538j && (i10 = aVar.f20551w) != -1 && i10 <= this.f21921k && (i11 = aVar.f20550v) != -1 && i11 <= this.f21920j && i10 < e10.f20551w) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public int s() {
        return this.f21928r;
    }

    public boolean x(androidx.media3.common.a aVar, int i10, long j10) {
        return ((long) i10) <= j10;
    }

    public final int y(long j10, long j11) {
        long A10 = A(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f21943b; i11++) {
            if (j10 == Long.MIN_VALUE || !b(i11, j10)) {
                androidx.media3.common.a e10 = e(i11);
                if (x(e10, e10.f20538j, A10)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
