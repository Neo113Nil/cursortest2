package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.ironsource.Y3;
import io.sentry.protocol.DebugMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdsb {
    private final zzhbs zza;
    private final zzdsq zzb;
    private final zzdsv zzc;
    private final zzdyu zzd;

    zzdsb(zzhbs zzhbsVar, zzdsq zzdsqVar, zzdsv zzdsvVar, zzdyu zzdyuVar) {
        this.zza = zzhbsVar;
        this.zzb = zzdsqVar;
        this.zzc = zzdsvVar;
        this.zzd = zzdyuVar;
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdyi zzdyiVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            zzhbi.zzr(listenableFuture, new zzdry(this, zzdyiVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final ListenableFuture zza(final zzfke zzfkeVar, final zzfjt zzfjtVar, final JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar) {
        ListenableFuture zza;
        JSONArray optJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcP)).booleanValue()) {
            this.zzd.zzf(zzdyi.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture submit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdsb.this.zzb(zzfkeVar, zzfjtVar, jSONObject);
            }
        });
        zze(submit, zzdyi.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdsq zzdsqVar = this.zzb;
        final ListenableFuture zzb = zzdsqVar.zzb(jSONObject, DebugMeta.JsonKeys.IMAGES, zzdyi.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(zzb, zzdyi.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfjw zzfjwVar = zzfkeVar.zzb.zzb;
        final ListenableFuture zzc = zzdsqVar.zzc(jSONObject, DebugMeta.JsonKeys.IMAGES, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar);
        zze(zzc, zzdyi.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final ListenableFuture zza2 = zzdsqVar.zza(jSONObject, "secondary_image", zzdyi.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(zza2, zzdyi.NATIVE_ASSETS_LOADING_LOGO_END);
        final ListenableFuture zza3 = zzdsqVar.zza(jSONObject, "app_icon", zzdyi.NATIVE_ASSETS_LOADING_ICON_START);
        zze(zza3, zzdyi.NATIVE_ASSETS_LOADING_ICON_END);
        final ListenableFuture zzd = zzdsqVar.zzd(jSONObject, Y3.c, zzdyi.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(zzd, zzdyi.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final ListenableFuture zzg = zzdsqVar.zzg(jSONObject, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar);
        zze(zzg, zzdyi.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzov)).booleanValue() && jSONObject.has("video")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 == null || !optJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i++;
                    } else {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString("value")) == 3) {
                                zza = this.zzb.zzf(zzg);
                                zze(zza, zzdyi.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        zza = zzhbi.zza(new Bundle());
        final ListenableFuture zza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(zza4, zzdyi.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final ListenableFuture zze = this.zzb.zze(jSONObject, zzbVar, zzcdbVar);
        zze(zze, zzdyi.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(submit);
        arrayList.add(zzb);
        arrayList.add(zzc);
        arrayList.add(zza2);
        arrayList.add(zza3);
        arrayList.add(zzd);
        arrayList.add(zzg);
        arrayList.add(zza);
        arrayList.add(zza4);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgr)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(zze);
        }
        final ListenableFuture listenableFuture = zza;
        return zzhbi.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdsb.this.zzc(submit, zzb, zza3, zza2, zzd, jSONObject, zzg, listenableFuture, zzc, zze, zza4);
            }
        }, this.zza);
    }

    final /* synthetic */ zzdph zzb(zzfke zzfkeVar, zzfjt zzfjtVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzd.zzf(zzdyi.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdph zzdphVar = new zzdph();
        zzdphVar.zza(jSONObject.optInt("template_id", -1));
        zzdphVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdphVar.zzv(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        if (!zzfkmVar.zzh.contains(Integer.toString(zzdphVar.zzx()))) {
            int zzx = zzdphVar.zzx();
            StringBuilder sb = new StringBuilder(String.valueOf(zzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(zzx);
            throw new zzeov(1, sb.toString());
        }
        if (zzdphVar.zzx() == 3) {
            if (zzdphVar.zzS() == null) {
                throw new zzeov(1, "No custom template id for custom template ad response.");
            }
            if (!zzfkmVar.zzi.contains(zzdphVar.zzS())) {
                throw new zzeov(1, "Unexpected custom template id in the response.");
            }
        }
        zzdphVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String optString = jSONObject.optString("headline", null);
        if (zzfjtVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String zzB = com.google.android.gms.ads.internal.util.zzs.zzB();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzB).length() + 3 + String.valueOf(optString).length());
            sb2.append(zzB);
            sb2.append(" : ");
            sb2.append(optString);
            optString = sb2.toString();
        }
        zzdphVar.zzs("headline", optString);
        zzdphVar.zzs("body", jSONObject.optString("body", null));
        zzdphVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdphVar.zzs(X3.i.U, jSONObject.optString(X3.i.U, null));
        zzdphVar.zzs("price", jSONObject.optString("price", null));
        zzdphVar.zzs(X3.i.F0, jSONObject.optString(X3.i.F0, null));
        return zzdphVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdph zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcP)).booleanValue()) {
            this.zzd.zzf(zzdyi.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdph zzdphVar = (zzdph) listenableFuture.get();
        zzdphVar.zzd((List) listenableFuture2.get());
        zzdphVar.zzj((zzbls) listenableFuture3.get());
        zzdphVar.zzk((zzbls) listenableFuture4.get());
        zzdphVar.zzc((zzbll) listenableFuture5.get());
        zzdphVar.zze(zzdsq.zzl(jSONObject));
        zzdphVar.zzf(zzdsq.zzk(jSONObject));
        zzcki zzckiVar = (zzcki) listenableFuture6.get();
        if (zzckiVar != null) {
            zzdphVar.zzm(zzckiVar);
            zzdphVar.zzg(zzckiVar.zzE());
            zzdphVar.zzb(zzckiVar.zzh());
        }
        zzdphVar.zzH().putAll((Bundle) listenableFuture7.get());
        zzcki zzckiVar2 = (zzcki) listenableFuture8.get();
        if (zzckiVar2 != null) {
            zzdphVar.zzn(zzckiVar2);
            zzdphVar.zzh(zzckiVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgr)).booleanValue() || zzf(jSONObject)) {
            zzcki zzckiVar3 = (zzcki) listenableFuture9.get();
            if (zzckiVar3 != null) {
                zzdphVar.zzo(zzckiVar3);
            }
        } else {
            zzdphVar.zzp(listenableFuture9);
            zzdphVar.zzr(new zzcfk());
        }
        for (zzdss zzdssVar : (List) listenableFuture10.get()) {
            if (zzdssVar.zza != 1) {
                zzdphVar.zzt(zzdssVar.zzb, zzdssVar.zzd);
            } else {
                zzdphVar.zzs(zzdssVar.zzb, zzdssVar.zzc);
            }
        }
        return zzdphVar;
    }

    final /* synthetic */ zzdyu zzd() {
        return this.zzd;
    }
}
