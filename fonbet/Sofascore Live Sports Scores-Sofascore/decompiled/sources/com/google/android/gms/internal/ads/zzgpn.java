package com.google.android.gms.internal.ads;

import defpackage.nfo;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgpn implements zzinw {
    public final zzinv a;
    public final zzinv b;
    public final zzinv c;
    public final zziof d;
    public final zziof e;

    public zzgpn(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, zzinx zzinxVar) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinvVar3;
        this.d = zzinxVar;
        this.e = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new nfo((zzgfw) this.a.zzb(), (zzgfw) this.b.zzb(), zzinv.b(this.c), (ExecutorService) this.d.zzb(), (zzgrh) this.e.zzb());
    }
}
