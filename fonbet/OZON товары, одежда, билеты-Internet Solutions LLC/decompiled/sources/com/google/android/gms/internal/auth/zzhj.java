package com.google.android.gms.internal.auth;

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
        boolean z11;
        zzhi zzhiVar;
        boolean z12;
        Field zzy;
        zzhi zzhiVar2;
        Unsafe zzg2 = zzg();
        zzb = zzg2;
        int i11 = zzds.zza;
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
                z11 = true;
                zzf = z11;
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
                        z12 = true;
                    } catch (Throwable th3) {
                        zzh(th3);
                    }
                    zzg = z12;
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
                z12 = false;
                zzg = z12;
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
        z11 = false;
        zzf = z11;
        zzhiVar = zze;
        if (zzhiVar != null) {
        }
        z12 = false;
        zzg = z12;
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

    static double zza(Object obj, long j11) {
        return zze.zza(obj, j11);
    }

    static float zzb(Object obj, long j11) {
        return zze.zzb(obj, j11);
    }

    static int zzc(Object obj, long j11) {
        return zze.zza.getInt(obj, j11);
    }

    static long zzd(Object obj, long j11) {
        return zze.zza.getLong(obj, j11);
    }

    static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    static Object zzf(Object obj, long j11) {
        return zze.zza.getObject(obj, j11);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th2) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static /* synthetic */ void zzi(Object obj, long j11, boolean z11) {
        zzhi zzhiVar = zze;
        long j12 = (-4) & j11;
        int i11 = zzhiVar.zza.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        zzhiVar.zza.putInt(obj, j12, ((z11 ? 1 : 0) << i12) | ((~(255 << i12)) & i11));
    }

    static /* synthetic */ void zzj(Object obj, long j11, boolean z11) {
        zzhi zzhiVar = zze;
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        zzhiVar.zza.putInt(obj, j12, ((z11 ? 1 : 0) << i11) | ((~(255 << i11)) & zzhiVar.zza.getInt(obj, j12)));
    }

    static void zzk(Object obj, long j11, boolean z11) {
        zze.zzc(obj, j11, z11);
    }

    static void zzl(Object obj, long j11, double d11) {
        zze.zzd(obj, j11, d11);
    }

    static void zzm(Object obj, long j11, float f7) {
        zze.zze(obj, j11, f7);
    }

    static void zzn(Object obj, long j11, int i11) {
        zze.zza.putInt(obj, j11, i11);
    }

    static void zzo(Object obj, long j11, long j12) {
        zze.zza.putLong(obj, j11, j12);
    }

    static void zzp(Object obj, long j11, Object obj2) {
        zze.zza.putObject(obj, j11, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j11) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j11) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzs(Class cls) {
        int i11 = zzds.zza;
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

    static boolean zzt(Object obj, long j11) {
        return zze.zzf(obj, j11);
    }

    static boolean zzu() {
        return zzg;
    }

    static boolean zzv() {
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
        int i11 = zzds.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz != null) {
            return zzz;
        }
        Field zzz2 = zzz(Buffer.class, FormPageDTO.Field.FIELD_TYPE_ADDRESS);
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
