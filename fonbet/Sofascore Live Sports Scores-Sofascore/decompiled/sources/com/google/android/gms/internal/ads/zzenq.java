package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ddb;
import defpackage.qxn;
import defpackage.xlo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzenq implements zzemq {
    public final zzcxi a;
    public final Context b;
    public final zzdxg c;
    public final zzflw d;
    public final Executor e;
    public final zzgub f;
    public final zzeae g;

    public zzenq(zzcxi zzcxiVar, Context context, Executor executor, zzdxg zzdxgVar, zzflw zzflwVar, zzgub zzgubVar, zzeae zzeaeVar) {
        this.b = context;
        this.a = zzcxiVar;
        this.e = executor;
        this.c = zzdxgVar;
        this.d = zzflwVar;
        this.f = zzgubVar;
        this.g = zzeaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ddb a(zzflo zzfloVar, zzfld zzfldVar) {
        return zzhcy.h(xlo.b, new qxn(4, this, zzfloVar, zzfldVar), this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean b(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar = zzfldVar.s;
        return (zzfliVar == null || zzfliVar.a == null) ? false : true;
    }
}
