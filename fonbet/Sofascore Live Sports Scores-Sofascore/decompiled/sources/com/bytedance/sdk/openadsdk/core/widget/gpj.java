package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gpj {
    private float oo;
    private final pcc pcc;
    private int qf;
    private boolean vh;
    private float vj;
    private int wh;
    private final boolean sf = false;
    private boolean gm = false;
    private boolean kj = true;
    private boolean vy = false;
    private final View.OnTouchListener ork = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.gpj.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (gpj.this.pcc.of()) {
                return !gpj.this.gm;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                gpj gpjVar = gpj.this;
                gpjVar.vh = gpjVar.pcc(motionEvent);
                gpj.this.oo = x;
                gpj.this.vj = y;
                gpj.this.wh = (int) x;
                gpj.this.qf = (int) y;
                gpj.this.kj = true;
                if (gpj.this.pcc != null && gpj.this.gm) {
                    gpj.this.pcc.pcc(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - gpj.this.wh) > 20.0f || Math.abs(y - gpj.this.qf) > 20.0f) {
                    gpj.this.kj = false;
                }
                gpj.this.kj = true;
                gpj.this.vy = false;
                gpj.this.oo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                gpj.this.vj = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                gpj.this.wh = 0;
                if (gpj.this.pcc != null) {
                    gpj.this.pcc.pcc(view, gpj.this.kj);
                }
                gpj.this.vh = false;
            } else if (action == 3) {
                gpj.this.vh = false;
            }
            return !gpj.this.gm;
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        boolean of();

        void pcc(View view, boolean z);
    }

    public gpj(pcc pccVar) {
        this.pcc = pccVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int gm = rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc().getApplicationContext());
        int vj = rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = gm;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = vj;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }

    public void pcc(View view) {
        if (view != null) {
            view.setOnTouchListener(this.ork);
        }
    }

    public void pcc(boolean z) {
        this.gm = z;
    }
}
