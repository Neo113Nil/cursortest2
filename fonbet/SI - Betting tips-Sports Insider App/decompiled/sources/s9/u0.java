package s9;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 extends v0 {
    @Override // s9.v0
    public final boolean c(long j, Object obj) {
        return this.f23379a.getBoolean(obj, j);
    }

    @Override // s9.v0
    public final double d(long j, Object obj) {
        return this.f23379a.getDouble(obj, j);
    }

    @Override // s9.v0
    public final float e(long j, Object obj) {
        return this.f23379a.getFloat(obj, j);
    }

    @Override // s9.v0
    public final void j(Object obj, long j, boolean z5) {
        this.f23379a.putBoolean(obj, j, z5);
    }

    @Override // s9.v0
    public final void k(Object obj, long j, double d10) {
        this.f23379a.putDouble(obj, j, d10);
    }

    @Override // s9.v0
    public final void l(Object obj, long j, float f6) {
        this.f23379a.putFloat(obj, j, f6);
    }

    @Override // s9.v0
    public final boolean p() {
        if (!super.p()) {
            return false;
        }
        try {
            Class<?> cls = this.f23379a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            w0.a(th2);
            return false;
        }
    }

    @Override // s9.v0
    public final boolean q() {
        Unsafe unsafe = this.f23379a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (w0.g() != null) {
                    try {
                        Class<?> cls3 = this.f23379a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        w0.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                w0.a(th3);
            }
        }
        return false;
    }
}
