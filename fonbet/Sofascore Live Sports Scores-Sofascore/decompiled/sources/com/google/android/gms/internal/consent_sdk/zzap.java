package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import defpackage.xx3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzap implements zzth {
    public final zzti a;
    public final zztg b;
    public final zztg c;

    public zzap(zztg zztgVar, zztg zztgVar2, zzti zztiVar) {
        this.a = zztiVar;
        this.b = zztgVar;
        this.c = zztgVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzao zzb() {
        Application application = (Application) this.a.a;
        zzaq zzaqVar = (zzaq) this.b.zzb();
        zzl zzlVar = (zzl) this.c.zzb();
        xx3 xx3Var = zzcz.b;
        zztj.a(xx3Var);
        return new zzao(application, zzaqVar, zzlVar, xx3Var);
    }
}
