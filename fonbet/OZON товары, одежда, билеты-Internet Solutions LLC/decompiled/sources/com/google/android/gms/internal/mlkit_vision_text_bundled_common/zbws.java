package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
final class zbws {
    static final long zba;
    static final boolean zbb;
    private static final Unsafe zbc;
    private static final Class zbd;
    private static final boolean zbe;
    private static final zbwr zbf;
    private static final boolean zbg;
    private static final boolean zbh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z11;
        zbwr zbwrVar;
        boolean z12;
        Field zbB;
        zbwr zbwrVar2;
        Unsafe zbg2 = zbg();
        zbc = zbg2;
        int i11 = zbsm.zba;
        zbd = Memory.class;
        Class cls = Long.TYPE;
        boolean zbv = zbv(cls);
        zbe = zbv;
        Class cls2 = Integer.TYPE;
        boolean zbv2 = zbv(cls2);
        zbwr zbwrVar3 = null;
        if (zbg2 != null) {
            if (zbv) {
                zbwrVar3 = new zbwq(zbg2);
            } else if (zbv2) {
                zbwrVar3 = new zbwp(zbg2);
            }
        }
        zbf = zbwrVar3;
        if (zbwrVar3 != null) {
            try {
                Class<?> cls3 = zbwrVar3.zba.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th2) {
                zbh(th2);
            }
            if (zbB() != null) {
                z11 = true;
                zbg = z11;
                zbwrVar = zbf;
                if (zbwrVar != null) {
                    try {
                        Class<?> cls4 = zbwrVar.zba.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z12 = true;
                    } catch (Throwable th3) {
                        zbh(th3);
                    }
                    zbh = z12;
                    zba = zbz(byte[].class);
                    zbz(boolean[].class);
                    zbA(boolean[].class);
                    zbz(int[].class);
                    zbA(int[].class);
                    zbz(long[].class);
                    zbA(long[].class);
                    zbz(float[].class);
                    zbA(float[].class);
                    zbz(double[].class);
                    zbA(double[].class);
                    zbz(Object[].class);
                    zbA(Object[].class);
                    zbB = zbB();
                    if (zbB != null && (zbwrVar2 = zbf) != null) {
                        zbwrVar2.zba.objectFieldOffset(zbB);
                    }
                    zbb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z12 = false;
                zbh = z12;
                zba = zbz(byte[].class);
                zbz(boolean[].class);
                zbA(boolean[].class);
                zbz(int[].class);
                zbA(int[].class);
                zbz(long[].class);
                zbA(long[].class);
                zbz(float[].class);
                zbA(float[].class);
                zbz(double[].class);
                zbA(double[].class);
                zbz(Object[].class);
                zbA(Object[].class);
                zbB = zbB();
                if (zbB != null) {
                    zbwrVar2.zba.objectFieldOffset(zbB);
                }
                zbb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z11 = false;
        zbg = z11;
        zbwrVar = zbf;
        if (zbwrVar != null) {
        }
        z12 = false;
        zbh = z12;
        zba = zbz(byte[].class);
        zbz(boolean[].class);
        zbA(boolean[].class);
        zbz(int[].class);
        zbA(int[].class);
        zbz(long[].class);
        zbA(long[].class);
        zbz(float[].class);
        zbA(float[].class);
        zbz(double[].class);
        zbA(double[].class);
        zbz(Object[].class);
        zbA(Object[].class);
        zbB = zbB();
        if (zbB != null) {
        }
        zbb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zbws() {
    }

    private static int zbA(Class cls) {
        if (zbh) {
            return zbf.zba.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zbB() {
        int i11 = zbsm.zba;
        Field zbC = zbC(Buffer.class, "effectiveDirectAddress");
        if (zbC != null) {
            return zbC;
        }
        Field zbC2 = zbC(Buffer.class, FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        if (zbC2 == null || zbC2.getType() != Long.TYPE) {
            return null;
        }
        return zbC2;
    }

    private static Field zbC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zbD(Object obj, long j11, byte b11) {
        zbwr zbwrVar = zbf;
        long j12 = (-4) & j11;
        int i11 = zbwrVar.zba.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        zbwrVar.zba.putInt(obj, j12, ((255 & b11) << i12) | (i11 & (~(255 << i12))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zbE(Object obj, long j11, byte b11) {
        zbwr zbwrVar = zbf;
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        zbwrVar.zba.putInt(obj, j12, ((255 & b11) << i11) | (zbwrVar.zba.getInt(obj, j12) & (~(255 << i11))));
    }

    static double zba(Object obj, long j11) {
        return zbf.zba(obj, j11);
    }

    static float zbb(Object obj, long j11) {
        return zbf.zbb(obj, j11);
    }

    static int zbc(Object obj, long j11) {
        return zbf.zba.getInt(obj, j11);
    }

    static long zbd(Object obj, long j11) {
        return zbf.zba.getLong(obj, j11);
    }

    static Object zbe(Class cls) {
        try {
            return zbc.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    static Object zbf(Object obj, long j11) {
        return zbf.zba.getObject(obj, j11);
    }

    static Unsafe zbg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zbwo());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zbh(Throwable th2) {
        Logger.getLogger(zbws.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static void zbm(Object obj, long j11, boolean z11) {
        zbf.zbc(obj, j11, z11);
    }

    static void zbn(byte[] bArr, long j11, byte b11) {
        zbf.zbd(bArr, zba + j11, b11);
    }

    static void zbo(Object obj, long j11, double d11) {
        zbf.zbe(obj, j11, d11);
    }

    static void zbp(Object obj, long j11, float f7) {
        zbf.zbf(obj, j11, f7);
    }

    static void zbq(Object obj, long j11, int i11) {
        zbf.zba.putInt(obj, j11, i11);
    }

    static void zbr(Object obj, long j11, long j12) {
        zbf.zba.putLong(obj, j11, j12);
    }

    static void zbs(Object obj, long j11, Object obj2) {
        zbf.zba.putObject(obj, j11, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zbt(Object obj, long j11) {
        return ((byte) ((zbf.zba.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zbu(Object obj, long j11) {
        return ((byte) ((zbf.zba.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    static boolean zbv(Class cls) {
        int i11 = zbsm.zba;
        try {
            Class cls2 = zbd;
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

    static boolean zbw(Object obj, long j11) {
        return zbf.zbg(obj, j11);
    }

    static boolean zbx() {
        return zbh;
    }

    static boolean zby() {
        return zbg;
    }

    private static int zbz(Class cls) {
        if (zbh) {
            return zbf.zba.arrayBaseOffset(cls);
        }
        return -1;
    }
}
