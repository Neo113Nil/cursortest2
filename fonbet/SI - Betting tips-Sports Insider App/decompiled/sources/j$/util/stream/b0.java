package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class b0 extends b implements e0 {
    @Override // j$.util.stream.e0
    public final j$.util.a0 findAny() {
        return (j$.util.a0) G0(g0.f17907d);
    }

    @Override // j$.util.stream.e0
    public final j$.util.a0 findFirst() {
        return (j$.util.a0) G0(g0.f17906c);
    }

    @Override // j$.util.stream.e0
    public final e0 sorted() {
        return new g6(this, c7.q | c7.f17835o, 0);
    }

    public static j$.util.t0 S0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.t0) {
            return (j$.util.t0) spliterator;
        }
        if (k8.f17956a) {
            k8.a(b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // j$.util.stream.e0
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        G0(new n0(doubleConsumer, false));
    }

    @Override // j$.util.stream.e0
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        G0(new n0(doubleConsumer, true));
    }

    @Override // j$.util.stream.b
    public final d7 K0() {
        return d7.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.b
    public final i2 I0(b bVar, Spliterator spliterator, boolean z5, IntFunction intFunction) {
        return x3.b0(bVar, spliterator, z5);
    }

    @Override // j$.util.stream.b
    public final Spliterator R0(b bVar, Supplier supplier, boolean z5) {
        return new n7(bVar, supplier, z5);
    }

    @Override // j$.util.stream.b
    public final boolean J0(Spliterator spliterator, n5 n5Var) {
        DoubleConsumer d0Var;
        boolean e7;
        j$.util.t0 S0 = S0(spliterator);
        if (n5Var instanceof DoubleConsumer) {
            d0Var = (DoubleConsumer) n5Var;
        } else {
            if (k8.f17956a) {
                k8.a(b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(n5Var);
            d0Var = new j$.util.d0(n5Var, 1);
        }
        do {
            e7 = n5Var.e();
            if (e7) {
                break;
            }
        } while (S0.tryAdvance(d0Var));
        return e7;
    }

    @Override // j$.util.stream.x3
    public final a2 z0(long j, IntFunction intFunction) {
        return x3.h0(j);
    }

    @Override // j$.util.stream.h
    public final j$.util.g0 iterator() {
        j$.util.t0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.h1(spliterator);
    }

    @Override // j$.util.stream.b, j$.util.stream.h
    public final j$.util.t0 spliterator() {
        return S0(super.spliterator());
    }

    @Override // j$.util.stream.e0
    public final Stream boxed() {
        return new s(this, 0, new j$.time.x(19), 0);
    }

    @Override // j$.util.stream.e0
    public final e0 e() {
        Objects.requireNonNull(null);
        return new t(this, c7.f17836p | c7.f17834n, 0);
    }

    @Override // j$.util.stream.e0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new s(this, c7.f17836p | c7.f17834n, doubleFunction, 0);
    }

    @Override // j$.util.stream.e0
    public final IntStream z() {
        Objects.requireNonNull(null);
        return new u(this, c7.f17836p | c7.f17834n, 0);
    }

    @Override // j$.util.stream.e0
    public final n1 u() {
        Objects.requireNonNull(null);
        return new v(this, c7.f17836p | c7.f17834n, 0);
    }

    @Override // j$.util.stream.e0
    public final e0 d(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new x(this, c7.f17836p | c7.f17834n | c7.f17839t, pVar, 0);
    }

    @Override // j$.util.stream.e0
    public final e0 b() {
        Objects.requireNonNull(null);
        return new t(this, c7.f17839t, 2);
    }

    @Override // j$.util.stream.e0
    public final e0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new x(this, doubleConsumer);
    }

    @Override // j$.util.stream.e0
    public final e0 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return x3.u0(this, 0L, j);
    }

    @Override // j$.util.stream.e0
    public final e0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : x3.u0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.e0
    public final e0 a() {
        int i5 = c9.f17848a;
        Objects.requireNonNull(null);
        return new g6(this, c9.f17848a, 1);
    }

    @Override // j$.util.stream.e0
    public final e0 c() {
        int i5 = c9.f17848a;
        Objects.requireNonNull(null);
        return new g6(this, c9.f17849b, 2);
    }

    @Override // j$.util.stream.e0
    public final e0 distinct() {
        return ((f5) boxed()).distinct().mapToDouble(new j$.time.x(20));
    }

    @Override // j$.util.stream.e0
    public final double sum() {
        double[] dArr = (double[]) collect(new k(5), new j$.time.x(23), new j$.time.x(13));
        Set set = m.f17982a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (Double.isNaN(d10) && Double.isInfinite(d11)) ? d11 : d10;
    }

    @Override // j$.util.stream.e0
    public final j$.util.a0 min() {
        return reduce(new j$.time.x(14));
    }

    @Override // j$.util.stream.e0
    public final j$.util.a0 max() {
        return reduce(new j$.time.x(22));
    }

    @Override // j$.util.stream.e0
    public final j$.util.a0 average() {
        double[] dArr = (double[]) collect(new k(4), new j$.time.x(15), new j$.time.x(16));
        if (dArr[2] <= 0.0d) {
            return j$.util.a0.f17612c;
        }
        Set set = m.f17982a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        if (Double.isNaN(d10) && Double.isInfinite(d11)) {
            d10 = d11;
        }
        return new j$.util.a0(d10 / dArr[2]);
    }

    @Override // j$.util.stream.e0
    public final j$.util.w summaryStatistics() {
        return (j$.util.w) collect(new k(0), new j$.time.x(17), new j$.time.x(18));
    }

    @Override // j$.util.stream.e0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        q qVar = new q(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(qVar);
        return G0(new c4(d7.DOUBLE_VALUE, qVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.e0
    public final boolean o() {
        return ((Boolean) G0(x3.t0(v1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.e0
    public final boolean t() {
        return ((Boolean) G0(x3.t0(v1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.e0
    public final boolean B() {
        return ((Boolean) G0(x3.t0(v1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.e0
    public final double[] toArray() {
        return (double[]) x3.n0((c2) H0(new j$.time.x(21))).b();
    }

    @Override // j$.util.stream.e0
    public final double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) G0(new g4(d7.DOUBLE_VALUE, doubleBinaryOperator, d10))).doubleValue();
    }

    @Override // j$.util.stream.e0
    public final j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.a0) G0(new a4(d7.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.e0
    public final long count() {
        return ((Long) G0(new e4(1))).longValue();
    }
}
