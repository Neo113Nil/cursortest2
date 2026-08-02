package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfas implements zzinw {
    public final zzcwb a;
    public final zzinv b;
    public final zzioi c;

    public zzfas(zzcwb zzcwbVar, zzinv zzinvVar, zzioi zzioiVar) {
        this.a = zzcwbVar;
        this.b = zzinvVar;
        this.c = zzioiVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfaq zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfaq(hsnVar, this.a.a.a, (Context) this.b.zzb(), this.c.zzb());
    }
}
