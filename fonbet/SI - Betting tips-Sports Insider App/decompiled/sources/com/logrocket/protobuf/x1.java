package com.logrocket.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f6819a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f6820b;

    /* renamed from: c, reason: collision with root package name */
    public static final w1 f6821c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f6822d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f6823e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f6824f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f6825g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f6826h;

    static {
        Unsafe j = j();
        f6819a = j;
        f6820b = c.f6672a;
        boolean f6 = f(Long.TYPE);
        boolean f10 = f(Integer.TYPE);
        w1 w1Var = null;
        if (j != null) {
            if (!c.a()) {
                w1Var = new v1(j);
            } else if (f6) {
                w1Var = new u1(j, 1);
            } else if (f10) {
                w1Var = new u1(j, 0);
            }
        }
        f6821c = w1Var;
        f6822d = w1Var == null ? false : w1Var.u();
        f6823e = w1Var == null ? false : w1Var.t();
        f6824f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e7 = e();
        f6825g = (e7 == null || w1Var == null) ? -1L : w1Var.k(e7);
        f6826h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(x1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return f6819a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int c(Class cls) {
        if (f6823e) {
            return f6821c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f6823e) {
            f6821c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (c.a()) {
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
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f6820b;
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

    public static byte g(byte[] bArr, long j) {
        return f6821c.e(f6824f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f6821c.h((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((f6821c.h((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new t1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte b10, long j) {
        f6821c.m(b10, j);
    }

    public static void l(byte[] bArr, long j, byte b10) {
        f6821c.n(bArr, f6824f + j, b10);
    }

    public static void m(Object obj, long j, byte b10) {
        long j6 = (-4) & j;
        int h10 = f6821c.h(j6, obj);
        int i5 = ((~((int) j)) & 3) << 3;
        o(((255 & b10) << i5) | (h10 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i5))), j6, obj);
    }

    public static void n(Object obj, long j, byte b10) {
        long j6 = (-4) & j;
        int i5 = (((int) j) & 3) << 3;
        o(((255 & b10) << i5) | (f6821c.h(j6, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i5))), j6, obj);
    }

    public static void o(int i5, long j, Object obj) {
        f6821c.q(i5, j, obj);
    }

    public static void p(long j, Object obj, Object obj2) {
        f6821c.s(j, obj, obj2);
    }
}
