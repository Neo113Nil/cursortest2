package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class t2 extends k2 {
    @Override // j$.util.stream.i2
    public final i2 i(long j, long j6, IntFunction intFunction) {
        if (j == 0 && j6 == this.f17950c) {
            return this;
        }
        long count = this.f17948a.count();
        if (j >= count) {
            return this.f17949b.i(j - count, j6 - count, intFunction);
        }
        if (j6 > count) {
            return x3.e0(d7.REFERENCE, this.f17948a.i(j, count, intFunction), this.f17949b.i(0L, j6 - count, intFunction));
        }
        return this.f17948a.i(j, j6, intFunction);
    }

    @Override // j$.util.stream.i2
    public final Spliterator spliterator() {
        return new k3(this);
    }

    @Override // j$.util.stream.i2
    public final void k(Object[] objArr, int i5) {
        Objects.requireNonNull(objArr);
        i2 i2Var = this.f17948a;
        i2Var.k(objArr, i5);
        this.f17949b.k(objArr, i5 + ((int) i2Var.count()));
    }

    @Override // j$.util.stream.i2
    public final Object[] m(IntFunction intFunction) {
        long j = this.f17950c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.i2
    public final void forEach(Consumer consumer) {
        this.f17948a.forEach(consumer);
        this.f17949b.forEach(consumer);
    }

    public final String toString() {
        long j = this.f17950c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.f17948a, this.f17949b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
