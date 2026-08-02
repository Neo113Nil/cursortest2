package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class q2 extends s2 implements e2 {
    @Override // j$.util.stream.i2
    public final /* synthetic */ void forEach(Consumer consumer) {
        x3.Q(this, consumer);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.T(this, j, j6);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ void k(Object[] objArr, int i5) {
        x3.N(this, (Integer[]) objArr, i5);
    }

    @Override // j$.util.stream.h2
    public final Object newArray(int i5) {
        return new int[i5];
    }

    @Override // j$.util.stream.i2
    public final Spliterator spliterator() {
        return new h3(this);
    }

    @Override // j$.util.stream.i2
    public final j$.util.c1 spliterator() {
        return new h3(this);
    }
}
