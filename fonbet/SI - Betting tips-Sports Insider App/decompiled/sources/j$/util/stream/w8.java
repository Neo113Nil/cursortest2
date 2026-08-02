package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class w8 extends c {
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final IntFunction f18134k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18135l;

    /* renamed from: m, reason: collision with root package name */
    public long f18136m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18137n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f18138o;

    @Override // j$.util.stream.c
    public final void f() {
        this.f17820i = true;
        if (this.f18135l && this.f18138o) {
            d(x3.i0(this.j.K0()));
        }
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object e0;
        e eVar = this.f17870d;
        if (eVar != null) {
            this.f18137n = ((w8) eVar).f18137n | ((w8) this.f17871e).f18137n;
            if (this.f18135l && this.f17820i) {
                this.f18136m = 0L;
                e0 = x3.i0(this.j.K0());
            } else {
                if (this.f18135l) {
                    w8 w8Var = (w8) this.f17870d;
                    if (w8Var.f18137n) {
                        this.f18136m = w8Var.f18136m;
                        e0 = (i2) w8Var.i();
                    }
                }
                w8 w8Var2 = (w8) this.f17870d;
                long j = w8Var2.f18136m;
                w8 w8Var3 = (w8) this.f17871e;
                this.f18136m = j + w8Var3.f18136m;
                if (w8Var2.f18136m == 0) {
                    e0 = (i2) w8Var3.i();
                } else if (w8Var3.f18136m == 0) {
                    e0 = (i2) w8Var2.i();
                } else {
                    e0 = x3.e0(this.j.K0(), (i2) ((w8) this.f17870d).i(), (i2) ((w8) this.f17871e).i());
                }
            }
            d(e0);
        }
        this.f18138o = true;
        super.onCompletion(countedCompleter);
    }

    public w8(b bVar, x3 x3Var, Spliterator spliterator, IntFunction intFunction) {
        super(x3Var, spliterator);
        this.j = bVar;
        this.f18134k = intFunction;
        this.f18135l = c7.ORDERED.n(((b) x3Var).f17804m);
    }

    public w8(w8 w8Var, Spliterator spliterator) {
        super(w8Var, spliterator);
        this.j = w8Var.j;
        this.f18134k = w8Var.f18134k;
        this.f18135l = w8Var.f18135l;
    }

    @Override // j$.util.stream.e
    public final e c(Spliterator spliterator) {
        return new w8(this, spliterator);
    }

    @Override // j$.util.stream.c
    public final Object h() {
        return x3.i0(this.j.K0());
    }

    @Override // j$.util.stream.e
    public final Object a() {
        a2 z0 = this.f17867a.z0(-1L, this.f18134k);
        n5 O0 = this.j.O0(((b) this.f17867a).f17804m, z0);
        x3 x3Var = this.f17867a;
        boolean g02 = x3Var.g0(this.f17868b, x3Var.E0(O0));
        this.f18137n = g02;
        if (g02) {
            g();
        }
        i2 build = z0.build();
        this.f18136m = build.count();
        return build;
    }
}
