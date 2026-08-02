package com.google.android.gms.internal.ads;

import com.braze.ui.actions.brazeactions.steps.StepData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes6.dex */
public final class zzbua implements zzbtm {
    private final zzbto zza;
    private final zzbtp zzb;
    private final zzbti zzc;
    private final String zzd;

    zzbua(zzbti zzbtiVar, String str, zzbtp zzbtpVar, zzbto zzbtoVar) {
        this.zzc = zzbtiVar;
        this.zzd = str;
        this.zzb = zzbtpVar;
        this.zza = zzbtoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final ListenableFuture zzb(Object obj) {
        zzcfk zzcfkVar = new zzcfk();
        zzbtc zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zze(new zzbtx(this, zzb, obj, zzcfkVar), new zzbty(this, zzcfkVar, zzb));
        return zzcfkVar;
    }

    final /* synthetic */ void zzc(zzbtc zzbtcVar, zzbtj zzbtjVar, Object obj, zzcfk zzcfkVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String uuid = UUID.randomUUID().toString();
            zzbpd.zzo.zzb(uuid, new zzbtz(this, zzbtcVar, zzcfkVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put(StepData.ARGS, this.zzb.zzb(obj));
            zzbtjVar.zzb(this.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcfkVar.zzd(e);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e);
            } finally {
                zzbtcVar.zza();
            }
        }
    }

    final /* synthetic */ zzbto zzd() {
        return this.zza;
    }
}
