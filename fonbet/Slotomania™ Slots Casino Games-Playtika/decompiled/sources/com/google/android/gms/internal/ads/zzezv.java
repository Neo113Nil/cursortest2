package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzezv implements zzfbw {
    public final zzfjs zza;

    public zzezv(zzfjs zzfjsVar) {
        this.zza = zzfjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfjs zzfjsVar = this.zza;
        if (zzfjsVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznr)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", zzfjsVar.zzb());
            bundle.putBoolean("disable_ml", zzfjsVar.zzc());
        }
    }
}
