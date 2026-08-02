package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznp implements zzmf {
    public boolean a;
    public long b;
    public long c;
    public zzav d;

    public final void a(long j) {
        this.b = j;
        if (this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void e(zzav zzavVar) {
        if (this.a) {
            a(zzg());
        }
        this.d = zzavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final long zzg() {
        long j = this.b;
        if (!this.a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        return (this.d.a == 1.0f ? zzfm.u(elapsedRealtime) : elapsedRealtime * r6.c) + j;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final zzav zzj() {
        return this.d;
    }
}
