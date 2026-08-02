package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgin extends zzgik {
    private final Map zza;
    private final zzghg zzb;
    private final DisplayMetrics zzc;

    zzgin(zzaxf zzaxfVar, zzghg zzghgVar, Map map, DisplayMetrics displayMetrics, zzgpu zzgpuVar) {
        super("ksCcm9STSGSzSoV9tjhUqH1fQaul5xz2DaiecQSQ1K1N1HTiSrTD427/oPr8ccue", "zJpc2Ezdor+bAY6wK+g3rUu0yAue75LbxJGq3xWFA+U=", zzaxfVar, zzghgVar, zzgpuVar.zza(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        this.zzb = zzghgVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / displayMetrics.density);
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr = (Object[]) method.invoke("", motionEvent, displayMetrics);
        objArr.getClass();
        Object[] objArr2 = objArr;
        zzayb zza = zzayc.zza();
        Object obj = objArr2[0];
        if (obj != null && objArr2[1] != null) {
            zza.zza(((Long) obj).longValue());
            zza.zzb(((Long) objArr2[1]).longValue());
        }
        Object obj2 = objArr2[2];
        if (obj2 != null) {
            zza.zzh(((Long) obj2).longValue());
        }
        Object obj3 = objArr2[3];
        if (obj3 != null) {
            zza.zzf(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[4];
        if (obj4 != null) {
            zza.zzc(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[5];
        if (obj5 != null) {
            zza.zzs(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr2[6];
        if (obj6 != null) {
            zza.zzj(((Long) obj6).longValue());
        }
        Object obj7 = objArr2[7];
        if (obj7 != null) {
            zza.zzi(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[8];
        if (obj8 != null) {
            zza.zzt(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzaxfVar) {
            Method zzc = this.zzb.zzc("UE2ABGv5l/V3kKbCM/VgO5eQ1h3z+cPMOyCPI/dIsC43b4/cTZeQpl7GRL4h/vIk", "F3Gi1VclXFdiZroyLatwhPRyfihzegTPzd2DFW5Fd7E=");
            if (zzc == null) {
                throw null;
            }
            Method method2 = zzc;
            Object[] objArr3 = (Object[]) zzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
            if (objArr3 == null) {
                throw null;
            }
            Object[] objArr4 = objArr3;
            Object obj9 = objArr4[0];
            if (obj9 != null) {
                zzaxfVar.zzh(((Long) obj9).longValue());
            }
            Object obj10 = objArr4[1];
            if (obj10 != null) {
                zzaxfVar.zzi(((Long) obj10).longValue());
            }
            Object obj11 = objArr4[2];
            if (obj11 != null) {
                zzaxfVar.zzj(((Long) obj11).longValue());
            }
            Object obj12 = objArr4[3];
            if (obj12 != null) {
                zzaxfVar.zzv(((Long) obj12).longValue());
            }
            Object obj13 = objArr4[4];
            if (obj13 != null) {
                zzaxfVar.zzw(((Long) obj13).longValue());
            }
            zzgga zzggaVar = (zzgga) map.get("oe");
            if (zzggaVar != null) {
                long j = zzggaVar.zza;
                if (j > 0) {
                    zzaxfVar.zzz(j);
                }
                long j2 = zzggaVar.zzb;
                if (j2 > 0) {
                    zzaxfVar.zzy(j2);
                }
                long j3 = zzggaVar.zzc;
                if (j3 > 0) {
                    zzaxfVar.zzx(j3);
                }
                long j4 = zzggaVar.zzd;
                if (j4 > 0) {
                    zzaxfVar.zzA(j4);
                }
            }
            zzgga zzggaVar2 = (zzgga) map.get("oe");
            if (zzggaVar2 != null && zzggaVar2.zza != 0 && zzc(displayMetrics)) {
                double d = zzggaVar2.zze;
                if (displayMetrics == null) {
                    throw null;
                }
                DisplayMetrics displayMetrics2 = displayMetrics;
                zza.zzl(zzb(d, displayMetrics));
                zza.zzm(zzb(zzggaVar2.zzh - zzggaVar2.zzf, displayMetrics));
                zza.zzn(zzb(zzggaVar2.zzi - zzggaVar2.zzg, displayMetrics));
                zza.zzq(zzb(zzggaVar2.zzf, displayMetrics));
                zza.zzr(zzb(zzggaVar2.zzg, displayMetrics));
                if (((MotionEvent) map.get("nv")) != null) {
                    long zzb = zzb(((zzggaVar2.zzf - zzggaVar2.zzh) + r4.getRawX()) - r4.getX(), displayMetrics);
                    if (zzb != 0) {
                        zza.zzo(zzb);
                    }
                    long zzb2 = zzb(((zzggaVar2.zzg - zzggaVar2.zzi) + r4.getRawY()) - r4.getY(), displayMetrics);
                    if (zzb2 != 0) {
                        zza.zzp(zzb2);
                    }
                }
            }
            zzaxfVar.zzJ(zza);
            zzggb[] zzggbVarArr = (zzggb[]) map.get("ro");
            if (zzggbVarArr != null && zzc(displayMetrics)) {
                for (int i = 0; i <= zzggbVarArr.length - 2; i++) {
                    zzggb zzggbVar = zzggbVarArr[i];
                    zzayb zza2 = zzayc.zza();
                    double d2 = zzggbVar.zza;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    DisplayMetrics displayMetrics3 = displayMetrics;
                    zza2.zza(zzb(d2, displayMetrics));
                    zza2.zzb(zzb(zzggbVar.zzb, displayMetrics));
                    zzaxfVar.zzK((zzayc) zza2.zzbu());
                }
            }
        }
    }
}
