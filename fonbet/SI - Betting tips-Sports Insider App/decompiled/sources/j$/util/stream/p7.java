package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class p7 extends e7 implements j$.util.w0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.stream.e7
    public final e7 e(Spliterator spliterator) {
        return new p7(this.f17876b, spliterator, this.f17875a);
    }

    @Override // j$.util.stream.e7
    public final void d() {
        t6 t6Var = new t6();
        this.f17882h = t6Var;
        Objects.requireNonNull(t6Var);
        this.f17879e = this.f17876b.E0(new o7(t6Var, 1));
        this.f17880f = new j$.util.p(9, this);
    }

    @Override // j$.util.stream.e7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.w0) super.trySplit();
    }

    @Override // j$.util.stream.e7, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (j$.util.w0) super.trySplit();
    }

    @Override // j$.util.stream.e7, j$.util.Spliterator
    public final j$.util.w0 trySplit() {
        return (j$.util.w0) super.trySplit();
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i5;
        Objects.requireNonNull(intConsumer);
        boolean a7 = a();
        if (a7) {
            t6 t6Var = (t6) this.f17882h;
            long j = this.f17881g;
            int r5 = t6Var.r(j);
            if (t6Var.f17852c == 0 && r5 == 0) {
                i5 = ((int[]) t6Var.f18150e)[(int) j];
            } else {
                i5 = ((int[][]) t6Var.f18151f)[r5][(int) (j - t6Var.f17853d[r5])];
            }
            intConsumer.accept(i5);
        }
        return a7;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f17882h == null && !this.f17883i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            o7 o7Var = new o7(intConsumer, 0);
            this.f17876b.D0(this.f17878d, o7Var);
            this.f17883i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
