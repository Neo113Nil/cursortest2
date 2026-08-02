package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import defpackage.a70;
import defpackage.bm2;
import defpackage.c78;
import defpackage.ei3;
import defpackage.hvk;
import defpackage.kep;
import defpackage.yep;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzf implements zzaht {
    public zzv A;
    public boolean B;
    public boolean C;
    public final ei3 a;
    public final bm2 b;
    public final hvk c;
    public final zzus d;
    public kep e;
    public zzv f;
    public zzul g;
    public int h;
    public long[] i;
    public long[] j;
    public int[] k;
    public int[] l;
    public long[] m;
    public zzahs[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    public zzzf(zzabp zzabpVar, zzus zzusVar, zzun zzunVar) {
        this.d = zzusVar;
        ei3 ei3Var = new ei3();
        ei3Var.b = zzabpVar;
        ei3Var.c = new zzeu(32);
        c78 c78Var = new c78(0L, 9, (byte) 0);
        ei3Var.d = c78Var;
        ei3Var.e = c78Var;
        ei3Var.f = c78Var;
        this.a = ei3Var;
        this.b = new bm2(8);
        this.h = 1000;
        this.i = new long[1000];
        this.j = new long[1000];
        this.m = new long[1000];
        this.l = new int[1000];
        this.k = new int[1000];
        this.n = new zzahs[1000];
        hvk hvkVar = new hvk();
        hvkVar.b = new SparseArray();
        hvkVar.a = -1;
        this.c = hvkVar;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.z = true;
        this.y = true;
        this.B = true;
        this.v = -1;
        this.w = -1;
    }

    public final void a(zzv zzvVar, zzma zzmaVar) {
        zzv zzvVar2 = this.f;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.s;
        this.f = zzvVar;
        zzq zzqVar2 = zzvVar.s;
        zzus zzusVar = this.d;
        int c = zzusVar.c(zzvVar);
        zzt zztVar = new zzt(zzvVar);
        zztVar.O = c;
        zzmaVar.b = new zzv(zztVar);
        zzmaVar.a = this.g;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzut b = zzusVar.b(zzvVar);
            this.g = b;
            zzmaVar.a = b;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final int c(zzj zzjVar, int i, boolean z) {
        ei3 ei3Var = this.a;
        int j = ei3Var.j(i);
        c78 c78Var = (c78) ei3Var.f;
        zzabn zzabnVar = (zzabn) c78Var.d;
        byte[] bArr = zzabnVar.a;
        long j2 = ei3Var.a - c78Var.b;
        zzabnVar.getClass();
        int b = zzjVar.b((int) j2, j, bArr);
        if (b == -1) {
            if (z) {
                return -1;
            }
            a70.q();
            return 0;
        }
        long j3 = ei3Var.a + b;
        ei3Var.a = j3;
        c78 c78Var2 = (c78) ei3Var.f;
        if (j3 == c78Var2.c) {
            ei3Var.f = (c78) c78Var2.e;
        }
        return b;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void e(zzv zzvVar) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                this.z = false;
                if (!Objects.equals(zzvVar, this.A)) {
                    hvk hvkVar = this.c;
                    if (!(hvkVar.b.size() == 0)) {
                        if (((yep) hvkVar.b.valueAt(r2.size() - 1)).a.equals(zzvVar)) {
                            zzvVar = ((yep) hvkVar.b.valueAt(r6.size() - 1)).a;
                            this.A = zzvVar;
                            boolean z2 = this.B;
                            String str = zzvVar.o;
                            this.B = (zzas.f(str) != 1 && zzas.d(str, zzvVar.k)) & z2;
                            this.C = false;
                            z = true;
                        }
                    }
                    this.A = zzvVar;
                    boolean z22 = this.B;
                    String str2 = zzvVar.o;
                    this.B = (zzas.f(str2) != 1 && zzas.d(str2, zzvVar.k)) & z22;
                    this.C = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kep kepVar = this.e;
        if (kepVar == null || !z) {
            return;
        }
        kepVar.o.post(kepVar.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        if (((defpackage.yep) r10.b.valueAt(r11.size() - 1)).a.equals(r9.A) == false) goto L41;
     */
    @Override // com.google.android.gms.internal.ads.zzaht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j, int i, int i2, int i3, zzahs zzahsVar) {
        if (this.y) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.y = false;
            }
        }
        if (this.B) {
            if (j < this.s) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.C) {
                    zzeh.c("Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.A)));
                    this.C = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.a.a - i2) - i3;
        synchronized (this) {
            try {
                int i4 = this.o;
                if (i4 > 0) {
                    int j3 = j(i4 - 1);
                    zzguk.a(this.j[j3] + ((long) this.k[j3]) <= j2);
                }
                this.x = (536870912 & i) != 0;
                this.u = Math.max(this.u, j);
                int j4 = j(this.o);
                this.m[j4] = j;
                this.j[j4] = j2;
                this.k[j4] = i2;
                this.l[j4] = i;
                this.n[j4] = zzahsVar;
                this.i[j4] = 0;
                hvk hvkVar = this.c;
                if (!(hvkVar.b.size() == 0)) {
                }
                zzv zzvVar = this.A;
                if (zzvVar == null) {
                    throw null;
                }
                int i5 = this.p + this.o;
                yep yepVar = new yep(zzvVar);
                SparseArray sparseArray = hvkVar.b;
                if (hvkVar.a == -1) {
                    zzguk.f(sparseArray.size() == 0);
                    hvkVar.a = 0;
                }
                if (sparseArray.size() > 0) {
                    int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    zzguk.a(i5 >= keyAt);
                    if (keyAt == i5) {
                        ((yep) sparseArray.valueAt(sparseArray.size() - 1)).getClass();
                    }
                }
                sparseArray.append(i5, yepVar);
                int i6 = this.o + 1;
                this.o = i6;
                int i7 = this.h;
                if (i6 == i7) {
                    int i8 = i7 + 1000;
                    long[] jArr = new long[i8];
                    long[] jArr2 = new long[i8];
                    long[] jArr3 = new long[i8];
                    int[] iArr = new int[i8];
                    int[] iArr2 = new int[i8];
                    zzahs[] zzahsVarArr = new zzahs[i8];
                    int i9 = this.q;
                    int i10 = i7 - i9;
                    System.arraycopy(this.j, i9, jArr2, 0, i10);
                    System.arraycopy(this.m, this.q, jArr3, 0, i10);
                    System.arraycopy(this.l, this.q, iArr, 0, i10);
                    System.arraycopy(this.k, this.q, iArr2, 0, i10);
                    System.arraycopy(this.n, this.q, zzahsVarArr, 0, i10);
                    System.arraycopy(this.i, this.q, jArr, 0, i10);
                    int i11 = this.q;
                    System.arraycopy(this.j, 0, jArr2, i10, i11);
                    System.arraycopy(this.m, 0, jArr3, i10, i11);
                    System.arraycopy(this.l, 0, iArr, i10, i11);
                    System.arraycopy(this.k, 0, iArr2, i10, i11);
                    System.arraycopy(this.n, 0, zzahsVarArr, i10, i11);
                    System.arraycopy(this.i, 0, jArr, i10, i11);
                    this.j = jArr2;
                    this.m = jArr3;
                    this.l = iArr;
                    this.k = iArr2;
                    this.n = zzahsVarArr;
                    this.i = jArr;
                    this.q = 0;
                    this.h = i8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void g(zzeu zzeuVar, int i, int i2) {
        while (i > 0) {
            ei3 ei3Var = this.a;
            int j = ei3Var.j(i);
            c78 c78Var = (c78) ei3Var.f;
            zzabn zzabnVar = (zzabn) c78Var.d;
            byte[] bArr = zzabnVar.a;
            long j2 = ei3Var.a - c78Var.b;
            zzabnVar.getClass();
            zzeuVar.F((int) j2, j, bArr);
            i -= j;
            long j3 = ei3Var.a + j;
            ei3Var.a = j3;
            c78 c78Var2 = (c78) ei3Var.f;
            if (j3 == c78Var2.c) {
                ei3Var.f = (c78) c78Var2.e;
            }
        }
    }

    public final int h(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.m[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.h) {
                i = 0;
            }
        }
        return i3;
    }

    public final long i(int i) {
        long j = this.t;
        long j2 = Long.MIN_VALUE;
        int i2 = 0;
        if (i != 0) {
            int j3 = j(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.m[j3]);
                if ((this.l[j3] & 1) != 0) {
                    break;
                }
                j3--;
                if (j3 == -1) {
                    j3 = this.h - 1;
                }
            }
        }
        this.t = Math.max(j, j2);
        this.o -= i;
        int i4 = this.p + i;
        this.p = i4;
        int i5 = this.q + i;
        this.q = i5;
        int i6 = this.h;
        if (i5 >= i6) {
            this.q = i5 - i6;
        }
        int i7 = this.r - i;
        this.r = i7;
        if (i7 < 0) {
            this.r = 0;
        }
        while (true) {
            hvk hvkVar = this.c;
            SparseArray sparseArray = hvkVar.b;
            if (i2 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((yep) sparseArray.valueAt(i2)).getClass();
            sparseArray.removeAt(i2);
            int i9 = hvkVar.a;
            if (i9 > 0) {
                hvkVar.a = i9 - 1;
            }
            i2 = i8;
        }
        if (this.o != 0) {
            return this.j[this.q];
        }
        int i10 = this.q;
        if (i10 == 0) {
            i10 = this.h;
        }
        return this.j[i10 - 1] + this.k[r12];
    }

    public final int j(int i) {
        int i2 = this.q + i;
        int i3 = this.h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final void k(boolean z) {
        hvk hvkVar;
        SparseArray sparseArray;
        ei3 ei3Var = this.a;
        zzabp zzabpVar = (zzabp) ei3Var.b;
        c78 c78Var = (c78) ei3Var.d;
        if (((zzabn) c78Var.d) != null) {
            zzabpVar.c(c78Var);
            c78Var.d = null;
            c78Var.e = null;
        }
        c78 c78Var2 = (c78) ei3Var.d;
        int i = 0;
        zzguk.f(((zzabn) c78Var2.d) == null);
        c78Var2.b = 0L;
        c78Var2.c = 65536L;
        c78 c78Var3 = (c78) ei3Var.d;
        ei3Var.e = c78Var3;
        ei3Var.f = c78Var3;
        ei3Var.a = 0L;
        zzabpVar.zzd();
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.v = -1;
        this.w = -1;
        this.y = true;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.x = false;
        while (true) {
            hvkVar = this.c;
            sparseArray = hvkVar.b;
            if (i >= sparseArray.size()) {
                break;
            }
            ((yep) sparseArray.valueAt(i)).getClass();
            i++;
        }
        hvkVar.a = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.z = true;
            this.B = true;
        }
    }

    public final synchronized zzv l() {
        if (this.z) {
            return null;
        }
        return this.A;
    }

    public final synchronized boolean m(boolean z) {
        int i;
        try {
            int i2 = this.p;
            int i3 = this.r;
            int i4 = i2 + i3;
            int i5 = this.v;
            boolean z2 = true;
            if (i5 != -1 && i4 >= i5) {
                return true;
            }
            if (i3 != this.o) {
                if (!(i5 == -1 && (i = this.w) != -1 && i2 + i3 >= i)) {
                    if (((yep) this.c.a(i4)).a != this.f) {
                        return true;
                    }
                    int j = j(this.r);
                    if (this.g != null) {
                        int i6 = this.l[j];
                        z2 = false;
                    }
                    return z2;
                }
            }
            if (!z && !this.x) {
                zzv zzvVar = this.A;
                if (zzvVar == null) {
                    z2 = false;
                } else if (zzvVar == this.f) {
                    return false;
                }
            }
            return z2;
        } finally {
        }
    }

    public final synchronized boolean n(long j, boolean z) {
        zzzf zzzfVar;
        Throwable th;
        zzzf zzzfVar2;
        long j2;
        int h;
        try {
            try {
                synchronized (this) {
                    try {
                        this.r = 0;
                        ei3 ei3Var = this.a;
                        ei3Var.e = (c78) ei3Var.d;
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            zzzfVar = this;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zzzfVar = this;
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
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            zzzfVar = this;
        }
        try {
            int j3 = j(0);
            long j4 = this.u;
            int i = this.r;
            int i2 = this.o;
            if ((i != i2) && j >= this.m[j3]) {
                if (j > j4) {
                    if (z) {
                        z = true;
                    }
                }
                if (this.B) {
                    h = i2 - i;
                    int i3 = 0;
                    while (true) {
                        if (i3 < h) {
                            try {
                                if (this.m[j3] >= j) {
                                    zzzfVar2 = this;
                                    j2 = j;
                                    h = i3;
                                    break;
                                }
                                j3++;
                                if (j3 == this.h) {
                                    j3 = 0;
                                }
                                i3++;
                            } catch (Throwable th8) {
                                th = th8;
                                zzzfVar = this;
                                throw th;
                            }
                        } else {
                            zzzfVar2 = this;
                            j2 = j;
                            if (!z) {
                                h = -1;
                            }
                        }
                    }
                } else {
                    int i4 = i2 - i;
                    zzzfVar2 = this;
                    j2 = j;
                    h = zzzfVar2.h(j3, i4, j2, true);
                }
                if (h == -1) {
                    return false;
                }
                zzzfVar2.s = j2;
                zzzfVar2.r += h;
                return true;
            }
            zzzfVar2 = this;
            return false;
        } catch (Throwable th9) {
            th = th9;
            zzzfVar = this;
            th = th;
            throw th;
        }
    }

    public final void o() {
        long i;
        ei3 ei3Var = this.a;
        synchronized (this) {
            int i2 = this.o;
            i = i2 == 0 ? -1L : i(i2);
        }
        ei3Var.i(i);
    }
}
