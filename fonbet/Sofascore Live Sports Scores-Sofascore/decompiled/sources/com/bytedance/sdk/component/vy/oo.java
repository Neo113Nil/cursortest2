package com.bytedance.sdk.component.vy;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.lo;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends gm {
    private final long gm;
    private float kj;
    private final Context oo;
    private String ork;
    private final View.OnTouchListener pcc;
    private long qf = -1;
    private final int sf;
    private final qf vj;
    private float vy;
    private View.OnTouchListener wh;

    public oo(Context context, View.OnTouchListener onTouchListener, int i, long j, qf qfVar) {
        this.oo = context;
        this.pcc = onTouchListener;
        this.sf = i;
        this.gm = j;
        this.vj = qfVar;
    }

    private void pcc(int i, float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i);
            jSONObject2.put("click_x", f);
            jSONObject2.put("click_y", f2);
            jSONObject.put("lp_click_type", this.sf);
            jSONObject.put("lp_click_interval", this.gm);
        } catch (Throwable th) {
            lo.pcc("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th);
        }
        if (com.bytedance.sdk.component.vy.pcc.pcc.pcc().sf() != null) {
            com.bytedance.sdk.component.vy.pcc.sf sf = com.bytedance.sdk.component.vy.pcc.pcc.pcc().sf();
            qf qfVar = this.vj;
            sf.pcc(qfVar != null ? qfVar.getMaterialMeta() : null, this.ork, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        oo ooVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            ooVar = this;
            ooVar.kj = x;
            ooVar.vy = y;
        } else if (action != 1) {
            ooVar = this;
        } else {
            ooVar = this;
            if (ooVar.pcc(x, y, this.kj, this.vy, this.oo)) {
                if (ooVar.pcc(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    ooVar.pcc(1, x, y);
                } else {
                    ooVar.pcc(0, x, y);
                }
            }
        }
        View.OnTouchListener onTouchListener = ooVar.pcc;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = ooVar.wh;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private boolean pcc(long j) {
        long j2 = this.qf;
        if (j2 == -1) {
            this.qf = j;
            return false;
        }
        int i = this.sf;
        if (i == 1) {
            if (j - j2 <= this.gm) {
                return true;
            }
            this.qf = j;
            return false;
        }
        if (i == 2) {
            if (j - j2 <= this.gm) {
                this.qf = j;
                return true;
            }
            this.qf = j;
        }
        return false;
    }

    public void pcc(String str) {
        this.ork = str;
    }

    @Override // com.bytedance.sdk.component.vy.gm
    public void pcc(View.OnTouchListener onTouchListener) {
        this.wh = onTouchListener;
    }
}
