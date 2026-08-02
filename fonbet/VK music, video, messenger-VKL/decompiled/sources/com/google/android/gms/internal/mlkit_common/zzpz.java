package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import com.google.mlkit.common.sdkinternal.ModelType;
import xsna.f3u;
import xsna.oaj0;
import xsna.pvf0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
public final class zzpz {
    private static final f3u zza = new f3u("RemoteModelUtils", "");

    public static zzlk zza(pvf0 pvf0Var, oaj0 oaj0Var, zzpp zzppVar) {
        long j;
        ModelType zzb = zzppVar.zzb();
        pvf0Var.getClass();
        zzlq zzlqVar = new zzlq();
        zzll zzllVar = new zzll();
        zzllVar.zzc((String) pvf0.a.get(null));
        zzllVar.zzd(zzln.CLOUD);
        zzllVar.zza(zzag.zzb(null));
        int ordinal = zzb.ordinal();
        zzllVar.zzb(ordinal != 2 ? ordinal != 4 ? ordinal != 5 ? zzlm.TYPE_UNKNOWN : zzlm.BASE_DIGITAL_INK : zzlm.CUSTOM : zzlm.BASE_TRANSLATE);
        zzlqVar.zzb(zzllVar.zzg());
        zzlt zzc = zzlqVar.zzc();
        zzlh zzlhVar = new zzlh();
        zzlhVar.zzd(zzppVar.zzc());
        zzlhVar.zzc(zzppVar.zzd());
        zzlhVar.zzb(Long.valueOf(zzppVar.zza()));
        zzlhVar.zzf(zzc);
        if (zzppVar.zzg()) {
            long b = oaj0Var.b();
            if (b == 0) {
                zza.a("Model downloaded without its beginning time recorded.");
            } else {
                synchronized (oaj0Var) {
                    j = oaj0Var.c().getLong("model_first_use_time_" + pvf0.a(), 0L);
                }
                if (j == 0) {
                    j = SystemClock.elapsedRealtime();
                    synchronized (oaj0Var) {
                        oaj0Var.c().edit().putLong("model_first_use_time_" + pvf0.a(), j).apply();
                    }
                }
                zzlhVar.zzg(Long.valueOf(j - b));
            }
        }
        if (zzppVar.zzf()) {
            long b2 = oaj0Var.b();
            if (b2 == 0) {
                zza.a("Model downloaded without its beginning time recorded.");
            } else {
                zzlhVar.zze(Long.valueOf(SystemClock.elapsedRealtime() - b2));
            }
        }
        return zzlhVar.zzi();
    }
}
