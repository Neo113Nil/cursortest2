package com.google.android.gms.internal.ads;

import com.braze.ui.actions.brazeactions.steps.StepData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbui implements zzhaq {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    zzbui(ListenableFuture listenableFuture, String str, zzbtp zzbtpVar, zzbto zzbtoVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzhbi.zzj(this.zzb, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzbuh
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return zzbui.this.zzc(obj, (zzbtj) obj2);
            }
        }, zzcff.zzh);
    }

    final /* synthetic */ ListenableFuture zzc(Object obj, zzbtj zzbtjVar) {
        zzcfk zzcfkVar = new zzcfk();
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        zzbpd.zzo.zzb(uuid, new zzbug(this, zzcfkVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put(StepData.ARGS, (JSONObject) obj);
        zzbtjVar.zzb(this.zza, jSONObject);
        return zzcfkVar;
    }
}
