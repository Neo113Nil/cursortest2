package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbf implements zzth {
    public final zztk a;
    public final zztk b;
    public final zztg c;
    public final zztk d;
    public final zzti e;
    public final zzby f;
    public final zztk g;

    public zzbf(zzti zztiVar, zztg zztgVar, zztg zztgVar2, zztg zztgVar3, zzti zztiVar2, zzby zzbyVar, zztg zztgVar4) {
        this.a = zztiVar;
        this.b = zztgVar;
        this.c = zztgVar2;
        this.d = zztgVar3;
        this.e = zztiVar2;
        this.f = zzbyVar;
        this.g = zztgVar4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    public final Object zzb() {
        Application application = (Application) this.a.zzb();
        return new zzbe(application, (zzbz) this.c.zzb(), (zzaq) this.d.zzb(), (zzbs) this.e.a, this.f, (zzcr) this.g.zzb());
    }
}
