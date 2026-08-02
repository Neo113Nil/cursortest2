package androidx.media3.exoplayer.dash;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.dash.b;
import androidx.media3.exoplayer.dash.e;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import xsna.aq10;
import xsna.ccc;
import xsna.ctk;
import xsna.d7q;
import xsna.dcc;
import xsna.e7g0;
import xsna.ecc;
import xsna.epx;
import xsna.evk;
import xsna.fr10;
import xsna.gdl;
import xsna.grz;
import xsna.izw;
import xsna.ji;
import xsna.jw5;
import xsna.mjp0;
import xsna.npl;
import xsna.q6g0;
import xsna.qo10;
import xsna.rl3;
import xsna.rsk;
import xsna.rwe0;
import xsna.tp6;
import xsna.wp6;
import xsna.x1b0;
import xsna.xw8;
import xsna.y2r0;

/* compiled from: CachePriorityDashChunkSourceOld.kt */
/* loaded from: classes12.dex */
public final class a extends q6g0 {
    public final Cache o;
    public final xw8 p;
    public final rsk q;
    public final int r;
    public final d7q s;
    public final int t;
    public final androidx.media3.datasource.a u;
    public final long v;
    public final qo10 w;
    public final e.c x;
    public boolean y;

    /* compiled from: CachePriorityDashChunkSourceOld.kt */
    /* renamed from: androidx.media3.exoplayer.dash.a$a, reason: collision with other inner class name */
    public static final class C0053a implements b.a {
        public final Cache a;
        public final xw8 b;
        public final a.InterfaceC0045a c;
        public final qo10 d;

        public C0053a(Cache cache, xw8 xw8Var, a.InterfaceC0045a interfaceC0045a, qo10 qo10Var) {
            this.a = cache;
            this.b = xw8Var;
            this.c = interfaceC0045a;
            this.d = qo10Var;
        }

        @Override // androidx.media3.exoplayer.dash.b.a
        public final androidx.media3.exoplayer.dash.b e(grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, long j, boolean z, ArrayList arrayList, e.c cVar, mjp0 mjp0Var, x1b0 x1b0Var) {
            androidx.media3.datasource.a createDataSource = this.c.createDataSource();
            if (mjp0Var != null) {
                createDataSource.addTransferListener(mjp0Var);
            }
            return new a(this.a, this.b, grzVar, rskVar, wp6Var, i, iArr, d7qVar, i2, createDataSource, j, this.d, z, arrayList, cVar, x1b0Var);
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            e7g0 e7g0Var;
            androidx.media3.common.a aVar;
            e7g0 e7g0Var2;
            androidx.media3.common.a aVar2;
            gdl.a aVar3 = (gdl.a) t2;
            Integer num = null;
            Integer valueOf = (aVar3 == null || (e7g0Var2 = aVar3.b) == null || (aVar2 = e7g0Var2.b) == null) ? null : Integer.valueOf(aVar2.j);
            gdl.a aVar4 = (gdl.a) t;
            if (aVar4 != null && (e7g0Var = aVar4.b) != null && (aVar = e7g0Var.b) != null) {
                num = Integer.valueOf(aVar.j);
            }
            return jw5.b(valueOf, num);
        }
    }

    public a(Cache cache, xw8 xw8Var, grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, androidx.media3.datasource.a aVar, long j, qo10 qo10Var, boolean z, ArrayList arrayList, e.c cVar, x1b0 x1b0Var) {
        super(grzVar, rskVar, wp6Var, i, iArr, d7qVar, i2, aVar, j, qo10Var, z, arrayList, cVar, x1b0Var);
        this.o = cache;
        this.p = xw8Var;
        this.q = rskVar;
        this.r = i;
        this.s = d7qVar;
        this.t = i2;
        this.u = aVar;
        this.v = j;
        this.w = qo10Var;
        this.x = cVar;
    }

