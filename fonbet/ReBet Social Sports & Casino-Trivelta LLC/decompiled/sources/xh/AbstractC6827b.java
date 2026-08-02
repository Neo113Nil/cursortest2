package xh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: xh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6827b {

    /* renamed from: c, reason: collision with root package name */
    public static final Unsafe f68164c = b();

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f68162a = d();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f68163b = c();

    public static long a(Class cls, String str) {
        try {
            return f68164c.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Unsafe b() {
        try {
            try {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return (Unsafe) declaredField.get(null);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        } catch (Exception unused) {
            Constructor declaredConstructor = Unsafe.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return (Unsafe) declaredConstructor.newInstance(null);
        }
    }

    public static boolean c() {
        try {
            Class cls = Long.TYPE;
            Unsafe.class.getMethod("getAndAddLong", Object.class, cls, cls);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d() {
        try {
            Unsafe.class.getMethod("getAndSetObject", Object.class, Long.TYPE, Object.class);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
