package defpackage;

import android.os.SystemClock;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class su2 implements jpg, a5h, vfb, agb {
    public final int a;
    public final int[] b;
    public final b[] c;
    public final boolean[] d;
    public final do4 e;
    public final dd4 f;
    public final b10 g;
    public final it7 h;
    public final x6k i;
    public final fjg j;
    public final ArrayList k;
    public final List l;
    public final hpg m;
    public final hpg[] n;
    public final z41 o;
    public mu2 p;
    public b q;
    public dd4 r;
    public long s;
    public long t;
    public int u;
    public x41 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public su2(int i, int[] iArr, b[] bVarArr, do4 do4Var, dd4 dd4Var, l2a l2aVar, long j, kc5 kc5Var, cc5 cc5Var, it7 it7Var, b10 b10Var, boolean z, long j2, irb irbVar) {
        this.a = i;
        this.b = iArr;
        this.c = bVarArr;
        this.e = do4Var;
        this.f = dd4Var;
        this.g = b10Var;
        this.h = it7Var;
        this.i = irbVar != null ? new x6k(irbVar, 1 == true ? 1 : 0) : new x6k("ChunkSampleStream");
        this.j = new fjg();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.n = new hpg[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        hpg[] hpgVarArr = new hpg[i2];
        kc5Var.getClass();
        hpg hpgVar = new hpg(l2aVar, kc5Var, cc5Var);
        this.m = hpgVar;
        int i3 = 0;
        iArr2[0] = i;
        hpgVarArr[0] = hpgVar;
        int i4 = 0;
        while (i4 < length) {
            hpg hpgVar2 = new hpg(l2aVar, null, null);
            this.n[i4] = hpgVar2;
            int i5 = i4 + 1;
            hpgVarArr[i5] = hpgVar2;
            iArr2[i5] = this.b[i4];
            i4 = i5;
        }
        this.o = new z41(i3, iArr2, hpgVarArr);
        this.s = j;
        this.t = j;
        this.w = z;
        if (!z || j2 == C.TIME_UNSET) {
            return;
        }
        this.w = false;
        this.x = j2 < j;
    }

    @Override // defpackage.vfb
    public final void b(yfb yfbVar, long j, long j2, boolean z) {
        mu2 mu2Var = (mu2) yfbVar;
        this.p = null;
        this.v = null;
        long j3 = mu2Var.a;
        xe4 xe4Var = mu2Var.b;
        tei teiVar = mu2Var.i;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        this.h.getClass();
        this.g.u(lfbVar, mu2Var.c, this.a, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h);
        if (z) {
            return;
        }
        if (k()) {
            this.m.F(false);
            for (hpg hpgVar : this.n) {
                hpgVar.F(false);
            }
        } else if (mu2Var instanceof x41) {
            ArrayList arrayList = this.k;
            h(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
        }
        this.f.b(this);
    }

    @Override // defpackage.vfb
    public final void d(yfb yfbVar, long j, long j2) {
        mu2 mu2Var = (mu2) yfbVar;
        this.p = null;
        do4 do4Var = this.e;
        bo4[] bo4VarArr = do4Var.h;
        if (mu2Var instanceof e3a) {
            int e = do4Var.i.e(((e3a) mu2Var).d);
            bo4 bo4Var = bo4VarArr[e];
            if (((jd4) bo4Var.f) == null) {
                l72 l72Var = (l72) bo4Var.c;
                l72Var.getClass();
                ou2 a = l72Var.a();
                if (a != null) {
                    ozf ozfVar = (ozf) bo4Var.d;
                    bo4VarArr[e] = new bo4(bo4Var.a, ozfVar, (o71) bo4Var.e, (l72) bo4Var.c, bo4Var.b, new am0(a, ozfVar.c, 2));
                }
            }
        }
        uoe uoeVar = do4Var.g;
        if (uoeVar != null) {
            long j3 = uoeVar.d;
            if (j3 == C.TIME_UNSET || mu2Var.h > j3) {
                uoeVar.d = mu2Var.h;
            }
            uoeVar.e.g = true;
        }
        long j4 = mu2Var.a;
        xe4 xe4Var = mu2Var.b;
        tei teiVar = mu2Var.i;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        this.h.getClass();
        this.g.v(lfbVar, mu2Var.c, this.a, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h);
        this.f.b(this);
    }

    @Override // defpackage.jpg
    public final int e(fp4 fp4Var, im4 im4Var, int i) {
        if (k() || m() || this.y) {
            return -3;
        }
        x41 x41Var = this.v;
        hpg hpgVar = this.m;
        if (x41Var != null && x41Var.c(0) <= hpgVar.u()) {
            return -3;
        }
        n();
        return hpgVar.E(fp4Var, im4Var, i, this.z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if (r3 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0418  */
    @Override // defpackage.a5h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(mgb mgbVar) {
        long j;
        List list;
        fjg fjgVar;
        long j2;
        boolean z;
        long j3;
        List list2;
        j2c j2cVar;
        bo4[] bo4VarArr;
        long j4;
        x6k x6kVar;
        fjg fjgVar2;
        long j5;
        List list3;
        boolean z2;
        long j6;
        long k;
        long j7;
        Object do3Var;
        jlf jlfVar;
        long k2;
        boolean z3;
        boolean z4;
        if (this.z) {
            return false;
        }
        x6k x6kVar2 = this.i;
        if (x6kVar2.l() || x6kVar2.c()) {
            return false;
        }
        boolean k3 = k();
        if (k3) {
            list = Collections.EMPTY_LIST;
            j = this.s;
        } else {
            j = i().h;
            list = this.l;
        }
        List list4 = list;
        do4 do4Var = this.e;
        xt1 xt1Var = do4Var.l;
        fjg fjgVar3 = this.j;
        if (xt1Var != null) {
            z = k3;
            fjgVar = fjgVar3;
            j2 = -9223372036854775807L;
        } else {
            fjgVar = fjgVar3;
            long j8 = mgbVar.a;
            j2 = -9223372036854775807L;
            long j9 = j - j8;
            long T = nik.T(do4Var.j.a(do4Var.k).b) + nik.T(do4Var.j.a) + j;
            uoe uoeVar = do4Var.g;
            if (uoeVar != null) {
                voe voeVar = uoeVar.e;
                zc4 zc4Var = voeVar.f;
                t9d t9dVar = voeVar.b;
                z = k3;
                if (!zc4Var.d) {
                    j3 = j8;
                    z3 = false;
                } else if (voeVar.h) {
                    j3 = j8;
                    z3 = true;
                } else {
                    j3 = j8;
                    Map.Entry ceilingEntry = voeVar.e.ceilingEntry(Long.valueOf(zc4Var.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= T) {
                        z3 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        id4 id4Var = (id4) t9dVar.a;
                        long j10 = id4Var.M;
                        if (j10 == C.TIME_UNSET || j10 < longValue) {
                            id4Var.M = longValue;
                        }
                        z3 = true;
                    }
                    if (z3 && voeVar.g) {
                        voeVar.h = true;
                        voeVar.g = false;
                        id4 id4Var2 = (id4) t9dVar.a;
                        id4Var2.D.removeCallbacks(id4Var2.w);
                        id4Var2.y();
                    }
                }
            } else {
                z = k3;
                j3 = j8;
            }
            long T2 = nik.T(nik.D(do4Var.f));
            zc4 zc4Var2 = do4Var.j;
            long j11 = zc4Var2.a;
            long T3 = j11 == C.TIME_UNSET ? -9223372036854775807L : T2 - nik.T(j11 + zc4Var2.a(do4Var.k).b);
            if (list4.isEmpty()) {
                list2 = list4;
                j2cVar = null;
            } else {
                list2 = list4;
                j2cVar = (j2c) mz1.g(1, list2);
            }
            int length = do4Var.i.length();
            k2c[] k2cVarArr = new k2c[length];
            long j12 = T3;
            int i = 0;
            while (true) {
                bo4VarArr = do4Var.h;
                if (i >= length) {
                    break;
                }
                bo4 bo4Var = bo4VarArr[i];
                jd4 jd4Var = (jd4) bo4Var.f;
                long j13 = j9;
                long j14 = bo4Var.b;
                long j15 = bo4Var.a;
                wib wibVar = k2c.x7;
                if (jd4Var == null) {
                    k2cVarArr[i] = wibVar;
                } else {
                    jd4Var.getClass();
                    long g = jd4Var.g(j15, T2) + j14;
                    long b = bo4Var.b(T2);
                    if (j2cVar != null) {
                        k2 = j2cVar.a();
                    } else {
                        jd4 jd4Var2 = (jd4) bo4Var.f;
                        jd4Var2.getClass();
                        k2 = nik.k(jd4Var2.j(j, j15) + j14, g, b);
                    }
                    long j16 = k2;
                    if (j16 < g) {
                        k2cVarArr[i] = wibVar;
                    } else {
                        k2cVarArr[i] = new co4(do4Var.b(i), j16, b);
                    }
                }
                i++;
                j9 = j13;
            }
            long j17 = j9;
            long j18 = 0;
            if (!do4Var.j.d || bo4VarArr[0].c() == 0) {
                j4 = -9223372036854775807L;
            } else {
                long d = bo4VarArr[0].d(bo4VarArr[0].b(T2));
                zc4 zc4Var3 = do4Var.j;
                long j19 = zc4Var3.a;
                long min = Math.min(j19 == C.TIME_UNSET ? -9223372036854775807L : T2 - nik.T(j19 + zc4Var3.a(do4Var.k).b), d) - j3;
                j18 = 0;
                j4 = Math.max(0L, min);
            }
            x6kVar = x6kVar2;
            fjgVar2 = fjgVar;
            long j20 = j18;
            long j21 = j3;
            j5 = -9223372036854775807L;
            do4Var.i.h(j21, j17, j4, list2, k2cVarArr);
            int selectedIndex = do4Var.i.getSelectedIndex();
            SystemClock.elapsedRealtime();
            bo4 b2 = do4Var.b(selectedIndex);
            long j22 = b2.a;
            long j23 = b2.b;
            jd4 jd4Var3 = (jd4) b2.f;
            o71 o71Var = (o71) b2.e;
            l72 l72Var = (l72) b2.c;
            ozf ozfVar = (ozf) b2.d;
            if (l72Var != null) {
                jlf jlfVar2 = l72Var.i == null ? ozfVar.e : null;
                if (jd4Var3 == null) {
                    list3 = list2;
                    jlfVar = ozfVar.c();
                } else {
                    list3 = list2;
                    jlfVar = null;
                }
                if (jlfVar2 != null || jlfVar != null) {
                    re4 re4Var = do4Var.e;
                    b selectedFormat = do4Var.i.getSelectedFormat();
                    int selectionReason = do4Var.i.getSelectionReason();
                    Object selectionData = do4Var.i.getSelectionData();
                    if (jlfVar2 != null) {
                        jlf a = jlfVar2.a(jlfVar, o71Var.a);
                        if (a != null) {
                            jlfVar2 = a;
                        }
                    } else {
                        jlfVar.getClass();
                        jlfVar2 = jlfVar;
                    }
                    fjgVar2.b = new e3a(re4Var, rz8.v(ozfVar, o71Var.a, jlfVar2, 0), selectedFormat, selectionReason, selectionData, (l72) b2.c);
                    z4 = fjgVar2.a;
                    mu2 mu2Var = (mu2) fjgVar2.b;
                    fjgVar2.b = null;
                    fjgVar2.a = false;
                    if (z4) {
                        this.s = j5;
                        this.z = true;
                        return true;
                    }
                    if (mu2Var == null) {
                        return false;
                    }
                    this.p = mu2Var;
                    boolean z5 = mu2Var instanceof x41;
                    z41 z41Var = this.o;
                    if (z5) {
                        x41 x41Var = (x41) mu2Var;
                        if (z) {
                            long j24 = x41Var.g;
                            long j25 = this.s;
                            if (j24 < j25) {
                                this.m.t = j25;
                                for (hpg hpgVar : this.n) {
                                    hpgVar.t = this.s;
                                }
                                this.x = this.w;
                            }
                            this.w = false;
                            this.s = C.TIME_UNSET;
                        }
                        x41Var.m = z41Var;
                        hpg[] hpgVarArr = (hpg[]) z41Var.c;
                        int[] iArr = new int[hpgVarArr.length];
                        for (int i2 = 0; i2 < hpgVarArr.length; i2++) {
                            hpg hpgVar2 = hpgVarArr[i2];
                            iArr[i2] = hpgVar2.q + hpgVar2.p;
                        }
                        x41Var.n = iArr;
                        this.k.add(x41Var);
                    } else if (mu2Var instanceof e3a) {
                        ((e3a) mu2Var).k = z41Var;
                    }
                    x6kVar.y(mu2Var, this, this.h.n(mu2Var.c));
                    return true;
                }
            } else {
                list3 = list2;
            }
            zc4 zc4Var4 = do4Var.j;
            boolean z6 = zc4Var4.d && do4Var.k == zc4Var4.m.size() + (-1);
            boolean z7 = (z6 && j22 == C.TIME_UNSET) ? false : true;
            if (b2.c() == j20) {
                fjgVar2.a = z7;
            } else {
                jd4Var3.getClass();
                boolean z8 = z7;
                long g2 = jd4Var3.g(j22, T2) + j23;
                long b3 = b2.b(T2);
                if (z6) {
                    long d2 = b2.d(b3);
                    z2 = z8 & ((d2 - b2.e(b3)) + d2 >= j22);
                } else {
                    z2 = z8;
                }
                if (j2cVar != null) {
                    k = j2cVar.a();
                    j6 = b3;
                } else {
                    jd4Var3.getClass();
                    j6 = b3;
                    k = nik.k(jd4Var3.j(j, j22) + j23, g2, j6);
                }
                long j26 = k;
                if (j26 < g2) {
                    do4Var.l = new xt1();
                } else {
                    if (j26 <= j6) {
                        long j27 = j;
                        if (!do4Var.m || j26 < j6) {
                            if (!z2 || b2.e(j26) < j22) {
                                long j28 = 1;
                                int min2 = (int) Math.min(1L, (j6 - j26) + 1);
                                if (j22 != C.TIME_UNSET) {
                                    while (min2 > 1) {
                                        j7 = j28;
                                        if (b2.e((min2 + j26) - j7) < j22) {
                                            break;
                                        }
                                        min2--;
                                        j28 = j7;
                                    }
                                }
                                j7 = j28;
                                long j29 = list3.isEmpty() ? j27 : -9223372036854775807L;
                                re4 re4Var2 = do4Var.e;
                                int i3 = do4Var.d;
                                b selectedFormat2 = do4Var.i.getSelectedFormat();
                                int selectionReason2 = do4Var.i.getSelectionReason();
                                Object selectionData2 = do4Var.i.getSelectionData();
                                long e = b2.e(j26);
                                jd4Var3.getClass();
                                jlf i4 = jd4Var3.i(j26 - j23);
                                if (l72Var == null) {
                                    do3Var = new oih(re4Var2, rz8.v(ozfVar, o71Var.a, i4, b2.f(j26, j12) ? 0 : 8), selectedFormat2, selectionReason2, selectionData2, e, b2.d(j26), j26, i3, selectedFormat2);
                                } else {
                                    int i5 = 1;
                                    int i6 = 1;
                                    while (true) {
                                        selectedFormat2 = selectedFormat2;
                                        if (i5 >= min2) {
                                            break;
                                        }
                                        jd4Var3.getClass();
                                        jlf a2 = i4.a(jd4Var3.i((j26 + i5) - j23), o71Var.a);
                                        if (a2 == null) {
                                            break;
                                        }
                                        i6++;
                                        i5++;
                                        i4 = a2;
                                    }
                                    long j30 = (j26 + i6) - j7;
                                    long d3 = b2.d(j30);
                                    long j31 = (j22 == C.TIME_UNSET || j22 > d3) ? -9223372036854775807L : j22;
                                    xe4 v = rz8.v(ozfVar, o71Var.a, i4, b2.f(j30, j12) ? 0 : 8);
                                    long j32 = -ozfVar.c;
                                    if (sjc.m(selectedFormat2.o)) {
                                        j32 += e;
                                    }
                                    do3Var = new do3(re4Var2, v, selectedFormat2, selectionReason2, selectionData2, e, d3, j29, j31, j26, i6, j32, (l72) b2.c);
                                }
                                fjgVar2.b = do3Var;
                            } else {
                                fjgVar2.a = true;
                            }
                        }
                    }
                    fjgVar2.a = z2;
                }
            }
            z4 = fjgVar2.a;
            mu2 mu2Var2 = (mu2) fjgVar2.b;
            fjgVar2.b = null;
            fjgVar2.a = false;
            if (z4) {
            }
        }
        x6kVar = x6kVar2;
        fjgVar2 = fjgVar;
        j5 = j2;
        z4 = fjgVar2.a;
        mu2 mu2Var22 = (mu2) fjgVar2.b;
        fjgVar2.b = null;
        fjgVar2.a = false;
        if (z4) {
        }
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        if (this.z) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.s;
        }
        long j = this.t;
        x41 i = i();
        if (!i.b()) {
            ArrayList arrayList = this.k;
            i = arrayList.size() > 1 ? (x41) mz1.h(arrayList, 2) : null;
        }
        if (i != null) {
            j = Math.max(j, i.h);
        }
        return Math.max(j, this.m.r());
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        if (k()) {
            return this.s;
        }
        if (this.z) {
            return Long.MIN_VALUE;
        }
        return i().h;
    }

    public final x41 h(int i) {
        ArrayList arrayList = this.k;
        x41 x41Var = (x41) arrayList.get(i);
        nik.Y(arrayList, i, arrayList.size());
        this.u = Math.max(this.u, arrayList.size());
        int i2 = 0;
        this.m.n(x41Var.c(0));
        while (true) {
            hpg[] hpgVarArr = this.n;
            if (i2 >= hpgVarArr.length) {
                return x41Var;
            }
            hpg hpgVar = hpgVarArr[i2];
            i2++;
            hpgVar.n(x41Var.c(i2));
        }
    }

    public final x41 i() {
        return (x41) mz1.h(this.k, 1);
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        return this.i.l();
    }

    @Override // defpackage.jpg
    public final boolean isReady() {
        return !k() && this.m.z(this.z);
    }

    public final boolean j(int i) {
        int u;
        x41 x41Var = (x41) this.k.get(i);
        if (this.m.u() > x41Var.c(0)) {
            return true;
        }
        int i2 = 0;
        do {
            hpg[] hpgVarArr = this.n;
            if (i2 >= hpgVarArr.length) {
                return false;
            }
            u = hpgVarArr[i2].u();
            i2++;
        } while (u <= x41Var.c(i2));
        return true;
    }

    public final boolean k() {
        return this.s != C.TIME_UNSET;
    }

    @Override // defpackage.vfb
    public final void l(yfb yfbVar, long j, long j2, int i) {
        lfb lfbVar;
        mu2 mu2Var = (mu2) yfbVar;
        if (i == 0) {
            long j3 = mu2Var.a;
            lfbVar = new lfb(mu2Var.b, j);
        } else {
            long j4 = mu2Var.a;
            xe4 xe4Var = mu2Var.b;
            tei teiVar = mu2Var.i;
            lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        }
        this.g.y(lfbVar, mu2Var.c, this.a, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, i);
    }

    public final boolean m() {
        return ((!this.w && !this.x) || this.z || this.i.c()) ? false : true;
    }

    @Override // defpackage.jpg
    public final void maybeThrowError() {
        x6k x6kVar = this.i;
        x6kVar.maybeThrowError();
        this.m.B();
        if (x6kVar.l()) {
            return;
        }
        do4 do4Var = this.e;
        xt1 xt1Var = do4Var.l;
        if (xt1Var != null) {
            throw xt1Var;
        }
        do4Var.a.maybeThrowError();
    }

    public final void n() {
        int o = o(this.m.u(), this.u - 1);
        while (true) {
            int i = this.u;
            if (i > o) {
                return;
            }
            this.u = i + 1;
            x41 x41Var = (x41) this.k.get(i);
            b bVar = x41Var.d;
            if (!bVar.equals(this.q)) {
                this.g.i(this.a, bVar, x41Var.e, x41Var.f, x41Var.g);
            }
            this.q = bVar;
        }
    }

    public final int o(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((x41) arrayList.get(i2)).c(0) <= i);
        return i2 - 1;
    }

    @Override // defpackage.agb
    public final void onLoaderReleased() {
        hpg hpgVar = this.m;
        hpgVar.F(true);
        xb5 xb5Var = hpgVar.h;
        if (xb5Var != null) {
            xb5Var.d(hpgVar.e);
            hpgVar.h = null;
            hpgVar.g = null;
        }
        for (hpg hpgVar2 : this.n) {
            hpgVar2.F(true);
            xb5 xb5Var2 = hpgVar2.h;
            if (xb5Var2 != null) {
                xb5Var2.d(hpgVar2.e);
                hpgVar2.h = null;
                hpgVar2.g = null;
            }
        }
        for (bo4 bo4Var : this.e.h) {
            l72 l72Var = (l72) bo4Var.c;
            if (l72Var != null) {
                l72Var.a.release();
            }
        }
        dd4 dd4Var = this.r;
        if (dd4Var != null) {
            synchronized (dd4Var) {
                uoe uoeVar = (uoe) dd4Var.n.remove(this);
                if (uoeVar != null) {
                    hpg hpgVar3 = uoeVar.a;
                    hpgVar3.F(true);
                    xb5 xb5Var3 = hpgVar3.h;
                    if (xb5Var3 != null) {
                        xb5Var3.d(null);
                        hpgVar3.h = null;
                        hpgVar3.g = null;
                    }
                }
            }
        }
    }

    public final void p(dd4 dd4Var) {
        this.r = dd4Var;
        hpg hpgVar = this.m;
        hpgVar.k();
        xb5 xb5Var = hpgVar.h;
        if (xb5Var != null) {
            xb5Var.d(hpgVar.e);
            hpgVar.h = null;
            hpgVar.g = null;
        }
        for (hpg hpgVar2 : this.n) {
            hpgVar2.k();
            xb5 xb5Var2 = hpgVar2.h;
            if (xb5Var2 != null) {
                xb5Var2.d(hpgVar2.e);
                hpgVar2.h = null;
                hpgVar2.g = null;
            }
        }
        this.i.x(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0297  */
    @Override // defpackage.vfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r5a r(yfb yfbVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        it7 it7Var;
        ArrayList arrayList;
        lfb lfbVar;
        boolean z4;
        boolean z5;
        long j3;
        boolean z6;
        r5a r5aVar;
        boolean b;
        mu2 mu2Var = (mu2) yfbVar;
        tei teiVar = mu2Var.i;
        b bVar = mu2Var.d;
        long j4 = mu2Var.g;
        long j5 = teiVar.b;
        boolean z7 = mu2Var instanceof x41;
        ArrayList arrayList2 = this.k;
        int size = arrayList2.size() - 1;
        if (j5 != 0 && z7 && j(size)) {
            z = false;
            z2 = false;
        } else {
            z = true;
            z2 = false;
        }
        xe4 xe4Var = mu2Var.b;
        tei teiVar2 = mu2Var.i;
        lfb lfbVar2 = new lfb(xe4Var, teiVar2.c, teiVar2.d, j, j2, j5);
        nik.h0(j4);
        nik.h0(mu2Var.h);
        yz1 yz1Var = new yz1(iOException, i, 7);
        do4 do4Var = this.e;
        bo4[] bo4VarArr = do4Var.h;
        ujg ujgVar = do4Var.b;
        it7 it7Var2 = this.h;
        if (z) {
            z3 = z7;
            uoe uoeVar = do4Var.g;
            if (uoeVar != null) {
                long j6 = uoeVar.d;
                boolean z8 = j6 != C.TIME_UNSET && j6 < j4;
                voe voeVar = uoeVar.e;
                if (voeVar.f.d) {
                    if (!voeVar.h) {
                        if (z8) {
                            if (voeVar.g) {
                                voeVar.h = true;
                                voeVar.g = false;
                                id4 id4Var = (id4) voeVar.b.a;
                                id4Var.D.removeCallbacks(id4Var.w);
                                id4Var.y();
                            }
                        }
                    }
                    it7Var = it7Var2;
                    arrayList = arrayList2;
                    z4 = z;
                    lfbVar = lfbVar2;
                    z5 = true;
                    z6 = true;
                    if (z6) {
                        if (z4) {
                            if (z3) {
                                z1a.E(h(size) == mu2Var ? z5 : false);
                                if (arrayList.isEmpty()) {
                                    this.s = this.t;
                                }
                            }
                            r5aVar = x6k.f;
                            if (r5aVar == null) {
                                it7Var.getClass();
                                long o = it7.o(yz1Var);
                                r5aVar = o != C.TIME_UNSET ? new r5a(o, 0, false) : x6k.g;
                            }
                            r5a r5aVar2 = r5aVar;
                            b = r5aVar2.b();
                            this.g.w(lfbVar, mu2Var.c, this.a, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, iOException, !b);
                            if (!b) {
                                this.p = null;
                                it7Var.getClass();
                                this.f.b(this);
                            }
                            return r5aVar2;
                        }
                        tgj.d0("Ignoring attempt to cancel non-cancelable load.");
                    }
                    r5aVar = null;
                    if (r5aVar == null) {
                    }
                    r5a r5aVar22 = r5aVar;
                    b = r5aVar22.b();
                    this.g.w(lfbVar, mu2Var.c, this.a, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, iOException, !b);
                    if (!b) {
                    }
                    return r5aVar22;
                }
            }
            if (!do4Var.j.d && (mu2Var instanceof j2c) && (iOException instanceof si9) && ((si9) iOException).c == 404) {
                bo4 bo4Var = bo4VarArr[do4Var.i.e(mu2Var.d)];
                long c = bo4Var.c();
                if (c != -1 && c != 0) {
                    jd4 jd4Var = (jd4) bo4Var.f;
                    jd4Var.getClass();
                    if (((j2c) mu2Var).a() > ((jd4Var.p() + bo4Var.b) + c) - 1) {
                        do4Var.m = true;
                        it7Var = it7Var2;
                        arrayList = arrayList2;
                        z4 = z;
                        lfbVar = lfbVar2;
                        z5 = true;
                        z6 = true;
                        if (z6) {
                        }
                        r5aVar = null;
                        if (r5aVar == null) {
                        }
                        r5a r5aVar222 = r5aVar;
                        b = r5aVar222.b();
                        this.g.w(lfbVar, mu2Var.c, this.a, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, iOException, !b);
                        if (!b) {
                        }
                        return r5aVar222;
                    }
                }
            }
            bo4 bo4Var2 = bo4VarArr[do4Var.i.e(bVar)];
            ozf ozfVar = (ozf) bo4Var2.d;
            o71 o71Var = (o71) bo4Var2.e;
            o71 d0 = ujgVar.d0(ozfVar.b);
            if (d0 == null || o71Var.equals(d0)) {
                nh6 nh6Var = do4Var.i;
                hv9 hv9Var = ((ozf) bo4Var2.d).b;
                boolean z9 = z;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                it7Var = it7Var2;
                int length = nh6Var.length();
                arrayList = arrayList2;
                lfbVar = lfbVar2;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (nh6Var.d(i3, elapsedRealtime)) {
                        i2++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < hv9Var.size(); i4++) {
                    hashSet.add(Integer.valueOf(((o71) hv9Var.get(i4)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList E = ujgVar.E(hv9Var);
                z4 = z9;
                for (int i5 = 0; i5 < E.size(); i5++) {
                    hashSet2.add(Integer.valueOf(((o71) E.get(i5)).c));
                }
                jfb jfbVar = new jfb(size2, size2 - hashSet2.size(), length, i2);
                if (jfbVar.a(2) || jfbVar.a(1)) {
                    it7Var.getClass();
                    r5a j7 = it7.j(jfbVar, yz1Var);
                    if (j7 != null) {
                        long j8 = j7.b;
                        int i6 = j7.a;
                        if (jfbVar.a(i6)) {
                            if (i6 == 2) {
                                nh6 nh6Var2 = do4Var.i;
                                z6 = nh6Var2.g(nh6Var2.e(bVar), j8);
                                z5 = true;
                            } else {
                                z5 = true;
                                if (i6 == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j8;
                                    String str = o71Var.b;
                                    HashMap hashMap = (HashMap) ujgVar.b;
                                    if (hashMap.containsKey(str)) {
                                        Long l = (Long) hashMap.get(str);
                                        String str2 = nik.a;
                                        j3 = Math.max(elapsedRealtime2, l.longValue());
                                    } else {
                                        j3 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j3));
                                    int i7 = o71Var.c;
                                    if (i7 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i7);
                                        HashMap hashMap2 = (HashMap) ujgVar.c;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l2 = (Long) hashMap2.get(valueOf);
                                            String str3 = nik.a;
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                        }
                                        hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                    }
                                    z6 = true;
                                }
                                z6 = false;
                            }
                            if (z6) {
                            }
                            r5aVar = null;
                            if (r5aVar == null) {
                            }
                            r5a r5aVar2222 = r5aVar;
                            b = r5aVar2222.b();
                            this.g.w(lfbVar, mu2Var.c, this.a, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, iOException, !b);
                            if (!b) {
                            }
                            return r5aVar2222;
                        }
                    }
                }
            }
            it7Var = it7Var2;
            arrayList = arrayList2;
            z4 = z;
            lfbVar = lfbVar2;
            z5 = true;
            z6 = true;
            if (z6) {
            }
            r5aVar = null;
            if (r5aVar == null) {
            }
            r5a r5aVar22222 = r5aVar;
            b = r5aVar22222.b();
            this.g.w(lfbVar, mu2Var.c, this.a, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, iOException, !b);
            if (!b) {
            }
            return r5aVar22222;
        }
        z3 = z7;
        it7Var = it7Var2;
        arrayList = arrayList2;
        z4 = z;
        lfbVar = lfbVar2;
        z5 = true;
        z6 = false;
        if (z6) {
        }
        r5aVar = null;
        if (r5aVar == null) {
        }
        r5a r5aVar222222 = r5aVar;
        b = r5aVar222222.b();
        this.g.w(lfbVar, mu2Var.c, this.a, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, iOException, !b);
        if (!b) {
        }
        return r5aVar222222;
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        x6k x6kVar = this.i;
        if (x6kVar.c() || k()) {
            return;
        }
        boolean l = x6kVar.l();
        List list = this.l;
        do4 do4Var = this.e;
        ArrayList arrayList = this.k;
        if (l) {
            mu2 mu2Var = this.p;
            mu2Var.getClass();
            boolean z = mu2Var instanceof x41;
            if (z && j(arrayList.size() - 1)) {
                return;
            }
            if (do4Var.l == null ? do4Var.i.f(j, mu2Var, list) : false) {
                x6kVar.a();
                if (z) {
                    this.v = (x41) mu2Var;
                    return;
                }
                return;
            }
            return;
        }
        int size = (do4Var.l != null || do4Var.i.length() < 2) ? list.size() : do4Var.i.evaluateQueueSize(j, list);
        if (size < arrayList.size()) {
            z1a.E(!x6kVar.l());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!j(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size != -1) {
                long j2 = i().h;
                x41 h = h(size);
                if (arrayList.isEmpty()) {
                    this.s = this.t;
                }
                this.z = false;
                this.g.F(this.a, h.g, j2);
            }
        }
        if (this.m.y()) {
            this.z = true;
        }
    }

    @Override // defpackage.jpg
    public final int skipData(long j) {
        if (k() || m() || this.y) {
            return 0;
        }
        boolean z = this.z;
        hpg hpgVar = this.m;
        int w = hpgVar.w(j, z);
        x41 x41Var = this.v;
        if (x41Var != null) {
            w = Math.min(w, x41Var.c(0) - hpgVar.u());
        }
        hpgVar.J(w);
        n();
        return w;
    }
}
