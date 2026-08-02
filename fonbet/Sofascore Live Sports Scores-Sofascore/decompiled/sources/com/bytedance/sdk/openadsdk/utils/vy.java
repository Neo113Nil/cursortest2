package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy implements gbb, Runnable {
    private boolean kj;
    private final pcc qf;
    private final Activity sf;
    private long vj;
    private jr vy;
    private boolean wh;
    private int oo = 5000;
    private final AtomicBoolean ork = new AtomicBoolean(false);
    private final Handler gm = new Handler(Looper.getMainLooper());
    private View pcc = vj();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        View pcc();

        void sf();
    }

    private vy(Activity activity, pcc pccVar) {
        this.qf = pccVar;
        this.sf = activity;
    }

    private void kj() {
        ViewParent parent = this.pcc.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.pcc) != r0.getChildCount() - 1) {
                this.pcc.bringToFront();
            }
        }
    }

    private void qf() {
        Activity activity;
        View childAt;
        if (this.wh || (activity = this.sf) == null || activity.isFinishing() || this.sf.isDestroyed()) {
            return;
        }
        View view = this.pcc;
        if (view == null) {
            view = vj();
            this.pcc = view;
        }
        if (view != null) {
            if (sf(view)) {
                pcc(this.pcc);
                View view2 = this.pcc;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.pcc).getChildAt(0)) != null && sf(childAt)) {
                    pcc(childAt);
                }
                pcc pccVar = this.qf;
                if (pccVar != null) {
                    pccVar.sf();
                }
                jr jrVar = this.vy;
                if (jrVar != null) {
                    jrVar.pcc();
                }
            }
            kj();
        }
        this.wh = true;
    }

    private View vj() {
        pcc pccVar = this.qf;
        if (pccVar != null) {
            return pccVar.pcc();
        }
        return null;
    }

    private void wh() {
        this.kj = false;
        this.vj = SystemClock.elapsedRealtime();
        Handler handler = this.gm;
        if (handler != null) {
            handler.postDelayed(this, this.oo);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.gbb
    public void gm() {
        if (this.wh) {
            return;
        }
        this.wh = true;
        Handler handler = this.gm;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.gbb
    public void oo() {
        this.ork.set(false);
        this.kj = false;
        this.wh = false;
        this.oo = 0;
        Handler handler = this.gm;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.gbb
    public void pcc(long j) {
        this.ork.get();
        if (this.ork.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.oo = (int) (this.oo + j);
            wh();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        qf();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.gbb
    public void sf() {
        if (this.vj <= 0 || this.wh) {
            return;
        }
        if (!this.kj) {
            this.oo = (int) (this.oo - (SystemClock.elapsedRealtime() - this.vj));
        }
        this.kj = true;
        if (this.oo <= 0) {
            qf();
            return;
        }
        Handler handler = this.gm;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm(th.getMessage(), new Object[0]);
            }
        }
    }

    public static gbb pcc(Activity activity, pcc pccVar) {
        return new vy(activity, pccVar);
    }

    @Override // com.bytedance.sdk.openadsdk.utils.gbb
    public void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, long j) {
        if (sfVar == null) {
            return;
        }
        if (j < 0) {
            j = 0;
        }
        int pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc(sfVar);
        if (pcc2 >= 0) {
            pcc(pcc2);
            pcc(j);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.gbb
    public void pcc() {
        if (this.vj == 0 || !this.kj) {
            return;
        }
        wh();
    }

    private void pcc(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.utils.gbb
    public void pcc(int i) {
        this.oo = i;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.gbb
    public void pcc(jr jrVar) {
        this.vy = jrVar;
    }

    private boolean sf(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
