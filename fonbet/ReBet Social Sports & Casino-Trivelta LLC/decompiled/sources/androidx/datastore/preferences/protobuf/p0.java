package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f19551a = A();

    /* renamed from: b, reason: collision with root package name */
    public static final Class f19552b = AbstractC2129d.b();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f19553c = m(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f19554d = m(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    public static final e f19555e = y();

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f19556f = Q();

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f19557g = P();

    /* renamed from: h, reason: collision with root package name */
    public static final long f19558h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f19559i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f19560j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f19561k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f19562l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f19563m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f19564n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f19565o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f19566p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f19567q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f19568r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f19569s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f19570t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f19571u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f19572v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f19573w;

    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f19573w ? p0.q(obj, j10) : p0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void j(Object obj, long j10, boolean z10) {
            if (p0.f19573w) {
                p0.F(obj, j10, z10);
            } else {
                p0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j10, byte b10) {
            if (p0.f19573w) {
                p0.I(obj, j10, b10);
            } else {
                p0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f19573w ? p0.q(obj, j10) : p0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void j(Object obj, long j10, boolean z10) {
            if (p0.f19573w) {
                p0.F(obj, j10, z10);
            } else {
                p0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j10, byte b10) {
            if (p0.f19573w) {
                p0.I(obj, j10, b10);
            } else {
                p0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return this.f19574a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double d(Object obj, long j10) {
            return this.f19574a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float e(Object obj, long j10) {
            return this.f19574a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void j(Object obj, long j10, boolean z10) {
            this.f19574a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j10, byte b10) {
            this.f19574a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j10, double d10) {
            this.f19574a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j10, float f10) {
            this.f19574a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f19574a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                p0.D(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f19574a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                p0.D(th2);
                return false;
            }
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f19574a;

        public e(Unsafe unsafe) {
            this.f19574a = unsafe;
        }

        public final int a(Class cls) {
            return this.f19574a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f19574a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public final int f(Object obj, long j10) {
            return this.f19574a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f19574a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f19574a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f19574a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j10, boolean z10);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final void n(Object obj, long j10, int i10) {
            this.f19574a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f19574a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f19574a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f19574a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                p0.D(th2);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f19574a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return p0.l() != null;
            } catch (Throwable th2) {
                p0.D(th2);
                return false;
            }
        }
    }

    static {
        long j10 = j(byte[].class);
        f19558h = j10;
        f19559i = j(boolean[].class);
        f19560j = k(boolean[].class);
        f19561k = j(int[].class);
        f19562l = k(int[].class);
        f19563m = j(long[].class);
        f19564n = k(long[].class);
        f19565o = j(float[].class);
        f19566p = k(float[].class);
        f19567q = j(double[].class);
        f19568r = k(double[].class);
        f19569s = j(Object[].class);
        f19570t = k(Object[].class);
        f19571u = o(l());
        f19572v = (int) (j10 & 7);
        f19573w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean B() {
        return f19557g;
    }

    public static boolean C() {
        return f19556f;
    }

    public static void D(Throwable th2) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static void E(Object obj, long j10, boolean z10) {
        f19555e.j(obj, j10, z10);
    }

    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void H(byte[] bArr, long j10, byte b10) {
        f19555e.k(bArr, f19558h + j10, b10);
    }

    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int w10 = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w10 & (~(255 << i10))));
    }

    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(255 << i10))));
    }

    public static void K(Object obj, long j10, double d10) {
        f19555e.l(obj, j10, d10);
    }

    public static void L(Object obj, long j10, float f10) {
        f19555e.m(obj, j10, f10);
    }

    public static void M(Object obj, long j10, int i10) {
        f19555e.n(obj, j10, i10);
    }

    public static void N(Object obj, long j10, long j11) {
        f19555e.o(obj, j10, j11);
    }

    public static void O(Object obj, long j10, Object obj2) {
        f19555e.p(obj, j10, obj2);
    }

    public static boolean P() {
        e eVar = f19555e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    public static boolean Q() {
        e eVar = f19555e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static Object i(Class cls) {
        try {
            return f19551a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int j(Class cls) {
        if (f19557g) {
            return f19555e.a(cls);
        }
        return -1;
    }

    public static int k(Class cls) {
        if (f19557g) {
            return f19555e.b(cls);
        }
        return -1;
    }

    public static Field l() {
        Field n10;
        if (AbstractC2129d.c() && (n10 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n10;
        }
        Field n11 = n(Buffer.class, "address");
        if (n11 == null || n11.getType() != Long.TYPE) {
            return null;
        }
        return n11;
    }

    public static boolean m(Class cls) {
        if (!AbstractC2129d.c()) {
            return false;
        }
        try {
            Class cls2 = f19552b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f19555e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    public static boolean p(Object obj, long j10) {
        return f19555e.c(obj, j10);
    }

    public static boolean q(Object obj, long j10) {
        return s(obj, j10) != 0;
    }

    public static boolean r(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    public static byte s(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte t(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double u(Object obj, long j10) {
        return f19555e.d(obj, j10);
    }

    public static float v(Object obj, long j10) {
        return f19555e.e(obj, j10);
    }

    public static int w(Object obj, long j10) {
        return f19555e.f(obj, j10);
    }

    public static long x(Object obj, long j10) {
        return f19555e.g(obj, j10);
    }

    public static e y() {
        Unsafe unsafe = f19551a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC2129d.c()) {
            return new d(unsafe);
        }
        if (f19553c) {
            return new c(unsafe);
        }
        if (f19554d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object z(Object obj, long j10) {
        return f19555e.h(obj, j10);
    }
}
