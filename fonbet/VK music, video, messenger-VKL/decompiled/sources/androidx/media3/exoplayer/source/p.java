package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.source.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import xsna.ahn;
import xsna.at;
import xsna.fxc0;
import xsna.io20;
import xsna.rgp0;
import xsna.sik0;
import xsna.suk;
import xsna.vu1;
import xsna.w8s;
import xsna.wq;
import xsna.xi90;
import xsna.xu1;

/* compiled from: SampleQueue.java */
/* loaded from: classes12.dex */
public class p implements rgp0 {

    @Nullable
    public androidx.media3.common.a A;

    @Nullable
    public androidx.media3.common.a B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final o a;

    @Nullable
    public final androidx.media3.exoplayer.drm.b d;

    @Nullable
    public final a.C0054a e;

    @Nullable
    public Object f;

    @Nullable
    public androidx.media3.common.a g;

    @Nullable
    public DrmSession h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final a b = new a();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public rgp0.a[] o = new rgp0.a[1000];
    public final sik0<b> c = new sik0<>(new wq(29));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    /* compiled from: SampleQueue.java */
    public static final class a {
        public int a;
        public long b;

        @Nullable
        public rgp0.a c;
    }

    /* compiled from: SampleQueue.java */
    public static final class b {
        public final androidx.media3.common.a a;
        public final b.InterfaceC0056b b;

        public b(androidx.media3.common.a aVar, b.InterfaceC0056b interfaceC0056b) {
            this.a = aVar;
            this.b = interfaceC0056b;
        }
    }

    /* compiled from: SampleQueue.java */
    public interface c {
        void b();
    }

    public p(xu1 xu1Var, @Nullable androidx.media3.exoplayer.drm.b bVar, @Nullable a.C0054a c0054a) {
        this.d = bVar;
        this.e = c0054a;
        this.a = new o(xu1Var);
    }

    public final void A(androidx.media3.common.a aVar, w8s w8sVar) {
        androidx.media3.common.a aVar2;
        androidx.media3.common.a aVar3 = this.g;
        boolean z = aVar3 == null;
        DrmInitData drmInitData = aVar3 == null ? null : aVar3.r;
        this.g = aVar;
        DrmInitData drmInitData2 = aVar.r;
        androidx.media3.exoplayer.drm.b bVar = this.d;
        if (bVar != null) {
            int a2 = bVar.a(aVar);
            a.C0043a a3 = aVar.a();
            a3.N = a2;
            aVar2 = new androidx.media3.common.a(a3);
        } else {
            aVar2 = aVar;
        }
        w8sVar.b = aVar2;
        w8sVar.a = this.h;
        if (bVar == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.h;
            a.C0054a c0054a = this.e;
            DrmSession c2 = bVar.c(c0054a, aVar);
            this.h = c2;
            w8sVar.a = c2;
            if (drmSession != null) {
                drmSession.b(c0054a);
            }
        }
    }

