package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class t0 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public Spliterator f18080a;

    /* renamed from: b, reason: collision with root package name */
    public final n5 f18081b;

    /* renamed from: c, reason: collision with root package name */
    public final x3 f18082c;

    /* renamed from: d, reason: collision with root package name */
    public long f18083d;

    public t0(x3 x3Var, Spliterator spliterator, n5 n5Var) {
        super(null);
        this.f18081b = n5Var;
        this.f18082c = x3Var;
        this.f18080a = spliterator;
        this.f18083d = 0L;
    }

    public t0(t0 t0Var, Spliterator spliterator) {
        super(t0Var);
        this.f18080a = spliterator;
        this.f18081b = t0Var.f18081b;
        this.f18083d = t0Var.f18083d;
        this.f18082c = t0Var.f18082c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18080a;
        long estimateSize = spliterator.estimateSize();
        long j = this.f18083d;
        if (j == 0) {
            j = e.e(estimateSize);
            this.f18083d = j;
        }
        boolean n9 = c7.SHORT_CIRCUIT.n(((b) this.f18082c).f17804m);
        n5 n5Var = this.f18081b;
        boolean z5 = false;
        t0 t0Var = this;
        while (true) {
            if (n9 && n5Var.e()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            t0 t0Var2 = new t0(t0Var, trySplit);
            t0Var.addToPendingCount(1);
            if (z5) {
                spliterator = trySplit;
            } else {
                t0 t0Var3 = t0Var;
                t0Var = t0Var2;
                t0Var2 = t0Var3;
            }
            z5 = !z5;
            t0Var.fork();
            t0Var = t0Var2;
            estimateSize = spliterator.estimateSize();
        }
        t0Var.f18082c.f0(spliterator, n5Var);
        t0Var.f18080a = null;
        t0Var.propagateCompletion();
    }
}
