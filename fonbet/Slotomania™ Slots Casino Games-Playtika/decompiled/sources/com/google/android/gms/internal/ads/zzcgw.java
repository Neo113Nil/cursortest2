package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzcgw implements Runnable {
    zzcgw(zzcgy zzcgyVar) {
        Objects.requireNonNull(zzcgyVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
