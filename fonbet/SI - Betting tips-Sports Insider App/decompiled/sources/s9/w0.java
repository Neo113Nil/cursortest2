package s9;

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
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f23380a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f23381b;

    /* renamed from: c, reason: collision with root package name */
    public static final v0 f23382c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f23383d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f23384e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f23385f;

    static {
        Unsafe i5 = i();
        f23380a = i5;
        f23381b = c.f23286a;
        boolean h10 = h(Long.TYPE);
        boolean h11 = h(Integer.TYPE);
        v0 v0Var = null;
        if (i5 != null) {
            if (!c.a()) {
                v0Var = new u0(i5);
            } else if (h10) {
                v0Var = new t0(i5, 1);
            } else if (h11) {
                v0Var = new t0(i5, 0);
            }
        }
        f23382c = v0Var;
        f23383d = v0Var == null ? false : v0Var.q();
        f23384e = v0Var == null ? false : v0Var.p();
        e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g10 = g();
        if (g10 != null && v0Var != null) {
            v0Var.i(g10);
        }
        f23385f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(w0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(long j, Object obj) {
        return ((byte) ((f23382c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean c(long j, Object obj) {
        return ((byte) ((f23382c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f23380a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int e(Class cls) {
        if (f23384e) {
            return f23382c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f23384e) {
            f23382c.b(cls);
        }
    }

    public static Field g() {
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
    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f23381b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(Object obj, long j, byte b10) {
        long j6 = (-4) & j;
        int f6 = f23382c.f(j6, obj);
        int i5 = ((~((int) j)) & 3) << 3;
        l(((255 & b10) << i5) | (f6 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i5))), j6, obj);
    }

    public static void k(Object obj, long j, byte b10) {
        long j6 = (-4) & j;
        int i5 = (((int) j) & 3) << 3;
        l(((255 & b10) << i5) | (f23382c.f(j6, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i5))), j6, obj);
    }

    public static void l(int i5, long j, Object obj) {
        f23382c.m(i5, j, obj);
    }

    public static void m(Object obj, long j, long j6) {
        f23382c.n(obj, j, j6);
    }

    public static void n(long j, Object obj, Object obj2) {
        f23382c.o(j, obj, obj2);
    }
}
