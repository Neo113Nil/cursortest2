package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y6c {
    public final w6c a;
    public final Object b;
    public final jpg[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public b7c g;
    public boolean h;
    public final boolean[] i;
    public final n51[] j;
    public final iu4 k;
    public final tdc l;
    public y6c m;
    public qsj n;
    public gtj o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ny2] */
    public y6c(n51[] n51VarArr, long j, iu4 iu4Var, l2a l2aVar, tdc tdcVar, b7c b7cVar, gtj gtjVar) {
        this.j = n51VarArr;
        this.p = j;
        this.k = iu4Var;
        this.l = tdcVar;
        scc sccVar = b7cVar.a;
        Object obj = sccVar.a;
        this.b = obj;
        this.g = b7cVar;
        this.n = qsj.d;
        this.o = gtjVar;
        this.c = new jpg[n51VarArr.length];
        this.i = new boolean[n51VarArr.length];
        long j2 = b7cVar.b;
        long j3 = b7cVar.e;
        boolean z = b7cVar.g;
        tdcVar.getClass();
        int i = sye.k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        scc a = sccVar.a(pair.second);
        sdc sdcVar = (sdc) ((HashMap) tdcVar.d).get(obj2);
        sdcVar.getClass();
        ((HashSet) tdcVar.f).add(sdcVar);
        qdc qdcVar = (qdc) ((HashMap) tdcVar.e).get(sdcVar);
        if (qdcVar != null) {
            ((b51) qdcVar.a).j(qdcVar.b);
        }
        sdcVar.c.add(a);
        lvb c = sdcVar.a.c(a, l2aVar, j2);
        ((IdentityHashMap) tdcVar.c).put(c, sdcVar);
        tdcVar.f();
        this.a = j3 != C.TIME_UNSET ? new ny2(c, !z, 0L, j3, 0) : c;
    }

    public final long a(gtj gtjVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        n51[] n51VarArr;
        boolean[] zArr3;
        jpg[] jpgVarArr;
        nh6[] nh6VarArr = (nh6[]) gtjVar.e;
        int i = 0;
        while (true) {
            int i2 = gtjVar.b;
            zArr2 = this.i;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !gtjVar.q(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            n51VarArr = this.j;
            int length = n51VarArr.length;
            zArr3 = zArr2;
            jpgVarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (n51VarArr[i3].b == -2) {
                jpgVarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = gtjVar;
        c();
        long a = this.a.a(nh6VarArr, zArr3, jpgVarArr, zArr, j);
        for (int i4 = 0; i4 < n51VarArr.length; i4++) {
            if (n51VarArr[i4].b == -2 && this.o.r(i4)) {
                jpgVarArr[i4] = new om5();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < jpgVarArr.length; i5++) {
            if (jpgVarArr[i5] != null) {
                z1a.E(gtjVar.r(i5));
                if (n51VarArr[i5].b != -2) {
                    this.f = true;
                }
            } else {
                z1a.E(nh6VarArr[i5] == null);
            }
        }
        return a;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            gtj gtjVar = this.o;
            if (i >= gtjVar.b) {
                return;
            }
            boolean r = gtjVar.r(i);
            nh6 nh6Var = ((nh6[]) this.o.e)[i];
            if (r && nh6Var != null) {
                nh6Var.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            gtj gtjVar = this.o;
            if (i >= gtjVar.b) {
                return;
            }
            boolean r = gtjVar.r(i);
            nh6 nh6Var = ((nh6[]) this.o.e)[i];
            if (r && nh6Var != null) {
                nh6Var.enable();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long bufferedPositionUs = this.f ? this.a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.g.f : bufferedPositionUs;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, mij mijVar, boolean z) {
        this.e = true;
        this.n = this.a.getTrackGroups();
        gtj j = j(f, mijVar, z);
        b7c b7cVar = this.g;
        long j2 = b7cVar.b;
        long j3 = b7cVar.f;
        if (j3 != C.TIME_UNSET && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        b7c b7cVar2 = this.g;
        this.p = (b7cVar2.b - a) + j4;
        this.g = b7cVar2.b(a, b7cVar2.c);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= C.TIME_UNSET;
        }
        return false;
    }

    public final void i() {
        b();
        w6c w6cVar = this.a;
        try {
            boolean z = w6cVar instanceof ny2;
            tdc tdcVar = this.l;
            if (z) {
                tdcVar.l(((ny2) w6cVar).a);
            } else {
                tdcVar.l(w6cVar);
            }
        } catch (RuntimeException e) {
            tgj.A("Period release failed.", e);
        }
    }

    public final gtj j(float f, mij mijVar, boolean z) {
        wt4 wt4Var;
        String str;
        long j;
        boolean z2;
        vvf vvfVar;
        int i;
        int[] iArr;
        int i2;
        long[][] jArr;
        int[] iArr2;
        qsj[] qsjVarArr;
        String str2;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pair;
        boolean z3;
        Context context;
        int[] iArr3;
        iu4 iu4Var = this.k;
        n51[] n51VarArr = this.j;
        qsj qsjVar = this.n;
        iu4Var.getClass();
        int i3 = 1;
        int[] iArr4 = new int[n51VarArr.length + 1];
        int length = n51VarArr.length + 1;
        osj[][] osjVarArr = new osj[length][];
        int[][][] iArr5 = new int[n51VarArr.length + 1][][];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = qsjVar.a;
            osjVarArr[i4] = new osj[i5];
            iArr5[i4] = new int[i5][];
        }
        int length2 = n51VarArr.length;
        int[] iArr6 = new int[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            iArr6[i6] = n51VarArr[i6].B();
        }
        int i7 = 0;
        while (i7 < qsjVar.a) {
            osj a = qsjVar.a(i7);
            int i8 = a.c == 5 ? i3 : 0;
            int length3 = n51VarArr.length;
            int i9 = i3;
            int i10 = 0;
            int i11 = 0;
            while (i10 < n51VarArr.length) {
                n51 n51Var = n51VarArr[i10];
                qsj qsjVar2 = qsjVar;
                int[] iArr7 = iArr4;
                int i12 = i3;
                int i13 = 0;
                for (int i14 = 0; i14 < a.a; i14++) {
                    i13 = Math.max(i13, n51Var.A(a.d[i14]) & 7);
                }
                int i15 = iArr7[i10] == 0 ? i12 : 0;
                if (i13 > i11 || (i13 == i11 && i8 != 0 && i9 == 0 && i15 != 0)) {
                    i11 = i13;
                    i9 = i15;
                    length3 = i10;
                }
                i10++;
                i3 = i12;
                qsjVar = qsjVar2;
                iArr4 = iArr7;
            }
            qsj qsjVar3 = qsjVar;
            int[] iArr8 = iArr4;
            int i16 = i3;
            if (length3 == n51VarArr.length) {
                iArr3 = new int[a.a];
            } else {
                n51 n51Var2 = n51VarArr[length3];
                int[] iArr9 = new int[a.a];
                for (int i17 = 0; i17 < a.a; i17++) {
                    iArr9[i17] = n51Var2.A(a.d[i17]);
                }
                iArr3 = iArr9;
            }
            int i18 = iArr8[length3];
            osjVarArr[length3][i18] = a;
            iArr5[length3][i18] = iArr3;
            iArr8[length3] = i18 + 1;
            i7++;
            i3 = i16;
            qsjVar = qsjVar3;
            iArr4 = iArr8;
        }
        int[] iArr10 = iArr4;
        int i19 = i3;
        int i20 = 0;
        qsj[] qsjVarArr2 = new qsj[n51VarArr.length];
        String[] strArr = new String[n51VarArr.length];
        int[] iArr11 = new int[n51VarArr.length];
        for (int i21 = 0; i21 < n51VarArr.length; i21++) {
            int i22 = iArr10[i21];
            qsjVarArr2[i21] = new qsj((osj[]) nik.V(osjVarArr[i21], i22));
            iArr5[i21] = (int[][]) nik.V(iArr5[i21], i22);
            strArr[i21] = n51VarArr[i21].h();
            iArr11[i21] = n51VarArr[i21].b;
        }
        kub kubVar = new kub(iArr11, qsjVarArr2, iArr6, iArr5, new qsj((osj[]) nik.V(osjVarArr[n51VarArr.length], iArr10[n51VarArr.length])));
        synchronized (iu4Var.c) {
            iu4Var.g = Thread.currentThread();
            wt4Var = iu4Var.f;
        }
        Boolean bool = iu4Var.j;
        if (bool == null && (context = iu4Var.d) != null) {
            bool = Boolean.valueOf(nik.S(context));
            iu4Var.j = bool;
        }
        if (wt4Var.C && Build.VERSION.SDK_INT >= 32 && iu4Var.h == null) {
            iu4Var.h = new gxh(iu4Var.d, new wb3(iu4Var, 15), bool);
        }
        int i23 = kubVar.a;
        lh6[] lh6VarArr = new lh6[i23];
        iu4.c(kubVar, wt4Var, lh6VarArr);
        iu4.a(kubVar, wt4Var, lh6VarArr);
        iu4.b(kubVar, wt4Var, lh6VarArr);
        Context context2 = iu4Var.d;
        int i24 = kubVar.a;
        Pair e = iu4.e(lh6VarArr, i19);
        if (e == null) {
            int i25 = 0;
            while (true) {
                if (i25 >= i24) {
                    z3 = false;
                    break;
                }
                if (2 == iArr11[i25] && qsjVarArr2[i25].a > 0) {
                    z3 = true;
                    break;
                }
                i25++;
            }
            e = iu4.m(1, kubVar, iArr5, new mt4(z3, iu4Var, wt4Var, iArr6), new z(21));
            if (e != null) {
                lh6VarArr[((Integer) e.second).intValue()] = (lh6) e.first;
            }
        }
        if (e == null) {
            str = null;
        } else {
            lh6 lh6Var = (lh6) e.first;
            str = lh6Var.a.d[lh6Var.b[0]].d;
        }
        Pair e2 = iu4.e(lh6VarArr, 2);
        Pair e3 = iu4.e(lh6VarArr, 4);
        if (e2 == null && e3 == null) {
            wt4Var.q.getClass();
            Pair m = iu4.m(2, kubVar, iArr5, new w01(wt4Var, str, iArr6, (!wt4Var.g || context2 == null) ? null : nik.z(context2)), new z(19));
            if (m == null) {
                wt4Var.q.getClass();
                pair = iu4.m(4, kubVar, iArr5, new kt4(wt4Var, i20), new z(17));
            } else {
                pair = null;
            }
            if (pair != null) {
                lh6VarArr[((Integer) pair.second).intValue()] = (lh6) pair.first;
            } else if (m != null) {
                lh6VarArr[((Integer) m.second).intValue()] = (lh6) m.first;
            }
        }
        if (iu4.e(lh6VarArr, 3) == null) {
            wt4Var.q.getClass();
            if (!wt4Var.t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str2 = null;
            } else {
                String str3 = nik.a;
                str2 = locale.toLanguageTag();
            }
            Pair m2 = iu4.m(3, kubVar, iArr5, new li3(4, wt4Var, str, str2), new z(22));
            if (m2 != null) {
                lh6VarArr[((Integer) m2.second).intValue()] = (lh6) m2.first;
            }
        }
        wt4Var.q.getClass();
        int i26 = vv9.c;
        tv9 tv9Var = new tv9(4);
        int a2 = n51.a(0, 0, 0, 0);
        int i27 = 0;
        while (i27 < i23) {
            lh6 lh6Var2 = lh6VarArr[i27];
            if (lh6Var2 != null) {
                osj osjVar = lh6Var2.a;
                if (!wt4Var.G.get(i27)) {
                    iArr2 = iArr11;
                    if (!wt4Var.w.contains(Integer.valueOf(osjVar.c))) {
                        tv9Var.a(osjVar.b);
                        int i28 = 0;
                        while (true) {
                            int[] iArr12 = lh6Var2.b;
                            qsjVarArr = qsjVarArr2;
                            if (i28 < iArr12.length) {
                                String str4 = osjVar.d[iArr12[i28]].m;
                                if (str4 != null) {
                                    tv9Var.c(str4);
                                }
                                i28++;
                                qsjVarArr2 = qsjVarArr;
                            }
                        }
                        i27++;
                        iArr11 = iArr2;
                        qsjVarArr2 = qsjVarArr;
                    }
                    qsjVarArr = qsjVarArr2;
                    i27++;
                    iArr11 = iArr2;
                    qsjVarArr2 = qsjVarArr;
                }
            }
            iArr2 = iArr11;
            qsjVarArr = qsjVarArr2;
            i27++;
            iArr11 = iArr2;
            qsjVarArr2 = qsjVarArr;
        }
        int[] iArr13 = iArr11;
        qsj[] qsjVarArr3 = qsjVarArr2;
        vv9 h = tv9Var.h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i29 = 0;
        while (i29 < i24) {
            if (iArr13[i29] == 5) {
                qsj qsjVar4 = qsjVarArr3[i29];
                int i30 = 0;
                while (i30 < qsjVar4.a) {
                    osj a3 = qsjVar4.a(i30);
                    arrayList.add(a3);
                    int i31 = i29;
                    int[] iArr14 = (int[]) iArr5[i29][i30].clone();
                    qsj qsjVar5 = qsjVar4;
                    int[][][] iArr15 = iArr5;
                    for (int i32 = 0; i32 < iArr14.length; i32++) {
                        String str5 = a3.d[i32].m;
                        if (str5 != null && !h.contains(str5)) {
                            iArr14[i32] = a2;
                        }
                    }
                    arrayList2.add(iArr14);
                    i30++;
                    qsjVar4 = qsjVar5;
                    i29 = i31;
                    iArr5 = iArr15;
                }
            }
            i29++;
            iArr5 = iArr5;
        }
        int[][][] iArr16 = iArr5;
        int size = arrayList.size();
        osj[] osjVarArr2 = new osj[size];
        z1a.E(arrayList.size() == size);
        arrayList.toArray(osjVarArr2);
        qsj qsjVar6 = new qsj(osjVarArr2);
        int size2 = arrayList2.size();
        int[][] iArr17 = new int[size2][];
        z1a.E(arrayList2.size() == size2);
        arrayList2.toArray(iArr17);
        for (int i33 = 0; i33 < i24; i33++) {
            if (iArr13[i33] == 5) {
                lh6 l = iu4.l(qsjVar6, iArr17, wt4Var);
                lh6VarArr[i33] = l;
                if (l == null) {
                    break;
                }
                Arrays.fill(iArr17[qsjVar6.b(l.a)], a2);
            }
        }
        for (int i34 = 0; i34 < i24; i34++) {
            int i35 = iArr13[i34];
            if (i35 != 2 && i35 != 1) {
                if (i35 != 3 && i35 != 4) {
                    if (i35 != 5 && lh6VarArr[i34] == null) {
                        lh6VarArr[i34] = iu4.l(qsjVarArr3[i34], iArr16[i34], wt4Var);
                    }
                }
            }
        }
        iu4.c(kubVar, wt4Var, lh6VarArr);
        iu4.a(kubVar, wt4Var, lh6VarArr);
        iu4.b(kubVar, wt4Var, lh6VarArr);
        wib wibVar = iu4Var.e;
        tn4 tn4Var = iu4Var.b;
        tn4Var.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (lh6 lh6Var3 : lh6VarArr) {
            if (lh6Var3 == null || lh6Var3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                zu9 s = hv9.s();
                s.c(new jh(0L, 0L));
                arrayList3.add(s);
            }
        }
        int length4 = lh6VarArr.length;
        long[][] jArr2 = new long[length4][];
        int i36 = 0;
        while (true) {
            j = -1;
            if (i36 >= lh6VarArr.length) {
                break;
            }
            lh6 lh6Var4 = lh6VarArr[i36];
            if (lh6Var4 == null) {
                jArr2[i36] = new long[0];
            } else {
                int[] iArr18 = lh6Var4.b;
                jArr2[i36] = new long[iArr18.length];
                int i37 = 0;
                while (i37 < iArr18.length) {
                    int i38 = i37;
                    long j2 = lh6Var4.a.d[iArr18[i37]].j;
                    long[] jArr3 = jArr2[i36];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr3[i38] = j2;
                    i37 = i38 + 1;
                }
                Arrays.sort(jArr2[i36]);
            }
            i36++;
        }
        int[] iArr19 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i39 = 0; i39 < length4; i39++) {
            long[] jArr5 = jArr2[i39];
            jArr4[i39] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        lh.i(arrayList3, jArr4);
        yqo.w(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(x5d.a);
        zyc zycVar = new zyc();
        yqo.w(2, "expectedValuesPerKey");
        azc azcVar = new azc(treeMap);
        azcVar.g = zycVar;
        int i40 = 0;
        while (i40 < length4) {
            long[] jArr6 = jArr2[i40];
            long j3 = j;
            if (jArr6.length <= 1) {
                i = length4;
                iArr = iArr19;
                i2 = i40;
                jArr = jArr2;
            } else {
                int length5 = jArr6.length;
                double[] dArr = new double[length5];
                i = length4;
                int i41 = 0;
                while (true) {
                    long[] jArr7 = jArr2[i40];
                    iArr = iArr19;
                    double d = 0.0d;
                    if (i41 >= jArr7.length) {
                        break;
                    }
                    int i42 = i40;
                    long[][] jArr8 = jArr2;
                    long j4 = jArr7[i41];
                    if (j4 != j3) {
                        d = Math.log(j4);
                    }
                    dArr[i41] = d;
                    i41++;
                    jArr2 = jArr8;
                    iArr19 = iArr;
                    i40 = i42;
                }
                i2 = i40;
                jArr = jArr2;
                int i43 = length5 - 1;
                double d2 = dArr[i43] - dArr[0];
                int i44 = 0;
                while (i44 < i43) {
                    double d3 = dArr[i44];
                    int i45 = i44 + 1;
                    azcVar.s(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i45]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i2));
                    i44 = i45;
                }
            }
            i40 = i2 + 1;
            jArr2 = jArr;
            length4 = i;
            j = j3;
            iArr19 = iArr;
        }
        int[] iArr20 = iArr19;
        long[][] jArr9 = jArr2;
        hv9 v = hv9.v(azcVar.t());
        for (int i46 = 0; i46 < v.size(); i46++) {
            int intValue = ((Integer) v.get(i46)).intValue();
            int i47 = iArr20[intValue] + 1;
            iArr20[intValue] = i47;
            jArr4[intValue] = jArr9[intValue][i47];
            lh.i(arrayList3, jArr4);
        }
        for (int i48 = 0; i48 < lh6VarArr.length; i48++) {
            if (arrayList3.get(i48) != null) {
                jArr4[i48] = jArr4[i48] * 2;
            }
        }
        lh.i(arrayList3, jArr4);
        zu9 s2 = hv9.s();
        for (int i49 = 0; i49 < arrayList3.size(); i49++) {
            zu9 zu9Var = (zu9) arrayList3.get(i49);
            s2.c(zu9Var == null ? vvf.e : zu9Var.g());
        }
        vvf g = s2.g();
        nh6[] nh6VarArr = new nh6[lh6VarArr.length];
        for (int i50 = 0; i50 < lh6VarArr.length; i50++) {
            lh6 lh6Var5 = lh6VarArr[i50];
            if (lh6Var5 != null) {
                int[] iArr21 = lh6Var5.b;
                if (iArr21.length != 0) {
                    int length6 = iArr21.length;
                    osj osjVar2 = lh6Var5.a;
                    nh6VarArr[i50] = length6 == 1 ? new n68(osjVar2, new int[]{iArr21[0]}) : new lh(osjVar2, iArr21, tn4Var, (hv9) g.get(i50));
                }
            }
        }
        syf[] syfVarArr = new syf[i23];
        for (int i51 = 0; i51 < i23; i51++) {
            syfVarArr[i51] = (wt4Var.G.get(i51) || wt4Var.w.contains(Integer.valueOf(kubVar.b[i51])) || (kubVar.b[i51] != -2 && nh6VarArr[i51] == null)) ? null : syf.c;
        }
        wt4Var.q.getClass();
        Pair create = Pair.create(syfVarArr, nh6VarArr);
        nh6[] nh6VarArr2 = (nh6[]) create.second;
        int length7 = nh6VarArr2.length;
        List[] listArr = new List[length7];
        for (int i52 = 0; i52 < nh6VarArr2.length; i52++) {
            nh6 nh6Var = nh6VarArr2[i52];
            if (nh6Var != null) {
                vvfVar = hv9.z(nh6Var);
            } else {
                av9 av9Var = hv9.b;
                vvfVar = vvf.e;
            }
            listArr[i52] = vvfVar;
        }
        zu9 zu9Var2 = new zu9(4);
        int i53 = 0;
        while (true) {
            int i54 = kubVar.a;
            qsj[] qsjVarArr4 = kubVar.c;
            if (i53 >= i54) {
                break;
            }
            qsj qsjVar7 = qsjVarArr4[i53];
            int i55 = 0;
            while (i55 < qsjVar7.a) {
                osj a4 = qsjVar7.a(i55);
                int i56 = qsjVarArr4[i53].a(i55).a;
                int[] iArr22 = new int[i56];
                int i57 = 0;
                int i58 = 0;
                while (i57 < i56) {
                    List[] listArr2 = listArr;
                    if ((kubVar.e[i53][i55][i57] & 7) == 4) {
                        iArr22[i58] = i57;
                        i58++;
                    }
                    i57++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr22, i58);
                int i59 = 16;
                qsj qsjVar8 = qsjVar7;
                String str6 = null;
                int i60 = 0;
                boolean z4 = false;
                int i61 = 0;
                while (i60 < copyOf.length) {
                    int[] iArr23 = copyOf;
                    String str7 = qsjVarArr4[i53].a(i55).d[copyOf[i60]].o;
                    int i62 = i61 + 1;
                    if (i61 == 0) {
                        str6 = str7;
                    } else {
                        z4 = (!Objects.equals(str6, str7)) | z4;
                    }
                    i59 = Math.min(i59, kubVar.e[i53][i55][i60] & 24);
                    i60++;
                    i61 = i62;
                    copyOf = iArr23;
                }
                if (z4) {
                    i59 = Math.min(i59, kubVar.d[i53]);
                }
                boolean z5 = i59 != 0;
                int i63 = a4.a;
                int[] iArr24 = new int[i63];
                boolean[] zArr = new boolean[i63];
                for (int i64 = 0; i64 < a4.a; i64++) {
                    iArr24[i64] = kubVar.e[i53][i55][i64] & 7;
                    boolean z6 = false;
                    int i65 = 0;
                    while (i65 < length7) {
                        List list = listArr3[i65];
                        int i66 = length7;
                        qsj[] qsjVarArr5 = qsjVarArr4;
                        int i67 = 0;
                        while (true) {
                            if (i67 < list.size()) {
                                nh6 nh6Var2 = (nh6) list.get(i67);
                                int i68 = i67;
                                if (nh6Var2.getTrackGroup().equals(a4) && nh6Var2.indexOf(i64) != -1) {
                                    z6 = true;
                                    break;
                                }
                                i67 = i68 + 1;
                            }
                        }
                        i65++;
                        length7 = i66;
                        qsjVarArr4 = qsjVarArr5;
                    }
                    zArr[i64] = z6;
                }
                zu9Var2.c(new suj(a4, z5, iArr24, zArr));
                i55++;
                listArr = listArr3;
                qsjVar7 = qsjVar8;
                length7 = length7;
            }
            i53++;
        }
        qsj qsjVar9 = kubVar.f;
        for (int i69 = 0; i69 < qsjVar9.a; i69++) {
            osj a5 = qsjVar9.a(i69);
            int[] iArr25 = new int[a5.a];
            Arrays.fill(iArr25, 0);
            zu9Var2.c(new suj(a5, false, iArr25, new boolean[a5.a]));
        }
        gtj gtjVar = new gtj((syf[]) create.first, (nh6[]) create.second, new uuj(zu9Var2.g()), kubVar);
        for (int i70 = 0; i70 < gtjVar.b; i70++) {
            boolean r = gtjVar.r(i70);
            nh6[] nh6VarArr3 = (nh6[]) gtjVar.e;
            if (r) {
                if (nh6VarArr3[i70] == null && this.j[i70].b != -2) {
                    z2 = false;
                    z1a.E(z2);
                }
                z2 = true;
                z1a.E(z2);
            } else {
                z1a.E(nh6VarArr3[i70] == null);
            }
        }
        for (nh6 nh6Var3 : (nh6[]) gtjVar.e) {
            if (nh6Var3 != null) {
                nh6Var3.onPlaybackSpeed(f);
                nh6Var3.b(z);
            }
        }
        return gtjVar;
    }

    public final void k() {
        w6c w6cVar = this.a;
        if (w6cVar instanceof ny2) {
            long j = this.g.e;
            if (j == C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ny2 ny2Var = (ny2) w6cVar;
            ny2Var.f = 0L;
            ny2Var.g = j;
        }
    }
}
