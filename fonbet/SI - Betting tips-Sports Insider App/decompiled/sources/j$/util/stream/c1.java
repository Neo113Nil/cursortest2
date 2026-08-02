package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class c1 extends b implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.b0 findAny() {
        return (j$.util.b0) G0(h0.f17916d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 findFirst() {
        return (j$.util.b0) G0(h0.f17915c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new h6(this, c7.q | c7.f17835o, 0);
    }

    @Override // j$.util.stream.IntStream
    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        G0(new o0(intConsumer, false));
    }

    @Override // j$.util.stream.IntStream
    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        G0(new o0(intConsumer, true));
    }

    public static j$.util.w0 S0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.w0) {
            return (j$.util.w0) spliterator;
        }
        if (k8.f17956a) {
            k8.a(b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.b
    public final d7 K0() {
        return d7.INT_VALUE;
    }

    @Override // j$.util.stream.b
    public final i2 I0(b bVar, Spliterator spliterator, boolean z5, IntFunction intFunction) {
        return x3.c0(bVar, spliterator, z5);
    }

    @Override // j$.util.stream.b
    public final Spliterator R0(b bVar, Supplier supplier, boolean z5) {
        return new p7(bVar, supplier, z5);
    }

    @Override // j$.util.stream.b
    public final boolean J0(Spliterator spliterator, n5 n5Var) {
        IntConsumer h0Var;
        boolean e7;
        j$.util.w0 S0 = S0(spliterator);
        if (n5Var instanceof IntConsumer) {
            h0Var = (IntConsumer) n5Var;
        } else {
            if (k8.f17956a) {
                k8.a(b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(n5Var);
            h0Var = new j$.util.h0(n5Var, 1);
        }
        do {
            e7 = n5Var.e();
            if (e7) {
                break;
            }
        } while (S0.tryAdvance(h0Var));
        return e7;
    }

    @Override // j$.util.stream.x3
    public final a2 z0(long j, IntFunction intFunction) {
        return x3.r0(j);
    }

    @Override // j$.util.stream.h
    public final j$.util.k0 iterator() {
        j$.util.w0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f1(spliterator);
    }

    @Override // j$.util.stream.b, j$.util.stream.h
    public final j$.util.w0 spliterator() {
        return S0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final n1 asLongStream() {
        return new v(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final e0 asDoubleStream() {
        return new t(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new s(this, 0, new u0(1), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e() {
        Objects.requireNonNull(null);
        return new u(this, c7.f17836p | c7.f17834n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new s(this, c7.f17836p | c7.f17834n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final n1 k() {
        Objects.requireNonNull(null);
        return new v(this, c7.f17836p | c7.f17834n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final e0 g() {
        Objects.requireNonNull(null);
        return new t(this, c7.f17836p | c7.f17834n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i5, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) G0(new n4(d7.INT_VALUE, intBinaryOperator, i5))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream r(m0 m0Var) {
        Objects.requireNonNull(m0Var);
        return new w0(this, c7.f17836p | c7.f17834n | c7.f17839t, m0Var, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.b0) G0(new a4(d7.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new u(this, c7.f17839t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new w0(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return x3.w0(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : x3.w0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i5 = c9.f17848a;
        Objects.requireNonNull(null);
        return new h6(this, c9.f17848a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i5 = c9.f17848a;
        Objects.requireNonNull(null);
        return new h6(this, c9.f17849b, 2);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) G0(new e4(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((f5) boxed()).distinct().mapToInt(new u0(0));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new u0(5));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 min() {
        return reduce(new u0(2));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 max() {
        return reduce(new u0(6));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.a0 average() {
        long j = ((long[]) collect(new k(10), new u0(7), new u0(8)))[0];
        return j > 0 ? new j$.util.a0(r0[1] / j) : j$.util.a0.f17612c;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.x summaryStatistics() {
        return (j$.util.x) collect(new k(1), new u0(3), new u0(4));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        q qVar = new q(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(qVar);
        return G0(new c4(d7.INT_VALUE, qVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean x() {
        return ((Boolean) G0(x3.v0(v1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean p() {
        return ((Boolean) G0(x3.v0(v1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean s() {
        return ((Boolean) G0(x3.v0(v1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) x3.o0((e2) H0(new j$.time.x(29))).b();
    }
}
