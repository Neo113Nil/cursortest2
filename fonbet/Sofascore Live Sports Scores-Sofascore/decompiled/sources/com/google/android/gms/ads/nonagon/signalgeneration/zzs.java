package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzs implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;

    public zzs(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zziofVar3;
    }

    public static zzs zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzs(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzr((zzeae) this.a.zzb(), (zzq) this.b.zzb(), (String) this.c.zzb());
    }
}
