package com.google.android.gms.internal.ads;

import defpackage.ddo;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzghg implements zzinw {
    public final zzinx a;
    public final zzinv b;
    public final zzinv c;
    public final zzinx d;
    public final zzinv e;

    public zzghg(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinx zzinxVar, zzinx zzinxVar2) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzinxVar2;
        this.e = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzghf((zzgei) this.a.a, (ddo) this.b.zzb(), (zzggv) this.c.zzb(), (ExecutorService) this.d.a, (zzgrh) this.e.zzb());
    }
}
