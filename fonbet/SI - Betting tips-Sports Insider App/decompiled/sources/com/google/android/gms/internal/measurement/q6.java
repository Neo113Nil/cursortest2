package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class q6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f5197a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f5198b;

    /* renamed from: c, reason: collision with root package name */
    public static final p6 f5199c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5200d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5201e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5202f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5203g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    static {
        ?? r16;
        p6 p6Var;
        boolean z5;
        Field b10;
        p6 p6Var2;
        Unsafe l6 = l();
        f5197a = l6;
        int i5 = s4.f5235a;
        f5198b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean m6 = m(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean m10 = m(cls2);
        p6 p6Var3 = null;
        if (l6 != null) {
            if (m6) {
                p6Var3 = new o6(l6);
            } else if (m10) {
                p6Var3 = new n6(l6);
            }
        }
        f5199c = p6Var3;
        boolean z7 = false;
        if (p6Var3 != null) {
            try {
                Class<?> cls3 = p6Var3.f5182a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th2) {
                r16 = 0;
                Logger.getLogger(q6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z7 = false;
            }
            if (b() != null) {
                r16 = 0;
                z7 = true;
                f5200d = z7;
                p6Var = f5199c;
                if (p6Var != null) {
                    try {
                        Class<?> cls4 = p6Var.f5182a.getClass();
                        Class<?>[] clsArr = new Class[1];
                        clsArr[r16] = Field.class;
                        cls4.getMethod("objectFieldOffset", clsArr);
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[r16] = Class.class;
                        cls4.getMethod("arrayBaseOffset", clsArr2);
                        Class<?>[] clsArr3 = new Class[1];
                        clsArr3[r16] = Class.class;
                        cls4.getMethod("arrayIndexScale", clsArr3);
                        Class<?>[] clsArr4 = new Class[2];
                        clsArr4[r16] = Object.class;
                        clsArr4[1] = cls;
                        cls4.getMethod("getInt", clsArr4);
                        Class<?>[] clsArr5 = new Class[3];
                        clsArr5[r16] = Object.class;
                        clsArr5[1] = cls;
                        clsArr5[2] = cls2;
                        cls4.getMethod("putInt", clsArr5);
                        Class<?>[] clsArr6 = new Class[2];
                        clsArr6[r16] = Object.class;
                        clsArr6[1] = cls;
                        cls4.getMethod("getLong", clsArr6);
                        Class<?>[] clsArr7 = new Class[3];
                        clsArr7[r16] = Object.class;
                        clsArr7[1] = cls;
                        clsArr7[2] = cls;
                        cls4.getMethod("putLong", clsArr7);
                        Class<?>[] clsArr8 = new Class[2];
                        clsArr8[r16] = Object.class;
                        clsArr8[1] = cls;
                        cls4.getMethod("getObject", clsArr8);
                        Class<?>[] clsArr9 = new Class[3];
                        clsArr9[r16] = Object.class;
                        clsArr9[1] = cls;
                        clsArr9[2] = Object.class;
                        cls4.getMethod("putObject", clsArr9);
                        z5 = true;
                    } catch (Throwable th3) {
                        Logger.getLogger(q6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                    }
                    f5201e = z5;
                    f5202f = p(byte[].class);
                    p(boolean[].class);
                    a(boolean[].class);
                    p(int[].class);
                    a(int[].class);
                    p(long[].class);
                    a(long[].class);
                    p(float[].class);
                    a(float[].class);
                    p(double[].class);
                    a(double[].class);
                    p(Object[].class);
                    a(Object[].class);
                    b10 = b();
                    if (b10 != null && (p6Var2 = f5199c) != null) {
                        p6Var2.f5182a.objectFieldOffset(b10);
                    }
                    f5203g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? r16 : true;
                }
                z5 = r16;
                f5201e = z5;
                f5202f = p(byte[].class);
                p(boolean[].class);
                a(boolean[].class);
                p(int[].class);
                a(int[].class);
                p(long[].class);
                a(long[].class);
                p(float[].class);
                a(float[].class);
                p(double[].class);
                a(double[].class);
                p(Object[].class);
                a(Object[].class);
                b10 = b();
                if (b10 != null) {
                    p6Var2.f5182a.objectFieldOffset(b10);
                }
                f5203g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? r16 : true;
            }
        }
        r16 = 0;
        f5200d = z7;
        p6Var = f5199c;
        if (p6Var != null) {
        }
        z5 = r16;
        f5201e = z5;
        f5202f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        b10 = b();
        if (b10 != null) {
        }
        f5203g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? r16 : true;
    }

    public static void a(Class cls) {
        if (f5201e) {
            f5199c.f5182a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i5 = s4.f5235a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j, byte b10) {
        Unsafe unsafe = f5199c.f5182a;
        long j6 = (-4) & j;
        int i5 = unsafe.getInt(obj, j6);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j6, ((255 & b10) << i10) | (i5 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    public static void d(Object obj, long j, byte b10) {
        Unsafe unsafe = f5199c.f5182a;
        long j6 = (-4) & j;
        int i5 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j6, ((255 & b10) << i5) | (unsafe.getInt(obj, j6) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i5))));
    }

    public static Object e(Class cls) {
        try {
            return f5197a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int f(long j, Object obj) {
        return f5199c.f5182a.getInt(obj, j);
    }

    public static void g(int i5, long j, Object obj) {
        f5199c.f5182a.putInt(obj, j, i5);
    }

    public static long h(long j, Object obj) {
        return f5199c.f5182a.getLong(obj, j);
    }

    public static void i(Object obj, long j, long j6) {
        f5199c.f5182a.putLong(obj, j, j6);
    }

    public static Object j(long j, Object obj) {
        return f5199c.f5182a.getObject(obj, j);
    }

    public static void k(long j, Object obj, Object obj2) {
        f5199c.f5182a.putObject(obj, j, obj2);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new m6());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(Class cls) {
        int i5 = s4.f5235a;
        try {
            Class cls2 = f5198b;
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

    public static /* synthetic */ boolean n(long j, Object obj) {
        return ((byte) ((f5199c.f5182a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* synthetic */ boolean o(long j, Object obj) {
        return ((byte) ((f5199c.f5182a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static int p(Class cls) {
        if (f5201e) {
            return f5199c.f5182a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
