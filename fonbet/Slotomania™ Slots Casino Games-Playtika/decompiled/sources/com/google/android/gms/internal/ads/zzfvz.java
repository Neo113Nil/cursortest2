package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzfvz implements Runnable {
    zzfvz() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfwc.zzc;
        if (handler != null) {
            handler2 = zzfwc.zzc;
            runnable = zzfwc.zzk;
            handler2.post(runnable);
            handler3 = zzfwc.zzc;
            runnable2 = zzfwc.zzl;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
