package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class w2 extends r6 implements c2, x1 {
    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i5) {
        x3.J();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        x3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.x1, j$.util.stream.a2
    public final c2 build() {
        return this;
    }

    @Override // j$.util.stream.a2
    public final i2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.S(this, j, j6);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return x3.L(this, intFunction);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void n(Double d10) {
        x3.D(this, d10);
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

    @Override // j$.util.stream.x6, j$.util.stream.h2
    public final void f(int i5, Object obj) {
        super.f(i5, (double[]) obj);
    }

    @Override // j$.util.stream.x6, j$.util.stream.h2
    public final void g(Object obj) {
        super.g((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.r6, j$.util.stream.x6, java.lang.Iterable, j$.util.stream.i2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.r6, j$.util.stream.x6, java.lang.Iterable, j$.util.stream.i2
    public final j$.util.c1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        clear();
        s(j);
    }

    @Override // j$.util.stream.x6, j$.util.stream.h2
    public final Object b() {
        return (double[]) super.b();
    }
}
