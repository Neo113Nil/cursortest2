package com.logrocket.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f6814a;

    public w1(Unsafe unsafe) {
        this.f6814a = unsafe;
    }

    public final int a(Class cls) {
        return this.f6814a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f6814a.arrayIndexScale(cls);
    }

    public abstract void c(byte[] bArr, long j, long j6, long j10);

    public abstract boolean d(long j, Object obj);

    public abstract byte e(long j, Object obj);

    public abstract double f(long j, Object obj);

    public abstract float g(long j, Object obj);

    public final int h(long j, Object obj) {
        return this.f6814a.getInt(obj, j);
    }

    public final long i(long j, Object obj) {
        return this.f6814a.getLong(obj, j);
    }

    public final Object j(long j, Object obj) {
        return this.f6814a.getObject(obj, j);
    }

    public final long k(Field field) {
        return this.f6814a.objectFieldOffset(field);
    }

    public abstract void l(Object obj, long j, boolean z5);

    public abstract void m(byte b10, long j);

    public abstract void n(Object obj, long j, byte b10);

    public abstract void o(Object obj, long j, double d10);

    public abstract void p(Object obj, long j, float f6);

    public final void q(int i5, long j, Object obj) {
        this.f6814a.putInt(obj, j, i5);
    }

    public final void r(Object obj, long j, long j6) {
        this.f6814a.putLong(obj, j, j6);
    }

    public final void s(long j, Object obj, Object obj2) {
        this.f6814a.putObject(obj, j, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.f6814a;
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
            x1.a(th2);
            return false;
        }
    }

    public abstract boolean u();
}
