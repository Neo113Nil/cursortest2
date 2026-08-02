package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class d3 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f17858a;

    /* renamed from: b, reason: collision with root package name */
    public int f17859b;

    @Override // j$.util.stream.i2
    public final /* synthetic */ void forEach(Consumer consumer) {
        x3.Q(this, consumer);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.T(this, j, j6);
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
        x3.N(this, (Integer[]) objArr, i5);
    }

    @Override // j$.util.stream.h2
    public final void f(int i5, Object obj) {
        int i10 = this.f17859b;
        System.arraycopy(this.f17858a, 0, (int[]) obj, i5, i10);
    }

    @Override // j$.util.stream.h2
    public final void g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i5 = 0; i5 < this.f17859b; i5++) {
            intConsumer.accept(this.f17858a[i5]);
        }
    }

    public d3(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f17858a = new int[(int) j];
        this.f17859b = 0;
    }

    public d3(int[] iArr) {
        this.f17858a = iArr;
        this.f17859b = iArr.length;
    }

    @Override // j$.util.stream.i2
    public final Spliterator spliterator() {
        int i5 = this.f17859b;
        int[] iArr = this.f17858a;
        Spliterators.a(((int[]) Objects.requireNonNull(iArr)).length, 0, i5);
        return new j$.util.o1(iArr, 0, i5, 1040);
    }

    @Override // j$.util.stream.h2, j$.util.stream.i2
    public final j$.util.c1 spliterator() {
        int i5 = this.f17859b;
        int[] iArr = this.f17858a;
        Spliterators.a(((int[]) Objects.requireNonNull(iArr)).length, 0, i5);
        return new j$.util.o1(iArr, 0, i5, 1040);
    }

    @Override // j$.util.stream.h2
    public final Object b() {
        int[] iArr = this.f17858a;
        int length = iArr.length;
        int i5 = this.f17859b;
        return length == i5 ? iArr : Arrays.copyOf(iArr, i5);
    }

    @Override // j$.util.stream.i2
    public final long count() {
        return this.f17859b;
    }

    public String toString() {
        int[] iArr = this.f17858a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f17859b), Arrays.toString(iArr));
    }
}
