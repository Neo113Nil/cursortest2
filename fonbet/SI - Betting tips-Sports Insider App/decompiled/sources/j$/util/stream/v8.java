package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class v8 extends e {

    /* renamed from: h, reason: collision with root package name */
    public final b f18113h;

    /* renamed from: i, reason: collision with root package name */
    public final IntFunction f18114i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f18115k;

    /* renamed from: l, reason: collision with root package name */
    public long f18116l;

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e eVar = this.f17870d;
        if (eVar != null) {
            if (this.j) {
                v8 v8Var = (v8) eVar;
                long j = v8Var.f18116l;
                this.f18116l = j;
                if (j == v8Var.f18115k) {
                    this.f18116l = j + ((v8) this.f17871e).f18116l;
                }
            }
            v8 v8Var2 = (v8) eVar;
            long j6 = v8Var2.f18115k;
            v8 v8Var3 = (v8) this.f17871e;
            this.f18115k = j6 + v8Var3.f18115k;
            i2 e0 = v8Var2.f18115k == 0 ? (i2) v8Var3.f17872f : v8Var3.f18115k == 0 ? (i2) v8Var2.f17872f : x3.e0(this.f18113h.K0(), (i2) ((v8) this.f17870d).f17872f, (i2) ((v8) this.f17871e).f17872f);
            if (b() && this.j) {
                e0 = e0.i(this.f18116l, e0.count(), this.f18114i);
            }
            this.f17872f = e0;
        }
        super.onCompletion(countedCompleter);
    }

    public v8(b bVar, x3 x3Var, Spliterator spliterator, IntFunction intFunction) {
        super(x3Var, spliterator);
        this.f18113h = bVar;
        this.f18114i = intFunction;
        this.j = c7.ORDERED.n(((b) x3Var).f17804m);
    }

    public v8(v8 v8Var, Spliterator spliterator) {
        super(v8Var, spliterator);
        this.f18113h = v8Var.f18113h;
        this.f18114i = v8Var.f18114i;
        this.j = v8Var.j;
    }

    @Override // j$.util.stream.e
    public final e c(Spliterator spliterator) {
        return new v8(this, spliterator);
    }

    @Override // j$.util.stream.e
    public final Object a() {
        long j;
        boolean b10 = b();
        if (!b10 && this.j) {
            c7 c7Var = c7.SIZED;
            b bVar = this.f18113h;
            int i5 = bVar.j;
            int i10 = c7Var.f17846e;
            if ((i5 & i10) == i10) {
                j = bVar.k0(this.f17868b);
                a2 z0 = this.f17867a.z0(j, this.f18114i);
                u8 h10 = ((t8) this.f18113h).h(z0, (this.j || b10) ? false : true);
                this.f17867a.D0(this.f17868b, h10);
                i2 build = z0.build();
                this.f18115k = build.count();
                this.f18116l = h10.h();
                return build;
            }
        }
        j = -1;
        a2 z02 = this.f17867a.z0(j, this.f18114i);
        u8 h102 = ((t8) this.f18113h).h(z02, (this.j || b10) ? false : true);
        this.f17867a.D0(this.f17868b, h102);
        i2 build2 = z02.build();
        this.f18115k = build2.count();
        this.f18116l = h102.h();
        return build2;
    }
}
