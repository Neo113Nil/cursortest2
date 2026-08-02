package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.qpn;
import defpackage.u2o;
import defpackage.x2o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzecd implements u2o {
    public final long a;
    public final zzeui b;

    public zzecd(long j, Context context, zzebw zzebwVar, zzcob zzcobVar, String str) {
        this.a = j;
        qpn j2 = zzcobVar.j();
        j2.c = context;
        j2.e = new com.google.android.gms.ads.internal.client.zzr();
        j2.i(str);
        zzeui a = j2.c().a();
        this.b = a;
        a.zzg(new x2o(this, zzebwVar));
    }

    @Override // defpackage.u2o
    public final void a(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.b.zzd(zzmVar);
    }

    @Override // defpackage.u2o
    public final void zzb() {
        this.b.zzQ(new ObjectWrapper(null));
    }

    @Override // defpackage.u2o
    public final void zzc() {
        this.b.zzb();
    }
}
