package defpackage;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k59 implements xi5, yi5 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final boolean c;
    public long d;
    public final boolean[] e;
    public String f;
    public boolean g;
    public long h;
    public boolean i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public Object o;
    public final Object p;

    public k59(b2h b2hVar, boolean z, boolean z2) {
        this.a = 0;
        this.j = b2hVar;
        this.b = z;
        this.c = z2;
        this.e = new boolean[3];
        this.k = new w2d(7, 0);
        this.l = new w2d(8, 0);
        this.m = new w2d(6, 0);
        this.h = C.TIME_UNSET;
        this.p = new nkk(4, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01d5, code lost:
    
        if (r3.i == r4.i) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01df, code lost:
    
        if (r9 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f1, code lost:
    
        if (r3.m == r4.m) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0202, code lost:
    
        if (r3.o == r4.o) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0210, code lost:
    
        if (r3.k == r4.k) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x026a, code lost:
    
        if (r4 == 1) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j, int i, int i2, long j2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        j9e j9eVar = (j9e) this.p;
        w2d w2dVar = (w2d) this.m;
        jy0 jy0Var = (jy0) ((sx2) this.j).c;
        w2d w2dVar2 = (w2d) this.k;
        w2d w2dVar3 = (w2d) this.l;
        if (!this.g || ((j59) this.o).c) {
            w2dVar2.b(i2);
            w2dVar3.b(i2);
            boolean z5 = this.g;
            boolean z6 = w2dVar2.d;
            if (z5) {
                if (z6) {
                    h3d U = kik.U(3, w2dVar2.f, (byte[]) w2dVar2.e);
                    jy0Var.f(U.s);
                    ((j59) this.o).d.append(U.d, U);
                    w2dVar2.d();
                } else if (w2dVar3.d) {
                    k9e k9eVar = new k9e((byte[]) w2dVar3.e, 4, w2dVar3.f);
                    int f = k9eVar.f();
                    int f2 = k9eVar.f();
                    k9eVar.i();
                    ((j59) this.o).e.append(f, new f3d(f, f2, k9eVar.d()));
                    w2dVar3.d();
                }
            } else if (z6 && w2dVar3.d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) w2dVar2.e, w2dVar2.f));
                arrayList.add(Arrays.copyOf((byte[]) w2dVar3.e, w2dVar3.f));
                h3d U2 = kik.U(3, w2dVar2.f, (byte[]) w2dVar2.e);
                int i5 = U2.s;
                k9e k9eVar2 = new k9e((byte[]) w2dVar3.e, 4, w2dVar3.f);
                int f3 = k9eVar2.f();
                int f4 = k9eVar2.f();
                k9eVar2.i();
                f3d f3dVar = new f3d(f3, f4, k9eVar2.d());
                int i6 = U2.a;
                int i7 = U2.b;
                int i8 = U2.c;
                byte[] bArr = wz2.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
                vsj vsjVar = (vsj) this.n;
                qm8 qm8Var = new qm8();
                qm8Var.a = this.f;
                qm8Var.m = sjc.p("video/mp2t");
                qm8Var.n = sjc.p("video/avc");
                qm8Var.j = format;
                qm8Var.u = U2.e;
                qm8Var.v = U2.f;
                qm8Var.D = new w13(U2.p, U2.q, U2.r, U2.h + 8, U2.i + 8, null);
                qm8Var.A = U2.g;
                qm8Var.q = arrayList;
                qm8Var.p = i5;
                w1l.r(qm8Var, vsjVar);
                this.g = true;
                jy0Var.f(i5);
                ((j59) this.o).d.append(U2.d, U2);
                ((j59) this.o).e.append(f3, f3dVar);
                w2dVar2.d();
                w2dVar3.d();
            }
        }
        if (w2dVar.b(i2)) {
            j9eVar.L((byte[]) w2dVar.e, kik.d0((byte[]) w2dVar.e, w2dVar.f));
            j9eVar.N(4);
            jy0Var.b(j2, j9eVar);
        }
        j59 j59Var = (j59) this.o;
        boolean z7 = this.g;
        if (j59Var.i != 9) {
            if (j59Var.c) {
                h59 h59Var = j59Var.n;
                h59 h59Var2 = j59Var.m;
                if (h59Var.a) {
                    if (h59Var2.a) {
                        h3d h3dVar = (h3d) h59Var.p;
                        h3dVar.getClass();
                        h3d h3dVar2 = (h3d) h59Var2.p;
                        h3dVar2.getClass();
                        int i9 = h3dVar2.m;
                        if (h59Var.e == h59Var2.e) {
                            if (h59Var.f == h59Var2.f) {
                                if (h59Var.g == h59Var2.g) {
                                    if (h59Var.h) {
                                        if (h59Var2.h) {
                                        }
                                    }
                                    int i10 = h59Var.c;
                                    int i11 = h59Var2.c;
                                    if (i10 != i11) {
                                        if (i10 != 0) {
                                        }
                                    }
                                    int i12 = h3dVar.m;
                                    if (i12 == 0) {
                                        if (i9 == 0) {
                                            if (h59Var.l == h59Var2.l) {
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                        if (i9 == 1) {
                                            if (h59Var.n == h59Var2.n) {
                                            }
                                        }
                                    }
                                    boolean z8 = h59Var.j;
                                    if (z8 == h59Var2.j) {
                                        if (z8) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (j59Var.b) {
                z = j59Var.s;
            } else {
                h59 h59Var3 = j59Var.n;
                z = h59Var3.b && ((i4 = h59Var3.d) == 7 || i4 == 2);
            }
            boolean z9 = j59Var.r;
            i3 = j59Var.i;
            if (i3 == 5) {
                z4 = z ? true : true;
                z2 = false;
                z3 = z9 | z2;
                j59Var.r = z3;
                j59Var.i = 24;
                if (z3) {
                    this.i = false;
                    return;
                }
                return;
            }
            z2 = z4;
            z3 = z9 | z2;
            j59Var.r = z3;
            j59Var.i = 24;
            if (z3) {
            }
        }
        if (z7 && j59Var.o) {
            long j3 = j59Var.j;
            int i13 = i + ((int) (j - j3));
            long j4 = j59Var.q;
            if (j4 != C.TIME_UNSET) {
                long j5 = j59Var.p;
                if (j3 != j5) {
                    j59Var.a.a(j4, j59Var.r ? 1 : 0, (int) (j3 - j5), i13, null);
                }
            }
        }
        j59Var.p = j59Var.j;
        j59Var.q = j59Var.l;
        j59Var.r = false;
        j59Var.o = true;
        if (j59Var.b) {
        }
        boolean z92 = j59Var.r;
        i3 = j59Var.i;
        if (i3 == 5) {
        }
        z2 = z4;
        z3 = z92 | z2;
        j59Var.r = z3;
        j59Var.i = 24;
        if (z3) {
        }
    }

    @Override // defpackage.yi5
    public void b(j9e j9eVar) {
        int i;
        ((vsj) this.n).getClass();
        String str = nik.a;
        int i2 = j9eVar.b;
        int i3 = j9eVar.c;
        byte[] bArr = j9eVar.a;
        this.d += j9eVar.a();
        ((vsj) this.n).g(j9eVar.a(), j9eVar);
        while (true) {
            int q = kik.q(bArr, i2, i3, this.e);
            if (q == i3) {
                e(bArr, i2, i3);
                return;
            }
            int i4 = bArr[q + 3] & 31;
            if (q <= 0 || bArr[q - 1] != 0) {
                i = 3;
            } else {
                q--;
                i = 4;
            }
            int i5 = q;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                e(bArr, i2, i5);
            }
            int i8 = i3 - i5;
            long j = this.d - i8;
            a(j, i8, i7 < 0 ? -i7 : 0, this.h);
            i(j, i4, this.h);
            i2 = i5 + i6;
        }
    }

    @Override // defpackage.yi5
    public void c(boolean z) {
        ((vsj) this.n).getClass();
        String str = nik.a;
        if (z) {
            ((jy0) ((sx2) this.j).c).d(0);
            a(this.d, 0, 0, this.h);
            i(this.d, 9, this.h);
            a(this.d, 0, 0, this.h);
        }
    }

    @Override // defpackage.yi5
    public void d(pl6 pl6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.f = c2kVar.f;
        c2kVar.b();
        vsj mo2track = pl6Var.mo2track(c2kVar.e, 2);
        this.n = mo2track;
        this.o = new j59(mo2track, this.b, this.c);
        ((sx2) this.j).j(pl6Var, c2kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int n;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int g;
        int i13 = this.a;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i13) {
            case 0:
                if (!this.g || ((i59) this.o).c) {
                    ((w2d) obj3).a(bArr, i, i2);
                    ((w2d) obj2).a(bArr, i, i2);
                }
                ((w2d) obj).a(bArr, i, i2);
                i59 i59Var = (i59) this.o;
                SparseArray sparseArray = i59Var.e;
                nm2 nm2Var = i59Var.f;
                if (i59Var.k) {
                    int i14 = i2 - i;
                    byte[] bArr2 = i59Var.g;
                    int length = bArr2.length;
                    int i15 = i59Var.h + i14;
                    if (length < i15) {
                        bArr2 = Arrays.copyOf(bArr2, i15 * 2);
                        i59Var.g = bArr2;
                    }
                    System.arraycopy(bArr, i, bArr2, i59Var.h, i14);
                    int i16 = i59Var.h + i14;
                    i59Var.h = i16;
                    nm2Var.d = i59Var.g;
                    nm2Var.c = 0;
                    nm2Var.b = i16;
                    nm2Var.e = 0;
                    nm2Var.a();
                    if (nm2Var.d(8)) {
                        nm2Var.s();
                        int i17 = nm2Var.i(2);
                        nm2Var.t(5);
                        if (nm2Var.e()) {
                            nm2Var.m();
                            if (nm2Var.e()) {
                                int m = nm2Var.m();
                                if (!i59Var.c) {
                                    i59Var.k = false;
                                    h59 h59Var = i59Var.n;
                                    h59Var.d = m;
                                    h59Var.b = true;
                                    break;
                                } else if (nm2Var.e()) {
                                    int m2 = nm2Var.m();
                                    if (sparseArray.indexOfKey(m2) < 0) {
                                        i59Var.k = false;
                                        break;
                                    } else {
                                        e3d e3dVar = (e3d) sparseArray.get(m2);
                                        SparseArray sparseArray2 = i59Var.d;
                                        int i18 = e3dVar.a;
                                        boolean z9 = e3dVar.b;
                                        g3d g3dVar = (g3d) sparseArray2.get(i18);
                                        boolean z10 = g3dVar.h;
                                        int i19 = g3dVar.l;
                                        int i20 = g3dVar.j;
                                        if (z10) {
                                            if (nm2Var.d(2)) {
                                                nm2Var.t(2);
                                            }
                                        }
                                        if (nm2Var.d(i20)) {
                                            int i21 = nm2Var.i(i20);
                                            if (g3dVar.i) {
                                                z = false;
                                                z2 = false;
                                            } else if (nm2Var.d(1)) {
                                                z2 = nm2Var.h();
                                                if (!z2) {
                                                    z = false;
                                                } else if (nm2Var.d(1)) {
                                                    z3 = nm2Var.h();
                                                    z = true;
                                                    z4 = i59Var.i != 5;
                                                    if (z4) {
                                                        i3 = 0;
                                                    } else if (nm2Var.e()) {
                                                        i3 = nm2Var.m();
                                                    }
                                                    i4 = g3dVar.k;
                                                    if (i4 == 0) {
                                                        if (i4 == 1 && !g3dVar.m) {
                                                            if (nm2Var.e()) {
                                                                int n2 = nm2Var.n();
                                                                if (z9 && !z2) {
                                                                    if (nm2Var.e()) {
                                                                        n = nm2Var.n();
                                                                        i6 = n2;
                                                                        i5 = 0;
                                                                        i7 = 0;
                                                                        h59 h59Var2 = i59Var.n;
                                                                        h59Var2.p = g3dVar;
                                                                        h59Var2.c = i17;
                                                                        h59Var2.d = m;
                                                                        h59Var2.e = i21;
                                                                        h59Var2.f = m2;
                                                                        h59Var2.g = z2;
                                                                        h59Var2.h = z;
                                                                        h59Var2.i = z3;
                                                                        h59Var2.j = z4;
                                                                        h59Var2.k = i3;
                                                                        h59Var2.l = i7;
                                                                        h59Var2.m = i5;
                                                                        h59Var2.n = i6;
                                                                        h59Var2.o = n;
                                                                        h59Var2.a = true;
                                                                        h59Var2.b = true;
                                                                        i59Var.k = false;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i6 = n2;
                                                                    i5 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            i5 = 0;
                                                            i6 = 0;
                                                        }
                                                        i7 = 0;
                                                    } else if (nm2Var.d(i19)) {
                                                        i7 = nm2Var.i(i19);
                                                        if (!z9 || z2) {
                                                            i5 = 0;
                                                        } else if (nm2Var.e()) {
                                                            i5 = nm2Var.n();
                                                        }
                                                        i6 = 0;
                                                    }
                                                    n = 0;
                                                    h59 h59Var22 = i59Var.n;
                                                    h59Var22.p = g3dVar;
                                                    h59Var22.c = i17;
                                                    h59Var22.d = m;
                                                    h59Var22.e = i21;
                                                    h59Var22.f = m2;
                                                    h59Var22.g = z2;
                                                    h59Var22.h = z;
                                                    h59Var22.i = z3;
                                                    h59Var22.j = z4;
                                                    h59Var22.k = i3;
                                                    h59Var22.l = i7;
                                                    h59Var22.m = i5;
                                                    h59Var22.n = i6;
                                                    h59Var22.o = n;
                                                    h59Var22.a = true;
                                                    h59Var22.b = true;
                                                    i59Var.k = false;
                                                }
                                            }
                                            z3 = false;
                                            if (i59Var.i != 5) {
                                            }
                                            if (z4) {
                                            }
                                            i4 = g3dVar.k;
                                            if (i4 == 0) {
                                            }
                                            n = 0;
                                            h59 h59Var222 = i59Var.n;
                                            h59Var222.p = g3dVar;
                                            h59Var222.c = i17;
                                            h59Var222.d = m;
                                            h59Var222.e = i21;
                                            h59Var222.f = m2;
                                            h59Var222.g = z2;
                                            h59Var222.h = z;
                                            h59Var222.i = z3;
                                            h59Var222.j = z4;
                                            h59Var222.k = i3;
                                            h59Var222.l = i7;
                                            h59Var222.m = i5;
                                            h59Var222.n = i6;
                                            h59Var222.o = n;
                                            h59Var222.a = true;
                                            h59Var222.b = true;
                                            i59Var.k = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default:
                if (!this.g || ((j59) this.o).c) {
                    ((w2d) obj3).a(bArr, i, i2);
                    ((w2d) obj2).a(bArr, i, i2);
                }
                ((w2d) obj).a(bArr, i, i2);
                j59 j59Var = (j59) this.o;
                SparseArray sparseArray3 = j59Var.e;
                k9e k9eVar = j59Var.f;
                if (j59Var.k) {
                    int i22 = i2 - i;
                    byte[] bArr3 = j59Var.g;
                    int length2 = bArr3.length;
                    int i23 = j59Var.h + i22;
                    if (length2 < i23) {
                        bArr3 = Arrays.copyOf(bArr3, i23 * 2);
                        j59Var.g = bArr3;
                    }
                    System.arraycopy(bArr, i, bArr3, j59Var.h, i22);
                    int i24 = j59Var.h + i22;
                    j59Var.h = i24;
                    k9eVar.e = j59Var.g;
                    k9eVar.b = 0;
                    k9eVar.c = 0;
                    k9eVar.a = i24;
                    k9eVar.d = 0;
                    k9eVar.a();
                    if (k9eVar.b(8)) {
                        k9eVar.i();
                        int e = k9eVar.e(2);
                        k9eVar.j(5);
                        if (k9eVar.c()) {
                            k9eVar.f();
                            if (k9eVar.c()) {
                                int f = k9eVar.f();
                                if (!j59Var.c) {
                                    j59Var.k = false;
                                    h59 h59Var3 = j59Var.n;
                                    h59Var3.d = f;
                                    h59Var3.b = true;
                                    break;
                                } else if (k9eVar.c()) {
                                    int f2 = k9eVar.f();
                                    if (sparseArray3.indexOfKey(f2) < 0) {
                                        j59Var.k = false;
                                        break;
                                    } else {
                                        f3d f3dVar = (f3d) sparseArray3.get(f2);
                                        SparseArray sparseArray4 = j59Var.d;
                                        int i25 = f3dVar.a;
                                        boolean z11 = f3dVar.b;
                                        h3d h3dVar = (h3d) sparseArray4.get(i25);
                                        boolean z12 = h3dVar.j;
                                        int i26 = h3dVar.n;
                                        int i27 = h3dVar.l;
                                        if (z12) {
                                            if (k9eVar.b(2)) {
                                                k9eVar.j(2);
                                            }
                                        }
                                        if (k9eVar.b(i27)) {
                                            int e2 = k9eVar.e(i27);
                                            if (h3dVar.k) {
                                                z5 = false;
                                                z6 = false;
                                            } else if (k9eVar.b(1)) {
                                                z5 = k9eVar.d();
                                                if (!z5) {
                                                    z6 = false;
                                                } else if (k9eVar.b(1)) {
                                                    z6 = k9eVar.d();
                                                    z7 = true;
                                                    z8 = j59Var.i != 5;
                                                    if (z8) {
                                                        i8 = 0;
                                                    } else if (k9eVar.c()) {
                                                        i8 = k9eVar.f();
                                                    }
                                                    i9 = h3dVar.m;
                                                    if (i9 == 0) {
                                                        if (i9 == 1 && !h3dVar.o) {
                                                            if (k9eVar.c()) {
                                                                int g2 = k9eVar.g();
                                                                if (z11 && !z5) {
                                                                    if (k9eVar.c()) {
                                                                        g = k9eVar.g();
                                                                        i11 = g2;
                                                                        i10 = 0;
                                                                        i12 = 0;
                                                                        h59 h59Var4 = j59Var.n;
                                                                        h59Var4.p = h3dVar;
                                                                        h59Var4.c = e;
                                                                        h59Var4.d = f;
                                                                        h59Var4.e = e2;
                                                                        h59Var4.f = f2;
                                                                        h59Var4.g = z5;
                                                                        h59Var4.h = z7;
                                                                        h59Var4.i = z6;
                                                                        h59Var4.j = z8;
                                                                        h59Var4.k = i8;
                                                                        h59Var4.l = i12;
                                                                        h59Var4.m = i10;
                                                                        h59Var4.n = i11;
                                                                        h59Var4.o = g;
                                                                        h59Var4.a = true;
                                                                        h59Var4.b = true;
                                                                        j59Var.k = false;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i11 = g2;
                                                                    i10 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            i10 = 0;
                                                            i11 = 0;
                                                        }
                                                        i12 = 0;
                                                    } else if (k9eVar.b(i26)) {
                                                        i12 = k9eVar.e(i26);
                                                        if (!z11 || z5) {
                                                            i10 = 0;
                                                        } else if (k9eVar.c()) {
                                                            i10 = k9eVar.g();
                                                        }
                                                        i11 = 0;
                                                    }
                                                    g = 0;
                                                    h59 h59Var42 = j59Var.n;
                                                    h59Var42.p = h3dVar;
                                                    h59Var42.c = e;
                                                    h59Var42.d = f;
                                                    h59Var42.e = e2;
                                                    h59Var42.f = f2;
                                                    h59Var42.g = z5;
                                                    h59Var42.h = z7;
                                                    h59Var42.i = z6;
                                                    h59Var42.j = z8;
                                                    h59Var42.k = i8;
                                                    h59Var42.l = i12;
                                                    h59Var42.m = i10;
                                                    h59Var42.n = i11;
                                                    h59Var42.o = g;
                                                    h59Var42.a = true;
                                                    h59Var42.b = true;
                                                    j59Var.k = false;
                                                }
                                            }
                                            z7 = z6;
                                            if (j59Var.i != 5) {
                                            }
                                            if (z8) {
                                            }
                                            i9 = h3dVar.m;
                                            if (i9 == 0) {
                                            }
                                            g = 0;
                                            h59 h59Var422 = j59Var.n;
                                            h59Var422.p = h3dVar;
                                            h59Var422.c = e;
                                            h59Var422.d = f;
                                            h59Var422.e = e2;
                                            h59Var422.f = f2;
                                            h59Var422.g = z5;
                                            h59Var422.h = z7;
                                            h59Var422.i = z6;
                                            h59Var422.j = z8;
                                            h59Var422.k = i8;
                                            h59Var422.l = i12;
                                            h59Var422.m = i10;
                                            h59Var422.n = i11;
                                            h59Var422.o = g;
                                            h59Var422.a = true;
                                            h59Var422.b = true;
                                            j59Var.k = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x020e, code lost:
    
        if (r7.i == r8.i) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0218, code lost:
    
        if (r12 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022a, code lost:
    
        if (r7.m == r8.m) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x023b, code lost:
    
        if (r7.o == r8.o) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0249, code lost:
    
        if (r7.k == r8.k) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e4 A[ADDED_TO_REGION] */
    @Override // defpackage.xi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(nkk nkkVar) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        long j;
        i59 i59Var;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        int i4;
        i59 i59Var2;
        int i5;
        w2d w2dVar = (w2d) this.l;
        w2d w2dVar2 = (w2d) this.k;
        w2d w2dVar3 = (w2d) this.m;
        qx9.u((usj) this.n);
        int i6 = lik.a;
        int i7 = nkkVar.b;
        int i8 = nkkVar.c;
        byte[] bArr2 = nkkVar.a;
        this.d += nkkVar.c();
        ((usj) this.n).d(nkkVar.c(), nkkVar);
        while (true) {
            int L = hkg.L(bArr2, i7, i8, this.e);
            if (L == i8) {
                e(bArr2, i7, i8);
                return;
            }
            int i9 = L + 3;
            int i10 = bArr2[i9] & 31;
            int i11 = L - i7;
            if (i11 > 0) {
                e(bArr2, i7, L);
            }
            int i12 = i8 - L;
            long j3 = this.d - i12;
            int i13 = i11 < 0 ? -i11 : 0;
            long j4 = this.h;
            nkk nkkVar2 = (nkk) this.p;
            if (!this.g || ((i59) this.o).c) {
                w2dVar2.b(i13);
                w2dVar.b(i13);
                boolean z4 = this.g;
                boolean z5 = w2dVar2.d;
                if (z4) {
                    i = i8;
                    bArr = bArr2;
                    i2 = i9;
                    i3 = i10;
                    j = j3;
                    if (z5) {
                        g3d j0 = hkg.j0(3, w2dVar2.f, (byte[]) w2dVar2.e);
                        ((i59) this.o).d.append(j0.d, j0);
                        w2dVar2.d();
                    } else if (w2dVar.d) {
                        nm2 nm2Var = new nm2((byte[]) w2dVar.e, 4, w2dVar.f);
                        int m = nm2Var.m();
                        int m2 = nm2Var.m();
                        nm2Var.s();
                        ((i59) this.o).e.append(m, new e3d(m, m2, nm2Var.h()));
                        w2dVar.d();
                    }
                } else if (z5 && w2dVar.d) {
                    ArrayList arrayList = new ArrayList();
                    i = i8;
                    arrayList.add(Arrays.copyOf((byte[]) w2dVar2.e, w2dVar2.f));
                    arrayList.add(Arrays.copyOf((byte[]) w2dVar.e, w2dVar.f));
                    bArr = bArr2;
                    g3d j02 = hkg.j0(3, w2dVar2.f, (byte[]) w2dVar2.e);
                    i2 = i9;
                    j = j3;
                    nm2 nm2Var2 = new nm2((byte[]) w2dVar.e, 4, w2dVar.f);
                    int m3 = nm2Var2.m();
                    int m4 = nm2Var2.m();
                    nm2Var2.s();
                    e3d e3dVar = new e3d(m3, m4, nm2Var2.h());
                    String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(j02.a), Integer.valueOf(j02.b), Integer.valueOf(j02.c));
                    usj usjVar = (usj) this.n;
                    pm8 pm8Var = new pm8();
                    i3 = i10;
                    pm8Var.a = this.f;
                    pm8Var.k = "video/avc";
                    pm8Var.h = format;
                    pm8Var.p = j02.e;
                    pm8Var.q = j02.f;
                    pm8Var.t = j02.g;
                    pm8Var.m = arrayList;
                    usjVar.a(new sm8(pm8Var));
                    this.g = true;
                    ((i59) this.o).d.append(j02.d, j02);
                    ((i59) this.o).e.append(m3, e3dVar);
                    w2dVar2.d();
                    w2dVar.d();
                }
                if (w2dVar3.b(i13)) {
                    nkkVar2.C((byte[]) w2dVar3.e, hkg.t0((byte[]) w2dVar3.e, w2dVar3.f));
                    nkkVar2.E(4);
                    zm2.q(j4, nkkVar2, ((b2h) this.j).c);
                }
                i59Var = (i59) this.o;
                z = this.g;
                boolean z6 = this.i;
                if (i59Var.i != 9) {
                    if (i59Var.c) {
                        h59 h59Var = i59Var.n;
                        h59 h59Var2 = i59Var.m;
                        if (h59Var.a) {
                            if (h59Var2.a) {
                                g3d g3dVar = (g3d) h59Var.p;
                                qx9.u(g3dVar);
                                g3d g3dVar2 = (g3d) h59Var2.p;
                                qx9.u(g3dVar2);
                                int i14 = g3dVar2.k;
                                if (h59Var.e == h59Var2.e) {
                                    if (h59Var.f == h59Var2.f) {
                                        if (h59Var.g == h59Var2.g) {
                                            if (h59Var.h) {
                                                if (h59Var2.h) {
                                                }
                                            }
                                            int i15 = h59Var.c;
                                            int i16 = h59Var2.c;
                                            if (i15 != i16) {
                                                if (i15 != 0) {
                                                }
                                            }
                                            int i17 = g3dVar.k;
                                            if (i17 == 0) {
                                                if (i14 == 0) {
                                                    if (h59Var.l == h59Var2.l) {
                                                    }
                                                }
                                            }
                                            if (i17 == 1) {
                                                if (i14 == 1) {
                                                    if (h59Var.n == h59Var2.n) {
                                                    }
                                                }
                                            }
                                            boolean z7 = h59Var.j;
                                            if (z7 == h59Var2.j) {
                                                if (z7) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z2 = z6;
                    if (i59Var.b) {
                        h59 h59Var3 = i59Var.n;
                        z2 = h59Var3.b && ((i5 = h59Var3.d) == 7 || i5 == 2);
                    }
                    boolean z8 = i59Var.r;
                    int i18 = i59Var.i;
                    z3 = z8 | (i18 != 5 || (z2 && i18 == 1));
                    i59Var.r = z3;
                    if (z3) {
                        this.i = false;
                    }
                    long j5 = this.h;
                    if (this.g || ((i59) this.o).c) {
                        i4 = i3;
                        w2dVar2.e(i4);
                        w2dVar.e(i4);
                    } else {
                        i4 = i3;
                    }
                    w2dVar3.e(i4);
                    i59Var2 = (i59) this.o;
                    i59Var2.i = i4;
                    i59Var2.l = j5;
                    i59Var2.j = j;
                    if ((i59Var2.b && i4 == 1) || (i59Var2.c && (i4 == 5 || i4 == 1 || i4 == 2))) {
                        h59 h59Var4 = i59Var2.m;
                        i59Var2.m = i59Var2.n;
                        i59Var2.n = h59Var4;
                        h59Var4.b = false;
                        h59Var4.a = false;
                        i59Var2.h = 0;
                        i59Var2.k = true;
                    }
                    i8 = i;
                    bArr2 = bArr;
                    i7 = i2;
                }
                if (z && i59Var.o) {
                    long j6 = i59Var.j;
                    int i19 = i12 + ((int) (j - j6));
                    j2 = i59Var.q;
                    if (j2 != C.TIME_UNSET) {
                        z2 = z6;
                        i59Var.a.c(j2, i59Var.r ? 1 : 0, (int) (j6 - i59Var.p), i19, null);
                        i59Var.p = i59Var.j;
                        i59Var.q = i59Var.l;
                        i59Var.r = false;
                        i59Var.o = true;
                        if (i59Var.b) {
                        }
                        boolean z82 = i59Var.r;
                        int i182 = i59Var.i;
                        z3 = z82 | (i182 != 5 || (z2 && i182 == 1));
                        i59Var.r = z3;
                        if (z3) {
                        }
                        long j52 = this.h;
                        if (this.g) {
                        }
                        i4 = i3;
                        w2dVar2.e(i4);
                        w2dVar.e(i4);
                        w2dVar3.e(i4);
                        i59Var2 = (i59) this.o;
                        i59Var2.i = i4;
                        i59Var2.l = j52;
                        i59Var2.j = j;
                        if (i59Var2.b) {
                            h59 h59Var42 = i59Var2.m;
                            i59Var2.m = i59Var2.n;
                            i59Var2.n = h59Var42;
                            h59Var42.b = false;
                            h59Var42.a = false;
                            i59Var2.h = 0;
                            i59Var2.k = true;
                            i8 = i;
                            bArr2 = bArr;
                            i7 = i2;
                        }
                        h59 h59Var422 = i59Var2.m;
                        i59Var2.m = i59Var2.n;
                        i59Var2.n = h59Var422;
                        h59Var422.b = false;
                        h59Var422.a = false;
                        i59Var2.h = 0;
                        i59Var2.k = true;
                        i8 = i;
                        bArr2 = bArr;
                        i7 = i2;
                    }
                }
                z2 = z6;
                i59Var.p = i59Var.j;
                i59Var.q = i59Var.l;
                i59Var.r = false;
                i59Var.o = true;
                if (i59Var.b) {
                }
                boolean z822 = i59Var.r;
                int i1822 = i59Var.i;
                z3 = z822 | (i1822 != 5 || (z2 && i1822 == 1));
                i59Var.r = z3;
                if (z3) {
                }
                long j522 = this.h;
                if (this.g) {
                }
                i4 = i3;
                w2dVar2.e(i4);
                w2dVar.e(i4);
                w2dVar3.e(i4);
                i59Var2 = (i59) this.o;
                i59Var2.i = i4;
                i59Var2.l = j522;
                i59Var2.j = j;
                if (i59Var2.b) {
                }
                h59 h59Var4222 = i59Var2.m;
                i59Var2.m = i59Var2.n;
                i59Var2.n = h59Var4222;
                h59Var4222.b = false;
                h59Var4222.a = false;
                i59Var2.h = 0;
                i59Var2.k = true;
                i8 = i;
                bArr2 = bArr;
                i7 = i2;
            }
            i = i8;
            bArr = bArr2;
            i2 = i9;
            i3 = i10;
            j = j3;
            if (w2dVar3.b(i13)) {
            }
            i59Var = (i59) this.o;
            z = this.g;
            boolean z62 = this.i;
            if (i59Var.i != 9) {
            }
            if (z) {
                long j62 = i59Var.j;
                int i192 = i12 + ((int) (j - j62));
                j2 = i59Var.q;
                if (j2 != C.TIME_UNSET) {
                }
            }
            z2 = z62;
            i59Var.p = i59Var.j;
            i59Var.q = i59Var.l;
            i59Var.r = false;
            i59Var.o = true;
            if (i59Var.b) {
            }
            boolean z8222 = i59Var.r;
            int i18222 = i59Var.i;
            z3 = z8222 | (i18222 != 5 || (z2 && i18222 == 1));
            i59Var.r = z3;
            if (z3) {
            }
            long j5222 = this.h;
            if (this.g) {
            }
            i4 = i3;
            w2dVar2.e(i4);
            w2dVar.e(i4);
            w2dVar3.e(i4);
            i59Var2 = (i59) this.o;
            i59Var2.i = i4;
            i59Var2.l = j5222;
            i59Var2.j = j;
            if (i59Var2.b) {
            }
            h59 h59Var42222 = i59Var2.m;
            i59Var2.m = i59Var2.n;
            i59Var2.n = h59Var42222;
            h59Var42222.b = false;
            h59Var42222.a = false;
            i59Var2.h = 0;
            i59Var2.k = true;
            i8 = i;
            bArr2 = bArr;
            i7 = i2;
        }
    }

    @Override // defpackage.xi5
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != C.TIME_UNSET) {
                    this.h = j;
                }
                this.i = ((i & 2) != 0) | this.i;
                break;
            default:
                this.h = j;
                this.i = ((i & 2) != 0) | this.i;
                break;
        }
    }

    @Override // defpackage.xi5
    public void h(ol6 ol6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.f = c2kVar.f;
        c2kVar.b();
        usj track = ol6Var.track(c2kVar.e, 2);
        this.n = track;
        this.o = new i59(track, this.b, this.c);
        ((b2h) this.j).b(ol6Var, c2kVar);
    }

    public void i(long j, int i, long j2) {
        if (!this.g || ((j59) this.o).c) {
            ((w2d) this.k).e(i);
            ((w2d) this.l).e(i);
        }
        ((w2d) this.m).e(i);
        j59 j59Var = (j59) this.o;
        boolean z = this.i;
        j59Var.i = i;
        j59Var.l = j2;
        j59Var.j = j;
        j59Var.s = z;
        if (!j59Var.b || i != 1) {
            if (!j59Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        h59 h59Var = j59Var.m;
        j59Var.m = j59Var.n;
        j59Var.n = h59Var;
        h59Var.b = false;
        h59Var.a = false;
        j59Var.h = 0;
        j59Var.k = true;
    }

    @Override // defpackage.xi5
    public final void seek() {
        int i = this.a;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        boolean[] zArr = this.e;
        switch (i) {
            case 0:
                this.d = 0L;
                this.i = false;
                this.h = C.TIME_UNSET;
                hkg.z(zArr);
                ((w2d) obj3).d();
                ((w2d) obj2).d();
                ((w2d) obj).d();
                i59 i59Var = (i59) this.o;
                if (i59Var != null) {
                    i59Var.k = false;
                    i59Var.o = false;
                    h59 h59Var = i59Var.n;
                    h59Var.b = false;
                    h59Var.a = false;
                    break;
                }
                break;
            default:
                this.d = 0L;
                this.i = false;
                this.h = C.TIME_UNSET;
                kik.m(zArr);
                ((w2d) obj3).d();
                ((w2d) obj2).d();
                ((w2d) obj).d();
                ((jy0) ((sx2) this.j).c).d(0);
                j59 j59Var = (j59) this.o;
                if (j59Var != null) {
                    j59Var.k = false;
                    j59Var.o = false;
                    h59 h59Var2 = j59Var.n;
                    h59Var2.b = false;
                    h59Var2.a = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xi5
    public void packetFinished() {
    }

    public k59(sx2 sx2Var, boolean z, boolean z2) {
        this.a = 1;
        this.j = sx2Var;
        this.b = z;
        this.c = z2;
        this.e = new boolean[3];
        this.k = new w2d(7, 1);
        this.l = new w2d(8, 1);
        this.m = new w2d(6, 1);
        this.h = C.TIME_UNSET;
        this.p = new j9e();
    }
}
