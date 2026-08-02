package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import defpackage.sdo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgkg implements zzinw {
    public final zzinx a;
    public final zziof b;
    public final zzinv c;
    public final zzinx d;
    public final zziof e;

    public zzgkg(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinx zzinxVar, zzinx zzinxVar2) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzinxVar2;
        this.e = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new sdo((zzaya) this.a.a, (zzgiw) this.b.zzb(), (DisplayMetrics) this.c.zzb(), (View) this.d.a, (zzgrh) this.e.zzb());
    }
}
