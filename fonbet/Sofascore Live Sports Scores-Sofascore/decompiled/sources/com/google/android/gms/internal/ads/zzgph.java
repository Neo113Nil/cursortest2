package com.google.android.gms.internal.ads;

import defpackage.lfo;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgph implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zziof c;

    public zzgph(zzinv zzinvVar, zzinv zzinvVar2, zzinx zzinxVar) {
        this.a = zzinvVar;
        this.b = zzinxVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new lfo((zzgmd) this.a.zzb(), (ExecutorService) this.b.zzb(), (zzgrh) this.c.zzb());
    }
}
