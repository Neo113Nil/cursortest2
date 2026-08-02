package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class h1 extends k1 {
    @Override // j$.util.stream.b, j$.util.stream.h
    public final n1 sequential() {
        this.f17800h.f17808r = false;
        return this;
    }

    @Override // j$.util.stream.b, j$.util.stream.h
    public final n1 parallel() {
        this.f17800h.f17808r = true;
        return this;
    }

    @Override // j$.util.stream.k1, j$.util.stream.n1
    public final void forEach(LongConsumer longConsumer) {
        if (this.f17800h.f17808r) {
            super.forEach(longConsumer);
        } else {
            k1.S0(Q0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.k1, j$.util.stream.n1
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.f17800h.f17808r) {
            super.forEachOrdered(longConsumer);
        } else {
            k1.S0(Q0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.h
    public final h unordered() {
        return !c7.ORDERED.n(this.f17804m) ? this : new v(this, c7.f17837r, 4);
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
