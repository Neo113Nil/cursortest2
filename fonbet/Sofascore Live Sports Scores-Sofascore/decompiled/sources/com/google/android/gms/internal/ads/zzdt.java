package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdt {
    public boolean a;

    public zzdt() {
        throw null;
    }

    public final synchronized boolean a() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        if (j > 0) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = j + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    b();
                } else {
                    boolean z = false;
                    while (!this.a && elapsedRealtime < j2) {
                        try {
                            wait(j2 - elapsedRealtime);
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.a;
    }
}
