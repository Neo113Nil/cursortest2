package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.e;

/* loaded from: classes.dex */
final class zzhm implements zzhj {
    private static zzhm zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhm() {
        this.zzb = null;
        this.zzc = null;
    }

    static zzhm zza(Context context) {
        zzhm zzhmVar;
        synchronized (zzhm.class) {
            try {
                if (zza == null) {
                    zza = e.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhm(context) : new zzhm();
                }
                zzhmVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhmVar;
    }

    static synchronized void zze() {
        Context context;
        synchronized (zzhm.class) {
            try {
                zzhm zzhmVar = zza;
                if (zzhmVar != null && (context = zzhmVar.zzb) != null && zzhmVar.zzc != null) {
                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                }
                zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzhh.zza(new zzhi() { // from class: com.google.android.gms.internal.measurement.zzhk
                @Override // com.google.android.gms.internal.measurement.zzhi
                public final Object zza() {
                    return zzhm.this.zzd(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e11) {
            Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e11);
            return null;
        }
    }

    final /* synthetic */ String zzd(String str) {
        return zzgz.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzhm(Context context) {
        this.zzb = context;
        zzhl zzhlVar = new zzhl(this, null);
        this.zzc = zzhlVar;
        context.getContentResolver().registerContentObserver(zzgz.zza, true, zzhlVar);
    }
}
