package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i1 extends j1 {
    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean c(long j, Object obj) {
        return this.f1632a.getBoolean(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final double d(long j, Object obj) {
        return this.f1632a.getDouble(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final float e(long j, Object obj) {
        return this.f1632a.getFloat(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void j(Object obj, long j, boolean z5) {
        this.f1632a.putBoolean(obj, j, z5);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void k(Object obj, long j, byte b10) {
        this.f1632a.putByte(obj, j, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void l(Object obj, long j, double d10) {
        this.f1632a.putDouble(obj, j, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void m(Object obj, long j, float f6) {
        this.f1632a.putFloat(obj, j, f6);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f1632a.getClass();
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
            k1.a(th2);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean r() {
        Unsafe unsafe = this.f1632a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (k1.g() != null) {
                    try {
                        Class<?> cls3 = this.f1632a.getClass();
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
                        k1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                k1.a(th3);
            }
        }
        return false;
    }
}
