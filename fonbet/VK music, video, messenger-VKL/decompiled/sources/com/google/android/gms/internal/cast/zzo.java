package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzo {
    public String zzb;

    @Nullable
    public String zzc;
    public String zzf;
    public int zzg;
    public boolean zzo;
    public int zzp;
    private final zzax zzr;
    private static final o100 zzq = new o100("ApplicationAnalyticsSession", null);
    public static long zza = System.currentTimeMillis();
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";
    public String zzk = "";
    public String zzl = "";
    public String zzm = "";
    public int zzn = 0;
    public long zzd = zza;
    public int zze = 1;

    private zzo(zzax zzaxVar) {
        this.zzr = zzaxVar;
    }

    public static zzo zza(zzax zzaxVar) {
        zzo zzoVar = new zzo(zzaxVar);
        zza++;
        return zzoVar;
    }

    @Nullable
    public static zzo zzc(@Nullable SharedPreferences sharedPreferences, zzax zzaxVar) {
        if (sharedPreferences == null) {
            return null;
        }
        zzo zzoVar = new zzo(zzaxVar);
        zzoVar.zzo = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        zzoVar.zzb = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        zzoVar.zzc = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        zzoVar.zzd = sharedPreferences.getLong("analytics_session_id", 0L);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        zzoVar.zze = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        zzoVar.zzf = sharedPreferences.getString("receiver_session_id", "");
        zzoVar.zzg = sharedPreferences.getInt("device_capabilities", 0);
        zzoVar.zzh = sharedPreferences.getString("device_model_name", "");
        zzoVar.zzi = sharedPreferences.getString("manufacturer", "");
        zzoVar.zzj = sharedPreferences.getString("product_name", "");
        zzoVar.zzk = sharedPreferences.getString("build_type", "");
        zzoVar.zzl = sharedPreferences.getString("cast_build_version", "");
        zzoVar.zzm = sharedPreferences.getString("system_build_number", "");
        zzoVar.zzn = sharedPreferences.getInt("device_category", 0);
        zzoVar.zzp = sharedPreferences.getInt("analytics_session_start_type", 0);
        return zzoVar;
    }

    public final boolean zzb() {
        return this.zzr.zze();
    }

    public final void zzd(@Nullable SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        zzq.a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", this.zzb);
        edit.putString("receiver_metrics_id", this.zzc);
        edit.putLong("analytics_session_id", this.zzd);
        edit.putInt("event_sequence_number", this.zze);
        edit.putString("receiver_session_id", this.zzf);
        edit.putInt("device_capabilities", this.zzg);
        edit.putString("device_model_name", this.zzh);
        edit.putString("manufacturer", this.zzi);
        edit.putString("product_name", this.zzj);
        edit.putString("build_type", this.zzk);
        edit.putString("cast_build_version", this.zzl);
        edit.putString("system_build_number", this.zzm);
        edit.putInt("device_category", this.zzn);
        edit.putInt("analytics_session_start_type", this.zzp);
        edit.putBoolean("is_output_switcher_enabled", this.zzo);
        edit.apply();
    }
}
