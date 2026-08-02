package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class z4 extends e {

    /* renamed from: h, reason: collision with root package name */
    public final x3 f18178h;

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e eVar = this.f17870d;
        if (eVar != null) {
            s4 s4Var = (s4) ((z4) eVar).f17872f;
            s4Var.j((s4) ((z4) this.f17871e).f17872f);
            this.f17872f = s4Var;
        }
        super.onCompletion(countedCompleter);
    }

    public z4(x3 x3Var, x3 x3Var2, Spliterator spliterator) {
        super(x3Var2, spliterator);
        this.f18178h = x3Var;
    }

    public z4(z4 z4Var, Spliterator spliterator) {
        super(z4Var, spliterator);
        this.f18178h = z4Var.f18178h;
    }

    @Override // j$.util.stream.e
    public final e c(Spliterator spliterator) {
        return new z4(this, spliterator);
    }

    @Override // j$.util.stream.e
    public final Object a() {
        x3 x3Var = this.f17867a;
        s4 C0 = this.f18178h.C0();
        x3Var.D0(this.f17868b, C0);
        return C0;
    }
}
