package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f59450a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f59451b;

    /* renamed from: c, reason: collision with root package name */
    private static final e f59452c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f59453d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f59454e;

    /* renamed from: f, reason: collision with root package name */
    static final long f59455f;

    /* renamed from: g, reason: collision with root package name */
    static final boolean f59456g;

    final class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    /* loaded from: classes9.dex */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final boolean c(Object obj, long j11) {
            return p0.f59456g ? p0.g(j11, obj) : p0.h(j11, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final byte d(Object obj, long j11) {
            return p0.f59456g ? p0.c(j11, obj) : p0.d(j11, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final double e(Object obj, long j11) {
            return Double.longBitsToDouble(h(obj, j11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final float f(Object obj, long j11) {
            return Float.intBitsToFloat(g(obj, j11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void k(Object obj, long j11, boolean z11) {
            if (p0.f59456g) {
                p0.i(obj, j11, z11);
            } else {
                p0.j(obj, j11, z11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void l(Object obj, long j11, byte b11) {
            if (p0.f59456g) {
                p0.B(obj, j11, b11);
            } else {
                p0.C(obj, j11, b11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void m(Object obj, long j11, double d11) {
            p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void n(Object obj, long j11, float f7) {
            o(obj, j11, Float.floatToIntBits(f7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final boolean s() {
            return false;
        }
    }

    private static final class c extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final boolean c(Object obj, long j11) {
            return p0.f59456g ? p0.g(j11, obj) : p0.h(j11, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final byte d(Object obj, long j11) {
            return p0.f59456g ? p0.c(j11, obj) : p0.d(j11, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final double e(Object obj, long j11) {
            return Double.longBitsToDouble(h(obj, j11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final float f(Object obj, long j11) {
            return Float.intBitsToFloat(g(obj, j11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void k(Object obj, long j11, boolean z11) {
            if (p0.f59456g) {
                p0.i(obj, j11, z11);
            } else {
                p0.j(obj, j11, z11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void l(Object obj, long j11, byte b11) {
            if (p0.f59456g) {
                p0.B(obj, j11, b11);
            } else {
                p0.C(obj, j11, b11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void m(Object obj, long j11, double d11) {
            p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void n(Object obj, long j11, float f7) {
            o(obj, j11, Float.floatToIntBits(f7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final boolean s() {
            return false;
        }
    }

    /* loaded from: classes9.dex */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final boolean c(Object obj, long j11) {
            return this.f59457a.getBoolean(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final byte d(Object obj, long j11) {
            return this.f59457a.getByte(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final double e(Object obj, long j11) {
            return this.f59457a.getDouble(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final float f(Object obj, long j11) {
            return this.f59457a.getFloat(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void k(Object obj, long j11, boolean z11) {
            this.f59457a.putBoolean(obj, j11, z11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void l(Object obj, long j11, byte b11) {
            this.f59457a.putByte(obj, j11, b11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void m(Object obj, long j11, double d11) {
            this.f59457a.putDouble(obj, j11, d11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final void n(Object obj, long j11, float f7) {
            this.f59457a.putFloat(obj, j11, f7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f59457a.getClass();
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
                p0.a(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public final boolean s() {
            Unsafe unsafe = this.f59457a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (p0.n() != null) {
                        try {
                            Class<?> cls3 = this.f59457a.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th2) {
                            p0.a(th2);
                            return false;
                        }
                    }
                } catch (Throwable th3) {
                    p0.a(th3);
                }
            }
            return false;
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f59457a;

        e(Unsafe unsafe) {
            this.f59457a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f59457a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f59457a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j11);

        public abstract byte d(Object obj, long j11);

        public abstract double e(Object obj, long j11);

        public abstract float f(Object obj, long j11);

        public final int g(Object obj, long j11) {
            return this.f59457a.getInt(obj, j11);
        }

        public final long h(Object obj, long j11) {
            return this.f59457a.getLong(obj, j11);
        }

        public final Object i(Object obj, long j11) {
            return this.f59457a.getObject(obj, j11);
        }

        public final long j(Field field) {
            return this.f59457a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j11, boolean z11);

        public abstract void l(Object obj, long j11, byte b11);

        public abstract void m(Object obj, long j11, double d11);

        public abstract void n(Object obj, long j11, float f7);

        public final void o(Object obj, long j11, int i11) {
            this.f59457a.putInt(obj, j11, i11);
        }

        public final void p(Object obj, long j11, long j12) {
            this.f59457a.putLong(obj, j11, j12);
        }

        public final void q(Object obj, long j11, Object obj2) {
            this.f59457a.putObject(obj, j11, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f59457a;
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
                p0.a(th2);
                return false;
            }
        }

        public abstract boolean s();
    }

    static {
        Unsafe w11 = w();
        f59450a = w11;
        f59451b = C5898d.a();
        boolean o11 = o(Long.TYPE);
        boolean o12 = o(Integer.TYPE);
        e eVar = null;
        if (w11 != null) {
            if (!C5898d.b()) {
                eVar = new d(w11);
            } else if (o11) {
                eVar = new c(w11);
            } else if (o12) {
                eVar = new b(w11);
            }
        }
        f59452c = eVar;
        f59453d = eVar == null ? false : eVar.s();
        f59454e = eVar == null ? false : eVar.r();
        f59455f = l(byte[].class);
        l(boolean[].class);
        m(boolean[].class);
        l(int[].class);
        m(int[].class);
        l(long[].class);
        m(long[].class);
        l(float[].class);
        m(float[].class);
        l(double[].class);
        m(double[].class);
        l(Object[].class);
        m(Object[].class);
        Field n11 = n();
        if (n11 != null && eVar != null) {
            eVar.j(n11);
        }
        f59456g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private p0() {
    }

    static void A(byte[] bArr, long j11, byte b11) {
        f59452c.l(bArr, f59455f + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void B(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int g10 = f59452c.g(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        F(obj, j12, ((255 & b11) << i11) | (g10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void C(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        F(obj, j12, ((255 & b11) << i11) | (f59452c.g(obj, j12) & (~(255 << i11))));
    }

    static void D(Object obj, long j11, double d11) {
        f59452c.m(obj, j11, d11);
    }

    static void E(Object obj, long j11, float f7) {
        f59452c.n(obj, j11, f7);
    }

    static void F(Object obj, long j11, int i11) {
        f59452c.o(obj, j11, i11);
    }

    static void G(Object obj, long j11, long j12) {
        f59452c.p(obj, j11, j12);
    }

    static void H(Object obj, long j11, Object obj2) {
        f59452c.q(obj, j11, obj2);
    }

    static void a(Throwable th2) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static byte c(long j11, Object obj) {
        return (byte) ((f59452c.g(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    static byte d(long j11, Object obj) {
        return (byte) ((f59452c.g(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    static boolean g(long j11, Object obj) {
        return ((byte) ((f59452c.g(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    static boolean h(long j11, Object obj) {
        return ((byte) ((f59452c.g(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    static void i(Object obj, long j11, boolean z11) {
        B(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static void j(Object obj, long j11, boolean z11) {
        C(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static <T> T k(Class<T> cls) {
        try {
            return (T) f59450a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static int l(Class<?> cls) {
        if (f59454e) {
            return f59452c.a(cls);
        }
        return -1;
    }

    private static void m(Class cls) {
        if (f59454e) {
            f59452c.b(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field n() {
        Field field;
        Field field2;
        if (C5898d.b()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    static boolean o(Class<?> cls) {
        if (!C5898d.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f59451b;
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

    static boolean p(Object obj, long j11) {
        return f59452c.c(obj, j11);
    }

    static byte q(long j11, byte[] bArr) {
        return f59452c.d(bArr, f59455f + j11);
    }

    static double r(Object obj, long j11) {
        return f59452c.e(obj, j11);
    }

    static float s(Object obj, long j11) {
        return f59452c.f(obj, j11);
    }

    static int t(Object obj, long j11) {
        return f59452c.g(obj, j11);
    }

    static long u(Object obj, long j11) {
        return f59452c.h(obj, j11);
    }

    static Object v(Object obj, long j11) {
        return f59452c.i(obj, j11);
    }

    static Unsafe w() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean x() {
        return f59454e;
    }

    static boolean y() {
        return f59453d;
    }

    static void z(Object obj, long j11, boolean z11) {
        f59452c.k(obj, j11, z11);
    }
}
