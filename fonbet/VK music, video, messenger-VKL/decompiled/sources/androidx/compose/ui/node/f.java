package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xsna.dp10;
import xsna.epx;
import xsna.fp10;
import xsna.gt1;
import xsna.gzs;
import xsna.h9x;
import xsna.ior0;
import xsna.izs;
import xsna.jb30;
import xsna.kt1;
import xsna.l600;
import xsna.n34;
import xsna.ndx0;
import xsna.ph50;
import xsna.q9x;
import xsna.qh50;
import xsna.qrg0;
import xsna.rl3;
import xsna.s3q0;
import xsna.soy;
import xsna.srg0;
import xsna.t590;
import xsna.tny;
import xsna.tra0;
import xsna.trg0;
import xsna.ura0;
import xsna.uzw;
import xsna.vra0;

/* compiled from: LookaheadDelegate.kt */
/* loaded from: classes11.dex */
public abstract class f extends tra0 implements fp10, jb30 {
    public static final a p = a.i;
    public b g;
    public izs<? super srg0, s3q0> h;
    public vra0 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final l600 m;
    public trg0 n;
    public ph50<qrg0, qh50<ndx0<LayoutNode>>> o;

    /* compiled from: LookaheadDelegate.kt */
    public static final class a extends Lambda implements izs<vra0, s3q0> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final s3q0 invoke(vra0 vra0Var) {
            vra0 vra0Var2 = vra0Var;
            if (vra0Var2.d1()) {
                f fVar = vra0Var2.c;
                if (!fVar.l) {
                    izs<srg0, s3q0> k = vra0Var2.b.k();
                    ph50<qrg0, qh50<ndx0<LayoutNode>>> ph50Var = fVar.o;
                    if (k != null) {
                        fVar.A0(vra0Var2, 9223372034707292159L, 0L);
                        fVar.h = k;
                    } else if (ph50Var != null) {
                        Object[] objArr = ph50Var.c;
                        long[] jArr = ph50Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j) < 128) {
                                            fVar.S0((qh50) objArr[(i2 << 3) + i4]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i3 != 8) {
                                        break;
                                    }
                                }
                                if (i2 == length) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        ph50Var.h();
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: LookaheadDelegate.kt */
    public final class b implements srg0 {
        public boolean b;
        public long c = 9223372034707292159L;
        public long d = 0;

        public b() {
        }

        @Override // xsna.srg0
        public final void e1(qrg0 qrg0Var, float f) {
            f fVar = f.this;
            trg0 trg0Var = fVar.n;
            if (trg0Var == null) {
                trg0Var = new trg0();
                fVar.n = trg0Var;
            }
            int U = rl3.U(qrg0Var, trg0Var.b);
            if (U >= 0) {
                float[] fArr = trg0Var.c;
                if (fArr[U] != f) {
                    fArr[U] = f;
                    trg0Var.d[U] = 1;
                    return;
                } else {
                    byte[] bArr = trg0Var.d;
                    if (bArr[U] == 2) {
                        bArr[U] = 0;
                        return;
                    }
                    return;
                }
            }
            int i = trg0Var.a;
            qrg0[] qrg0VarArr = trg0Var.b;
            if (i == qrg0VarArr.length) {
                int i2 = i * 2;
                trg0Var.b = (qrg0[]) Arrays.copyOf(qrg0VarArr, i2);
                trg0Var.c = Arrays.copyOf(trg0Var.c, i2);
                trg0Var.d = Arrays.copyOf(trg0Var.d, i2);
            }
            trg0Var.b[i] = qrg0Var;
            trg0Var.d[i] = 3;
            trg0Var.c[i] = f;
            trg0Var.a++;
        }

        @Override // xsna.srg0
        public final tny g1() {
            this.b = true;
            f fVar = f.this;
            tny g1 = fVar.g1();
            if (h9x.b(this.c, 9223372034707292159L)) {
                this.c = n34.A(g1.k(0L));
                this.d = g1.a();
            }
            fVar.o1().H.b();
            return g1;
        }

        @Override // xsna.azl
        public final float getDensity() {
            return f.this.getDensity();
        }

        @Override // xsna.azl
        public final float getFontScale() {
            return f.this.getFontScale();
        }
    }

    /* compiled from: LookaheadDelegate.kt */
    public static final class c extends Lambda implements gzs<s3q0> {
        final /* synthetic */ vra0 $placeableResult;
        final /* synthetic */ long $positionOnScreen;
        final /* synthetic */ long $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2, vra0 vra0Var) {
            super(0);
            this.$positionOnScreen = j;
            this.$size = j2;
            this.$placeableResult = vra0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            f fVar = f.this;
            a aVar = f.p;
            fVar.P0().b = false;
            f.this.P0().c = this.$positionOnScreen;
            f.this.P0().d = this.$size;
            izs<srg0, s3q0> k = this.$placeableResult.b.k();
            if (k != null) {
                k.invoke(f.this.P0());
            }
            return s3q0.a;
        }
    }

