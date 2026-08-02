package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.ilg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcke implements zzmc {
    public final zzabv a = new zzabv();
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void a(zzmb zzmbVar, zzabe[] zzabeVarArr) {
        int i;
        this.f = 0;
        for (zzabe zzabeVar : zzabeVarArr) {
            if (zzabeVar != null) {
                int i2 = this.f;
                int i3 = zzabeVar.zza().c;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = C.DEFAULT_VIDEO_BUFFER_SIZE;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        ilg.c();
                        return;
                    }
                } else {
                    i = 131072000;
                }
                this.f = i2 + i;
            }
        }
        this.a.b(this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean b(zzmb zzmbVar) {
        int i;
        long j = zzmbVar.d;
        boolean z = true;
        char c = j > this.c ? (char) 0 : j < this.b ? (char) 2 : (char) 1;
        zzabv zzabvVar = this.a;
        synchronized (zzabvVar) {
            i = zzabvVar.b * C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i2 = this.f;
        if (c != 2 && (c != 1 || !this.g || i >= i2)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final zzabp c(zzqj zzqjVar) {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void d(zzqj zzqjVar) {
        this.f = 0;
        this.g = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void e(zzqj zzqjVar) {
        this.f = 0;
        this.g = false;
        zzabv zzabvVar = this.a;
        synchronized (zzabvVar) {
            zzabvVar.b(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void f(zzqj zzqjVar) {
        this.f = 0;
        this.g = false;
        zzabv zzabvVar = this.a;
        synchronized (zzabvVar) {
            zzabvVar.b(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean g(zzmb zzmbVar) {
        long j = zzmbVar.f ? this.e : this.d;
        return j <= 0 || zzmbVar.d >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzg() {
    }
}
