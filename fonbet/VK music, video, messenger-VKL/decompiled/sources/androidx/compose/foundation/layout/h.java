package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.unity3d.services.UnityAdsConstants;
import defpackage.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.apx;
import xsna.b540;
import xsna.ci50;
import xsna.dp10;
import xsna.ejk;
import xsna.ep10;
import xsna.epx;
import xsna.g9x;
import xsna.ir;
import xsna.j5g;
import xsna.jgp;
import xsna.m200;
import xsna.ng50;
import xsna.nm1;
import xsna.o6j;
import xsna.opj;
import xsna.oq;
import xsna.p490;
import xsna.p9x;
import xsna.pco;
import xsna.pg50;
import xsna.po40;
import xsna.qg50;
import xsna.r490;
import xsna.s3q0;
import xsna.s6j;
import xsna.sc;
import xsna.shy;
import xsna.tc;
import xsna.tra0;
import xsna.y8x;
import xsna.zo10;
import xsna.zox;
import xsna.zxo;

/* compiled from: FlowLayout.kt */
/* loaded from: classes11.dex */
public final class h implements b540, g {
    public final a.e a;
    public final a.n b;
    public final float c;
    public final ejk.c d;
    public final float e;
    public final int f;
    public final f g;

    public h(a.e eVar, a.n nVar, float f, ejk.c cVar, float f2, int i, f fVar) {
        this.a = eVar;
        this.b = nVar;
        this.c = f;
        this.d = cVar;
        this.e = f2;
        this.f = i;
        this.g = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f9 A[LOOP:1: B:130:0x03f7->B:131:0x03f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0381  */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.g, androidx.compose.foundation.layout.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.layout.g] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [xsna.zo10, xsna.zox] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r13v10, types: [T, xsna.tra0] */
    /* JADX WARN: Type inference failed for: r8v10, types: [xsna.tra0[]] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v17, types: [T] */
    /* JADX WARN: Type inference failed for: r9v26, types: [T, xsna.tra0] */
    /* JADX WARN: Type inference failed for: r9v41 */
    @Override // xsna.b540
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dp10 b(ep10 ep10Var, List<? extends List<? extends zo10>> list, long j) {
        boolean z;
        po40 po40Var;
        po40 po40Var2;
        zo10 zo10Var;
        long j2;
        y8x y8xVar;
        Integer valueOf;
        d dVar;
        Integer num;
        int i;
        f fVar;
        d.b b;
        d.b bVar;
        d.a aVar;
        int i2;
        d.a aVar2;
        int i3;
        ng50 ng50Var;
        ng50 ng50Var2;
        int i4;
        d.b bVar2;
        zox zoxVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ?? r0;
        int size;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b2;
        int j3;
        int h;
        int k;
        int i16;
        char c;
        int i17;
        Object obj;
        ?? r9;
        Iterator it;
        y8x y8xVar2;
        Integer num2;
        int i18;
        y8x y8xVar3;
        d.b b3;
        d.b bVar3;
        int i19;
        ng50 ng50Var3;
        ng50 ng50Var4;
        int i20;
        long a;
        int i21;
        int i22;
        long a2;
        ?? r02 = this;
        int i23 = r02.f;
        jgp jgpVar = jgp.b;
        if (i23 != 0 && !((ArrayList) list).isEmpty()) {
            int h2 = o6j.h(j);
            f fVar2 = r02.g;
            if (h2 != 0 || fVar2.a == FlowLayoutOverflow.OverflowType.Visible) {
                List list2 = (List) j5g.Y(list);
                if (list2.isEmpty()) {
                    return ep10Var.Q(0, 0, jgpVar, new tc(22));
                }
                List list3 = (List) j5g.b0(1, list);
                zo10 zo10Var2 = list3 != null ? (zo10) j5g.a0(list3) : null;
                List list4 = (List) j5g.b0(2, list);
                zo10 zo10Var3 = list4 != null ? (zo10) j5g.a0(list4) : null;
                list2.size();
                fVar2.getClass();
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                long D = m200.D(m200.i(10, m200.g(j, layoutOrientation)), layoutOrientation);
                if (zo10Var2 != null) {
                    z = true;
                    e.c(zo10Var2, r02, D, new v(11, fVar2, r02));
                    fVar2.b = zo10Var2;
                } else {
                    z = true;
                }
                if (zo10Var3 != null) {
                    e.c(zo10Var3, r02, D, new nm1(13, fVar2, r02));
                    fVar2.d = zo10Var3;
                }
                Iterator it2 = list2.iterator();
                long g = m200.g(j, layoutOrientation);
                int i24 = e.a;
                ci50 ci50Var = new ci50(new dp10[16]);
                int i25 = o6j.i(g);
                int k2 = o6j.k(g);
                int h3 = o6j.h(g);
                pg50 a3 = g9x.a();
                ArrayList arrayList = new ArrayList();
                int ceil = (int) Math.ceil(ep10Var.I0(r02.c));
                int ceil2 = (int) Math.ceil(ep10Var.I0(r02.e));
                long a4 = s6j.a(0, i25, 0, h3);
                Throwable th = null;
                long D2 = m200.D(m200.i(14, a4), layoutOrientation);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                if (it2 instanceof opj) {
                    ep10Var.j1(i25);
                    ep10Var.j1(h3);
                    po40Var = new po40();
                } else {
                    po40Var = null;
                }
                if (it2.hasNext()) {
                    po40Var2 = po40Var;
                    if (it2 instanceof opj) {
                        throw null;
                    }
                    zo10Var = (zo10) it2.next();
                    if (zo10Var == null) {
                        if (p490.q(p490.o(zo10Var)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            p490.o(zo10Var);
                            ?? N = zo10Var.N(D2);
                            ref$ObjectRef.element = N;
                            s3q0 s3q0Var = s3q0.a;
                            j2 = a4;
                            a2 = y8x.a(r02.h(N), r02.d(N));
                        } else {
                            j2 = a4;
                            int M = zo10Var.M(Integer.MAX_VALUE);
                            a2 = y8x.a(M, zo10Var.j0(M));
                        }
                        y8xVar = new y8x(a2);
                    } else {
                        j2 = a4;
                        y8xVar = null;
                    }
                    valueOf = y8xVar == null ? Integer.valueOf((int) (y8xVar.a >> 32)) : null;
                    Integer valueOf2 = y8xVar == null ? Integer.valueOf((int) (y8xVar.a & 4294967295L)) : null;
                    ng50 ng50Var5 = new ng50();
                    y8x y8xVar4 = y8xVar;
                    ng50 ng50Var6 = new ng50();
                    zo10 zo10Var4 = zo10Var;
                    qg50 a5 = p9x.a();
                    num = valueOf2;
                    i = r02.f;
                    fVar = r02.g;
                    dVar = new d(i, fVar, g, ceil, ceil2);
                    b = dVar.b(it2.hasNext(), 0, y8x.a(i25, h3), y8xVar4, 0, 0, 0, false, false);
                    if (b.b) {
                        bVar = b;
                        aVar = null;
                    } else {
                        bVar = b;
                        aVar = dVar.a(bVar, y8xVar4 != null ? z : false, -1, 0, i25, 0);
                    }
                    i2 = i25;
                    aVar2 = aVar;
                    qg50 qg50Var = a5;
                    i3 = i2;
                    ng50Var = ng50Var5;
                    ng50Var2 = ng50Var6;
                    i4 = h3;
                    bVar2 = bVar;
                    zoxVar = zo10Var4;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    i9 = 0;
                    int i26 = k2;
                    i10 = 0;
                    r0 = r02;
                    while (!bVar2.b && zoxVar != null) {
                        int intValue = valueOf.intValue();
                        int i27 = i2;
                        int i28 = i6 + intValue;
                        int max = Math.max(i10, num.intValue());
                        int i29 = i3 - intValue;
                        int i30 = i5 + 1;
                        fVar.getClass();
                        arrayList.add(zoxVar);
                        a3.k(i5, ref$ObjectRef.element);
                        zoxVar.c();
                        int i31 = i30 - i7;
                        boolean z2 = i31 >= i ? z : false;
                        if (po40Var2 == null) {
                            if (z2) {
                                int i32 = i29 - ceil;
                                i17 = i31;
                                i21 = i32 < 0 ? 0 : i32;
                            } else {
                                i17 = i31;
                                i21 = i27;
                            }
                            ep10Var.j1(i21);
                            if (z2) {
                                i22 = i4;
                            } else {
                                i22 = (i4 - max) - ceil2;
                                if (i22 < 0) {
                                    i22 = 0;
                                }
                            }
                            ep10Var.j1(i22);
                            s3q0 s3q0Var2 = s3q0.a;
                        } else {
                            i17 = i31;
                        }
                        if (it2.hasNext()) {
                            Throwable th2 = th;
                            zoxVar = th2;
                            r9 = th2;
                        } else {
                            try {
                            } catch (IndexOutOfBoundsException unused) {
                                obj = th;
                            }
                            if (it2 instanceof opj) {
                                throw th;
                            }
                            obj = (zo10) it2.next();
                            zoxVar = obj;
                            r9 = th;
                        }
                        ref$ObjectRef.element = r9;
                        if (zoxVar == null) {
                            if (p490.q(p490.o(zoxVar)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                p490.o(zoxVar);
                                ?? N2 = zoxVar.N(D2);
                                ref$ObjectRef.element = N2;
                                s3q0 s3q0Var3 = s3q0.a;
                                it = it2;
                                a = y8x.a(r0.h(N2), r0.d(N2));
                            } else {
                                it = it2;
                                int M2 = zoxVar.M(Integer.MAX_VALUE);
                                a = y8x.a(M2, zoxVar.j0(M2));
                            }
                            y8xVar2 = new y8x(a);
                        } else {
                            it = it2;
                            y8xVar2 = null;
                        }
                        Integer valueOf3 = y8xVar2 == null ? Integer.valueOf(((int) (y8xVar2.a >> 32)) + ceil) : null;
                        Integer valueOf4 = y8xVar2 == null ? Integer.valueOf((int) (y8xVar2.a & 4294967295L)) : null;
                        boolean hasNext = it.hasNext();
                        long a6 = y8x.a(i29, i4);
                        if (y8xVar2 != null) {
                            num2 = valueOf4;
                            i18 = i29;
                            y8xVar3 = null;
                        } else {
                            num2 = valueOf4;
                            i18 = i29;
                            y8xVar3 = new y8x(y8x.a(valueOf3.intValue(), num2.intValue()));
                        }
                        b3 = dVar.b(hasNext, i17, a6, y8xVar3, i8, i9, max, false, false);
                        int i33 = max;
                        if (b3.a) {
                            bVar3 = b3;
                            i19 = i18;
                            ng50Var3 = ng50Var;
                            ng50Var4 = ng50Var2;
                            i20 = i27;
                            valueOf = valueOf3;
                        } else {
                            int min = Math.min(Math.max(i26, i28), i27);
                            int i34 = i9 + i33;
                            bVar3 = b3;
                            int i35 = i8;
                            d.a a7 = dVar.a(bVar3, y8xVar2 != null ? z : false, i35, i34, i18, i17);
                            ng50Var4 = ng50Var2;
                            ng50Var4.c(i33);
                            i4 = (h3 - i34) - ceil2;
                            ng50 ng50Var7 = ng50Var;
                            ng50Var7.c(i30);
                            i8 = i35 + 1;
                            i9 = i34 + ceil2;
                            aVar2 = a7;
                            ng50Var3 = ng50Var7;
                            i20 = i27;
                            valueOf = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - ceil) : null;
                            i7 = i30;
                            i33 = 0;
                            i28 = 0;
                            i26 = min;
                            i19 = i20;
                        }
                        ng50Var = ng50Var3;
                        ng50Var2 = ng50Var4;
                        num = num2;
                        th = null;
                        r0 = this;
                        i5 = i30;
                        i10 = i33;
                        it2 = it;
                        i3 = i19;
                        bVar2 = bVar3;
                        i6 = i28;
                        i2 = i20;
                    }
                    ng50 ng50Var8 = ng50Var;
                    ng50 ng50Var9 = ng50Var2;
                    if (aVar2 != null) {
                        d.a aVar3 = aVar2;
                        long j4 = aVar3.c;
                        arrayList.add(aVar3.a);
                        a3.k(arrayList.size() - 1, aVar3.b);
                        int i36 = ng50Var8.b - 1;
                        if (aVar3.d) {
                            ng50Var9.g(i36, Math.max(ng50Var9.a(i36), (int) (j4 & 4294967295L)));
                            ng50Var8.g(i36, ng50Var8.b() + 1);
                            s3q0 s3q0Var4 = s3q0.a;
                        } else {
                            ng50Var9.c((int) (j4 & 4294967295L));
                            ng50Var8.c(ng50Var8.b() + 1);
                        }
                    }
                    size = arrayList.size();
                    ?? r8 = new tra0[size];
                    for (i11 = 0; i11 < size; i11++) {
                        r8[i11] = a3.b(i11);
                    }
                    i12 = ng50Var8.b;
                    int[] iArr = new int[i12];
                    int[] iArr2 = new int[i12];
                    int[] iArr3 = ng50Var8.a;
                    i13 = i26;
                    int i37 = 0;
                    i14 = 0;
                    int i38 = 0;
                    while (i14 < i12) {
                        int i39 = iArr3[i14];
                        int a8 = ng50Var9.a(i14);
                        qg50 qg50Var2 = qg50Var;
                        if (qg50Var2.a(i14)) {
                            c = 65535;
                        } else {
                            c = 65535;
                            a8 = o6j.h(j2) == Integer.MAX_VALUE ? Integer.MAX_VALUE : o6j.h(j2) - i38;
                        }
                        qg50Var = qg50Var2;
                        dp10 i40 = r490.i(this, i13, o6j.j(j2), o6j.i(j2), a8, ceil, ep10Var, arrayList, r8, i37, i39, iArr, i14);
                        int width = i40.getWidth();
                        int height = i40.getHeight();
                        iArr2[i14] = height;
                        i38 += height;
                        i13 = Math.max(i13, width);
                        ci50Var.b(i40);
                        i14++;
                        i37 = i39;
                        ng50Var9 = ng50Var9;
                    }
                    if (ci50Var.d != 0) {
                        i13 = 0;
                        i15 = 0;
                    } else {
                        i15 = i38;
                    }
                    a.n nVar = this.b;
                    b2 = ir.b(ci50Var.d, z ? 1 : 0, ep10Var.r0(nVar.a()), i15);
                    j3 = o6j.j(g);
                    h = o6j.h(g);
                    if (b2 < j3) {
                        b2 = j3;
                    }
                    if (b2 <= h) {
                        h = b2;
                    }
                    nVar.c(ep10Var, h, iArr2, iArr);
                    k = o6j.k(g);
                    i16 = o6j.i(g);
                    if (i13 < k) {
                        i13 = k;
                    }
                    if (i13 <= i16) {
                        i16 = i13;
                    }
                    return ep10Var.Q(i16, h, jgpVar, new zxo(ci50Var, 4));
                }
                po40Var2 = po40Var;
                zo10Var = null;
                if (zo10Var == null) {
                }
                valueOf = y8xVar == null ? Integer.valueOf((int) (y8xVar.a >> 32)) : null;
                if (y8xVar == null) {
                }
                ng50 ng50Var52 = new ng50();
                y8x y8xVar42 = y8xVar;
                ng50 ng50Var62 = new ng50();
                zo10 zo10Var42 = zo10Var;
                qg50 a52 = p9x.a();
                num = valueOf2;
                i = r02.f;
                fVar = r02.g;
                dVar = new d(i, fVar, g, ceil, ceil2);
                b = dVar.b(it2.hasNext(), 0, y8x.a(i25, h3), y8xVar42, 0, 0, 0, false, false);
                if (b.b) {
                }
                i2 = i25;
                aVar2 = aVar;
                qg50 qg50Var3 = a52;
                i3 = i2;
                ng50Var = ng50Var52;
                ng50Var2 = ng50Var62;
                i4 = h3;
                bVar2 = bVar;
                zoxVar = zo10Var42;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                int i262 = k2;
                i10 = 0;
                r0 = r02;
                while (!bVar2.b) {
                    int intValue2 = valueOf.intValue();
                    int i272 = i2;
                    int i282 = i6 + intValue2;
                    int max2 = Math.max(i10, num.intValue());
                    int i292 = i3 - intValue2;
                    int i302 = i5 + 1;
                    fVar.getClass();
                    arrayList.add(zoxVar);
                    a3.k(i5, ref$ObjectRef.element);
                    zoxVar.c();
                    int i312 = i302 - i7;
                    if (i312 >= i) {
                    }
                    if (po40Var2 == null) {
                    }
                    if (it2.hasNext()) {
                    }
                    ref$ObjectRef.element = r9;
                    if (zoxVar == null) {
                    }
                    Integer valueOf32 = y8xVar2 == null ? Integer.valueOf(((int) (y8xVar2.a >> 32)) + ceil) : null;
                    if (y8xVar2 == null) {
                    }
                    boolean hasNext2 = it.hasNext();
                    long a62 = y8x.a(i292, i4);
                    if (y8xVar2 != null) {
                    }
                    b3 = dVar.b(hasNext2, i17, a62, y8xVar3, i8, i9, max2, false, false);
                    int i332 = max2;
                    if (b3.a) {
                    }
                    ng50Var = ng50Var3;
                    ng50Var2 = ng50Var4;
                    num = num2;
                    th = null;
                    r0 = this;
                    i5 = i302;
                    i10 = i332;
                    it2 = it;
                    i3 = i19;
                    bVar2 = bVar3;
                    i6 = i282;
                    i2 = i20;
                }
                ng50 ng50Var82 = ng50Var;
                ng50 ng50Var92 = ng50Var2;
                if (aVar2 != null) {
                }
                size = arrayList.size();
                ?? r82 = new tra0[size];
                while (i11 < size) {
                }
                i12 = ng50Var82.b;
                int[] iArr4 = new int[i12];
                int[] iArr22 = new int[i12];
                int[] iArr32 = ng50Var82.a;
                i13 = i262;
                int i372 = 0;
                i14 = 0;
                int i382 = 0;
                while (i14 < i12) {
                }
                if (ci50Var.d != 0) {
                }
                a.n nVar2 = this.b;
                b2 = ir.b(ci50Var.d, z ? 1 : 0, ep10Var.r0(nVar2.a()), i15);
                j3 = o6j.j(g);
                h = o6j.h(g);
                if (b2 < j3) {
                }
                if (b2 <= h) {
                }
                nVar2.c(ep10Var, h, iArr22, iArr4);
                k = o6j.k(g);
                i16 = o6j.i(g);
                if (i13 < k) {
                }
                if (i13 <= i16) {
                }
                return ep10Var.Q(i16, h, jgpVar, new zxo(ci50Var, 4));
            }
        }
        return ep10Var.Q(0, 0, jgpVar, new sc(25));
    }

    @Override // xsna.b540
    public final int c(apx apxVar, List<? extends List<? extends zox>> list, int i) {
        List list2 = (List) j5g.b0(1, list);
        zox zoxVar = list2 != null ? (zox) j5g.a0(list2) : null;
        List list3 = (List) j5g.b0(2, list);
        this.g.b(zoxVar, list3 != null ? (zox) j5g.a0(list3) : null, s6j.b(0, i, 0, 0, 13));
        List list4 = (List) j5g.a0(list);
        if (list4 == null) {
            list4 = EmptyList.b;
        }
        return n(list4, i, apxVar.r0(this.c), apxVar.r0(this.e), this.f, this.g);
    }

    @Override // xsna.b540
    public final int e(apx apxVar, List<? extends List<? extends zox>> list, int i) {
        List list2 = (List) j5g.b0(1, list);
        zox zoxVar = list2 != null ? (zox) j5g.a0(list2) : null;
        List list3 = (List) j5g.b0(2, list);
        this.g.b(zoxVar, list3 != null ? (zox) j5g.a0(list3) : null, s6j.b(0, 0, 0, i, 7));
        List list4 = (List) j5g.a0(list);
        if (list4 == null) {
            list4 = EmptyList.b;
        }
        int r0 = apxVar.r0(this.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int l0 = ((zox) list4.get(i2)).l0(i) + r0;
            int i6 = i2 + 1;
            if (i6 - i4 == this.f || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + l0) - r0);
                i5 = 0;
                i4 = i2;
            } else {
                i5 += l0;
            }
            i2 = i6;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.getClass();
        return this.a.equals(hVar.a) && this.b.equals(hVar.b) && pco.b(this.c, hVar.c) && this.d.equals(hVar.d) && pco.b(this.e, hVar.e) && this.f == hVar.f && epx.f(this.g, hVar.g);
    }

    @Override // xsna.b540
    public final int f(apx apxVar, List<? extends List<? extends zox>> list, int i) {
        List list2 = (List) j5g.b0(1, list);
        zox zoxVar = list2 != null ? (zox) j5g.a0(list2) : null;
        List list3 = (List) j5g.b0(2, list);
        this.g.b(zoxVar, list3 != null ? (zox) j5g.a0(list3) : null, s6j.b(0, i, 0, 0, 13));
        List list4 = (List) j5g.a0(list);
        if (list4 == null) {
            list4 = EmptyList.b;
        }
        return n(list4, i, apxVar.r0(this.c), apxVar.r0(this.e), this.f, this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x00a3, code lost:
    
        if (r13.a == androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5 A[LOOP:1: B:24:0x00b3->B:25:0x00b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    @Override // xsna.b540
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(apx apxVar, List<? extends List<? extends zox>> list, int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        List list2;
        int i6;
        long a;
        y8x y8xVar;
        FlowLayoutOverflow.OverflowType overflowType;
        h hVar = this;
        int i7 = 1;
        List list3 = (List) j5g.b0(1, list);
        zox zoxVar = list3 != null ? (zox) j5g.a0(list3) : null;
        List list4 = (List) j5g.b0(2, list);
        int i8 = 0;
        hVar.g.b(zoxVar, list4 != null ? (zox) j5g.a0(list4) : null, s6j.b(0, 0, 0, i, 7));
        List list5 = (List) j5g.a0(list);
        if (list5 == null) {
            list5 = EmptyList.b;
        }
        int r0 = apxVar.r0(hVar.c);
        int r02 = apxVar.r0(hVar.e);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        List list6 = list5;
        int size3 = list6.size();
        for (int i9 = 0; i9 < size3; i9++) {
            zox zoxVar2 = (zox) list5.get(i9);
            int M = zoxVar2.M(i);
            iArr2[i9] = M;
            iArr3[i9] = zoxVar2.j0(M);
        }
        int size4 = list5.size();
        f fVar = hVar.g;
        int i10 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE >= size4 || ((overflowType = fVar.a) != FlowLayoutOverflow.OverflowType.ExpandIndicator && overflowType != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) {
            if (Integer.MAX_VALUE >= list5.size()) {
                fVar.getClass();
            }
            i2 = 0;
            int min = Math.min(Integer.MAX_VALUE - i2, list5.size());
            int i11 = 0;
            for (i3 = 0; i3 < size; i3++) {
                i11 += iArr2[i3];
            }
            int size5 = ((list5.size() - 1) * r0) + i11;
            if (size2 != 0) {
                throw new NoSuchElementException();
            }
            int i12 = iArr3[0];
            int i13 = size2 - 1;
            if (1 <= i13) {
                int i14 = 1;
                while (true) {
                    int i15 = iArr3[i14];
                    if (i12 < i15) {
                        i12 = i15;
                    }
                    if (i14 == i13) {
                        break;
                    }
                    i14++;
                }
            }
            if (size == 0) {
                throw new NoSuchElementException();
            }
            int i16 = iArr2[0];
            int i17 = size - 1;
            if (1 <= i17) {
                int i18 = 1;
                while (true) {
                    int i19 = iArr2[i18];
                    if (i16 < i19) {
                        i16 = i19;
                    }
                    if (i18 == i17) {
                        break;
                    }
                    i18++;
                }
            }
            int i20 = size5;
            while (i16 <= i20 && i12 != i) {
                int i21 = (i16 + i20) / 2;
                int i22 = e.a;
                if (list5.isEmpty()) {
                    a = y8x.a(i8, i8);
                    list2 = list5;
                    iArr = iArr2;
                    i4 = min;
                    i5 = i20;
                } else {
                    i4 = min;
                    d dVar = new d(hVar.f, fVar, s6j.a(i8, i21, i8, i10), r0, r02);
                    zox zoxVar3 = (zox) j5g.b0(i8, list5);
                    int i23 = zoxVar3 != null ? iArr3[i8] : i8;
                    int i24 = zoxVar3 != null ? iArr2[i8] : i8;
                    iArr = iArr2;
                    int i25 = 0;
                    int i26 = 0;
                    if (dVar.b(list5.size() > i7 ? i7 : i8, 0, y8x.a(i21, Integer.MAX_VALUE), zoxVar3 == null ? null : new y8x(y8x.a(i24, i23)), 0, 0, 0, false, false).b) {
                        y8x a2 = fVar.a(i8, i8, zoxVar3 != null ? 1 : i8);
                        a = y8x.a(a2 != null ? (int) (a2.a & 4294967295L) : i8, i8);
                        i5 = i20;
                        list2 = list5;
                    } else {
                        int size6 = list6.size();
                        int i27 = i21;
                        int i28 = i8;
                        int i29 = i28;
                        int i30 = i29;
                        int i31 = 0;
                        while (true) {
                            if (i28 >= size6) {
                                i5 = i20;
                                list2 = list5;
                                i6 = i29;
                                break;
                            }
                            i27 -= i24;
                            i6 = i28 + 1;
                            int max = Math.max(i31, i23);
                            zox zoxVar4 = (zox) j5g.b0(i6, list5);
                            i23 = zoxVar4 != null ? iArr3[i6] : i8;
                            if (zoxVar4 != null) {
                                i8 = iArr[i6] + r0;
                            }
                            boolean z = i28 + 2 < list5.size();
                            int i32 = i6 - i30;
                            long a3 = y8x.a(i27, Integer.MAX_VALUE);
                            if (zoxVar4 == null) {
                                i5 = i20;
                                list2 = list5;
                                y8xVar = null;
                            } else {
                                i5 = i20;
                                list2 = list5;
                                y8xVar = new y8x(y8x.a(i8, i23));
                            }
                            d.b b = dVar.b(z, i32, a3, y8xVar, i25, i26, max, false, false);
                            if (b.a) {
                                int i33 = max + r02 + i26;
                                int i34 = i25;
                                d.a a4 = dVar.a(b, zoxVar4 != null, i34, i33, i27, i32);
                                i8 -= r0;
                                i25 = i34 + 1;
                                if (b.b) {
                                    if (a4 != null) {
                                        long j = a4.c;
                                        if (!a4.d) {
                                            i33 = ((int) (j & 4294967295L)) + r02 + i33;
                                        }
                                    }
                                    i26 = i33;
                                } else {
                                    i27 = i21;
                                    i30 = i6;
                                    i26 = i33;
                                    i31 = 0;
                                }
                            } else {
                                i31 = max;
                            }
                            i20 = i5;
                            i28 = i6;
                            i29 = i28;
                            list5 = list2;
                            i24 = i8;
                            i8 = 0;
                        }
                        a = y8x.a(i26 - r02, i6);
                    }
                }
                int i35 = (int) (a >> 32);
                int i36 = (int) (a & 4294967295L);
                if (i35 > i || i36 < i4) {
                    i16 = i21 + 1;
                    if (i16 > i5) {
                        return i16;
                    }
                    iArr2 = iArr;
                    i12 = i35;
                    size5 = i21;
                    i20 = i5;
                    list5 = list2;
                    i7 = 1;
                    i8 = 0;
                    i10 = Integer.MAX_VALUE;
                    hVar = this;
                    min = i4;
                } else {
                    if (i35 >= i) {
                        return i21;
                    }
                    i20 = i21 - 1;
                    iArr2 = iArr;
                    i12 = i35;
                    size5 = i21;
                    min = i4;
                    list5 = list2;
                    i7 = 1;
                    i8 = 0;
                    i10 = Integer.MAX_VALUE;
                    hVar = this;
                }
            }
            return size5;
        }
        i2 = 1;
        int min2 = Math.min(Integer.MAX_VALUE - i2, list5.size());
        int i112 = 0;
        while (i3 < size) {
        }
        int size52 = ((list5.size() - 1) * r0) + i112;
        if (size2 != 0) {
        }
    }

    public final int hashCode() {
        return this.g.hashCode() + shy.a(Integer.MAX_VALUE, shy.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, (this.d.a.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.foundation.layout.g
    public final boolean isHorizontal() {
        return true;
    }

    @Override // androidx.compose.foundation.layout.g
    public final a.n k() {
        return this.b;
    }

    @Override // androidx.compose.foundation.layout.g
    public final a.e l() {
        return this.a;
    }

    @Override // androidx.compose.foundation.layout.g
    public final ejk m() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int n(List list, int i, int i2, int i3, int i4, f fVar) {
        long a;
        int i5 = 0;
        if (list.isEmpty()) {
            a = y8x.a(0, 0);
        } else {
            int i6 = Integer.MAX_VALUE;
            d dVar = new d(i4, fVar, s6j.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            zox zoxVar = (zox) j5g.b0(0, list);
            int j0 = zoxVar != null ? zoxVar.j0(i) : 0;
            int M = zoxVar != null ? zoxVar.M(j0) : 0;
            int i7 = 0;
            if (dVar.b(list.size() > 1, 0, y8x.a(i, Integer.MAX_VALUE), zoxVar == null ? null : new y8x(y8x.a(M, j0)), 0, 0, 0, false, false).b) {
                y8x a2 = fVar.a(0, 0, zoxVar != null);
                a = y8x.a(a2 != null ? (int) (a2.a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i14 = i8 - M;
                    int i15 = i9 + 1;
                    int max = Math.max(i13, j0);
                    zox zoxVar2 = (zox) j5g.b0(i15, list);
                    int j02 = zoxVar2 != null ? zoxVar2.j0(i) : i5;
                    int M2 = zoxVar2 != null ? zoxVar2.M(j02) + i2 : i5;
                    int i16 = i15 - i11;
                    boolean z = i9 + 2 < list.size() ? 1 : i5;
                    int i17 = i12;
                    int i18 = j02;
                    int i19 = M2;
                    d.b b = dVar.b(z, i16, y8x.a(i14, i6), zoxVar2 == null ? null : new y8x(y8x.a(M2, j02)), i17, i7, max, false, false);
                    if (b.a) {
                        int i20 = max + i3 + i7;
                        d.a a3 = dVar.a(b, zoxVar2 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i12 = i17 + 1;
                        if (b.b) {
                            if (a3 != null) {
                                long j = a3.c;
                                if (!a3.d) {
                                    i20 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i20;
                            i10 = i15;
                        } else {
                            i11 = i15;
                            i7 = i20;
                            M = i21;
                            i13 = 0;
                            i8 = i;
                        }
                    } else {
                        M = i19;
                        i8 = i14;
                        i12 = i17;
                        i13 = max;
                    }
                    i9 = i15;
                    i10 = i9;
                    j0 = i18;
                    i6 = Integer.MAX_VALUE;
                    i5 = 0;
                }
                a = y8x.a(i7 - i3, i10);
            }
        }
        return (int) (a >> 32);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb.append(this.a);
        sb.append(", verticalArrangement=");
        sb.append(this.b);
        sb.append(", mainAxisSpacing=");
        oq.f(this.c, ", crossAxisAlignment=", sb);
        sb.append(this.d);
        sb.append(", crossAxisArrangementSpacing=");
        oq.f(this.e, ", maxItemsInMainAxis=", sb);
        sb.append(this.f);
        sb.append(", maxLines=2147483647, overflow=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
}
