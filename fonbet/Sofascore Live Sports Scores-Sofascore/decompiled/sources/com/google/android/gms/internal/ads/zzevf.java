package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.ddb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzevf implements zzfdi {
    public final Clock a;
    public final zzflw b;
    public final long c;

    public zzevf(Clock clock, zzflw zzflwVar, long j) {
        this.a = clock;
        this.b = zzflwVar;
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return zzhcy.a(new zzevg(this.b, this.a.a(), this.c));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 4;
    }
}
