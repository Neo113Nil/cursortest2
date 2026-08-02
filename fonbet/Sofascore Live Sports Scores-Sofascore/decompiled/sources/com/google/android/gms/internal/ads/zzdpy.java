package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdpy implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zziof c;
    public final zziof d;

    public zzdpy(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinvVar3;
        this.d = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbfd zzbfdVar = (zzbfd) this.a.zzb();
        Executor executor = (Executor) this.b.zzb();
        Context context = (Context) this.c.zzb();
        return new zzcvi(executor, new zzcuu(context, zzbfdVar), (Clock) this.d.zzb());
    }
}
