package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zzioe;
import com.google.android.gms.internal.ads.zziof;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzax implements zzinw {
    public final zziof a;

    public zzax(zziof zziofVar) {
        this.a = zziofVar;
    }

    public static zzax zza(zziof zziofVar, zziof zziofVar2) {
        return new zzax(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzr zzrVar = (zzr) this.a.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzdlo(zzrVar, hsnVar);
    }
}
