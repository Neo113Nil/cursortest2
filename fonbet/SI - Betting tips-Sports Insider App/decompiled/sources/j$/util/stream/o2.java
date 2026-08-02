package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public class o2 extends e {

    /* renamed from: h, reason: collision with root package name */
    public final x3 f18014h;

    /* renamed from: i, reason: collision with root package name */
    public final LongFunction f18015i;
    public final BinaryOperator j;

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e eVar = this.f17870d;
        if (eVar != null) {
            this.f17872f = (i2) this.j.apply((i2) ((o2) eVar).f17872f, (i2) ((o2) this.f17871e).f17872f);
        }
        super.onCompletion(countedCompleter);
    }

    public o2(x3 x3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(x3Var, spliterator);
        this.f18014h = x3Var;
        this.f18015i = longFunction;
        this.j = binaryOperator;
    }

    public o2(o2 o2Var, Spliterator spliterator) {
        super(o2Var, spliterator);
        this.f18014h = o2Var.f18014h;
        this.f18015i = o2Var.f18015i;
        this.j = o2Var.j;
    }

    @Override // j$.util.stream.e
    public e c(Spliterator spliterator) {
        return new o2(this, spliterator);
    }

    @Override // j$.util.stream.e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final i2 a() {
        a2 a2Var = (a2) this.f18015i.apply(this.f18014h.k0(this.f17868b));
        this.f18014h.D0(this.f17868b, a2Var);
        return a2Var.build();
    }
}
