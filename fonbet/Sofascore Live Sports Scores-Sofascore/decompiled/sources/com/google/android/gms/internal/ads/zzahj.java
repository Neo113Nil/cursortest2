package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzahj implements zzahk {
    public final long a;
    public final zzahi b;

    public zzahj(long j, long j2) {
        this.a = j;
        zzahl zzahlVar = j2 == 0 ? zzahl.c : new zzahl(0L, j2);
        this.b = new zzahi(zzahlVar, zzahlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return false;
    }
}
