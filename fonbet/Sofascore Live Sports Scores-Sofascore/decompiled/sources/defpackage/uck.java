package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class uck {
    public static final Unsafe a;
    public static final Class b;
    public static final sck c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:2|3)|4|(14:(1:42)(1:(1:44))|7|(1:9)(1:40)|10|(1:12)(1:39)|13|14|15|(5:17|18|19|(1:23)|24)|(1:36)(1:29)|30|(1:32)|33|34)|6|7|(0)(0)|10|(0)(0)|13|14|15|(0)|(0)|36|30|(0)|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    static {
        Unsafe unsafe;
        qck qckVar;
        Field field;
        Field field2;
        Field field3 = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = jx.a;
        Class<?> cls = Long.TYPE;
        boolean e2 = e(cls);
        boolean e3 = e(Integer.TYPE);
        char c2 = 1;
        int i = 0;
        if (unsafe != null) {
            if (e2) {
                qckVar = new qck(unsafe, c2 == true ? 1 : 0);
            } else if (e3) {
                qckVar = new qck(unsafe, i);
            }
            c = qckVar;
            d = qckVar != null ? false : qckVar.m();
            e = qckVar != null ? false : qckVar.l();
            f = b(byte[].class);
            b(boolean[].class);
            c(boolean[].class);
            b(int[].class);
            c(int[].class);
            b(long[].class);
            c(long[].class);
            b(float[].class);
            c(float[].class);
            b(double[].class);
            c(double[].class);
            b(Object[].class);
            c(Object[].class);
            Class cls2 = jx.a;
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field == null) {
                try {
                    field2 = Buffer.class.getDeclaredField("address");
                } catch (Throwable unused2) {
                    field2 = null;
                }
                if (field2 != null && field2.getType() == cls) {
                    field3 = field2;
                }
                field = field3;
            }
            g = (field != null || qckVar == null) ? -1L : qckVar.b.objectFieldOffset(field);
            h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        qckVar = null;
        c = qckVar;
        d = qckVar != null ? false : qckVar.m();
        e = qckVar != null ? false : qckVar.l();
        f = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Class cls22 = jx.a;
        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field == null) {
        }
        g = (field != null || qckVar == null) ? -1L : qckVar.b.objectFieldOffset(field);
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static long a(ByteBuffer byteBuffer) {
        return c.b.getLong(byteBuffer, g);
    }

    public static int b(Class cls) {
        if (e) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (e) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static void d(long j, byte[] bArr, long j2, long j3) {
        c.a(j, bArr, j2, j3);
    }

    public static boolean e(Class cls) {
        Class cls2 = jx.a;
        try {
            Class cls3 = b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", cls, cls4);
            cls3.getMethod("pokeLong", cls, Long.TYPE, cls4);
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", cls, cls5, cls4);
            cls3.getMethod("peekInt", cls, cls4);
            cls3.getMethod("pokeByte", cls, Byte.TYPE);
            cls3.getMethod("peekByte", cls);
            cls3.getMethod("pokeByteArray", cls, byte[].class, cls5, cls5);
            cls3.getMethod("peekByteArray", cls, byte[].class, cls5, cls5);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte f(Object obj, long j) {
        return (byte) ((h(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(Object obj, long j) {
        return (byte) ((h(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(Object obj, long j) {
        return c.b.getInt(obj, j);
    }

    public static long i(Object obj, long j) {
        return c.b.getLong(obj, j);
    }

    public static Object j(Object obj, long j) {
        return c.b.getObject(obj, j);
    }

    public static void k(Throwable th) {
        Logger.getLogger(uck.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void l(byte b2, long j) {
        c.h(b2, j);
    }

    public static void m(byte[] bArr, byte b2, long j) {
        c.i(bArr, f + j, b2);
    }

    public static void n(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int h2 = h(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        p(((255 & b2) << i) | (h2 & (~(255 << i))), j2, obj);
    }

    public static void o(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        p(((255 & b2) << i) | (h(obj, j2) & (~(255 << i))), j2, obj);
    }

    public static void p(int i, long j, Object obj) {
        c.b.putInt(obj, j, i);
    }

    public static void q(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static void r(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }
}
