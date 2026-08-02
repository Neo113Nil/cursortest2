package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import defpackage.xx3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcs implements zzth {
    public final zztg a;
    public final zzti b;
    public final zztg c;

    public zzcs(zztg zztgVar, zztg zztgVar2, zzti zztiVar) {
        this.a = zztgVar;
        this.b = zztiVar;
        this.c = zztgVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    public final Object zzb() {
        Application application = (Application) this.b.a;
        xx3 xx3Var = zzcz.b;
        zztj.a(xx3Var);
        return new zzcr(application, xx3Var, (zzco) this.c.zzb(), false);
    }
}
