package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import defpackage.ohn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfiw implements zzinw {
    public final zzinx a;
    public final zziof b;
    public final zziof c;

    public zzfiw(zzinv zzinvVar, zzinv zzinvVar2, zzinx zzinxVar) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfiu zzb() {
        Context context = (Context) this.a.a;
        zzfnh zzfnhVar = (zzfnh) this.b.zzb();
        zzfnz zzfnzVar = (zzfnz) this.c.zzb();
        zzcfq zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s7)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().g().zzi() : com.google.android.gms.ads.internal.zzt.zzh().g().zzj();
        boolean z = false;
        if (zzi != null && zzi.j) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I7)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r7)).booleanValue() || z) {
                zzfny a = zzfnzVar.a(zzfnp.c, context, zzfnhVar, new ohn(new zzfhw(), 17));
                zzfil zzfilVar = new zzfil(new zzfik());
                r rVar = a.a;
                hsn hsnVar = zzcgj.a;
                return new zzfib(zzfilVar, new zzfih(rVar, hsnVar), a.b, rVar.b.g, hsnVar);
            }
        }
        return new zzfik();
    }
}
