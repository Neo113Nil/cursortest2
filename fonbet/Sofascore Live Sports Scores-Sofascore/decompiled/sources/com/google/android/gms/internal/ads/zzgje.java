package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import defpackage.sdo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgje implements zzinw {
    public final zzinx a;
    public final zziof b;
    public final zzinx c;
    public final zzinx d;
    public final zziof e;

    public zzgje(zzinv zzinvVar, zzinv zzinvVar2, zzinx zzinxVar, zzinx zzinxVar2, zzinx zzinxVar3) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinxVar2;
        this.d = zzinxVar3;
        this.e = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new sdo((zzaya) this.a.a, (zzgiw) this.b.zzb(), (View) this.c.a, (Activity) this.d.a, (zzgrh) this.e.zzb());
    }
}
