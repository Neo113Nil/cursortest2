package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcan extends zzcak {
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbtm zzd;
    private final VersionInfoParcel zze;
    private final Executor zzg;
    private final Object zza = new Object();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzcan(Context context, zzbtm zzbtmVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbtmVar;
        this.zzg = executor;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbke.zzf.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzbke.zzg.zze());
            jSONObject.put("cl", "873078379");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final ListenableFuture zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzbke.zzh.zze()).longValue()) {
            return zzhbi.zza(null);
        }
        return zzhbi.zzk(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzcal
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzcan.this.zze((JSONObject) obj);
                return null;
            }
        }, ((Boolean) zzbke.zzm.zze()).booleanValue() ? this.zzg : zzcff.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final ListenableFuture zzb() {
        if (!((Boolean) zzbke.zza.zze()).booleanValue()) {
            return zza();
        }
        if (!this.zzf.compareAndSet(false, true)) {
            return zzhbi.zzb();
        }
        ListenableFuture zza = zza();
        zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcam
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcan.this.zzd();
            }
        }, zzcff.zzh);
        return zza;
    }

    final /* synthetic */ void zzd() {
        this.zzf.set(false);
    }

    final /* synthetic */ Void zze(JSONObject jSONObject) {
        zzbhv zzbhvVar = zzbie.zza;
        com.google.android.gms.ads.internal.client.zzba.zza();
        Context context = this.zzb;
        SharedPreferences zzb = zzbhx.zzb(context);
        if (zzb == null) {
            return null;
        }
        SharedPreferences.Editor edit = zzb.edit();
        Objects.requireNonNull(com.google.android.gms.ads.internal.client.zzba.zzb());
        int i = zzbju.zza;
        com.google.android.gms.ads.internal.client.zzba.zzb().zzd(edit, 1, jSONObject);
        if ((((Boolean) zzbke.zzo.zze()).booleanValue() || ((Boolean) zzbke.zzp.zze()).booleanValue()) && !ClientLibraryUtils.isPackageSide()) {
            com.google.android.gms.ads.internal.client.zzba.zza();
            edit.apply();
        } else {
            com.google.android.gms.ads.internal.client.zzba.zza();
            edit.commit();
        }
        if (((Boolean) zzbke.zze.zze()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
            com.google.android.gms.ads.internal.client.zzba.zza();
            SharedPreferences zza = zzbhx.zza(context);
            if (zza != null) {
                SharedPreferences.Editor edit2 = zza.edit();
                com.google.android.gms.ads.internal.client.zzba.zzb();
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.startsWith("adapter:")) {
                        try {
                            jSONObject2.put(next, jSONObject.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
                edit2.putString("flag_configuration", jSONObject2.toString());
                edit2.apply();
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()).apply();
        return null;
    }
}
