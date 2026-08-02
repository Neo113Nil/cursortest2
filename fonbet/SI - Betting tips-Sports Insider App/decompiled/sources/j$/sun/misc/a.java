package j$.sun.misc;

import j$.util.concurrent.j;
import j$.util.concurrent.o;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17277b;

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f17278a;

    static {
        Field g10 = g();
        g10.setAccessible(true);
        try {
            f17277b = new a((Unsafe) g10.get(null));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("Couldn't get the Unsafe", e7);
        }
    }

    public a(Unsafe unsafe) {
        this.f17278a = unsafe;
    }

    public static Field g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e7) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e7);
        }
    }

    public final int e(o oVar, long j) {
        while (true) {
            int intVolatile = this.f17278a.getIntVolatile(oVar, j);
            o oVar2 = oVar;
            long j6 = j;
            if (this.f17278a.compareAndSwapInt(oVar2, j6, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            oVar = oVar2;
            j = j6;
        }
    }

    public final long i(Field field) {
        return this.f17278a.objectFieldOffset(field);
    }

    public final long h(Class cls, String str) {
        try {
            return i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e7) {
            throw new AssertionError("Cannot find field:", e7);
        }
    }

    public final int a(Class cls) {
        return this.f17278a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f17278a.arrayIndexScale(cls);
    }

    public final Object f(Object obj, long j) {
        return this.f17278a.getObjectVolatile(obj, j);
    }

    public final void j(Object obj, long j, j jVar) {
        this.f17278a.putObjectVolatile(obj, j, jVar);
    }

    public final boolean c(Object obj, long j, int i5, int i10) {
        return this.f17278a.compareAndSwapInt(obj, j, i5, i10);
    }

    public final boolean d(Object obj, long j, long j6, long j10) {
        return this.f17278a.compareAndSwapLong(obj, j, j6, j10);
    }
}
