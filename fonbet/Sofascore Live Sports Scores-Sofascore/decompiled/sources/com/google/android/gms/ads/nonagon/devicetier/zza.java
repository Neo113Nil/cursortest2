package com.google.android.gms.ads.nonagon.devicetier;

import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zza implements zzinw {
    public final zziof a;

    public zza(zziof zziofVar) {
        this.a = zziofVar;
    }

    public static zza zza(zziof zziofVar) {
        return new zza(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DeviceTierManager(((zzcok) this.a).a());
    }
}
