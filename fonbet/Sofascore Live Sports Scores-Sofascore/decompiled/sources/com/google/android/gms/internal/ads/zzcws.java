package com.google.android.gms.internal.ads;

import defpackage.qio;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcws implements zzinw {
    public final zzcxw a;

    public zzcws(zzcxw zzcxwVar) {
        this.a = zzcxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Object obj;
        zzcxw zzcxwVar = this.a;
        zzcxv zzcxvVar = new zzcxv(zzcxwVar.a.a.d, (Executor) zzcxwVar.b.zzb());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ne)).booleanValue()) {
            zzdlo zzdloVar = new zzdlo(zzcxvVar, zzcgj.a);
            int i = zzgxw.c;
            obj = new qio(zzdloVar);
        } else {
            int i2 = zzgxw.c;
            obj = t.j;
        }
        zzioe.a(obj);
        return obj;
    }
}
