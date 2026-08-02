package com.bytedance.sdk.component.kj.pcc;

import android.os.Handler;
import defpackage.jd;
import defpackage.pzm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class wh {
    public final Handler pcc;

    public wh(Handler handler) {
        this.pcc = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oo(Runnable runnable) {
        Handler handler = this.pcc;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vj(Runnable runnable) {
        Handler handler = this.pcc;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void gm(Runnable runnable) {
        vj.pcc().pcc(runnable);
    }

    public void pcc(Runnable runnable, long j) {
        if (pcc()) {
            gm(new jd(this, runnable, j, 7));
            return;
        }
        Handler handler = this.pcc;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public abstract boolean pcc();

    public void sf(Runnable runnable) {
        if (pcc()) {
            gm(new pzm(this, runnable, 1));
            return;
        }
        Handler handler = this.pcc;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sf(Runnable runnable, long j) {
        Handler handler = this.pcc;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public void pcc(Runnable runnable) {
        if (pcc()) {
            gm(new pzm(this, runnable, 0));
            return;
        }
        Handler handler = this.pcc;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
