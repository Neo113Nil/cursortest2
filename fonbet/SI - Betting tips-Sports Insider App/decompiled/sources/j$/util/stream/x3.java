package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public abstract class x3 implements i8 {

    /* renamed from: a, reason: collision with root package name */
    public static final a3 f18142a = new a3();

    /* renamed from: b, reason: collision with root package name */
    public static final y2 f18143b = new y2();

    /* renamed from: c, reason: collision with root package name */
    public static final z2 f18144c = new z2();

    /* renamed from: d, reason: collision with root package name */
    public static final x2 f18145d = new x2();

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f18146e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f18147f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    public static final double[] f18148g = new double[0];

    public abstract s4 C0();

    public abstract n5 D0(Spliterator spliterator, n5 n5Var);

    public abstract n5 E0(n5 n5Var);

    public abstract Spliterator F0(Spliterator spliterator);

    public abstract void f0(Spliterator spliterator, n5 n5Var);

    public abstract boolean g0(Spliterator spliterator, n5 n5Var);

    public abstract i2 j0(Spliterator spliterator, boolean z5, IntFunction intFunction);

    public abstract long k0(Spliterator spliterator);

    @Override // j$.util.stream.i8
    public /* synthetic */ int v() {
        return 0;
    }

    public abstract a2 z0(long j, IntFunction intFunction);

    public static j$.util.p q0(Function function) {
        j$.util.p pVar = new j$.util.p(3);
        pVar.f17766b = function;
        return pVar;
    }

    public static long W(long j, long j6, long j10) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j6, j10));
        }
        return -1L;
    }

    public static long Z(long j, long j6) {
        long j10 = j6 >= 0 ? j + j6 : Long.MAX_VALUE;
        return j10 >= 0 ? j10 : LongCompanionObject.MAX_VALUE;
    }

    public static Spliterator X(d7 d7Var, Spliterator spliterator, long j, long j6) {
        long Z = Z(j, j6);
        int i5 = x5.f18149a[d7Var.ordinal()];
        if (i5 == 1) {
            return new w7(spliterator, j, Z);
        }
        if (i5 == 2) {
            return new t7((j$.util.w0) spliterator, j, Z);
        }
        if (i5 == 3) {
            return new u7((j$.util.z0) spliterator, j, Z);
        }
        if (i5 != 4) {
            throw new IllegalStateException("Unknown shape " + d7Var);
        }
        return new s7((j$.util.t0) spliterator, j, Z);
    }

    public static j$.util.concurrent.r A0(final v1 v1Var, final Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(v1Var);
        return new j$.util.concurrent.r(d7.REFERENCE, v1Var, new Supplier() { // from class: j$.util.stream.p1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new q1(v1.this, predicate);
            }
        });
    }

    public static b3 i0(d7 d7Var) {
        int i5 = j2.f17937a[d7Var.ordinal()];
        if (i5 == 1) {
            return f18142a;
        }
        if (i5 == 2) {
            return f18143b;
        }
        if (i5 == 3) {
            return f18144c;
        }
        if (i5 == 4) {
            return f18145d;
        }
        throw new IllegalStateException("Unknown shape " + d7Var);
    }

    public static j$.util.concurrent.r v0(v1 v1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(v1Var);
        return new j$.util.concurrent.r(d7.INT_VALUE, v1Var, new o1(v1Var, 1));
    }

    public static p5 B0(f5 f5Var, long j, long j6) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new p5(f5Var, l0(j6), j, j6);
    }

    public static i2 V(i2 i2Var, long j, long j6, IntFunction intFunction) {
        if (j == 0 && j6 == i2Var.count()) {
            return i2Var;
        }
        Spliterator spliterator = i2Var.spliterator();
        long j10 = j6 - j;
        a2 Y = Y(j10, intFunction);
        Y.c(j10);
        for (int i5 = 0; i5 < j && spliterator.tryAdvance(new u0(19)); i5++) {
        }
        if (j6 == i2Var.count()) {
            spliterator.forEachRemaining(Y);
        } else {
            for (int i10 = 0; i10 < j10 && spliterator.tryAdvance(Y); i10++) {
            }
        }
        Y.end();
        return Y.build();
    }

    public static k2 e0(d7 d7Var, i2 i2Var, i2 i2Var2) {
        int i5 = j2.f17937a[d7Var.ordinal()];
        if (i5 == 1) {
            return new t2(i2Var, i2Var2);
        }
        if (i5 == 2) {
            return new q2((e2) i2Var, (e2) i2Var2);
        }
        if (i5 == 3) {
            return new r2((g2) i2Var, (g2) i2Var2);
        }
        if (i5 != 4) {
            throw new IllegalStateException("Unknown shape " + d7Var);
        }
        return new p2((c2) i2Var, (c2) i2Var2);
    }

    public static j$.util.concurrent.r x0(v1 v1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(v1Var);
        return new j$.util.concurrent.r(d7.LONG_VALUE, v1Var, new o1(v1Var, 0));
    }

    public static void J() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.util.concurrent.r t0(v1 v1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(v1Var);
        return new j$.util.concurrent.r(d7.DOUBLE_VALUE, v1Var, new o1(v1Var, 2));
    }

    public static void K() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static a2 Y(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new c3(j, intFunction);
        }
        return new u3();
    }

    public static void C() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void F(l5 l5Var, Integer num) {
        if (k8.f17956a) {
            k8.a(l5Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        l5Var.accept(num.intValue());
    }

    public static void H(m5 m5Var, Long l6) {
        if (k8.f17956a) {
            k8.a(m5Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        m5Var.accept(l6.longValue());
    }

    public static y1 r0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new f3();
        }
        return new e3(j);
    }

    public static void D(k5 k5Var, Double d10) {
        if (k8.f17956a) {
            k8.a(k5Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        k5Var.accept(d10.doubleValue());
    }

    public static r5 w0(c1 c1Var, long j, long j6) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new r5(c1Var, l0(j6), j, j6);
    }

    public static z1 s0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new o3();
        }
        return new n3(j);
    }

    public static Object[] L(h2 h2Var, IntFunction intFunction) {
        if (k8.f17956a) {
            k8.a(h2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (h2Var.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) h2Var.count());
        h2Var.k(objArr, 0);
        return objArr;
    }

    public static x1 h0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new w2();
        }
        return new v2(j);
    }

    public static i2 a0(x3 x3Var, Spliterator spliterator, boolean z5, IntFunction intFunction) {
        long k0 = x3Var.k0(spliterator);
        if (k0 < 0 || !spliterator.hasCharacteristics(16384)) {
            m0 m0Var = new m0();
            m0Var.f17983a = intFunction;
            i2 i2Var = (i2) new n2(x3Var, spliterator, m0Var, new u0(27), 3).invoke();
            return z5 ? m0(i2Var, intFunction) : i2Var;
        }
        if (k0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) k0);
        new s3(spliterator, x3Var, objArr).invoke();
        return new l2(objArr);
    }

    public static void Q(e2 e2Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e2Var.g((IntConsumer) consumer);
        } else {
            if (k8.f17956a) {
                k8.a(e2Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.w0) e2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static u5 y0(k1 k1Var, long j, long j6) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new u5(k1Var, l0(j6), j, j6);
    }

    public static void N(e2 e2Var, Integer[] numArr, int i5) {
        if (k8.f17956a) {
            k8.a(e2Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) e2Var.b();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i5 + i10] = Integer.valueOf(iArr[i10]);
        }
    }

    public static e2 T(e2 e2Var, long j, long j6) {
        if (j == 0 && j6 == e2Var.count()) {
            return e2Var;
        }
        long j10 = j6 - j;
        j$.util.w0 w0Var = (j$.util.w0) e2Var.spliterator();
        y1 r02 = r0(j10);
        r02.c(j10);
        for (int i5 = 0; i5 < j && w0Var.tryAdvance((IntConsumer) new d2(0)); i5++) {
        }
        if (j6 == e2Var.count()) {
            w0Var.forEachRemaining((IntConsumer) r02);
        } else {
            for (int i10 = 0; i10 < j10 && w0Var.tryAdvance((IntConsumer) r02); i10++) {
            }
        }
        r02.end();
        return r02.build();
    }

    public static e2 c0(x3 x3Var, Spliterator spliterator, boolean z5) {
        long k0 = x3Var.k0(spliterator);
        if (k0 < 0 || !spliterator.hasCharacteristics(16384)) {
            e2 e2Var = (e2) new n2(x3Var, spliterator, new u0(23), new u0(24), 1).invoke();
            return z5 ? o0(e2Var) : e2Var;
        }
        if (k0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) k0];
        new q3(spliterator, x3Var, iArr).invoke();
        return new d3(iArr);
    }

    public static g2 d0(x3 x3Var, Spliterator spliterator, boolean z5) {
        long k0 = x3Var.k0(spliterator);
        if (k0 < 0 || !spliterator.hasCharacteristics(16384)) {
            g2 g2Var = (g2) new n2(x3Var, spliterator, new u0(25), new u0(26), 2).invoke();
            return z5 ? p0(g2Var) : g2Var;
        }
        if (k0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) k0];
        new r3(spliterator, x3Var, jArr).invoke();
        return new m3(jArr);
    }

    public static void R(g2 g2Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g2Var.g((LongConsumer) consumer);
        } else {
            if (k8.f17956a) {
                k8.a(g2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.z0) g2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void O(g2 g2Var, Long[] lArr, int i5) {
        if (k8.f17956a) {
            k8.a(g2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) g2Var.b();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i5 + i10] = Long.valueOf(jArr[i10]);
        }
    }

    public static g2 U(g2 g2Var, long j, long j6) {
        if (j == 0 && j6 == g2Var.count()) {
            return g2Var;
        }
        long j10 = j6 - j;
        j$.util.z0 z0Var = (j$.util.z0) g2Var.spliterator();
        z1 s02 = s0(j10);
        s02.c(j10);
        for (int i5 = 0; i5 < j && z0Var.tryAdvance((LongConsumer) new f2(0)); i5++) {
        }
        if (j6 == g2Var.count()) {
            z0Var.forEachRemaining((LongConsumer) s02);
        } else {
            for (int i10 = 0; i10 < j10 && z0Var.tryAdvance((LongConsumer) s02); i10++) {
            }
        }
        s02.end();
        return s02.build();
    }

    public static c2 b0(x3 x3Var, Spliterator spliterator, boolean z5) {
        long k0 = x3Var.k0(spliterator);
        if (k0 < 0 || !spliterator.hasCharacteristics(16384)) {
            c2 c2Var = (c2) new n2(x3Var, spliterator, new u0(21), new u0(22), 0).invoke();
            return z5 ? n0(c2Var) : c2Var;
        }
        if (k0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) k0];
        new p3(spliterator, x3Var, dArr).invoke();
        return new u2(dArr);
    }

    public static w5 u0(b0 b0Var, long j, long j6) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new w5(b0Var, l0(j6), j, j6);
    }

    public static i2 m0(i2 i2Var, IntFunction intFunction) {
        if (i2Var.o() <= 0) {
            return i2Var;
        }
        long count = i2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new w3(i2Var, objArr, 1).invoke();
        return new l2(objArr);
    }

    public static void P(c2 c2Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            c2Var.g((DoubleConsumer) consumer);
        } else {
            if (k8.f17956a) {
                k8.a(c2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.t0) c2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static e2 o0(e2 e2Var) {
        if (e2Var.o() <= 0) {
            return e2Var;
        }
        long count = e2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new v3(e2Var, iArr, 0).invoke();
        return new d3(iArr);
    }

    public static void M(c2 c2Var, Double[] dArr, int i5) {
        if (k8.f17956a) {
            k8.a(c2Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) c2Var.b();
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr[i5 + i10] = Double.valueOf(dArr2[i10]);
        }
    }

    public static c2 S(c2 c2Var, long j, long j6) {
        if (j == 0 && j6 == c2Var.count()) {
            return c2Var;
        }
        long j10 = j6 - j;
        j$.util.t0 t0Var = (j$.util.t0) c2Var.spliterator();
        x1 h02 = h0(j10);
        h02.c(j10);
        for (int i5 = 0; i5 < j && t0Var.tryAdvance((DoubleConsumer) new b2(0)); i5++) {
        }
        if (j6 == c2Var.count()) {
            t0Var.forEachRemaining((DoubleConsumer) h02);
        } else {
            for (int i10 = 0; i10 < j10 && t0Var.tryAdvance((DoubleConsumer) h02); i10++) {
            }
        }
        h02.end();
        return h02.build();
    }

    public static g2 p0(g2 g2Var) {
        if (g2Var.o() <= 0) {
            return g2Var;
        }
        long count = g2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new v3(g2Var, jArr, 0).invoke();
        return new m3(jArr);
    }

    public static int l0(long j) {
        return (j != -1 ? c7.f17840u : 0) | c7.f17839t;
    }

    public static c2 n0(c2 c2Var) {
        if (c2Var.o() <= 0) {
            return c2Var;
        }
        long count = c2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new v3(c2Var, dArr, 0).invoke();
        return new u2(dArr);
    }

    @Override // j$.util.stream.i8
    public Object f(b bVar, Spliterator spliterator) {
        s4 C0 = C0();
        bVar.D0(spliterator, C0);
        return C0.get();
    }

    @Override // j$.util.stream.i8
    public Object i(x3 x3Var, Spliterator spliterator) {
        return ((s4) new z4(this, x3Var, spliterator).invoke()).get();
    }
}
