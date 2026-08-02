package androidx.media3.exoplayer.source;

import H1.O;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.source.b0;
import b1.AbstractC2335D;
import b1.InterfaceC2358l;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.InterfaceC4148o;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import m1.O0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q1.InterfaceC6104m;
import q1.t;
import q1.u;

/* loaded from: classes.dex */
public class b0 implements H1.O {

    /* renamed from: A, reason: collision with root package name */
    public boolean f21681A;

    /* renamed from: a, reason: collision with root package name */
    public final Z f21682a;

    /* renamed from: d, reason: collision with root package name */
    public final q1.u f21685d;

    /* renamed from: e, reason: collision with root package name */
    public final t.a f21686e;

    /* renamed from: f, reason: collision with root package name */
    public d f21687f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.media3.common.a f21688g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC6104m f21689h;

    /* renamed from: j, reason: collision with root package name */
    public int f21691j;

    /* renamed from: k, reason: collision with root package name */
    public int f21692k;

    /* renamed from: l, reason: collision with root package name */
    public int f21693l;

    /* renamed from: m, reason: collision with root package name */
    public int f21694m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21698q;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21701t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.media3.common.a f21702u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.media3.common.a f21703v;

    /* renamed from: w, reason: collision with root package name */
    public long f21704w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f21706y;

    /* renamed from: z, reason: collision with root package name */
    public long f21707z;

    /* renamed from: b, reason: collision with root package name */
    public final b f21683b = new b();

    /* renamed from: i, reason: collision with root package name */
    public int f21690i = 1000;
    private long[] sourceIds = new long[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private O.a[] cryptoDatas = new O.a[1000];

    /* renamed from: c, reason: collision with root package name */
    public final i0 f21684c = new i0(new InterfaceC4148o() { // from class: androidx.media3.exoplayer.source.a0
        @Override // e1.InterfaceC4148o
        public final void accept(Object obj) {
            ((b0.c) obj).f21712b.release();
        }
    });

    /* renamed from: n, reason: collision with root package name */
    public long f21695n = Long.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public long f21696o = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public long f21697p = Long.MIN_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21700s = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21699r = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21705x = true;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f21708a;

        /* renamed from: b, reason: collision with root package name */
        public long f21709b;

        /* renamed from: c, reason: collision with root package name */
        public O.a f21710c;
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.a f21711a;

        /* renamed from: b, reason: collision with root package name */
        public final u.b f21712b;

        public c(androidx.media3.common.a aVar, u.b bVar) {
            this.f21711a = aVar;
            this.f21712b = bVar;
        }
    }

    public interface d {
        void a(androidx.media3.common.a aVar);
    }

    public b0(D1.b bVar, q1.u uVar, t.a aVar) {
        this.f21685d = uVar;
        this.f21686e = aVar;
        this.f21682a = new Z(bVar);
    }

    public static b0 l(D1.b bVar, q1.u uVar, t.a aVar) {
        return new b0(bVar, (q1.u) AbstractC4134a.e(uVar), (t.a) AbstractC4134a.e(aVar));
    }

    public static b0 m(D1.b bVar) {
        return new b0(bVar, null, null);
    }

    public final int A() {
        return this.f21692k;
    }

    public final synchronized long B() {
        return this.f21691j == 0 ? Long.MIN_VALUE : this.timesUs[this.f21693l];
    }

    public final synchronized long C() {
        return this.f21697p;
    }

    public final synchronized long D() {
        return Math.max(this.f21696o, E(this.f21694m));
    }

