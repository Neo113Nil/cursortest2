package s9;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f23379a;

    public v0(Unsafe unsafe) {
        this.f23379a = unsafe;
    }

    public final int a(Class cls) {
        return this.f23379a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f23379a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract double d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public final int f(long j, Object obj) {
        return this.f23379a.getInt(obj, j);
    }

    public final long g(long j, Object obj) {
        return this.f23379a.getLong(obj, j);
    }

    public final Object h(long j, Object obj) {
        return this.f23379a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f23379a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z5);

    public abstract void k(Object obj, long j, double d10);

    public abstract void l(Object obj, long j, float f6);

    public final void m(int i5, long j, Object obj) {
        this.f23379a.putInt(obj, j, i5);
    }

    public final void n(Object obj, long j, long j6) {
        this.f23379a.putLong(obj, j, j6);
    }

    public final void o(long j, Object obj, Object obj2) {
        this.f23379a.putObject(obj, j, obj2);
    }

    public boolean p() {
        Unsafe unsafe = this.f23379a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            w0.a(th2);
            return false;
        }
    }

    public abstract boolean q();
}
