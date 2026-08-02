package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahp extends zzagv {
    public final long b;

    public zzahp(zzagi zzagiVar, long j) {
        super(zzagiVar);
        zzguk.a(zzagiVar.zzn() >= j);
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzagi
    public final long zzm() {
        return super.zzm() - this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzagi
    public final long zzn() {
        return super.zzn() - this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzagi
    public final long zzo() {
        return super.zzo() - this.b;
    }
}
