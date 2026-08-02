package com.google.android.gms.internal.ads;

import defpackage.cun;
import defpackage.ddb;
import defpackage.fjn;
import defpackage.hsn;
import defpackage.olo;
import defpackage.vlo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdsr implements zzdej {
    public final zzdqr a;
    public final zzdqv b;
    public final Executor c;
    public final hsn d;

    public zzdsr(zzdqr zzdqrVar, zzdqv zzdqvVar, Executor executor, hsn hsnVar) {
        this.a = zzdqrVar;
        this.b = zzdqvVar;
        this.c = executor;
        this.d = hsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        ddb ddbVar;
        ddb ddbVar2;
        zzcgo zzcgoVar;
        if (this.b.e) {
            zzdqr zzdqrVar = this.a;
            zzeml k = zzdqrVar.k();
            if (k == null) {
                synchronized (zzdqrVar) {
                    ddbVar = zzdqrVar.m;
                }
                if (ddbVar != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x6)).booleanValue()) {
                    synchronized (zzdqrVar) {
                        ddbVar2 = zzdqrVar.m;
                    }
                    synchronized (zzdqrVar) {
                        zzcgoVar = zzdqrVar.n;
                    }
                    if (ddbVar2 == null || zzcgoVar == null) {
                        return;
                    }
                    olo oloVar = new olo(zzgxm.y(new ddb[]{ddbVar2, zzcgoVar}), false);
                    oloVar.addListener(new vlo(0, oloVar, new fjn(this, 9)), this.d);
                    return;
                }
            }
            if (k != null) {
                zzclm j = zzdqrVar.j();
                zzclm h = zzdqrVar.h();
                if (j == null) {
                    j = h == null ? null : h;
                }
                if (j != null) {
                    this.c.execute(new cun(j, 5));
                }
            }
        }
    }
}
