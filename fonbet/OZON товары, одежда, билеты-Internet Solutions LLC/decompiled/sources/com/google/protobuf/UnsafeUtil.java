package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class UnsafeUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f60181a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f60182b;

    /* renamed from: c, reason: collision with root package name */
    private static final b f60183c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f60184d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f60185e;

    /* renamed from: f, reason: collision with root package name */
    static final long f60186f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f60187g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f60188h;

    /* loaded from: classes9.dex */
    private static final class Android32MemoryAccessor extends b {
        private static final long SMALL_ADDRESS_MASK = -1;

        Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long j11) {
            return (int) j11;
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(long j11, byte[] bArr, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean getBoolean(Object obj, long j11) {
            return UnsafeUtil.f60188h ? UnsafeUtil.f(j11, obj) : UnsafeUtil.g(j11, obj);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(Object obj, long j11) {
            return UnsafeUtil.f60188h ? UnsafeUtil.b(j11, obj) : UnsafeUtil.c(j11, obj);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public double getDouble(Object obj, long j11) {
            return Double.longBitsToDouble(getLong(obj, j11));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public float getFloat(Object obj, long j11) {
            return Float.intBitsToFloat(getInt(obj, j11));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public int getInt(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public long getLong(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putBoolean(Object obj, long j11, boolean z11) {
            if (UnsafeUtil.f60188h) {
                UnsafeUtil.h(obj, j11, z11);
            } else {
                UnsafeUtil.i(obj, j11, z11);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(Object obj, long j11, byte b11) {
            if (UnsafeUtil.f60188h) {
                UnsafeUtil.G(obj, j11, b11);
            } else {
                UnsafeUtil.H(obj, j11, b11);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putDouble(Object obj, long j11, double d11) {
            putLong(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putFloat(Object obj, long j11, float f7) {
            putInt(obj, j11, Float.floatToIntBits(f7));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putInt(long j11, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putLong(long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(byte[] bArr, long j11, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(long j11, byte b11) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class Android64MemoryAccessor extends b {
        Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(long j11, byte[] bArr, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean getBoolean(Object obj, long j11) {
            return UnsafeUtil.f60188h ? UnsafeUtil.f(j11, obj) : UnsafeUtil.g(j11, obj);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(Object obj, long j11) {
            return UnsafeUtil.f60188h ? UnsafeUtil.b(j11, obj) : UnsafeUtil.c(j11, obj);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public double getDouble(Object obj, long j11) {
            return Double.longBitsToDouble(getLong(obj, j11));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public float getFloat(Object obj, long j11) {
            return Float.intBitsToFloat(getInt(obj, j11));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public int getInt(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public long getLong(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putBoolean(Object obj, long j11, boolean z11) {
            if (UnsafeUtil.f60188h) {
                UnsafeUtil.h(obj, j11, z11);
            } else {
                UnsafeUtil.i(obj, j11, z11);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(Object obj, long j11, byte b11) {
            if (UnsafeUtil.f60188h) {
                UnsafeUtil.G(obj, j11, b11);
            } else {
                UnsafeUtil.H(obj, j11, b11);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putDouble(Object obj, long j11, double d11) {
            putLong(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putFloat(Object obj, long j11, float f7) {
            putInt(obj, j11, Float.floatToIntBits(f7));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putInt(long j11, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putLong(long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(byte[] bArr, long j11, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(long j11, byte b11) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes9.dex */
    private static final class JvmMemoryAccessor extends b {
        JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(long j11, byte[] bArr, long j12, long j13) {
            this.unsafe.copyMemory((Object) null, j11, bArr, UnsafeUtil.f60186f + j12, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean getBoolean(Object obj, long j11) {
            return this.unsafe.getBoolean(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(Object obj, long j11) {
            return this.unsafe.getByte(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public double getDouble(Object obj, long j11) {
            return this.unsafe.getDouble(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public float getFloat(Object obj, long j11) {
            return this.unsafe.getFloat(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public int getInt(long j11) {
            return this.unsafe.getInt(j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public long getLong(long j11) {
            return this.unsafe.getLong(j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public Object getStaticObject(java.lang.reflect.Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putBoolean(Object obj, long j11, boolean z11) {
            this.unsafe.putBoolean(obj, j11, z11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(Object obj, long j11, byte b11) {
            this.unsafe.putByte(obj, j11, b11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putDouble(Object obj, long j11, double d11) {
            this.unsafe.putDouble(obj, j11, d11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putFloat(Object obj, long j11, float f7) {
            this.unsafe.putFloat(obj, j11, f7);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putInt(long j11, int i11) {
            this.unsafe.putInt(j11, i11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putLong(long j11, long j12) {
            this.unsafe.putLong(j11, j12);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
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
            } catch (Throwable th2) {
                UnsafeUtil.a(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.a(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void copyMemory(byte[] bArr, long j11, long j12, long j13) {
            this.unsafe.copyMemory(bArr, UnsafeUtil.f60186f + j11, (Object) null, j12, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public byte getByte(long j11) {
            return this.unsafe.getByte(j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.b
        public void putByte(long j11, byte b11) {
            this.unsafe.putByte(j11, b11);
        }
    }

    final class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    private static abstract class b {
        Unsafe unsafe;

        b(Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.unsafe.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.unsafe.arrayIndexScale(cls);
        }

        public abstract void copyMemory(long j11, byte[] bArr, long j12, long j13);

        public abstract void copyMemory(byte[] bArr, long j11, long j12, long j13);

        public abstract boolean getBoolean(Object obj, long j11);

        public abstract byte getByte(long j11);

        public abstract byte getByte(Object obj, long j11);

        public abstract double getDouble(Object obj, long j11);

        public abstract float getFloat(Object obj, long j11);

        public abstract int getInt(long j11);

        public final int getInt(Object obj, long j11) {
            return this.unsafe.getInt(obj, j11);
        }

        public abstract long getLong(long j11);

        public final long getLong(Object obj, long j11) {
            return this.unsafe.getLong(obj, j11);
        }

        public final Object getObject(Object obj, long j11) {
            return this.unsafe.getObject(obj, j11);
        }

        public abstract Object getStaticObject(java.lang.reflect.Field field);

        public final long objectFieldOffset(java.lang.reflect.Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j11, boolean z11);

        public abstract void putByte(long j11, byte b11);

        public abstract void putByte(Object obj, long j11, byte b11);

        public abstract void putDouble(Object obj, long j11, double d11);

        public abstract void putFloat(Object obj, long j11, float f7);

        public abstract void putInt(long j11, int i11);

        public final void putInt(Object obj, long j11, int i11) {
            this.unsafe.putInt(obj, j11, i11);
        }

        public abstract void putLong(long j11, long j12);

        public final void putLong(Object obj, long j11, long j12) {
            this.unsafe.putLong(obj, j11, j12);
        }

        public final void putObject(Object obj, long j11, Object obj2) {
            this.unsafe.putObject(obj, j11, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.a(th2);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            java.lang.reflect.Field field;
            java.lang.reflect.Field field2;
            Class<?> cls = Long.TYPE;
            Unsafe unsafe = this.unsafe;
            if (unsafe != null) {
                try {
                    Class<?> cls2 = unsafe.getClass();
                    cls2.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                    cls2.getMethod("getLong", Object.class, cls);
                    boolean z11 = UnsafeUtil.f60188h;
                    int i11 = C5950a.f60193b;
                    java.lang.reflect.Field field3 = null;
                    try {
                        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        field = null;
                    }
                    if (field != null) {
                        field3 = field;
                    } else {
                        try {
                            field2 = Buffer.class.getDeclaredField(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
                        } catch (Throwable unused2) {
                            field2 = null;
                        }
                        if (field2 != null) {
                            if (field2.getType() == cls) {
                                field3 = field2;
                            }
                        }
                    }
                    if (field3 != null) {
                        return true;
                    }
                } catch (Throwable th2) {
                    UnsafeUtil.a(th2);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(14:(1:39)(1:(1:41))|4|(1:6)(1:37)|7|(1:9)(1:36)|10|11|12|(1:14)(4:25|26|27|(1:31))|(1:24)(1:17)|18|(1:20)|21|22)|3|4|(0)(0)|7|(0)(0)|10|11|12|(0)(0)|(0)|24|18|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    static {
        b android32MemoryAccessor;
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        Unsafe z11 = z();
        f60181a = z11;
        f60182b = C5950a.a();
        Class<?> cls = Long.TYPE;
        boolean p11 = p(cls);
        boolean p12 = p(Integer.TYPE);
        java.lang.reflect.Field field3 = null;
        if (z11 != null) {
            if (p11) {
                android32MemoryAccessor = new Android64MemoryAccessor(z11);
            } else if (p12) {
                android32MemoryAccessor = new Android32MemoryAccessor(z11);
            }
            f60183c = android32MemoryAccessor;
            f60184d = android32MemoryAccessor != null ? false : android32MemoryAccessor.supportsUnsafeByteBufferOperations();
            f60185e = android32MemoryAccessor != null ? false : android32MemoryAccessor.supportsUnsafeArrayOperations();
            f60186f = l(byte[].class);
            l(boolean[].class);
            m(boolean[].class);
            l(int[].class);
            m(int[].class);
            l(long[].class);
            m(long[].class);
            l(float[].class);
            m(float[].class);
            l(double[].class);
            m(double[].class);
            l(Object[].class);
            m(Object[].class);
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field == null) {
                field3 = field;
            } else {
                try {
                    field2 = Buffer.class.getDeclaredField(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
                } catch (Throwable unused) {
                    field2 = null;
                }
                if (field2 != null && field2.getType() == cls) {
                    field3 = field2;
                }
            }
            f60187g = (field3 != null || android32MemoryAccessor == null) ? -1L : android32MemoryAccessor.objectFieldOffset(field3);
            f60188h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        android32MemoryAccessor = null;
        f60183c = android32MemoryAccessor;
        f60184d = android32MemoryAccessor != null ? false : android32MemoryAccessor.supportsUnsafeByteBufferOperations();
        f60185e = android32MemoryAccessor != null ? false : android32MemoryAccessor.supportsUnsafeArrayOperations();
        f60186f = l(byte[].class);
        l(boolean[].class);
        m(boolean[].class);
        l(int[].class);
        m(int[].class);
        l(long[].class);
        m(long[].class);
        l(float[].class);
        m(float[].class);
        l(double[].class);
        m(double[].class);
        l(Object[].class);
        m(Object[].class);
        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field == null) {
        }
        f60187g = (field3 != null || android32MemoryAccessor == null) ? -1L : android32MemoryAccessor.objectFieldOffset(field3);
        f60188h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private UnsafeUtil() {
    }

    static boolean A() {
        return f60185e;
    }

    static boolean B() {
        return f60184d;
    }

    static long C(java.lang.reflect.Field field) {
        return f60183c.objectFieldOffset(field);
    }

    static void D(Object obj, long j11, boolean z11) {
        f60183c.putBoolean(obj, j11, z11);
    }

    static void E(long j11, byte b11) {
        f60183c.putByte(j11, b11);
    }

    static void F(byte[] bArr, long j11, byte b11) {
        f60183c.putByte(bArr, f60186f + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = f60183c.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        K(obj, j12, ((255 & b11) << i12) | (i11 & (~(255 << i12))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        K(obj, j12, ((255 & b11) << i11) | (f60183c.getInt(obj, j12) & (~(255 << i11))));
    }

    static void I(Object obj, long j11, double d11) {
        f60183c.putDouble(obj, j11, d11);
    }

    static void J(Object obj, long j11, float f7) {
        f60183c.putFloat(obj, j11, f7);
    }

    static void K(Object obj, long j11, int i11) {
        f60183c.putInt(obj, j11, i11);
    }

    static void L(Object obj, long j11, long j12) {
        f60183c.putLong(obj, j11, j12);
    }

    static void M(Object obj, long j11, Object obj2) {
        f60183c.putObject(obj, j11, obj2);
    }

    static void a(Throwable th2) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static byte b(long j11, Object obj) {
        return (byte) ((f60183c.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    static byte c(long j11, Object obj) {
        return (byte) ((f60183c.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    static boolean f(long j11, Object obj) {
        return ((byte) ((f60183c.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    static boolean g(long j11, Object obj) {
        return ((byte) ((f60183c.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    static void h(Object obj, long j11, boolean z11) {
        G(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static void i(Object obj, long j11, boolean z11) {
        H(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static long j(ByteBuffer byteBuffer) {
        return f60183c.getLong(byteBuffer, f60187g);
    }

    static <T> T k(Class<T> cls) {
        try {
            return (T) f60181a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static int l(Class<?> cls) {
        if (f60185e) {
            return f60183c.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static void m(Class cls) {
        if (f60185e) {
            f60183c.arrayIndexScale(cls);
        }
    }

    static void n(long j11, byte[] bArr, long j12, long j13) {
        f60183c.copyMemory(j11, bArr, j12, j13);
    }

    static void o(byte[] bArr, long j11, long j12, long j13) {
        f60183c.copyMemory(bArr, j11, j12, j13);
    }

    static boolean p(Class<?> cls) {
        int i11 = C5950a.f60193b;
        try {
            Class<?> cls2 = f60182b;
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

    static boolean q(Object obj, long j11) {
        return f60183c.getBoolean(obj, j11);
    }

    static byte r(long j11) {
        return f60183c.getByte(j11);
    }

    static byte s(long j11, byte[] bArr) {
        return f60183c.getByte(bArr, f60186f + j11);
    }

    static double t(Object obj, long j11) {
        return f60183c.getDouble(obj, j11);
    }

    static float u(Object obj, long j11) {
        return f60183c.getFloat(obj, j11);
    }

    static int v(Object obj, long j11) {
        return f60183c.getInt(obj, j11);
    }

    static long w(long j11) {
        return f60183c.getLong(j11);
    }

    static long x(Object obj, long j11) {
        return f60183c.getLong(obj, j11);
    }

    static Object y(Object obj, long j11) {
        return f60183c.getObject(obj, j11);
    }

    static Unsafe z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }
}
