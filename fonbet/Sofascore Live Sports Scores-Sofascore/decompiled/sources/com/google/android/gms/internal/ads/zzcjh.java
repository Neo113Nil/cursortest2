package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcjh implements zzbqh {
    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcif zzcifVar = (zzcif) obj;
        zzcms zzh = zzcifVar.zzh();
        if (zzh == null) {
            try {
                zzcms zzcmsVar = new zzcms(zzcifVar, Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcifVar.f0(zzcmsVar);
                zzh = zzcmsVar;
            } catch (NullPointerException | NumberFormatException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzh().d("VideoMetaGmsgHandler.onGmsg", e);
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Float.parseFloat(str);
        if (zzo.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(parseFloat2).length() + 45 + String.valueOf(parseFloat).length() + 13 + String.valueOf(equals).length() + 19 + String.valueOf(parseInt).length() + 17 + String.valueOf(str).length());
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(parseInt);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            zzo.zzd(sb.toString());
        }
        zzh.F4(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
