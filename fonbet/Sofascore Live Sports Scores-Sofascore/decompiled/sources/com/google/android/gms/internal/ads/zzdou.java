package com.google.android.gms.internal.ads;

import defpackage.szn;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdou implements zzinw {
    public final zzioa a;
    public final zzioa b;
    public final zzioa c;
    public final zzinv d;
    public final zzdoy e;

    public zzdou(zzioa zzioaVar, zzioa zzioaVar2, zzioa zzioaVar3, zzinv zzinvVar, zzdoy zzdoyVar) {
        this.a = zzioaVar;
        this.b = zzioaVar2;
        this.c = zzioaVar3;
        this.d = zzinvVar;
        this.e = zzdoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Map zzb = this.a.zzb();
        Map zzb2 = this.b.zzb();
        Map zzb3 = this.c.zzb();
        zzdrb zzdrbVar = this.e.a.a;
        zzioe.a(zzdrbVar);
        return new szn(zzb, zzb2, zzb3, this.d, zzdrbVar);
    }
}
