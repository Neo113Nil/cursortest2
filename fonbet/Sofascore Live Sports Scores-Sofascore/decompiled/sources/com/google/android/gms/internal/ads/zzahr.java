package com.google.android.gms.internal.ads;

import defpackage.mfn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahr implements zzagk {
    public final long a;
    public final zzagk b;

    public zzahr(long j, zzagk zzagkVar) {
        this.a = j;
        this.b = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final zzaht b(int i, int i2) {
        return this.b.b(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void c(zzahk zzahkVar) {
        this.b.c(new mfn(this, zzahkVar, zzahkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzv() {
        this.b.zzv();
    }
}
