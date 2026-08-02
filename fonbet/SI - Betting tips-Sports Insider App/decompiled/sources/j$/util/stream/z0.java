package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class z0 extends c1 {
    @Override // j$.util.stream.b, j$.util.stream.h
    public final IntStream sequential() {
        this.f17800h.f17808r = false;
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.h
    public final IntStream parallel() {
        this.f17800h.f17808r = true;
        return this;
    }

    @Override // j$.util.stream.c1, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.f17800h.f17808r) {
            super.forEach(intConsumer);
        } else {
            c1.S0(Q0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.c1, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.f17800h.f17808r) {
            super.forEachOrdered(intConsumer);
        } else {
            c1.S0(Q0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.h
    public final h unordered() {
        return !c7.ORDERED.n(this.f17804m) ? this : new u(this, c7.f17837r, 2);
    }

    @Override // j$.util.stream.b, j$.util.stream.h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.b
    public final boolean N0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        throw new UnsupportedOperationException();
    }
}
