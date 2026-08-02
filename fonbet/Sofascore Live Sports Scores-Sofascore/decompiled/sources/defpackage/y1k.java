package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y1k implements kl6 {
    public final int a;
    public final int b;
    public final List c;
    public final nkk d;
    public final SparseIntArray e;
    public final sz8 f;
    public final SparseArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final mgf j;
    public x68 k;
    public ol6 l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public d2k q;
    public int r;
    public int s;

    public y1k() {
        cjj cjjVar = new cjj(0L);
        this.f = new sz8(22);
        this.b = 112800;
        this.a = 1;
        this.c = Collections.singletonList(cjjVar);
        this.d = new nkk(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.h = sparseBooleanArray;
        this.i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.e = new SparseIntArray();
        this.j = new mgf(1);
        this.l = ol6.o7;
        this.s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), (d2k) sparseArray2.valueAt(i));
        }
        sparseArray.put(0, new pzg(new y3g(this)));
        this.q = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // defpackage.kl6
    public final int b(ml6 ml6Var, b78 b78Var) {
        ml6 ml6Var2;
        int i;
        int i2;
        ?? r3;
        int i3;
        boolean z;
        long j;
        long j2;
        long j3 = ((ap4) ml6Var).c;
        boolean z2 = this.n;
        int i4 = this.a;
        if (z2) {
            long j4 = C.TIME_UNSET;
            mgf mgfVar = this.j;
            if (j3 != -1 && i4 != 2 && !mgfVar.d) {
                int i5 = this.s;
                cjj cjjVar = mgfVar.b;
                nkk nkkVar = mgfVar.c;
                if (i5 <= 0) {
                    mgfVar.a(ml6Var);
                    return 0;
                }
                if (mgfVar.f) {
                    if (mgfVar.h == C.TIME_UNSET) {
                        mgfVar.a(ml6Var);
                        return 0;
                    }
                    if (mgfVar.e) {
                        long j5 = mgfVar.g;
                        if (j5 == C.TIME_UNSET) {
                            mgfVar.a(ml6Var);
                            return 0;
                        }
                        long b = cjjVar.b(mgfVar.h) - cjjVar.b(j5);
                        mgfVar.i = b;
                        if (b < 0) {
                            m6k.f0();
                            mgfVar.i = C.TIME_UNSET;
                        }
                        mgfVar.a(ml6Var);
                        return 0;
                    }
                    ap4 ap4Var = (ap4) ml6Var;
                    int min = (int) Math.min(112800L, ap4Var.c);
                    if (ap4Var.d != 0) {
                        b78Var.a = 0L;
                        return 1;
                    }
                    nkkVar.B(min);
                    ap4Var.f = 0;
                    ap4Var.peekFully(nkkVar.a, 0, min, false);
                    int i6 = nkkVar.b;
                    int i7 = nkkVar.c;
                    while (true) {
                        if (i6 >= i7) {
                            j2 = -9223372036854775807L;
                            break;
                        }
                        if (nkkVar.a[i6] == 71) {
                            j2 = qha.N(nkkVar, i6, i5);
                            if (j2 != C.TIME_UNSET) {
                                break;
                            }
                        }
                        i6++;
                    }
                    mgfVar.g = j2;
                    mgfVar.e = true;
                    return 0;
                }
                ap4 ap4Var2 = (ap4) ml6Var;
                long j6 = ap4Var2.c;
                int min2 = (int) Math.min(112800L, j6);
                long j7 = j6 - min2;
                if (ap4Var2.d != j7) {
                    b78Var.a = j7;
                    return 1;
                }
                nkkVar.B(min2);
                ap4Var2.f = 0;
                ap4Var2.peekFully(nkkVar.a, 0, min2, false);
                int i8 = nkkVar.b;
                int i9 = nkkVar.c;
                int i10 = i9 - 188;
                while (true) {
                    if (i10 < i8) {
                        break;
                    }
                    byte[] bArr = nkkVar.a;
                    int i11 = -4;
                    int i12 = 0;
                    while (true) {
                        if (i11 > 4) {
                            break;
                        }
                        int i13 = (i11 * 188) + i10;
                        if (i13 < i8 || i13 >= i9 || bArr[i13] != 71) {
                            i12 = 0;
                        } else {
                            i12++;
                            if (i12 == 5) {
                                long N = qha.N(nkkVar, i10, i5);
                                if (N != C.TIME_UNSET) {
                                    j4 = N;
                                    break;
                                }
                            }
                        }
                        i11++;
                    }
                    i10--;
                }
                mgfVar.h = j4;
                mgfVar.f = true;
                return 0;
            }
            if (this.o) {
                i = i4;
                i2 = 1;
                z = false;
                j = 0;
                j3 = j3;
            } else {
                this.o = true;
                long j8 = mgfVar.i;
                if (j8 != C.TIME_UNSET) {
                    j3 = j3;
                    i = i4;
                    z = false;
                    j = 0;
                    i2 = 1;
                    x68 x68Var = new x68(new inb(17), new j12(this.s, mgfVar.b, this.b), j8, j8 + 1, 0L, j3, 188L, 940);
                    this.k = x68Var;
                    this.l.d((yv1) x68Var.c);
                } else {
                    i2 = 1;
                    i = i4;
                    z = false;
                    j = 0;
                    j3 = j3;
                    this.l.d(new aw0(j8));
                }
            }
            if (this.p) {
                this.p = z;
                seek(j, j);
                if (((ap4) ml6Var).d != j) {
                    b78Var.a = j;
                    return i2;
                }
            }
            x68 x68Var2 = this.k;
            if (x68Var2 != null && ((aw1) x68Var2.e) != null) {
                return x68Var2.a(ml6Var, b78Var);
            }
            ml6Var2 = ml6Var;
            r3 = z;
        } else {
            ml6Var2 = ml6Var;
            i = i4;
            i2 = 1;
            r3 = 0;
        }
        nkk nkkVar2 = this.d;
        byte[] bArr2 = nkkVar2.a;
        if (9400 - nkkVar2.b < 188) {
            int c = nkkVar2.c();
            if (c > 0) {
                System.arraycopy(bArr2, nkkVar2.b, bArr2, r3, c);
            }
            nkkVar2.C(bArr2, c);
        }
        while (nkkVar2.c() < 188) {
            int i14 = nkkVar2.c;
            int read = ((ap4) ml6Var2).read(bArr2, i14, 9400 - i14);
            if (read == -1) {
                return -1;
            }
            nkkVar2.D(i14 + read);
        }
        int i15 = nkkVar2.b;
        int i16 = nkkVar2.c;
        byte[] bArr3 = nkkVar2.a;
        int i17 = i15;
        while (i17 < i16 && bArr3[i17] != 71) {
            i17++;
        }
        nkkVar2.E(i17);
        int i18 = i17 + 188;
        if (i18 > i16) {
            int i19 = (i17 - i15) + this.r;
            this.r = i19;
            i3 = i;
            if (i3 == 2 && i19 > 376) {
                throw r9e.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i3 = i;
            this.r = r3;
        }
        int i20 = nkkVar2.c;
        if (i18 > i20) {
            return r3;
        }
        int f = nkkVar2.f();
        if ((8388608 & f) != 0) {
            nkkVar2.E(i18);
            return r3;
        }
        int i21 = (4194304 & f) != 0 ? i2 : r3;
        int i22 = (2096896 & f) >> 8;
        int i23 = (f & 32) != 0 ? i2 : r3;
        d2k d2kVar = (f & 16) != 0 ? (d2k) this.g.get(i22) : null;
        if (d2kVar == null) {
            nkkVar2.E(i18);
            return r3;
        }
        if (i3 != 2) {
            int i24 = f & 15;
            SparseIntArray sparseIntArray = this.e;
            int i25 = sparseIntArray.get(i22, i24 - 1);
            sparseIntArray.put(i22, i24);
            if (i25 == i24) {
                nkkVar2.E(i18);
                return r3;
            }
            if (i24 != ((i25 + 1) & 15)) {
                d2kVar.seek();
            }
        }
        if (i23 != 0) {
            int s = nkkVar2.s();
            i21 |= (nkkVar2.s() & 64) != 0 ? 2 : r3;
            nkkVar2.F(s - 1);
        }
        boolean z3 = this.n;
        if (i3 == 2 || z3 || !this.i.get(i22, r3)) {
            nkkVar2.D(i18);
            d2kVar.a(i21, nkkVar2);
            nkkVar2.D(i20);
        }
        if (i3 != 2 && !z3 && this.n && j3 != -1) {
            this.p = i2;
        }
        nkkVar2.E(i18);
        return r3;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.l = ol6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(ml6 ml6Var) {
        byte[] bArr = this.d.a;
        ap4 ap4Var = (ap4) ml6Var;
        ap4Var.peekFully(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            ap4Var.skipFully(i);
            return true;
        }
        return false;
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        x68 x68Var;
        long j3;
        SparseArray sparseArray = this.g;
        List list = this.c;
        qx9.t(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cjj cjjVar = (cjj) list.get(i);
            synchronized (cjjVar) {
                j3 = cjjVar.b;
            }
            boolean z = j3 == C.TIME_UNSET;
            if (!z) {
                long c = cjjVar.c();
                z = (c == C.TIME_UNSET || c == 0 || c == j2) ? false : true;
            }
            if (z) {
                cjjVar.d(j2);
            }
        }
        if (j2 != 0 && (x68Var = this.k) != null) {
            x68Var.e(j2);
        }
        this.d.B(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((d2k) sparseArray.valueAt(i2)).seek();
        }
        this.r = 0;
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
