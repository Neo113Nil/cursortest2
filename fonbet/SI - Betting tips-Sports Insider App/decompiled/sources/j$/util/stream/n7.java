package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class n7 extends e7 implements j$.util.t0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    @Override // j$.util.stream.e7
    public final e7 e(Spliterator spliterator) {
        return new n7(this.f17876b, spliterator, this.f17875a);
    }

    @Override // j$.util.stream.e7
    public final void d() {
        r6 r6Var = new r6();
        this.f17882h = r6Var;
        Objects.requireNonNull(r6Var);
        this.f17879e = this.f17876b.E0(new m7(r6Var, 1));
        this.f17880f = new j$.util.p(8, this);
    }

    @Override // j$.util.stream.e7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.t0) super.trySplit();
    }

    @Override // j$.util.stream.e7, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (j$.util.t0) super.trySplit();
    }

    @Override // j$.util.stream.e7, j$.util.Spliterator
    public final j$.util.t0 trySplit() {
        return (j$.util.t0) super.trySplit();
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d10;
        Objects.requireNonNull(doubleConsumer);
        boolean a7 = a();
        if (a7) {
            r6 r6Var = (r6) this.f17882h;
            long j = this.f17881g;
            int r5 = r6Var.r(j);
            if (r6Var.f17852c == 0 && r5 == 0) {
                d10 = ((double[]) r6Var.f18150e)[(int) j];
            } else {
                d10 = ((double[][]) r6Var.f18151f)[r5][(int) (j - r6Var.f17853d[r5])];
            }
            doubleConsumer.accept(d10);
        }
        return a7;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f17882h == null && !this.f17883i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            m7 m7Var = new m7(doubleConsumer, 0);
            this.f17876b.D0(this.f17878d, m7Var);
            this.f17883i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
