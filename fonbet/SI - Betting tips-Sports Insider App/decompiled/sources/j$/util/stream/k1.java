package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class k1 extends b implements n1 {
    @Override // j$.util.stream.n1
    public final j$.util.c0 findAny() {
        return (j$.util.c0) G0(i0.f17927d);
    }

    @Override // j$.util.stream.n1
    public final j$.util.c0 findFirst() {
        return (j$.util.c0) G0(i0.f17926c);
    }

    @Override // j$.util.stream.n1
    public final n1 sorted() {
        return new i6(this, c7.q | c7.f17835o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        G0(new p0(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        G0(new p0(longConsumer, true));
    }

    public static j$.util.z0 S0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.z0) {
            return (j$.util.z0) spliterator;
        }
        if (k8.f17956a) {
            k8.a(b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.b
    public final d7 K0() {
        return d7.LONG_VALUE;
    }

    @Override // j$.util.stream.b
    public final i2 I0(b bVar, Spliterator spliterator, boolean z5, IntFunction intFunction) {
        return x3.d0(bVar, spliterator, z5);
    }

    @Override // j$.util.stream.b
    public final Spliterator R0(b bVar, Supplier supplier, boolean z5) {
        return new r7(bVar, supplier, z5);
    }

    @Override // j$.util.stream.b
    public final boolean J0(Spliterator spliterator, n5 n5Var) {
        LongConsumer l0Var;
        boolean e7;
        j$.util.z0 S0 = S0(spliterator);
        if (n5Var instanceof LongConsumer) {
            l0Var = (LongConsumer) n5Var;
        } else {
            if (k8.f17956a) {
                k8.a(b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(n5Var);
            l0Var = new j$.util.l0(n5Var, 1);
        }
        do {
            e7 = n5Var.e();
            if (e7) {
                break;
            }
        } while (S0.tryAdvance(l0Var));
        return e7;
    }

    @Override // j$.util.stream.x3
    public final a2 z0(long j, IntFunction intFunction) {
        return x3.s0(j);
    }

    @Override // j$.util.stream.h
    public final j$.util.o0 iterator() {
        j$.util.z0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g1(spliterator);
    }

    @Override // j$.util.stream.b, j$.util.stream.h
    public final j$.util.z0 spliterator() {
        return S0(super.spliterator());
    }

    @Override // j$.util.stream.n1
    public final e0 asDoubleStream() {
        return new t(this, c7.f17834n, 5);
    }

    @Override // j$.util.stream.n1
    public final Stream boxed() {
        return new s(this, 0, new u0(14), 2);
    }

    @Override // j$.util.stream.n1
    public final n1 e() {
        Objects.requireNonNull(null);
        return new v(this, c7.f17836p | c7.f17834n, 3);
    }

    @Override // j$.util.stream.n1
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new s(this, c7.f17836p | c7.f17834n, longFunction, 2);
    }

    @Override // j$.util.stream.n1
    public final IntStream A() {
        Objects.requireNonNull(null);
        return new u(this, c7.f17836p | c7.f17834n, 4);
    }

    @Override // j$.util.stream.n1
    public final e0 j() {
        Objects.requireNonNull(null);
        return new t(this, c7.f17836p | c7.f17834n, 6);
    }

    @Override // j$.util.stream.n1
    public final n1 d(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new g1(this, c7.f17836p | c7.f17834n | c7.f17839t, pVar, 0);
    }

    @Override // j$.util.stream.n1
    public final n1 b() {
        Objects.requireNonNull(null);
        return new v(this, c7.f17839t, 5);
    }

    @Override // j$.util.stream.n1
    public final n1 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new g1(this, longConsumer);
    }

    @Override // j$.util.stream.n1
    public final n1 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return x3.y0(this, 0L, j);
    }

    @Override // j$.util.stream.n1
    public final n1 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : x3.y0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.n1
    public final n1 a() {
        int i5 = c9.f17848a;
        Objects.requireNonNull(null);
        return new i6(this, c9.f17848a, 1);
    }

    @Override // j$.util.stream.n1
    public final n1 c() {
        int i5 = c9.f17848a;
        Objects.requireNonNull(null);
        return new i6(this, c9.f17849b, 2);
    }

    @Override // j$.util.stream.n1
    public final n1 distinct() {
        return ((f5) boxed()).distinct().mapToLong(new u0(11));
    }

    @Override // j$.util.stream.n1
    public final long sum() {
        return reduce(0L, new u0(18));
    }

    @Override // j$.util.stream.n1
    public final j$.util.c0 min() {
        return reduce(new u0(10));
    }

    @Override // j$.util.stream.n1
    public final j$.util.c0 max() {
        return reduce(new u0(17));
    }

    @Override // j$.util.stream.n1
    public final j$.util.a0 average() {
        long j = ((long[]) collect(new k(11), new u0(15), new u0(16)))[0];
        return j > 0 ? new j$.util.a0(r0[1] / j) : j$.util.a0.f17612c;
    }

    @Override // j$.util.stream.n1
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) G0(new y3(d7.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.n1
    public final j$.util.z summaryStatistics() {
        return (j$.util.z) collect(new k(2), new u0(9), new u0(12));
    }

    @Override // j$.util.stream.n1
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        q qVar = new q(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(qVar);
        return G0(new c4(d7.LONG_VALUE, qVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.n1
    public final boolean q() {
        return ((Boolean) G0(x3.x0(v1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.n1
    public final j$.util.c0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.c0) G0(new a4(d7.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.n1
    public final boolean w() {
        return ((Boolean) G0(x3.x0(v1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.n1
    public final boolean m() {
        return ((Boolean) G0(x3.x0(v1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.n1
    public final long[] toArray() {
        return (long[]) x3.p0((g2) H0(new u0(13))).b();
    }

    @Override // j$.util.stream.n1
    public final long count() {
        return ((Long) G0(new e4(0))).longValue();
    }
}
