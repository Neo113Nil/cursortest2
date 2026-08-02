package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class wm3 {
    public float A;
    public int B;
    public float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final nl3 J;
    public final nl3 K;
    public final nl3 L;
    public final nl3 M;
    public final nl3 N;
    public final nl3 O;
    public final nl3 P;
    public final nl3 Q;
    public final nl3[] R;
    public final ArrayList S;
    public final boolean[] T;
    public xm3 U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public bn2 b;
    public int b0;
    public bn2 c;
    public int c0;
    public mf9 d;
    public int d0;
    public uok e;
    public float e0;
    public final boolean[] f;
    public float f0;
    public boolean g;
    public Object g0;
    public int h;
    public int h0;
    public int i;
    public String i0;
    public final j7l j;
    public int j0;
    public String k;
    public int k0;
    public boolean l;
    public final float[] l0;
    public boolean m;
    public final wm3[] m0;
    public boolean n;
    public final wm3[] n0;
    public boolean o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public final int[] q0;
    public int r;
    public int s;
    public int t;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    public wm3() {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new j7l(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        nl3 nl3Var = new nl3(this, 2);
        this.J = nl3Var;
        nl3 nl3Var2 = new nl3(this, 3);
        this.K = nl3Var2;
        nl3 nl3Var3 = new nl3(this, 4);
        this.L = nl3Var3;
        nl3 nl3Var4 = new nl3(this, 5);
        this.M = nl3Var4;
        nl3 nl3Var5 = new nl3(this, 6);
        this.N = nl3Var5;
        this.O = new nl3(this, 8);
        this.P = new nl3(this, 9);
        nl3 nl3Var6 = new nl3(this, 7);
        this.Q = nl3Var6;
        this.R = new nl3[]{nl3Var, nl3Var3, nl3Var2, nl3Var4, nl3Var5, nl3Var6};
        this.S = new ArrayList();
        this.T = new boolean[2];
        this.q0 = new int[]{1, 1};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        this.h0 = 0;
        this.i0 = null;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = new float[]{-1.0f, -1.0f};
        this.m0 = new wm3[]{null, null};
        this.n0 = new wm3[]{null, null};
        this.o0 = -1;
        this.p0 = -1;
        a();
    }

    public static void H(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        w1l.q(i, str, " :   ", ",\n", sb);
    }

    public static void I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void p(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            bf3.v(sb, "      behavior", " :   ", str2, ",\n");
        }
        H(i, 0, "      size", sb);
        H(i2, 0, "      min", sb);
        H(i3, Integer.MAX_VALUE, "      max", sb);
        H(i4, 0, "      matchMin", sb);
        H(i5, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, nl3 nl3Var) {
        if (nl3Var.f == null) {
            return;
        }
        wt3.A("    ", str, sb, " : [ '");
        sb.append(nl3Var.f);
        sb.append("'");
        if (nl3Var.h != Integer.MIN_VALUE || nl3Var.g != 0) {
            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            sb.append(nl3Var.g);
            if (nl3Var.h != Integer.MIN_VALUE) {
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                sb.append(nl3Var.h);
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        return this.g && this.h0 != 8;
    }

    public boolean B() {
        if (this.l) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean C() {
        if (this.m) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public void D() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.U = null;
        this.E = Float.NaN;
        this.V = 0;
        this.W = 0;
        this.X = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        int[] iArr = this.q0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.g0 = null;
        this.h0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        float[] fArr = this.l0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void E() {
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((nl3) arrayList.get(i)).j();
        }
    }

    public final void F() {
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nl3 nl3Var = (nl3) arrayList.get(i);
            nl3Var.c = false;
            nl3Var.b = 0;
        }
    }

    public void G(ejg ejgVar) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void J(int i) {
        this.b0 = i;
        this.F = i > 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public final void K(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.X = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = i;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && parseFloat2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.X = f;
            this.Y = i2;
        }
    }

    public final void L(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        this.l = true;
    }

    public final void M(int i, int i2) {
        if (this.m) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        if (this.F) {
            this.N.l(i + this.b0);
        }
        this.m = true;
    }

    public final void N(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public final void O(int i) {
        this.q0[0] = i;
    }

    public final void P(int i, float f, int i2, int i3) {
        this.s = i;
        this.v = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.w = i3;
        this.x = f;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 1.0f || i != 0) {
            return;
        }
        this.s = 2;
    }

    public final void Q(int i) {
        this.q0[1] = i;
    }

    public final void R(int i, float f, int i2, int i3) {
        this.t = i;
        this.y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.z = i3;
        this.A = f;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 1.0f || i != 0) {
            return;
        }
        this.t = 2;
    }

    public final void S(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public void T(boolean z, boolean z2) {
        int i;
        int i2;
        mf9 mf9Var = this.d;
        boolean z3 = z & mf9Var.g;
        uok uokVar = this.e;
        boolean z4 = z2 & uokVar.g;
        int i3 = mf9Var.h.g;
        int i4 = uokVar.h.g;
        int i5 = mf9Var.i.g;
        int i6 = uokVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Z = i3;
        }
        if (z4) {
            this.a0 = i4;
        }
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        int[] iArr = this.q0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.V)) {
                i8 = i2;
            }
            this.V = i8;
            int i10 = this.c0;
            if (i8 < i10) {
                this.V = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.W)) {
                i9 = i;
            }
            this.W = i9;
            int i11 = this.d0;
            if (i9 < i11) {
                this.W = i11;
            }
        }
    }

    public void U(h8b h8bVar, boolean z) {
        int i;
        int i2;
        uok uokVar;
        mf9 mf9Var;
        h8bVar.getClass();
        int n = h8b.n(this.J);
        int n2 = h8b.n(this.K);
        int n3 = h8b.n(this.L);
        int n4 = h8b.n(this.M);
        if (z && (mf9Var = this.d) != null) {
            vx4 vx4Var = mf9Var.h;
            if (vx4Var.j) {
                vx4 vx4Var2 = mf9Var.i;
                if (vx4Var2.j) {
                    n = vx4Var.g;
                    n3 = vx4Var2.g;
                }
            }
        }
        if (z && (uokVar = this.e) != null) {
            vx4 vx4Var3 = uokVar.h;
            if (vx4Var3.j) {
                vx4 vx4Var4 = uokVar.i;
                if (vx4Var4.j) {
                    n2 = vx4Var3.g;
                    n4 = vx4Var4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.Z = n;
        this.a0 = n2;
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        int[] iArr = this.q0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.V)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.W)) {
            i5 = i;
        }
        this.V = i4;
        this.W = i5;
        int i7 = this.d0;
        if (i5 < i7) {
            this.W = i7;
        }
        int i8 = this.c0;
        if (i4 < i8) {
            this.V = i8;
        } else {
            i8 = i4;
        }
        int i9 = this.w;
        if (i9 > 0 && i6 == 3) {
            this.V = Math.min(i8, i9);
        }
        int i10 = this.z;
        if (i10 > 0 && iArr[1] == 3) {
            this.W = Math.min(this.W, i10);
        }
        int i11 = this.V;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.W;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a() {
        nl3 nl3Var = this.J;
        ArrayList arrayList = this.S;
        arrayList.add(nl3Var);
        arrayList.add(this.K);
        arrayList.add(this.L);
        arrayList.add(this.M);
        arrayList.add(this.O);
        arrayList.add(this.P);
        arrayList.add(this.Q);
        arrayList.add(this.N);
    }

    public final void b(xm3 xm3Var, h8b h8bVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            zm2.n(xm3Var, h8bVar, this);
            hashSet.remove(this);
            c(h8bVar, xm3Var.c0(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((nl3) it.next()).d.b(xm3Var, h8bVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((nl3) it2.next()).d.b(xm3Var, h8bVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((nl3) it3.next()).d.b(xm3Var, h8bVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((nl3) it4.next()).d.b(xm3Var, h8bVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((nl3) it5.next()).d.b(xm3Var, h8bVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05dc, code lost:
    
        if (r58.h0 == r14) goto L373;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ad  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [wm3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(h8b h8bVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r17;
        int i;
        boolean z5;
        boolean z6;
        xm3 xm3Var;
        xm3 xm3Var2;
        boolean[] zArr;
        nl3 nl3Var;
        boolean[] zArr2;
        nl3 nl3Var2;
        nl3 nl3Var3;
        boolean z7;
        boolean z8;
        boolean z9;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        float f;
        nl3 nl3Var4;
        rvh rvhVar;
        nl3 nl3Var5;
        int i5;
        int i6;
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        nl3 nl3Var6;
        boolean z13;
        char c;
        boolean z14;
        int i8;
        int[] iArr2;
        nl3 nl3Var7;
        boolean z15;
        int[] iArr3;
        nl3 nl3Var8;
        rvh rvhVar2;
        rvh rvhVar3;
        int[] iArr4;
        rvh rvhVar4;
        boolean z16;
        boolean z17;
        rvh rvhVar5;
        nl3 nl3Var9;
        rvh rvhVar6;
        int i9;
        boolean[] zArr3;
        rvh rvhVar7;
        rvh rvhVar8;
        rvh rvhVar9;
        int i10;
        int i11;
        boolean z18;
        int i12;
        rvh rvhVar10;
        rvh rvhVar11;
        ?? r27;
        uok uokVar;
        vx4 vx4Var;
        xm3 xm3Var3;
        boolean z19;
        mf9 mf9Var;
        vx4 vx4Var2;
        int i13;
        boolean y;
        int i14;
        boolean z20;
        mf9 mf9Var2;
        uok uokVar2;
        boolean z21;
        h8b h8bVar2 = h8bVar;
        nl3 nl3Var10 = this.J;
        rvh k = h8bVar2.k(nl3Var10);
        nl3 nl3Var11 = this.L;
        rvh k2 = h8bVar2.k(nl3Var11);
        nl3 nl3Var12 = this.K;
        rvh k3 = h8bVar2.k(nl3Var12);
        nl3 nl3Var13 = this.M;
        rvh k4 = h8bVar2.k(nl3Var13);
        nl3 nl3Var14 = this.N;
        rvh k5 = h8bVar2.k(nl3Var14);
        xm3 xm3Var4 = this.U;
        if (xm3Var4 != null) {
            int[] iArr5 = xm3Var4.q0;
            r17 = 0;
            z2 = false;
            r17 = 0;
            z4 = iArr5[0] == 2;
            boolean z22 = iArr5[1] == 2;
            int i15 = this.r;
            if (i15 != 1) {
                if (i15 == 2) {
                    z4 = false;
                }
                z3 = z22;
            } else {
                z3 = false;
            }
            i = this.h0;
            boolean[] zArr4 = this.T;
            boolean z23 = z3;
            if (i != 8) {
                ArrayList arrayList = this.S;
                int size = arrayList.size();
                z5 = z4;
                int i16 = r17;
                while (true) {
                    if (i16 < size) {
                        int i17 = size;
                        HashSet hashSet = ((nl3) arrayList.get(i16)).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i16++;
                        size = i17;
                    } else if (!zArr4[r17] && !zArr4[1]) {
                        return;
                    }
                }
            } else {
                z5 = z4;
            }
            z6 = this.l;
            if (!z6 || this.m) {
                if (z6) {
                    h8bVar2.d(k, this.Z);
                    h8bVar2.d(k2, this.Z + this.V);
                    if (z5 && (xm3Var2 = this.U) != null) {
                        WeakReference weakReference = xm3Var2.I0;
                        if (weakReference == null || weakReference.get() == null || nl3Var10.d() > ((nl3) xm3Var2.I0.get()).d()) {
                            xm3Var2.I0 = new WeakReference(nl3Var10);
                        }
                        WeakReference weakReference2 = xm3Var2.K0;
                        if (weakReference2 == null || weakReference2.get() == null || nl3Var11.d() > ((nl3) xm3Var2.K0.get()).d()) {
                            xm3Var2.K0 = new WeakReference(nl3Var11);
                        }
                    }
                }
                if (this.m) {
                    h8bVar2.d(k3, this.a0);
                    h8bVar2.d(k4, this.a0 + this.W);
                    HashSet hashSet2 = nl3Var14.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        h8bVar2.d(k5, this.a0 + this.b0);
                    }
                    if (z23 && (xm3Var = this.U) != null) {
                        WeakReference weakReference3 = xm3Var.H0;
                        if (weakReference3 == null || weakReference3.get() == null || nl3Var12.d() > ((nl3) xm3Var.H0.get()).d()) {
                            xm3Var.H0 = new WeakReference(nl3Var12);
                        }
                        WeakReference weakReference4 = xm3Var.J0;
                        if (weakReference4 == null || weakReference4.get() == null || nl3Var13.d() > ((nl3) xm3Var.J0.get()).d()) {
                            xm3Var.J0 = new WeakReference(nl3Var13);
                        }
                    }
                }
                if (this.l && this.m) {
                    boolean z24 = r17;
                    this.l = z24;
                    this.m = z24;
                    return;
                }
            }
            zArr = this.f;
            if (z || (mf9Var2 = this.d) == null || (uokVar2 = this.e) == null) {
                nl3Var = nl3Var14;
                zArr2 = zArr;
            } else {
                nl3Var = nl3Var14;
                vx4 vx4Var3 = mf9Var2.h;
                zArr2 = zArr;
                if (vx4Var3.j && mf9Var2.i.j && uokVar2.h.j && uokVar2.i.j) {
                    h8bVar2.d(k, vx4Var3.g);
                    h8bVar2.d(k2, this.d.i.g);
                    h8bVar2.d(k3, this.e.h.g);
                    h8bVar2.d(k4, this.e.i.g);
                    h8bVar2.d(k5, this.e.k.g);
                    if (this.U != null) {
                        if (z5 && zArr2[0] && !y()) {
                            h8bVar2.f(h8bVar2.k(this.U.L), k2, 0, 8);
                        }
                        if (z23 && zArr2[1] && !z()) {
                            z21 = false;
                            h8bVar2.f(h8bVar2.k(this.U.M), k4, 0, 8);
                            this.l = z21;
                            this.m = z21;
                            return;
                        }
                    }
                    z21 = false;
                    this.l = z21;
                    this.m = z21;
                    return;
                }
            }
            if (this.U == null) {
                if (x(0)) {
                    this.U.W(this, 0);
                    y = true;
                    i14 = 1;
                } else {
                    y = y();
                    i14 = 1;
                }
                if (x(i14)) {
                    this.U.W(this, i14);
                    z20 = true;
                } else {
                    z20 = z();
                }
                if (!y && z5 && this.h0 != 8 && nl3Var10.f == null && nl3Var11.f == null) {
                    nl3Var2 = nl3Var10;
                    h8bVar2.f(h8bVar2.k(this.U.L), k2, 0, 1);
                } else {
                    nl3Var2 = nl3Var10;
                }
                if (!z20 && z23 && this.h0 != 8 && nl3Var12.f == null && nl3Var13.f == null && nl3Var == null) {
                    h8bVar2.f(h8bVar2.k(this.U.M), k4, 0, 1);
                }
                nl3Var3 = nl3Var11;
                z7 = z23;
                z9 = z20;
                z8 = y;
            } else {
                nl3Var2 = nl3Var10;
                nl3Var3 = nl3Var11;
                z7 = z23;
                z8 = false;
                z9 = false;
            }
            i2 = this.V;
            i3 = this.c0;
            if (i2 >= i3) {
                i3 = i2;
            }
            int i18 = this.W;
            nl3 nl3Var15 = nl3Var3;
            int i19 = this.d0;
            int i20 = i18 >= i19 ? i19 : i18;
            iArr = this.q0;
            int i21 = iArr[0];
            boolean z25 = z7;
            boolean z26 = i21 == 3;
            int i22 = iArr[1];
            boolean z27 = i22 == 3;
            i4 = this.Y;
            this.B = i4;
            float f2 = this.X;
            this.C = f2;
            f = f2;
            int i23 = this.s;
            int i24 = this.t;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                nl3Var4 = nl3Var13;
                if (this.h0 != 8) {
                    int i25 = (i21 == 3 && i23 == 0) ? 3 : i23;
                    if (i22 == 3 && i24 == 0) {
                        rvhVar = k4;
                        i13 = 3;
                    } else {
                        rvhVar = k4;
                        i13 = i24;
                    }
                    if (i21 != 3 || i22 != 3 || i25 != 3 || i13 != 3) {
                        if (i21 == 3 && i25 == 3) {
                            this.B = 0;
                            i3 = (int) (f * i18);
                            if (i22 != 3) {
                                nl3Var5 = nl3Var;
                                i5 = i20;
                                i4 = 0;
                                i6 = 4;
                                z10 = false;
                                i7 = i13;
                                int[] iArr6 = this.u;
                                iArr6[0] = i6;
                                iArr6[1] = i7;
                                if (z10) {
                                }
                                if (z10) {
                                }
                                if (iArr[0] != 2) {
                                }
                                if (z12) {
                                }
                                nl3Var6 = this.Q;
                                z13 = !nl3Var6.h();
                                c = '\b';
                                z14 = zArr4[0];
                                boolean z28 = zArr4[1];
                                i8 = this.p;
                                iArr2 = this.D;
                                if (i8 != 2) {
                                    if (z) {
                                        vx4Var2 = mf9Var.h;
                                        if (vx4Var2.j) {
                                        }
                                        c = '\b';
                                    }
                                    xm3 xm3Var5 = this.U;
                                    if (xm3Var5 == null) {
                                    }
                                    xm3 xm3Var6 = this.U;
                                    if (xm3Var6 == null) {
                                    }
                                    z16 = z8;
                                    z17 = z5;
                                    i9 = i6;
                                    iArr4 = iArr2;
                                    nl3Var7 = nl3Var6;
                                    z15 = z25;
                                    iArr3 = iArr;
                                    rvhVar5 = k3;
                                    rvhVar3 = k2;
                                    nl3Var9 = nl3Var4;
                                    rvhVar6 = rvhVar;
                                    rvhVar2 = k;
                                    nl3Var8 = nl3Var5;
                                    rvhVar4 = k5;
                                    h8bVar2 = h8bVar;
                                    zArr3 = zArr2;
                                    e(h8bVar2, true, z17, z15, zArr2[0], r15, r6, iArr[0], z12, this.J, this.L, this.Z, i3, this.c0, iArr2[0], this.e0, z11, iArr[1] == 3, z16, z9, z14, i9, i7, this.v, this.w, this.x, z13);
                                    if (z) {
                                    }
                                    rvhVar7 = rvhVar5;
                                    rvhVar8 = rvhVar6;
                                    rvhVar9 = rvhVar4;
                                    i10 = 0;
                                    i11 = 8;
                                    z18 = true;
                                    i12 = 1;
                                    if (this.q == 2) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    rvhVar10 = rvhVar7;
                                    rvhVar11 = rvhVar8;
                                    if (z10) {
                                    }
                                    if (nl3Var7.h()) {
                                    }
                                    this.l = false;
                                    this.m = false;
                                }
                                nl3Var7 = nl3Var6;
                                z15 = z25;
                                iArr3 = iArr;
                                nl3Var8 = nl3Var5;
                                rvhVar2 = k;
                                rvhVar3 = k2;
                                iArr4 = iArr2;
                                rvhVar4 = k5;
                                z16 = z8;
                                z17 = z5;
                                rvhVar5 = k3;
                                nl3Var9 = nl3Var4;
                                rvhVar6 = rvhVar;
                                i9 = i6;
                                zArr3 = zArr2;
                                if (z) {
                                }
                                rvhVar7 = rvhVar5;
                                rvhVar8 = rvhVar6;
                                rvhVar9 = rvhVar4;
                                i10 = 0;
                                i11 = 8;
                                z18 = true;
                                i12 = 1;
                                if (this.q == 2) {
                                }
                                if (i12 != 0) {
                                }
                                rvhVar10 = rvhVar7;
                                rvhVar11 = rvhVar8;
                                if (z10) {
                                }
                                if (nl3Var7.h()) {
                                }
                                this.l = false;
                                this.m = false;
                            }
                            i6 = i25;
                            nl3Var5 = nl3Var;
                            i5 = i20;
                            i4 = 0;
                        } else if (i22 == 3 && i13 == 3) {
                            this.B = 1;
                            if (i4 == -1) {
                                float f3 = 1.0f / f;
                                this.C = f3;
                                f = f3;
                            }
                            i5 = (int) (i2 * f);
                            if (i21 != 3) {
                                i6 = i25;
                                nl3Var5 = nl3Var;
                                i4 = 1;
                                i7 = 4;
                                z10 = false;
                                int[] iArr62 = this.u;
                                iArr62[0] = i6;
                                iArr62[1] = i7;
                                z11 = !z10 && (i4 == 0 || i4 == -1);
                                boolean z29 = !z10 && (i4 == 1 || i4 == -1);
                                z12 = iArr[0] != 2 && (this instanceof xm3);
                                if (z12) {
                                    i3 = 0;
                                }
                                nl3Var6 = this.Q;
                                z13 = !nl3Var6.h();
                                c = '\b';
                                z14 = zArr4[0];
                                boolean z282 = zArr4[1];
                                i8 = this.p;
                                iArr2 = this.D;
                                if (i8 != 2 && !this.l) {
                                    if (z && (mf9Var = this.d) != null) {
                                        vx4Var2 = mf9Var.h;
                                        if (vx4Var2.j || !mf9Var.i.j) {
                                            c = '\b';
                                        } else if (z) {
                                            h8bVar2.d(k, vx4Var2.g);
                                            h8bVar2.d(k2, this.d.i.g);
                                            if (this.U != null && z5 && zArr2[0] && !y()) {
                                                h8bVar2.f(h8bVar2.k(this.U.L), k2, 0, 8);
                                            }
                                        }
                                    }
                                    xm3 xm3Var52 = this.U;
                                    rvh k6 = xm3Var52 == null ? h8bVar2.k(xm3Var52.L) : null;
                                    xm3 xm3Var62 = this.U;
                                    rvh k7 = xm3Var62 == null ? h8bVar2.k(xm3Var62.J) : null;
                                    z16 = z8;
                                    z17 = z5;
                                    i9 = i6;
                                    iArr4 = iArr2;
                                    nl3Var7 = nl3Var6;
                                    z15 = z25;
                                    iArr3 = iArr;
                                    rvhVar5 = k3;
                                    rvhVar3 = k2;
                                    nl3Var9 = nl3Var4;
                                    rvhVar6 = rvhVar;
                                    rvhVar2 = k;
                                    nl3Var8 = nl3Var5;
                                    rvhVar4 = k5;
                                    h8bVar2 = h8bVar;
                                    zArr3 = zArr2;
                                    e(h8bVar2, true, z17, z15, zArr2[0], k7, k6, iArr[0], z12, this.J, this.L, this.Z, i3, this.c0, iArr2[0], this.e0, z11, iArr[1] == 3, z16, z9, z14, i9, i7, this.v, this.w, this.x, z13);
                                    if (z && (uokVar = this.e) != null) {
                                        vx4Var = uokVar.h;
                                        if (vx4Var.j && uokVar.i.j) {
                                            int i26 = vx4Var.g;
                                            rvhVar7 = rvhVar5;
                                            h8bVar2.d(rvhVar7, i26);
                                            rvhVar8 = rvhVar6;
                                            h8bVar2.d(rvhVar8, this.e.i.g);
                                            rvhVar9 = rvhVar4;
                                            h8bVar2.d(rvhVar9, this.e.k.g);
                                            xm3Var3 = this.U;
                                            if (xm3Var3 == null && !z9 && z15) {
                                                z19 = true;
                                                z19 = true;
                                                if (zArr3[1]) {
                                                    i10 = 0;
                                                    i11 = 8;
                                                    h8bVar2.f(h8bVar2.k(xm3Var3.M), rvhVar8, 0, 8);
                                                } else {
                                                    i10 = 0;
                                                    i11 = 8;
                                                }
                                            } else {
                                                i10 = 0;
                                                i11 = 8;
                                                z19 = true;
                                            }
                                            i12 = i10;
                                            z18 = z19;
                                            if (this.q == 2) {
                                                i12 = i10;
                                            }
                                            if (i12 != 0 || this.m) {
                                                rvhVar10 = rvhVar7;
                                                rvhVar11 = rvhVar8;
                                            } else {
                                                int i27 = (iArr3[z18 ? 1 : 0] == 2 && (this instanceof xm3)) ? z18 ? 1 : 0 : i10;
                                                int i28 = i27 != 0 ? i10 : i5;
                                                xm3 xm3Var7 = this.U;
                                                rvh k8 = xm3Var7 != null ? h8bVar2.k(xm3Var7.M) : null;
                                                xm3 xm3Var8 = this.U;
                                                rvh k9 = xm3Var8 != null ? h8bVar2.k(xm3Var8.K) : null;
                                                int i29 = this.b0;
                                                if (i29 <= 0) {
                                                    r27 = z13;
                                                }
                                                nl3 nl3Var16 = nl3Var8;
                                                if (nl3Var16.f != null) {
                                                    h8bVar2.e(rvhVar9, rvhVar7, i29, i11);
                                                    h8bVar2.e(rvhVar9, h8bVar2.k(nl3Var16.f), nl3Var16.e(), i11);
                                                    if (z15) {
                                                        h8bVar2.f(k8, h8bVar2.k(nl3Var9), i10, 5);
                                                    }
                                                    r27 = i10;
                                                } else if (this.h0 == i11) {
                                                    h8bVar2.e(rvhVar9, rvhVar7, nl3Var16.e(), i11);
                                                    r27 = z13;
                                                } else {
                                                    h8bVar2.e(rvhVar9, rvhVar7, i29, i11);
                                                    r27 = z13;
                                                }
                                                boolean z30 = zArr3[z18 ? 1 : 0];
                                                int i30 = i10;
                                                int i31 = iArr3[z18 ? 1 : 0];
                                                int i32 = this.a0;
                                                int i33 = this.d0;
                                                int i34 = iArr4[z18 ? 1 : 0];
                                                float f4 = this.f0;
                                                int i35 = iArr3[i30];
                                                boolean z31 = z18 ? 1 : 0;
                                                ?? r18 = z18;
                                                if (i35 != 3) {
                                                    r18 = i30;
                                                }
                                                rvhVar11 = rvhVar8;
                                                rvhVar10 = rvhVar7;
                                                h8bVar2 = h8bVar;
                                                e(h8bVar2, false, z15, z17, z30, k9, k8, i31, i27, this.K, this.M, i32, i28, i33, i34, f4, z29, r18, z9, z16, z282, i7, i9, this.y, this.z, this.A, r27);
                                            }
                                            if (z10) {
                                                int i36 = this.B;
                                                float f5 = this.C;
                                                if (i36 == 1) {
                                                    fh0 l = h8bVar2.l();
                                                    l.d.g(rvhVar11, -1.0f);
                                                    l.d.g(rvhVar10, 1.0f);
                                                    l.d.g(rvhVar3, f5);
                                                    l.d.g(rvhVar2, -f5);
                                                    h8bVar2.c(l);
                                                } else {
                                                    fh0 l2 = h8bVar2.l();
                                                    l2.d.g(rvhVar3, -1.0f);
                                                    l2.d.g(rvhVar2, 1.0f);
                                                    l2.d.g(rvhVar11, f5);
                                                    l2.d.g(rvhVar10, -f5);
                                                    h8bVar2.c(l2);
                                                }
                                            }
                                            if (nl3Var7.h()) {
                                                nl3 nl3Var17 = nl3Var7;
                                                wm3 wm3Var = nl3Var17.f.d;
                                                float radians = (float) Math.toRadians(this.E + 90.0f);
                                                int e = nl3Var17.e();
                                                rvh k10 = h8bVar2.k(j(2));
                                                rvh k11 = h8bVar2.k(j(3));
                                                rvh k12 = h8bVar2.k(j(4));
                                                rvh k13 = h8bVar2.k(j(5));
                                                rvh k14 = h8bVar2.k(wm3Var.j(2));
                                                rvh k15 = h8bVar2.k(wm3Var.j(3));
                                                rvh k16 = h8bVar2.k(wm3Var.j(4));
                                                rvh k17 = h8bVar2.k(wm3Var.j(5));
                                                fh0 l3 = h8bVar2.l();
                                                double d = radians;
                                                double sin = Math.sin(d);
                                                double d2 = e;
                                                l3.d.g(k15, 0.5f);
                                                l3.d.g(k17, 0.5f);
                                                l3.d.g(k11, -0.5f);
                                                l3.d.g(k13, -0.5f);
                                                l3.b = -((float) (sin * d2));
                                                h8bVar2.c(l3);
                                                fh0 l4 = h8bVar2.l();
                                                float cos = (float) (Math.cos(d) * d2);
                                                l4.d.g(k14, 0.5f);
                                                l4.d.g(k16, 0.5f);
                                                l4.d.g(k10, -0.5f);
                                                l4.d.g(k12, -0.5f);
                                                l4.b = -cos;
                                                h8bVar2.c(l4);
                                            }
                                            this.l = false;
                                            this.m = false;
                                        }
                                    }
                                    rvhVar7 = rvhVar5;
                                    rvhVar8 = rvhVar6;
                                    rvhVar9 = rvhVar4;
                                    i10 = 0;
                                    i11 = 8;
                                    z18 = true;
                                    i12 = 1;
                                    if (this.q == 2) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    rvhVar10 = rvhVar7;
                                    rvhVar11 = rvhVar8;
                                    if (z10) {
                                    }
                                    if (nl3Var7.h()) {
                                    }
                                    this.l = false;
                                    this.m = false;
                                }
                                nl3Var7 = nl3Var6;
                                z15 = z25;
                                iArr3 = iArr;
                                nl3Var8 = nl3Var5;
                                rvhVar2 = k;
                                rvhVar3 = k2;
                                iArr4 = iArr2;
                                rvhVar4 = k5;
                                z16 = z8;
                                z17 = z5;
                                rvhVar5 = k3;
                                nl3Var9 = nl3Var4;
                                rvhVar6 = rvhVar;
                                i9 = i6;
                                zArr3 = zArr2;
                                if (z) {
                                    vx4Var = uokVar.h;
                                    if (vx4Var.j) {
                                        int i262 = vx4Var.g;
                                        rvhVar7 = rvhVar5;
                                        h8bVar2.d(rvhVar7, i262);
                                        rvhVar8 = rvhVar6;
                                        h8bVar2.d(rvhVar8, this.e.i.g);
                                        rvhVar9 = rvhVar4;
                                        h8bVar2.d(rvhVar9, this.e.k.g);
                                        xm3Var3 = this.U;
                                        if (xm3Var3 == null) {
                                        }
                                        i10 = 0;
                                        i11 = 8;
                                        z19 = true;
                                        i12 = i10;
                                        z18 = z19;
                                        if (this.q == 2) {
                                        }
                                        if (i12 != 0) {
                                        }
                                        rvhVar10 = rvhVar7;
                                        rvhVar11 = rvhVar8;
                                        if (z10) {
                                        }
                                        if (nl3Var7.h()) {
                                        }
                                        this.l = false;
                                        this.m = false;
                                    }
                                }
                                rvhVar7 = rvhVar5;
                                rvhVar8 = rvhVar6;
                                rvhVar9 = rvhVar4;
                                i10 = 0;
                                i11 = 8;
                                z18 = true;
                                i12 = 1;
                                if (this.q == 2) {
                                }
                                if (i12 != 0) {
                                }
                                rvhVar10 = rvhVar7;
                                rvhVar11 = rvhVar8;
                                if (z10) {
                                }
                                if (nl3Var7.h()) {
                                }
                                this.l = false;
                                this.m = false;
                            }
                            i6 = i25;
                            nl3Var5 = nl3Var;
                            i4 = 1;
                        }
                        z10 = true;
                        i7 = i13;
                        int[] iArr622 = this.u;
                        iArr622[0] = i6;
                        iArr622[1] = i7;
                        if (z10) {
                        }
                        if (z10) {
                        }
                        if (iArr[0] != 2) {
                        }
                        if (z12) {
                        }
                        nl3Var6 = this.Q;
                        z13 = !nl3Var6.h();
                        c = '\b';
                        z14 = zArr4[0];
                        boolean z2822 = zArr4[1];
                        i8 = this.p;
                        iArr2 = this.D;
                        if (i8 != 2) {
                        }
                        nl3Var7 = nl3Var6;
                        z15 = z25;
                        iArr3 = iArr;
                        nl3Var8 = nl3Var5;
                        rvhVar2 = k;
                        rvhVar3 = k2;
                        iArr4 = iArr2;
                        rvhVar4 = k5;
                        z16 = z8;
                        z17 = z5;
                        rvhVar5 = k3;
                        nl3Var9 = nl3Var4;
                        rvhVar6 = rvhVar;
                        i9 = i6;
                        zArr3 = zArr2;
                        if (z) {
                        }
                        rvhVar7 = rvhVar5;
                        rvhVar8 = rvhVar6;
                        rvhVar9 = rvhVar4;
                        i10 = 0;
                        i11 = 8;
                        z18 = true;
                        i12 = 1;
                        if (this.q == 2) {
                        }
                        if (i12 != 0) {
                        }
                        rvhVar10 = rvhVar7;
                        rvhVar11 = rvhVar8;
                        if (z10) {
                        }
                        if (nl3Var7.h()) {
                        }
                        this.l = false;
                        this.m = false;
                    }
                    if (i4 == -1) {
                        if (z26 && !z27) {
                            this.B = 0;
                            i4 = 0;
                        } else if (!z26 && z27) {
                            this.B = 1;
                            if (i4 == -1) {
                                this.C = 1.0f / f;
                            }
                            i4 = 1;
                        }
                    }
                    if (i4 == 0 && (!nl3Var12.h() || !nl3Var4.h())) {
                        this.B = 1;
                    } else if (this.B == 1 && (!nl3Var2.h() || !nl3Var15.h())) {
                        this.B = 0;
                    }
                    if (this.B == -1 && (!nl3Var12.h() || !nl3Var4.h() || !nl3Var2.h() || !nl3Var15.h())) {
                        if (nl3Var12.h() && nl3Var4.h()) {
                            this.B = 0;
                        } else if (nl3Var2.h() && nl3Var15.h()) {
                            this.C = 1.0f / this.C;
                            this.B = 1;
                        }
                    }
                    int i37 = this.B;
                    if (i37 == -1) {
                        int i38 = this.v;
                        if (i38 > 0 && this.y == 0) {
                            this.B = 0;
                            i37 = 0;
                        } else if (i38 == 0 && this.y > 0) {
                            this.C = 1.0f / this.C;
                            this.B = 1;
                            i37 = 1;
                        }
                    }
                    i4 = i37;
                    i6 = i25;
                    nl3Var5 = nl3Var;
                    i5 = i20;
                    z10 = true;
                    i7 = i13;
                    int[] iArr6222 = this.u;
                    iArr6222[0] = i6;
                    iArr6222[1] = i7;
                    if (z10) {
                    }
                    if (z10) {
                    }
                    if (iArr[0] != 2) {
                    }
                    if (z12) {
                    }
                    nl3Var6 = this.Q;
                    z13 = !nl3Var6.h();
                    c = '\b';
                    z14 = zArr4[0];
                    boolean z28222 = zArr4[1];
                    i8 = this.p;
                    iArr2 = this.D;
                    if (i8 != 2) {
                    }
                    nl3Var7 = nl3Var6;
                    z15 = z25;
                    iArr3 = iArr;
                    nl3Var8 = nl3Var5;
                    rvhVar2 = k;
                    rvhVar3 = k2;
                    iArr4 = iArr2;
                    rvhVar4 = k5;
                    z16 = z8;
                    z17 = z5;
                    rvhVar5 = k3;
                    nl3Var9 = nl3Var4;
                    rvhVar6 = rvhVar;
                    i9 = i6;
                    zArr3 = zArr2;
                    if (z) {
                    }
                    rvhVar7 = rvhVar5;
                    rvhVar8 = rvhVar6;
                    rvhVar9 = rvhVar4;
                    i10 = 0;
                    i11 = 8;
                    z18 = true;
                    i12 = 1;
                    if (this.q == 2) {
                    }
                    if (i12 != 0) {
                    }
                    rvhVar10 = rvhVar7;
                    rvhVar11 = rvhVar8;
                    if (z10) {
                    }
                    if (nl3Var7.h()) {
                    }
                    this.l = false;
                    this.m = false;
                }
            } else {
                nl3Var4 = nl3Var13;
            }
            rvhVar = k4;
            nl3Var5 = nl3Var;
            i5 = i20;
            i6 = i23;
            i7 = i24;
            z10 = false;
            int[] iArr62222 = this.u;
            iArr62222[0] = i6;
            iArr62222[1] = i7;
            if (z10) {
            }
            if (z10) {
            }
            if (iArr[0] != 2) {
            }
            if (z12) {
            }
            nl3Var6 = this.Q;
            z13 = !nl3Var6.h();
            c = '\b';
            z14 = zArr4[0];
            boolean z282222 = zArr4[1];
            i8 = this.p;
            iArr2 = this.D;
            if (i8 != 2) {
            }
            nl3Var7 = nl3Var6;
            z15 = z25;
            iArr3 = iArr;
            nl3Var8 = nl3Var5;
            rvhVar2 = k;
            rvhVar3 = k2;
            iArr4 = iArr2;
            rvhVar4 = k5;
            z16 = z8;
            z17 = z5;
            rvhVar5 = k3;
            nl3Var9 = nl3Var4;
            rvhVar6 = rvhVar;
            i9 = i6;
            zArr3 = zArr2;
            if (z) {
            }
            rvhVar7 = rvhVar5;
            rvhVar8 = rvhVar6;
            rvhVar9 = rvhVar4;
            i10 = 0;
            i11 = 8;
            z18 = true;
            i12 = 1;
            if (this.q == 2) {
            }
            if (i12 != 0) {
            }
            rvhVar10 = rvhVar7;
            rvhVar11 = rvhVar8;
            if (z10) {
            }
            if (nl3Var7.h()) {
            }
            this.l = false;
            this.m = false;
        }
        z2 = false;
        z3 = z2 ? 1 : 0;
        z4 = z3;
        r17 = z2;
        i = this.h0;
        boolean[] zArr42 = this.T;
        boolean z232 = z3;
        if (i != 8) {
        }
        z6 = this.l;
        if (!z6) {
        }
        if (z6) {
        }
        if (this.m) {
        }
        if (this.l) {
            boolean z242 = r17;
            this.l = z242;
            this.m = z242;
            return;
        }
        zArr = this.f;
        if (z) {
        }
        nl3Var = nl3Var14;
        zArr2 = zArr;
        if (this.U == null) {
        }
        i2 = this.V;
        i3 = this.c0;
        if (i2 >= i3) {
        }
        int i182 = this.W;
        nl3 nl3Var152 = nl3Var3;
        int i192 = this.d0;
        if (i182 >= i192) {
        }
        iArr = this.q0;
        int i212 = iArr[0];
        boolean z252 = z7;
        if (i212 == 3) {
        }
        int i222 = iArr[1];
        if (i222 == 3) {
        }
        i4 = this.Y;
        this.B = i4;
        float f22 = this.X;
        this.C = f22;
        f = f22;
        int i232 = this.s;
        int i242 = this.t;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        rvhVar = k4;
        nl3Var5 = nl3Var;
        i5 = i20;
        i6 = i232;
        i7 = i242;
        z10 = false;
        int[] iArr622222 = this.u;
        iArr622222[0] = i6;
        iArr622222[1] = i7;
        if (z10) {
        }
        if (z10) {
        }
        if (iArr[0] != 2) {
        }
        if (z12) {
        }
        nl3Var6 = this.Q;
        z13 = !nl3Var6.h();
        c = '\b';
        z14 = zArr42[0];
        boolean z2822222 = zArr42[1];
        i8 = this.p;
        iArr2 = this.D;
        if (i8 != 2) {
        }
        nl3Var7 = nl3Var6;
        z15 = z252;
        iArr3 = iArr;
        nl3Var8 = nl3Var5;
        rvhVar2 = k;
        rvhVar3 = k2;
        iArr4 = iArr2;
        rvhVar4 = k5;
        z16 = z8;
        z17 = z5;
        rvhVar5 = k3;
        nl3Var9 = nl3Var4;
        rvhVar6 = rvhVar;
        i9 = i6;
        zArr3 = zArr2;
        if (z) {
        }
        rvhVar7 = rvhVar5;
        rvhVar8 = rvhVar6;
        rvhVar9 = rvhVar4;
        i10 = 0;
        i11 = 8;
        z18 = true;
        i12 = 1;
        if (this.q == 2) {
        }
        if (i12 != 0) {
        }
        rvhVar10 = rvhVar7;
        rvhVar11 = rvhVar8;
        if (z10) {
        }
        if (nl3Var7.h()) {
        }
        this.l = false;
        this.m = false;
    }

    public boolean d() {
        return this.h0 != 8;
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
    public final void e(h8b h8bVar, boolean z, boolean z2, boolean z3, boolean z4, rvh rvhVar, rvh rvhVar2, int i, boolean z5, nl3 nl3Var, nl3 nl3Var2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        boolean z16;
        rvh k;
        rvh k2;
        nl3 nl3Var3;
        rvh rvhVar3;
        boolean z17;
        int i13;
        rvh rvhVar4;
        rvh rvhVar5;
        rvh rvhVar6;
        rvh rvhVar7;
        int i14;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        wm3 wm3Var;
        int i17;
        int i18;
        nl3 nl3Var4;
        boolean z22;
        int i19;
        boolean z23;
        int i20;
        int i21;
        HashSet hashSet;
        boolean z24;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z25;
        boolean z26;
        int i27;
        h8b h8bVar2 = h8bVar;
        int i28 = i8;
        int i29 = i9;
        rvh k3 = h8bVar2.k(nl3Var);
        rvh k4 = h8bVar2.k(nl3Var2);
        rvh k5 = h8bVar2.k(nl3Var.f);
        rvh k6 = h8bVar2.k(nl3Var2.f);
        boolean h = nl3Var.h();
        boolean h2 = nl3Var2.h();
        boolean h3 = this.Q.h();
        int i30 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i30++;
        }
        int i31 = i30;
        int i32 = z6 ? 3 : i6;
        int C = wt3.C(i);
        boolean z27 = (C == 0 || C == 1 || C != 2 || i32 == 4) ? false : true;
        int i33 = this.h;
        if (i33 == -1 || !z) {
            i33 = i3;
            z12 = z27;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i34 = this.i;
        if (i34 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i33 = i34;
            z13 = false;
        }
        boolean z28 = z13;
        if (this.h0 == 8) {
            z14 = false;
            i10 = 0;
        } else {
            i10 = i33;
            z14 = z28;
        }
        if (z11) {
            if (!h && !h2 && !h3) {
                h8bVar2.d(k3, i2);
            } else if (h && !h2) {
                z15 = z14;
                i11 = 8;
                h8bVar2.e(k3, k5, nl3Var.e(), 8);
            }
            z15 = z14;
            i11 = 8;
        } else {
            z15 = z14;
            i11 = 8;
        }
        if (z15) {
            if (i31 == 2 || z6 || !(i32 == 1 || i32 == 0)) {
                if (i28 == -2) {
                    i28 = i10;
                }
                if (i29 == -2) {
                    i29 = i10;
                }
                if (i10 > 0 && i32 != 1) {
                    i10 = 0;
                }
                if (i28 > 0) {
                    h8bVar2.f(k4, k3, i28, 8);
                    i10 = Math.max(i10, i28);
                }
                if (i29 > 0) {
                    if (!z2 || i32 != 1) {
                        h8bVar2.g(k4, k3, i29, 8);
                    }
                    i10 = Math.min(i10, i29);
                }
                if (i32 == 1) {
                    if (z2) {
                        h8bVar2.e(k4, k3, i10, 8);
                    } else if (z8) {
                        h8bVar2.e(k4, k3, i10, 5);
                        h8bVar2.g(k4, k3, i10, 8);
                    } else {
                        h8bVar2.e(k4, k3, i10, 5);
                        h8bVar2.g(k4, k3, i10, 8);
                    }
                } else if (i32 == 2) {
                    int i35 = nl3Var.e;
                    if (i35 == 3 || i35 == 5) {
                        k = h8bVar2.k(this.U.j(3));
                        k2 = h8bVar2.k(this.U.j(5));
                    } else {
                        k = h8bVar2.k(this.U.j(2));
                        k2 = h8bVar2.k(this.U.j(4));
                    }
                    fh0 l = h8bVar2.l();
                    int i36 = i28;
                    l.d.g(k4, -1.0f);
                    l.d.g(k3, 1.0f);
                    l.d.g(k2, f2);
                    l.d.g(k, -f2);
                    h8bVar2.c(l);
                    if (z2) {
                        z15 = false;
                    }
                    z16 = z4;
                    i12 = i36;
                } else {
                    i12 = i28;
                    z16 = true;
                }
            } else {
                int max = Math.max(i28, i10);
                if (i29 > 0) {
                    max = Math.min(i29, max);
                }
                h8bVar2.e(k4, k3, max, 8);
                z16 = z4;
                i12 = i28;
                z15 = false;
            }
            if (z11 || z8) {
                boolean z29 = z16;
                if (i31 >= 2 && z2 && z29) {
                    h8bVar2.f(k3, rvhVar, 0, 8);
                    nl3 nl3Var5 = this.N;
                    boolean z30 = z || nl3Var5.f == null;
                    if (!z && (nl3Var3 = nl3Var5.f) != null) {
                        wm3 wm3Var2 = nl3Var3.d;
                        if (wm3Var2.X != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            int[] iArr = wm3Var2.q0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z30 = true;
                            }
                        }
                        z30 = false;
                    }
                    if (z30) {
                        h8bVar2.f(rvhVar2, k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h2 && !h3) {
                nl3Var4 = nl3Var2;
                rvhVar6 = k4;
                z17 = z16;
                rvhVar3 = k6;
            } else if (!h || h2) {
                if (h || !h2) {
                    rvhVar3 = k6;
                    if (h && h2) {
                        wm3 wm3Var3 = nl3Var.f.d;
                        wm3 wm3Var4 = nl3Var2.f.d;
                        z17 = z16;
                        xm3 xm3Var = this.U;
                        int i37 = 6;
                        if (z15) {
                            if (i32 == 0) {
                                if (i29 != 0 || i12 != 0) {
                                    i25 = 5;
                                    i26 = 5;
                                    z25 = true;
                                    z26 = false;
                                    z19 = true;
                                } else if (k5.f && rvhVar3.f) {
                                    h8bVar2.e(k3, k5, nl3Var.e(), 8);
                                    h8bVar2.e(k4, rvhVar3, -nl3Var2.e(), 8);
                                    return;
                                } else {
                                    i25 = 8;
                                    i26 = 8;
                                    z25 = false;
                                    z26 = true;
                                    z19 = false;
                                }
                                if ((wm3Var3 instanceof b01) || (wm3Var4 instanceof b01)) {
                                    h8bVar2 = h8bVar;
                                    i13 = i32;
                                    rvhVar5 = k3;
                                    rvhVar6 = k4;
                                    z20 = z26;
                                    rvhVar4 = rvhVar2;
                                    i15 = i25;
                                    rvhVar7 = k5;
                                    i14 = 6;
                                    z18 = z25;
                                    i16 = 4;
                                    if (z19 || rvhVar7 != rvhVar3 || wm3Var3 == xm3Var) {
                                        z21 = true;
                                    } else {
                                        z19 = false;
                                        z21 = false;
                                    }
                                    if (z18) {
                                        wm3Var = wm3Var4;
                                        i17 = i12;
                                        i18 = i13;
                                        nl3Var4 = nl3Var2;
                                        z22 = z2;
                                    } else {
                                        if (z15 || z7 || z9 || rvhVar7 != rvhVar || rvhVar3 != rvhVar4) {
                                            z22 = z2;
                                            z24 = z21;
                                            i22 = i15;
                                        } else {
                                            i14 = 8;
                                            z22 = false;
                                            i22 = 8;
                                            z24 = false;
                                        }
                                        rvh rvhVar8 = rvhVar7;
                                        i17 = i12;
                                        i18 = i13;
                                        wm3Var = wm3Var4;
                                        nl3Var4 = nl3Var2;
                                        h8bVar2.b(rvhVar5, rvhVar8, nl3Var.e(), f, rvhVar3, rvhVar6, nl3Var2.e(), i14);
                                        rvhVar7 = rvhVar8;
                                        i15 = i22;
                                        z21 = z24;
                                    }
                                    if (this.h0 != 8 && ((hashSet = nl3Var4.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z19) {
                                        if (z22 && rvhVar7 != rvhVar3 && !z15 && ((wm3Var3 instanceof b01) || (wm3Var instanceof b01))) {
                                            i15 = 6;
                                        }
                                        h8bVar2.f(rvhVar5, rvhVar7, nl3Var.e(), i15);
                                        h8bVar2.g(rvhVar6, rvhVar3, -nl3Var4.e(), i15);
                                    }
                                    if (z22 || !z10 || (wm3Var3 instanceof b01) || (wm3Var instanceof b01) || wm3Var == xm3Var) {
                                        i19 = i16;
                                        z23 = z21;
                                    } else {
                                        i19 = 6;
                                        i15 = 6;
                                        z23 = true;
                                    }
                                    if (z23) {
                                        if (z20 && (!z9 || z3)) {
                                            if (wm3Var3 != xm3Var && wm3Var != xm3Var) {
                                                i37 = i19;
                                            }
                                            if ((wm3Var3 instanceof s49) || (wm3Var instanceof s49)) {
                                                i37 = 5;
                                            }
                                            if ((wm3Var3 instanceof b01) || (wm3Var instanceof b01)) {
                                                i37 = 5;
                                            }
                                            i19 = Math.max(z9 ? 5 : i37, i19);
                                        }
                                        if (z22) {
                                            i19 = Math.min(i15, i19);
                                            if (z6 && !z9 && (wm3Var3 == xm3Var || wm3Var == xm3Var)) {
                                                i21 = 4;
                                                h8bVar2.e(rvhVar5, rvhVar7, nl3Var.e(), i21);
                                                h8bVar2.e(rvhVar6, rvhVar3, -nl3Var4.e(), i21);
                                            }
                                        }
                                        i21 = i19;
                                        h8bVar2.e(rvhVar5, rvhVar7, nl3Var.e(), i21);
                                        h8bVar2.e(rvhVar6, rvhVar3, -nl3Var4.e(), i21);
                                    }
                                    if (z22) {
                                        int e = rvhVar == rvhVar7 ? nl3Var.e() : 0;
                                        if (rvhVar7 != rvhVar) {
                                            h8bVar2.f(rvhVar5, rvhVar, e, 5);
                                        }
                                    }
                                    if (z22 && z15 && i4 == 0 && i17 == 0) {
                                        if (z15 || i18 != 3) {
                                            i20 = 5;
                                            h8bVar2.f(rvhVar6, rvhVar5, 0, 5);
                                        } else {
                                            h8bVar2.f(rvhVar6, rvhVar5, 0, 8);
                                        }
                                    }
                                    i20 = 5;
                                } else {
                                    h8bVar2 = h8bVar;
                                    rvhVar5 = k3;
                                    rvhVar6 = k4;
                                    z20 = z26;
                                    i15 = i25;
                                    rvhVar7 = k5;
                                    i14 = 6;
                                    z18 = z25;
                                    i16 = i26;
                                    i13 = i32;
                                    rvhVar4 = rvhVar2;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.h0 != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i19 = i16;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                        if (z15) {
                                        }
                                        i20 = 5;
                                        h8bVar2.f(rvhVar6, rvhVar5, 0, 5);
                                    }
                                    i20 = 5;
                                }
                            } else {
                                if (i32 == 2) {
                                    if ((wm3Var3 instanceof b01) || (wm3Var4 instanceof b01)) {
                                        h8bVar2 = h8bVar;
                                        i13 = i32;
                                        rvhVar5 = k3;
                                        rvhVar6 = k4;
                                        rvhVar7 = k5;
                                        i14 = 6;
                                        i15 = 5;
                                    } else {
                                        h8bVar2 = h8bVar;
                                        i13 = i32;
                                        rvhVar5 = k3;
                                        rvhVar6 = k4;
                                        rvhVar7 = k5;
                                        i14 = 6;
                                        i15 = 5;
                                        i16 = 5;
                                        z18 = true;
                                        z19 = true;
                                        z20 = false;
                                        rvhVar4 = rvhVar2;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.h0 != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = i16;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i20 = 5;
                                    }
                                } else if (i32 == 1) {
                                    h8bVar2 = h8bVar;
                                    i13 = i32;
                                    rvhVar5 = k3;
                                    rvhVar6 = k4;
                                    rvhVar7 = k5;
                                    i14 = 6;
                                    i15 = 8;
                                } else if (i32 == 3) {
                                    i13 = i32;
                                    if (this.B != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i23 = 5;
                                                i24 = 4;
                                            } else {
                                                i23 = 8;
                                                i24 = 5;
                                            }
                                            i16 = i24;
                                            rvhVar5 = k3;
                                            rvhVar6 = k4;
                                            rvhVar7 = k5;
                                            i14 = 6;
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            rvhVar4 = rvhVar2;
                                        } else if (i29 > 0) {
                                            h8bVar2 = h8bVar;
                                            rvhVar4 = rvhVar2;
                                            rvhVar5 = k3;
                                            rvhVar6 = k4;
                                            rvhVar7 = k5;
                                            i14 = 6;
                                            i15 = 5;
                                        } else {
                                            if (i29 != 0 || i12 != 0) {
                                                h8bVar2 = h8bVar;
                                                rvhVar4 = rvhVar2;
                                                rvhVar5 = k3;
                                                rvhVar6 = k4;
                                                rvhVar7 = k5;
                                                i14 = 6;
                                                i15 = 5;
                                                i16 = 4;
                                            } else if (z9) {
                                                i23 = (wm3Var3 == xm3Var || wm3Var4 == xm3Var) ? 5 : 4;
                                                rvhVar4 = rvhVar2;
                                                rvhVar5 = k3;
                                                rvhVar6 = k4;
                                                rvhVar7 = k5;
                                                i14 = 6;
                                                i16 = 4;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                            } else {
                                                h8bVar2 = h8bVar;
                                                rvhVar4 = rvhVar2;
                                                rvhVar5 = k3;
                                                rvhVar6 = k4;
                                                rvhVar7 = k5;
                                                i14 = 6;
                                                i15 = 5;
                                                i16 = 8;
                                            }
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            if (z19) {
                                            }
                                            z21 = true;
                                            if (z18) {
                                            }
                                            if (this.h0 != 8) {
                                            }
                                            if (z19) {
                                            }
                                            if (z22) {
                                            }
                                            i19 = i16;
                                            z23 = z21;
                                            if (z23) {
                                            }
                                            if (z22) {
                                            }
                                            if (z22) {
                                            }
                                            i20 = 5;
                                        }
                                        i15 = i23;
                                        h8bVar2 = h8bVar;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.h0 != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = i16;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i20 = 5;
                                    } else if (z9) {
                                        h8bVar2 = h8bVar;
                                        rvhVar4 = rvhVar2;
                                        rvhVar5 = k3;
                                        rvhVar6 = k4;
                                        rvhVar7 = k5;
                                        i15 = 8;
                                        i14 = z2 ? 5 : 4;
                                    } else {
                                        h8bVar2 = h8bVar;
                                        rvhVar4 = rvhVar2;
                                        rvhVar5 = k3;
                                        rvhVar6 = k4;
                                        rvhVar7 = k5;
                                        i15 = 8;
                                        i14 = 8;
                                    }
                                    i16 = 5;
                                    z18 = true;
                                    z19 = true;
                                    z20 = true;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.h0 != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i19 = i16;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                    }
                                    i20 = 5;
                                } else {
                                    i13 = i32;
                                    h8bVar2 = h8bVar;
                                    rvhVar4 = rvhVar2;
                                    rvhVar5 = k3;
                                    rvhVar6 = k4;
                                    rvhVar7 = k5;
                                    i14 = 6;
                                    i15 = 5;
                                    i16 = 4;
                                    z18 = false;
                                    z19 = false;
                                }
                                i16 = 4;
                                z18 = true;
                                z19 = true;
                                z20 = false;
                                rvhVar4 = rvhVar2;
                                if (z19) {
                                }
                                z21 = true;
                                if (z18) {
                                }
                                if (this.h0 != 8) {
                                }
                                if (z19) {
                                }
                                if (z22) {
                                }
                                i19 = i16;
                                z23 = z21;
                                if (z23) {
                                }
                                if (z22) {
                                }
                                if (z22) {
                                }
                                i20 = 5;
                            }
                            i27 = i20;
                            if (z22 && z17) {
                                int e2 = nl3Var4.f != null ? nl3Var4.e() : 0;
                                if (rvhVar3 != rvhVar2) {
                                    h8bVar2.f(rvhVar2, rvhVar6, e2, i27);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i13 = i32;
                        if (k5.f && rvhVar3.f) {
                            h8bVar.b(k3, k5, nl3Var.e(), f, rvhVar3, k4, nl3Var2.e(), 8);
                            if (z2 && z17) {
                                int e3 = nl3Var2.f != null ? nl3Var2.e() : 0;
                                if (rvhVar3 != rvhVar2) {
                                    h8bVar.f(rvhVar2, k4, e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        h8bVar2 = h8bVar;
                        rvhVar4 = rvhVar2;
                        rvhVar5 = k3;
                        rvhVar6 = k4;
                        rvhVar7 = k5;
                        i14 = 6;
                        i15 = 5;
                        i16 = 4;
                        z18 = true;
                        z19 = true;
                        z20 = false;
                        if (z19) {
                        }
                        z21 = true;
                        if (z18) {
                        }
                        if (this.h0 != 8) {
                        }
                        if (z19) {
                        }
                        if (z22) {
                        }
                        i19 = i16;
                        z23 = z21;
                        if (z23) {
                        }
                        if (z22) {
                        }
                        if (z22) {
                        }
                        i20 = 5;
                        i27 = i20;
                        if (z22) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    rvhVar3 = k6;
                    h8bVar2.e(k4, rvhVar3, -nl3Var2.e(), 8);
                    if (z2) {
                        h8bVar2.f(k3, rvhVar, 0, 5);
                        nl3Var4 = nl3Var2;
                        i20 = 5;
                        rvhVar6 = k4;
                        z17 = z16;
                        z22 = z2;
                        i27 = i20;
                        if (z22) {
                        }
                    }
                }
                nl3Var4 = nl3Var2;
                rvhVar6 = k4;
                z17 = z16;
            } else {
                nl3Var4 = nl3Var2;
                rvhVar6 = k4;
                z17 = z16;
                rvhVar3 = k6;
                z22 = z2;
                i27 = (z2 && (nl3Var.f.d instanceof b01)) ? 8 : 5;
                if (z22) {
                }
            }
            i20 = 5;
            z22 = z2;
            i27 = i20;
            if (z22) {
            }
        } else if (z5) {
            h8bVar2.e(k4, k3, 0, 3);
            if (i4 > 0) {
                h8bVar2.f(k4, k3, i4, i11);
            }
            if (i5 < Integer.MAX_VALUE) {
                h8bVar2.g(k4, k3, i5, i11);
            }
        } else {
            h8bVar2.e(k4, k3, i10, i11);
        }
        z16 = z4;
        i12 = i28;
        if (z11) {
        }
        boolean z292 = z16;
        if (i31 >= 2) {
        }
    }

    public final void f(int i, wm3 wm3Var, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    f(2, wm3Var, i2, 0);
                    f(4, wm3Var, i2, 0);
                    j(7).a(wm3Var.j(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        f(3, wm3Var, i2, 0);
                        f(5, wm3Var, i2, 0);
                        j(7).a(wm3Var.j(i2), 0);
                        return;
                    }
                    return;
                }
            }
            nl3 j = j(2);
            nl3 j2 = j(4);
            nl3 j3 = j(3);
            nl3 j4 = j(5);
            boolean z2 = true;
            if ((j == null || !j.h()) && (j2 == null || !j2.h())) {
                f(2, wm3Var, 2, 0);
                f(4, wm3Var, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((j3 == null || !j3.h()) && (j4 == null || !j4.h())) {
                f(3, wm3Var, 3, 0);
                f(5, wm3Var, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                j(7).a(wm3Var.j(7), 0);
                return;
            } else if (z) {
                j(8).a(wm3Var.j(8), 0);
                return;
            } else {
                if (z2) {
                    j(9).a(wm3Var.j(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            nl3 j5 = j(2);
            nl3 j6 = wm3Var.j(i2);
            nl3 j7 = j(4);
            j5.a(j6, 0);
            j7.a(j6, 0);
            j(8).a(j6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            nl3 j8 = wm3Var.j(i2);
            j(3).a(j8, 0);
            j(5).a(j8, 0);
            j(9).a(j8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            j(2).a(wm3Var.j(2), 0);
            j(4).a(wm3Var.j(4), 0);
            j(8).a(wm3Var.j(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            j(3).a(wm3Var.j(3), 0);
            j(5).a(wm3Var.j(5), 0);
            j(9).a(wm3Var.j(i2), 0);
            return;
        }
        nl3 j9 = j(i);
        nl3 j10 = wm3Var.j(i2);
        if (j9.i(j10)) {
            if (i == 6) {
                nl3 j11 = j(3);
                nl3 j12 = j(5);
                if (j11 != null) {
                    j11.j();
                }
                if (j12 != null) {
                    j12.j();
                }
            } else if (i == 3 || i == 5) {
                nl3 j13 = j(6);
                if (j13 != null) {
                    j13.j();
                }
                nl3 j14 = j(7);
                if (j14.f != j10) {
                    j14.j();
                }
                nl3 f = j(i).f();
                nl3 j15 = j(9);
                if (j15.h()) {
                    f.j();
                    j15.j();
                }
            } else if (i == 2 || i == 4) {
                nl3 j16 = j(7);
                if (j16.f != j10) {
                    j16.j();
                }
                nl3 f2 = j(i).f();
                nl3 j17 = j(8);
                if (j17.h()) {
                    f2.j();
                    j17.j();
                }
            }
            j9.a(j10, i3);
        }
    }

    public final void g(nl3 nl3Var, nl3 nl3Var2, int i) {
        if (nl3Var.d == this) {
            f(nl3Var.e, nl3Var2.d, nl3Var2.e, i);
        }
    }

    public final void h(h8b h8bVar) {
        h8bVar.k(this.J);
        h8bVar.k(this.K);
        h8bVar.k(this.L);
        h8bVar.k(this.M);
        if (this.b0 > 0) {
            h8bVar.k(this.N);
        }
    }

    public final void i() {
        if (this.d == null) {
            mf9 mf9Var = new mf9(this);
            mf9Var.h.e = 4;
            mf9Var.i.e = 5;
            mf9Var.f = 0;
            this.d = mf9Var;
        }
        if (this.e == null) {
            uok uokVar = new uok(this);
            vx4 vx4Var = new vx4(uokVar);
            uokVar.k = vx4Var;
            uokVar.l = null;
            uokVar.h.e = 6;
            uokVar.i.e = 7;
            vx4Var.e = 8;
            uokVar.f = 1;
            this.e = uokVar;
        }
    }

    public nl3 j(int i) {
        switch (wt3.C(i)) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                a70.j(bf3.x(i));
                return null;
        }
    }

    public final int k(int i) {
        int[] iArr = this.q0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int l() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final wm3 m(int i) {
        nl3 nl3Var;
        nl3 nl3Var2;
        if (i != 0) {
            if (i == 1 && (nl3Var2 = (nl3Var = this.M).f) != null && nl3Var2.f == nl3Var) {
                return nl3Var2.d;
            }
            return null;
        }
        nl3 nl3Var3 = this.L;
        nl3 nl3Var4 = nl3Var3.f;
        if (nl3Var4 == null || nl3Var4.f != nl3Var3) {
            return null;
        }
        return nl3Var4.d;
    }

    public final wm3 n(int i) {
        nl3 nl3Var;
        nl3 nl3Var2;
        if (i != 0) {
            if (i == 1 && (nl3Var2 = (nl3Var = this.K).f) != null && nl3Var2.f == nl3Var) {
                return nl3Var2.d;
            }
            return null;
        }
        nl3 nl3Var3 = this.J;
        nl3 nl3Var4 = nl3Var3.f;
        if (nl3Var4 == null || nl3Var4.f != nl3Var3) {
            return null;
        }
        return nl3Var4.d;
    }

    public void o(StringBuilder sb) {
        sb.append("  " + this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.V);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.W);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Z);
        sb.append("\n");
        sb.append("    actualTop:" + this.a0);
        sb.append("\n");
        q(sb, "left", this.J);
        q(sb, PlayerKt.E_SPORTS_TOP, this.K);
        q(sb, "right", this.L);
        q(sb, "bottom", this.M);
        q(sb, "baseline", this.N);
        q(sb, "centerX", this.O);
        q(sb, "centerY", this.P);
        int i = this.V;
        int i2 = this.c0;
        int[] iArr = this.D;
        int i3 = iArr[0];
        int i4 = this.v;
        int i5 = this.s;
        float f = this.x;
        int[] iArr2 = this.q0;
        int i6 = iArr2[0];
        float[] fArr = this.l0;
        float f2 = fArr[0];
        p(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.W;
        int i8 = this.d0;
        int i9 = iArr[1];
        int i10 = this.y;
        int i11 = this.t;
        float f3 = this.A;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        p(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.X;
        int i13 = this.Y;
        if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.e0, 0.5f);
        I(sb, "    verticalBias", this.f0, 0.5f);
        H(this.j0, 0, "    horizontalChainStyle", sb);
        H(this.k0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int r() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final int s() {
        xm3 xm3Var = this.U;
        return xm3Var != null ? xm3Var.y0 + this.Z : this.Z;
    }

    public final int t() {
        xm3 xm3Var = this.U;
        return xm3Var != null ? xm3Var.z0 + this.a0 : this.a0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.i0 != null ? mz1.o(new StringBuilder("id: "), this.i0, " ") : "");
        sb.append("(");
        sb.append(this.Z);
        sb.append(", ");
        sb.append(this.a0);
        sb.append(") - (");
        sb.append(this.V);
        sb.append(" x ");
        return fc6.h(this.W, ")", sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(int i) {
        if (i == 0) {
            return (this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2;
        }
        if ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) < 2) {
        }
    }

    public final boolean v(int i, int i2) {
        nl3 nl3Var;
        nl3 nl3Var2;
        nl3 nl3Var3;
        nl3 nl3Var4;
        if (i == 0) {
            nl3 nl3Var5 = this.J;
            nl3 nl3Var6 = nl3Var5.f;
            if (nl3Var6 == null || !nl3Var6.c || (nl3Var4 = (nl3Var3 = this.L).f) == null || !nl3Var4.c) {
                return false;
            }
            return (nl3Var4.d() - nl3Var3.e()) - (nl3Var5.e() + nl3Var5.f.d()) >= i2;
        }
        nl3 nl3Var7 = this.K;
        nl3 nl3Var8 = nl3Var7.f;
        if (nl3Var8 == null || !nl3Var8.c || (nl3Var2 = (nl3Var = this.M).f) == null || !nl3Var2.c) {
            return false;
        }
        return (nl3Var2.d() - nl3Var.e()) - (nl3Var7.e() + nl3Var7.f.d()) >= i2;
    }

    public final void w(int i, int i2, int i3, int i4, wm3 wm3Var) {
        j(i).b(wm3Var.j(i2), i3, i4, true);
    }

    public final boolean x(int i) {
        nl3 nl3Var;
        nl3 nl3Var2;
        int i2 = i * 2;
        nl3[] nl3VarArr = this.R;
        nl3 nl3Var3 = nl3VarArr[i2];
        nl3 nl3Var4 = nl3Var3.f;
        return (nl3Var4 == null || nl3Var4.f == nl3Var3 || (nl3Var2 = (nl3Var = nl3VarArr[i2 + 1]).f) == null || nl3Var2.f != nl3Var) ? false : true;
    }

    public final boolean y() {
        nl3 nl3Var = this.J;
        nl3 nl3Var2 = nl3Var.f;
        if (nl3Var2 != null && nl3Var2.f == nl3Var) {
            return true;
        }
        nl3 nl3Var3 = this.L;
        nl3 nl3Var4 = nl3Var3.f;
        return nl3Var4 != null && nl3Var4.f == nl3Var3;
    }

    public final boolean z() {
        nl3 nl3Var = this.K;
        nl3 nl3Var2 = nl3Var.f;
        if (nl3Var2 != null && nl3Var2.f == nl3Var) {
            return true;
        }
        nl3 nl3Var3 = this.M;
        nl3 nl3Var4 = nl3Var3.f;
        return nl3Var4 != null && nl3Var4.f == nl3Var3;
    }

    public wm3(int i, int i2) {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new j7l(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        nl3 nl3Var = new nl3(this, 2);
        this.J = nl3Var;
        nl3 nl3Var2 = new nl3(this, 3);
        this.K = nl3Var2;
        nl3 nl3Var3 = new nl3(this, 4);
        this.L = nl3Var3;
        nl3 nl3Var4 = new nl3(this, 5);
        this.M = nl3Var4;
        nl3 nl3Var5 = new nl3(this, 6);
        this.N = nl3Var5;
        this.O = new nl3(this, 8);
        this.P = new nl3(this, 9);
        nl3 nl3Var6 = new nl3(this, 7);
        this.Q = nl3Var6;
        this.R = new nl3[]{nl3Var, nl3Var3, nl3Var2, nl3Var4, nl3Var5, nl3Var6};
        this.S = new ArrayList();
        this.T = new boolean[2];
        this.q0 = new int[]{1, 1};
        this.U = null;
        this.X = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.Y = -1;
        this.b0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        this.h0 = 0;
        this.i0 = null;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = new float[]{-1.0f, -1.0f};
        this.m0 = new wm3[]{null, null};
        this.n0 = new wm3[]{null, null};
        this.o0 = -1;
        this.p0 = -1;
        this.Z = 0;
        this.a0 = 0;
        this.V = i;
        this.W = i2;
        a();
    }
}