    public final long E(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int G10 = G(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.timesUs[G10]);
            if ((this.flags[G10] & 1) != 0) {
                return j10;
            }
            G10--;
            if (G10 == -1) {
                G10 = this.f21690i - 1;
            }
        }
        return j10;
    }

    public final int F() {
        return this.f21692k + this.f21694m;
    }

    public final int G(int i10) {
        int i11 = this.f21693l + i10;
        int i12 = this.f21690i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int H(long j10, boolean z10) {
        Throwable th2;
        try {
            try {
                int G10 = G(this.f21694m);
                if (!K() || j10 < this.timesUs[G10]) {
                    return 0;
                }
                if (j10 <= this.f21697p || !z10) {
                    int y10 = y(G10, this.f21691j - this.f21694m, j10, true);
                    if (y10 == -1) {
                        return 0;
                    }
                    return y10;
                }
                try {
                    return this.f21691j - this.f21694m;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized androidx.media3.common.a I() {
        return this.f21700s ? null : this.f21703v;
    }

    public final int J() {
        return this.f21692k + this.f21691j;
    }

    public final boolean K() {
        return this.f21694m != this.f21691j;
    }

    public final void L() {
        this.f21701t = true;
    }

    public final synchronized boolean M() {
        return this.f21698q;
    }

    public synchronized boolean N(boolean z10) {
        androidx.media3.common.a aVar;
        boolean z11 = true;
        if (K()) {
            if (((c) this.f21684c.e(F())).f21711a != this.f21688g) {
                return true;
            }
            return O(G(this.f21694m));
        }
        if (!z10 && !this.f21698q && ((aVar = this.f21703v) == null || aVar == this.f21688g)) {
            z11 = false;
        }
        return z11;
    }

    public final boolean O(int i10) {
        InterfaceC6104m interfaceC6104m = this.f21689h;
        if (interfaceC6104m == null || interfaceC6104m.getState() == 4) {
            return true;
        }
        return (this.flags[i10] & 1073741824) == 0 && this.f21689h.c();
    }

    public void P() {
        InterfaceC6104m interfaceC6104m = this.f21689h;
        if (interfaceC6104m != null && interfaceC6104m.getState() == 1) {
            throw ((InterfaceC6104m.a) AbstractC4134a.e(this.f21689h.getError()));
        }
    }

    public final void Q(androidx.media3.common.a aVar, O0 o02) {
        androidx.media3.common.a aVar2 = this.f21688g;
        boolean z10 = aVar2 == null;
        DrmInitData drmInitData = aVar2 == null ? null : aVar2.f20547s;
        this.f21688g = aVar;
        DrmInitData drmInitData2 = aVar.f20547s;
        q1.u uVar = this.f21685d;
        o02.f56121b = uVar != null ? aVar.c(uVar.b(aVar)) : aVar;
        o02.f56120a = this.f21689h;
        if (this.f21685d == null) {
            return;
        }
        if (z10 || !Objects.equals(drmInitData, drmInitData2)) {
            InterfaceC6104m interfaceC6104m = this.f21689h;
            InterfaceC6104m c10 = this.f21685d.c(this.f21686e, aVar);
            this.f21689h = c10;
            o02.f56120a = c10;
            if (interfaceC6104m != null) {
                interfaceC6104m.d(this.f21686e);
            }
        }
    }

    public final synchronized int R(O0 o02, k1.f fVar, boolean z10, boolean z11, b bVar) {
        try {
            fVar.f54109e = false;
            if (!K()) {
                if (!z11 && !this.f21698q) {
                    androidx.media3.common.a aVar = this.f21703v;
                    if (aVar == null || (!z10 && aVar == this.f21688g)) {
                        return -3;
                    }
                    Q((androidx.media3.common.a) AbstractC4134a.e(aVar), o02);
                    return -5;
                }
                fVar.n(4);
                fVar.f54110f = Long.MIN_VALUE;
                return -4;
            }
            androidx.media3.common.a aVar2 = ((c) this.f21684c.e(F())).f21711a;
            if (!z10 && aVar2 == this.f21688g) {
                int G10 = G(this.f21694m);
                if (!O(G10)) {
                    fVar.f54109e = true;
                    return -3;
                }
                fVar.n(this.flags[G10]);
                if (this.f21694m == this.f21691j - 1 && (z11 || this.f21698q)) {
                    fVar.e(PKIFailureInfo.duplicateCertReq);
                }
                fVar.f54110f = this.timesUs[G10];
                bVar.f21708a = this.sizes[G10];
                bVar.f21709b = this.offsets[G10];
                bVar.f21710c = this.cryptoDatas[G10];
                return -4;
            }
            Q(aVar2, o02);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long S() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return K() ? this.sourceIds[G(this.f21694m)] : this.f21704w;
    }

    public void T() {
        s();
        W();
    }

    public int U(O0 o02, k1.f fVar, int i10, boolean z10) {
        int R10 = R(o02, fVar, (i10 & 2) != 0, z10, this.f21683b);
        if (R10 == -4 && !fVar.i()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f21682a.f(fVar, this.f21683b);
                } else {
                    this.f21682a.m(fVar, this.f21683b);
                }
            }
            if (!z11) {
                this.f21694m++;
            }
        }
        return R10;
    }

    public void V() {
        Y(true);
        W();
    }

    public final void W() {
        InterfaceC6104m interfaceC6104m = this.f21689h;
        if (interfaceC6104m != null) {
            interfaceC6104m.d(this.f21686e);
            this.f21689h = null;
            this.f21688g = null;
        }
    }

    public final void X() {
        Y(false);
    }

    public void Y(boolean z10) {
        this.f21682a.n();
        this.f21691j = 0;
        this.f21692k = 0;
        this.f21693l = 0;
        this.f21694m = 0;
        this.f21699r = true;
        this.f21695n = Long.MIN_VALUE;
        this.f21696o = Long.MIN_VALUE;
        this.f21697p = Long.MIN_VALUE;
        this.f21698q = false;
        this.f21684c.b();
        if (z10) {
            this.f21702u = null;
            this.f21703v = null;
            this.f21700s = true;
            this.f21705x = true;
        }
    }

    public final synchronized void Z() {
        this.f21694m = 0;
        this.f21682a.o();
    }

    public final synchronized boolean a0(int i10) {
        Z();
        int i11 = this.f21692k;
        if (i10 >= i11 && i10 <= this.f21691j + i11) {
            this.f21695n = Long.MIN_VALUE;
            this.f21694m = i10 - i11;
            return true;
        }
        return false;
    }

    @Override // H1.O
    public final int b(InterfaceC2358l interfaceC2358l, int i10, boolean z10, int i11) {
        return this.f21682a.p(interfaceC2358l, i10, z10);
    }

    public final synchronized boolean b0(long j10, boolean z10) {
        b0 b0Var;
        long j11;
        int y10;
        try {
            try {
                Z();
                int G10 = G(this.f21694m);
                if (!K() || j10 < this.timesUs[G10] || (j10 > this.f21697p && !z10)) {
                    return false;
                }
                if (this.f21705x) {
                    b0Var = this;
                    j11 = j10;
                    y10 = b0Var.x(G10, this.f21691j - this.f21694m, j11, z10);
                } else {
                    b0Var = this;
                    j11 = j10;
                    y10 = b0Var.y(G10, b0Var.f21691j - b0Var.f21694m, j11, true);
                }
                if (y10 == -1) {
                    return false;
                }
                b0Var.f21695n = j11;
                b0Var.f21694m += y10;
                return true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // H1.O
    public final void c(androidx.media3.common.a aVar) {
        androidx.media3.common.a z10 = z(aVar);
        this.f21701t = false;
        this.f21702u = aVar;
        boolean e02 = e0(z10);
        d dVar = this.f21687f;
        if (dVar == null || !e02) {
            return;
        }
        dVar.a(z10);
    }

    public final void c0(long j10) {
        if (this.f21707z != j10) {
            this.f21707z = j10;
            L();
        }
    }

    public final void d0(long j10) {
        this.f21695n = j10;
    }

    public final synchronized boolean e0(androidx.media3.common.a aVar) {
        try {
            this.f21700s = false;
            if (Objects.equals(aVar, this.f21703v)) {
                return false;
            }
            if (this.f21684c.g() || !((c) this.f21684c.f()).f21711a.equals(aVar)) {
                this.f21703v = aVar;
            } else {
                this.f21703v = ((c) this.f21684c.f()).f21711a;
            }
            boolean z10 = this.f21705x;
            androidx.media3.common.a aVar2 = this.f21703v;
            this.f21705x = z10 & AbstractC2335D.a(aVar2.f20543o, aVar2.f20539k);
            this.f21706y = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // H1.O
    public final void f(e1.J j10, int i10, int i11) {
        this.f21682a.q(j10, i10);
    }

    public final void f0(d dVar) {
        this.f21687f = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // H1.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(long j10, int i10, int i11, int i12, O.a aVar) {
        int i13;
        if (this.f21701t) {
            c((androidx.media3.common.a) AbstractC4134a.i(this.f21702u));
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.f21699r) {
            if (!z10) {
                return;
            } else {
                this.f21699r = false;
            }
        }
        long j11 = this.f21707z + j10;
        if (this.f21705x) {
            if (j11 < this.f21695n) {
                return;
            }
            if (i14 == 0) {
                if (!this.f21706y) {
                    AbstractC4156x.i("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f21703v);
                    this.f21706y = true;
                }
                i13 = i10 | 1;
                if (this.f21681A) {
                    if (!z10 || !i(j11)) {
                        return;
                    } else {
                        this.f21681A = false;
                    }
                }
                j(j11, i13, (this.f21682a.e() - i11) - i12, i11, aVar);
            }
        }
        i13 = i10;
        if (this.f21681A) {
        }
        j(j11, i13, (this.f21682a.e() - i11) - i12, i11, aVar);
    }

    public final synchronized void g0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f21694m + i10 <= this.f21691j) {
                    z10 = true;
                    AbstractC4134a.a(z10);
                    this.f21694m += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        AbstractC4134a.a(z10);
        this.f21694m += i10;
    }

    public final void h0(long j10) {
        this.f21704w = j10;
    }

    public final synchronized boolean i(long j10) {
        if (this.f21691j == 0) {
            return j10 > this.f21696o;
        }
        if (D() >= j10) {
            return false;
        }
        v(this.f21692k + k(j10));
        return true;
    }

    public final void i0() {
        this.f21681A = true;
    }

    public final synchronized void j(long j10, int i10, long j11, int i11, O.a aVar) {
        try {
            int i12 = this.f21691j;
            if (i12 > 0) {
                int G10 = G(i12 - 1);
                AbstractC4134a.a(this.offsets[G10] + ((long) this.sizes[G10]) <= j11);
            }
            this.f21698q = (536870912 & i10) != 0;
            this.f21697p = Math.max(this.f21697p, j10);
            int G11 = G(this.f21691j);
            this.timesUs[G11] = j10;
            this.offsets[G11] = j11;
            this.sizes[G11] = i11;
            this.flags[G11] = i10;
            this.cryptoDatas[G11] = aVar;
            this.sourceIds[G11] = this.f21704w;
            if (this.f21684c.g() || !((c) this.f21684c.f()).f21711a.equals(this.f21703v)) {
                androidx.media3.common.a aVar2 = (androidx.media3.common.a) AbstractC4134a.e(this.f21703v);
                q1.u uVar = this.f21685d;
                this.f21684c.a(J(), new c(aVar2, uVar != null ? uVar.d(this.f21686e, aVar2) : u.b.f63351a));
            }
            int i13 = this.f21691j + 1;
            this.f21691j = i13;
            int i14 = this.f21690i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                O.a[] aVarArr = new O.a[i15];
                int i16 = this.f21693l;
                int i17 = i14 - i16;
                System.arraycopy(this.offsets, i16, jArr2, 0, i17);
                System.arraycopy(this.timesUs, this.f21693l, jArr3, 0, i17);
                System.arraycopy(this.flags, this.f21693l, iArr, 0, i17);
                System.arraycopy(this.sizes, this.f21693l, iArr2, 0, i17);
                System.arraycopy(this.cryptoDatas, this.f21693l, aVarArr, 0, i17);
                System.arraycopy(this.sourceIds, this.f21693l, jArr, 0, i17);
                int i18 = this.f21693l;
                System.arraycopy(this.offsets, 0, jArr2, i17, i18);
                System.arraycopy(this.timesUs, 0, jArr3, i17, i18);
                System.arraycopy(this.flags, 0, iArr, i17, i18);
                System.arraycopy(this.sizes, 0, iArr2, i17, i18);
                System.arraycopy(this.cryptoDatas, 0, aVarArr, i17, i18);
                System.arraycopy(this.sourceIds, 0, jArr, i17, i18);
                this.offsets = jArr2;
                this.timesUs = jArr3;
                this.flags = iArr;
                this.sizes = iArr2;
                this.cryptoDatas = aVarArr;
                this.sourceIds = jArr;
                this.f21693l = 0;
                this.f21690i = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int k(long j10) {
        int i10 = this.f21691j;
        int G10 = G(i10 - 1);
        while (i10 > this.f21694m && this.timesUs[G10] >= j10) {
            i10--;
            G10--;
            if (G10 == -1) {
                G10 = this.f21690i - 1;
            }
        }
        return i10;
    }

    public final synchronized long n(long j10, boolean z10, boolean z11) {
        Throwable th2;
        try {
            try {
                int i10 = this.f21691j;
                if (i10 != 0) {
                    long[] jArr = this.timesUs;
                    int i11 = this.f21693l;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f21694m;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int y10 = y(i11, i10, j10, z10);
                        if (y10 == -1) {
                            return -1L;
                        }
                        return q(y10);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final synchronized long o() {
        int i10 = this.f21691j;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    public synchronized long p() {
        int i10 = this.f21694m;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    public final long q(int i10) {
        this.f21696o = Math.max(this.f21696o, E(i10));
        this.f21691j -= i10;
        int i11 = this.f21692k + i10;
        this.f21692k = i11;
        int i12 = this.f21693l + i10;
        this.f21693l = i12;
        int i13 = this.f21690i;
        if (i12 >= i13) {
            this.f21693l = i12 - i13;
        }
        int i14 = this.f21694m - i10;
        this.f21694m = i14;
        if (i14 < 0) {
            this.f21694m = 0;
        }
        this.f21684c.d(i11);
        if (this.f21691j != 0) {
            return this.offsets[this.f21693l];
        }
        int i15 = this.f21693l;
        if (i15 == 0) {
            i15 = this.f21690i;
        }
        return this.offsets[i15 - 1] + this.sizes[r6];
    }

    public final void r(long j10, boolean z10, boolean z11) {
        this.f21682a.b(n(j10, z10, z11));
    }

    public final void s() {
        this.f21682a.b(o());
    }

    public final void t() {
        this.f21682a.b(p());
    }

    public final void u(long j10) {
        if (this.f21691j == 0) {
            return;
        }
        AbstractC4134a.a(j10 > D());
        w(this.f21692k + k(j10));
    }

    public final long v(int i10) {
        int J10 = J() - i10;
        boolean z10 = false;
        AbstractC4134a.a(J10 >= 0 && J10 <= this.f21691j - this.f21694m);
        int i11 = this.f21691j - J10;
        this.f21691j = i11;
        this.f21697p = Math.max(this.f21696o, E(i11));
        if (J10 == 0 && this.f21698q) {
            z10 = true;
        }
        this.f21698q = z10;
        this.f21684c.c(i10);
        int i12 = this.f21691j;
        if (i12 == 0) {
            return 0L;
        }
        return this.offsets[G(i12 - 1)] + this.sizes[r9];
    }

    public final void w(int i10) {
        this.f21682a.c(v(i10));
    }

    public final int x(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.timesUs[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f21690i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    public final int y(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.timesUs[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.flags[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f21690i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public androidx.media3.common.a z(androidx.media3.common.a aVar) {
        return (this.f21707z == 0 || aVar.f20548t == LongCompanionObject.MAX_VALUE) ? aVar : aVar.b().C0(aVar.f20548t + this.f21707z).P();
    }
}
