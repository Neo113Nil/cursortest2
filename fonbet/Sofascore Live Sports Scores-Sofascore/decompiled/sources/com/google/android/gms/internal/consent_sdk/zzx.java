package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import defpackage.ji3;
import defpackage.xx3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzx implements zzth {
    public final zzti a;
    public final zztg b;
    public final zztg c;
    public final zztg d;
    public final zzq e;
    public final zzac f;
    public final zztg g;
    public final zztg h;

    public zzx(zzti zztiVar, zztg zztgVar, zztg zztgVar2, zztg zztgVar3, zzq zzqVar, zzac zzacVar, zztg zztgVar4, zztg zztgVar5) {
        this.a = zztiVar;
        this.b = zztgVar;
        this.c = zztgVar2;
        this.d = zztgVar3;
        this.e = zzqVar;
        this.f = zzacVar;
        this.g = zztgVar4;
        this.h = zztgVar5;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ji3 zzb() {
        Application application = (Application) this.a.a;
        Handler handler = zzcz.a;
        zztj.a(handler);
        xx3 xx3Var = zzcz.b;
        zztj.a(xx3Var);
        return new ji3(application, handler, xx3Var, (zzaq) this.c.zzb(), (zzbq) this.d.zzb(), this.e.zzb(), this.f.zzb(), (zze) this.g.zzb(), (zzcr) this.h.zzb());
    }
}
