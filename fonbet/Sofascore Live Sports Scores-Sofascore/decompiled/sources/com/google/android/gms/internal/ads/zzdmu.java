package com.google.android.gms.internal.ads;

import defpackage.b0a;
import defpackage.wbo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdmu implements com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.ads.internal.client.zza {
    public final zzdxs a;
    public final zzflg b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public zzdmu(zzdxs zzdxsVar, zzflg zzflgVar) {
        this.a = zzdxsVar;
        this.b = zzflgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzdxs zzdxsVar = this.a;
        if (zzdxsVar.b.get()) {
            zzgdh zzgdhVar = zzdxsVar.a;
            zzgtp.a(zzgdhVar.a, zzgdhVar.b, new wbo(zzgdhVar, null, 1));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
        if (this.c.getAndSet(true)) {
            return;
        }
        zzdxs zzdxsVar = this.a;
        if (zzdxsVar.b.getAndSet(false)) {
            zzgdh zzgdhVar = zzdxsVar.a;
            zzgtp.a(zzgdhVar.a, zzgdhVar.b, new wbo(zzgdhVar, null, 2));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
        if (this.c.getAndSet(true)) {
            return;
        }
        zzdxs zzdxsVar = this.a;
        if (zzdxsVar.b.getAndSet(false)) {
            zzgdh zzgdhVar = zzdxsVar.a;
            zzgtp.a(zzgdhVar.a, zzgdhVar.b, new wbo(zzgdhVar, null, 2));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        String str = this.b.b;
        boolean U = b0a.U(str);
        zzdxs zzdxsVar = this.a;
        if (U) {
            zzdxsVar.getClass();
            return;
        }
        if (!zzdxsVar.c.get() || zzdxsVar.b.getAndSet(true)) {
            return;
        }
        zzgdh zzgdhVar = zzdxsVar.a;
        str.getClass();
        zzgtp.a(zzgdhVar.a, zzgdhVar.b, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(zzgdhVar, str, null, 23));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}
