package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class b3 implements i2 {
    @Override // j$.util.stream.i2
    public final long count() {
        return 0L;
    }

    public final void g(Object obj) {
    }

    @Override // j$.util.stream.i2
    public /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.V(this, j, j6, intFunction);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.i2
    public i2 a(int i5) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.i2
    public final Object[] m(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    public final void f(int i5, Object obj) {
    }
}
