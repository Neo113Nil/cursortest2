package com.google.android.gms.internal.ads;

import com.braze.Constants;
import com.google.android.gms.common.util.CollectionUtils;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbpl implements zzbpe {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{n.g, "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbxo zzc;
    private final zzbxv zzd;

    public zzbpl(com.google.android.gms.ads.internal.zzb zzbVar, zzbxo zzbxoVar, zzbxv zzbxvVar) {
        this.zzb = zzbVar;
        this.zzc = zzbxoVar;
        this.zzd = zzbxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcki zzckiVar = (zzcki) obj;
        int intValue = ((Integer) zza.get((String) map.get(Constants.BRAZE_PUSH_CONTENT_KEY))).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                if (intValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (intValue == 3) {
                    new zzbxr(zzckiVar, map).zza();
                    return;
                }
                if (intValue == 4) {
                    new zzbxl(zzckiVar, map).zza();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (intValue != 7) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzckiVar == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView is null");
            return;
        }
        if (X3.i.D.equalsIgnoreCase(str)) {
            i = 7;
        } else if (!X3.i.C.equalsIgnoreCase(str)) {
            i = parseBoolean ? -1 : 14;
        }
        zzckiVar.zzam(i);
    }
}
