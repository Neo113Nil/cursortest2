package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tsx {
    public long pcc;
    private long sf;

    private tsx(boolean z) {
        if (z) {
            vj();
        }
    }

    public static tsx gm() {
        return new tsx(false);
    }

    public static tsx sf() {
        return new tsx(true);
    }

    public long oo() {
        return SystemClock.elapsedRealtime() - this.sf;
    }

    public long pcc(tsx tsxVar) {
        return Math.abs(tsxVar.sf - this.sf);
    }

    public String toString() {
        return String.valueOf(this.pcc);
    }

    public void vj() {
        this.pcc = System.currentTimeMillis();
        this.sf = SystemClock.elapsedRealtime();
    }

    public boolean wh() {
        return this.sf > 0;
    }

    public long pcc() {
        return this.sf;
    }
}
