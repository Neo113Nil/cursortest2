package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gpg implements usj {
    public boolean A;
    public boolean B;
    public final ei3 a;
    public final bm2 b;
    public final b10 c;
    public final jc5 d;
    public final bc5 e;
    public cdf f;
    public sm8 g;
    public hpo h;
    public int i;
    public int[] j;
    public long[] k;
    public int[] l;
    public int[] m;
    public long[] n;
    public ssj[] o;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public boolean y;
    public sm8 z;

    public gpg(zz0 zz0Var, jc5 jc5Var, bc5 bc5Var) {
        this.d = jc5Var;
        this.e = bc5Var;
        ei3 ei3Var = new ei3();
        ei3Var.b = zz0Var;
        ei3Var.c = new nkk(32);
        c78 c78Var = new c78(0L, 3, (byte) 0);
        ei3Var.d = c78Var;
        ei3Var.e = c78Var;
        ei3Var.f = c78Var;
        this.a = ei3Var;
        this.b = new bm2(3);
        this.i = 1000;
        this.j = new int[1000];
        this.k = new long[1000];
        this.n = new long[1000];
        this.m = new int[1000];
        this.l = new int[1000];
        this.o = new ssj[1000];
        this.c = new b10(new ilg(4));
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.y = true;
        this.x = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0104, code lost:
    
        if (r6 == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    @Override // defpackage.usj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sm8 sm8Var) {
        boolean z;
        String str;
        boolean z2;
        synchronized (this) {
            z = false;
            try {
                this.y = false;
                if (!lik.a(sm8Var, this.z)) {
                    if (!(((SparseArray) this.c.c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((dpg) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(sm8Var)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            sm8Var = ((dpg) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            this.z = sm8Var;
                            str = sm8Var.l;
                            String str2 = sm8Var.i;
                            ArrayList arrayList = rjc.a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        z2 = true;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null) {
                                            uif d = rjc.d(str2);
                                            if (d == null) {
                                                break;
                                            } else {
                                                int b = d.b();
                                                if (b != 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                                this.A = z2;
                                this.B = false;
                                z = true;
                            }
                            z2 = false;
                            this.A = z2;
                            this.B = false;
                            z = true;
                        }
                    }
                    this.z = sm8Var;
                    str = sm8Var.l;
                    String str22 = sm8Var.i;
                    ArrayList arrayList2 = rjc.a;
                    if (str != null) {
                    }
                    z2 = false;
                    this.A = z2;
                    this.B = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        cdf cdfVar = this.f;
        if (cdfVar == null || !z) {
            return;
        }
        cdfVar.o.post(cdfVar.m);
    }

    @Override // defpackage.usj
    public final int b(fe4 fe4Var, int i, boolean z) {
        ei3 ei3Var = this.a;
        int d = ei3Var.d(i);
        c78 c78Var = (c78) ei3Var.f;
        zo zoVar = (zo) c78Var.d;
        int read = fe4Var.read(zoVar.a, ((int) (ei3Var.a - c78Var.b)) + zoVar.b, d);
        if (read == -1) {
            if (z) {
                return -1;
            }
            a70.q();
            return 0;
        }
        long j = ei3Var.a + read;
        ei3Var.a = j;
        c78 c78Var2 = (c78) ei3Var.f;
        if (j == c78Var2.c) {
            ei3Var.f = (c78) c78Var2.e;
        }
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (((defpackage.dpg) r10.valueAt(r10.size() - 1)).a.equals(r9.z) == false) goto L43;
     */
    @Override // defpackage.usj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j, int i, int i2, int i3, ssj ssjVar) {
        int i4 = i & 1;
        boolean z = i4 != 0;
        if (this.x) {
            if (!z) {
                return;
            } else {
                this.x = false;
            }
        }
        if (this.A) {
            if (j < this.t) {
                return;
            }
            if (i4 == 0) {
                if (!this.B) {
                    Objects.toString(this.z);
                    m6k.f0();
                    this.B = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.a.a - i2) - i3;
        synchronized (this) {
            try {
                int i5 = this.p;
                if (i5 > 0) {
                    int h = h(i5 - 1);
                    qx9.r(this.k[h] + ((long) this.l[h]) <= j2);
                }
                this.w = (536870912 & i) != 0;
                this.v = Math.max(this.v, j);
                int h2 = h(this.p);
                this.n[h2] = j;
                this.k[h2] = j2;
                this.l[h2] = i2;
                this.m[h2] = i;
                this.o[h2] = ssjVar;
                this.j[h2] = 0;
                if (!(((SparseArray) this.c.c).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.c.c;
                }
                hc5 hc5Var = hc5.b;
                b10 b10Var = this.c;
                int i6 = this.q + this.p;
                sm8 sm8Var = this.z;
                sm8Var.getClass();
                dpg dpgVar = new dpg(hc5Var, sm8Var);
                SparseArray sparseArray2 = (SparseArray) b10Var.c;
                if (b10Var.b == -1) {
                    qx9.t(sparseArray2.size() == 0);
                    b10Var.b = 0;
                }
                if (sparseArray2.size() > 0) {
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    qx9.r(i6 >= keyAt);
                    if (keyAt == i6) {
                        ((ilg) b10Var.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                    }
                }
                sparseArray2.append(i6, dpgVar);
                int i7 = this.p + 1;
                this.p = i7;
                int i8 = this.i;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    int[] iArr = new int[i9];
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    int[] iArr2 = new int[i9];
                    int[] iArr3 = new int[i9];
                    ssj[] ssjVarArr = new ssj[i9];
                    int i10 = this.r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.k, i10, jArr, 0, i11);
                    System.arraycopy(this.n, this.r, jArr2, 0, i11);
                    System.arraycopy(this.m, this.r, iArr2, 0, i11);
                    System.arraycopy(this.l, this.r, iArr3, 0, i11);
                    System.arraycopy(this.o, this.r, ssjVarArr, 0, i11);
                    System.arraycopy(this.j, this.r, iArr, 0, i11);
                    int i12 = this.r;
                    System.arraycopy(this.k, 0, jArr, i11, i12);
                    System.arraycopy(this.n, 0, jArr2, i11, i12);
                    System.arraycopy(this.m, 0, iArr2, i11, i12);
                    System.arraycopy(this.l, 0, iArr3, i11, i12);
                    System.arraycopy(this.o, 0, ssjVarArr, i11, i12);
                    System.arraycopy(this.j, 0, iArr, i11, i12);
                    this.k = jArr;
                    this.n = jArr2;
                    this.m = iArr2;
                    this.l = iArr3;
                    this.o = ssjVarArr;
                    this.j = iArr;
                    this.r = 0;
                    this.i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.usj
    public final void d(int i, nkk nkkVar) {
        while (i > 0) {
            ei3 ei3Var = this.a;
            int d = ei3Var.d(i);
            c78 c78Var = (c78) ei3Var.f;
            zo zoVar = (zo) c78Var.d;
            nkkVar.e(zoVar.a, ((int) (ei3Var.a - c78Var.b)) + zoVar.b, d);
            i -= d;
            long j = ei3Var.a + d;
            ei3Var.a = j;
            c78 c78Var2 = (c78) ei3Var.f;
            if (j == c78Var2.c) {
                ei3Var.f = (c78) c78Var2.e;
            }
        }
    }

    public final long e(int i) {
        long j = this.u;
        int i2 = 0;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int h = h(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.n[h]);
                if ((this.m[h] & 1) != 0) {
                    break;
                }
                h--;
                if (h == -1) {
                    h = this.i - 1;
                }
            }
        }
        this.u = Math.max(j, j2);
        this.p -= i;
        int i4 = this.q + i;
        this.q = i4;
        int i5 = this.r + i;
        this.r = i5;
        int i6 = this.i;
        if (i5 >= i6) {
            this.r = i5 - i6;
        }
        int i7 = this.s - i;
        this.s = i7;
        if (i7 < 0) {
            this.s = 0;
        }
        b10 b10Var = this.c;
        SparseArray sparseArray = (SparseArray) b10Var.c;
        while (i2 < sparseArray.size() - 1) {
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((ilg) b10Var.d).accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = b10Var.b;
            if (i9 > 0) {
                b10Var.b = i9 - 1;
            }
            i2 = i8;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i10 = this.r;
        if (i10 == 0) {
            i10 = this.i;
        }
        return this.k[i10 - 1] + this.l[r11];
    }

    public final void f() {
        long e;
        ei3 ei3Var = this.a;
        synchronized (this) {
            int i = this.p;
            e = i == 0 ? -1L : e(i);
        }
        ei3Var.b(e);
    }

    public final int g(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public final int h(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized boolean i(boolean z) {
        sm8 sm8Var;
        int i = this.s;
        boolean z2 = false;
        if (i != this.p) {
            if (((dpg) this.c.k(this.q + i)).a != this.g) {
                return true;
            }
            return j(h(this.s));
        }
        if (z || this.w || ((sm8Var = this.z) != null && sm8Var != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean j(int i) {
        hpo hpoVar = this.h;
        if (hpoVar == null || hpoVar.x() == 4) {
            return true;
        }
        if ((this.m[i] & 1073741824) != 0) {
            return false;
        }
        this.h.getClass();
        return false;
    }

    public final void k(sm8 sm8Var, fp4 fp4Var) {
        sm8 sm8Var2 = this.g;
        boolean z = sm8Var2 == null;
        DrmInitData drmInitData = z ? null : sm8Var2.o;
        this.g = sm8Var;
        DrmInitData drmInitData2 = sm8Var.o;
        jc5 jc5Var = this.d;
        int d = jc5Var.d(sm8Var);
        pm8 a = sm8Var.a();
        a.D = d;
        fp4Var.c = new sm8(a);
        fp4Var.b = this.h;
        if (z || !lik.a(drmInitData, drmInitData2)) {
            hpo hpoVar = this.h;
            bc5 bc5Var = this.e;
            hpo c = jc5Var.c(bc5Var, sm8Var);
            this.h = c;
            fp4Var.b = c;
            if (hpoVar != null) {
                hpoVar.D(bc5Var);
            }
        }
    }

    public final void l(boolean z) {
        ei3 ei3Var = this.a;
        c78 c78Var = (c78) ei3Var.d;
        if (((zo) c78Var.d) != null) {
            zz0 zz0Var = (zz0) ei3Var.b;
            synchronized (zz0Var) {
                c78 c78Var2 = c78Var;
                while (c78Var2 != null) {
                    try {
                        zo[] zoVarArr = (zo[]) zz0Var.e;
                        int i = zz0Var.d;
                        zz0Var.d = i + 1;
                        zo zoVar = (zo) c78Var2.d;
                        zoVar.getClass();
                        zoVarArr[i] = zoVar;
                        zz0Var.c--;
                        c78Var2 = (c78) c78Var2.e;
                        if (c78Var2 == null || ((zo) c78Var2.d) == null) {
                            c78Var2 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zz0Var.notifyAll();
            }
            c78Var.d = null;
            c78Var.e = null;
        }
        c78 c78Var3 = (c78) ei3Var.d;
        qx9.t(((zo) c78Var3.d) == null);
        c78Var3.b = 0L;
        c78Var3.c = 65536L;
        c78 c78Var4 = (c78) ei3Var.d;
        ei3Var.e = c78Var4;
        ei3Var.f = c78Var4;
        ei3Var.a = 0L;
        ((zz0) ei3Var.b).c0();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        b10 b10Var = this.c;
        SparseArray sparseArray = (SparseArray) b10Var.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((ilg) b10Var.d).accept(sparseArray.valueAt(i2));
        }
        b10Var.b = -1;
        sparseArray.clear();
        if (z) {
            this.z = null;
            this.y = true;
        }
    }

    public final synchronized boolean m(long j, boolean z) {
        try {
            try {
                synchronized (this) {
                    try {
                        this.s = 0;
                        ei3 ei3Var = this.a;
                        ei3Var.e = (c78) ei3Var.d;
                        int h = h(0);
                        int i = this.s;
                        int i2 = this.p;
                        if ((i != i2) && j >= this.n[h]) {
                            if (j <= this.v || z) {
                                int g = g(h, i2 - i, j, true);
                                if (g == -1) {
                                    return false;
                                }
                                this.t = j;
                                this.s += g;
                                return true;
                            }
                        }
                        return false;
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th = th;
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }
}
