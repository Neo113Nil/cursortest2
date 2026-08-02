package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfqx implements zzinw {
    public final zzcok a;
    public final zzcpa b;
    public final zzinv c;
    public final zzinv d;

    public zzfqx(zzcok zzcokVar, zzcpa zzcpaVar, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzcokVar;
        this.b = zzcpaVar;
        this.c = zzinvVar;
        this.d = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = this.a.a();
        VersionInfoParcel a2 = this.b.a();
        zzdxx zzdxxVar = (zzdxx) this.c.zzb();
        new zzejl();
        return new zzfrj(a, a2, zzdxxVar, new zzccd(), (zzcny) this.d.zzb());
    }
}
