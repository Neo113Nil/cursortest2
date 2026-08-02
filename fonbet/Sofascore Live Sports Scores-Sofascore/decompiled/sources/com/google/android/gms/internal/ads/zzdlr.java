package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdlr implements zzinw {
    public final zziof a;
    public final zzioi b;
    public final zzczc c;

    public zzdlr(zzinv zzinvVar, zzioi zzioiVar, zzczc zzczcVar) {
        this.a = zzinvVar;
        this.b = zzioiVar;
        this.c = zzczcVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlq((Context) this.a.zzb(), this.b.zzb(), this.c.a());
    }
}
