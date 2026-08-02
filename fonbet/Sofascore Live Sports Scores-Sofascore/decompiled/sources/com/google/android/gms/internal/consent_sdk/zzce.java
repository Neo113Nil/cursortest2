package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import defpackage.ng2;
import defpackage.xx3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzce implements zzth {
    public final zztk a;
    public final zztg b;
    public final zztk c;
    public final zztk d;
    public final zztf e;
    public final zztk f;

    public zzce(zzti zztiVar, zztg zztgVar, zztg zztgVar2, zzap zzapVar, zztf zztfVar, zztg zztgVar3) {
        this.a = zztiVar;
        this.b = zztgVar;
        this.c = zztgVar2;
        this.d = zzapVar;
        this.e = zztfVar;
        this.f = zztgVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ng2 zzb() {
        Application application = (Application) this.a.zzb();
        zzbz zzbzVar = (zzbz) this.b.zzb();
        Handler handler = zzcz.a;
        zztj.a(handler);
        xx3 xx3Var = zzcz.b;
        zztj.a(xx3Var);
        return new ng2(application, zzbzVar, handler, xx3Var, (zze) this.c.zzb(), ((zzap) this.d).zzb(), (zzbe) this.e.zzb(), (zzaq) this.f.zzb());
    }
}
