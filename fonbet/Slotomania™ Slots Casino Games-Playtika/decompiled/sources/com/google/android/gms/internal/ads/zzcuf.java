package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcuf implements zzimi {
    private final zzimr zza;

    private zzcuf(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcuf zza(zzimr zzimrVar) {
        return new zzcuf(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcxy) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
