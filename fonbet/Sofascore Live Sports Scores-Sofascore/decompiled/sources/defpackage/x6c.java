package defpackage;

import android.os.Looper;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x6c {
    public final v6c a;
    public final Object b;
    public final ipg[] c;
    public boolean d;
    public boolean e;
    public a7c f;
    public boolean g;
    public final boolean[] h;
    public final m51[] i;
    public final hu4 j;
    public final tdc k;
    public x6c l;
    public psj m;
    public gtj n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [my2] */
    public x6c(m51[] m51VarArr, long j, hu4 hu4Var, zz0 zz0Var, tdc tdcVar, a7c a7cVar, gtj gtjVar) {
        this.i = m51VarArr;
        this.o = j;
        this.j = hu4Var;
        this.k = tdcVar;
        rcc rccVar = a7cVar.a;
        Object obj = rccVar.a;
        this.b = obj;
        this.f = a7cVar;
        this.m = psj.d;
        this.n = gtjVar;
        this.c = new ipg[m51VarArr.length];
        this.h = new boolean[m51VarArr.length];
        long j2 = a7cVar.b;
        long j3 = a7cVar.d;
        tdcVar.getClass();
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        rcc b = rccVar.b(pair.second);
        rdc rdcVar = (rdc) ((HashMap) tdcVar.d).get(obj2);
        rdcVar.getClass();
        ((HashSet) tdcVar.f).add(rdcVar);
        pdc pdcVar = (pdc) ((HashMap) tdcVar.e).get(rdcVar);
        if (pdcVar != null) {
            pdcVar.a.d(pdcVar.b);
        }
        rdcVar.c.add(b);
        kvb a = rdcVar.a.a(b, zz0Var, j2);
        ((IdentityHashMap) tdcVar.c).put(a, rdcVar);
        tdcVar.f();
        this.a = j3 != C.TIME_UNSET ? new my2(a, true, 0L, j3) : a;
    }

    public final long a(gtj gtjVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        m51[] m51VarArr;
        boolean[] zArr3;
        ipg[] ipgVarArr;
        mh6[] mh6VarArr = (mh6[]) gtjVar.e;
        int i = 0;
        while (true) {
            int i2 = gtjVar.b;
            zArr2 = this.h;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !gtjVar.p(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            m51VarArr = this.i;
            int length = m51VarArr.length;
            zArr3 = zArr2;
            ipgVarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (m51VarArr[i3].a == -2) {
                ipgVarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.n = gtjVar;
        c();
        long c = this.a.c(mh6VarArr, zArr3, ipgVarArr, zArr, j);
        for (int i4 = 0; i4 < m51VarArr.length; i4++) {
            if (m51VarArr[i4].a == -2 && this.n.r(i4)) {
                ipgVarArr[i4] = new f7a(22);
            }
        }
        this.e = false;
        for (int i5 = 0; i5 < ipgVarArr.length; i5++) {
            if (ipgVarArr[i5] != null) {
                qx9.t(gtjVar.r(i5));
                if (m51VarArr[i5].a != -2) {
                    this.e = true;
                }
            } else {
                qx9.t(mh6VarArr[i5] == null);
            }
        }
        return c;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            gtj gtjVar = this.n;
            if (i >= gtjVar.b) {
                return;
            }
            boolean r = gtjVar.r(i);
            mh6 mh6Var = ((mh6[]) this.n.e)[i];
            if (r && mh6Var != null) {
                mh6Var.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            gtj gtjVar = this.n;
            if (i >= gtjVar.b) {
                return;
            }
            boolean r = gtjVar.r(i);
            mh6 mh6Var = ((mh6[]) this.n.e)[i];
            if (r && mh6Var != null) {
                mh6Var.enable();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long bufferedPositionUs = this.e ? this.a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f.e : bufferedPositionUs;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    public final void f() {
        b();
        v6c v6cVar = this.a;
        try {
            boolean z = v6cVar instanceof my2;
            tdc tdcVar = this.k;
            if (z) {
                tdcVar.k(((my2) v6cVar).a);
            } else {
                tdcVar.k(v6cVar);
            }
        } catch (RuntimeException e) {
            m6k.C("Period release failed.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gtj g(float f, lij lijVar) {
        vt4 vt4Var;
        int i;
        boolean z;
        String str;
        boolean z2;
        vvf vvfVar;
        int i2;
        boolean z3;
        int i3;
        kh khVar;
        int i4;
        int[] iArr;
        Object obj;
        kh6 kh6Var;
        int i5;
        int i6;
        nsj nsjVar;
        int i7;
        yt4 yt4Var;
        int[] iArr2;
        hu4 hu4Var = this.j;
        m51[] m51VarArr = this.i;
        psj psjVar = this.m;
        hu4Var.getClass();
        int i8 = 1;
        int[] iArr3 = new int[m51VarArr.length + 1];
        int length = m51VarArr.length + 1;
        nsj[][] nsjVarArr = new nsj[length][];
        int[][][] iArr4 = new int[m51VarArr.length + 1][][];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = psjVar.a;
            nsjVarArr[i9] = new nsj[i10];
            iArr4[i9] = new int[i10][];
        }
        int length2 = m51VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            iArr5[i11] = m51VarArr[i11].v();
        }
        int i12 = 0;
        while (i12 < psjVar.a) {
            nsj a = psjVar.a(i12);
            int i13 = a.c == 5 ? i8 : 0;
            int length3 = m51VarArr.length;
            int i14 = i8;
            int i15 = 0;
            int i16 = 0;
            while (i15 < m51VarArr.length) {
                m51 m51Var = m51VarArr[i15];
                psj psjVar2 = psjVar;
                int[] iArr6 = iArr3;
                int i17 = i8;
                int i18 = 0;
                for (int i19 = 0; i19 < a.a; i19++) {
                    i18 = Math.max(i18, m51Var.u(a.d[i19]) & 7);
                }
                int i20 = iArr6[i15] == 0 ? i17 : 0;
                if (i18 > i16 || (i18 == i16 && i13 != 0 && i14 == 0 && i20 != 0)) {
                    i16 = i18;
                    i14 = i20;
                    length3 = i15;
                }
                i15++;
                i8 = i17;
                psjVar = psjVar2;
                iArr3 = iArr6;
            }
            psj psjVar3 = psjVar;
            int[] iArr7 = iArr3;
            int i21 = i8;
            if (length3 == m51VarArr.length) {
                iArr2 = new int[a.a];
            } else {
                m51 m51Var2 = m51VarArr[length3];
                int[] iArr8 = new int[a.a];
                for (int i22 = 0; i22 < a.a; i22++) {
                    iArr8[i22] = m51Var2.u(a.d[i22]);
                }
                iArr2 = iArr8;
            }
            int i23 = iArr7[length3];
            nsjVarArr[length3][i23] = a;
            iArr4[length3][i23] = iArr2;
            iArr7[length3] = i23 + 1;
            i12++;
            i8 = i21;
            psjVar = psjVar3;
            iArr3 = iArr7;
        }
        int[] iArr9 = iArr3;
        int i24 = i8;
        int i25 = 0;
        psj[] psjVarArr = new psj[m51VarArr.length];
        String[] strArr = new String[m51VarArr.length];
        int[] iArr10 = new int[m51VarArr.length];
        for (int i26 = 0; i26 < m51VarArr.length; i26++) {
            int i27 = iArr9[i26];
            psjVarArr[i26] = new psj((nsj[]) lik.A(nsjVarArr[i26], i27));
            iArr4[i26] = (int[][]) lik.A(iArr4[i26], i27);
            strArr[i26] = m51VarArr[i26].e();
            iArr10[i26] = m51VarArr[i26].a;
        }
        jub jubVar = new jub(iArr10, psjVarArr, iArr5, iArr4, new psj((nsj[]) lik.A(nsjVarArr[m51VarArr.length], iArr9[m51VarArr.length])));
        synchronized (hu4Var.c) {
            try {
                vt4Var = hu4Var.g;
                i = 32;
                if (vt4Var.J && lik.a >= 32 && (yt4Var = hu4Var.h) != null) {
                    Looper myLooper = Looper.myLooper();
                    qx9.u(myLooper);
                    yt4Var.b(hu4Var, myLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i28 = jubVar.a;
        kh6[] kh6VarArr = new kh6[i28];
        int i29 = 16;
        int i30 = 2;
        Pair g = hu4.g(2, jubVar, iArr4, new o3(15, vt4Var, iArr5), new z(16));
        if (g != null) {
            kh6VarArr[((Integer) g.second).intValue()] = (kh6) g.first;
        }
        int i31 = 0;
        while (true) {
            if (i31 >= jubVar.a) {
                z = 0;
                break;
            }
            if (2 == iArr10[i31] && psjVarArr[i31].a > 0) {
                z = i24;
                break;
            }
            i31++;
        }
        Pair g2 = hu4.g(i24, jubVar, iArr4, new lt4(hu4Var, vt4Var, z), new z(18));
        if (g2 != null) {
            kh6VarArr[((Integer) g2.second).intValue()] = (kh6) g2.first;
        }
        if (g2 == null) {
            str = null;
        } else {
            kh6 kh6Var2 = (kh6) g2.first;
            str = kh6Var2.a.d[kh6Var2.b[0]].c;
        }
        int i32 = 3;
        Pair g3 = hu4.g(3, jubVar, iArr4, new o3(i29, vt4Var, str), new z(20));
        if (g3 != null) {
            kh6VarArr[((Integer) g3.second).intValue()] = (kh6) g3.first;
        }
        int i33 = 0;
        while (i33 < i28) {
            int i34 = iArr10[i33];
            if (i34 == i30 || i34 == 1 || i34 == i32) {
                i5 = i;
                i6 = i33;
            } else {
                psj psjVar4 = psjVarArr[i33];
                int[][] iArr11 = iArr4[i33];
                int i35 = i25;
                int i36 = i35;
                i5 = i;
                nsj nsjVar2 = null;
                rt4 rt4Var = null;
                while (i35 < psjVar4.a) {
                    nsj a2 = psjVar4.a(i35);
                    int[] iArr12 = iArr11[i35];
                    rt4 rt4Var2 = rt4Var;
                    int i37 = i36;
                    nsj nsjVar3 = nsjVar2;
                    int i38 = i25;
                    while (i38 < a2.a) {
                        int i39 = i33;
                        if (hu4.d(iArr12[i38], vt4Var.K)) {
                            nsjVar = a2;
                            rt4 rt4Var3 = new rt4(a2.d[i38], iArr12[i38]);
                            if (rt4Var2 != null) {
                                i7 = i35;
                                if (w63.a.c(rt4Var3.b, rt4Var2.b).c(rt4Var3.a, rt4Var2.a).e() <= 0) {
                                }
                            } else {
                                i7 = i35;
                            }
                            rt4Var2 = rt4Var3;
                            i37 = i38;
                            nsjVar3 = nsjVar;
                        } else {
                            nsjVar = a2;
                            i7 = i35;
                        }
                        i38++;
                        i33 = i39;
                        a2 = nsjVar;
                        i35 = i7;
                    }
                    i35++;
                    nsjVar2 = nsjVar3;
                    i36 = i37;
                    rt4Var = rt4Var2;
                }
                i6 = i33;
                kh6VarArr[i6] = nsjVar2 == null ? null : new kh6(i25, nsjVar2, new int[]{i36});
            }
            i33 = i6 + 1;
            i = i5;
            i25 = 0;
            i30 = 2;
            i32 = 3;
        }
        int i40 = i;
        Object obj2 = null;
        int i41 = jubVar.a;
        psj[] psjVarArr2 = jubVar.c;
        HashMap hashMap = new HashMap();
        for (int i42 = 0; i42 < i41; i42++) {
            hu4.a(psjVarArr2[i42], vt4Var, hashMap);
        }
        hu4.a(jubVar.f, vt4Var, hashMap);
        for (int i43 = 0; i43 < i41; i43++) {
            ysj ysjVar = (ysj) hashMap.get(Integer.valueOf(jubVar.b[i43]));
            if (ysjVar != null) {
                nsj nsjVar4 = ysjVar.a;
                hv9 hv9Var = ysjVar.b;
                if (!hv9Var.isEmpty()) {
                    int indexOf = psjVarArr2[i43].b.indexOf(nsjVar4);
                    if (indexOf < 0) {
                        indexOf = -1;
                    }
                    if (indexOf != -1) {
                        kh6Var = new kh6(0, nsjVar4, jaa.O(hv9Var));
                        kh6VarArr[i43] = kh6Var;
                    }
                }
                kh6Var = null;
                kh6VarArr[i43] = kh6Var;
            }
        }
        int i44 = jubVar.a;
        for (int i45 = 0; i45 < i44; i45++) {
            psj psjVar5 = jubVar.c[i45];
            Map map = (Map) vt4Var.N.get(i45);
            if (map != null && map.containsKey(psjVar5)) {
                Map map2 = (Map) vt4Var.N.get(i45);
                if (map2 != null) {
                }
                kh6VarArr[i45] = null;
            }
        }
        for (int i46 = 0; i46 < i28; i46++) {
            int i47 = jubVar.b[i46];
            if (vt4Var.O.get(i46) || vt4Var.z.contains(Integer.valueOf(i47))) {
                kh6VarArr[i46] = null;
            }
        }
        a99 a99Var = hu4Var.e;
        qx9.u(hu4Var.b);
        ArrayList arrayList = new ArrayList();
        int i48 = 0;
        while (i48 < kh6VarArr.length) {
            kh6 kh6Var3 = kh6VarArr[i48];
            if (kh6Var3 == null || kh6Var3.b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                zu9 s = hv9.s();
                s.c(new ih(0L, 0L));
                arrayList.add(s);
                obj = obj2;
            }
            i48++;
            obj2 = obj;
        }
        int length4 = kh6VarArr.length;
        long[][] jArr = new long[length4][];
        for (int i49 = 0; i49 < kh6VarArr.length; i49++) {
            kh6 kh6Var4 = kh6VarArr[i49];
            if (kh6Var4 == null) {
                jArr[i49] = new long[0];
            } else {
                int[] iArr13 = kh6Var4.b;
                jArr[i49] = new long[iArr13.length];
                for (int i50 = 0; i50 < iArr13.length; i50++) {
                    long j = kh6Var4.a.d[iArr13[i50]].h;
                    long[] jArr2 = jArr[i49];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i50] = j;
                }
                Arrays.sort(jArr[i49]);
            }
        }
        int[] iArr14 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i51 = 0; i51 < length4; i51++) {
            long[] jArr4 = jArr[i51];
            jArr3[i51] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        kh.d(arrayList, jArr3);
        yqo.w(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(x5d.a);
        zyc zycVar = new zyc();
        yqo.w(2, "expectedValuesPerKey");
        azc azcVar = new azc(treeMap);
        azcVar.g = zycVar;
        int i52 = 0;
        while (i52 < length4) {
            long[] jArr5 = jArr[i52];
            if (jArr5.length <= 1) {
                i4 = length4;
                iArr = iArr14;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i53 = 0;
                while (true) {
                    long[] jArr6 = jArr[i52];
                    i4 = length4;
                    double d = 0.0d;
                    if (i53 >= jArr6.length) {
                        break;
                    }
                    int[] iArr15 = iArr14;
                    long j2 = jArr6[i53];
                    if (j2 != -1) {
                        d = Math.log(j2);
                    }
                    dArr[i53] = d;
                    i53++;
                    length4 = i4;
                    iArr14 = iArr15;
                }
                iArr = iArr14;
                int i54 = length5 - 1;
                double d2 = dArr[i54] - dArr[0];
                int i55 = 0;
                while (i55 < i54) {
                    double d3 = dArr[i55];
                    i55++;
                    azcVar.s(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i55]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i52));
                    d2 = d2;
                }
            }
            i52++;
            length4 = i4;
            iArr14 = iArr;
        }
        int[] iArr16 = iArr14;
        hv9 v = hv9.v(azcVar.t());
        for (int i56 = 0; i56 < v.size(); i56++) {
            int intValue = ((Integer) v.get(i56)).intValue();
            int i57 = iArr16[intValue] + 1;
            iArr16[intValue] = i57;
            jArr3[intValue] = jArr[intValue][i57];
            kh.d(arrayList, jArr3);
        }
        for (int i58 = 0; i58 < kh6VarArr.length; i58++) {
            if (arrayList.get(i58) != null) {
                jArr3[i58] = jArr3[i58] * 2;
            }
        }
        kh.d(arrayList, jArr3);
        zu9 s2 = hv9.s();
        for (int i59 = 0; i59 < arrayList.size(); i59++) {
            zu9 zu9Var = (zu9) arrayList.get(i59);
            s2.c(zu9Var == null ? vvf.e : zu9Var.g());
        }
        vvf g4 = s2.g();
        mh6[] mh6VarArr = new mh6[kh6VarArr.length];
        for (int i60 = 0; i60 < kh6VarArr.length; i60++) {
            kh6 kh6Var5 = kh6VarArr[i60];
            if (kh6Var5 != null) {
                int[] iArr17 = kh6Var5.b;
                if (iArr17.length != 0) {
                    int length6 = iArr17.length;
                    nsj nsjVar5 = kh6Var5.a;
                    if (length6 == 1) {
                        khVar = new kh(1, nsjVar5, new int[]{iArr17[0]});
                    } else {
                        hv9 hv9Var2 = (hv9) g4.get(i60);
                        kh khVar2 = new kh(0, nsjVar5, iArr17);
                        hv9.v(hv9Var2);
                        khVar = khVar2;
                    }
                    mh6VarArr[i60] = khVar;
                }
            }
        }
        ryf[] ryfVarArr = new ryf[i28];
        for (int i61 = 0; i61 < i28; i61++) {
            ryfVarArr[i61] = (vt4Var.O.get(i61) || vt4Var.z.contains(Integer.valueOf(jubVar.b[i61])) || (jubVar.b[i61] != -2 && mh6VarArr[i61] == null)) ? null : ryf.b;
        }
        if (vt4Var.L) {
            int i62 = -1;
            int i63 = -1;
            int i64 = 0;
            while (i64 < jubVar.a) {
                int i65 = jubVar.b[i64];
                mh6 mh6Var = mh6VarArr[i64];
                if ((i65 == 1 || i65 == 2) && mh6Var != null) {
                    int[][] iArr18 = iArr4[i64];
                    int indexOf2 = jubVar.c[i64].b.indexOf(mh6Var.getTrackGroup());
                    if (indexOf2 < 0) {
                        indexOf2 = -1;
                    }
                    int i66 = 0;
                    while (i66 < mh6Var.length()) {
                        i3 = i40;
                        if ((iArr18[indexOf2][mh6Var.getIndexInTrackGroup(i66)] & 32) == i3) {
                            i66++;
                            i40 = i3;
                        }
                    }
                    i3 = i40;
                    if (i65 == 1) {
                        i2 = -1;
                        if (i63 != -1) {
                            z3 = false;
                            break;
                        }
                        i63 = i64;
                        i64++;
                        i40 = i3;
                    } else {
                        i2 = -1;
                        if (i62 != -1) {
                            z3 = false;
                            break;
                        }
                        i62 = i64;
                        i64++;
                        i40 = i3;
                    }
                } else {
                    i3 = i40;
                }
                i64++;
                i40 = i3;
            }
            i2 = -1;
            z3 = true;
            if (((i63 == i2 || i62 == i2) ? false : true) & z3) {
                ryf ryfVar = new ryf(true);
                ryfVarArr[i63] = ryfVar;
                ryfVarArr[i62] = ryfVar;
            }
        }
        Pair create = Pair.create(ryfVarArr, mh6VarArr);
        mh6[] mh6VarArr2 = (mh6[]) create.second;
        List[] listArr = new List[mh6VarArr2.length];
        for (int i67 = 0; i67 < mh6VarArr2.length; i67++) {
            mh6 mh6Var2 = mh6VarArr2[i67];
            if (mh6Var2 != null) {
                vvfVar = hv9.z(mh6Var2);
            } else {
                av9 av9Var = hv9.b;
                vvfVar = vvf.e;
            }
            listArr[i67] = vvfVar;
        }
        int i68 = 4;
        zu9 zu9Var2 = new zu9(4);
        int i69 = 0;
        while (true) {
            int i70 = jubVar.a;
            psj[] psjVarArr3 = jubVar.c;
            if (i69 >= i70) {
                break;
            }
            psj psjVar6 = psjVarArr3[i69];
            List list = listArr[i69];
            int i71 = 0;
            while (i71 < psjVar6.a) {
                nsj a3 = psjVar6.a(i71);
                int i72 = psjVarArr3[i69].a(i71).a;
                int[] iArr19 = new int[i72];
                int i73 = 0;
                for (int i74 = 0; i74 < i72; i74++) {
                    if ((jubVar.e[i69][i71][i74] & 7) == i68) {
                        iArr19[i73] = i74;
                        i73++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr19, i73);
                List[] listArr2 = listArr;
                String str2 = null;
                int i75 = 0;
                boolean z4 = false;
                int i76 = 0;
                int i77 = 16;
                while (i75 < copyOf.length) {
                    String str3 = psjVarArr3[i69].a(i71).d[copyOf[i75]].l;
                    int i78 = i76 + 1;
                    if (i76 == 0) {
                        str2 = str3;
                    } else {
                        z4 = (!lik.a(str2, str3)) | z4;
                    }
                    i77 = Math.min(i77, jubVar.e[i69][i71][i75] & 24);
                    i75++;
                    i76 = i78;
                }
                if (z4) {
                    i77 = Math.min(i77, jubVar.d[i69]);
                }
                boolean z5 = i77 != 0;
                int i79 = a3.a;
                int[] iArr20 = new int[i79];
                boolean[] zArr = new boolean[i79];
                for (int i80 = 0; i80 < a3.a; i80++) {
                    iArr20[i80] = jubVar.e[i69][i71][i80] & 7;
                    int i81 = 0;
                    while (true) {
                        if (i81 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        mh6 mh6Var3 = (mh6) list.get(i81);
                        if (mh6Var3.getTrackGroup().equals(a3) && mh6Var3.indexOf(i80) != -1) {
                            z2 = true;
                            break;
                        }
                        i81++;
                    }
                    zArr[i80] = z2;
                }
                zu9Var2.c(new ruj(a3, z5, iArr20, zArr));
                i71++;
                listArr = listArr2;
                i68 = 4;
            }
            i69++;
            i68 = 4;
        }
        psj psjVar7 = jubVar.f;
        for (int i82 = 0; i82 < psjVar7.a; i82++) {
            nsj a4 = psjVar7.a(i82);
            int[] iArr21 = new int[a4.a];
            Arrays.fill(iArr21, 0);
            zu9Var2.c(new ruj(a4, false, iArr21, new boolean[a4.a]));
        }
        gtj gtjVar = new gtj((ryf[]) create.first, (mh6[]) create.second, new tuj(zu9Var2.g()), jubVar);
        for (mh6 mh6Var4 : (mh6[]) gtjVar.e) {
            if (mh6Var4 != null) {
                mh6Var4.onPlaybackSpeed(f);
            }
        }
        return gtjVar;
    }

    public final void h() {
        v6c v6cVar = this.a;
        if (v6cVar instanceof my2) {
            long j = this.f.d;
            if (j == C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            my2 my2Var = (my2) v6cVar;
            my2Var.e = 0L;
            my2Var.f = j;
        }
    }
}
