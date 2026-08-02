package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zzioe;
import com.google.android.gms.internal.ads.zziof;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzm implements zzinw {
    public final zziof a;
    public final zziof b;

    public zzm(zziof zziofVar, zziof zziofVar2) {
        this.a = zziofVar;
        this.b = zziofVar2;
    }

    public static zzm zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzm(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        zzeao zzeaoVar = (zzeao) this.b.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzj(a, zzeaoVar, hsnVar);
    }
}
