package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgly implements zzinw {
    public final zziof a;
    public final zzinv b;
    public final zziof c;

    public zzgly(zzinv zzinvVar, zzinv zzinvVar2, zzinx zzinxVar) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.a.zzb();
        return new zzgmd(context, context.getSharedPreferences("pcvmspf2", 0), zzinv.b(this.b), (zzgrh) this.c.zzb());
    }
}
