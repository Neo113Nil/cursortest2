package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzcpa;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;
import defpackage.inn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzb implements zzinw {
    public final zziof a;
    public final zziof b;

    public zzb(zziof zziofVar, zziof zziofVar2) {
        this.a = zziofVar;
        this.b = zziofVar2;
    }

    public static zzb zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzb(zziofVar, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        new zzbiq();
        inn innVar = zzbjg.a;
        return new zza(a, com.google.android.gms.ads.internal.client.zzba.zzb().a(), ((zzcpa) this.b).a());
    }
}
