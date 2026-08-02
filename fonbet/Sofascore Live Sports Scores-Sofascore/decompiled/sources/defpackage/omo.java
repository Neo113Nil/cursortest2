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
public abstract class omo {
    public static final Unsafe a;
    public static final Class b;
    public static final sck c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    static {
        Unsafe unsafe;
        boolean z;
        sck sckVar;
        boolean z2;
        Field m;
        sck sckVar2;
        imo imoVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(13));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        int i = h0o.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean j = j(cls);
        Class cls2 = Integer.TYPE;
        boolean j2 = j(cls2);
        char c2 = 1;
        int i2 = 0;
        if (unsafe != null) {
            if (j) {
                imoVar = new imo(unsafe, c2 == true ? 1 : 0);
            } else if (j2) {
                imoVar = new imo(unsafe, i2);
            }
        }
        c = imoVar;
        if (imoVar != null) {
            try {
                Class<?> cls3 = imoVar.b.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                Logger.getLogger(omo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
            if (m() != null) {
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
                        Logger.getLogger(omo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                    }
                    e = z2;
                    k(byte[].class);
                    k(boolean[].class);
                    l(boolean[].class);
                    k(int[].class);
                    l(int[].class);
                    k(long[].class);
                    l(long[].class);
                    k(float[].class);
                    l(float[].class);
                    k(double[].class);
                    l(double[].class);
                    k(Object[].class);
                    l(Object[].class);
                    m = m();
                    if (m != null && (sckVar2 = c) != null) {
                        sckVar2.b.objectFieldOffset(m);
                    }
                    f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                e = z2;
                k(byte[].class);
                k(boolean[].class);
                l(boolean[].class);
                k(int[].class);
                l(int[].class);
                k(long[].class);
                l(long[].class);
                k(float[].class);
                l(float[].class);
                k(double[].class);
                l(double[].class);
                k(Object[].class);
                l(Object[].class);
                m = m();
                if (m != null) {
                    sckVar2.b.objectFieldOffset(m);
                }
                f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        d = z;
        sckVar = c;
        if (sckVar != null) {
        }
        z2 = false;
        e = z2;
        k(byte[].class);
        k(boolean[].class);
        l(boolean[].class);
        k(int[].class);
        l(int[].class);
        k(long[].class);
        l(long[].class);
        k(float[].class);
        l(float[].class);
        k(double[].class);
        l(double[].class);
        k(Object[].class);
        l(Object[].class);
        m = m();
        if (m != null) {
        }
        f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Object obj, long j) {
        return c.b.getInt(obj, j);
    }

    public static long b(Object obj, long j) {
        return c.b.getLong(obj, j);
    }

    public static Object c(Object obj, long j) {
        return c.b.getObject(obj, j);
    }

    public static /* synthetic */ void d(Object obj, long j, boolean z) {
        sck sckVar = c;
        long j2 = (-4) & j;
        int i = sckVar.b.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        sckVar.b.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    public static /* synthetic */ void e(Object obj, long j, boolean z) {
        sck sckVar = c;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        sckVar.b.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & sckVar.b.getInt(obj, j2)));
    }

    public static void f(int i, long j, Object obj) {
        c.b.putInt(obj, j, i);
    }

    public static void g(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean h(Object obj, long j) {
        return ((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean i(Object obj, long j) {
        return ((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean j(Class cls) {
        int i = h0o.a;
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

    public static void k(Class cls) {
        if (e) {
            c.b.arrayBaseOffset(cls);
        }
    }

    public static void l(Class cls) {
        if (e) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static Field m() {
        Field field;
        Field field2;
        int i = h0o.a;
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
}