    public final synchronized long B() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[u(this.s)] : this.C;
    }

    public final int C(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        a aVar = this.b;
        synchronized (this) {
            try {
                decoderInputBuffer.f = false;
                i2 = -3;
                if (this.s != this.p) {
                    androidx.media3.common.a aVar2 = this.c.a(t()).a;
                    if (!z2 && aVar2 == this.g) {
                        int u = u(this.s);
                        if (y(u)) {
                            decoderInputBuffer.b = this.m[u];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                decoderInputBuffer.a(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                            }
                            decoderInputBuffer.g = this.n[u];
                            aVar.a = this.l[u];
                            aVar.b = this.k[u];
                            aVar.c = this.o[u];
                            i2 = -4;
                        } else {
                            decoderInputBuffer.f = true;
                        }
                    }
                    A(aVar2, w8sVar);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        androidx.media3.common.a aVar3 = this.B;
                        if (aVar3 == null || (!z2 && aVar3 == this.g)) {
                        }
                        A(aVar3, w8sVar);
                        i2 = -5;
                    }
                    decoderInputBuffer.b = 4;
                    decoderInputBuffer.g = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !decoderInputBuffer.b(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    o oVar = this.a;
                    o.e(oVar.e, decoderInputBuffer, this.b, oVar.c);
                } else {
                    o oVar2 = this.a;
                    oVar2.e = o.e(oVar2.e, decoderInputBuffer, this.b, oVar2.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void D(boolean z) {
        o oVar = this.a;
        o.a aVar = oVar.d;
        xu1 xu1Var = oVar.a;
        if (aVar.c != null) {
            xu1Var.b(aVar);
            aVar.c = null;
            aVar.d = null;
        }
        o.a aVar2 = oVar.d;
        int i = oVar.b;
        fxc0.z(aVar2.c == null);
        aVar2.a = 0L;
        aVar2.b = i;
        o.a aVar3 = oVar.d;
        oVar.e = aVar3;
        oVar.f = aVar3;
        oVar.g = 0L;
        xu1Var.trim();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        sik0<b> sik0Var = this.c;
        SparseArray<b> sparseArray = sik0Var.b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sik0Var.c.accept(sparseArray.valueAt(i2));
        }
        sik0Var.a = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean E(int i) {
        synchronized (this) {
            this.s = 0;
            o oVar = this.a;
            oVar.e = oVar.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean F(long j, boolean z) {
        Throwable th;
        p pVar;
        long j2;
        int o;
        try {
            synchronized (this) {
                try {
                    try {
                        this.s = 0;
                        o oVar = this.a;
                        oVar.e = oVar.d;
                        int u = u(0);
                        int i = this.s;
                        int i2 = this.p;
                        if (!(i != i2) || j < this.n[u] || (j > this.v && !z)) {
                            return false;
                        }
                        if (this.D) {
                            o = i2 - i;
                            int i3 = 0;
                            while (true) {
                                if (i3 < o) {
                                    try {
                                        if (this.n[u] >= j) {
                                            o = i3;
                                            break;
                                        }
                                        u++;
                                        if (u == this.i) {
                                            u = 0;
                                        }
                                        i3++;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } else if (!z) {
                                    o = -1;
                                }
                            }
                            pVar = this;
                            j2 = j;
                        } else {
                            pVar = this;
                            j2 = j;
                            o = pVar.o(u, i2 - i, j2, true);
                        }
                        if (o == -1) {
                            return false;
                        }
                        pVar.t = j2;
                        pVar.s += o;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final synchronized void G(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    fxc0.p(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        fxc0.p(z);
        this.s += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0104, code lost:
    
        if (r10.valueAt(r10.size() - 1).a.equals(r9.B) == false) goto L75;
     */
    @Override // xsna.rgp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j, int i, int i2, int i3, @Nullable rgp0.a aVar) {
        at atVar;
        boolean z;
        if (this.z) {
            androidx.media3.common.a aVar2 = this.A;
            aVar2.getClass();
            c(aVar2);
        }
        int i4 = i & 1;
        boolean z2 = i4 != 0;
        if (this.x) {
            if (!z2) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = j + this.F;
        if (this.D) {
            if (j2 < this.t) {
                return;
            }
            if (i4 == 0) {
                if (!this.E) {
                    ahn.F("Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i |= 1;
            }
        }
        if (this.G) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.p == 0) {
                    z = j2 > this.u;
                } else if (r() >= j2) {
                    z = false;
                } else {
                    m(this.q + h(j2));
                    z = true;
                }
            }
            if (!z) {
                return;
            } else {
                this.G = false;
            }
        }
        long j3 = (this.a.g - i2) - i3;
        synchronized (this) {
            try {
                int i5 = this.p;
                if (i5 > 0) {
                    int u = u(i5 - 1);
                    fxc0.p(this.k[u] + ((long) this.l[u]) <= j3);
                }
                this.w = (536870912 & i) != 0;
                this.v = Math.max(this.v, j2);
                int u2 = u(this.p);
                this.n[u2] = j2;
                this.k[u2] = j3;
                this.l[u2] = i2;
                this.m[u2] = i;
                this.o[u2] = aVar;
                this.j[u2] = this.C;
                if (!(this.c.b.size() == 0)) {
                    SparseArray<b> sparseArray = this.c.b;
                }
                androidx.media3.common.a aVar3 = this.B;
                aVar3.getClass();
                androidx.media3.exoplayer.drm.b bVar = this.d;
                if (bVar != null) {
                    bVar.getClass();
                    atVar = b.InterfaceC0056b.S6;
                } else {
                    atVar = b.InterfaceC0056b.S6;
                }
                sik0<b> sik0Var = this.c;
                int i6 = this.q + this.p;
                b bVar2 = new b(aVar3, atVar);
                SparseArray<b> sparseArray2 = sik0Var.b;
                if (sik0Var.a == -1) {
                    fxc0.z(sparseArray2.size() == 0);
                    sik0Var.a = 0;
                }
                if (sparseArray2.size() > 0) {
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    fxc0.p(i6 >= keyAt);
                    if (keyAt == i6) {
                        sik0Var.c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                    }
                }
                sparseArray2.append(i6, bVar2);
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
                    rgp0.a[] aVarArr = new rgp0.a[i9];
                    int i10 = this.r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.k, i10, jArr2, 0, i11);
                    System.arraycopy(this.n, this.r, jArr3, 0, i11);
                    System.arraycopy(this.m, this.r, iArr, 0, i11);
                    System.arraycopy(this.l, this.r, iArr2, 0, i11);
                    System.arraycopy(this.o, this.r, aVarArr, 0, i11);
                    System.arraycopy(this.j, this.r, jArr, 0, i11);
                    int i12 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i11, i12);
                    System.arraycopy(this.n, 0, jArr3, i11, i12);
                    System.arraycopy(this.m, 0, iArr, i11, i12);
                    System.arraycopy(this.l, 0, iArr2, i11, i12);
                    System.arraycopy(this.o, 0, aVarArr, i11, i12);
                    System.arraycopy(this.j, 0, jArr, i11, i12);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = aVarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.rgp0
    public final void b(xi90 xi90Var, int i, int i2) {
        while (true) {
            o oVar = this.a;
            if (i <= 0) {
                oVar.getClass();
                return;
            }
            int b2 = oVar.b(i);
            o.a aVar = oVar.f;
            vu1 vu1Var = aVar.c;
            xi90Var.n(vu1Var.a, ((int) (oVar.g - aVar.a)) + vu1Var.b, b2);
            i -= b2;
            long j = oVar.g + b2;
            oVar.g = j;
            o.a aVar2 = oVar.f;
            if (j == aVar2.b) {
                oVar.f = aVar2.d;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v23, types: [androidx.media3.exoplayer.source.p$c, java.lang.Object] */
    @Override // xsna.rgp0
    public final void c(androidx.media3.common.a aVar) {
        androidx.media3.common.a p = p(aVar);
        boolean z = false;
        this.z = false;
        this.A = aVar;
        synchronized (this) {
            try {
                this.y = false;
                if (!Objects.equals(p, this.B)) {
                    if (!(this.c.b.size() == 0)) {
                        SparseArray<b> sparseArray = this.c.b;
                        if (sparseArray.valueAt(sparseArray.size() - 1).a.equals(p)) {
                            SparseArray<b> sparseArray2 = this.c.b;
                            this.B = sparseArray2.valueAt(sparseArray2.size() - 1).a;
                            boolean z2 = this.D;
                            androidx.media3.common.a aVar2 = this.B;
                            this.D = z2 & io20.a(aVar2.n, aVar2.k);
                            this.E = false;
                            z = true;
                        }
                    }
                    this.B = p;
                    boolean z22 = this.D;
                    androidx.media3.common.a aVar22 = this.B;
                    this.D = z22 & io20.a(aVar22.n, aVar22.k);
                    this.E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? r5 = this.f;
        if (r5 == 0 || !z) {
            return;
        }
        r5.b();
    }

    @Override // xsna.rgp0
    public final int f(suk sukVar, int i, boolean z) throws IOException {
        o oVar = this.a;
        int b2 = oVar.b(i);
        o.a aVar = oVar.f;
        vu1 vu1Var = aVar.c;
        int read = sukVar.read(vu1Var.a, ((int) (oVar.g - aVar.a)) + vu1Var.b, b2);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = oVar.g + read;
        oVar.g = j;
        o.a aVar2 = oVar.f;
        if (j == aVar2.b) {
            oVar.f = aVar2.d;
        }
        return read;
    }

    public final int h(long j) {
        int i = this.p;
        int u = u(i - 1);
        while (i > this.s && this.n[u] >= j) {
            i--;
            u--;
            if (u == -1) {
                u = this.i - 1;
            }
        }
        return i;
    }

    public final long i(int i) {
        this.u = Math.max(this.u, s(i));
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
        sik0<b> sik0Var = this.c;
        SparseArray<b> sparseArray = sik0Var.b;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            sik0Var.c.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = sik0Var.a;
            if (i8 > 0) {
                sik0Var.a = i8 - 1;
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
        Throwable th;
        o oVar = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    long j2 = -1;
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
                                    throw th;
                                }
                            }
                            int o = o(i2, i, j, z);
                            if (o != -1) {
                                j2 = i(o);
                            }
                            oVar.a(j2);
                        }
                    }
                    oVar.a(j2);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void k() {
        long i;
        o oVar = this.a;
        synchronized (this) {
            int i2 = this.p;
            i = i2 == 0 ? -1L : i(i2);
        }
        oVar.a(i);
    }

    public final void l(long j) {
        if (this.p == 0) {
            return;
        }
        fxc0.p(j > r());
        n(this.q + h(j));
    }

    public final long m(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        fxc0.p(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, s(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        sik0<b> sik0Var = this.c;
        SparseArray<b> sparseArray = sik0Var.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            sik0Var.c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        sik0Var.a = sparseArray.size() > 0 ? Math.min(sik0Var.a, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        return this.k[u(i6 - 1)] + this.l[r9];
    }

    public final void n(int i) {
        long m = m(i);
        o oVar = this.a;
        int i2 = oVar.b;
        xu1 xu1Var = oVar.a;
        fxc0.p(m <= oVar.g);
        oVar.g = m;
        if (m != 0) {
            o.a aVar = oVar.d;
            if (m != aVar.a) {
                while (oVar.g > aVar.b) {
                    aVar = aVar.d;
                }
                o.a aVar2 = aVar.d;
                aVar2.getClass();
                if (aVar2.c != null) {
                    xu1Var.b(aVar2);
                    aVar2.c = null;
                    aVar2.d = null;
                }
                o.a aVar3 = new o.a(aVar.b, i2);
                aVar.d = aVar3;
                if (oVar.g == aVar.b) {
                    aVar = aVar3;
                }
                oVar.f = aVar;
                if (oVar.e == aVar2) {
                    oVar.e = aVar3;
                    return;
                }
                return;
            }
        }
        o.a aVar4 = oVar.d;
        if (aVar4.c != null) {
            xu1Var.b(aVar4);
            aVar4.c = null;
            aVar4.d = null;
        }
        o.a aVar5 = new o.a(oVar.g, i2);
        oVar.d = aVar5;
        oVar.e = aVar5;
        oVar.f = aVar5;
    }

    public final int o(int i, int i2, long j, boolean z) {
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

    public androidx.media3.common.a p(androidx.media3.common.a aVar) {
        if (this.F == 0 || aVar.s == Long.MAX_VALUE) {
            return aVar;
        }
        a.C0043a a2 = aVar.a();
        a2.r = aVar.s + this.F;
        return new androidx.media3.common.a(a2);
    }

    public final synchronized long q() {
        return this.v;
    }

    public final synchronized long r() {
        return Math.max(this.u, s(this.s));
    }

    public final long s(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int u = u(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[u]);
            if ((this.m[u] & 1) != 0) {
                return j;
            }
            u--;
            if (u == -1) {
                u = this.i - 1;
            }
        }
        return j;
    }

    public final int t() {
        return this.q + this.s;
    }

    public final int u(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int v(long j, boolean z) {
        try {
            try {
                int u = u(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[u]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int o = o(u, i2 - i, j, true);
                if (o == -1) {
                    return 0;
                }
                return o;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Nullable
    public final synchronized androidx.media3.common.a w() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean x(boolean z) {
        androidx.media3.common.a aVar;
        boolean z2 = false;
        if (this.s != this.p) {
            if (this.c.a(t()).a != this.g) {
                return true;
            }
            return y(u(this.s));
        }
        if (z || this.w || ((aVar = this.B) != null && aVar != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean y(int i) {
        DrmSession drmSession = this.h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.a();
    }

    public final void z() throws IOException {
        DrmSession drmSession = this.h;
        if (drmSession == null || drmSession.getState() != 1) {
            return;
        }
        DrmSession.DrmSessionException error = this.h.getError();
        error.getClass();
        throw error;
    }
}
