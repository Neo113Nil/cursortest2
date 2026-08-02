package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.sdo;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgjw implements zzinw {
    public final zzinx a;
    public final zziof b;
    public final zzinx c;
    public final zziof d;
    public final zziof e;

    public zzgjw(zzinv zzinvVar, zzinv zzinvVar2, zzinx zzinxVar, zzinx zzinxVar2, zzinx zzinxVar3) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinxVar2;
        this.d = zzinxVar3;
        this.e = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new sdo((zzaya) this.a.a, (zzgiw) this.b.zzb(), (Map) this.c.a, (Context) this.d.zzb(), (zzgrh) this.e.zzb());
    }
}
