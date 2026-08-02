package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.nn;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends com.bytedance.adsdk.ugeno.wh.pcc<View> implements tsz.pcc {
    private sf kj;
    private final Handler oo;
    private final Runnable ork;
    private boolean qf;
    private final ViewTreeObserver.OnScrollChangedListener vh;
    private long vj;
    private pcc vy;
    private boolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(boolean z);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc(boolean z);
    }

    public wh(Context context) {
        super(context);
        this.oo = new tsz(jr.sf().getLooper(), this);
        this.wh = true;
        this.qf = true;
        this.ork = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oo.wh.1
            @Override // java.lang.Runnable
            public void run() {
                if (wh.this.vy != null) {
                    wh.this.vy.pcc(wh.this.qf);
                }
            }
        };
        this.vh = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.wh.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - wh.this.vj > 500) {
                    wh.this.vj = elapsedRealtime;
                    wh.this.oo.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    private void qf() {
        boolean pcc2 = nn.pcc(this, 50, -1, false);
        this.qf = pcc2;
        if (pcc2 == this.wh) {
            return;
        }
        this.wh = pcc2;
        rnn.pcc(this.ork);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.vh);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.vh);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        sf sfVar = this.kj;
        if (sfVar != null) {
            sfVar.pcc(z);
        }
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        if (message.what == 1) {
            qf();
        }
    }

    public void setSwiperVisibleChangeListener(pcc pccVar) {
        this.vy = pccVar;
    }

    public void setSwiperWindowFocusChangedListener(sf sfVar) {
        this.kj = sfVar;
    }

    @Override // com.bytedance.adsdk.ugeno.wh.pcc
    public View vh(int i) {
        return (View) this.pcc.get(i);
    }
}
