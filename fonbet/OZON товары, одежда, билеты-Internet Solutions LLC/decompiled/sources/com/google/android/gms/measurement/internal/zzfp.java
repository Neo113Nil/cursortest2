package com.google.android.gms.measurement.internal;

import C.C2702w;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
final class zzfp extends zzhe {

    @VisibleForTesting
    static final Pair zza = new Pair("", 0L);
    public zzfn zzb;
    public final zzfl zzc;
    public final zzfl zzd;
    public final zzfo zze;
    public final zzfl zzf;
    public final zzfj zzg;
    public final zzfo zzh;
    public final zzfj zzi;
    public final zzfl zzj;
    public boolean zzk;
    public final zzfj zzl;
    public final zzfj zzm;
    public final zzfl zzn;
    public final zzfo zzo;
    public final zzfo zzp;
    public final zzfl zzq;
    public final zzfk zzr;
    private SharedPreferences zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;

    zzfp(zzgk zzgkVar) {
        super(zzgkVar);
        this.zzf = new zzfl(this, "session_timeout", 1800000L);
        this.zzg = new zzfj(this, "start_new_session", true);
        this.zzj = new zzfl(this, "last_pause_time", 0L);
        this.zzh = new zzfo(this, "non_personalized_ads", null);
        this.zzi = new zzfj(this, "allow_remote_dynamite", false);
        this.zzc = new zzfl(this, "first_open_time", 0L);
        this.zzd = new zzfl(this, "app_install_time", 0L);
        this.zze = new zzfo(this, "app_instance_id", null);
        this.zzl = new zzfj(this, "app_backgrounded", false);
        this.zzm = new zzfj(this, "deep_link_retrieval_complete", false);
        this.zzn = new zzfl(this, "deep_link_retrieval_attempts", 0L);
        this.zzo = new zzfo(this, "firebase_feature_rollouts", null);
        this.zzp = new zzfo(this, "deferred_attribution_cache", null);
        this.zzq = new zzfl(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzr = new zzfk(this, "default_event_parameters", null);
    }

    @VisibleForTesting
    protected final SharedPreferences zza() {
        zzg();
        zzu();
        Preconditions.checkNotNull(this.zzt);
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzhe
    protected final void zzaA() {
        SharedPreferences sharedPreferences = this.zzs.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzt = sharedPreferences;
        boolean z11 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzk = z11;
        if (!z11) {
            C2702w.e(this.zzt, "has_been_opened", true);
        }
        this.zzs.zzf();
        this.zzb = new zzfn(this, "health_monitor", Math.max(0L, ((Long) zzen.zzb.zza(null)).longValue()), null);
    }

    final Pair zzb(String str) {
        zzg();
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        String str2 = this.zzu;
        if (str2 != null && elapsedRealtime < this.zzw) {
            return new Pair(str2, Boolean.valueOf(this.zzv));
        }
        this.zzw = this.zzs.zzf().zzi(str, zzen.zza) + elapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            this.zzu = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.zzu = id2;
            }
            this.zzv = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e11) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e11);
            this.zzu = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzu, Boolean.valueOf(this.zzv));
    }

    final zzai zzc() {
        zzg();
        return zzai.zzb(zza().getString("consent_settings", "G1"));
    }

    final Boolean zzd() {
        zzg();
        if (zza().contains("measurement_enabled")) {
            return Boolean.valueOf(zza().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzhe
    protected final boolean zzf() {
        return true;
    }

    final void zzh(Boolean bool) {
        zzg();
        SharedPreferences.Editor edit = zza().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    final void zzi(boolean z11) {
        zzg();
        this.zzs.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z11));
        C2702w.e(zza(), "deferred_analytics_collection", z11);
    }

    final boolean zzj() {
        SharedPreferences sharedPreferences = this.zzt;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean zzk(long j11) {
        return j11 - this.zzf.zza() > this.zzj.zza();
    }

    final boolean zzl(int i11) {
        return zzai.zzj(i11, zza().getInt("consent_source", 100));
    }
}
