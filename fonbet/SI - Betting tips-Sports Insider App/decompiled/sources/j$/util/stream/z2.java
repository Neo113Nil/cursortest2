package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class z2 extends b3 implements g2 {
    @Override // j$.util.stream.i2
    public final /* synthetic */ void forEach(Consumer consumer) {
        x3.R(this, consumer);
    }

    @Override // j$.util.stream.b3, j$.util.stream.i2
    public final /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.U(this, j, j6);
    }

    @Override // j$.util.stream.b3, j$.util.stream.i2
    public final /* bridge */ /* synthetic */ i2 a(int i5) {
        a(i5);
        throw null;
    }

    @Override // j$.util.stream.b3, j$.util.stream.i2
    public final h2 a(int i5) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ void k(Object[] objArr, int i5) {
        x3.O(this, (Long[]) objArr, i5);
    }

    @Override // j$.util.stream.h2
    public final /* bridge */ /* synthetic */ Object b() {
        return x3.f18147f;
    }

    @Override // j$.util.stream.i2
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.f17607c;
    }

    @Override // j$.util.stream.i2
    public final /* bridge */ /* synthetic */ j$.util.c1 spliterator() {
        return Spliterators.f17607c;
    }
}
