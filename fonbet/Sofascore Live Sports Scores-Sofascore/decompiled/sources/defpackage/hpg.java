package defpackage;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class hpg implements vsj {
    public boolean B;
    public b C;
    public b D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final cpg a;
    public final kc5 d;
    public final cc5 e;
    public fpg f;
    public b g;
    public xb5 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean y;
    public final bm2 b = new bm2(4);
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public tsj[] o = new tsj[1000];
    public final b10 c = new b10(new ilg(5), (byte) 0);
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean z = true;
    public boolean F = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;

    public hpg(l2a l2aVar, kc5 kc5Var, cc5 cc5Var) {
        this.d = kc5Var;
        this.e = cc5Var;
        this.a = new cpg(l2aVar);
    }

    public final boolean A(int i) {
        xb5 xb5Var = this.h;
        if (xb5Var == null || xb5Var.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.b();
    }

    public final void B() {
        xb5 xb5Var = this.h;
        if (xb5Var == null || xb5Var.getState() != 1) {
            return;
        }
        wb5 error = this.h.getError();
        error.getClass();
        throw error;
    }

    public final void C(b bVar, fp4 fp4Var) {
        b bVar2;
        b bVar3 = this.g;
        boolean z = bVar3 == null;
        DrmInitData drmInitData = bVar3 == null ? null : bVar3.s;
        this.g = bVar;
        DrmInitData drmInitData2 = bVar.s;
        kc5 kc5Var = this.d;
        if (kc5Var != null) {
            int e = kc5Var.e(bVar);
            qm8 a = bVar.a();
            a.O = e;
            bVar2 = new b(a);
        } else {
            bVar2 = bVar;
        }
        fp4Var.c = bVar2;
        fp4Var.b = this.h;
        if (kc5Var == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            xb5 xb5Var = this.h;
            cc5 cc5Var = this.e;
            xb5 d = kc5Var.d(cc5Var, bVar);
            this.h = d;
            fp4Var.b = d;
            if (xb5Var != null) {
                xb5Var.d(cc5Var);
            }
        }
    }

    public final synchronized long D() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[v(this.s)] : this.E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x008f, code lost:
    
        if (r11.y != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0091, code lost:
    
        if (r5 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0094, code lost:
    
        r15 = r11.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0096, code lost:
    
        if (r15 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0098, code lost:
    
        if (r0 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009c, code lost:
    
        if (r15 == r11.g) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009e, code lost:
    
        C(r15, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int E(fp4 fp4Var, im4 im4Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        bm2 bm2Var = this.b;
        synchronized (this) {
            im4Var.j = false;
            int u = u();
            int i3 = this.x;
            boolean z3 = i3 != -1 && u >= i3;
            i2 = -5;
            if ((this.s != this.p) && !z3) {
                b bVar = ((epg) this.c.k(u)).a;
                if (!z2 && bVar == this.g) {
                    int v = v(this.s);
                    if (A(v)) {
                        im4Var.b = this.m[v];
                        if (this.s == this.p - 1 && (z || this.y)) {
                            im4Var.b(536870912);
                        }
                        im4Var.k = this.n[v];
                        bm2Var.c = this.l[v];
                        bm2Var.b = this.k[v];
                        bm2Var.d = this.o[v];
                        i2 = -4;
                    } else {
                        im4Var.j = true;
                        i2 = -3;
                    }
                }
                C(bVar, fp4Var);
            }
            im4Var.b = 4;
            im4Var.k = Long.MIN_VALUE;
            i2 = -4;
        }
        if (i2 == -4 && !im4Var.i(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                cpg cpgVar = this.a;
                bm2 bm2Var2 = this.b;
                if (z4) {
                    cpg.e(cpgVar.e, im4Var, bm2Var2, cpgVar.c);
                } else {
                    cpgVar.e = cpg.e(cpgVar.e, im4Var, bm2Var2, cpgVar.c);
                }
            }
            if (!z4) {
                this.s++;
            }
        }
        return i2;
    }

    public final void F(boolean z) {
        cpg cpgVar = this.a;
        c78 c78Var = cpgVar.d;
        if (((ap) c78Var.d) != null) {
            l2a l2aVar = cpgVar.a;
            synchronized (l2aVar) {
                ((yq4) l2aVar.d).c.W(c78Var);
                c78 c78Var2 = c78Var;
                while (c78Var2 != null) {
                    ap apVar = (ap) c78Var2.d;
                    apVar.getClass();
                    l2aVar.G(apVar);
                    c78Var2 = (c78) c78Var2.e;
                    if (c78Var2 == null || ((ap) c78Var2.d) == null) {
                        c78Var2 = null;
                    }
                }
            }
            c78Var.d = null;
            c78Var.e = null;
        }
        c78 c78Var3 = cpgVar.d;
        int i = cpgVar.b;
        z1a.E(((ap) c78Var3.d) == null);
        c78Var3.b = 0L;
        c78Var3.c = i;
        c78 c78Var4 = cpgVar.d;
        cpgVar.e = c78Var4;
        cpgVar.f = c78Var4;
        cpgVar.g = 0L;
        l2a l2aVar2 = cpgVar.a;
        synchronized (l2aVar2) {
            ((yq4) l2aVar2.d).c.c0();
        }
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.z = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.y = false;
        b10 b10Var = this.c;
        SparseArray sparseArray = (SparseArray) b10Var.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((ilg) b10Var.d).accept(sparseArray.valueAt(i2));
        }
        b10Var.b = -1;
        sparseArray.clear();
        if (z) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized boolean G(int i) {
        synchronized (this) {
            this.s = 0;
            cpg cpgVar = this.a;
            cpgVar.e = cpgVar.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            int i3 = this.x;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean H(long j, boolean z) {
        Throwable th;
        hpg hpgVar;
        hpg hpgVar2;
        long j2;
        int p;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.s = 0;
                                cpg cpgVar = this.a;
                                cpgVar.e = cpgVar.d;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    hpgVar = this;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                hpgVar = this;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th6) {
                        th = th6;
                        hpgVar = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            int v = v(0);
            long j3 = this.u;
            long j4 = this.w;
            if (j3 != Long.MIN_VALUE) {
                try {
                    j4 = Math.min(j4, j3);
                } catch (Throwable th8) {
                    th = th8;
                    hpgVar = this;
                    throw th;
                }
            }
            int i = this.s;
            int i2 = this.p;
            if (!(i != i2) || j < this.n[v] || (j > j4 && !z)) {
                return false;
            }
            if (this.F) {
                hpgVar2 = this;
                j2 = j;
                p = hpgVar2.o(v, i2 - i, j2, z);
            } else {
                hpgVar2 = this;
                j2 = j;
                p = hpgVar2.p(v, i2 - i, j2, true);
            }
            if (p == -1) {
                return false;
            }
            hpgVar2.t = j2;
            hpgVar2.s += p;
            return true;
        } catch (Throwable th9) {
            th = th9;
            hpgVar = this;
            th = th;
            throw th;
        }
    }

    public final synchronized void I(long j) {
        hpg hpgVar;
        Throwable th;
        hpg hpgVar2;
        long j2;
        int i;
        try {
            try {
                if (j == this.u) {
                    return;
                }
                int i2 = -1;
                if (j == Long.MIN_VALUE) {
                    try {
                        this.x = -1;
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        hpgVar = this;
                        throw th;
                    }
                }
                if (j <= this.w) {
                    hpgVar2 = this;
                    j2 = j;
                    i = hpgVar2.o(this.r, this.p, j2, false);
                } else {
                    hpgVar2 = this;
                    j2 = j;
                    i = -1;
                }
                if (i != -1) {
                    i2 = hpgVar2.q + i;
                }
                hpgVar2.x = i2;
                hpgVar2.u = j2;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            hpgVar = this;
            th = th;
            throw th;
        }
    }

    public final synchronized void J(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    z1a.s(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        z1a.s(z);
        this.s += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        if (((defpackage.epg) r10.valueAt(r10.size() - 1)).a.equals(r9.D) == false) goto L82;
     */
    @Override // defpackage.vsj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j, int i, int i2, int i3, tsj tsjVar) {
        boolean z;
        if (this.B) {
            b bVar = this.C;
            bVar.getClass();
            d(bVar);
        }
        int i4 = i & 1;
        boolean z2 = i4 != 0;
        if (this.z) {
            if (!z2) {
                return;
            } else {
                this.z = false;
            }
        }
        long j2 = j + this.H;
        if (this.F) {
            if (j2 < this.t) {
                return;
            }
            if (i4 == 0) {
                if (!this.G) {
                    tgj.d0("Overriding unexpected non-sync sample for format: " + this.D);
                    this.G = true;
                }
                i |= 1;
            }
        }
        if (this.I) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.p == 0) {
                    z = j2 > this.v;
                } else if (s() >= j2) {
                    z = false;
                } else {
                    m(this.q + h(j2));
                    z = true;
                }
            }
            if (!z) {
                return;
            } else {
                this.I = false;
            }
        }
        long j3 = (this.a.g - i2) - i3;
        synchronized (this) {
            try {
                int i5 = this.p;
                if (i5 > 0) {
                    int v = v(i5 - 1);
                    z1a.s(this.k[v] + ((long) this.l[v]) <= j3);
                }
                this.y = (536870912 & i) != 0;
                this.w = Math.max(this.w, j2);
                long j4 = this.u;
                if (j4 != Long.MIN_VALUE && this.x == -1 && j2 >= j4) {
                    this.x = this.q + this.p;
                }
                int v2 = v(this.p);
                this.n[v2] = j2;
                this.k[v2] = j3;
                this.l[v2] = i2;
                this.m[v2] = i;
                this.o[v2] = tsjVar;
                this.j[v2] = this.E;
                if (!(((SparseArray) this.c.c).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.c.c;
                }
                b bVar2 = this.D;
                bVar2.getClass();
                kc5 kc5Var = this.d;
                ic5 b = kc5Var != null ? kc5Var.b(this.e, bVar2) : ic5.n7;
                b10 b10Var = this.c;
                int i6 = this.q + this.p;
                epg epgVar = new epg(bVar2, b);
                SparseArray sparseArray2 = (SparseArray) b10Var.c;
                if (b10Var.b == -1) {
                    z1a.E(sparseArray2.size() == 0);
                    b10Var.b = 0;
                }
                if (sparseArray2.size() > 0) {
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    z1a.s(i6 >= keyAt);
                    if (keyAt == i6) {
                        ((ilg) b10Var.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                    }
                }
                sparseArray2.append(i6, epgVar);
                int i7 = this.p + 1;
                this.p = i7;
                int i8 = this.i;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    tsj[] tsjVarArr = new tsj[i9];
                    int i10 = this.r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.k, i10, jArr2, 0, i11);
                    System.arraycopy(this.n, this.r, jArr3, 0, i11);
                    System.arraycopy(this.m, this.r, iArr, 0, i11);
                    System.arraycopy(this.l, this.r, iArr2, 0, i11);
                    System.arraycopy(this.o, this.r, tsjVarArr, 0, i11);
                    System.arraycopy(this.j, this.r, jArr, 0, i11);
                    int i12 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i11, i12);
                    System.arraycopy(this.n, 0, jArr3, i11, i12);
                    System.arraycopy(this.m, 0, iArr, i11, i12);
                    System.arraycopy(this.l, 0, iArr2, i11, i12);
                    System.arraycopy(this.o, 0, tsjVarArr, i11, i12);
                    System.arraycopy(this.j, 0, jArr, i11, i12);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = tsjVarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vsj
    public final void b(j9e j9eVar, int i, int i2) {
        while (i > 0) {
            cpg cpgVar = this.a;
            int b = cpgVar.b(i);
            c78 c78Var = cpgVar.f;
            ap apVar = (ap) c78Var.d;
            j9eVar.k(apVar.a, ((int) (cpgVar.g - c78Var.b)) + apVar.b, b);
            i -= b;
            long j = cpgVar.g + b;
            cpgVar.g = j;
            c78 c78Var2 = cpgVar.f;
            if (j == c78Var2.c) {
                cpgVar.f = (c78) c78Var2.e;
            }
        }
    }

    @Override // defpackage.vsj
    public final void d(b bVar) {
        b q = q(bVar);
        boolean z = false;
        this.B = false;
        this.C = bVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(q, this.D)) {
                    if (!(((SparseArray) this.c.c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((epg) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(q)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            q = ((epg) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            this.D = q;
                            boolean z2 = this.F;
                            String str = q.o;
                            this.F = z2 & (sjc.i(str) != 1 && sjc.a(str, q.k));
                            this.G = false;
                            z = true;
                        }
                    }
                    this.D = q;
                    boolean z22 = this.F;
                    String str2 = q.o;
                    this.F = z22 & (sjc.i(str2) != 1 && sjc.a(str2, q.k));
                    this.G = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fpg fpgVar = this.f;
        if (fpgVar == null || !z) {
            return;
        }
        fpgVar.e();
    }

    @Override // defpackage.vsj
    public final int e(ge4 ge4Var, int i, boolean z) {
        cpg cpgVar = this.a;
        int b = cpgVar.b(i);
        c78 c78Var = cpgVar.f;
        ap apVar = (ap) c78Var.d;
        int read = ge4Var.read(apVar.a, ((int) (cpgVar.g - c78Var.b)) + apVar.b, b);
        if (read == -1) {
            if (z) {
                return -1;
            }
            a70.q();
            return 0;
        }
        long j = cpgVar.g + read;
        cpgVar.g = j;
        c78 c78Var2 = cpgVar.f;
        if (j == c78Var2.c) {
            cpgVar.f = (c78) c78Var2.e;
        }
        return read;
    }

    public final int h(long j) {
        int i = this.p;
        int v = v(i - 1);
        while (i > this.s && this.n[v] >= j) {
            i--;
            v--;
            if (v == -1) {
                v = this.i - 1;
            }
        }
        return i;
    }

    public final long i(int i) {
        this.v = Math.max(this.v, t(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        b10 b10Var = this.c;
        SparseArray sparseArray = (SparseArray) b10Var.c;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((ilg) b10Var.d).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = b10Var.b;
            if (i8 > 0) {
                b10Var.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        return this.k[i9 - 1] + this.l[r7];
    }

    public final void j(long j, boolean z, boolean z2) {
        hpg hpgVar;
        Throwable th;
        long j2;
        cpg cpgVar = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    j2 = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z2) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    hpgVar = this;
                                    throw th;
                                }
                            }
                            int p = p(i2, i, j, z);
                            if (p != -1) {
                                j2 = i(p);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                hpgVar = this;
                th = th;
                throw th;
            }
        }
        cpgVar.a(j2);
    }

    public final void k() {
        long i;
        cpg cpgVar = this.a;
        synchronized (this) {
            int i2 = this.p;
            i = i2 == 0 ? -1L : i(i2);
        }
        cpgVar.a(i);
    }

    public final void l(long j) {
        if (this.p == 0) {
            return;
        }
        z1a.s(j > s());
        n(this.q + h(j));
    }

    public final long m(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        z1a.s(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.w = Math.max(this.v, t(i5));
        if (i4 == 0 && this.y) {
            z = true;
        }
        this.y = z;
        int i6 = this.x;
        if (i6 != -1 && i < i6) {
            this.x = -1;
        }
        b10 b10Var = this.c;
        SparseArray sparseArray = (SparseArray) b10Var.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((ilg) b10Var.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        b10Var.b = sparseArray.size() > 0 ? Math.min(b10Var.b, sparseArray.size() - 1) : -1;
        int i7 = this.p;
        if (i7 == 0) {
            return 0L;
        }
        return this.k[v(i7 - 1)] + this.l[r9];
    }

    public final void n(int i) {
        c78 c78Var;
        cpg cpgVar = this.a;
        long m = m(i);
        int i2 = cpgVar.b;
        z1a.s(m <= cpgVar.g);
        cpgVar.g = m;
        if (m != 0) {
            c78 c78Var2 = cpgVar.d;
            if (m != c78Var2.b) {
                while (true) {
                    long j = cpgVar.g;
                    long j2 = c78Var2.c;
                    c78Var = (c78) c78Var2.e;
                    if (j <= j2) {
                        break;
                    } else {
                        c78Var2 = c78Var;
                    }
                }
                c78Var.getClass();
                if (((ap) c78Var.d) != null) {
                    l2a l2aVar = cpgVar.a;
                    synchronized (l2aVar) {
                        ((yq4) l2aVar.d).c.W(c78Var);
                        c78 c78Var3 = c78Var;
                        while (c78Var3 != null) {
                            ap apVar = (ap) c78Var3.d;
                            apVar.getClass();
                            l2aVar.G(apVar);
                            c78Var3 = (c78) c78Var3.e;
                            if (c78Var3 == null || ((ap) c78Var3.d) == null) {
                                c78Var3 = null;
                            }
                        }
                    }
                    c78Var.d = null;
                    c78Var.e = null;
                }
                c78 c78Var4 = new c78(c78Var2.c, i2);
                c78Var2.e = c78Var4;
                if (cpgVar.g == c78Var2.c) {
                    c78Var2 = c78Var4;
                }
                cpgVar.f = c78Var2;
                if (cpgVar.e == c78Var) {
                    cpgVar.e = c78Var4;
                    return;
                }
                return;
            }
        }
        c78 c78Var5 = cpgVar.d;
        if (((ap) c78Var5.d) != null) {
            l2a l2aVar2 = cpgVar.a;
            synchronized (l2aVar2) {
                ((yq4) l2aVar2.d).c.W(c78Var5);
                c78 c78Var6 = c78Var5;
                while (c78Var6 != null) {
                    ap apVar2 = (ap) c78Var6.d;
                    apVar2.getClass();
                    l2aVar2.G(apVar2);
                    c78Var6 = (c78) c78Var6.e;
                    if (c78Var6 == null || ((ap) c78Var6.d) == null) {
                        c78Var6 = null;
                    }
                }
            }
            c78Var5.d = null;
            c78Var5.e = null;
        }
        c78 c78Var7 = new c78(cpgVar.g, i2);
        cpgVar.d = c78Var7;
        cpgVar.e = c78Var7;
        cpgVar.f = c78Var7;
    }

    public final int o(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.n[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    public final int p(int i, int i2, long j, boolean z) {
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

    public b q(b bVar) {
        if (this.H == 0 || bVar.t == Long.MAX_VALUE) {
            return bVar;
        }
        qm8 a = bVar.a();
        a.s = bVar.t + this.H;
        return new b(a);
    }

    public final synchronized long r() {
        return this.w;
    }

    public final synchronized long s() {
        return Math.max(this.v, t(this.s));
    }

    public final long t(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int v = v(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[v]);
            if ((this.m[v] & 1) != 0) {
                return j;
            }
            v--;
            if (v == -1) {
                v = this.i - 1;
            }
        }
        return j;
    }

    public final int u() {
        return this.q + this.s;
    }

    public final int v(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int w(long j, boolean z) {
        try {
            try {
                int v = v(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[v]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int p = p(v, i2 - i, j, true);
                if (p == -1) {
                    return 0;
                }
                return p;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized b x() {
        return this.A ? null : this.D;
    }

    public final synchronized boolean y() {
        return this.x != -1;
    }

    public final synchronized boolean z(boolean z) {
        b bVar;
        int u = u();
        int i = this.x;
        boolean z2 = true;
        if (i != -1 && u >= i) {
            return true;
        }
        if (this.s != this.p) {
            if (((epg) this.c.k(u)).a != this.g) {
                return true;
            }
            return A(v(this.s));
        }
        if (!z && !this.y && ((bVar = this.D) == null || bVar == this.g)) {
            z2 = false;
        }
        return z2;
    }
}
