package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import io.sentry.SentryLockReason;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdwq {
    private final zzfli zza;
    private final zzdwn zzb;

    zzdwq(zzfli zzfliVar, zzdwn zzdwnVar) {
        this.zza = zzfliVar;
        this.zzb = zzdwnVar;
    }

    public final zzflk zza(String str, JSONObject jSONObject) throws zzfkt {
        zzbut zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbvr(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbvr(new zzbxi());
            } else {
                zzbuq zzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString(SentryLockReason.JsonKeys.CLASS_NAME);
                        zzb = zzd.zzc(string) ? zzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzd.zzd(string) ? zzd.zzb(string) : zzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e);
                    }
                }
                zzb = zzd.zzb(str);
            }
            zzflk zzflkVar = new zzflk(zzb);
            this.zzb.zza(str, zzflkVar);
            return zzflkVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkJ)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfkt(th);
        }
    }

    public final zzbwp zzb(String str) throws RemoteException {
        zzbwp zze = zzd().zze(str);
        this.zzb.zzb(str, zze);
        return zze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    final zzbuq zzd() throws RemoteException {
        zzbuq zzd = this.zza.zzd();
        if (zzd != null) {
            return zzd;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
