package com.google.android.gms.internal.mlkit_common;

import com.ironsource.O6;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
final class zzo {
    private static final Method zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Field zzd;
    private static final Field zze;
    private static final Field zzf;
    private static final Object zzg;
    private static final Throwable zzh;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    static {
        Field field;
        Method method;
        Method method2;
        Method method3;
        ?? r7;
        Field field2;
        Throwable th;
        Object obj;
        try {
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls3 = Class.forName("libcore.io.OsConstants");
            Class<?> cls4 = Class.forName("libcore.io.ForwardingOs");
            method = cls3.getDeclaredMethod("S_ISLNK", Integer.TYPE);
            try {
                method.setAccessible(true);
                method3 = cls4.getDeclaredMethod("lstat", String.class);
                try {
                    method2 = cls4.getDeclaredMethod("fstat", FileDescriptor.class);
                } catch (Throwable th2) {
                    th = th2;
                    field = null;
                    method2 = null;
                    r7 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
                field = null;
                method2 = null;
                method3 = method2;
                r7 = method3;
                field2 = r7;
                th = th;
                obj = field2;
                zza = method;
                zzb = method3;
                zzc = method2;
                zzd = r7;
                zze = field2;
                zzf = field;
                zzg = obj;
                zzh = th;
            }
            try {
                Field declaredField = cls.getDeclaredField(O6.F);
                declaredField.setAccessible(true);
                obj = declaredField.get(cls);
                try {
                    r7 = cls2.getField("st_dev");
                    try {
                        field2 = cls2.getField("st_ino");
                        try {
                            field = cls2.getField("st_mode");
                            try {
                                r7.setAccessible(true);
                                field2.setAccessible(true);
                                field.setAccessible(true);
                                zza = method;
                                zzb = method3;
                                zzc = method2;
                                zzd = r7;
                                zze = field2;
                                zzf = field;
                                zzg = obj;
                                zzh = null;
                            } catch (Throwable th4) {
                                th = th4;
                                zza = method;
                                zzb = method3;
                                zzc = method2;
                                zzd = r7;
                                zze = field2;
                                zzf = field;
                                zzg = obj;
                                zzh = th;
                            }
                        } catch (Throwable th5) {
                            field = null;
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        field2 = null;
                        r7 = r7;
                        th = th;
                        field = field2;
                        zza = method;
                        zzb = method3;
                        zzc = method2;
                        zzd = r7;
                        zze = field2;
                        zzf = field;
                        zzg = obj;
                        zzh = th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r7 = 0;
                    field2 = null;
                }
            } catch (Throwable th8) {
                th = th8;
                field = null;
                r7 = 0;
                field2 = r7;
                th = th;
                obj = field2;
                zza = method;
                zzb = method3;
                zzc = method2;
                zzd = r7;
                zze = field2;
                zzf = field;
                zzg = obj;
                zzh = th;
            }
        } catch (Throwable th9) {
            th = th9;
            field = null;
            method = null;
            method2 = null;
        }
    }

    public static zzq zza(final FileDescriptor fileDescriptor) throws IOException {
        return (zzq) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzq zze2;
                zze2 = zzo.zze(zzo.zzc.invoke(zzo.zzg, fileDescriptor));
                return zze2;
            }
        });
    }

    public static zzq zzd(final String str) throws IOException {
        return (zzq) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzq zze2;
                zze2 = zzo.zze(zzo.zzb.invoke(zzo.zzg, str));
                return zze2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzq zze(Object obj) throws Exception {
        long longValue = ((Long) zzd.get(obj)).longValue();
        long longValue2 = ((Long) zze.get(obj)).longValue();
        Integer num = (Integer) zzf.get(obj);
        num.intValue();
        return new zzq(longValue, longValue2, ((Boolean) zza.invoke(null, num)).booleanValue());
    }

    private static Object zzf(Callable callable) throws IOException {
        try {
            Throwable th = zzh;
            if (th == null) {
                return callable.call();
            }
            throw new IOException(th);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
