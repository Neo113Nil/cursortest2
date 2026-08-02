package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.f0o;
import defpackage.vlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdtl {
    public final zzhdi a;
    public final zzdua b;
    public final zzduf c;
    public final zzeae d;

    public zzdtl(zzhdi zzhdiVar, zzdua zzduaVar, zzduf zzdufVar, zzeae zzeaeVar) {
        this.a = zzhdiVar;
        this.b = zzduaVar;
        this.c = zzdufVar;
        this.d = zzeaeVar;
    }

    public final void a(ddb ddbVar, zzdzs zzdzsVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
            ddbVar.addListener(new vlo(0, ddbVar, new f0o(this, zzdzsVar, false, 3)), this.a);
        }
    }
}
