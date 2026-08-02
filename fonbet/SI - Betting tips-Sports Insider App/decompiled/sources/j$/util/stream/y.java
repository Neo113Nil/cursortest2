package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class y extends b0 {
    @Override // j$.util.stream.b, j$.util.stream.h
    public final e0 sequential() {
        this.f17800h.f17808r = false;
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.h
    public final e0 parallel() {
        this.f17800h.f17808r = true;
        return this;
    }

    @Override // j$.util.stream.b0, j$.util.stream.e0
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.f17800h.f17808r) {
            super.forEach(doubleConsumer);
        } else {
            b0.S0(Q0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.b0, j$.util.stream.e0
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.f17800h.f17808r) {
            super.forEachOrdered(doubleConsumer);
        } else {
            b0.S0(Q0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.h
    public final h unordered() {
        return !c7.ORDERED.n(this.f17804m) ? this : new t(this, c7.f17837r, 1);
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