    /* compiled from: LookaheadDelegate.kt */
    public static final class d implements dp10 {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map<gt1, Integer> c;
        public final /* synthetic */ izs<srg0, s3q0> d;
        public final /* synthetic */ izs<tra0.a, s3q0> e;
        public final /* synthetic */ f f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, izs<? super tra0.a, s3q0> izsVar2, f fVar) {
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = izsVar;
            this.e = izsVar2;
            this.f = fVar;
        }

        @Override // xsna.dp10
        public final int getHeight() {
            return this.b;
        }

        @Override // xsna.dp10
        public final int getWidth() {
            return this.a;
        }

        @Override // xsna.dp10
        public final void j() {
            this.e.invoke(this.f.m);
        }

        @Override // xsna.dp10
        public final izs<srg0, s3q0> k() {
            return this.d;
        }

        @Override // xsna.dp10
        public final Map<gt1, Integer> q() {
            return this.c;
        }
    }

    public f() {
        ura0.a aVar = ura0.a;
        this.m = new l600(this);
    }

    public static void R0(o oVar) {
        soy soyVar;
        o oVar2 = oVar.t;
        LayoutNode layoutNode = oVar.q;
        if (!epx.f(oVar2 != null ? oVar2.q : null, layoutNode)) {
            layoutNode.H.p.z.g();
            return;
        }
        kt1 c0 = layoutNode.H.p.c0();
        if (c0 == null || (soyVar = ((k) c0).z) == null) {
            return;
        }
        soyVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0(vra0 vra0Var, long j, long j2) {
        boolean z;
        char c2;
        long j3;
        long j4;
        long j5;
        LayoutNode layoutNode;
        boolean z2;
        int i;
        char c3;
        long j6;
        qh50<ndx0<LayoutNode>> n;
        t590 snapshotObserver;
        ph50<qrg0, qh50<ndx0<LayoutNode>>> ph50Var = this.o;
        trg0 trg0Var = this.n;
        if (trg0Var == null) {
            trg0Var = new trg0();
            this.n = trg0Var;
        }
        trg0 trg0Var2 = trg0Var;
        p pVar = o1().o;
        if (pVar != null && (snapshotObserver = pVar.getSnapshotObserver()) != null) {
            snapshotObserver.a.d(vra0Var, p, new c(j, j2, vra0Var));
        }
        boolean z1 = z1();
        qh50<ndx0<LayoutNode>> qh50Var = trg0Var2.e;
        qh50<qrg0> qh50Var2 = trg0Var2.f;
        int i2 = trg0Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = trg0Var2.d[i3];
            if (b2 == 3) {
                qh50Var2.k(trg0Var2.b[i3]);
            } else if (b2 != 0 && ph50Var != null && (n = ph50Var.n(trg0Var2.b[i3])) != null) {
                qh50Var.l(n);
            }
        }
        int i4 = trg0Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = trg0Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                qrg0[] qrg0VarArr = trg0Var2.b;
                qrg0VarArr[i6 - i5] = qrg0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = trg0Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            trg0Var2.b[i8] = null;
        }
        trg0Var2.a -= i5;
        f M0 = M0();
        Object[] objArr = qh50Var2.b;
        long[] jArr = qh50Var2.a;
        int length = jArr.length - 2;
        char c4 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c4) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c3 = c4;
                            qrg0 qrg0Var = (qrg0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            f fVar = M0 == null ? this : M0;
                            i = i9;
                            f fVar2 = fVar;
                            while (true) {
                                trg0 trg0Var3 = fVar2.n;
                                if (trg0Var3 != null) {
                                    z2 = z1;
                                    if (rl3.G(trg0Var3.b, qrg0Var)) {
                                        break;
                                    }
                                } else {
                                    z2 = z1;
                                }
                                f M02 = fVar2.M0();
                                if (M02 == null) {
                                    break;
                                }
                                fVar2 = M02;
                                z1 = z2;
                            }
                            ph50<qrg0, qh50<ndx0<LayoutNode>>> ph50Var2 = fVar2.o;
                            qh50<ndx0<LayoutNode>> n2 = ph50Var2 != null ? ph50Var2.n(qrg0Var) : null;
                            if (n2 != null) {
                                fVar.S0(n2);
                            }
                        } else {
                            z2 = z1;
                            i = i9;
                            c3 = c4;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c4 = c3;
                        j7 = j6;
                        i9 = i;
                        z1 = z2;
                    }
                    z = z1;
                    c2 = c4;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = z1;
                    c2 = c4;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c4 = c2;
                j7 = j3;
                z1 = z;
                i9 = 8;
            }
        } else {
            z = z1;
            c2 = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        qh50Var2.f();
        Object[] objArr2 = qh50Var.b;
        long[] jArr2 = qh50Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c2) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (layoutNode = (LayoutNode) ((ndx0) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                layoutNode.c0(false);
                            } else {
                                layoutNode.e0(false);
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
        qh50Var.f();
    }

    public final void E0(dp10 dp10Var) {
        long j;
        long j2;
        ph50<qrg0, qh50<ndx0<LayoutNode>>> ph50Var = this.o;
        if (!this.l) {
            izs<srg0, s3q0> k = dp10Var.k();
            if (k != null) {
                boolean z = this.h != k;
                if (z || !P0().b) {
                    j = 0;
                    j2 = 9223372034707292159L;
                } else {
                    tny g1 = g1();
                    long A = n34.A(g1.k(0L));
                    long a2 = g1.a();
                    j2 = A;
                    j = a2;
                    z = (h9x.b(A, P0().c) && q9x.b(a2, P0().d)) ? false : true;
                }
                if (z) {
                    vra0 vra0Var = this.i;
                    if (vra0Var != null) {
                        vra0Var.b = dp10Var;
                    } else {
                        vra0Var = new vra0(dp10Var, this);
                        this.i = vra0Var;
                    }
                    A0(vra0Var, j2, j);
                    this.h = dp10Var.k();
                }
            } else if (ph50Var != null) {
                Object[] objArr = ph50Var.c;
                long[] jArr = ph50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j3 = jArr[i];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j3) < 128) {
                                    S0((qh50) objArr[(i << 3) + i3]);
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
                ph50Var.h();
            }
        }
    }

    public abstract f F0();

    @Override // xsna.ep10
    public final dp10 F1(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, izs<? super tra0.a, s3q0> izsVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            uzw.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(i, i2, map, izsVar, izsVar2, this);
    }

    public abstract boolean H0();

    public abstract dp10 J0();

    public abstract f M0();

    public abstract long N0();

    public final b P0() {
        b bVar = this.g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.g = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S0(qh50<ndx0<LayoutNode>> qh50Var) {
        LayoutNode layoutNode;
        Object[] objArr = qh50Var.b;
        long[] jArr = qh50Var.a;
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
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((ndx0) objArr[(i << 3) + i3]).get()) != null) {
                        if (z1()) {
                            layoutNode.c0(false);
                        } else {
                            layoutNode.e0(false);
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

    public abstract void U0();

    @Override // xsna.jp10
    public final int g0(gt1 gt1Var) {
        int y0;
        if (H0() && (y0 = y0(gt1Var)) != Integer.MIN_VALUE) {
            return y0 + ((int) (gt1Var instanceof ior0 ? this.f >> 32 : this.f & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract tny g1();

    @Override // xsna.fp10
    public abstract LayoutNode o1();

    @Override // xsna.jb30
    public final void v(boolean z) {
        f M0 = M0();
        LayoutNode o1 = M0 != null ? M0.o1() : null;
        if (epx.f(o1, o1())) {
            this.j = z;
            return;
        }
        if ((o1 != null ? o1.H.d : null) != LayoutNode.LayoutState.LayingOut) {
            if ((o1 != null ? o1.H.d : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        this.j = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(LayoutNode layoutNode, qrg0 qrg0Var) {
        char c2;
        long j;
        long j2;
        long j3;
        ph50<qrg0, qh50<ndx0<LayoutNode>>> ph50Var;
        ph50<qrg0, qh50<ndx0<LayoutNode>>> ph50Var2;
        qh50<ndx0<LayoutNode>> d2;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c3;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        ph50<qrg0, qh50<ndx0<LayoutNode>>> ph50Var3 = this.o;
        char c4 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (ph50Var3 != null) {
            Object[] objArr = ph50Var3.c;
            long[] jArr3 = ph50Var3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c4) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c3 = c4;
                                qh50 qh50Var = (qh50) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = qh50Var.b;
                                long[] jArr4 = qh50Var.a;
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
                                        if ((((~j10) << c3) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((ndx0) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (layoutNode2 != null) {
                                                        boolean e = layoutNode2.e();
                                                        i4 = i8;
                                                        if (e) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    qh50Var.n(i14);
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
                                c3 = c4;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c4 = c3;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c2 = c4;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c2 = c4;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c4 = c2;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                ph50Var = this.o;
                if (ph50Var != null) {
                    long[] jArr5 = ph50Var.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c2) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((qh50) ph50Var.c[i18]).c()) {
                                            ph50Var.o(i18);
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
                ph50Var2 = this.o;
                Object obj = null;
                if (ph50Var2 == null) {
                    ph50Var2 = new ph50<>(obj);
                    this.o = ph50Var2;
                }
                d2 = ph50Var2.d(qrg0Var);
                if (d2 == null) {
                    d2 = new qh50<>((Object) null);
                    ph50Var2.p(qrg0Var, d2);
                }
                d2.k(new ndx0<>(layoutNode));
            }
        }
        c2 = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        ph50Var = this.o;
        if (ph50Var != null) {
        }
        ph50Var2 = this.o;
        Object obj2 = null;
        if (ph50Var2 == null) {
        }
        d2 = ph50Var2.d(qrg0Var);
        if (d2 == null) {
        }
        d2.k(new ndx0<>(layoutNode));
    }

    public abstract int y0(gt1 gt1Var);

    @Override // xsna.apx
    public boolean z1() {
        return false;
    }
}
