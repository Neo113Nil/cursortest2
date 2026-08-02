package com.google.android.gms.internal.gtm;

import C.o0;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
final class zzxy {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class<?> zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzxx zzg;
    private static final boolean zzh;
    private static final boolean zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011c  */
    static {
        Unsafe unsafe;
        boolean z11;
        zzxx zzxxVar;
        Unsafe unsafe2;
        boolean z12;
        Field zzB;
        zzxx zzxxVar2;
        Unsafe zzg2 = zzg();
        zzc = zzg2;
        zzd = zzsk.zza();
        Class cls = Long.TYPE;
        boolean zzv = zzv(cls);
        zze = zzv;
        Class cls2 = Integer.TYPE;
        boolean zzv2 = zzv(cls2);
        zzf = zzv2;
        zzxx zzxxVar3 = null;
        if (zzg2 != null) {
            if (zzv) {
                zzxxVar3 = new zzxw(zzg2);
            } else if (zzv2) {
                zzxxVar3 = new zzxv(zzg2);
            }
        }
        zzg = zzxxVar3;
        if (zzxxVar3 != null && (unsafe = zzxxVar3.zza) != null) {
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th2) {
                zzh(th2);
            }
            if (zzB() != null) {
                z11 = true;
                zzh = z11;
                zzxxVar = zzg;
                if (zzxxVar != null && (unsafe2 = zzxxVar.zza) != null) {
                    try {
                        Class<?> cls4 = unsafe2.getClass();
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
                        zzh(th3);
                    }
                    zzi = z12;
                    zza = zzz(byte[].class);
                    zzz(boolean[].class);
                    zzA(boolean[].class);
                    zzz(int[].class);
                    zzA(int[].class);
                    zzz(long[].class);
                    zzA(long[].class);
                    zzz(float[].class);
                    zzA(float[].class);
                    zzz(double[].class);
                    zzA(double[].class);
                    zzz(Object[].class);
                    zzA(Object[].class);
                    zzB = zzB();
                    if (zzB != null && (zzxxVar2 = zzg) != null) {
                        zzxxVar2.zzl(zzB);
                    }
                    zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z12 = false;
                zzi = z12;
                zza = zzz(byte[].class);
                zzz(boolean[].class);
                zzA(boolean[].class);
                zzz(int[].class);
                zzA(int[].class);
                zzz(long[].class);
                zzA(long[].class);
                zzz(float[].class);
                zzA(float[].class);
                zzz(double[].class);
                zzA(double[].class);
                zzz(Object[].class);
                zzA(Object[].class);
                zzB = zzB();
                if (zzB != null) {
                    zzxxVar2.zzl(zzB);
                }
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z11 = false;
        zzh = z11;
        zzxxVar = zzg;
        if (zzxxVar != null) {
            Class<?> cls42 = unsafe2.getClass();
            cls42.getMethod("objectFieldOffset", Field.class);
            cls42.getMethod("arrayBaseOffset", Class.class);
            cls42.getMethod("arrayIndexScale", Class.class);
            cls42.getMethod("getInt", Object.class, cls);
            cls42.getMethod("putInt", Object.class, cls, cls2);
            cls42.getMethod("getLong", Object.class, cls);
            cls42.getMethod("putLong", Object.class, cls, cls);
            cls42.getMethod("getObject", Object.class, cls);
            cls42.getMethod("putObject", Object.class, cls, Object.class);
            z12 = true;
            zzi = z12;
            zza = zzz(byte[].class);
            zzz(boolean[].class);
            zzA(boolean[].class);
            zzz(int[].class);
            zzA(int[].class);
            zzz(long[].class);
            zzA(long[].class);
            zzz(float[].class);
            zzA(float[].class);
            zzz(double[].class);
            zzA(double[].class);
            zzz(Object[].class);
            zzA(Object[].class);
            zzB = zzB();
            if (zzB != null) {
            }
            zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        z12 = false;
        zzi = z12;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        zzB = zzB();
        if (zzB != null) {
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzxy() {
    }

    private static int zzA(Class<?> cls) {
        if (zzi) {
            return zzg.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i11 = zzsk.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        zzxx zzxxVar = zzg;
        int zzj = zzxxVar.zzj(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        zzxxVar.zzn(obj, j12, ((255 & b11) << i11) | (zzj & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        zzxx zzxxVar = zzg;
        int i11 = (((int) j11) & 3) << 3;
        zzxxVar.zzn(obj, j12, ((255 & b11) << i11) | (zzxxVar.zzj(obj, j12) & (~(255 << i11))));
    }

    static double zza(Object obj, long j11) {
        return zzg.zza(obj, j11);
    }

    static float zzb(Object obj, long j11) {
        return zzg.zzb(obj, j11);
    }

    static int zzc(Object obj, long j11) {
        return zzg.zzj(obj, j11);
    }

    static long zzd(Object obj, long j11) {
        return zzg.zzk(obj, j11);
    }

    static <T> T zze(Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    static Object zzf(Object obj, long j11) {
        return zzg.zzm(obj, j11);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzxu());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th2) {
        Logger logger = Logger.getLogger(zzxy.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th2);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", o0.c(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    static void zzm(Object obj, long j11, boolean z11) {
        zzg.zzc(obj, j11, z11);
    }

    static void zzn(byte[] bArr, long j11, byte b11) {
        zzg.zzd(bArr, zza + j11, b11);
    }

    static void zzo(Object obj, long j11, double d11) {
        zzg.zze(obj, j11, d11);
    }

    static void zzp(Object obj, long j11, float f7) {
        zzg.zzf(obj, j11, f7);
    }

    static void zzq(Object obj, long j11, int i11) {
        zzg.zzn(obj, j11, i11);
    }

    static void zzr(Object obj, long j11, long j12) {
        zzg.zzo(obj, j11, j12);
    }

    static void zzs(Object obj, long j11, Object obj2) {
        zzg.zzp(obj, j11, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j11) {
        return ((byte) ((zzg.zzj(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j11) {
        return ((byte) ((zzg.zzj(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzv(Class<?> cls) {
        int i11 = zzsk.zza;
        try {
            Class<?> cls2 = zzd;
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

    static boolean zzw(Object obj, long j11) {
        return zzg.zzg(obj, j11);
    }

    static boolean zzx() {
        return zzi;
    }

    static boolean zzy() {
        return zzh;
    }

    private static int zzz(Class<?> cls) {
        if (zzi) {
            return zzg.zzh(cls);
        }
        return -1;
    }
}
