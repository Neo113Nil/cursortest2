package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class n9o {
    public static final Unsafe a;
    public static final Class b;
    public static final sck c;
    public static final boolean d;
    public static final long e;
    public static final boolean f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0136  */
    static {
        boolean z;
        Field a2;
        sck sckVar;
        Unsafe j = j();
        a = j;
        int i = opn.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean k = k(cls);
        Class cls2 = Integer.TYPE;
        boolean k2 = k(cls2);
        char c2 = 1;
        v8o v8oVar = null;
        int i2 = 0;
        if (j != null) {
            if (k) {
                v8oVar = new v8o(j, c2 == true ? 1 : 0);
            } else if (k2) {
                v8oVar = new v8o(j, i2);
            }
        }
        c = v8oVar;
        if (v8oVar != null) {
            try {
                Class<?> cls3 = v8oVar.b.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th) {
                Logger.getLogger(n9o.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        sck sckVar2 = c;
        if (sckVar2 != null) {
            try {
                Class<?> cls4 = sckVar2.b.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(n9o.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
            d = z;
            e = n(byte[].class);
            n(boolean[].class);
            o(boolean[].class);
            n(int[].class);
            o(int[].class);
            n(long[].class);
            o(long[].class);
            n(float[].class);
            o(float[].class);
            n(double[].class);
            o(double[].class);
            n(Object[].class);
            o(Object[].class);
            a2 = a();
            if (a2 != null && (sckVar = c) != null) {
                sckVar.b.objectFieldOffset(a2);
            }
            f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        z = false;
        d = z;
        e = n(byte[].class);
        n(boolean[].class);
        o(boolean[].class);
        n(int[].class);
        o(int[].class);
        n(long[].class);
        o(long[].class);
        n(float[].class);
        o(float[].class);
        n(double[].class);
        o(double[].class);
        n(Object[].class);
        o(Object[].class);
        a2 = a();
        if (a2 != null) {
            sckVar.b.objectFieldOffset(a2);
        }
        f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Field a() {
        Field field;
        Field field2;
        int i = opn.a;
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

    public static void b(Object obj, long j, byte b2) {
        Unsafe unsafe = c.b;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = c.b;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static int d(Object obj, long j) {
        return c.b.getInt(obj, j);
    }

    public static void e(int i, long j, Object obj) {
        c.b.putInt(obj, j, i);
    }

    public static long f(Object obj, long j) {
        return c.b.getLong(obj, j);
    }

    public static void g(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static Object h(Object obj, long j) {
        return c.b.getObject(obj, j);
    }

    public static void i(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }

    public static Unsafe j() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(11));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(n9o.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean k(Class cls) {
        int i = opn.a;
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

    public static /* synthetic */ boolean l(Object obj, long j) {
        return ((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean m(Object obj, long j) {
        return ((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int n(Class cls) {
        if (d) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void o(Class cls) {
        if (d) {
            c.b.arrayIndexScale(cls);
        }
    }
}
