package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzgbp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbq {
    public HandlerThread a = null;
    public zzgbp b = null;
    public int c = 0;
    public final Object d = new Object();

    public final Looper zza() {
        Looper looper;
        Object obj = this.d;
        synchronized (obj) {
            try {
                int i = this.c;
                HandlerThread handlerThread = this.a;
                if (i != 0) {
                    Preconditions.j(handlerThread, "Invalid state: handlerThread should already been initialized.");
                } else if (handlerThread == null) {
                    zze.zza("Starting the looper thread.");
                    HandlerThread handlerThread2 = new HandlerThread("LooperProvider");
                    this.a = handlerThread2;
                    handlerThread2.start();
                    this.b = new zzgbp(this.a.getLooper());
                    zze.zza("Looper thread started.");
                } else {
                    zze.zza("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.c++;
                looper = this.a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final Handler zzb() {
        return this.b;
    }
}
