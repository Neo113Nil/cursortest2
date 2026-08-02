package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.android.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdqu {
    private final zzdvw zza;
    private final zzdul zzb;
    private final zzcue zzc;
    private final zzdpp zzd;

    public zzdqu(zzdvw zzdvwVar, zzdul zzdulVar, zzcue zzcueVar, zzdpp zzdppVar) {
        this.zza = zzdvwVar;
        this.zzb = zzdulVar;
        this.zzc = zzcueVar;
        this.zzd = zzdppVar;
    }

    public final View zza() throws zzckx {
        zzcki zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zza.zzE().setVisibility(8);
        zza.zzab("/sendMessageToSdk", new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdqt
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdqu.this.zzb((zzcki) obj, map);
            }
        });
        zza.zzab("/adMuted", new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdqu.this.zzc((zzcki) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(zza);
        zzbpe zzbpeVar = new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdqp
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, final Map map) {
                zzcki zzckiVar = (zzcki) obj;
                zzcmg zzP = zzckiVar.zzP();
                final zzdqu zzdquVar = zzdqu.this;
                zzP.zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzdqs
                    @Override // com.google.android.gms.internal.ads.zzcme
                    public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                        zzdqu.this.zzf(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzckiVar.loadData(str, "text/html", C.UTF8_NAME);
                } else {
                    zzckiVar.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                }
            }
        };
        zzdul zzdulVar = this.zzb;
        zzdulVar.zzh(weakReference, "/loadHtml", zzbpeVar);
        zzdulVar.zzh(new WeakReference(zza), "/showOverlay", new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdqq
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdqu.this.zzd((zzcki) obj, map);
            }
        });
        zzdulVar.zzh(new WeakReference(zza), "/hideOverlay", new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdqr
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdqu.this.zze((zzcki) obj, map);
            }
        });
        return zza.zzE();
    }

    final /* synthetic */ void zzb(zzcki zzckiVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcki zzckiVar, Map map) {
        this.zzd.zzt();
    }

    final /* synthetic */ void zzd(zzcki zzckiVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Showing native ads overlay.");
        zzckiVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zze(zzcki zzckiVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Hiding native ads overlay.");
        zzckiVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    final /* synthetic */ void zzf(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}
