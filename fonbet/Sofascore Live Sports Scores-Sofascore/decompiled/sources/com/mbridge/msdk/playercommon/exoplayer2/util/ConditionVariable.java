package com.mbridge.msdk.playercommon.exoplayer2.util;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ConditionVariable {
    private boolean isOpen;

    public synchronized boolean block(long j) throws InterruptedException {
        boolean z;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        while (true) {
            z = this.isOpen;
            if (z || elapsedRealtime >= j2) {
                break;
            }
            wait(j2 - elapsedRealtime);
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        return z;
    }

    public synchronized boolean close() {
        boolean z;
        z = this.isOpen;
        this.isOpen = false;
        return z;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }
}
