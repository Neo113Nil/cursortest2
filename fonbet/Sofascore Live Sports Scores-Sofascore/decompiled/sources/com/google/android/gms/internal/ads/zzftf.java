package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzftf implements zzinw {
    public final zzcok a;
    public final zzinv b;
    public final zziof c;
    public final zzinv d;
    public final zzinv e;
    public final zzinv f;

    public zzftf(zzcok zzcokVar, zzinv zzinvVar, zziof zziofVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4) {
        this.a = zzcokVar;
        this.b = zzinvVar;
        this.c = zziofVar;
        this.d = zzinvVar2;
        this.e = zzinvVar3;
        this.f = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = this.a.a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfte(a, hsnVar, (zzhdj) this.b.zzb(), (zzu) this.c.zzb(), (zzfsw) this.d.zzb(), (zzfrj) this.e.zzb(), (zzcny) this.f.zzb());
    }
}
