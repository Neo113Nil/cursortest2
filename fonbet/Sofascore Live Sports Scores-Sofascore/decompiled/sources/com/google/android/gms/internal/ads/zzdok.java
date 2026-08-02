package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdok implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zzeou c;
    public final zzerm d;

    public zzdok(zzinv zzinvVar, zzinv zzinvVar2, zzeou zzeouVar, zzerm zzermVar) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzeouVar;
        this.d = zzermVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzfqi zzfqiVar = (zzfqi) this.a.zzb();
        zzhdi zzhdiVar = (zzhdi) this.b.zzb();
        zzeou zzeouVar = this.c;
        return new zzers(zzfqiVar, zzhdiVar, this.d.zzb(), new zzeot((Context) zzeouVar.a.zzb(), (zzdoe) zzeouVar.b.a));
    }
}
