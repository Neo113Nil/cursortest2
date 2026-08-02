package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzhj {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhi zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z10;
        zzhi zzhiVar;
        boolean z11;
        Field zzy;
        zzhi zzhiVar2;
        Unsafe zzg2 = zzg();
        zzb = zzg2;
        int i10 = zzds.zza;
        zzc = Memory.class;
        Class cls = Long.TYPE;
        boolean zzs = zzs(cls);
        zzd = zzs;
        Class cls2 = Integer.TYPE;
        boolean zzs2 = zzs(cls2);
        zzhi zzhiVar3 = null;
        if (zzg2 != null) {
            if (zzs) {
                zzhiVar3 = new zzhh(zzg2);
            } else if (zzs2) {
                zzhiVar3 = new zzhg(zzg2);
            }
        }
        zze = zzhiVar3;
        if (zzhiVar3 != null) {
            try {
                Class<?> cls3 = zzhiVar3.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th2) {
                zzh(th2);
            }
            if (zzy() != null) {
                z10 = true;
                zzf = z10;
                zzhiVar = zze;
                if (zzhiVar != null) {
                    try {
                        Class<?> cls4 = zzhiVar.zza.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z11 = true;
                    } catch (Throwable th3) {
                        zzh(th3);
                    }
                    zzg = z11;
                    zzw(byte[].class);
                    zzw(boolean[].class);
                    zzx(boolean[].class);
                    zzw(int[].class);
                    zzx(int[].class);
                    zzw(long[].class);
                    zzx(long[].class);
                    zzw(float[].class);
                    zzx(float[].class);
                    zzw(double[].class);
                    zzx(double[].class);
                    zzw(Object[].class);
                    zzx(Object[].class);
                    zzy = zzy();
                    if (zzy != null && (zzhiVar2 = zze) != null) {
                        zzhiVar2.zza.objectFieldOffset(zzy);
                    }
                    zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z11 = false;
                zzg = z11;
                zzw(byte[].class);
                zzw(boolean[].class);
                zzx(boolean[].class);
                zzw(int[].class);
                zzx(int[].class);
                zzw(long[].class);
                zzx(long[].class);
                zzw(float[].class);
                zzx(float[].class);
                zzw(double[].class);
                zzx(double[].class);
                zzw(Object[].class);
                zzx(Object[].class);
                zzy = zzy();
                if (zzy != null) {
                    zzhiVar2.zza.objectFieldOffset(zzy);
                }
                zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z10 = false;
        zzf = z10;
        zzhiVar = zze;
        if (zzhiVar != null) {
        }
        z11 = false;
        zzg = z11;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        zzy = zzy();
        if (zzy != null) {
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhj() {
    }

    public static double zza(Object obj, long j10) {
        return zze.zza(obj, j10);
    }

    public static float zzb(Object obj, long j10) {
        return zze.zzb(obj, j10);
    }

    public static int zzc(Object obj, long j10) {
        return zze.zza.getInt(obj, j10);
    }

    public static long zzd(Object obj, long j10) {
        return zze.zza.getLong(obj, j10);
    }

    public static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object zzf(Object obj, long j10) {
        return zze.zza.getObject(obj, j10);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th2) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static /* synthetic */ void zzi(Object obj, long j10, boolean z10) {
        zzhi zzhiVar = zze;
        long j11 = (-4) & j10;
        int i10 = zzhiVar.zza.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        zzhiVar.zza.putInt(obj, j11, ((z10 ? 1 : 0) << i11) | ((~(255 << i11)) & i10));
    }

    public static /* synthetic */ void zzj(Object obj, long j10, boolean z10) {
        zzhi zzhiVar = zze;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        zzhiVar.zza.putInt(obj, j11, ((z10 ? 1 : 0) << i10) | ((~(255 << i10)) & zzhiVar.zza.getInt(obj, j11)));
    }

    public static void zzk(Object obj, long j10, boolean z10) {
        zze.zzc(obj, j10, z10);
    }

    public static void zzl(Object obj, long j10, double d10) {
        zze.zzd(obj, j10, d10);
    }

    public static void zzm(Object obj, long j10, float f10) {
        zze.zze(obj, j10, f10);
    }

    public static void zzn(Object obj, long j10, int i10) {
        zze.zza.putInt(obj, j10, i10);
    }

    public static void zzo(Object obj, long j10, long j11) {
        zze.zza.putLong(obj, j10, j11);
    }

    public static void zzp(Object obj, long j10, Object obj2) {
        zze.zza.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j10) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j10) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzs(Class cls) {
        int i10 = zzds.zza;
        try {
            Class cls2 = zzc;
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

    public static boolean zzt(Object obj, long j10) {
        return zze.zzf(obj, j10);
    }

    public static boolean zzu() {
        return zzg;
    }

    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i10 = zzds.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz != null) {
            return zzz;
        }
        Field zzz2 = zzz(Buffer.class, "address");
        if (zzz2 == null || zzz2.getType() != Long.TYPE) {
            return null;
        }
        return zzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
