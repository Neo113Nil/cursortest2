package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.b;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qc9 implements w6c, id9 {
    public final pp4 a;
    public final tp4 b;
    public final dad c;
    public final tn4 d;
    public final kc5 e;
    public final cc5 f;
    public final it7 g;
    public final b10 h;
    public final l2a i;
    public final IdentityHashMap j;
    public final bka k;
    public final tnf l;
    public final boolean m;
    public final int n;
    public final cse o;
    public final j0l p = new j0l(this, 28);
    public u6c q;
    public int r;
    public qsj s;
    public pd9[] t;
    public pd9[] u;
    public int v;
    public kg3 w;
    public final long x;

    public qc9(pp4 pp4Var, tp4 tp4Var, dad dadVar, tn4 tn4Var, kc5 kc5Var, cc5 cc5Var, it7 it7Var, b10 b10Var, l2a l2aVar, tnf tnfVar, boolean z, int i, cse cseVar) {
        this.a = pp4Var;
        this.b = tp4Var;
        this.c = dadVar;
        this.d = tn4Var;
        this.e = kc5Var;
        this.f = cc5Var;
        this.g = it7Var;
        this.h = b10Var;
        this.i = l2aVar;
        this.l = tnfVar;
        this.m = z;
        this.n = i;
        this.o = cseVar;
        tnfVar.getClass();
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        this.w = new kg3(vvfVar, vvfVar);
        this.j = new IdentityHashMap();
        this.k = new bka(23);
        this.t = new pd9[0];
        this.u = new pd9[0];
        this.x = Long.MIN_VALUE;
    }

    public static b h(b bVar, b bVar2, boolean z) {
        ric ricVar;
        int i;
        String str;
        String str2;
        hv9 hv9Var;
        int i2;
        int i3;
        String str3;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        if (bVar2 != null) {
            str2 = bVar2.k;
            ricVar = bVar2.l;
            i2 = bVar2.G;
            i = bVar2.e;
            i3 = bVar2.f;
            str = bVar2.d;
            str3 = bVar2.b;
            hv9Var = bVar2.c;
        } else {
            String x = nik.x(bVar.k, 1);
            ricVar = bVar.l;
            if (z) {
                i2 = bVar.G;
                i = bVar.e;
                i3 = bVar.f;
                str = bVar.d;
                str3 = bVar.b;
                str2 = x;
                hv9Var = bVar.c;
            } else {
                i = 0;
                str = null;
                str2 = x;
                hv9Var = vvfVar;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String e = sjc.e(str2);
        int i4 = z ? bVar.h : -1;
        int i5 = z ? bVar.i : -1;
        qm8 qm8Var = new qm8();
        qm8Var.a = bVar.a;
        qm8Var.b = str3;
        qm8Var.c = hv9.v(hv9Var);
        qm8Var.m = sjc.p(bVar.n);
        qm8Var.n = sjc.p(e);
        qm8Var.j = str2;
        qm8Var.k = ricVar;
        qm8Var.h = i4;
        qm8Var.i = i5;
        qm8Var.F = i2;
        qm8Var.e = i;
        qm8Var.f = i3;
        qm8Var.d = str;
        return new b(qm8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0120, code lost:
    
        if (r44 != r3.P) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.w6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(nh6[] nh6VarArr, boolean[] zArr, jpg[] jpgVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        jpg[] jpgVarArr2;
        int[] iArr;
        boolean z;
        ?? r9;
        oc9 oc9Var;
        int i;
        int i2;
        jpg[] jpgVarArr3;
        int i3;
        int[] iArr2;
        pd9[] pd9VarArr;
        pd9 pd9Var;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        ?? r10;
        int i7;
        int i8;
        nh6[] nh6VarArr2;
        int[] iArr3 = new int[nh6VarArr.length];
        int[] iArr4 = new int[nh6VarArr.length];
        int i9 = 0;
        while (true) {
            int length = nh6VarArr.length;
            identityHashMap = this.j;
            if (i9 >= length) {
                break;
            }
            jpg jpgVar = jpgVarArr[i9];
            iArr3[i9] = jpgVar == null ? -1 : ((Integer) identityHashMap.get(jpgVar)).intValue();
            iArr4[i9] = -1;
            nh6 nh6Var = nh6VarArr[i9];
            if (nh6Var != null) {
                osj trackGroup = nh6Var.getTrackGroup();
                int i10 = 0;
                while (true) {
                    pd9[] pd9VarArr2 = this.t;
                    if (i10 < pd9VarArr2.length) {
                        pd9 pd9Var2 = pd9VarArr2[i10];
                        pd9Var2.h();
                        if (pd9Var2.I.b(trackGroup) != -1) {
                            iArr4[i9] = i10;
                            break;
                        }
                        i10++;
                    }
                }
            }
            i9++;
        }
        identityHashMap.clear();
        int length2 = nh6VarArr.length;
        jpg[] jpgVarArr4 = new jpg[length2];
        int length3 = nh6VarArr.length;
        jpg[] jpgVarArr5 = new jpg[length3];
        int length4 = nh6VarArr.length;
        nh6[] nh6VarArr3 = new nh6[length4];
        boolean z5 = false;
        pd9[] pd9VarArr3 = new pd9[this.t.length];
        int i11 = length3;
        int i12 = 0;
        int i13 = 0;
        boolean z6 = false;
        while (i12 < this.t.length) {
            int i14 = length2;
            ?? r7 = z5;
            while (true) {
                jpgVarArr2 = jpgVarArr4;
                if (r7 >= nh6VarArr.length) {
                    break;
                }
                jpgVarArr5[r7] = iArr3[r7] == i12 ? jpgVarArr[r7] : null;
                nh6VarArr3[r7] = iArr4[r7] == i12 ? nh6VarArr[r7] : null;
                jpgVarArr4 = jpgVarArr2;
                r7++;
            }
            pd9 pd9Var3 = this.t[i12];
            x6k x6kVar = pd9Var3.j;
            int i15 = i12;
            oc9 oc9Var2 = pd9Var3.d;
            kd9[] kd9VarArr = oc9Var2.e;
            tp4 tp4Var = oc9Var2.g;
            ArrayList arrayList = pd9Var3.n;
            pd9Var3.h();
            int i16 = pd9Var3.E;
            ?? r29 = jpgVarArr5;
            ?? r72 = z5;
            while (r72 < length4) {
                ld9 ld9Var = (ld9) r29[r72];
                if (ld9Var == null || (nh6VarArr3[r72] != null && zArr[r72])) {
                    i8 = r72;
                    nh6VarArr2 = nh6VarArr3;
                } else {
                    i8 = r72;
                    pd9Var3.E--;
                    nh6VarArr2 = nh6VarArr3;
                    if (ld9Var.c != -1) {
                        pd9 pd9Var4 = ld9Var.b;
                        int i17 = ld9Var.a;
                        pd9Var4.h();
                        pd9Var4.K.getClass();
                        int i18 = pd9Var4.K[i17];
                        if (i18 >= 0) {
                            z1a.E(pd9Var4.N[i18]);
                            pd9Var4.N[i18] = z5;
                        }
                        ld9Var.c = -1;
                    }
                    r29[i8] = 0;
                }
                nh6VarArr3 = nh6VarArr2;
                r72 = i8 + 1;
            }
            nh6[] nh6VarArr4 = nh6VarArr3;
            boolean z7 = true;
            if (!z6) {
                if (!pd9Var3.S) {
                    iArr = iArr3;
                } else if (i16 != 0) {
                    iArr = iArr3;
                }
                z = z5;
                nh6 nh6Var2 = oc9Var2.r;
                boolean z8 = z;
                nh6 nh6Var3 = nh6Var2;
                r9 = z5;
                while (r9 < length4) {
                    int i19 = r9;
                    nh6 nh6Var4 = nh6VarArr4[i19];
                    if (nh6Var4 == null) {
                        i7 = length4;
                    } else {
                        i7 = length4;
                        boolean z9 = z8;
                        int b = pd9Var3.I.b(nh6Var4.getTrackGroup());
                        if (b == pd9Var3.L) {
                            Uri c = kd9VarArr[oc9Var2.r.getSelectedIndexInTrackGroup()].c();
                            sp4 sp4Var = (sp4) tp4Var.d.get(c);
                            if (sp4Var != null) {
                                rp4 rp4Var = (rp4) wv8.g(sp4Var.b, c, c);
                                rp4Var.getClass();
                                rp4Var.l = z5;
                            }
                            oc9Var2.r = nh6Var4;
                            nh6Var3 = nh6Var4;
                        }
                        if (r29[i19] == 0) {
                            pd9Var3.E++;
                            ld9 ld9Var2 = new ld9(pd9Var3, b);
                            r29[i19] = ld9Var2;
                            zArr2[i19] = z7;
                            if (pd9Var3.K != null) {
                                ld9Var2.a();
                                int i20 = pd9Var3.K[b];
                                if (!z9 && i20 >= 0) {
                                    od9 od9Var = pd9Var3.v[i20];
                                    z8 = (od9Var.u() == 0 || od9Var.H(j, z7)) ? false : true;
                                }
                            }
                        }
                        z8 = z9;
                    }
                    length4 = i7;
                    z5 = false;
                    z7 = true;
                    r9 = i19 + 1;
                }
                int i21 = length4;
                boolean z10 = z8;
                if (pd9Var3.E != 0) {
                    Uri c2 = kd9VarArr[oc9Var2.r.getSelectedIndexInTrackGroup()].c();
                    sp4 sp4Var2 = (sp4) tp4Var.d.get(c2);
                    if (sp4Var2 != null) {
                        rp4 rp4Var2 = (rp4) wv8.g(sp4Var2.b, c2, c2);
                        rp4Var2.getClass();
                        rp4Var2.l = false;
                    }
                    oc9Var2.n = null;
                    pd9Var3.G = null;
                    pd9Var3.R = true;
                    arrayList.clear();
                    if (x6kVar.l()) {
                        if (pd9Var3.C) {
                            for (od9 od9Var2 : pd9Var3.v) {
                                od9Var2.k();
                            }
                        }
                        x6kVar.a();
                    } else {
                        pd9Var3.w();
                    }
                    oc9Var = oc9Var2;
                    i4 = i11;
                    i2 = i14;
                    jpgVarArr3 = jpgVarArr2;
                    i3 = i15;
                    z3 = z10;
                    iArr2 = iArr4;
                    pd9VarArr = pd9VarArr3;
                    pd9Var = pd9Var3;
                } else {
                    boolean z11 = true;
                    if (arrayList.isEmpty() || Objects.equals(nh6Var3, nh6Var2)) {
                        oc9Var = oc9Var2;
                        i = i11;
                        i2 = i14;
                        jpgVarArr3 = jpgVarArr2;
                        i3 = i15;
                        iArr2 = iArr4;
                        pd9VarArr = pd9VarArr3;
                        pd9Var = pd9Var3;
                    } else {
                        if (pd9Var3.S) {
                            oc9Var = oc9Var2;
                            i = i11;
                            i2 = i14;
                            jpgVarArr3 = jpgVarArr2;
                            i3 = i15;
                            iArr2 = iArr4;
                            pd9VarArr = pd9VarArr3;
                            pd9Var = pd9Var3;
                        } else {
                            long j2 = j < 0 ? -j : 0L;
                            pc9 p = pd9Var3.p();
                            long j3 = j2;
                            k2c[] b2 = oc9Var2.b(p, j);
                            oc9Var = oc9Var2;
                            List list = pd9Var3.o;
                            i = i11;
                            i2 = i14;
                            jpgVarArr3 = jpgVarArr2;
                            i3 = i15;
                            iArr2 = iArr4;
                            pd9VarArr = pd9VarArr3;
                            pd9Var = pd9Var3;
                            nh6 nh6Var5 = nh6Var3;
                            nh6Var5.h(j, j3, C.TIME_UNSET, list, b2);
                            if (nh6Var5.getSelectedIndexInTrackGroup() != oc9Var.h.a(p.d)) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                        }
                        pd9Var.R = z11;
                        z2 = z11;
                        z3 = z2;
                        if (z3) {
                            i4 = i;
                        } else {
                            pd9Var.x(j, z2);
                            i4 = i;
                            int i22 = 0;
                            while (i22 < i4) {
                                if (r29[i22] != 0) {
                                    zArr2[i22] = z11;
                                }
                                i22++;
                                z11 = true;
                            }
                        }
                    }
                    z2 = z6;
                    z3 = z10;
                    if (z3) {
                    }
                }
                ArrayList arrayList2 = pd9Var.s;
                arrayList2.clear();
                for (i5 = 0; i5 < i4; i5++) {
                    ?? r8 = r29[i5];
                    if (r8 != 0) {
                        arrayList2.add((ld9) r8);
                    }
                }
                pd9Var.S = true;
                i6 = 0;
                z4 = false;
                while (i6 < nh6VarArr.length) {
                    ?? r82 = r29[i6];
                    int i23 = i3;
                    if (iArr2[i6] == i23) {
                        r82.getClass();
                        r10 = jpgVarArr3;
                        r10[i6] = r82;
                        identityHashMap.put(r82, Integer.valueOf(i23));
                        z4 = true;
                    } else {
                        r10 = jpgVarArr3;
                        if (iArr[i6] == i23) {
                            z1a.E(r82 == 0);
                        }
                    }
                    i6++;
                    jpgVarArr3 = r10;
                    i3 = i23;
                }
                jpg[] jpgVarArr6 = jpgVarArr3;
                int i24 = i3;
                int i25 = i13;
                if (!z4) {
                    pd9VarArr[i25] = pd9Var;
                    i13 = i25 + 1;
                    if (i25 == 0) {
                        oc9Var.l = true;
                        if (!z3) {
                            pd9[] pd9VarArr4 = this.u;
                            if (pd9VarArr4.length != 0 && pd9Var == pd9VarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.k.b).clear();
                        z6 = true;
                    } else {
                        oc9Var.l = i24 < this.v;
                    }
                }
                i12 = i24 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                pd9VarArr3 = pd9VarArr;
                jpgVarArr5 = r29;
                nh6VarArr3 = nh6VarArr4;
                length2 = i2;
                z5 = false;
                i11 = i4;
                jpgVarArr4 = jpgVarArr6;
                length4 = i21;
            }
            iArr = iArr3;
            z = true;
            nh6 nh6Var22 = oc9Var2.r;
            boolean z82 = z;
            nh6 nh6Var32 = nh6Var22;
            r9 = z5;
            while (r9 < length4) {
            }
            int i212 = length4;
            boolean z102 = z82;
            if (pd9Var3.E != 0) {
            }
            ArrayList arrayList22 = pd9Var.s;
            arrayList22.clear();
            while (i5 < i4) {
            }
            pd9Var.S = true;
            i6 = 0;
            z4 = false;
            while (i6 < nh6VarArr.length) {
            }
            jpg[] jpgVarArr62 = jpgVarArr3;
            int i242 = i3;
            int i252 = i13;
            if (!z4) {
            }
            i12 = i242 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            pd9VarArr3 = pd9VarArr;
            jpgVarArr5 = r29;
            nh6VarArr3 = nh6VarArr4;
            length2 = i2;
            z5 = false;
            i11 = i4;
            jpgVarArr4 = jpgVarArr62;
            length4 = i212;
        }
        boolean z12 = z5;
        System.arraycopy(jpgVarArr4, z12 ? 1 : 0, jpgVarArr, z12 ? 1 : 0, length2);
        pd9[] pd9VarArr5 = (pd9[]) nik.V(pd9VarArr3, i13);
        this.u = pd9VarArr5;
        vvf w = hv9.w(pd9VarArr5);
        AbstractList S = w3a.S(w, new m72(11));
        this.l.getClass();
        this.w = new kg3(w, S);
        return j;
    }

    @Override // defpackage.id9
    public final void b() {
        for (pd9 pd9Var : this.t) {
            x6k x6kVar = pd9Var.j;
            oc9 oc9Var = pd9Var.d;
            ArrayList arrayList = pd9Var.n;
            if (!arrayList.isEmpty()) {
                pc9 pc9Var = (pc9) jca.H(arrayList);
                int c = oc9Var.c(pc9Var);
                int i = pc9Var.o;
                if (c == 1) {
                    if (!pc9Var.f()) {
                        z1a.E(i != -1);
                        zc9 c2 = oc9Var.g.c(false, pc9Var.m);
                        c2.getClass();
                        hv9 hv9Var = c2.r;
                        int i2 = (int) (pc9Var.j - c2.k);
                        pc9Var.K = i2 < 0 ? 0L : ((uc9) (i2 < hv9Var.size() ? ((wc9) hv9Var.get(i2)).m : c2.s).get(i)).c;
                    }
                } else if (c == 0) {
                    pd9Var.r.post(new yq5(9, pd9Var, pc9Var));
                } else if (c == 2 && !pd9Var.T && x6kVar.l()) {
                    x6kVar.a();
                }
            }
        }
        this.q.b(this);
    }

    @Override // defpackage.w6c
    public final long c(long j, d0h d0hVar) {
        pd9[] pd9VarArr = this.u;
        int length = pd9VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            pd9 pd9Var = pd9VarArr[i];
            if (pd9Var.A == 2) {
                oc9 oc9Var = pd9Var.d;
                tp4 tp4Var = oc9Var.g;
                int selectedIndex = oc9Var.r.getSelectedIndex();
                kd9[] kd9VarArr = oc9Var.e;
                zc9 c = (selectedIndex >= kd9VarArr.length || selectedIndex == -1) ? null : tp4Var.c(true, kd9VarArr[oc9Var.r.getSelectedIndexInTrackGroup()].c());
                if (c != null) {
                    hv9 hv9Var = c.r;
                    if (!hv9Var.isEmpty()) {
                        long j2 = c.h - tp4Var.s;
                        long j3 = j - j2;
                        int d = nik.d(hv9Var, Long.valueOf(j3), true);
                        long j4 = ((wc9) hv9Var.get(d)).e;
                        return d0hVar.a(j3, j4, (!c.c || d == hv9Var.size() - 1) ? j4 : ((wc9) hv9Var.get(d + 1)).e) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.id9
    public final boolean d(Uri uri, yz1 yz1Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        r5a r5aVar;
        int indexOf;
        pd9[] pd9VarArr = this.t;
        int length = pd9VarArr.length;
        int i2 = 0;
        boolean z4 = false;
        while (i2 < length) {
            pd9 pd9Var = pd9VarArr[i2];
            oc9 oc9Var = pd9Var.d;
            kd9[] kd9VarArr = oc9Var.e;
            HashMap hashMap = oc9Var.g.d;
            int length2 = kd9VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                kd9 kd9Var = kd9VarArr[i3];
                sp4 sp4Var = (sp4) hashMap.get(uri);
                if (kd9Var.equals(sp4Var != null ? sp4Var.a : null)) {
                    if (z) {
                        r5aVar = null;
                    } else {
                        jfb a = oc9Var.a(uri);
                        pd9Var.i.getClass();
                        r5aVar = it7.j(a, yz1Var);
                    }
                    oc9Var.o = uri;
                    if (r5aVar != null) {
                        int i4 = r5aVar.a;
                        i = i2;
                        boolean z5 = false;
                        long j = r5aVar.b;
                        if (i4 == 1) {
                            z2 = false;
                            sp4 sp4Var2 = (sp4) hashMap.get(uri);
                            if (sp4Var2 != null) {
                                z3 = sp4Var2.a(uri, j);
                            }
                        } else {
                            if (i4 != 2) {
                                a70.r(ljg.j(i4, "Invalid fallback selection type: "));
                                return false;
                            }
                            int i5 = 0;
                            while (true) {
                                if (i5 >= kd9VarArr.length) {
                                    z2 = z5;
                                    i5 = -1;
                                    break;
                                }
                                kd9 kd9Var2 = kd9VarArr[i5];
                                z2 = z5;
                                sp4 sp4Var3 = (sp4) hashMap.get(uri);
                                if (kd9Var2.equals(sp4Var3 != null ? sp4Var3.a : null)) {
                                    break;
                                }
                                i5++;
                                z5 = z2;
                            }
                            if (i5 != -1 && (indexOf = oc9Var.r.indexOf(i5)) != -1 && oc9Var.r.g(indexOf, j)) {
                                sp4 sp4Var4 = (sp4) hashMap.get(uri);
                                if (sp4Var4 != null ? sp4Var4.a(uri, j) : z2) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                } else {
                    i3++;
                }
            }
            i = i2;
            z2 = false;
            z3 = z2;
            z4 |= z3;
            i2 = i + 1;
        }
        this.q.b(this);
        return z4;
    }

    @Override // defpackage.w6c
    public final void discardBuffer(long j, boolean z) {
        for (pd9 pd9Var : this.u) {
            if (pd9Var.C && !pd9Var.s()) {
                int length = pd9Var.v.length;
                for (int i = 0; i < length; i++) {
                    pd9Var.v[i].j(j, z, pd9Var.N[i]);
                }
            }
        }
    }

    public final pd9 e(String str, int i, kd9[] kd9VarArr, b[] bVarArr, b bVar, List list, Map map, long j) {
        pd9 pd9Var = new pd9(str, i, this.p, new oc9(this.a, this.b, kd9VarArr, bVarArr, this.c, this.d, this.k, list, this.o), map, this.i, j, bVar, this.e, this.f, this.g, this.h, this.n, null);
        long j2 = this.x;
        pd9Var.U = j2;
        if (pd9Var.C) {
            for (od9 od9Var : pd9Var.v) {
                od9Var.I(j2);
            }
        }
        return pd9Var;
    }

    @Override // defpackage.w6c
    public final void f(u6c u6cVar, long j) {
        String str;
        boolean z;
        Map map;
        hv9 hv9Var;
        pp4 pp4Var;
        pd9[] pd9VarArr;
        HashSet hashSet;
        int i;
        ArrayList arrayList;
        HashSet hashSet2;
        ArrayList arrayList2;
        Map map2;
        ArrayList arrayList3;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        List list;
        this.q = u6cVar;
        tp4 tp4Var = this.b;
        tp4Var.e.add(this);
        dd9 dd9Var = tp4Var.j;
        dd9Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        hv9 e = tp4Var.e(0);
        e.getClass();
        hv9 e2 = tp4Var.e(2);
        e2.getClass();
        hv9 e3 = tp4Var.e(3);
        e3.getClass();
        boolean isEmpty = e.isEmpty();
        this.r = 0;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        pp4 pp4Var2 = this.a;
        boolean z4 = this.m;
        if (isEmpty) {
            str = "ID3";
            z = z4;
            map = map3;
            hv9Var = e3;
            pp4Var = pp4Var2;
        } else {
            b bVar = dd9Var.j;
            List list2 = dd9Var.k;
            int size = e.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < e.size(); i6++) {
                b bVar2 = ((kd9) e.get(i6)).a.a;
                int i7 = bVar2.w;
                String str2 = bVar2.k;
                if (i7 > 0 || nik.x(str2, 2) != null) {
                    int i8 = i5;
                    iArr[i6] = 2;
                    i4++;
                    i5 = i8;
                } else if (nik.x(str2, 1) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i9 = i5;
            if (i4 > 0) {
                z3 = false;
                i3 = i4;
                z2 = true;
            } else if (i9 < size) {
                int i10 = size - i9;
                z2 = false;
                i3 = i10;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
                i3 = size;
            }
            kd9[] kd9VarArr = new kd9[i3];
            b[] bVarArr = new b[i3];
            int[] iArr2 = new int[i3];
            int i11 = 0;
            boolean z5 = z2;
            int i12 = 0;
            while (i12 < e.size()) {
                if (z5) {
                    list = list2;
                    if (iArr[i12] != 2) {
                        i12++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z3 || iArr[i12] != 1) {
                    kd9 kd9Var = (kd9) e.get(i12);
                    kd9VarArr[i11] = kd9Var;
                    bVarArr[i11] = kd9Var.a.a;
                    iArr2[i11] = i12;
                    i11++;
                }
                i12++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = bVarArr[0].k;
            int w = nik.w(2, str3);
            int i13 = 1;
            int w2 = nik.w(1, str3);
            boolean z6 = (w2 == 1 || (w2 == 0 && e2.isEmpty())) && w <= 1 && w2 + w > 0;
            if (z5 || w2 <= 0) {
                i13 = 0;
            }
            hv9Var = e3;
            pp4Var = pp4Var2;
            z = z4;
            pd9 e4 = e(U3.i.Z, i13, kd9VarArr, bVarArr, bVar, list3, map3, j);
            arrayList4.add(e4);
            arrayList5.add(iArr2);
            if (z && z6) {
                ArrayList arrayList6 = new ArrayList();
                if (w > 0) {
                    b[] bVarArr2 = new b[i3];
                    int i14 = 0;
                    while (i14 < i3) {
                        b bVar3 = bVarArr[i14];
                        b[] bVarArr3 = bVarArr;
                        String x = nik.x(bVar3.k, 2);
                        String e5 = sjc.e(x);
                        qm8 qm8Var = new qm8();
                        qm8Var.a = bVar3.a;
                        qm8Var.b = bVar3.b;
                        qm8Var.c = hv9.v(bVar3.c);
                        qm8Var.m = sjc.p(bVar3.n);
                        qm8Var.n = sjc.p(e5);
                        qm8Var.j = x;
                        qm8Var.k = bVar3.l;
                        qm8Var.h = bVar3.h;
                        qm8Var.i = bVar3.i;
                        qm8Var.u = bVar3.v;
                        qm8Var.v = bVar3.w;
                        qm8Var.y = bVar3.z;
                        qm8Var.e = bVar3.e;
                        qm8Var.f = bVar3.f;
                        qm8Var.D = bVar3.E;
                        bVarArr2[i14] = new b(qm8Var);
                        i14++;
                        bVarArr = bVarArr3;
                        map3 = map3;
                    }
                    b[] bVarArr4 = bVarArr;
                    map = map3;
                    arrayList6.add(new osj(U3.i.Z, bVarArr2));
                    if (w2 > 0 && (bVar != null || e2.isEmpty())) {
                        qm8 a = h(bVarArr4[0], bVar, false).a();
                        a.l = U3.i.Z;
                        arrayList6.add(new osj("main:audio", new b(a)));
                    }
                    if (list3 != null) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            String j2 = ljg.j(i15, "main:cc:");
                            qm8 a2 = pp4Var.f((b) list3.get(i15)).a();
                            a2.l = U3.i.Z;
                            arrayList6.add(new osj(j2, new b(a2)));
                        }
                    }
                } else {
                    map = map3;
                    b[] bVarArr5 = new b[i3];
                    for (int i16 = 0; i16 < i3; i16++) {
                        bVarArr5[i16] = h(bVarArr[i16], bVar, true);
                    }
                    arrayList6.add(new osj(U3.i.Z, bVarArr5));
                }
                qm8 qm8Var2 = new qm8();
                str = "ID3";
                qm8Var2.a = str;
                qm8Var2.n = sjc.p(MimeTypes.APPLICATION_ID3);
                qm8Var2.l = U3.i.Z;
                osj osjVar = new osj("main:id3", new b(qm8Var2));
                arrayList6.add(osjVar);
                e4.v((osj[]) arrayList6.toArray(new osj[0]), arrayList6.indexOf(osjVar));
            } else {
                map = map3;
                str = "ID3";
            }
        }
        ArrayList arrayList7 = new ArrayList(e2.size());
        ArrayList arrayList8 = new ArrayList(e2.size());
        ArrayList arrayList9 = new ArrayList(e2.size());
        HashSet hashSet3 = new HashSet();
        int i17 = 0;
        while (i17 < e2.size()) {
            String str4 = ((kd9) e2.get(i17)).a.c;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                boolean z7 = true;
                for (int i18 = 0; i18 < e2.size(); i18++) {
                    if (str4.equals(((kd9) e2.get(i18)).a.c)) {
                        kd9 kd9Var2 = (kd9) e2.get(i18);
                        b bVar4 = kd9Var2.a.a;
                        arrayList9.add(Integer.valueOf(i18));
                        arrayList7.add(kd9Var2);
                        arrayList8.add(bVar4);
                        z7 &= nik.w(1, bVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = nik.a;
                arrayList = arrayList9;
                hashSet2 = hashSet3;
                arrayList2 = arrayList7;
                map2 = map;
                arrayList3 = arrayList8;
                i2 = i17;
                pd9 e6 = e(concat, 1, (kd9[]) arrayList7.toArray(new kd9[0]), (b[]) arrayList8.toArray(new b[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList5.add(jaa.O(arrayList));
                arrayList4.add(e6);
                if (z && z7) {
                    String concat2 = concat.concat(":id3");
                    qm8 qm8Var3 = new qm8();
                    qm8Var3.a = str;
                    qm8Var3.n = sjc.p(MimeTypes.APPLICATION_ID3);
                    qm8Var3.l = concat;
                    e6.v(new osj[]{new osj(concat, (b[]) arrayList3.toArray(new b[0])), new osj(concat2, new b(qm8Var3))}, 1);
                }
            } else {
                arrayList = arrayList9;
                hashSet2 = hashSet3;
                arrayList2 = arrayList7;
                map2 = map;
                arrayList3 = arrayList8;
                i2 = i17;
            }
            i17 = i2 + 1;
            map = map2;
            arrayList8 = arrayList3;
            arrayList7 = arrayList2;
            arrayList9 = arrayList;
            hashSet3 = hashSet2;
        }
        Map map4 = map;
        this.v = arrayList4.size();
        ArrayList arrayList10 = new ArrayList(hv9Var.size());
        ArrayList arrayList11 = new ArrayList(hv9Var.size());
        ArrayList arrayList12 = new ArrayList(hv9Var.size());
        HashSet hashSet4 = new HashSet();
        int i19 = 0;
        while (i19 < hv9Var.size()) {
            hv9 hv9Var2 = hv9Var;
            String str6 = ((kd9) hv9Var2.get(i19)).a.c;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList10.clear();
                arrayList11.clear();
                arrayList12.clear();
                for (int i20 = 0; i20 < hv9Var2.size(); i20++) {
                    if (str6.equals(((kd9) hv9Var2.get(i20)).a.c)) {
                        kd9 kd9Var3 = (kd9) hv9Var2.get(i20);
                        arrayList12.add(Integer.valueOf(i20));
                        arrayList10.add(kd9Var3);
                        arrayList11.add(kd9Var3.a.a);
                    }
                }
                String concat3 = "subtitle:".concat(str6);
                b[] bVarArr6 = (b[]) arrayList11.toArray(new b[0]);
                String str7 = nik.a;
                kd9[] kd9VarArr2 = (kd9[]) arrayList10.toArray(new kd9[0]);
                av9 av9Var = hv9.b;
                hv9Var = hv9Var2;
                hashSet = hashSet4;
                i = i19;
                pd9 e7 = e(concat3, 3, kd9VarArr2, bVarArr6, null, vvf.e, map4, j);
                arrayList5.add(jaa.O(arrayList12));
                arrayList4.add(e7);
                int length = bVarArr6.length;
                b[] bVarArr7 = new b[length];
                for (int i21 = 0; i21 < length; i21++) {
                    bVarArr7[i21] = pp4Var.f(bVarArr6[i21]);
                }
                e7.v(new osj[]{new osj(concat3, bVarArr7)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i19;
                hv9Var = hv9Var2;
            }
            i19 = i + 1;
            hashSet4 = hashSet;
        }
        this.t = (pd9[]) arrayList4.toArray(new pd9[0]);
        this.r = this.t.length;
        int i22 = 0;
        while (true) {
            int i23 = this.v;
            pd9VarArr = this.t;
            if (i22 >= i23) {
                break;
            }
            pd9VarArr[i22].d.l = true;
            i22++;
        }
        for (pd9 pd9Var : pd9VarArr) {
            if (!pd9Var.D) {
                lgb lgbVar = new lgb();
                lgbVar.a = pd9Var.P;
                pd9Var.g(new mgb(lgbVar));
            }
        }
        this.u = this.t;
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        if (this.s != null) {
            return this.w.g(mgbVar);
        }
        for (pd9 pd9Var : this.t) {
            if (!pd9Var.D) {
                lgb lgbVar = new lgb();
                lgbVar.a = pd9Var.P;
                pd9Var.g(new mgb(lgbVar));
            }
        }
        return false;
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        return this.w.getBufferedPositionUs();
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        return this.w.getNextLoadPositionUs();
    }

    @Override // defpackage.w6c
    public final qsj getTrackGroups() {
        qsj qsjVar = this.s;
        qsjVar.getClass();
        return qsjVar;
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        return this.w.isLoading();
    }

    @Override // defpackage.w6c
    public final void maybeThrowPrepareError() {
        for (pd9 pd9Var : this.t) {
            pd9Var.u();
            if (pd9Var.T && !pd9Var.D) {
                throw s9e.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.w6c
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        this.w.reevaluateBuffer(j);
    }

    @Override // defpackage.w6c
    public final long seekToUs(long j) {
        pd9[] pd9VarArr = this.u;
        if (pd9VarArr.length > 0) {
            boolean x = pd9VarArr[0].x(j, false);
            int i = 1;
            while (true) {
                pd9[] pd9VarArr2 = this.u;
                if (i >= pd9VarArr2.length) {
                    break;
                }
                pd9VarArr2[i].x(j, x);
                i++;
            }
            if (x) {
                ((SparseArray) this.k.b).clear();
            }
        }
        return j;
    }
}
