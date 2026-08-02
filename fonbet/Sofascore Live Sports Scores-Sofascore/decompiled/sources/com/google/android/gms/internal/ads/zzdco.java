package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import defpackage.jyn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdco implements zzinw {
    public final zziof a;
    public final zzczc b;
    public final zzinw c;
    public final zzczf d;
    public final zziof e;
    public final zziof f;
    public final zziof g;

    public zzdco(zzinv zzinvVar, zzczc zzczcVar, zzinw zzinwVar, zzczf zzczfVar, zzinv zzinvVar2, zzinv zzinvVar3, zziof zziofVar) {
        this.a = zzinvVar;
        this.b = zzczcVar;
        this.c = zzinwVar;
        this.d = zzczfVar;
        this.e = zzinvVar2;
        this.f = zzinvVar3;
        this.g = zziofVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.a.zzb();
        zzfld a = this.b.a();
        zzclm zzclmVar = (zzclm) this.c.zzb();
        new zzbzy();
        return new jyn(context, a, zzclmVar, this.d.a(), (Clock) this.e.zzb(), (zzeaj) this.f.zzb(), (zzdcg) this.g.zzb());
    }
}
