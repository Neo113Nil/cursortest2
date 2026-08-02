package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeor implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zzinx c;

    public zzeor(zzinv zzinvVar, zzcpa zzcpaVar, zzinx zzinxVar) {
        this.a = zzinvVar;
        this.b = zzcpaVar;
        this.c = zzinxVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context context = (Context) this.a.zzb();
        VersionInfoParcel a = ((zzcpa) this.b).a();
        zzdoe zzdoeVar = (zzdoe) this.c.a;
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzeoq(context, a, zzdoeVar, hsnVar);
    }
}
