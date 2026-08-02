package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.webkit.WebViewFeature;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.X3;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdyg implements zzdfl, zzddt, zzdci, zzdky {
    private final zzdyu zza;
    private final zzdze zzb;

    zzdyg(zzdyu zzdyuVar, zzdze zzdzeVar) {
        this.zza = zzdyuVar;
        this.zzb = zzdzeVar;
    }

    private final void zzc(Bundle bundle, zzgvz zzgvzVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdyi.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzdyu zzdyuVar = this.zza;
        zzdyuVar.zzh();
        if (bundle.containsKey("ls")) {
            zzdyuVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgvzVar.size();
        for (int i = 0; i < size; i++) {
            zzdyj zzdyjVar = (zzdyj) zzgvzVar.get(i);
            long j = bundle.getLong(zzdyjVar.zzb().zza(), -1L);
            long j2 = bundle.getLong(zzdyjVar.zzc().zza(), -1L);
            if (j > 0 && j2 > 0) {
                zzdyuVar.zzd(zzdyjVar.zza(), String.valueOf(j2 - j));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, String.valueOf(j));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    @Override // com.google.android.gms.internal.ads.zzdky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        String str;
        zzcar zzcarVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhT)).booleanValue()) {
            if (zzbcVar == null) {
                zzdyu zzdyuVar = this.zza;
                zzdyuVar.zzc().put("action", "sgs");
                zzdyuVar.zzc().put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "-1");
                this.zzb.zzb(zzdyuVar.zzc());
                return;
            }
            zzcar zzcarVar2 = zzbcVar.zzc;
            if (zzcarVar2 != null) {
                zzc(zzcarVar2.zzm, zzdyj.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzbcVar.zzb);
                zzdyu zzdyuVar2 = this.zza;
                zzdyuVar2.zzc().put("action", "sgs");
                Map zzc = zzdyuVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzla)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e);
                    }
                    zzc.put("tpc", str);
                    zzcarVar = zzbcVar.zzc;
                    if (zzcarVar != null) {
                        this.zza.zzb(zzcarVar.zza);
                    }
                    zzdyu zzdyuVar3 = this.zza;
                    zzdyuVar3.zzi();
                    this.zzb.zzb(zzdyuVar3.zzc());
                }
                str = "na";
                zzc.put("tpc", str);
                zzcarVar = zzbcVar.zzc;
                if (zzcarVar != null) {
                }
                zzdyu zzdyuVar32 = this.zza;
                zzdyuVar32.zzi();
                this.zzb.zzb(zzdyuVar32.zzc());
            } catch (JSONException unused) {
                zzdyu zzdyuVar4 = this.zza;
                zzdyuVar4.zzc().put("action", "sgf");
                zzdyuVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdyuVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdyu zzdyuVar = this.zza;
        zzdyuVar.zzc().put("action", "ftl");
        zzdyuVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdyuVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzii)).booleanValue()) {
            zzdyuVar.zzd("emsg", zzeVar.zzb);
        }
        zzdyuVar.zzi();
        this.zzb.zzb(zzdyuVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
        this.zza.zzb(zzcarVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(zzfke zzfkeVar) {
        this.zza.zza(zzfkeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhT)).booleanValue()) {
            zzdyu zzdyuVar = this.zza;
            zzdyuVar.zzc().put("action", "sgf");
            zzdyuVar.zzd("sgf_reason", str);
            zzdyuVar.zzi();
            this.zzb.zzb(zzdyuVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzg() {
        zzdyu zzdyuVar = this.zza;
        zzdyuVar.zzc().put("action", X3.i.r);
        zzc(zzdyuVar.zze(), zzdyj.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzob)).booleanValue()) {
            zzdyuVar.zzc().put("mafe", true != WebViewFeature.isFeatureSupported("MUTE_AUDIO") ? "0" : "1");
        }
        zzdyuVar.zzi();
        this.zzb.zzb(zzdyuVar.zzc());
    }
}
