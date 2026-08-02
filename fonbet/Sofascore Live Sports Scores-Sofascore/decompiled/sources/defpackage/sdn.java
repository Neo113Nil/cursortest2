package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class sdn {
    public static final Unsafe a;
    public static final Class b;
    public static final sck c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    static {
        Unsafe unsafe;
        boolean z;
        sck sckVar;
        boolean z2;
        Field b2;
        sck sckVar2;
        pdn pdnVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(8));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = b7n.a();
        Class cls = Long.TYPE;
        boolean m = m(cls);
        Class cls2 = Integer.TYPE;
        boolean m2 = m(cls2);
        if (unsafe != null) {
            if (m) {
                pdnVar = new pdn(unsafe, 1);
            } else if (m2) {
                pdnVar = new pdn(unsafe, 0);
            }
        }
        c = pdnVar;
        if (pdnVar != null) {
            try {
                Class<?> cls3 = pdnVar.b.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                Logger.getLogger(sdn.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
            if (b() != null) {
                z = true;
                d = z;
                sckVar = c;
                if (sckVar != null) {
                    try {
                        Class<?> cls4 = sckVar.b.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        Logger.getLogger(sdn.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                    }
                    e = z2;
                    f = n(byte[].class);
                    n(boolean[].class);
                    a(boolean[].class);
                    n(int[].class);
                    a(int[].class);
                    n(long[].class);
                    a(long[].class);
                    n(float[].class);
                    a(float[].class);
                    n(double[].class);
                    a(double[].class);
                    n(Object[].class);
                    a(Object[].class);
                    b2 = b();
                    if (b2 != null && (sckVar2 = c) != null) {
                        sckVar2.b.objectFieldOffset(b2);
                    }
                    g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                e = z2;
                f = n(byte[].class);
                n(boolean[].class);
                a(boolean[].class);
                n(int[].class);
                a(int[].class);
                n(long[].class);
                a(long[].class);
                n(float[].class);
                a(float[].class);
                n(double[].class);
                a(double[].class);
                n(Object[].class);
                a(Object[].class);
                b2 = b();
                if (b2 != null) {
                    sckVar2.b.objectFieldOffset(b2);
                }
                g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        d = z;
        sckVar = c;
        if (sckVar != null) {
        }
        z2 = false;
        e = z2;
        f = n(byte[].class);
        n(boolean[].class);
        a(boolean[].class);
        n(int[].class);
        a(int[].class);
        n(long[].class);
        a(long[].class);
        n(float[].class);
        a(float[].class);
        n(double[].class);
        a(double[].class);
        n(Object[].class);
        a(Object[].class);
        b2 = b();
        if (b2 != null) {
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (e) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i = b7n.a;
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

    public static void c(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        sck sckVar = c;
        int i = sckVar.b.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        sckVar.b.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void d(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        sck sckVar = c;
        int i = (((int) j) & 3) << 3;
        sckVar.b.putInt(obj, j2, ((255 & b2) << i) | (sckVar.b.getInt(obj, j2) & (~(255 << i))));
    }

    public static int e(Object obj, long j) {
        return c.b.getInt(obj, j);
    }

    public static long f(Object obj, long j) {
        return c.b.getLong(obj, j);
    }

    public static Object g(Object obj, long j) {
        return c.b.getObject(obj, j);
    }

    public static void h(int i, long j, Object obj) {
        c.b.putInt(obj, j, i);
    }

    public static void i(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static void j(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }

    public static boolean k(Object obj, long j) {
        return ((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean l(Object obj, long j) {
        return ((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean m(Class cls) {
        int i = b7n.a;
        try {
            Class cls2 = b;
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

    public static int n(Class cls) {
        if (e) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }
}
