package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class tck {
    public static final Unsafe a;
    public static final Class b;
    public static final sck c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe unsafe;
        pck pckVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = ix.a;
        boolean d2 = d(Long.TYPE);
        boolean d3 = d(Integer.TYPE);
        char c2 = 1;
        int i = 0;
        if (unsafe != null) {
            if (!ix.a()) {
                pckVar = new pck(unsafe, 2);
            } else if (d2) {
                pckVar = new pck(unsafe, c2 == true ? 1 : 0);
            } else if (d3) {
                pckVar = new pck(unsafe, i);
            }
        }
        c = pckVar;
        d = pckVar == null ? false : pckVar.m();
        e = pckVar == null ? false : pckVar.l();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field c3 = c();
        if (c3 != null && pckVar != null) {
            pckVar.b.objectFieldOffset(c3);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field field;
        Field field2;
        if (ix.a()) {
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

    public static boolean d(Class cls) {
        if (!ix.a()) {
            return false;
        }
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

    public static boolean e(Object obj, long j) {
        return ((byte) ((f(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static int f(Object obj, long j) {
        return c.b.getInt(obj, j);
    }

    public static long g(Object obj, long j) {
        return c.b.getLong(obj, j);
    }

    public static Object h(Object obj, long j) {
        return c.b.getObject(obj, j);
    }

    public static void i(Throwable th) {
        Logger.getLogger(tck.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void j(byte[] bArr, byte b2, long j) {
        c.i(bArr, f + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int f2 = f(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m(((255 & b2) << i) | (f2 & (~(255 << i))), j2, obj);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(((255 & b2) << i) | (f(obj, j2) & (~(255 << i))), j2, obj);
    }

    public static void m(int i, long j, Object obj) {
        c.b.putInt(obj, j, i);
    }

    public static void n(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static void o(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }
}
