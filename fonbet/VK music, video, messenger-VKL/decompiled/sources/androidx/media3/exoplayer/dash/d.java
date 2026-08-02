package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.dash.b;
import androidx.media3.exoplayer.dash.e;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xsna.anl;
import xsna.aq10;
import xsna.bq10;
import xsna.btk;
import xsna.ccc;
import xsna.cj0;
import xsna.co8;
import xsna.ctk;
import xsna.d7q;
import xsna.dcc;
import xsna.e7g0;
import xsna.ecc;
import xsna.evk;
import xsna.fcc;
import xsna.grz;
import xsna.htk;
import xsna.io20;
import xsna.izw;
import xsna.ji;
import xsna.mjp0;
import xsna.o3i0;
import xsna.rsk;
import xsna.rwe0;
import xsna.sg6;
import xsna.tp6;
import xsna.vvj0;
import xsna.wp6;
import xsna.x1b0;
import xsna.y2r0;
import xsna.zej;

/* compiled from: DefaultDashChunkSource.java */
/* loaded from: classes12.dex */
public final class d implements androidx.media3.exoplayer.dash.b {
    public final grz a;
    public final wp6 b;
    public final int[] c;
    public final int d;
    public final androidx.media3.datasource.a e;
    public final long f;
    public final int g;

    @Nullable
    public final e.c h;
    public final b[] i;
    public d7q j;
    public rsk k;
    public int l;

    @Nullable
    public BehindLiveWindowException m;
    public boolean n;

    /* compiled from: DefaultDashChunkSource.java */
    public static final class a implements b.a {
        public final a.InterfaceC0045a a;
        public final co8.b c = new co8.b();
        public final int b = 1;

        public a(a.InterfaceC0045a interfaceC0045a) {
            this.a = interfaceC0045a;
        }

        @Override // androidx.media3.exoplayer.dash.b.a
        public final void a(anl anlVar) {
            this.c.a = anlVar;
        }

        @Override // androidx.media3.exoplayer.dash.b.a
        public final void b() {
            this.c.getClass();
        }

        @Override // androidx.media3.exoplayer.dash.b.a
        public final void c(boolean z) {
            this.c.b = z;
        }

        @Override // androidx.media3.exoplayer.dash.b.a
        public final androidx.media3.common.a d(androidx.media3.common.a aVar) {
            co8.b bVar = this.c;
            if (!bVar.b || !bVar.a.a(aVar)) {
                return aVar;
            }
            a.C0043a a = aVar.a();
            String str = aVar.k;
            a.m = io20.q("application/x-media3-cues");
            a.K = bVar.a.b(aVar);
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.n);
            sb.append(str != null ? " ".concat(str) : "");
            a.j = sb.toString();
            a.r = Long.MAX_VALUE;
            return new androidx.media3.common.a(a);
        }

