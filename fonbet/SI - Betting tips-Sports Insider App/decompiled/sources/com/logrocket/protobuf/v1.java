package com.logrocket.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v1 extends w1 {
    @Override // com.logrocket.protobuf.w1
    public final void c(byte[] bArr, long j, long j6, long j10) {
        this.f6814a.copyMemory(bArr, x1.f6824f + j, (Object) null, j6, j10);
    }

    @Override // com.logrocket.protobuf.w1
    public final boolean d(long j, Object obj) {
        return this.f6814a.getBoolean(obj, j);
    }

    @Override // com.logrocket.protobuf.w1
    public final byte e(long j, Object obj) {
        return this.f6814a.getByte(obj, j);
    }

    @Override // com.logrocket.protobuf.w1
    public final double f(long j, Object obj) {
        return this.f6814a.getDouble(obj, j);
    }

    @Override // com.logrocket.protobuf.w1
    public final float g(long j, Object obj) {
        return this.f6814a.getFloat(obj, j);
    }

    @Override // com.logrocket.protobuf.w1
    public final void l(Object obj, long j, boolean z5) {
        this.f6814a.putBoolean(obj, j, z5);
    }

    @Override // com.logrocket.protobuf.w1
    public final void m(byte b10, long j) {
        this.f6814a.putByte(j, b10);
    }

    @Override // com.logrocket.protobuf.w1
    public final void n(Object obj, long j, byte b10) {
        this.f6814a.putByte(obj, j, b10);
    }

    @Override // com.logrocket.protobuf.w1
    public final void o(Object obj, long j, double d10) {
        this.f6814a.putDouble(obj, j, d10);
    }

    @Override // com.logrocket.protobuf.w1
    public final void p(Object obj, long j, float f6) {
        this.f6814a.putFloat(obj, j, f6);
    }

    @Override // com.logrocket.protobuf.w1
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f6814a.getClass();
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
            x1.a(th2);
            return false;
        }
    }

    @Override // com.logrocket.protobuf.w1
    public final boolean u() {
        Unsafe unsafe = this.f6814a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (x1.e() != null) {
                    try {
                        Class<?> cls3 = this.f6814a.getClass();
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
                        x1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                x1.a(th3);
            }
        }
        return false;
    }
}
