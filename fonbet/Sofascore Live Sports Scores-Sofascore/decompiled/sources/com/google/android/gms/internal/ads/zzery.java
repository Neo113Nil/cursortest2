package com.google.android.gms.internal.ads;

import android.view.View;
import defpackage.pff;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzery implements com.google.android.gms.ads.internal.zzg {
    public final zzddn a;
    public final zzdeh b;
    public final zzdly c;
    public final zzdlq d;
    public final zzcuy e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public zzery(zzddn zzddnVar, zzdeh zzdehVar, zzdly zzdlyVar, zzdlq zzdlqVar, zzcuy zzcuyVar) {
        this.a = zzddnVar;
        this.b = zzdehVar;
        this.c = zzdlyVar;
        this.d = zzdlqVar;
        this.e = zzcuyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.f.compareAndSet(false, true)) {
            this.e.j();
            this.d.q0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.f.get()) {
            this.a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.f.get()) {
            this.b.zza();
            zzdly zzdlyVar = this.c;
            synchronized (zzdlyVar) {
                zzdlyVar.p0(pff.g);
            }
        }
    }
}
