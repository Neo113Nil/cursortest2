package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzas;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c implements zzas {
    public long a;

    @Override // com.google.android.gms.cast.internal.zzas
    public final void a(String str, long j, String str2) {
        throw new IllegalStateException("No GoogleApiClient available");
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final long zzc() {
        long j = this.a + 1;
        this.a = j;
        return j;
    }
}
