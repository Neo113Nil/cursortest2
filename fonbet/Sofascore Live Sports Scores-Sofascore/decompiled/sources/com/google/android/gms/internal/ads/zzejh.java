package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzejh implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zzejp c;
    public final zziof d;
    public final zziof e;
    public final zziof f;

    public zzejh(zziof zziofVar, zziof zziofVar2, zzejp zzejpVar, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zzejpVar;
        this.d = zziofVar3;
        this.e = zziofVar4;
        this.f = zziofVar5;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzccd zzccdVar = new zzccd();
        zzcob zzcobVar = (zzcob) ((zzcow) this.b).a.a;
        zzioe.a(zzcobVar);
        zzejo zzejoVar = new zzejo(((zzcpi) this.c.a).zzb());
        ArrayDeque arrayDeque = (ArrayDeque) this.d.zzb();
        new zzejl();
        return new zzejg(a, hsnVar, zzccdVar, zzcobVar, zzejoVar, arrayDeque, (zzfrj) this.e.zzb(), (zzcny) this.f.zzb());
    }
}
