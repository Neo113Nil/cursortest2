package com.bytedance.adsdk.ugeno.core.sf;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public String pcc = "GesThrough_";
    private List<MotionEvent> sf = new ArrayList();
    private Set<String> gm = Collections.synchronizedSet(new HashSet());

    public void pcc(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.sf == null) {
            return;
        }
        this.pcc = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (motionEvent.getAction() == 0) {
            pcc();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(i, i2);
        this.sf.add(obtain);
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent) {
        if (gmVar == null || motionEvent == null || this.sf == null) {
            return;
        }
        pcc(gmVar.vh(), gmVar.pq(), motionEvent);
    }

    public boolean pcc(MotionEvent motionEvent) {
        if (motionEvent == null || this.gm == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.gm.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        if (this.sf.isEmpty() || this.gm == null || gmVar == null || gmVar.vh() == null || gmVar.vh().getRootView() == null) {
            return;
        }
        pcc(gmVar.vh());
    }

    public void pcc(View view) {
        if (this.sf.isEmpty() || this.gm == null || view == null || view.getRootView() == null) {
            return;
        }
        final View rootView = view.getRootView();
        this.sf.size();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.sf.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : pcc.this.sf) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        pcc.this.gm.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                pcc.this.pcc();
            }
        }, 300L);
    }

    public void pcc() {
        List<MotionEvent> list = this.sf;
        if (list != null) {
            list.clear();
        }
    }
}