    @Override // xsna.gdl, xsna.kcc
    public final boolean b(ccc cccVar, boolean z, b.c cVar, androidx.media3.exoplayer.upstream.b bVar) {
        IOException iOException = cVar.a;
        if (!this.q.d && (cccVar instanceof aq10)) {
            HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = iOException instanceof HttpDataSource$InvalidResponseCodeException ? (HttpDataSource$InvalidResponseCodeException) iOException : null;
            if (httpDataSource$InvalidResponseCodeException != null && httpDataSource$InvalidResponseCodeException.responseCode == 404) {
                gdl.a aVar = this.i[this.s.b(cccVar.d)];
                Long valueOf = aVar != null ? Long.valueOf(aVar.e()) : null;
                if (valueOf != null) {
                    long longValue = valueOf.longValue();
                    if (longValue != -1 && longValue != 0) {
                        if (((aq10) cccVar).b() > (aVar.c() + longValue) - 1) {
                            this.y = true;
                            return true;
                        }
                    }
                }
            }
        }
        return super.b(cccVar, z, cVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    @Override // xsna.gdl, xsna.kcc
    @SuppressLint({"UseKtx"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(f fVar, long j, List<? extends aq10> list, ecc eccVar) {
        long j2;
        androidx.media3.common.a aVar;
        List<? extends aq10> list2;
        aq10 aq10Var;
        int i;
        e7g0 e7g0Var;
        d7q d7qVar = this.s;
        npl nplVar = d7qVar instanceof npl ? (npl) d7qVar : null;
        if ((nplVar != null ? nplVar.a() : null) != null) {
            super.g(fVar, j, list, eccVar);
            return;
        }
        long j3 = this.v;
        long j4 = 0;
        long S = y2r0.S(j3 != 0 ? SystemClock.elapsedRealtime() + j3 : System.currentTimeMillis());
        rsk rskVar = this.q;
        long S2 = y2r0.S(rskVar.a);
        int i2 = this.r;
        long S3 = y2r0.S(rskVar.b(i2).b) + S2 + j;
        e.c cVar = this.x;
        if (cVar != null && cVar.h(S3)) {
            return;
        }
        Iterator it = rl3.m0(this.i, new b()).iterator();
        gdl.a aVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                j2 = j4;
                break;
            }
            gdl.a aVar3 = (gdl.a) it.next();
            j2 = j4;
            String k = this.p.k(new evk(Uri.parse((aVar3 == null || (e7g0Var = aVar3.b) == null) ? null : e7g0Var.c.get(0).a)));
            if (this.o.isCached(k, 0L, 0L)) {
                if ((aVar3 != null ? aVar3.d : null) != null && aVar3.d.i(j) > j2) {
                    rwe0 l = aVar3.d.l(aVar3.g(j));
                    long j5 = l.b;
                    if (j5 >= j2 && this.o.isCached(k, l.a, j5)) {
                        aVar2 = aVar3;
                        break;
                    }
                } else {
                    if (aVar2 != null) {
                        if ((aVar3 != null ? aVar3.b : null) != null) {
                            if (epx.g(aVar3.b.b.j, aVar2.b.b.j) <= 0) {
                            }
                        }
                    }
                    aVar2 = aVar3;
                }
            }
            j4 = j2;
        }
        if (aVar2 == null) {
            super.g(fVar, j, list, eccVar);
            return;
        }
        dcc dccVar = aVar2.a;
        e7g0 e7g0Var2 = aVar2.b;
        androidx.media3.common.a aVar4 = e7g0Var2.b;
        ImmutableList<tp6> immutableList = e7g0Var2.c;
        int i3 = d7qVar.getTrackGroup().a;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                androidx.media3.common.a format = d7qVar.getFormat(i4);
                if (!format.equals(aVar4)) {
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    aVar = format;
                    break;
                }
            }
            if (aVar != null) {
                super.g(fVar, j, list, eccVar);
                return;
            }
            if (dccVar != null) {
                rwe0 rwe0Var = dccVar.d() == null ? e7g0Var2.h : null;
                rwe0 g = aVar2.d == null ? e7g0Var2.g() : null;
                if (rwe0Var != null || g != null) {
                    Object obj = new Object();
                    if (rwe0Var != null) {
                        i = 0;
                        rwe0 a = rwe0Var.a(g, immutableList.get(0).a);
                        if (a != null) {
                            rwe0Var = a;
                        }
                    } else {
                        i = 0;
                        rwe0Var = g;
                    }
                    eccVar.a = rwe0Var == null ? null : new izw(this.u, ctk.a(e7g0Var2, immutableList.get(i).a, rwe0Var, i, h.h), aVar, 2, obj, dccVar);
                    return;
                }
            }
            if (aVar2.e() == j2) {
                eccVar.b = true;
                return;
            }
            long b2 = aVar2.b(S);
            long d = aVar2.d(S);
            if (list.isEmpty()) {
                list2 = list;
                aq10Var = null;
            } else {
                list2 = list;
                aq10Var = (aq10) ji.a(1, list2);
            }
            long b3 = aq10Var != null ? aq10Var.b() : y2r0.k(aVar2.g(j), b2, d);
            boolean isEmpty = list2.isEmpty();
            long j6 = C.TIME_UNSET;
            long j7 = isEmpty ? j : -9223372036854775807L;
            long d2 = rskVar.d(0);
            boolean z = d2 != C.TIME_UNSET;
            if (b3 > d || (this.y && b3 >= d)) {
                eccVar.b = z;
                return;
            }
            if (z && aVar2.h(b3) >= d2) {
                eccVar.b = true;
                return;
            }
            long j8 = rskVar.a;
            if (j8 != C.TIME_UNSET) {
                j6 = S - y2r0.S(j8 + rskVar.b(i2).b);
            }
            long j9 = j6;
            int min = Math.min(this.w.f(y2r0.j0(fVar.a), y2r0.j0(j), y2r0.j0(aVar2.f(b3) - aVar2.h(b3)), fr10.b(d7qVar.getTrackGroup().c, e7g0Var2.b)), (int) ((d - b3) + 1));
            if (d2 != C.TIME_UNSET) {
                while (min > 1 && aVar2.h((min + b3) - 1) >= d2) {
                    min--;
                }
            }
            eccVar.a = gdl.j(aVar2, this.u, this.t, aVar, d7qVar.getSelectionReason(), new Object(), b3, min, j7, j9);
            return;
        }
        aVar = null;
        if (aVar != null) {
        }
    }
}
