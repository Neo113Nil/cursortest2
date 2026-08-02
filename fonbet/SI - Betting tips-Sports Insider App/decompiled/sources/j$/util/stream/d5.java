package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class d5 extends f5 {
    @Override // j$.util.stream.b
    public final boolean N0() {
        return true;
    }

    @Override // j$.util.stream.h
    public final h unordered() {
        return !c7.ORDERED.n(this.f17804m) ? this : new b5(this, c7.f17837r);
    }
}
