package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z1k implements ll6 {
    public final int a;
    public final int b;
    public final List c;
    public final j9e d;
    public final SparseIntArray e;
    public final mu4 f;
    public final xli g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final ngf k;
    public y68 l;
    public pl6 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public e2k r;
    public int s;
    public int t;

    public z1k(int i, int i2, xli xliVar, djj djjVar, mu4 mu4Var) {
        this.f = mu4Var;
        this.a = i;
        this.b = i2;
        this.g = xliVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(djjVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(djjVar);
        }
        this.d = new j9e(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new ngf(1);
        this.m = pl6.p7;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (e2k) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new qzg(new y3g(this)));
        this.r = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(nl6 nl6Var) {
        byte[] bArr = this.d.a;
        bp4 bp4Var = (bp4) nl6Var;
        bp4Var.peekFully(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            bp4Var.skipFully(i, false);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        nl6 nl6Var2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long j;
        long length = nl6Var.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j2 = C.TIME_UNSET;
            ngf ngfVar = this.k;
            if (length != -1 && !z2 && !ngfVar.d) {
                int i6 = this.t;
                djj djjVar = ngfVar.b;
                j9e j9eVar = ngfVar.c;
                if (i6 <= 0) {
                    ngfVar.a(nl6Var);
                    return 0;
                }
                if (ngfVar.f) {
                    if (ngfVar.h == C.TIME_UNSET) {
                        ngfVar.a(nl6Var);
                        return 0;
                    }
                    if (ngfVar.e) {
                        long j3 = ngfVar.g;
                        if (j3 == C.TIME_UNSET) {
                            ngfVar.a(nl6Var);
                            return 0;
                        }
                        ngfVar.i = djjVar.c(ngfVar.h) - djjVar.b(j3);
                        ngfVar.a(nl6Var);
                        return 0;
                    }
                    int min = (int) Math.min(112800L, nl6Var.getLength());
                    if (nl6Var.getPosition() != 0) {
                        b78Var.a = 0L;
                        return 1;
                    }
                    j9eVar.K(min);
                    nl6Var.resetPeekPosition();
                    nl6Var.peekFully(j9eVar.a, 0, min);
                    int i7 = j9eVar.b;
                    int i8 = j9eVar.c;
                    while (true) {
                        if (i7 >= i8) {
                            j = -9223372036854775807L;
                            break;
                        }
                        if (j9eVar.a[i7] == 71) {
                            j = rha.u(j9eVar, i7, i6);
                            if (j != C.TIME_UNSET) {
                                break;
                            }
                        }
                        i7++;
                    }
                    ngfVar.g = j;
                    ngfVar.e = true;
                    return 0;
                }
                long length2 = nl6Var.getLength();
                int min2 = (int) Math.min(112800L, length2);
                long j4 = length2 - min2;
                if (nl6Var.getPosition() != j4) {
                    b78Var.a = j4;
                    return 1;
                }
                j9eVar.K(min2);
                nl6Var.resetPeekPosition();
                nl6Var.peekFully(j9eVar.a, 0, min2);
                int i9 = j9eVar.b;
                int i10 = j9eVar.c;
                int i11 = i10 - 188;
                while (true) {
                    if (i11 < i9) {
                        break;
                    }
                    byte[] bArr = j9eVar.a;
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long u = rha.u(j9eVar, i11, i6);
                                if (u != C.TIME_UNSET) {
                                    j2 = u;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                ngfVar.h = j2;
                ngfVar.f = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j5 = ngfVar.i;
                if (j5 != C.TIME_UNSET) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    y68 y68Var = new y68(new uic(17), new b10(this.t, ngfVar.b), j5, j5 + 1, 0L, length, 188L, 940);
                    this.l = y68Var;
                    this.m.m((zv1) y68Var.c);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.m(new bw0(j5));
                }
            }
            if (this.q) {
                this.q = z;
                seek(0L, 0L);
                if (nl6Var.getPosition() != 0) {
                    b78Var.a = 0L;
                    return i;
                }
            }
            y68 y68Var2 = this.l;
            if (y68Var2 != null && ((aw1) y68Var2.e) != null) {
                return y68Var2.b(nl6Var, b78Var);
            }
            nl6Var2 = nl6Var;
            r1 = z;
        } else {
            nl6Var2 = nl6Var;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        j9e j9eVar2 = this.d;
        byte[] bArr2 = j9eVar2.a;
        if (9400 - j9eVar2.b < 188) {
            int a = j9eVar2.a();
            if (a > 0) {
                System.arraycopy(bArr2, j9eVar2.b, bArr2, r1, a);
            }
            j9eVar2.L(bArr2, a);
        }
        while (true) {
            int a2 = j9eVar2.a();
            SparseArray sparseArray = this.h;
            if (a2 >= 188) {
                int i15 = j9eVar2.b;
                int i16 = j9eVar2.c;
                byte[] bArr3 = j9eVar2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                j9eVar2.N(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw s9e.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = j9eVar2.c;
                if (i18 > i20) {
                    return r1;
                }
                int m = j9eVar2.m();
                if ((8388608 & m) != 0) {
                    j9eVar2.N(i18);
                    return r1;
                }
                int i21 = (4194304 & m) != 0 ? 1 : r1;
                int i22 = (2096896 & m) >> 8;
                boolean z3 = (m & 32) != 0 ? true : r1;
                e2k e2kVar = (m & 16) != 0 ? (e2k) sparseArray.get(i22) : null;
                if (e2kVar == null) {
                    j9eVar2.N(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i23 = m & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i24 = sparseIntArray.get(i22, i23 - 1);
                    sparseIntArray.put(i22, i23);
                    if (i24 == i23) {
                        j9eVar2.N(i18);
                        return r1;
                    }
                    if (i23 != ((i24 + 1) & 15)) {
                        e2kVar.seek();
                    }
                }
                if (z3) {
                    int A = j9eVar2.A();
                    i21 |= (j9eVar2.A() & 64) != 0 ? i4 : r1;
                    j9eVar2.O(A - 1);
                }
                boolean z4 = this.o;
                if (i3 == i4 || z4 || !this.j.get(i22, r1)) {
                    j9eVar2.M(i18);
                    e2kVar.a(i21, j9eVar2);
                    j9eVar2.M(i20);
                }
                if (i3 != i4 && !z4 && this.o && length != -1) {
                    this.q = true;
                }
                j9eVar2.N(i18);
                return r1;
            }
            int i25 = j9eVar2.c;
            int read = nl6Var2.read(bArr2, i25, 9400 - i25);
            if (read == -1) {
                int i26 = r1;
                while (i26 < sparseArray.size()) {
                    e2k e2kVar2 = (e2k) sparseArray.valueAt(i26);
                    if (e2kVar2 instanceof qfe) {
                        qfe qfeVar = (qfe) e2kVar2;
                        int i27 = (!z2 || qfeVar.d()) ? i : r1;
                        if (qfeVar.c == 3 && qfeVar.j == -1 && ((!z2 || !(qfeVar.a instanceof d59)) && i27 != 0)) {
                            qfeVar.a(i, new j9e());
                        }
                    }
                    i26++;
                    i = 1;
                }
                return -1;
            }
            j9eVar2.M(i25 + read);
            i = 1;
        }
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        if ((this.b & 1) == 0) {
            pl6Var = new en0(pl6Var, this.g);
        }
        this.m = pl6Var;
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        y68 y68Var;
        long j3;
        SparseArray sparseArray = this.h;
        List list = this.c;
        z1a.E(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            djj djjVar = (djj) list.get(i);
            synchronized (djjVar) {
                j3 = djjVar.b;
            }
            boolean z = j3 == C.TIME_UNSET;
            if (!z) {
                long d = djjVar.d();
                z = (d == C.TIME_UNSET || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                djjVar.f(j2);
            }
        }
        if (j2 != 0 && (y68Var = this.l) != null) {
            y68Var.e(j2);
        }
        this.d.K(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((e2k) sparseArray.valueAt(i2)).seek();
        }
        this.s = 0;
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
