package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzage implements zzaht {
    public final byte[] a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaht
    public final int c(zzj zzjVar, int i, boolean z) {
        int b = zzjVar.b(0, Math.min(4096, i), this.a);
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        a70.q();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void g(zzeu zzeuVar, int i, int i2) {
        zzeuVar.E(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void e(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void f(long j, int i, int i2, int i3, zzahs zzahsVar) {
    }
}
