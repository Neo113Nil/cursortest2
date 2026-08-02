package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class tkb extends qhe implements zvc, m1c {
    public qkb f;
    public Function1 g;
    public she h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final ukb l = new ukb(this, 0);
    public jy0 m;
    public x0d n;

    public static void J0(wdd wddVar) {
        xma xmaVar;
        wdd wddVar2 = wddVar.p;
        wma wmaVar = wddVar.o;
        if (!Intrinsics.c(wddVar2 != null ? wddVar2.o : null, wmaVar)) {
            wmaVar.G.p.y.f();
            return;
        }
        po c = wmaVar.G.p.c();
        if (c == null || (xmaVar = ((j1c) c).y) == null) {
            return;
        }
        xmaVar.f();
    }

    public abstract tkb B0();

    public abstract long F0();

    public final qkb I0() {
        qkb qkbVar = this.f;
        if (qkbVar != null) {
            return qkbVar;
        }
        qkb qkbVar2 = new qkb(this);
        this.f = qkbVar2;
        return qkbVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(y0d y0dVar) {
        wma wmaVar;
        Object[] objArr = y0dVar.b;
        long[] jArr = y0dVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (wmaVar = (wma) ((e0l) objArr[(i << 3) + i3]).get()) != null) {
                        if (W()) {
                            wmaVar.S(false);
                        } else {
                            wmaVar.U(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.m1c
    public final l1c M0(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            r3a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new skb(i, i2, map, function1, function12, this);
    }

    public abstract void N0();

    @Override // defpackage.qhe
    public final int R(jo joVar) {
        int p0;
        if (!x0() || (p0 = p0(joVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = joVar instanceof pok;
        long j = this.e;
        return p0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // defpackage.l9a
    public boolean W() {
        return false;
    }

    @Override // defpackage.zvc
    public final void i(boolean z) {
        tkb B0 = B0();
        wma y0 = B0 != null ? B0.y0() : null;
        if (Intrinsics.c(y0, y0())) {
            this.i = z;
            return;
        }
        if ((y0 != null ? y0.G.d : null) != sma.c) {
            if ((y0 != null ? y0.G.d : null) != sma.d) {
                return;
            }
        }
        this.i = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(wma wmaVar, gf9 gf9Var) {
        char c;
        long j;
        long j2;
        long j3;
        x0d x0dVar;
        x0d x0dVar2;
        Object g;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        x0d x0dVar3 = this.n;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (x0dVar3 != null) {
            Object[] objArr = x0dVar3.c;
            long[] jArr3 = x0dVar3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                y0d y0dVar = (y0d) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = y0dVar.b;
                                long[] jArr4 = y0dVar.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    wma wmaVar2 = (wma) ((e0l) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (wmaVar2 != null) {
                                                        boolean H = wmaVar2.H();
                                                        i4 = i8;
                                                        if (H) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    y0dVar.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                x0dVar = this.n;
                if (x0dVar != null) {
                    long[] jArr5 = x0dVar.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((y0d) x0dVar.c[i18]).g()) {
                                            x0dVar.l(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                x0dVar2 = this.n;
                if (x0dVar2 == null) {
                    x0dVar2 = new x0d();
                    this.n = x0dVar2;
                }
                g = x0dVar2.g(gf9Var);
                if (g == null) {
                    g = new y0d();
                    x0dVar2.m(gf9Var, g);
                }
                ((y0d) g).k(new e0l(wmaVar));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        x0dVar = this.n;
        if (x0dVar != null) {
        }
        x0dVar2 = this.n;
        if (x0dVar2 == null) {
        }
        g = x0dVar2.g(gf9Var);
        if (g == null) {
        }
        ((y0d) g).k(new e0l(wmaVar));
    }

    public abstract int p0(jo joVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(she sheVar, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        wma wmaVar;
        boolean z2;
        int i;
        char c2;
        long j6;
        uyd snapshotObserver;
        x0d x0dVar = this.n;
        jy0 jy0Var = this.m;
        if (jy0Var == null) {
            jy0Var = new jy0();
            this.m = jy0Var;
        }
        jy0 jy0Var2 = jy0Var;
        ryd rydVar = y0().n;
        if (rydVar != null && (snapshotObserver = ((xy) rydVar).getSnapshotObserver()) != null) {
            snapshotObserver.a.i(sheVar, s84.x, new rkb(this, j, j2, sheVar));
        }
        boolean W = W();
        y0d y0dVar = (y0d) jy0Var2.e;
        y0d y0dVar2 = (y0d) jy0Var2.f;
        int i2 = jy0Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) jy0Var2.d)[i3];
            if (b == 3) {
                gf9 gf9Var = ((gf9[]) jy0Var2.b)[i3];
                gf9Var.getClass();
                y0dVar2.k(gf9Var);
            } else if (b != 0 && x0dVar != null) {
                gf9 gf9Var2 = ((gf9[]) jy0Var2.b)[i3];
                gf9Var2.getClass();
                y0d y0dVar3 = (y0d) x0dVar.k(gf9Var2);
                if (y0dVar3 != null) {
                    y0dVar.j(y0dVar3);
                }
            }
        }
        int i4 = jy0Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) jy0Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                gf9[] gf9VarArr = (gf9[]) jy0Var2.b;
                gf9VarArr[i6 - i5] = gf9VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = jy0Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((gf9[]) jy0Var2.b)[i8] = null;
        }
        jy0Var2.a -= i5;
        tkb B0 = B0();
        Object[] objArr = y0dVar2.b;
        long[] jArr = y0dVar2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            gf9 gf9Var3 = (gf9) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            tkb tkbVar = B0 == null ? this : B0;
                            i = i9;
                            tkb tkbVar2 = tkbVar;
                            while (true) {
                                jy0 jy0Var3 = tkbVar2.m;
                                if (jy0Var3 != null) {
                                    z2 = W;
                                    if (ph0.v((gf9[]) jy0Var3.b, gf9Var3)) {
                                        break;
                                    }
                                } else {
                                    z2 = W;
                                }
                                tkb B02 = tkbVar2.B0();
                                if (B02 == null) {
                                    break;
                                }
                                tkbVar2 = B02;
                                W = z2;
                            }
                            x0d x0dVar2 = tkbVar2.n;
                            y0d y0dVar4 = x0dVar2 != null ? (y0d) x0dVar2.k(gf9Var3) : null;
                            if (y0dVar4 != null) {
                                tkbVar.K0(y0dVar4);
                            }
                        } else {
                            z2 = W;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        W = z2;
                    }
                    z = W;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = W;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                W = z;
                i9 = 8;
            }
        } else {
            z = W;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        y0dVar2.b();
        Object[] objArr2 = y0dVar.b;
        long[] jArr2 = y0dVar.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (wmaVar = (wma) ((e0l) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                wmaVar.S(false);
                            } else {
                                wmaVar.U(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        y0dVar.b();
    }

    public final void r0(l1c l1cVar) {
        long j;
        long j2;
        x0d x0dVar = this.n;
        if (this.k) {
            return;
        }
        Function1 c = l1cVar.c();
        if (c != null) {
            boolean z = this.g != c;
            if (z || !I0().a) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                dma w0 = w0();
                long L = s6a.L(w0.I(0L));
                long e = w0.e();
                j2 = L;
                j = e;
                z = (r6a.b(L, I0().b) && c7a.a(e, I0().c)) ? false : true;
            }
            if (z) {
                she sheVar = this.h;
                if (sheVar != null) {
                    sheVar.a = l1cVar;
                } else {
                    sheVar = new she(l1cVar, this);
                    this.h = sheVar;
                }
                q0(sheVar, j2, j);
                this.g = l1cVar.c();
                return;
            }
            return;
        }
        if (x0dVar != null) {
            Object[] objArr = x0dVar.c;
            long[] jArr = x0dVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                K0((y0d) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            x0dVar.a();
        }
    }

    public abstract tkb t0();

    public abstract dma w0();

    public abstract boolean x0();

    public abstract wma y0();

    public abstract l1c z0();
}
