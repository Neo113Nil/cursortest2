package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class z extends b0 {
    @Override // j$.util.stream.b
    public final boolean N0() {
        return true;
    }

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

    @Override // j$.util.stream.h
    public final h unordered() {
        return !c7.ORDERED.n(this.f17804m) ? this : new t(this, c7.f17837r, 1);
    }

    @Override // j$.util.stream.b, j$.util.stream.h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
