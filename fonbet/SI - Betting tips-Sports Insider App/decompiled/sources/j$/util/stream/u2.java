package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class u2 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f18099a;

    /* renamed from: b, reason: collision with root package name */
    public int f18100b;

    @Override // j$.util.stream.i2
    public final /* synthetic */ void forEach(Consumer consumer) {
        x3.P(this, consumer);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.S(this, j, j6);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return x3.L(this, intFunction);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.i2
    public final /* bridge */ /* synthetic */ i2 a(int i5) {
        a(i5);
        throw null;
    }

    @Override // j$.util.stream.h2, j$.util.stream.i2
    public final h2 a(int i5) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ void k(Object[] objArr, int i5) {
        x3.M(this, (Double[]) objArr, i5);
    }

    @Override // j$.util.stream.h2
    public final void f(int i5, Object obj) {
        int i10 = this.f18100b;
        System.arraycopy(this.f18099a, 0, (double[]) obj, i5, i10);
    }

    @Override // j$.util.stream.h2
    public final void g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i5 = 0; i5 < this.f18100b; i5++) {
            doubleConsumer.accept(this.f18099a[i5]);
        }
    }

    public u2(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18099a = new double[(int) j];
        this.f18100b = 0;
    }

    public u2(double[] dArr) {
        this.f18099a = dArr;
        this.f18100b = dArr.length;
    }

    @Override // j$.util.stream.i2
    public final Spliterator spliterator() {
        int i5 = this.f18100b;
        double[] dArr = this.f18099a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i5);
        return new j$.util.j1(dArr, 0, i5, 1040);
    }

    @Override // j$.util.stream.h2, j$.util.stream.i2
    public final j$.util.c1 spliterator() {
        int i5 = this.f18100b;
        double[] dArr = this.f18099a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i5);
        return new j$.util.j1(dArr, 0, i5, 1040);
    }

    @Override // j$.util.stream.h2
    public final Object b() {
        double[] dArr = this.f18099a;
        int length = dArr.length;
        int i5 = this.f18100b;
        return length == i5 ? dArr : Arrays.copyOf(dArr, i5);
    }

    @Override // j$.util.stream.i2
    public final long count() {
        return this.f18100b;
    }

    public String toString() {
        double[] dArr = this.f18099a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f18100b), Arrays.toString(dArr));
    }
}
