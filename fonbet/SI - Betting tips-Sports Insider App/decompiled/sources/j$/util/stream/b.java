package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class b extends x3 implements h {

    /* renamed from: h, reason: collision with root package name */
    public final b f17800h;

    /* renamed from: i, reason: collision with root package name */
    public final b f17801i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final b f17802k;

    /* renamed from: l, reason: collision with root package name */
    public int f17803l;

    /* renamed from: m, reason: collision with root package name */
    public int f17804m;

    /* renamed from: n, reason: collision with root package name */
    public Spliterator f17805n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17806o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17807p;
    public Runnable q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17808r;

    public abstract i2 I0(b bVar, Spliterator spliterator, boolean z5, IntFunction intFunction);

    public abstract boolean J0(Spliterator spliterator, n5 n5Var);

    public abstract d7 K0();

    public abstract boolean N0();

    public abstract n5 O0(int i5, n5 n5Var);

    public abstract Spliterator R0(b bVar, Supplier supplier, boolean z5);

    public b(Spliterator spliterator, int i5, boolean z5) {
        this.f17801i = null;
        this.f17805n = spliterator;
        this.f17800h = this;
        int i10 = c7.f17828g & i5;
        this.j = i10;
        this.f17804m = (~(i10 << 1)) & c7.f17832l;
        this.f17803l = 0;
        this.f17808r = z5;
    }

    public b(b bVar, int i5) {
        if (bVar.f17806o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        bVar.f17806o = true;
        bVar.f17802k = this;
        this.f17801i = bVar;
        this.j = c7.f17829h & i5;
        this.f17804m = c7.i(i5, bVar.f17804m);
        b bVar2 = bVar.f17800h;
        this.f17800h = bVar2;
        if (N0()) {
            bVar2.f17807p = true;
        }
        this.f17803l = bVar.f17803l + 1;
    }

    public final Object G0(i8 i8Var) {
        if (this.f17806o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f17806o = true;
        if (this.f17800h.f17808r) {
            return i8Var.i(this, P0(i8Var.v()));
        }
        return i8Var.f(this, P0(i8Var.v()));
    }

    public final i2 H0(IntFunction intFunction) {
        if (this.f17806o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f17806o = true;
        if (this.f17800h.f17808r && this.f17801i != null && N0()) {
            this.f17803l = 0;
            b bVar = this.f17801i;
            return L0(bVar, bVar.P0(0), intFunction);
        }
        return j0(P0(0), true, intFunction);
    }

    public final Spliterator Q0() {
        b bVar = this.f17800h;
        if (this != bVar) {
            throw new IllegalStateException();
        }
        if (this.f17806o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f17806o = true;
        Spliterator spliterator = bVar.f17805n;
        if (spliterator != null) {
            bVar.f17805n = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final h sequential() {
        this.f17800h.f17808r = false;
        return this;
    }

    public final h parallel() {
        this.f17800h.f17808r = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f17806o = true;
        this.f17805n = null;
        b bVar = this.f17800h;
        Runnable runnable = bVar.q;
        if (runnable != null) {
            bVar.q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.h
    public final h onClose(Runnable runnable) {
        if (this.f17806o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        b bVar = this.f17800h;
        Runnable runnable2 = bVar.q;
        if (runnable2 != null) {
            runnable = new h8(runnable2, runnable);
        }
        bVar.q = runnable;
        return this;
    }

    public Spliterator spliterator() {
        if (this.f17806o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f17806o = true;
        b bVar = this.f17800h;
        if (this == bVar) {
            Spliterator spliterator = bVar.f17805n;
            if (spliterator != null) {
                bVar.f17805n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return R0(this, new a(0, this), bVar.f17808r);
    }

    @Override // j$.util.stream.h
    public final boolean isParallel() {
        return this.f17800h.f17808r;
    }

    @Override // j$.util.stream.x3
    public final i2 j0(Spliterator spliterator, boolean z5, IntFunction intFunction) {
        if (this.f17800h.f17808r) {
            return I0(this, spliterator, z5, intFunction);
        }
        a2 z0 = z0(k0(spliterator), intFunction);
        D0(spliterator, z0);
        return z0.build();
    }

    public final Spliterator P0(int i5) {
        int i10;
        int i11;
        b bVar = this.f17800h;
        Spliterator spliterator = bVar.f17805n;
        if (spliterator != null) {
            bVar.f17805n = null;
            if (bVar.f17808r && bVar.f17807p) {
                b bVar2 = bVar.f17802k;
                int i12 = 1;
                while (bVar != this) {
                    int i13 = bVar2.j;
                    if (bVar2.N0()) {
                        if (c7.SHORT_CIRCUIT.n(i13)) {
                            i13 &= ~c7.f17840u;
                        }
                        spliterator = bVar2.M0(bVar, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i10 = (~c7.f17839t) & i13;
                            i11 = c7.f17838s;
                        } else {
                            i10 = (~c7.f17838s) & i13;
                            i11 = c7.f17839t;
                        }
                        i13 = i10 | i11;
                        i12 = 0;
                    }
                    int i14 = i12 + 1;
                    bVar2.f17803l = i12;
                    bVar2.f17804m = c7.i(i13, bVar.f17804m);
                    b bVar3 = bVar2;
                    bVar2 = bVar2.f17802k;
                    bVar = bVar3;
                    i12 = i14;
                }
            }
            if (i5 != 0) {
                this.f17804m = c7.i(i5, this.f17804m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.x3
    public final long k0(Spliterator spliterator) {
        if (c7.SIZED.n(this.f17804m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.x3
    public final n5 D0(Spliterator spliterator, n5 n5Var) {
        f0(spliterator, E0((n5) Objects.requireNonNull(n5Var)));
        return n5Var;
    }

    @Override // j$.util.stream.x3
    public final void f0(Spliterator spliterator, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        if (!c7.SHORT_CIRCUIT.n(this.f17804m)) {
            n5Var.c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(n5Var);
            n5Var.end();
            return;
        }
        g0(spliterator, n5Var);
    }

    @Override // j$.util.stream.x3
    public final boolean g0(Spliterator spliterator, n5 n5Var) {
        b bVar = this;
        while (bVar.f17803l > 0) {
            bVar = bVar.f17801i;
        }
        n5Var.c(spliterator.getExactSizeIfKnown());
        boolean J0 = bVar.J0(spliterator, n5Var);
        n5Var.end();
        return J0;
    }

    @Override // j$.util.stream.x3
    public final n5 E0(n5 n5Var) {
        Objects.requireNonNull(n5Var);
        for (b bVar = this; bVar.f17803l > 0; bVar = bVar.f17801i) {
            n5Var = bVar.O0(bVar.f17801i.f17804m, n5Var);
        }
        return n5Var;
    }

    @Override // j$.util.stream.x3
    public final Spliterator F0(Spliterator spliterator) {
        return this.f17803l == 0 ? spliterator : R0(this, new a(1, spliterator), this.f17800h.f17808r);
    }

    public i2 L0(x3 x3Var, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator M0(b bVar, Spliterator spliterator) {
        return L0(bVar, spliterator, new j$.time.x(10)).spliterator();
    }
}
