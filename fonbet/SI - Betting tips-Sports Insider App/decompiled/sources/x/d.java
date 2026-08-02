package x;

import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import r4.k;
import y.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f25294a0;

    /* renamed from: b, reason: collision with root package name */
    public y.c f25295b;

    /* renamed from: b0, reason: collision with root package name */
    public int f25296b0;

    /* renamed from: c, reason: collision with root package name */
    public y.c f25297c;

    /* renamed from: c0, reason: collision with root package name */
    public int f25298c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f25300d0;
    public float e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f25303f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f25305g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f25307h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f25309i0;
    public String j;
    public int j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25310k;
    public final float[] k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25311l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f25312l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25313m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f25314m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25315n;

    /* renamed from: n0, reason: collision with root package name */
    public int f25316n0;

    /* renamed from: o, reason: collision with root package name */
    public int f25317o;

    /* renamed from: o0, reason: collision with root package name */
    public int f25318o0;

    /* renamed from: p, reason: collision with root package name */
    public int f25319p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f25320p0;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public int f25321r;

    /* renamed from: s, reason: collision with root package name */
    public int f25322s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f25323t;

    /* renamed from: u, reason: collision with root package name */
    public int f25324u;

    /* renamed from: v, reason: collision with root package name */
    public int f25325v;

    /* renamed from: w, reason: collision with root package name */
    public float f25326w;

    /* renamed from: x, reason: collision with root package name */
    public int f25327x;

    /* renamed from: y, reason: collision with root package name */
    public int f25328y;

    /* renamed from: z, reason: collision with root package name */
    public float f25329z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f25293a = false;

    /* renamed from: d, reason: collision with root package name */
    public y.j f25299d = null;

    /* renamed from: e, reason: collision with root package name */
    public l f25301e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f25302f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f25304g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f25306h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f25308i = -1;

    public d() {
        new HashMap();
        this.f25310k = false;
        this.f25311l = false;
        this.f25313m = false;
        this.f25315n = false;
        this.f25317o = -1;
        this.f25319p = -1;
        this.q = 0;
        this.f25321r = 0;
        this.f25322s = 0;
        this.f25323t = new int[2];
        this.f25324u = 0;
        this.f25325v = 0;
        this.f25326w = 1.0f;
        this.f25327x = 0;
        this.f25328y = 0;
        this.f25329z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        c cVar = new c(this, 2);
        this.I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.K = cVar3;
        c cVar4 = new c(this, 5);
        this.L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.P = cVar8;
        this.Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f25320p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f25294a0 = 0;
        this.f25300d0 = 0.5f;
        this.e0 = 0.5f;
        this.f25305g0 = 0;
        this.f25307h0 = null;
        this.f25309i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.f25312l0 = new d[]{null, null};
        this.f25314m0 = new d[]{null, null};
        this.f25316n0 = -1;
        this.f25318o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i5, int i10, String str, StringBuilder sb2) {
        if (i5 == i10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i5);
        sb2.append(",\n");
    }

    public static void H(StringBuilder sb2, String str, float f6, float f10) {
        if (f6 == f10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f6);
        sb2.append(",\n");
    }

    public static void o(StringBuilder sb2, String str, int i5, int i10, int i11, int i12, int i13, float f6, int i14) {
        String str2;
        sb2.append(str);
        sb2.append(" :  {\n");
        if (i14 == 1) {
            str2 = "FIXED";
        } else if (i14 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i14 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i14 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            k.s(sb2, "      behavior", " :   ", str2, ",\n");
        }
        G(i5, 0, "      size", sb2);
        G(i10, 0, "      min", sb2);
        G(i11, Integer.MAX_VALUE, "      max", sb2);
        G(i12, 0, "      matchMin", sb2);
        G(i13, 0, "      matchDef", sb2);
        H(sb2, "      matchPercent", f6, 1.0f);
        sb2.append("    },\n");
    }

    public static void p(StringBuilder sb2, String str, c cVar) {
        if (cVar.f25289f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(cVar.f25289f);
        sb2.append("'");
        if (cVar.f25291h != Integer.MIN_VALUE || cVar.f25290g != 0) {
            sb2.append(StringUtils.COMMA);
            sb2.append(cVar.f25290g);
            if (cVar.f25291h != Integer.MIN_VALUE) {
                sb2.append(StringUtils.COMMA);
                sb2.append(cVar.f25291h);
                sb2.append(StringUtils.COMMA);
            }
        }
        sb2.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f25310k) {
            return true;
        }
        return this.I.f25286c && this.K.f25286c;
    }

    public boolean B() {
        if (this.f25311l) {
            return true;
        }
        return this.J.f25286c && this.L.f25286c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f25294a0 = 0;
        this.f25296b0 = 0;
        this.f25298c0 = 0;
        this.f25300d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.f25320p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f25303f0 = null;
        this.f25305g0 = 0;
        this.f25309i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f25317o = -1;
        this.f25319p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f25321r = 0;
        this.f25322s = 0;
        this.f25326w = 1.0f;
        this.f25329z = 1.0f;
        this.f25325v = Integer.MAX_VALUE;
        this.f25328y = Integer.MAX_VALUE;
        this.f25324u = 0;
        this.f25327x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f25302f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f25304g = true;
        int[] iArr3 = this.f25323t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f25306h = -1;
        this.f25308i = -1;
    }

    public final void D() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((c) arrayList.get(i5)).j();
        }
    }

    public final void E() {
        this.f25310k = false;
        this.f25311l = false;
        this.f25313m = false;
        this.f25315n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            c cVar = (c) arrayList.get(i5);
            cVar.f25286c = false;
            cVar.f25285b = 0;
        }
    }

    public void F(kh.g gVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i5) {
        this.f25294a0 = i5;
        this.E = i5 > 0;
    }

    public final void J(int i5, int i10) {
        if (this.f25310k) {
            return;
        }
        this.I.l(i5);
        this.K.l(i10);
        this.Y = i5;
        this.U = i10 - i5;
        this.f25310k = true;
    }

    public final void K(int i5, int i10) {
        if (this.f25311l) {
            return;
        }
        this.J.l(i5);
        this.L.l(i10);
        this.Z = i5;
        this.V = i10 - i5;
        if (this.E) {
            this.M.l(i5 + this.f25294a0);
        }
        this.f25311l = true;
    }

    public final void L(int i5) {
        this.V = i5;
        int i10 = this.f25298c0;
        if (i5 < i10) {
            this.V = i10;
        }
    }

    public final void M(int i5) {
        this.f25320p0[0] = i5;
    }

    public final void N(int i5) {
        this.f25320p0[1] = i5;
    }

    public final void O(int i5) {
        this.U = i5;
        int i10 = this.f25296b0;
        if (i5 < i10) {
            this.U = i10;
        }
    }

    public void P(boolean z5, boolean z7) {
        int i5;
        int i10;
        y.j jVar = this.f25299d;
        boolean z10 = z5 & jVar.f25519g;
        l lVar = this.f25301e;
        boolean z11 = z7 & lVar.f25519g;
        int i11 = jVar.f25520h.f25495g;
        int i12 = lVar.f25520h.f25495g;
        int i13 = jVar.f25521i.f25495g;
        int i14 = lVar.f25521i.f25495g;
        int i15 = i14 - i12;
        if (i13 - i11 < 0 || i15 < 0 || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
            i13 = 0;
            i14 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        if (z10) {
            this.Y = i11;
        }
        if (z11) {
            this.Z = i12;
        }
        if (this.f25305g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f25320p0;
        if (z10) {
            if (iArr[0] == 1 && i16 < (i10 = this.U)) {
                i16 = i10;
            }
            this.U = i16;
            int i18 = this.f25296b0;
            if (i16 < i18) {
                this.U = i18;
            }
        }
        if (z11) {
            if (iArr[1] == 1 && i17 < (i5 = this.V)) {
                i17 = i5;
            }
            this.V = i17;
            int i19 = this.f25298c0;
            if (i17 < i19) {
                this.V = i19;
            }
        }
    }

    public void Q(v.c cVar, boolean z5) {
        int i5;
        int i10;
        l lVar;
        y.j jVar;
        cVar.getClass();
        int n9 = v.c.n(this.I);
        int n10 = v.c.n(this.J);
        int n11 = v.c.n(this.K);
        int n12 = v.c.n(this.L);
        if (z5 && (jVar = this.f25299d) != null) {
            y.e eVar = jVar.f25520h;
            if (eVar.j) {
                y.e eVar2 = jVar.f25521i;
                if (eVar2.j) {
                    n9 = eVar.f25495g;
                    n11 = eVar2.f25495g;
                }
            }
        }
        if (z5 && (lVar = this.f25301e) != null) {
            y.e eVar3 = lVar.f25520h;
            if (eVar3.j) {
                y.e eVar4 = lVar.f25521i;
                if (eVar4.j) {
                    n10 = eVar3.f25495g;
                    n12 = eVar4.f25495g;
                }
            }
        }
        int i11 = n12 - n10;
        if (n11 - n9 < 0 || i11 < 0 || n9 == Integer.MIN_VALUE || n9 == Integer.MAX_VALUE || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE) {
            n9 = 0;
            n10 = 0;
            n11 = 0;
            n12 = 0;
        }
        int i12 = n11 - n9;
        int i13 = n12 - n10;
        this.Y = n9;
        this.Z = n10;
        if (this.f25305g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f25320p0;
        int i14 = iArr[0];
        if (i14 == 1 && i12 < (i10 = this.U)) {
            i12 = i10;
        }
        if (iArr[1] == 1 && i13 < (i5 = this.V)) {
            i13 = i5;
        }
        this.U = i12;
        this.V = i13;
        int i15 = this.f25298c0;
        if (i13 < i15) {
            this.V = i15;
        }
        int i16 = this.f25296b0;
        if (i12 < i16) {
            this.U = i16;
        }
        int i17 = this.f25325v;
        if (i17 > 0 && i14 == 3) {
            this.U = Math.min(this.U, i17);
        }
        int i18 = this.f25328y;
        if (i18 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i18);
        }
        int i19 = this.U;
        if (i12 != i19) {
            this.f25306h = i19;
        }
        int i20 = this.V;
        if (i13 != i20) {
            this.f25308i = i20;
        }
    }

    public final void a(e eVar, v.c cVar, HashSet hashSet, int i5, boolean z5) {
        if (z5) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.W(64));
        }
        if (i5 == 0) {
            HashSet hashSet2 = this.I.f25284a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f25287d.a(eVar, cVar, hashSet, i5, true);
                }
            }
            HashSet hashSet3 = this.K.f25284a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f25287d.a(eVar, cVar, hashSet, i5, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f25284a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f25287d.a(eVar, cVar, hashSet, i5, true);
            }
        }
        HashSet hashSet5 = this.L.f25284a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f25287d.a(eVar, cVar, hashSet, i5, true);
            }
        }
        HashSet hashSet6 = this.M.f25284a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f25287d.a(eVar, cVar, hashSet, i5, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d3, code lost:
    
        if (r58.f25305g0 == r14) goto L374;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b5  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [x.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(v.c cVar, boolean z5) {
        boolean z7;
        boolean z10;
        boolean z11;
        ?? r17;
        int i5;
        boolean z12;
        boolean z13;
        d dVar;
        d dVar2;
        boolean[] zArr;
        c cVar2;
        boolean[] zArr2;
        c cVar3;
        c cVar4;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        int i11;
        int[] iArr;
        float f6;
        c cVar5;
        v.g gVar;
        c cVar6;
        int i12;
        int i13;
        int i14;
        boolean z17;
        int i15;
        boolean z18;
        boolean z19;
        c cVar7;
        boolean z20;
        char c2;
        boolean z21;
        int i16;
        int[] iArr2;
        c cVar8;
        v.g gVar2;
        v.g gVar3;
        c cVar9;
        int[] iArr3;
        v.g gVar4;
        boolean z22;
        boolean z23;
        boolean z24;
        v.g gVar5;
        c cVar10;
        v.g gVar6;
        int i17;
        boolean[] zArr3;
        v.g gVar7;
        v.g gVar8;
        v.g gVar9;
        int i18;
        int i19;
        boolean z25;
        int i20;
        v.g gVar10;
        v.g gVar11;
        ?? r27;
        l lVar;
        y.e eVar;
        d dVar3;
        boolean z26;
        y.j jVar;
        y.e eVar2;
        int i21;
        int i22;
        boolean x10;
        int i23;
        boolean y5;
        y.j jVar2;
        l lVar2;
        boolean z27;
        v.c cVar11 = cVar;
        c cVar12 = this.I;
        v.g k6 = cVar11.k(cVar12);
        c cVar13 = this.K;
        v.g k9 = cVar11.k(cVar13);
        c cVar14 = this.J;
        v.g k10 = cVar11.k(cVar14);
        c cVar15 = this.L;
        v.g k11 = cVar11.k(cVar15);
        c cVar16 = this.M;
        v.g k12 = cVar11.k(cVar16);
        d dVar4 = this.T;
        if (dVar4 != null) {
            int[] iArr4 = dVar4.f25320p0;
            r17 = 0;
            z7 = false;
            r17 = 0;
            z11 = iArr4[0] == 2;
            boolean z28 = iArr4[1] == 2;
            int i24 = this.q;
            if (i24 != 1) {
                if (i24 == 2) {
                    z11 = false;
                }
                z10 = z28;
            } else {
                z10 = false;
            }
            i5 = this.f25305g0;
            boolean[] zArr4 = this.S;
            boolean z29 = z10;
            if (i5 != 8) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z12 = z11;
                int i25 = r17;
                while (true) {
                    if (i25 < size) {
                        int i26 = size;
                        HashSet hashSet = ((c) arrayList.get(i25)).f25284a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i25++;
                        size = i26;
                    } else if (!zArr4[r17] && !zArr4[1]) {
                        return;
                    }
                }
            } else {
                z12 = z11;
            }
            z13 = this.f25310k;
            if (!z13 || this.f25311l) {
                if (z13) {
                    cVar11.d(k6, this.Y);
                    cVar11.d(k9, this.Y + this.U);
                    if (z12 && (dVar2 = this.T) != null) {
                        e eVar3 = (e) dVar2;
                        WeakReference weakReference = eVar3.H0;
                        if (weakReference == null || weakReference.get() == null || cVar12.d() > ((c) eVar3.H0.get()).d()) {
                            eVar3.H0 = new WeakReference(cVar12);
                        }
                        WeakReference weakReference2 = eVar3.J0;
                        if (weakReference2 == null || weakReference2.get() == null || cVar13.d() > ((c) eVar3.J0.get()).d()) {
                            eVar3.J0 = new WeakReference(cVar13);
                        }
                    }
                }
                if (this.f25311l) {
                    cVar11.d(k10, this.Z);
                    cVar11.d(k11, this.Z + this.V);
                    HashSet hashSet2 = cVar16.f25284a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        cVar11.d(k12, this.Z + this.f25294a0);
                    }
                    if (z29 && (dVar = this.T) != null) {
                        e eVar4 = (e) dVar;
                        WeakReference weakReference3 = eVar4.G0;
                        if (weakReference3 == null || weakReference3.get() == null || cVar14.d() > ((c) eVar4.G0.get()).d()) {
                            eVar4.G0 = new WeakReference(cVar14);
                        }
                        WeakReference weakReference4 = eVar4.I0;
                        if (weakReference4 == null || weakReference4.get() == null || cVar15.d() > ((c) eVar4.I0.get()).d()) {
                            eVar4.I0 = new WeakReference(cVar15);
                        }
                    }
                }
                if (this.f25310k && this.f25311l) {
                    boolean z30 = r17;
                    this.f25310k = z30;
                    this.f25311l = z30;
                    return;
                }
            }
            zArr = this.f25302f;
            if (z5 || (jVar2 = this.f25299d) == null || (lVar2 = this.f25301e) == null) {
                cVar2 = cVar16;
                zArr2 = zArr;
            } else {
                cVar2 = cVar16;
                y.e eVar5 = jVar2.f25520h;
                zArr2 = zArr;
                if (eVar5.j && jVar2.f25521i.j && lVar2.f25520h.j && lVar2.f25521i.j) {
                    cVar11.d(k6, eVar5.f25495g);
                    cVar11.d(k9, this.f25299d.f25521i.f25495g);
                    cVar11.d(k10, this.f25301e.f25520h.f25495g);
                    cVar11.d(k11, this.f25301e.f25521i.f25495g);
                    cVar11.d(k12, this.f25301e.f25505k.f25495g);
                    if (this.T != null) {
                        if (z12 && zArr2[0] && !x()) {
                            cVar11.f(cVar11.k(this.T.K), k9, 0, 8);
                        }
                        if (z29 && zArr2[1] && !y()) {
                            z27 = false;
                            cVar11.f(cVar11.k(this.T.L), k11, 0, 8);
                            this.f25310k = z27;
                            this.f25311l = z27;
                            return;
                        }
                    }
                    z27 = false;
                    this.f25310k = z27;
                    this.f25311l = z27;
                    return;
                }
            }
            if (this.T == null) {
                if (w(0)) {
                    ((e) this.T).R(this, 0);
                    x10 = true;
                    i23 = 1;
                } else {
                    x10 = x();
                    i23 = 1;
                }
                if (w(i23)) {
                    ((e) this.T).R(this, i23);
                    y5 = true;
                } else {
                    y5 = y();
                }
                if (!x10 && z12 && this.f25305g0 != 8 && cVar12.f25289f == null && cVar13.f25289f == null) {
                    cVar3 = cVar12;
                    cVar11.f(cVar11.k(this.T.K), k9, 0, 1);
                } else {
                    cVar3 = cVar12;
                }
                if (!y5 && z29 && this.f25305g0 != 8 && cVar14.f25289f == null && cVar15.f25289f == null && cVar2 == null) {
                    cVar11.f(cVar11.k(this.T.L), k11, 0, 1);
                }
                cVar4 = cVar13;
                z14 = z29;
                z16 = y5;
                z15 = x10;
            } else {
                cVar3 = cVar12;
                cVar4 = cVar13;
                z14 = z29;
                z15 = false;
                z16 = false;
            }
            i10 = this.U;
            i11 = this.f25296b0;
            if (i10 >= i11) {
                i11 = i10;
            }
            int i27 = this.V;
            c cVar17 = cVar4;
            int i28 = this.f25298c0;
            int i29 = i27 >= i28 ? i28 : i27;
            iArr = this.f25320p0;
            int i30 = iArr[0];
            boolean z31 = z14;
            boolean z32 = i30 == 3;
            int i31 = iArr[1];
            boolean z33 = i31 == 3;
            int i32 = this.X;
            this.A = i32;
            f6 = this.W;
            this.B = f6;
            int i33 = this.f25321r;
            int i34 = this.f25322s;
            if (f6 <= 0.0f) {
                cVar5 = cVar15;
                if (this.f25305g0 != 8) {
                    int i35 = (i30 == 3 && i33 == 0) ? 3 : i33;
                    if (i31 == 3 && i34 == 0) {
                        gVar = k11;
                        i22 = 3;
                    } else {
                        gVar = k11;
                        i22 = i34;
                    }
                    if (i30 == 3 && i31 == 3 && i35 == 3 && i22 == 3) {
                        if (i32 == -1) {
                            if (z32 && !z33) {
                                this.A = 0;
                            } else if (!z32 && z33) {
                                this.A = 1;
                                if (i32 == -1) {
                                    this.B = 1.0f / f6;
                                }
                            }
                        }
                        if (this.A == 0 && (!cVar14.h() || !cVar5.h())) {
                            this.A = 1;
                        } else if (this.A == 1 && (!cVar3.h() || !cVar17.h())) {
                            this.A = 0;
                        }
                        if (this.A == -1 && (!cVar14.h() || !cVar5.h() || !cVar3.h() || !cVar17.h())) {
                            if (cVar14.h() && cVar5.h()) {
                                this.A = 0;
                            } else if (cVar3.h() && cVar17.h()) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                        if (this.A == -1) {
                            int i36 = this.f25324u;
                            if (i36 > 0 && this.f25327x == 0) {
                                this.A = 0;
                            } else if (i36 == 0 && this.f25327x > 0) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                    } else if (i30 == 3 && i35 == 3) {
                        this.A = 0;
                        i11 = (int) (f6 * i27);
                        if (i31 != 3) {
                            cVar6 = cVar2;
                            i12 = i29;
                            i13 = 4;
                            z17 = false;
                            i14 = i22;
                            int[] iArr5 = this.f25323t;
                            iArr5[0] = i13;
                            iArr5[1] = i14;
                            if (z17) {
                            }
                            z18 = false;
                            if (z17) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z19) {
                            }
                            cVar7 = this.P;
                            z20 = !cVar7.h();
                            c2 = '\b';
                            z21 = zArr4[0];
                            boolean z34 = zArr4[1];
                            i16 = this.f25317o;
                            iArr2 = this.C;
                            if (i16 != 2) {
                            }
                            cVar8 = cVar6;
                            gVar2 = k6;
                            gVar3 = k9;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            gVar4 = k12;
                            z22 = z15;
                            z23 = z12;
                            z24 = z31;
                            gVar5 = k10;
                            cVar10 = cVar5;
                            gVar6 = gVar;
                            i17 = i13;
                            zArr3 = zArr2;
                            if (z5) {
                            }
                            gVar7 = gVar5;
                            gVar8 = gVar6;
                            gVar9 = gVar4;
                            i18 = 0;
                            i19 = 8;
                            z25 = true;
                            i20 = 1;
                            if (this.f25319p == 2) {
                            }
                            if (i20 != 0) {
                            }
                            gVar10 = gVar7;
                            gVar11 = gVar8;
                            if (z17) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f25310k = false;
                            this.f25311l = false;
                        }
                    } else if (i31 == 3 && i22 == 3) {
                        this.A = 1;
                        if (i32 == -1) {
                            this.B = 1.0f / f6;
                        }
                        i12 = (int) (this.B * i10);
                        if (i30 == 3) {
                            i13 = i35;
                            cVar6 = cVar2;
                            z17 = true;
                            i14 = i22;
                            int[] iArr52 = this.f25323t;
                            iArr52[0] = i13;
                            iArr52[1] = i14;
                            if (z17) {
                            }
                            z18 = false;
                            if (z17) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z19) {
                            }
                            cVar7 = this.P;
                            z20 = !cVar7.h();
                            c2 = '\b';
                            z21 = zArr4[0];
                            boolean z342 = zArr4[1];
                            i16 = this.f25317o;
                            iArr2 = this.C;
                            if (i16 != 2) {
                            }
                            cVar8 = cVar6;
                            gVar2 = k6;
                            gVar3 = k9;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            gVar4 = k12;
                            z22 = z15;
                            z23 = z12;
                            z24 = z31;
                            gVar5 = k10;
                            cVar10 = cVar5;
                            gVar6 = gVar;
                            i17 = i13;
                            zArr3 = zArr2;
                            if (z5) {
                            }
                            gVar7 = gVar5;
                            gVar8 = gVar6;
                            gVar9 = gVar4;
                            i18 = 0;
                            i19 = 8;
                            z25 = true;
                            i20 = 1;
                            if (this.f25319p == 2) {
                            }
                            if (i20 != 0) {
                            }
                            gVar10 = gVar7;
                            gVar11 = gVar8;
                            if (z17) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f25310k = false;
                            this.f25311l = false;
                        }
                        i13 = i35;
                        cVar6 = cVar2;
                        i14 = 4;
                        z17 = false;
                        int[] iArr522 = this.f25323t;
                        iArr522[0] = i13;
                        iArr522[1] = i14;
                        if (z17) {
                            i15 = -1;
                        } else {
                            int i37 = this.A;
                            i15 = -1;
                            if (i37 == 0 || i37 == -1) {
                                z18 = true;
                                boolean z35 = !z17 && ((i21 = this.A) == 1 || i21 == i15);
                                z19 = iArr[0] != 2 && (this instanceof e);
                                if (z19) {
                                    i11 = 0;
                                }
                                cVar7 = this.P;
                                z20 = !cVar7.h();
                                c2 = '\b';
                                z21 = zArr4[0];
                                boolean z3422 = zArr4[1];
                                i16 = this.f25317o;
                                iArr2 = this.C;
                                if (i16 != 2 && !this.f25310k) {
                                    if (z5 && (jVar = this.f25299d) != null) {
                                        eVar2 = jVar.f25520h;
                                        if (eVar2.j || !jVar.f25521i.j) {
                                            c2 = '\b';
                                        } else if (z5) {
                                            cVar11.d(k6, eVar2.f25495g);
                                            cVar11.d(k9, this.f25299d.f25521i.f25495g);
                                            if (this.T != null && z12 && zArr2[0] && !x()) {
                                                cVar11.f(cVar11.k(this.T.K), k9, 0, 8);
                                            }
                                        }
                                    }
                                    d dVar5 = this.T;
                                    v.g k13 = dVar5 == null ? cVar11.k(dVar5.K) : null;
                                    d dVar6 = this.T;
                                    v.g k14 = dVar6 == null ? cVar11.k(dVar6.I) : null;
                                    z23 = z12;
                                    i17 = i13;
                                    z22 = z15;
                                    cVar9 = cVar7;
                                    iArr3 = iArr2;
                                    boolean z36 = z18;
                                    gVar2 = k6;
                                    z24 = z31;
                                    gVar5 = k10;
                                    gVar3 = k9;
                                    cVar10 = cVar5;
                                    gVar6 = gVar;
                                    cVar8 = cVar6;
                                    gVar4 = k12;
                                    zArr3 = zArr2;
                                    cVar11 = cVar;
                                    d(cVar11, true, z23, z24, zArr2[0], k14, k13, iArr[0], z19, this.I, this.K, this.Y, i11, this.f25296b0, iArr2[0], this.f25300d0, z36, iArr[1] == 3, z22, z16, z21, i17, i14, this.f25324u, this.f25325v, this.f25326w, z20);
                                    if (z5 && (lVar = this.f25301e) != null) {
                                        eVar = lVar.f25520h;
                                        if (eVar.j && lVar.f25521i.j) {
                                            int i38 = eVar.f25495g;
                                            gVar7 = gVar5;
                                            cVar11.d(gVar7, i38);
                                            gVar8 = gVar6;
                                            cVar11.d(gVar8, this.f25301e.f25521i.f25495g);
                                            gVar9 = gVar4;
                                            cVar11.d(gVar9, this.f25301e.f25505k.f25495g);
                                            dVar3 = this.T;
                                            if (dVar3 == null && !z16 && z24) {
                                                z26 = true;
                                                z26 = true;
                                                if (zArr3[1]) {
                                                    i18 = 0;
                                                    i19 = 8;
                                                    cVar11.f(cVar11.k(dVar3.L), gVar8, 0, 8);
                                                } else {
                                                    i18 = 0;
                                                    i19 = 8;
                                                }
                                            } else {
                                                i18 = 0;
                                                i19 = 8;
                                                z26 = true;
                                            }
                                            i20 = i18;
                                            z25 = z26;
                                            if (this.f25319p == 2) {
                                                i20 = i18;
                                            }
                                            if (i20 != 0 || this.f25311l) {
                                                gVar10 = gVar7;
                                                gVar11 = gVar8;
                                            } else {
                                                int i39 = (iArr[z25 ? 1 : 0] == 2 && (this instanceof e)) ? z25 ? 1 : 0 : i18;
                                                int i40 = i39 != 0 ? i18 : i12;
                                                d dVar7 = this.T;
                                                v.g k15 = dVar7 != null ? cVar11.k(dVar7.L) : null;
                                                d dVar8 = this.T;
                                                v.g k16 = dVar8 != null ? cVar11.k(dVar8.J) : null;
                                                int i41 = this.f25294a0;
                                                if (i41 <= 0) {
                                                    r27 = z20;
                                                }
                                                c cVar18 = cVar8;
                                                if (cVar18.f25289f != null) {
                                                    cVar11.e(gVar9, gVar7, i41, i19);
                                                    cVar11.e(gVar9, cVar11.k(cVar18.f25289f), cVar18.e(), i19);
                                                    if (z24) {
                                                        cVar11.f(k15, cVar11.k(cVar10), i18, 5);
                                                    }
                                                    r27 = i18;
                                                } else if (this.f25305g0 == i19) {
                                                    cVar11.e(gVar9, gVar7, cVar18.e(), i19);
                                                    r27 = z20;
                                                } else {
                                                    cVar11.e(gVar9, gVar7, i41, i19);
                                                    r27 = z20;
                                                }
                                                boolean z37 = zArr3[z25 ? 1 : 0];
                                                int i42 = i18;
                                                int i43 = iArr[z25 ? 1 : 0];
                                                int i44 = this.Z;
                                                int i45 = this.f25298c0;
                                                int i46 = iArr3[z25 ? 1 : 0];
                                                float f10 = this.e0;
                                                int i47 = iArr[i42];
                                                boolean z38 = z25 ? 1 : 0;
                                                ?? r18 = z25;
                                                if (i47 != 3) {
                                                    r18 = i42;
                                                }
                                                gVar11 = gVar8;
                                                gVar10 = gVar7;
                                                cVar11 = cVar;
                                                d(cVar11, false, z24, z23, z37, k16, k15, i43, i39, this.J, this.L, i44, i40, i45, i46, f10, z35, r18, z16, z22, z3422, i14, i17, this.f25327x, this.f25328y, this.f25329z, r27);
                                            }
                                            if (z17) {
                                                if (this.A == 1) {
                                                    float f11 = this.B;
                                                    v.b l6 = cVar11.l();
                                                    l6.f24346d.g(gVar11, -1.0f);
                                                    l6.f24346d.g(gVar10, 1.0f);
                                                    l6.f24346d.g(gVar3, f11);
                                                    l6.f24346d.g(gVar2, -f11);
                                                    cVar11.c(l6);
                                                } else {
                                                    float f12 = this.B;
                                                    v.b l10 = cVar11.l();
                                                    l10.f24346d.g(gVar3, -1.0f);
                                                    l10.f24346d.g(gVar2, 1.0f);
                                                    l10.f24346d.g(gVar11, f12);
                                                    l10.f24346d.g(gVar10, -f12);
                                                    cVar11.c(l10);
                                                }
                                            }
                                            if (cVar9.h()) {
                                                c cVar19 = cVar9;
                                                d dVar9 = cVar19.f25289f.f25287d;
                                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                                int e7 = cVar19.e();
                                                v.g k17 = cVar11.k(i(2));
                                                v.g k18 = cVar11.k(i(3));
                                                v.g k19 = cVar11.k(i(4));
                                                v.g k20 = cVar11.k(i(5));
                                                v.g k21 = cVar11.k(dVar9.i(2));
                                                v.g k22 = cVar11.k(dVar9.i(3));
                                                v.g k23 = cVar11.k(dVar9.i(4));
                                                v.g k24 = cVar11.k(dVar9.i(5));
                                                v.b l11 = cVar11.l();
                                                double d10 = radians;
                                                double sin = Math.sin(d10);
                                                double d11 = e7;
                                                l11.f24346d.g(k22, 0.5f);
                                                l11.f24346d.g(k24, 0.5f);
                                                l11.f24346d.g(k18, -0.5f);
                                                l11.f24346d.g(k20, -0.5f);
                                                l11.f24344b = -((float) (sin * d11));
                                                cVar11.c(l11);
                                                v.b l12 = cVar11.l();
                                                float cos = (float) (Math.cos(d10) * d11);
                                                l12.f24346d.g(k21, 0.5f);
                                                l12.f24346d.g(k23, 0.5f);
                                                l12.f24346d.g(k17, -0.5f);
                                                l12.f24346d.g(k19, -0.5f);
                                                l12.f24344b = -cos;
                                                cVar11.c(l12);
                                            }
                                            this.f25310k = false;
                                            this.f25311l = false;
                                        }
                                    }
                                    gVar7 = gVar5;
                                    gVar8 = gVar6;
                                    gVar9 = gVar4;
                                    i18 = 0;
                                    i19 = 8;
                                    z25 = true;
                                    i20 = 1;
                                    if (this.f25319p == 2) {
                                    }
                                    if (i20 != 0) {
                                    }
                                    gVar10 = gVar7;
                                    gVar11 = gVar8;
                                    if (z17) {
                                    }
                                    if (cVar9.h()) {
                                    }
                                    this.f25310k = false;
                                    this.f25311l = false;
                                }
                                cVar8 = cVar6;
                                gVar2 = k6;
                                gVar3 = k9;
                                cVar9 = cVar7;
                                iArr3 = iArr2;
                                gVar4 = k12;
                                z22 = z15;
                                z23 = z12;
                                z24 = z31;
                                gVar5 = k10;
                                cVar10 = cVar5;
                                gVar6 = gVar;
                                i17 = i13;
                                zArr3 = zArr2;
                                if (z5) {
                                    eVar = lVar.f25520h;
                                    if (eVar.j) {
                                        int i382 = eVar.f25495g;
                                        gVar7 = gVar5;
                                        cVar11.d(gVar7, i382);
                                        gVar8 = gVar6;
                                        cVar11.d(gVar8, this.f25301e.f25521i.f25495g);
                                        gVar9 = gVar4;
                                        cVar11.d(gVar9, this.f25301e.f25505k.f25495g);
                                        dVar3 = this.T;
                                        if (dVar3 == null) {
                                        }
                                        i18 = 0;
                                        i19 = 8;
                                        z26 = true;
                                        i20 = i18;
                                        z25 = z26;
                                        if (this.f25319p == 2) {
                                        }
                                        if (i20 != 0) {
                                        }
                                        gVar10 = gVar7;
                                        gVar11 = gVar8;
                                        if (z17) {
                                        }
                                        if (cVar9.h()) {
                                        }
                                        this.f25310k = false;
                                        this.f25311l = false;
                                    }
                                }
                                gVar7 = gVar5;
                                gVar8 = gVar6;
                                gVar9 = gVar4;
                                i18 = 0;
                                i19 = 8;
                                z25 = true;
                                i20 = 1;
                                if (this.f25319p == 2) {
                                }
                                if (i20 != 0) {
                                }
                                gVar10 = gVar7;
                                gVar11 = gVar8;
                                if (z17) {
                                }
                                if (cVar9.h()) {
                                }
                                this.f25310k = false;
                                this.f25311l = false;
                            }
                        }
                        z18 = false;
                        if (z17) {
                        }
                        if (iArr[0] != 2) {
                        }
                        if (z19) {
                        }
                        cVar7 = this.P;
                        z20 = !cVar7.h();
                        c2 = '\b';
                        z21 = zArr4[0];
                        boolean z34222 = zArr4[1];
                        i16 = this.f25317o;
                        iArr2 = this.C;
                        if (i16 != 2) {
                            if (z5) {
                                eVar2 = jVar.f25520h;
                                if (eVar2.j) {
                                }
                                c2 = '\b';
                            }
                            d dVar52 = this.T;
                            if (dVar52 == null) {
                            }
                            d dVar62 = this.T;
                            if (dVar62 == null) {
                            }
                            z23 = z12;
                            i17 = i13;
                            z22 = z15;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            boolean z362 = z18;
                            gVar2 = k6;
                            z24 = z31;
                            gVar5 = k10;
                            gVar3 = k9;
                            cVar10 = cVar5;
                            gVar6 = gVar;
                            cVar8 = cVar6;
                            gVar4 = k12;
                            zArr3 = zArr2;
                            cVar11 = cVar;
                            d(cVar11, true, z23, z24, zArr2[0], k14, k13, iArr[0], z19, this.I, this.K, this.Y, i11, this.f25296b0, iArr2[0], this.f25300d0, z362, iArr[1] == 3, z22, z16, z21, i17, i14, this.f25324u, this.f25325v, this.f25326w, z20);
                            if (z5) {
                            }
                            gVar7 = gVar5;
                            gVar8 = gVar6;
                            gVar9 = gVar4;
                            i18 = 0;
                            i19 = 8;
                            z25 = true;
                            i20 = 1;
                            if (this.f25319p == 2) {
                            }
                            if (i20 != 0) {
                            }
                            gVar10 = gVar7;
                            gVar11 = gVar8;
                            if (z17) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f25310k = false;
                            this.f25311l = false;
                        }
                        cVar8 = cVar6;
                        gVar2 = k6;
                        gVar3 = k9;
                        cVar9 = cVar7;
                        iArr3 = iArr2;
                        gVar4 = k12;
                        z22 = z15;
                        z23 = z12;
                        z24 = z31;
                        gVar5 = k10;
                        cVar10 = cVar5;
                        gVar6 = gVar;
                        i17 = i13;
                        zArr3 = zArr2;
                        if (z5) {
                        }
                        gVar7 = gVar5;
                        gVar8 = gVar6;
                        gVar9 = gVar4;
                        i18 = 0;
                        i19 = 8;
                        z25 = true;
                        i20 = 1;
                        if (this.f25319p == 2) {
                        }
                        if (i20 != 0) {
                        }
                        gVar10 = gVar7;
                        gVar11 = gVar8;
                        if (z17) {
                        }
                        if (cVar9.h()) {
                        }
                        this.f25310k = false;
                        this.f25311l = false;
                    }
                    i13 = i35;
                    cVar6 = cVar2;
                    i12 = i29;
                    z17 = true;
                    i14 = i22;
                    int[] iArr5222 = this.f25323t;
                    iArr5222[0] = i13;
                    iArr5222[1] = i14;
                    if (z17) {
                    }
                    z18 = false;
                    if (z17) {
                    }
                    if (iArr[0] != 2) {
                    }
                    if (z19) {
                    }
                    cVar7 = this.P;
                    z20 = !cVar7.h();
                    c2 = '\b';
                    z21 = zArr4[0];
                    boolean z342222 = zArr4[1];
                    i16 = this.f25317o;
                    iArr2 = this.C;
                    if (i16 != 2) {
                    }
                    cVar8 = cVar6;
                    gVar2 = k6;
                    gVar3 = k9;
                    cVar9 = cVar7;
                    iArr3 = iArr2;
                    gVar4 = k12;
                    z22 = z15;
                    z23 = z12;
                    z24 = z31;
                    gVar5 = k10;
                    cVar10 = cVar5;
                    gVar6 = gVar;
                    i17 = i13;
                    zArr3 = zArr2;
                    if (z5) {
                    }
                    gVar7 = gVar5;
                    gVar8 = gVar6;
                    gVar9 = gVar4;
                    i18 = 0;
                    i19 = 8;
                    z25 = true;
                    i20 = 1;
                    if (this.f25319p == 2) {
                    }
                    if (i20 != 0) {
                    }
                    gVar10 = gVar7;
                    gVar11 = gVar8;
                    if (z17) {
                    }
                    if (cVar9.h()) {
                    }
                    this.f25310k = false;
                    this.f25311l = false;
                }
            } else {
                cVar5 = cVar15;
            }
            gVar = k11;
            cVar6 = cVar2;
            i12 = i29;
            i13 = i33;
            i14 = i34;
            z17 = false;
            int[] iArr52222 = this.f25323t;
            iArr52222[0] = i13;
            iArr52222[1] = i14;
            if (z17) {
            }
            z18 = false;
            if (z17) {
            }
            if (iArr[0] != 2) {
            }
            if (z19) {
            }
            cVar7 = this.P;
            z20 = !cVar7.h();
            c2 = '\b';
            z21 = zArr4[0];
            boolean z3422222 = zArr4[1];
            i16 = this.f25317o;
            iArr2 = this.C;
            if (i16 != 2) {
            }
            cVar8 = cVar6;
            gVar2 = k6;
            gVar3 = k9;
            cVar9 = cVar7;
            iArr3 = iArr2;
            gVar4 = k12;
            z22 = z15;
            z23 = z12;
            z24 = z31;
            gVar5 = k10;
            cVar10 = cVar5;
            gVar6 = gVar;
            i17 = i13;
            zArr3 = zArr2;
            if (z5) {
            }
            gVar7 = gVar5;
            gVar8 = gVar6;
            gVar9 = gVar4;
            i18 = 0;
            i19 = 8;
            z25 = true;
            i20 = 1;
            if (this.f25319p == 2) {
            }
            if (i20 != 0) {
            }
            gVar10 = gVar7;
            gVar11 = gVar8;
            if (z17) {
            }
            if (cVar9.h()) {
            }
            this.f25310k = false;
            this.f25311l = false;
        }
        z7 = false;
        z10 = z7 ? 1 : 0;
        z11 = z10;
        r17 = z7;
        i5 = this.f25305g0;
        boolean[] zArr42 = this.S;
        boolean z292 = z10;
        if (i5 != 8) {
        }
        z13 = this.f25310k;
        if (!z13) {
        }
        if (z13) {
        }
        if (this.f25311l) {
        }
        if (this.f25310k) {
            boolean z302 = r17;
            this.f25310k = z302;
            this.f25311l = z302;
            return;
        }
        zArr = this.f25302f;
        if (z5) {
        }
        cVar2 = cVar16;
        zArr2 = zArr;
        if (this.T == null) {
        }
        i10 = this.U;
        i11 = this.f25296b0;
        if (i10 >= i11) {
        }
        int i272 = this.V;
        c cVar172 = cVar4;
        int i282 = this.f25298c0;
        if (i272 >= i282) {
        }
        iArr = this.f25320p0;
        int i302 = iArr[0];
        boolean z312 = z14;
        if (i302 == 3) {
        }
        int i312 = iArr[1];
        if (i312 == 3) {
        }
        int i322 = this.X;
        this.A = i322;
        f6 = this.W;
        this.B = f6;
        int i332 = this.f25321r;
        int i342 = this.f25322s;
        if (f6 <= 0.0f) {
        }
        gVar = k11;
        cVar6 = cVar2;
        i12 = i29;
        i13 = i332;
        i14 = i342;
        z17 = false;
        int[] iArr522222 = this.f25323t;
        iArr522222[0] = i13;
        iArr522222[1] = i14;
        if (z17) {
        }
        z18 = false;
        if (z17) {
        }
        if (iArr[0] != 2) {
        }
        if (z19) {
        }
        cVar7 = this.P;
        z20 = !cVar7.h();
        c2 = '\b';
        z21 = zArr42[0];
        boolean z34222222 = zArr42[1];
        i16 = this.f25317o;
        iArr2 = this.C;
        if (i16 != 2) {
        }
        cVar8 = cVar6;
        gVar2 = k6;
        gVar3 = k9;
        cVar9 = cVar7;
        iArr3 = iArr2;
        gVar4 = k12;
        z22 = z15;
        z23 = z12;
        z24 = z312;
        gVar5 = k10;
        cVar10 = cVar5;
        gVar6 = gVar;
        i17 = i13;
        zArr3 = zArr2;
        if (z5) {
        }
        gVar7 = gVar5;
        gVar8 = gVar6;
        gVar9 = gVar4;
        i18 = 0;
        i19 = 8;
        z25 = true;
        i20 = 1;
        if (this.f25319p == 2) {
        }
        if (i20 != 0) {
        }
        gVar10 = gVar7;
        gVar11 = gVar8;
        if (z17) {
        }
        if (cVar9.h()) {
        }
        this.f25310k = false;
        this.f25311l = false;
    }

    public boolean c() {
        return this.f25305g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(v.c cVar, boolean z5, boolean z7, boolean z10, boolean z11, v.g gVar, v.g gVar2, int i5, boolean z12, c cVar2, c cVar3, int i10, int i11, int i12, int i13, float f6, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i14, int i15, int i16, int i17, float f10, boolean z18) {
        boolean z19;
        boolean z20;
        int i18;
        boolean z21;
        boolean z22;
        int i19;
        int i20;
        boolean z23;
        v.g k6;
        v.g k9;
        c cVar4;
        v.g gVar3;
        boolean z24;
        int i21;
        v.g gVar4;
        v.g gVar5;
        v.g gVar6;
        v.g gVar7;
        int i22;
        int i23;
        int i24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        d dVar;
        int i25;
        int i26;
        c cVar5;
        boolean z29;
        int i27;
        boolean z30;
        int i28;
        int i29;
        HashSet hashSet;
        boolean z31;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z32;
        boolean z33;
        int i35;
        v.c cVar6 = cVar;
        int i36 = i16;
        int i37 = i17;
        v.g k10 = cVar6.k(cVar2);
        v.g k11 = cVar6.k(cVar3);
        v.g k12 = cVar6.k(cVar2.f25289f);
        v.g k13 = cVar6.k(cVar3.f25289f);
        boolean h10 = cVar2.h();
        boolean h11 = cVar3.h();
        boolean h12 = this.P.h();
        int i38 = h11 ? (h10 ? 1 : 0) + 1 : h10 ? 1 : 0;
        if (h12) {
            i38++;
        }
        int i39 = i38;
        int i40 = z13 ? 3 : i14;
        int d10 = v.f.d(i5);
        boolean z34 = (d10 == 0 || d10 == 1 || d10 != 2 || i40 == 4) ? false : true;
        int i41 = this.f25306h;
        if (i41 == -1 || !z5) {
            i41 = i11;
            z19 = z34;
        } else {
            this.f25306h = -1;
            z19 = false;
        }
        int i42 = this.f25308i;
        if (i42 == -1 || z5) {
            z20 = z19;
        } else {
            this.f25308i = -1;
            i41 = i42;
            z20 = false;
        }
        boolean z35 = z20;
        if (this.f25305g0 == 8) {
            z21 = false;
            i18 = 0;
        } else {
            i18 = i41;
            z21 = z35;
        }
        if (z18) {
            if (!h10 && !h11 && !h12) {
                cVar6.d(k10, i10);
            } else if (h10 && !h11) {
                z22 = z21;
                i19 = 8;
                cVar6.e(k10, k12, cVar2.e(), 8);
            }
            z22 = z21;
            i19 = 8;
        } else {
            z22 = z21;
            i19 = 8;
        }
        if (z22) {
            if (i39 == 2 || z13 || !(i40 == 1 || i40 == 0)) {
                if (i36 == -2) {
                    i36 = i18;
                }
                if (i37 == -2) {
                    i37 = i18;
                }
                if (i18 > 0 && i40 != 1) {
                    i18 = 0;
                }
                if (i36 > 0) {
                    cVar6.f(k11, k10, i36, 8);
                    i18 = Math.max(i18, i36);
                }
                if (i37 > 0) {
                    if (!z7 || i40 != 1) {
                        cVar6.g(k11, k10, i37, 8);
                    }
                    i18 = Math.min(i18, i37);
                }
                if (i40 == 1) {
                    if (z7) {
                        cVar6.e(k11, k10, i18, 8);
                    } else if (z15) {
                        cVar6.e(k11, k10, i18, 5);
                        cVar6.g(k11, k10, i18, 8);
                    } else {
                        cVar6.e(k11, k10, i18, 5);
                        cVar6.g(k11, k10, i18, 8);
                    }
                } else if (i40 == 2) {
                    int i43 = cVar2.f25288e;
                    if (i43 == 3 || i43 == 5) {
                        k6 = cVar6.k(this.T.i(3));
                        k9 = cVar6.k(this.T.i(5));
                    } else {
                        k6 = cVar6.k(this.T.i(2));
                        k9 = cVar6.k(this.T.i(4));
                    }
                    v.b l6 = cVar6.l();
                    int i44 = i36;
                    l6.f24346d.g(k11, -1.0f);
                    l6.f24346d.g(k10, 1.0f);
                    l6.f24346d.g(k9, f10);
                    l6.f24346d.g(k6, -f10);
                    cVar6.c(l6);
                    if (z7) {
                        z22 = false;
                    }
                    z23 = z11;
                    i20 = i44;
                } else {
                    i20 = i36;
                    z23 = true;
                }
            } else {
                int max = Math.max(i36, i18);
                if (i37 > 0) {
                    max = Math.min(i37, max);
                }
                cVar6.e(k11, k10, max, 8);
                z23 = z11;
                i20 = i36;
                z22 = false;
            }
            if (z18 || z15) {
                boolean z36 = z23;
                if (i39 >= 2 && z7 && z36) {
                    cVar6.f(k10, gVar, 0, 8);
                    c cVar7 = this.M;
                    boolean z37 = z5 || cVar7.f25289f == null;
                    if (!z5 && (cVar4 = cVar7.f25289f) != null) {
                        d dVar2 = cVar4.f25287d;
                        if (dVar2.W != 0.0f) {
                            int[] iArr = dVar2.f25320p0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z37 = true;
                            }
                        }
                        z37 = false;
                    }
                    if (z37) {
                        cVar6.f(gVar2, k11, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h10 && !h11 && !h12) {
                cVar5 = cVar3;
                gVar6 = k11;
                z24 = z23;
                gVar3 = k13;
            } else if (!h10 || h11) {
                if (h10 || !h11) {
                    gVar3 = k13;
                    if (h10 && h11) {
                        d dVar3 = cVar2.f25289f.f25287d;
                        d dVar4 = cVar3.f25289f.f25287d;
                        z24 = z23;
                        d dVar5 = this.T;
                        int i45 = 6;
                        if (z22) {
                            if (i40 == 0) {
                                if (i37 != 0 || i20 != 0) {
                                    i33 = 5;
                                    i34 = 5;
                                    z32 = true;
                                    z33 = false;
                                    z26 = true;
                                } else if (k12.f24373f && gVar3.f24373f) {
                                    cVar6.e(k10, k12, cVar2.e(), 8);
                                    cVar6.e(k11, gVar3, -cVar3.e(), 8);
                                    return;
                                } else {
                                    i33 = 8;
                                    i34 = 8;
                                    z32 = false;
                                    z33 = true;
                                    z26 = false;
                                }
                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                    cVar6 = cVar;
                                    i21 = i40;
                                    gVar5 = k10;
                                    gVar6 = k11;
                                    z27 = z33;
                                    gVar4 = gVar2;
                                    i23 = i33;
                                    gVar7 = k12;
                                    i22 = 6;
                                    z25 = z32;
                                    i24 = 4;
                                    if (z26 || gVar7 != gVar3 || dVar3 == dVar5) {
                                        z28 = true;
                                    } else {
                                        z26 = false;
                                        z28 = false;
                                    }
                                    if (z25) {
                                        dVar = dVar4;
                                        i25 = i20;
                                        i26 = i21;
                                        cVar5 = cVar3;
                                        z29 = z7;
                                    } else {
                                        if (z22 || z14 || z16 || gVar7 != gVar || gVar3 != gVar4) {
                                            z29 = z7;
                                            z31 = z28;
                                            i30 = i23;
                                        } else {
                                            i22 = 8;
                                            z29 = false;
                                            i30 = 8;
                                            z31 = false;
                                        }
                                        v.g gVar8 = gVar7;
                                        i25 = i20;
                                        i26 = i21;
                                        dVar = dVar4;
                                        cVar5 = cVar3;
                                        cVar6.b(gVar5, gVar8, cVar2.e(), f6, gVar3, gVar6, cVar3.e(), i22);
                                        gVar7 = gVar8;
                                        i23 = i30;
                                        z28 = z31;
                                    }
                                    if (this.f25305g0 != 8 && ((hashSet = cVar5.f25284a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z26) {
                                        if (z29 && gVar7 != gVar3 && !z22 && ((dVar3 instanceof a) || (dVar instanceof a))) {
                                            i23 = 6;
                                        }
                                        cVar6.f(gVar5, gVar7, cVar2.e(), i23);
                                        cVar6.g(gVar6, gVar3, -cVar5.e(), i23);
                                    }
                                    if (z29 || !z17 || (dVar3 instanceof a) || (dVar instanceof a) || dVar == dVar5) {
                                        i27 = i24;
                                        z30 = z28;
                                    } else {
                                        i27 = 6;
                                        i23 = 6;
                                        z30 = true;
                                    }
                                    if (z30) {
                                        if (z27 && (!z16 || z10)) {
                                            if (dVar3 != dVar5 && dVar != dVar5) {
                                                i45 = i27;
                                            }
                                            if ((dVar3 instanceof h) || (dVar instanceof h)) {
                                                i45 = 5;
                                            }
                                            if ((dVar3 instanceof a) || (dVar instanceof a)) {
                                                i45 = 5;
                                            }
                                            i27 = Math.max(z16 ? 5 : i45, i27);
                                        }
                                        if (z29) {
                                            i27 = Math.min(i23, i27);
                                            if (z13 && !z16 && (dVar3 == dVar5 || dVar == dVar5)) {
                                                i29 = 4;
                                                cVar6.e(gVar5, gVar7, cVar2.e(), i29);
                                                cVar6.e(gVar6, gVar3, -cVar5.e(), i29);
                                            }
                                        }
                                        i29 = i27;
                                        cVar6.e(gVar5, gVar7, cVar2.e(), i29);
                                        cVar6.e(gVar6, gVar3, -cVar5.e(), i29);
                                    }
                                    if (z29) {
                                        int e7 = gVar == gVar7 ? cVar2.e() : 0;
                                        if (gVar7 != gVar) {
                                            cVar6.f(gVar5, gVar, e7, 5);
                                        }
                                    }
                                    if (z29 && z22 && i12 == 0 && i25 == 0) {
                                        if (z22 || i26 != 3) {
                                            i28 = 5;
                                            cVar6.f(gVar6, gVar5, 0, 5);
                                        } else {
                                            cVar6.f(gVar6, gVar5, 0, 8);
                                        }
                                    }
                                    i28 = 5;
                                } else {
                                    cVar6 = cVar;
                                    gVar5 = k10;
                                    gVar6 = k11;
                                    z27 = z33;
                                    i23 = i33;
                                    gVar7 = k12;
                                    i22 = 6;
                                    z25 = z32;
                                    i24 = i34;
                                    i21 = i40;
                                    gVar4 = gVar2;
                                    if (z26) {
                                    }
                                    z28 = true;
                                    if (z25) {
                                    }
                                    if (this.f25305g0 != 8) {
                                    }
                                    if (z26) {
                                    }
                                    if (z29) {
                                    }
                                    i27 = i24;
                                    z30 = z28;
                                    if (z30) {
                                    }
                                    if (z29) {
                                    }
                                    if (z29) {
                                        if (z22) {
                                        }
                                        i28 = 5;
                                        cVar6.f(gVar6, gVar5, 0, 5);
                                    }
                                    i28 = 5;
                                }
                            } else {
                                if (i40 == 2) {
                                    if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                        cVar6 = cVar;
                                        i21 = i40;
                                        gVar5 = k10;
                                        gVar6 = k11;
                                        gVar7 = k12;
                                        i22 = 6;
                                        i23 = 5;
                                    } else {
                                        cVar6 = cVar;
                                        i21 = i40;
                                        gVar5 = k10;
                                        gVar6 = k11;
                                        gVar7 = k12;
                                        i22 = 6;
                                        i23 = 5;
                                        i24 = 5;
                                        z25 = true;
                                        z26 = true;
                                        z27 = false;
                                        gVar4 = gVar2;
                                        if (z26) {
                                        }
                                        z28 = true;
                                        if (z25) {
                                        }
                                        if (this.f25305g0 != 8) {
                                        }
                                        if (z26) {
                                        }
                                        if (z29) {
                                        }
                                        i27 = i24;
                                        z30 = z28;
                                        if (z30) {
                                        }
                                        if (z29) {
                                        }
                                        if (z29) {
                                        }
                                        i28 = 5;
                                    }
                                } else if (i40 == 1) {
                                    cVar6 = cVar;
                                    i21 = i40;
                                    gVar5 = k10;
                                    gVar6 = k11;
                                    gVar7 = k12;
                                    i22 = 6;
                                    i23 = 8;
                                } else if (i40 == 3) {
                                    i21 = i40;
                                    if (this.A != -1) {
                                        if (z13) {
                                            if (i15 == 2 || i15 == 1) {
                                                i31 = 5;
                                                i32 = 4;
                                            } else {
                                                i31 = 8;
                                                i32 = 5;
                                            }
                                            i24 = i32;
                                            gVar5 = k10;
                                            gVar6 = k11;
                                            gVar7 = k12;
                                            i22 = 6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            gVar4 = gVar2;
                                        } else if (i37 > 0) {
                                            cVar6 = cVar;
                                            gVar4 = gVar2;
                                            gVar5 = k10;
                                            gVar6 = k11;
                                            gVar7 = k12;
                                            i22 = 6;
                                            i23 = 5;
                                        } else {
                                            if (i37 != 0 || i20 != 0) {
                                                cVar6 = cVar;
                                                gVar4 = gVar2;
                                                gVar5 = k10;
                                                gVar6 = k11;
                                                gVar7 = k12;
                                                i22 = 6;
                                                i23 = 5;
                                                i24 = 4;
                                            } else if (z16) {
                                                i31 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                gVar4 = gVar2;
                                                gVar5 = k10;
                                                gVar6 = k11;
                                                gVar7 = k12;
                                                i22 = 6;
                                                i24 = 4;
                                                z25 = true;
                                                z26 = true;
                                                z27 = true;
                                            } else {
                                                cVar6 = cVar;
                                                gVar4 = gVar2;
                                                gVar5 = k10;
                                                gVar6 = k11;
                                                gVar7 = k12;
                                                i22 = 6;
                                                i23 = 5;
                                                i24 = 8;
                                            }
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            if (z26) {
                                            }
                                            z28 = true;
                                            if (z25) {
                                            }
                                            if (this.f25305g0 != 8) {
                                            }
                                            if (z26) {
                                            }
                                            if (z29) {
                                            }
                                            i27 = i24;
                                            z30 = z28;
                                            if (z30) {
                                            }
                                            if (z29) {
                                            }
                                            if (z29) {
                                            }
                                            i28 = 5;
                                        }
                                        i23 = i31;
                                        cVar6 = cVar;
                                        if (z26) {
                                        }
                                        z28 = true;
                                        if (z25) {
                                        }
                                        if (this.f25305g0 != 8) {
                                        }
                                        if (z26) {
                                        }
                                        if (z29) {
                                        }
                                        i27 = i24;
                                        z30 = z28;
                                        if (z30) {
                                        }
                                        if (z29) {
                                        }
                                        if (z29) {
                                        }
                                        i28 = 5;
                                    } else if (z16) {
                                        cVar6 = cVar;
                                        gVar4 = gVar2;
                                        gVar5 = k10;
                                        gVar6 = k11;
                                        gVar7 = k12;
                                        i23 = 8;
                                        i22 = z7 ? 5 : 4;
                                    } else {
                                        cVar6 = cVar;
                                        gVar4 = gVar2;
                                        gVar5 = k10;
                                        gVar6 = k11;
                                        gVar7 = k12;
                                        i23 = 8;
                                        i22 = 8;
                                    }
                                    i24 = 5;
                                    z25 = true;
                                    z26 = true;
                                    z27 = true;
                                    if (z26) {
                                    }
                                    z28 = true;
                                    if (z25) {
                                    }
                                    if (this.f25305g0 != 8) {
                                    }
                                    if (z26) {
                                    }
                                    if (z29) {
                                    }
                                    i27 = i24;
                                    z30 = z28;
                                    if (z30) {
                                    }
                                    if (z29) {
                                    }
                                    if (z29) {
                                    }
                                    i28 = 5;
                                } else {
                                    i21 = i40;
                                    cVar6 = cVar;
                                    gVar4 = gVar2;
                                    gVar5 = k10;
                                    gVar6 = k11;
                                    gVar7 = k12;
                                    i22 = 6;
                                    i23 = 5;
                                    i24 = 4;
                                    z25 = false;
                                    z26 = false;
                                }
                                i24 = 4;
                                z25 = true;
                                z26 = true;
                                z27 = false;
                                gVar4 = gVar2;
                                if (z26) {
                                }
                                z28 = true;
                                if (z25) {
                                }
                                if (this.f25305g0 != 8) {
                                }
                                if (z26) {
                                }
                                if (z29) {
                                }
                                i27 = i24;
                                z30 = z28;
                                if (z30) {
                                }
                                if (z29) {
                                }
                                if (z29) {
                                }
                                i28 = 5;
                            }
                            i35 = i28;
                            if (z29 && z24) {
                                int e9 = cVar5.f25289f != null ? cVar5.e() : 0;
                                if (gVar3 != gVar2) {
                                    cVar6.f(gVar2, gVar6, e9, i35);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i21 = i40;
                        if (k12.f24373f && gVar3.f24373f) {
                            cVar.b(k10, k12, cVar2.e(), f6, gVar3, k11, cVar3.e(), 8);
                            if (z7 && z24) {
                                int e10 = cVar3.f25289f != null ? cVar3.e() : 0;
                                if (gVar3 != gVar2) {
                                    cVar.f(gVar2, k11, e10, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cVar6 = cVar;
                        gVar4 = gVar2;
                        gVar5 = k10;
                        gVar6 = k11;
                        gVar7 = k12;
                        i22 = 6;
                        i23 = 5;
                        i24 = 4;
                        z25 = true;
                        z26 = true;
                        z27 = false;
                        if (z26) {
                        }
                        z28 = true;
                        if (z25) {
                        }
                        if (this.f25305g0 != 8) {
                        }
                        if (z26) {
                        }
                        if (z29) {
                        }
                        i27 = i24;
                        z30 = z28;
                        if (z30) {
                        }
                        if (z29) {
                        }
                        if (z29) {
                        }
                        i28 = 5;
                        i35 = i28;
                        if (z29) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    gVar3 = k13;
                    cVar6.e(k11, gVar3, -cVar3.e(), 8);
                    if (z7) {
                        cVar6.f(k10, gVar, 0, 5);
                        cVar5 = cVar3;
                        i28 = 5;
                        gVar6 = k11;
                        z24 = z23;
                        z29 = z7;
                        i35 = i28;
                        if (z29) {
                        }
                    }
                }
                cVar5 = cVar3;
                gVar6 = k11;
                z24 = z23;
            } else {
                cVar5 = cVar3;
                gVar6 = k11;
                z24 = z23;
                gVar3 = k13;
                z29 = z7;
                i35 = (z7 && (cVar2.f25289f.f25287d instanceof a)) ? 8 : 5;
                if (z29) {
                }
            }
            i28 = 5;
            z29 = z7;
            i35 = i28;
            if (z29) {
            }
        } else if (z12) {
            cVar6.e(k11, k10, 0, 3);
            if (i12 > 0) {
                cVar6.f(k11, k10, i12, i19);
            }
            if (i13 < Integer.MAX_VALUE) {
                cVar6.g(k11, k10, i13, i19);
            }
        } else {
            cVar6.e(k11, k10, i18, i19);
        }
        z23 = z11;
        i20 = i36;
        if (z18) {
        }
        boolean z362 = z23;
        if (i39 >= 2) {
        }
    }

    public final void e(int i5, d dVar, int i10, int i11) {
        boolean z5;
        if (i5 == 7) {
            if (i10 != 7) {
                if (i10 == 2 || i10 == 4) {
                    e(2, dVar, i10, 0);
                    e(4, dVar, i10, 0);
                    i(7).a(dVar.i(i10), 0);
                    return;
                } else {
                    if (i10 == 3 || i10 == 5) {
                        e(3, dVar, i10, 0);
                        e(5, dVar, i10, 0);
                        i(7).a(dVar.i(i10), 0);
                        return;
                    }
                    return;
                }
            }
            c i12 = i(2);
            c i13 = i(4);
            c i14 = i(3);
            c i15 = i(5);
            boolean z7 = true;
            if ((i12 == null || !i12.h()) && (i13 == null || !i13.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i14 == null || !i14.h()) && (i15 == null || !i15.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z7 = false;
            }
            if (z5 && z7) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z5) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z7) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i5 == 8 && (i10 == 2 || i10 == 4)) {
            c i16 = i(2);
            c i17 = dVar.i(i10);
            c i18 = i(4);
            i16.a(i17, 0);
            i18.a(i17, 0);
            i(8).a(i17, 0);
            return;
        }
        if (i5 == 9 && (i10 == 3 || i10 == 5)) {
            c i19 = dVar.i(i10);
            i(3).a(i19, 0);
            i(5).a(i19, 0);
            i(9).a(i19, 0);
            return;
        }
        if (i5 == 8 && i10 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i10), 0);
            return;
        }
        if (i5 == 9 && i10 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i10), 0);
            return;
        }
        c i20 = i(i5);
        c i21 = dVar.i(i10);
        if (i20.i(i21)) {
            if (i5 == 6) {
                c i22 = i(3);
                c i23 = i(5);
                if (i22 != null) {
                    i22.j();
                }
                if (i23 != null) {
                    i23.j();
                }
            } else if (i5 == 3 || i5 == 5) {
                c i24 = i(6);
                if (i24 != null) {
                    i24.j();
                }
                c i25 = i(7);
                if (i25.f25289f != i21) {
                    i25.j();
                }
                c f6 = i(i5).f();
                c i26 = i(9);
                if (i26.h()) {
                    f6.j();
                    i26.j();
                }
            } else if (i5 == 2 || i5 == 4) {
                c i27 = i(7);
                if (i27.f25289f != i21) {
                    i27.j();
                }
                c f10 = i(i5).f();
                c i28 = i(8);
                if (i28.h()) {
                    f10.j();
                    i28.j();
                }
            }
            i20.a(i21, i11);
        }
    }

    public final void f(c cVar, c cVar2, int i5) {
        if (cVar.f25287d == this) {
            e(cVar.f25288e, cVar2.f25287d, cVar2.f25288e, i5);
        }
    }

    public final void g(v.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f25294a0 > 0) {
            cVar.k(this.M);
        }
    }

    public final void h() {
        if (this.f25299d == null) {
            y.j jVar = new y.j(this);
            jVar.f25520h.f25493e = 4;
            jVar.f25521i.f25493e = 5;
            jVar.f25518f = 0;
            this.f25299d = jVar;
        }
        if (this.f25301e == null) {
            l lVar = new l(this);
            y.e eVar = new y.e(lVar);
            lVar.f25505k = eVar;
            lVar.f25506l = null;
            lVar.f25520h.f25493e = 6;
            lVar.f25521i.f25493e = 7;
            eVar.f25493e = 8;
            lVar.f25518f = 1;
            this.f25301e = lVar;
        }
    }

    public c i(int i5) {
        switch (v.f.d(i5)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(k.t(i5));
        }
    }

    public final int j(int i5) {
        int[] iArr = this.f25320p0;
        if (i5 == 0) {
            return iArr[0];
        }
        if (i5 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f25305g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i5) {
        c cVar;
        c cVar2;
        if (i5 != 0) {
            if (i5 == 1 && (cVar2 = (cVar = this.L).f25289f) != null && cVar2.f25289f == cVar) {
                return cVar2.f25287d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f25289f;
        if (cVar4 == null || cVar4.f25289f != cVar3) {
            return null;
        }
        return cVar4.f25287d;
    }

    public final d m(int i5) {
        c cVar;
        c cVar2;
        if (i5 != 0) {
            if (i5 == 1 && (cVar2 = (cVar = this.J).f25289f) != null && cVar2.f25289f == cVar) {
                return cVar2.f25287d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f25289f;
        if (cVar4 == null || cVar4.f25289f != cVar3) {
            return null;
        }
        return cVar4.f25287d;
    }

    public void n(StringBuilder sb2) {
        sb2.append("  " + this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.V);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.Z);
        sb2.append("\n");
        p(sb2, "left", this.I);
        p(sb2, "top", this.J);
        p(sb2, "right", this.K);
        p(sb2, "bottom", this.L);
        p(sb2, "baseline", this.M);
        p(sb2, "centerX", this.N);
        p(sb2, "centerY", this.O);
        int i5 = this.U;
        int i10 = this.f25296b0;
        int[] iArr = this.C;
        int i11 = iArr[0];
        int i12 = this.f25324u;
        int i13 = this.f25321r;
        float f6 = this.f25326w;
        int[] iArr2 = this.f25320p0;
        int i14 = iArr2[0];
        float[] fArr = this.k0;
        float f10 = fArr[0];
        o(sb2, "    width", i5, i10, i11, i12, i13, f6, i14);
        int i15 = this.V;
        int i16 = this.f25298c0;
        int i17 = iArr[1];
        int i18 = this.f25327x;
        int i19 = this.f25322s;
        float f11 = this.f25329z;
        int i20 = iArr2[1];
        float f12 = fArr[1];
        o(sb2, "    height", i15, i16, i17, i18, i19, f11, i20);
        float f13 = this.W;
        int i21 = this.X;
        if (f13 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f13);
            sb2.append(StringUtils.COMMA);
            sb2.append(i21);
            sb2.append("");
            sb2.append("],\n");
        }
        H(sb2, "    horizontalBias", this.f25300d0, 0.5f);
        H(sb2, "    verticalBias", this.e0, 0.5f);
        G(this.f25309i0, 0, "    horizontalChainStyle", sb2);
        G(this.j0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int q() {
        if (this.f25305g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).x0 + this.Y;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f25337y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i5) {
        if (i5 == 0) {
            return (this.I.f25289f != null ? 1 : 0) + (this.K.f25289f != null ? 1 : 0) < 2;
        }
        if ((this.J.f25289f != null ? 1 : 0) + (this.L.f25289f != null ? 1 : 0) + (this.M.f25289f != null ? 1 : 0) < 2) {
        }
    }

    public String toString() {
        StringBuilder b10 = v.f.b("");
        b10.append(this.f25307h0 != null ? d9.e.l(new StringBuilder("id: "), this.f25307h0, " ") : "");
        b10.append("(");
        b10.append(this.Y);
        b10.append(", ");
        b10.append(this.Z);
        b10.append(") - (");
        b10.append(this.U);
        b10.append(" x ");
        return k.n(b10, this.V, ")");
    }

    public final boolean u(int i5, int i10) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i5 == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f25289f;
            if (cVar6 == null || !cVar6.f25286c || (cVar4 = (cVar3 = this.K).f25289f) == null || !cVar4.f25286c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f25289f.d()) >= i10;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f25289f;
        if (cVar8 == null || !cVar8.f25286c || (cVar2 = (cVar = this.L).f25289f) == null || !cVar2.f25286c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f25289f.d()) >= i10;
    }

    public final void v(int i5, int i10, int i11, int i12, d dVar) {
        i(i5).b(dVar.i(i10), i11, i12, true);
    }

    public final boolean w(int i5) {
        c cVar;
        c cVar2;
        int i10 = i5 * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i10];
        c cVar4 = cVar3.f25289f;
        return (cVar4 == null || cVar4.f25289f == cVar3 || (cVar2 = (cVar = cVarArr[i10 + 1]).f25289f) == null || cVar2.f25289f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f25289f;
        if (cVar2 != null && cVar2.f25289f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f25289f;
        return cVar4 != null && cVar4.f25289f == cVar3;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f25289f;
        if (cVar2 != null && cVar2.f25289f == cVar) {
            return true;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f25289f;
        return cVar4 != null && cVar4.f25289f == cVar3;
    }

    public final boolean z() {
        return this.f25304g && this.f25305g0 != 8;
    }
}
