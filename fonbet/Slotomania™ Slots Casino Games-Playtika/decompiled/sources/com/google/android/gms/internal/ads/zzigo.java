package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzigo {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzign zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    static {
        boolean z;
        zzign zzignVar;
        boolean z2;
        Field zzD;
        long j;
        zzign zzignVar2;
        Unsafe zzs = zzs();
        zzc = zzs;
        int i = zzica.zza;
        zzd = Memory.class;
        boolean zzt = zzt(Long.TYPE);
        zze = zzt;
        boolean zzt2 = zzt(Integer.TYPE);
        zzign zzignVar3 = null;
        if (zzs != null) {
            if (zzt) {
                zzignVar3 = new zzigm(zzs);
            } else if (zzt2) {
                zzignVar3 = new zzigl(zzs);
            }
        }
        zzf = zzignVar3;
        if (zzignVar3 != null) {
            try {
                Class<?> cls = zzignVar3.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
            } catch (Throwable th) {
                zzA(th);
            }
            if (zzD() != null) {
                z = true;
                zzg = z;
                zzignVar = zzf;
                if (zzignVar != null) {
                    try {
                        Class<?> cls2 = zzignVar.zza.getClass();
                        cls2.getMethod("objectFieldOffset", Field.class);
                        cls2.getMethod("arrayBaseOffset", Class.class);
                        cls2.getMethod("arrayIndexScale", Class.class);
                        cls2.getMethod("getInt", Object.class, Long.TYPE);
                        cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                        cls2.getMethod("getLong", Object.class, Long.TYPE);
                        cls2.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                        cls2.getMethod("getObject", Object.class, Long.TYPE);
                        cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        zzA(th2);
                    }
                    zzh = z2;
                    zza = zzB(byte[].class);
                    zzB(boolean[].class);
                    zzC(boolean[].class);
                    zzB(int[].class);
                    zzC(int[].class);
                    zzB(long[].class);
                    zzC(long[].class);
                    zzB(float[].class);
                    zzC(float[].class);
                    zzB(double[].class);
                    zzC(double[].class);
                    zzB(Object[].class);
                    zzC(Object[].class);
                    zzD = zzD();
                    j = -1;
                    if (zzD != null && (zzignVar2 = zzf) != null) {
                        j = zzignVar2.zza.objectFieldOffset(zzD);
                    }
                    zzi = j;
                    zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                zzh = z2;
                zza = zzB(byte[].class);
                zzB(boolean[].class);
                zzC(boolean[].class);
                zzB(int[].class);
                zzC(int[].class);
                zzB(long[].class);
                zzC(long[].class);
                zzB(float[].class);
                zzC(float[].class);
                zzB(double[].class);
                zzC(double[].class);
                zzB(Object[].class);
                zzC(Object[].class);
                zzD = zzD();
                j = -1;
                if (zzD != null) {
                    j = zzignVar2.zza.objectFieldOffset(zzD);
                }
                zzi = j;
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        zzg = z;
        zzignVar = zzf;
        if (zzignVar != null) {
        }
        z2 = false;
        zzh = z2;
        zza = zzB(byte[].class);
        zzB(boolean[].class);
        zzC(boolean[].class);
        zzB(int[].class);
        zzC(int[].class);
        zzB(long[].class);
        zzC(long[].class);
        zzB(float[].class);
        zzC(float[].class);
        zzB(double[].class);
        zzC(double[].class);
        zzB(Object[].class);
        zzC(Object[].class);
        zzD = zzD();
        j = -1;
        if (zzD != null) {
        }
        zzi = j;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzigo() {
    }

    static /* synthetic */ void zzA(Throwable th) {
        Logger.getLogger(zzigo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzB(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzD() {
        int i = zzica.zza;
        Field zzE = zzE(Buffer.class, "effectiveDirectAddress");
        if (zzE != null) {
            return zzE;
        }
        Field zzE2 = zzE(Buffer.class, "address");
        if (zzE2 == null || zzE2.getType() != Long.TYPE) {
            return null;
        }
        return zzE2;
    }

    private static Field zzE(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzF(Object obj, long j, byte b) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j, byte b) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    static boolean zza() {
        return zzh;
    }

    static boolean zzb() {
        return zzg;
    }

    static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static int zzd(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static void zze(Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static long zzf(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static void zzg(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static boolean zzh(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static void zzi(Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static float zzj(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    static void zzk(Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    static double zzl(Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    static void zzm(Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    static Object zzn(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static void zzo(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static void zzp(byte[] bArr, long j, byte b) {
        zzf.zza(bArr, zza + j, b);
    }

    static byte zzq(long j) {
        return zzf.zzh(j);
    }

    static long zzr(ByteBuffer byteBuffer) {
        zzign zzignVar = zzf;
        return zzignVar.zza.getLong(byteBuffer, zzi);
    }

    static Unsafe zzs() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzigk());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zzigo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzt(Class cls) {
        int i = zzica.zza;
        try {
            Class cls2 = zzd;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ boolean zzw(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
