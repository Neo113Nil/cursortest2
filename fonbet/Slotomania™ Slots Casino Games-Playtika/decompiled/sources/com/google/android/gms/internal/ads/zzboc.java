package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzboc implements zzbpe {
    zzboc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcki zzckiVar = (zzcki) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgrf zzl = zzgrg.zzl();
        zzl.zzb((String) map.get("appId"));
        zzl.zzg(zzckiVar.getWidth());
        zzl.zza(zzckiVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzl.zzh((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzt().zzc(zzckiVar, zzl.zzi());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
