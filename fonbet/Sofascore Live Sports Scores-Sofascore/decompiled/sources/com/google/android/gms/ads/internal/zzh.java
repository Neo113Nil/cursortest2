package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfzg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzh implements zzfzg {
    public final /* synthetic */ zzk a;

    public zzh(zzk zzkVar) {
        this.a = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final void zza(int i, long j) {
        this.a.h.b(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final void zzb(int i, long j, String str) {
        this.a.h.e(i, System.currentTimeMillis() - j, null, null, str);
    }
}
