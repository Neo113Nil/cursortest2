package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzq implements Callable {
    public final long a;

    public zzq(long j) {
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.b.remove(Long.valueOf(this.a)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.zzt.zzh().d("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
