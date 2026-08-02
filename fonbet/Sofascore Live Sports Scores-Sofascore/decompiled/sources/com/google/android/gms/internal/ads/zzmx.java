package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmx {
    public final Object a;
    public Looper b;
    public HandlerThread c;
    public int d;

    public zzmx(int i) {
        this.a = new Object();
        this.b = null;
        this.c = null;
        this.d = 0;
    }

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.a) {
            try {
                zzguk.f(this.d > 0);
                int i = this.d - 1;
                this.d = i;
                if (i == 0 && (handlerThread = this.c) != null) {
                    handlerThread.quit();
                    this.c = null;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzmx() {
        throw null;
    }
}
