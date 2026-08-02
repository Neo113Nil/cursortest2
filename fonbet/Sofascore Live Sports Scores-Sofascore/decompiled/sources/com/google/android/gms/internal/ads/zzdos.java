package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbil;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdos implements zzinw {
    public final zzdns a;
    public final zziof b;
    public final zziof c;
    public final zzdng d;
    public final zziof e;
    public final zzczc f;

    public zzdos(zzdns zzdnsVar, zzcok zzcokVar, zzinv zzinvVar, zzdng zzdngVar, zziof zziofVar, zzczc zzczcVar) {
        this.a = zzdnsVar;
        this.b = zzcokVar;
        this.c = zzinvVar;
        this.d = zzdngVar;
        this.e = zziofVar;
        this.f = zzczcVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdns zzdnsVar = this.a;
        zzceo zzceoVar = new zzceo(((zzcok) zzdnsVar.a).a(), ((zzddg) zzdnsVar.b).a().g);
        Context a = ((zzcok) this.b).a();
        zzcer zzcerVar = (zzcer) this.c.zzb();
        zzclm zzclmVar = this.d.a.b;
        return new zzdor(zzceoVar, a, zzcerVar, zzclmVar == null ? null : zzclmVar.zzD(), (zzbil.zza.EnumC0134zza) this.e.zzb(), this.f.a());
    }
}
