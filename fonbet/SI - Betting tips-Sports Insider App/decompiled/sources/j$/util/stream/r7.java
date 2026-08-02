package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class r7 extends e7 implements j$.util.z0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.e7
    public final e7 e(Spliterator spliterator) {
        return new r7(this.f17876b, spliterator, this.f17875a);
    }

    @Override // j$.util.stream.e7
    public final void d() {
        v6 v6Var = new v6();
        this.f17882h = v6Var;
        Objects.requireNonNull(v6Var);
        this.f17879e = this.f17876b.E0(new q7(v6Var, 1));
        this.f17880f = new j$.util.p(10, this);
    }

    @Override // j$.util.stream.e7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.z0) super.trySplit();
    }

    @Override // j$.util.stream.e7, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (j$.util.z0) super.trySplit();
    }

    @Override // j$.util.stream.e7, j$.util.Spliterator
    public final j$.util.z0 trySplit() {
        return (j$.util.z0) super.trySplit();
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean a7 = a();
        if (a7) {
            v6 v6Var = (v6) this.f17882h;
            long j6 = this.f17881g;
            int r5 = v6Var.r(j6);
            if (v6Var.f17852c == 0 && r5 == 0) {
                j = ((long[]) v6Var.f18150e)[(int) j6];
            } else {
                j = ((long[][]) v6Var.f18151f)[r5][(int) (j6 - v6Var.f17853d[r5])];
            }
            longConsumer.accept(j);
        }
        return a7;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f17882h == null && !this.f17883i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            q7 q7Var = new q7(longConsumer, 0);
            this.f17876b.D0(this.f17878d, q7Var);
            this.f17883i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
