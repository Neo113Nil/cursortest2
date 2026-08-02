package com.bytedance.sdk.openadsdk.qy.sf;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class sf {
    protected final AtomicBoolean gm;
    private final Integer kj;
    private final AtomicLong oo;
    protected WeakReference<View> pcc;
    private final int qf;
    protected of sf;
    private final AtomicBoolean vj;
    private volatile boolean vy = false;
    private final vj.pcc wh;

    public sf(Integer num, View view, of ofVar, int i, vj.pcc pccVar) {
        this.kj = num;
        this.qf = i;
        this.sf = ofVar;
        this.wh = pccVar;
        pcc(view);
        this.gm = new AtomicBoolean(false);
        this.oo = new AtomicLong(-1L);
        this.vj = new AtomicBoolean(false);
    }

    public abstract boolean gm();

    public void hc() {
        this.gm.set(false);
        kj();
    }

    public void kj() {
        this.oo.set(-1L);
    }

    public void oo() {
        if (this.vj.compareAndSet(false, true)) {
            oo.pcc(this.sf, vj(), this.wh);
        }
    }

    public void ork() {
        this.vy = true;
        qf.sf(this);
    }

    public void pcc(int i) {
        if (i == 4) {
            pcc();
            return;
        }
        if (i == 8) {
            hc();
        } else if (i == 9) {
            oo();
        } else {
            sf(i);
        }
    }

    public void qf() {
        if (vy()) {
            return;
        }
        if (!this.gm.get()) {
            kj();
        } else if (!this.oo.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.oo.get() >= this.qf) {
            oo();
        }
    }

    public int sf() {
        if (vy()) {
            return 1;
        }
        WeakReference<View> weakReference = this.pcc;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.vy) {
            return 3;
        }
        if (vh().equals(view.getTag(33554433))) {
            return (vh().equals(view.getTag(33554433)) && gm()) ? 1 : 2;
        }
        ork();
        vj.sf(vh());
        return 3;
    }

    public abstract void sf(int i);

    public boolean tmg() {
        return this.gm.get();
    }

    public Integer vh() {
        return this.kj;
    }

    public pcc vj() {
        WeakReference<View> weakReference = this.pcc;
        if (weakReference == null) {
            return new pcc(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new pcc(0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new pcc(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public boolean vy() {
        return this.vj.get();
    }

    public abstract int wh();

    public void pcc() {
        if (this.gm.compareAndSet(false, true)) {
            qf.pcc(this);
        }
    }

    public static sf pcc(boolean z, Integer num, View view, of ofVar, vj.pcc pccVar) {
        return z ? new kj(num, view, ofVar, pccVar) : new gm(num, view, ofVar, pccVar);
    }

    public void pcc(View view) {
        if (view != null) {
            view.setTag(33554433, vh());
        }
        this.pcc = new WeakReference<>(view);
    }
}
