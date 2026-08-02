package j$.util.concurrent;

import j$.util.r1;
import j$.util.stream.IntStream;
import j$.util.stream.c7;
import j$.util.stream.d0;
import j$.util.stream.h1;
import j$.util.stream.m1;
import j$.util.stream.y;
import j$.util.stream.z0;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a, reason: collision with root package name */
    public long f17645a;

    /* renamed from: b, reason: collision with root package name */
    public int f17646b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17647c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f17641d = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f17642e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public static final t f17643f = new t();

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLong f17644g = new AtomicLong(f(System.currentTimeMillis()) ^ f(System.nanoTime()));

    public /* synthetic */ ThreadLocalRandom(int i5) {
        this();
    }

    public static int e(long j) {
        long j6 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j6 ^ (j6 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    public static long f(long j) {
        long j6 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j10 = (j6 ^ (j6 >>> 33)) * (-4265267296055464877L);
        return j10 ^ (j10 >>> 33);
    }

    private ThreadLocalRandom() {
        this.f17647c = true;
    }

    public static final void d() {
        int addAndGet = f17642e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long f6 = f(f17644g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f17643f.get();
        threadLocalRandom.f17645a = f6;
        threadLocalRandom.f17646b = addAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f17643f.get();
        if (threadLocalRandom.f17646b == 0) {
            d();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f17647c) {
            throw new UnsupportedOperationException();
        }
    }

    public final long g() {
        long j = this.f17645a - 7046029254386353131L;
        this.f17645a = j;
        return j;
    }

    @Override // java.util.Random
    public final int next(int i5) {
        return nextInt() >>> (32 - i5);
    }

    public final long c(long j, long j6) {
        long f6 = f(g());
        if (j >= j6) {
            return f6;
        }
        long j10 = j6 - j;
        long j11 = j10 - 1;
        if ((j10 & j11) == 0) {
            return (f6 & j11) + j;
        }
        if (j10 > 0) {
            while (true) {
                long j12 = f6 >>> 1;
                long j13 = j12 + j11;
                long j14 = j12 % j10;
                if (j13 - j14 >= 0) {
                    return j14 + j;
                }
                f6 = f(g());
            }
        } else {
            while (true) {
                if (f6 >= j && f6 < j6) {
                    return f6;
                }
                f6 = f(g());
            }
        }
    }

    public final int b(int i5, int i10) {
        int e7 = e(g());
        if (i5 >= i10) {
            return e7;
        }
        int i11 = i10 - i5;
        int i12 = i11 - 1;
        if ((i11 & i12) == 0) {
            return (e7 & i12) + i5;
        }
        if (i11 > 0) {
            int i13 = e7 >>> 1;
            while (true) {
                int i14 = i13 + i12;
                int i15 = i13 % i11;
                if (i14 - i15 >= 0) {
                    return i15 + i5;
                }
                i13 = e(g()) >>> 1;
            }
        } else {
            while (true) {
                if (e7 >= i5 && e7 < i10) {
                    return e7;
                }
                e7 = e(g());
            }
        }
    }

    public final double a(double d10, double d11) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 >= d11) {
            return nextLong;
        }
        double d12 = ((d11 - d10) * nextLong) + d10;
        return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return e(g());
    }

    @Override // java.util.Random
    public final int nextInt(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int e7 = e(g());
        int i10 = i5 - 1;
        if ((i5 & i10) == 0) {
            return e7 & i10;
        }
        while (true) {
            int i11 = e7 >>> 1;
            int i12 = i11 + i10;
            int i13 = i11 % i5;
            if (i12 - i13 >= 0) {
                return i13;
            }
            e7 = e(g());
        }
    }

    public final int nextInt(int i5, int i10) {
        if (i5 >= i10) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return b(i5, i10);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return f(g());
    }

    public final long nextLong(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long f6 = f(g());
        long j6 = j - 1;
        if ((j & j6) == 0) {
            return f6 & j6;
        }
        while (true) {
            long j10 = f6 >>> 1;
            long j11 = j10 + j6;
            long j12 = j10 % j;
            if (j11 - j12 >= 0) {
                return j12;
            }
            f6 = f(g());
        }
    }

    public final long nextLong(long j, long j6) {
        if (j >= j6) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return c(j, j6);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (f(g()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double f6 = (f(g()) >>> 11) * 1.1102230246251565E-16d * d10;
        return f6 < d10 ? f6 : Double.longBitsToDouble(Double.doubleToLongBits(d10) - 1);
    }

    public final double nextDouble(double d10, double d11) {
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return a(d10, d11);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return e(g()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (e(g()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f17641d;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                f17641d.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        v vVar = new v(0L, j, Integer.MAX_VALUE, 0);
        return IntStream.Wrapper.convert(new z0(vVar, c7.k(vVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints() {
        v vVar = new v(0L, LongCompanionObject.MAX_VALUE, Integer.MAX_VALUE, 0);
        return IntStream.Wrapper.convert(new z0(vVar, c7.k(vVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j, int i5, int i10) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i5 >= i10) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        v vVar = new v(0L, j, i5, i10);
        return IntStream.Wrapper.convert(new z0(vVar, c7.k(vVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i5, int i10) {
        if (i5 >= i10) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        v vVar = new v(0L, LongCompanionObject.MAX_VALUE, i5, i10);
        return IntStream.Wrapper.convert(new z0(vVar, c7.k(vVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        w wVar = new w(0L, j, LongCompanionObject.MAX_VALUE, 0L);
        return m1.f(new h1(wVar, c7.k(wVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        w wVar = new w(0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, 0L);
        return m1.f(new h1(wVar, c7.k(wVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j6, long j10) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j6 >= j10) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, j, j6, j10);
        return m1.f(new h1(wVar, c7.k(wVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j6) {
        if (j >= j6) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, LongCompanionObject.MAX_VALUE, j, j6);
        return m1.f(new h1(wVar, c7.k(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        u uVar = new u(0L, j, Double.MAX_VALUE, 0.0d);
        return d0.f(new y(uVar, c7.k(uVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        u uVar = new u(0L, LongCompanionObject.MAX_VALUE, Double.MAX_VALUE, 0.0d);
        return d0.f(new y(uVar, c7.k(uVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d10, double d11) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        u uVar = new u(0L, j, d10, d11);
        return d0.f(new y(uVar, c7.k(uVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d10, double d11) {
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        u uVar = new u(0L, LongCompanionObject.MAX_VALUE, d10, d11);
        return d0.f(new y(uVar, c7.k(uVar), false));
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new r1(1))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i5 = 1; i5 < 8; i5++) {
                j = (j << 8) | (seed[i5] & 255);
            }
            f17644g.set(j);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.f17645a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
