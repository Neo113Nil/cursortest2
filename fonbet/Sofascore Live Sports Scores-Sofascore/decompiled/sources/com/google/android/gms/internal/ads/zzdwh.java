package com.google.android.gms.internal.ads;

import defpackage.bgf;
import defpackage.l2a;
import defpackage.pff;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdwh implements zzbra {
    public final zzdew a;
    public final zzcct b;
    public final String c;
    public final String d;

    public zzdwh(zzdew zzdewVar, zzfld zzfldVar) {
        this.a = zzdewVar;
        this.b = zzfldVar.l;
        this.c = zzfldVar.j;
        this.d = zzfldVar.k;
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void I(zzcct zzcctVar) {
        int i;
        String str;
        zzcct zzcctVar2 = this.b;
        if (zzcctVar2 != null) {
            zzcctVar = zzcctVar2;
        }
        if (zzcctVar != null) {
            str = zzcctVar.a;
            i = zzcctVar.b;
        } else {
            i = 1;
            str = "";
        }
        zzcce zzcceVar = new zzcce(str, i);
        zzdew zzdewVar = this.a;
        zzdewVar.getClass();
        zzdewVar.p0(new l2a(29, zzcceVar, this.c, this.d));
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zza() {
        this.a.p0(pff.e);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zzc() {
        this.a.p0(bgf.e);
    }
}
