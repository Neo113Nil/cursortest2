package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcjw extends zzcjs {
    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean g(String str) {
        String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        zzcif zzcifVar = (zzcif) this.c.get();
        if (zzcifVar != null && zzg != null) {
            zzcifVar.D(zzg, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("VideoStreamNoopCache is doing nothing.");
        p(str, zzg, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void o() {
    }
}
