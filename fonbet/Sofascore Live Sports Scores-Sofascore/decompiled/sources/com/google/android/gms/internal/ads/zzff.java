package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.d8o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzff implements zzdp {
    @Override // com.google.android.gms.internal.ads.zzdp
    public final d8o a(Looper looper, Handler.Callback callback) {
        return new d8o(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zzc() {
        return System.nanoTime();
    }
}
