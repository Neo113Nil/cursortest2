package com.google.android.gms.internal.ads;

import defpackage.fff;
import defpackage.igf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzczg implements com.google.android.gms.ads.internal.overlay.zzr {
    public final zzdew a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public zzczg(zzdew zzdewVar) {
        this.a = zzdewVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.a.p0(igf.e);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
        this.b.set(true);
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.a.p0(igf.e);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        this.a.p0(fff.g);
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
