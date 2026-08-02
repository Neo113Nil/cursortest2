package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class l2 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f17964a;

    /* renamed from: b, reason: collision with root package name */
    public int f17965b;

    @Override // j$.util.stream.i2
    public final /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.V(this, j, j6, intFunction);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.i2
    public final i2 a(int i5) {
        throw new IndexOutOfBoundsException();
    }

    public l2(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f17964a = (Object[]) intFunction.apply((int) j);
        this.f17965b = 0;
    }

    public l2(Object[] objArr) {
        this.f17964a = objArr;
        this.f17965b = objArr.length;
    }

    @Override // j$.util.stream.i2
    public final Spliterator spliterator() {
        int i5 = this.f17965b;
        Object[] objArr = this.f17964a;
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, 0, i5);
        return new j$.util.i1(objArr, 0, i5, 1040);
    }

    @Override // j$.util.stream.i2
    public final void k(Object[] objArr, int i5) {
        System.arraycopy(this.f17964a, 0, objArr, i5, this.f17965b);
    }

    @Override // j$.util.stream.i2
    public final Object[] m(IntFunction intFunction) {
        Object[] objArr = this.f17964a;
        if (objArr.length == this.f17965b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.i2
    public final long count() {
        return this.f17965b;
    }

    @Override // j$.util.stream.i2
    public final void forEach(Consumer consumer) {
        for (int i5 = 0; i5 < this.f17965b; i5++) {
            consumer.n(this.f17964a[i5]);
        }
    }

    public String toString() {
        Object[] objArr = this.f17964a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f17965b), Arrays.toString(objArr));
    }
}
