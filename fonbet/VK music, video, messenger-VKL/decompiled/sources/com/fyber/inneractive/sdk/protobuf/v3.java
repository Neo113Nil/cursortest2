package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import sun.misc.Unsafe;

/* loaded from: classes12.dex */
public final class v3 extends w3 {
    public v3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            Class<?> cls = this.a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            x3.a(th);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if (r4.getType() == r2) goto L13;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        Field field;
        Class<?> cls = Long.TYPE;
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                Field field2 = null;
                if (d.a()) {
                    try {
                        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        field = null;
                    }
                }
                try {
                    field = Buffer.class.getDeclaredField(RTCStatsConstants.KEY_ADDRESS);
                } catch (Throwable unused2) {
                    field = null;
                }
                if (field != null) {
                }
                if (field2 != null) {
                    try {
                        Class<?> cls3 = this.a.getClass();
                        cls3.getMethod("getByte", cls);
                        cls3.getMethod("putByte", cls, Byte.TYPE);
                        cls3.getMethod("getInt", cls);
                        cls3.getMethod("putInt", cls, Integer.TYPE);
                        cls3.getMethod("getLong", cls);
                        cls3.getMethod("putLong", cls, cls);
                        cls3.getMethod("copyMemory", cls, cls, cls);
                        cls3.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                        return true;
                    } catch (Throwable th) {
                        x3.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                x3.a(th2);
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j) {
        return this.a.getByte(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j, byte[] bArr, long j2) {
        this.a.copyMemory((Object) null, j, bArr, x3.f, j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j) {
        return this.a.getByte(obj, j);
    }
}
