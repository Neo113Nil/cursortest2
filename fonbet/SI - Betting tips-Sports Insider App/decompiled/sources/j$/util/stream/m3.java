package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public class m3 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f17986a;

    /* renamed from: b, reason: collision with root package name */
    public int f17987b;

    @Override // j$.util.stream.i2
    public final /* synthetic */ void forEach(Consumer consumer) {
        x3.R(this, consumer);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.U(this, j, j6);
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
        x3.O(this, (Long[]) objArr, i5);
    }

    @Override // j$.util.stream.h2
    public final void f(int i5, Object obj) {
        int i10 = this.f17987b;
        System.arraycopy(this.f17986a, 0, (long[]) obj, i5, i10);
    }

    @Override // j$.util.stream.h2
    public final void g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i5 = 0; i5 < this.f17987b; i5++) {
            longConsumer.accept(this.f17986a[i5]);
        }
    }

    public m3(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f17986a = new long[(int) j];
        this.f17987b = 0;
    }

    public m3(long[] jArr) {
        this.f17986a = jArr;
        this.f17987b = jArr.length;
    }

    @Override // j$.util.stream.i2
    public final Spliterator spliterator() {
        int i5 = this.f17987b;
        long[] jArr = this.f17986a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i5);
        return new j$.util.q1(jArr, 0, i5, 1040);
    }

    @Override // j$.util.stream.h2, j$.util.stream.i2
    public final j$.util.c1 spliterator() {
        int i5 = this.f17987b;
        long[] jArr = this.f17986a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i5);
        return new j$.util.q1(jArr, 0, i5, 1040);
    }

    @Override // j$.util.stream.h2
    public final Object b() {
        long[] jArr = this.f17986a;
        int length = jArr.length;
        int i5 = this.f17987b;
        return length == i5 ? jArr : Arrays.copyOf(jArr, i5);
    }

    @Override // j$.util.stream.i2
    public final long count() {
        return this.f17987b;
    }

    public String toString() {
        long[] jArr = this.f17986a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f17987b), Arrays.toString(jArr));
    }
}
