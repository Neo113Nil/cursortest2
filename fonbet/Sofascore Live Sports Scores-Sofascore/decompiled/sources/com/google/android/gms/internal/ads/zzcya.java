package com.google.android.gms.internal.ads;

import defpackage.anf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcya implements zzdfd, zzbfg, zzdir {
    public final zzfld a;
    public final zzdeh b;
    public final zzdfm c;
    public final zzdgi f;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    public zzcya(zzfld zzfldVar, zzdeh zzdehVar, zzdfm zzdfmVar, zzdgi zzdgiVar) {
        this.a = zzfldVar;
        this.b = zzdehVar;
        this.c = zzdfmVar;
        this.f = zzdgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void A(zzbff zzbffVar) {
        int i = this.a.e;
        if (i == 1) {
            if (zzbffVar.j && this.d.compareAndSet(false, true)) {
                this.b.zza();
            }
        } else if (i == 4 && zzbffVar.j && this.g.compareAndSet(false, true)) {
            this.f.zza();
        }
        if (zzbffVar.j && this.e.compareAndSet(false, true)) {
            zzdfm zzdfmVar = this.c;
            synchronized (zzdfmVar) {
                zzdfmVar.p0(anf.d);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void D() {
        if (this.a.e == 4 && this.d.compareAndSet(false, true)) {
            this.b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzg() {
        int i = this.a.e;
        if (i == 1 || i == 4) {
            return;
        }
        if (this.d.compareAndSet(false, true)) {
            this.b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void M() {
    }
}
