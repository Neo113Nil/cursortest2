package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class y5 extends c {
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final IntFunction f18165k;

    /* renamed from: l, reason: collision with root package name */
    public final long f18166l;

    /* renamed from: m, reason: collision with root package name */
    public final long f18167m;

    /* renamed from: n, reason: collision with root package name */
    public long f18168n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f18169o;

    @Override // j$.util.stream.c
    public final void f() {
        this.f17820i = true;
        if (this.f18169o) {
            d(x3.i0(this.j.K0()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        if (r2 >= r0) goto L49;
     */
    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCompletion(CountedCompleter countedCompleter) {
        y5 y5Var;
        i2 i02;
        e eVar = this.f17870d;
        if (eVar != null) {
            this.f18168n = ((y5) eVar).f18168n + ((y5) this.f17871e).f18168n;
            if (this.f17820i) {
                this.f18168n = 0L;
                i02 = x3.i0(this.j.K0());
            } else {
                i02 = this.f18168n == 0 ? x3.i0(this.j.K0()) : ((y5) this.f17870d).f18168n == 0 ? (i2) ((y5) this.f17871e).i() : x3.e0(this.j.K0(), (i2) ((y5) this.f17870d).i(), (i2) ((y5) this.f17871e).i());
            }
            i2 i2Var = i02;
            if (b()) {
                i2Var = i2Var.i(this.f18166l, this.f18167m >= 0 ? Math.min(i2Var.count(), this.f18166l + this.f18167m) : this.f18168n, this.f18165k);
            }
            d(i2Var);
            this.f18169o = true;
        }
        if (this.f18167m >= 0 && !b()) {
            long j = this.f18166l + this.f18167m;
            long j6 = this.f18169o ? this.f18168n : j(j);
            if (j6 < j) {
                y5 y5Var2 = (y5) ((e) getCompleter());
                y5 y5Var3 = this;
                while (true) {
                    if (y5Var2 != null) {
                        if (y5Var3 == y5Var2.f17871e && (y5Var = (y5) y5Var2.f17870d) != null) {
                            long j10 = y5Var.j(j) + j6;
                            if (j10 >= j) {
                                break;
                            } else {
                                j6 = j10;
                            }
                        }
                        y5Var3 = y5Var2;
                        y5Var2 = (y5) ((e) y5Var2.getCompleter());
                    }
                }
            }
            g();
        }
        super.onCompletion(countedCompleter);
    }

    public y5(b bVar, x3 x3Var, Spliterator spliterator, IntFunction intFunction, long j, long j6) {
        super(x3Var, spliterator);
        this.j = bVar;
        this.f18165k = intFunction;
        this.f18166l = j;
        this.f18167m = j6;
    }

    public y5(y5 y5Var, Spliterator spliterator) {
        super(y5Var, spliterator);
        this.j = y5Var.j;
        this.f18165k = y5Var.f18165k;
        this.f18166l = y5Var.f18166l;
        this.f18167m = y5Var.f18167m;
    }

    @Override // j$.util.stream.e
    public final e c(Spliterator spliterator) {
        return new y5(this, spliterator);
    }

    @Override // j$.util.stream.c
    public final Object h() {
        return x3.i0(this.j.K0());
    }

    @Override // j$.util.stream.e
    public final Object a() {
        if (b()) {
            c7 c7Var = c7.SIZED;
            b bVar = this.j;
            int i5 = bVar.j;
            int i10 = c7Var.f17846e;
            a2 z0 = this.j.z0((i5 & i10) == i10 ? bVar.k0(this.f17868b) : -1L, this.f18165k);
            n5 O0 = this.j.O0(((b) this.f17867a).f17804m, z0);
            x3 x3Var = this.f17867a;
            x3Var.g0(this.f17868b, x3Var.E0(O0));
            return z0.build();
        }
        a2 z02 = this.j.z0(-1L, this.f18165k);
        if (this.f18166l == 0) {
            n5 O02 = this.j.O0(((b) this.f17867a).f17804m, z02);
            x3 x3Var2 = this.f17867a;
            x3Var2.g0(this.f17868b, x3Var2.E0(O02));
        } else {
            this.f17867a.D0(this.f17868b, z02);
        }
        i2 build = z02.build();
        this.f18168n = build.count();
        this.f18169o = true;
        this.f17868b = null;
        return build;
    }

    public final long j(long j) {
        if (this.f18169o) {
            return this.f18168n;
        }
        y5 y5Var = (y5) this.f17870d;
        y5 y5Var2 = (y5) this.f17871e;
        if (y5Var == null || y5Var2 == null) {
            return this.f18168n;
        }
        long j6 = y5Var.j(j);
        return j6 >= j ? j6 : y5Var2.j(j) + j6;
    }
}
