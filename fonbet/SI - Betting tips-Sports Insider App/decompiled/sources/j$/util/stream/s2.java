package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class s2 extends k2 implements h2 {
    @Override // j$.util.stream.i2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return x3.L(this, intFunction);
    }

    @Override // j$.util.stream.h2
    public final void g(Object obj) {
        ((h2) this.f17948a).g(obj);
        ((h2) this.f17949b).g(obj);
    }

    @Override // j$.util.stream.h2
    public final void f(int i5, Object obj) {
        i2 i2Var = this.f17948a;
        ((h2) i2Var).f(i5, obj);
        ((h2) this.f17949b).f(i5 + ((int) ((h2) i2Var).count()), obj);
    }

    @Override // j$.util.stream.h2
    public final Object b() {
        long j = this.f17950c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object newArray = newArray((int) j);
        f(0, newArray);
        return newArray;
    }

    public final String toString() {
        long j = this.f17950c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f17948a, this.f17949b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
