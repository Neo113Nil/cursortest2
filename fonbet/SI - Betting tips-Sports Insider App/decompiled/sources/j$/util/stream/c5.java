package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class c5 extends f5 {
    @Override // j$.util.stream.f5, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.f17800h.f17808r) {
            Q0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.f17800h.f17808r) {
            Q0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.h
    public final h unordered() {
        return !c7.ORDERED.n(this.f17804m) ? this : new b5(this, c7.f17837r);
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
