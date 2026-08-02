package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafn implements zzahk {
    public final zzafq a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public zzafn(zzafq zzafqVar, long j, long j2, long j3, long j4, long j5) {
        this.a = zzafqVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        zzahl zzahlVar = new zzahl(j, zzafp.a(this.a.c(j), 0L, this.c, this.d, this.e, this.f));
        return new zzahi(zzahlVar, zzahlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }
}