        @Override // androidx.media3.exoplayer.dash.b.a
        public final androidx.media3.exoplayer.dash.b e(grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, long j, boolean z, ArrayList arrayList, @Nullable e.c cVar, @Nullable mjp0 mjp0Var, x1b0 x1b0Var) {
            androidx.media3.datasource.a createDataSource = this.a.createDataSource();
            if (mjp0Var != null) {
                createDataSource.addTransferListener(mjp0Var);
            }
            return new d(this.c, grzVar, rskVar, wp6Var, i, iArr, d7qVar, i2, createDataSource, j, this.b, z, arrayList, cVar, x1b0Var);
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    public static final class b {

        @Nullable
        public final dcc a;
        public final e7g0 b;
        public final tp6 c;

        @Nullable
        public final btk d;
        public final long e;
        public final long f;

        public b(long j, e7g0 e7g0Var, tp6 tp6Var, @Nullable dcc dccVar, long j2, @Nullable btk btkVar) {
            this.e = j;
            this.b = e7g0Var;
            this.c = tp6Var;
            this.f = j2;
            this.a = dccVar;
            this.d = btkVar;
        }

        @CheckResult
        public final b a(long j, e7g0 e7g0Var) throws BehindLiveWindowException {
            long h;
            long h2;
            btk e = this.b.e();
            btk e2 = e7g0Var.e();
            if (e == null) {
                return new b(j, e7g0Var, this.c, this.a, this.f, e);
            }
            if (!e.d()) {
                return new b(j, e7g0Var, this.c, this.a, this.f, e2);
            }
            long i = e.i(j);
            if (i == 0) {
                return new b(j, e7g0Var, this.c, this.a, this.f, e2);
            }
            e2.getClass();
            long k = e.k();
            long timeUs = e.getTimeUs(k);
            long j2 = i + k;
            long j3 = j2 - 1;
            long a = e.a(j3, j) + e.getTimeUs(j3);
            long k2 = e2.k();
            long timeUs2 = e2.getTimeUs(k2);
            long j4 = this.f;
            if (a == timeUs2) {
                h = j2 - k2;
            } else {
                if (a < timeUs2) {
                    throw new BehindLiveWindowException();
                }
                if (timeUs2 < timeUs) {
                    h2 = j4 - (e2.h(timeUs, j) - k);
                    return new b(j, e7g0Var, this.c, this.a, h2, e2);
                }
                h = e.h(timeUs2, j) - k2;
            }
            h2 = h + j4;
            return new b(j, e7g0Var, this.c, this.a, h2, e2);
        }

        public final long b(long j) {
            btk btkVar = this.d;
            btkVar.getClass();
            long j2 = this.e;
            long f = btkVar.f(j2, j) + this.f;
            btkVar.getClass();
            return (btkVar.n(j2, j) + f) - 1;
        }

        public final long c() {
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.i(this.e);
        }

        public final long d(long j) {
            long e = e(j);
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.a(j - this.f, this.e) + e;
        }

        public final long e(long j) {
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.getTimeUs(j - this.f);
        }

        public final boolean f(long j, long j2) {
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.d() || j2 == C.TIME_UNSET || d(j) <= j2;
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    public static final class c extends sg6 {
        public final b e;

        public c(b bVar, long j, long j2) {
            super(j, j2);
            this.e = bVar;
        }

        @Override // xsna.bq10
        public final long a() {
            c();
            return this.e.e(this.d);
        }

        @Override // xsna.bq10
        public final long b() {
            c();
            return this.e.d(this.d);
        }
    }

    public d(co8.b bVar, grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, androidx.media3.datasource.a aVar, long j, int i3, boolean z, ArrayList arrayList, @Nullable e.c cVar, x1b0 x1b0Var) {
        this.a = grzVar;
        this.k = rskVar;
        this.b = wp6Var;
        this.c = iArr;
        this.j = d7qVar;
        int i4 = i2;
        this.d = i4;
        this.e = aVar;
        this.l = i;
        this.f = j;
        this.g = i3;
        e.c cVar2 = cVar;
        this.h = cVar2;
        long d = rskVar.d(i);
        ArrayList<e7g0> h = h();
        this.i = new b[d7qVar.length()];
        int i5 = 0;
        while (i5 < this.i.length) {
            e7g0 e7g0Var = h.get(d7qVar.getIndexInTrackGroup(i5));
            tp6 e = wp6Var.e(e7g0Var.c);
            b[] bVarArr = this.i;
            tp6 tp6Var = e == null ? e7g0Var.c.get(0) : e;
            co8 a2 = bVar.a(i4, e7g0Var.b, z, arrayList, cVar2);
            long j2 = d;
            bVarArr[i5] = new b(j2, e7g0Var, tp6Var, a2, 0L, e7g0Var.e());
            i5++;
            cVar2 = cVar;
            d = j2;
            i4 = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 < (((r10.k() + r8) + r11) - 1)) goto L15;
     */
    @Override // xsna.kcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, o3i0 o3i0Var) {
        long j2;
        long j3 = j;
        b[] bVarArr = this.i;
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            b bVar = bVarArr[i];
            btk btkVar = bVar.d;
            long j4 = bVar.f;
            btk btkVar2 = bVar.d;
            if (btkVar != null) {
                long c2 = bVar.c();
                if (c2 != 0) {
                    btkVar2.getClass();
                    long h = btkVar2.h(j3, bVar.e) + j4;
                    long e = bVar.e(h);
                    if (e < j3) {
                        if (c2 != -1) {
                            btkVar2.getClass();
                        }
                        j2 = bVar.e(h + 1);
                        return o3i0Var.a(j3, e, j2);
                    }
                    j2 = e;
                    return o3i0Var.a(j3, e, j2);
                }
            }
            i++;
            j3 = j;
        }
        return j;
    }

    @Override // xsna.kcc
    public final boolean b(ccc cccVar, boolean z, b.c cVar, androidx.media3.exoplayer.upstream.b bVar) {
        b.C0065b a2;
        long j;
        if (z) {
            e.c cVar2 = this.h;
            if (cVar2 == null || !cVar2.i(cccVar)) {
                boolean z2 = this.k.d;
                b[] bVarArr = this.i;
                if (!z2 && (cccVar instanceof aq10)) {
                    IOException iOException = cVar.a;
                    if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
                        b bVar2 = bVarArr[this.j.b(cccVar.d)];
                        long c2 = bVar2.c();
                        if (c2 != -1 && c2 != 0) {
                            btk btkVar = bVar2.d;
                            btkVar.getClass();
                            if (((aq10) cccVar).b() > ((btkVar.k() + bVar2.f) + c2) - 1) {
                                this.n = true;
                                return true;
                            }
                        }
                    }
                }
                b bVar3 = bVarArr[this.j.b(cccVar.d)];
                e7g0 e7g0Var = bVar3.b;
                tp6 tp6Var = bVar3.c;
                ImmutableList<tp6> immutableList = e7g0Var.c;
                wp6 wp6Var = this.b;
                tp6 e = wp6Var.e(immutableList);
                if (e == null || tp6Var.equals(e)) {
                    d7q d7qVar = this.j;
                    ImmutableList<tp6> immutableList2 = bVar3.b.c;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int length = d7qVar.length();
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (d7qVar.a(i2, elapsedRealtime)) {
                            i++;
                        }
                    }
                    int b2 = wp6.b(immutableList2);
                    b.a aVar = new b.a(b2, b2 - wp6Var.c(immutableList2), length, i);
                    if ((aVar.a(2) || aVar.a(1)) && (a2 = bVar.a(aVar, cVar)) != null) {
                        long j2 = a2.b;
                        int i3 = a2.a;
                        if (aVar.a(i3)) {
                            if (i3 == 2) {
                                d7q d7qVar2 = this.j;
                                return d7qVar2.d(d7qVar2.b(cccVar.d), j2);
                            }
                            if (i3 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                                String str = tp6Var.b;
                                HashMap hashMap = wp6Var.a;
                                if (hashMap.containsKey(str)) {
                                    Long l = (Long) hashMap.get(str);
                                    String str2 = y2r0.a;
                                    j = Math.max(elapsedRealtime2, l.longValue());
                                } else {
                                    j = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j));
                                int i4 = tp6Var.c;
                                if (i4 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i4);
                                    HashMap hashMap2 = wp6Var.b;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l2 = (Long) hashMap2.get(valueOf);
                                        String str3 = y2r0.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // xsna.kcc
    public final boolean c(long j, ccc cccVar, List<? extends aq10> list) {
        if (this.m != null) {
            return false;
        }
        return this.j.h(j, cccVar, list);
    }

    @Override // androidx.media3.exoplayer.dash.b
    public final void d(d7q d7qVar) {
        this.j = d7qVar;
    }

    @Override // xsna.kcc
    public final void e(ccc cccVar) {
        if (cccVar instanceof izw) {
            int b2 = this.j.b(((izw) cccVar).d);
            b[] bVarArr = this.i;
            b bVar = bVarArr[b2];
            if (bVar.d == null) {
                dcc dccVar = bVar.a;
                dccVar.getClass();
                fcc a2 = dccVar.a();
                if (a2 != null) {
                    e7g0 e7g0Var = bVar.b;
                    bVarArr[b2] = new b(bVar.e, e7g0Var, bVar.c, bVar.a, bVar.f, new htk(a2, e7g0Var.d));
                }
            }
        }
        e.c cVar = this.h;
        if (cVar != null) {
            long j = cVar.d;
            if (j == C.TIME_UNSET || cccVar.h > j) {
                cVar.d = cccVar.h;
            }
            e.this.h = true;
        }
    }

    @Override // androidx.media3.exoplayer.dash.b
    public final void f(rsk rskVar, int i) {
        b[] bVarArr = this.i;
        try {
            this.k = rskVar;
            this.l = i;
            long d = rskVar.d(i);
            ArrayList<e7g0> h = h();
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                bVarArr[i2] = bVarArr[i2].a(d, h.get(this.j.getIndexInTrackGroup(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.m = e;
        }
    }

    @Override // xsna.kcc
    public final void g(f fVar, long j, List<? extends aq10> list, ecc eccVar) {
        b[] bVarArr;
        long j2;
        long j3;
        boolean z;
        long j4;
        long k;
        ccc zejVar;
        long k2;
        if (this.m != null) {
            return;
        }
        long j5 = fVar.a;
        long j6 = j - j5;
        long S = y2r0.S(this.k.b(this.l).b) + y2r0.S(this.k.a) + j;
        e.c cVar = this.h;
        if (cVar == null || !cVar.h(S)) {
            long S2 = y2r0.S(y2r0.E(this.f));
            rsk rskVar = this.k;
            long j7 = rskVar.a;
            long S3 = j7 == C.TIME_UNSET ? -9223372036854775807L : S2 - y2r0.S(j7 + rskVar.b(this.l).b);
            aq10 aq10Var = list.isEmpty() ? null : (aq10) ji.a(1, list);
            int length = this.j.length();
            bq10[] bq10VarArr = new bq10[length];
            int i = 0;
            while (true) {
                bVarArr = this.i;
                if (i >= length) {
                    break;
                }
                b bVar = bVarArr[i];
                long j8 = j5;
                btk btkVar = bVar.d;
                long j9 = j6;
                long j10 = bVar.f;
                long j11 = bVar.e;
                bq10.a aVar = bq10.a;
                if (btkVar == null) {
                    bq10VarArr[i] = aVar;
                } else {
                    btkVar.getClass();
                    long f = btkVar.f(j11, S2) + j10;
                    long b2 = bVar.b(S2);
                    if (aq10Var != null) {
                        k2 = aq10Var.b();
                    } else {
                        btk btkVar2 = bVar.d;
                        btkVar2.getClass();
                        k2 = y2r0.k(btkVar2.h(j, j11) + j10, f, b2);
                    }
                    long j12 = k2;
                    if (j12 < f) {
                        bq10VarArr[i] = aVar;
                    } else {
                        bq10VarArr[i] = new c(i(i), j12, b2);
                    }
                }
                i++;
                j5 = j8;
                j6 = j9;
            }
            long j13 = j5;
            long j14 = j6;
            long j15 = 0;
            if (!this.k.d || bVarArr[0].c() == 0) {
                j2 = -9223372036854775807L;
            } else {
                long d = bVarArr[0].d(bVarArr[0].b(S2));
                rsk rskVar2 = this.k;
                long j16 = rskVar2.a;
                long min = Math.min(j16 == C.TIME_UNSET ? -9223372036854775807L : S2 - y2r0.S(j16 + rskVar2.b(this.l).b), d) - j13;
                j15 = 0;
                j2 = Math.max(0L, min);
            }
            long j17 = j15;
            long j18 = S3;
            this.j.g(j13, j14, j2, list, bq10VarArr);
            int selectedIndex = this.j.getSelectedIndex();
            SystemClock.elapsedRealtime();
            b i2 = i(selectedIndex);
            long j19 = i2.e;
            long j20 = i2.f;
            btk btkVar3 = i2.d;
            tp6 tp6Var = i2.c;
            dcc dccVar = i2.a;
            e7g0 e7g0Var = i2.b;
            if (dccVar != null) {
                z = true;
                rwe0 rwe0Var = dccVar.d() == null ? e7g0Var.h : null;
                j3 = j20;
                rwe0 g = btkVar3 == null ? e7g0Var.g() : null;
                if (rwe0Var != null || g != null) {
                    androidx.media3.common.a selectedFormat = this.j.getSelectedFormat();
                    int selectionReason = this.j.getSelectionReason();
                    Object selectionData = this.j.getSelectionData();
                    if (rwe0Var != null) {
                        rwe0 a2 = rwe0Var.a(g, tp6Var.a);
                        if (a2 != null) {
                            rwe0Var = a2;
                        }
                    } else {
                        g.getClass();
                        rwe0Var = g;
                    }
                    eccVar.a = new izw(this.e, ctk.a(e7g0Var, tp6Var.a, rwe0Var, 0, h.h), selectedFormat, selectionReason, selectionData, i2.a);
                    return;
                }
            } else {
                j3 = j20;
                z = true;
            }
            rsk rskVar3 = this.k;
            boolean z2 = (rskVar3.d && this.l == rskVar3.m.size() + (-1)) ? z : false;
            boolean z3 = (z2 && j19 == C.TIME_UNSET) ? false : z;
            if (i2.c() == j17) {
                eccVar.b = z3;
                return;
            }
            btkVar3.getClass();
            long f2 = btkVar3.f(j19, S2) + j3;
            long b3 = i2.b(S2);
            if (z2) {
                long d2 = i2.d(b3);
                z3 &= (d2 - i2.e(b3)) + d2 >= j19 ? z : false;
            }
            if (aq10Var != null) {
                k = aq10Var.b();
                j4 = b3;
            } else {
                btkVar3.getClass();
                j4 = b3;
                k = y2r0.k(btkVar3.h(j, j19) + j3, f2, j4);
            }
            long j21 = k;
            if (j21 < f2) {
                this.m = new BehindLiveWindowException();
                return;
            }
            if (j21 > j4 || (this.n && j21 >= j4)) {
                eccVar.b = z3;
                return;
            }
            if (z3 && i2.e(j21) >= j19) {
                eccVar.b = z;
                return;
            }
            int min2 = (int) Math.min(this.g, (j4 - j21) + 1);
            int i3 = 1;
            if (j19 != C.TIME_UNSET) {
                while (min2 > 1 && i2.e((min2 + j21) - 1) >= j19) {
                    min2--;
                }
            }
            long j22 = list.isEmpty() ? j : -9223372036854775807L;
            androidx.media3.common.a selectedFormat2 = this.j.getSelectedFormat();
            int selectionReason2 = this.j.getSelectionReason();
            Object selectionData2 = this.j.getSelectionData();
            long e = i2.e(j21);
            btkVar3.getClass();
            rwe0 l = btkVar3.l(j21 - j3);
            androidx.media3.datasource.a aVar2 = this.e;
            if (dccVar == null) {
                zejVar = new vvj0(aVar2, ctk.a(e7g0Var, tp6Var.a, l, i2.f(j21, j18) ? 0 : 8, h.h), selectedFormat2, selectionReason2, selectionData2, e, i2.d(j21), j21, this.d, selectedFormat2);
            } else {
                int i4 = 1;
                while (i4 < min2) {
                    int i5 = min2;
                    btkVar3.getClass();
                    rwe0 a3 = l.a(btkVar3.l((j21 + i4) - j3), tp6Var.a);
                    if (a3 == null) {
                        break;
                    }
                    i3++;
                    i4++;
                    l = a3;
                    min2 = i5;
                }
                long j23 = (j21 + i3) - 1;
                long d3 = i2.d(j23);
                long j24 = (j19 == C.TIME_UNSET || j19 > d3) ? -9223372036854775807L : j19;
                evk a4 = ctk.a(e7g0Var, tp6Var.a, l, i2.f(j23, j18) ? 0 : 8, h.h);
                long j25 = -e7g0Var.d;
                if (io20.n(selectedFormat2.n)) {
                    j25 += e;
                }
                zejVar = new zej(aVar2, a4, selectedFormat2, selectionReason2, selectionData2, e, d3, j22, j24, j21, i3, j25, i2.a);
            }
            eccVar.a = zejVar;
        }
    }

    @Override // xsna.kcc
    public final int getPreferredQueueSize(long j, List<? extends aq10> list) {
        return (this.m != null || this.j.length() < 2) ? list.size() : this.j.evaluateQueueSize(j, list);
    }

    public final ArrayList<e7g0> h() {
        List<cj0> list = this.k.b(this.l).c;
        ArrayList<e7g0> arrayList = new ArrayList<>();
        for (int i : this.c) {
            arrayList.addAll(list.get(i).c);
        }
        return arrayList;
    }

    public final b i(int i) {
        b[] bVarArr = this.i;
        b bVar = bVarArr[i];
        tp6 e = this.b.e(bVar.b.c);
        if (e == null || e.equals(bVar.c)) {
            return bVar;
        }
        b bVar2 = new b(bVar.e, bVar.b, e, bVar.a, bVar.f, bVar.d);
        bVarArr[i] = bVar2;
        return bVar2;
    }

    @Override // xsna.kcc
    public final void maybeThrowError() throws IOException {
        BehindLiveWindowException behindLiveWindowException = this.m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.a.maybeThrowError();
    }

    @Override // xsna.kcc
    public final void release() {
        for (b bVar : this.i) {
            dcc dccVar = bVar.a;
            if (dccVar != null) {
                dccVar.release();
            }
        }
    }
}
