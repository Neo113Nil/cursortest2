package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeel implements zzimi {
    private final zzimr zza;

    private zzeel(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzeel zza(zzimr zzimrVar) {
        return new zzeel(zzimrVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb() {
        String valueOf;
        zzfkm zza = ((zzdbw) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzil)).booleanValue()) {
            String str = zza.zzd.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    valueOf = new JSONObject(str).getString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
                } catch (JSONException unused) {
                }
            }
            com.google.android.gms.ads.internal.client.zzc zzcVar = zza.zzd.zzs;
            if (zzcVar != null) {
                try {
                    valueOf = new JSONObject(zzcVar.zza).getString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
                } catch (JSONException unused2) {
                }
            }
        }
        valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt() & Integer.MAX_VALUE);
        zzimq.zzb(valueOf);
        return valueOf;
    }
}
