package com.bytedance.adsdk.ugeno.core.sf;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.core.jr;
import com.bytedance.adsdk.ugeno.qf.kj;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private pcc dax;
    private boolean gbb;
    private boolean hc;
    private boolean jr;
    private hc ork;
    private Context tmg;
    private String vh;
    private hc vy;
    private int pcc = 0;
    private int sf = Integer.MAX_VALUE;
    private int gm = Integer.MAX_VALUE;
    private AtomicBoolean oo = new AtomicBoolean(true);
    private float vj = Float.MIN_VALUE;
    private float wh = Float.MIN_VALUE;
    private Map<Integer, Float> qf = new HashMap();
    private Map<Integer, Float> kj = new HashMap();

    public vj(Context context, hc hcVar, hc hcVar2, boolean z, boolean z2, boolean z3) {
        this.tmg = context;
        this.vy = hcVar;
        this.ork = hcVar2;
        this.hc = z;
        this.gbb = z2;
        this.jr = z3;
        gm();
    }

    private boolean gm(jr jrVar, com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent, boolean z) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    if (this.vj == Float.MIN_VALUE || this.wh == Float.MIN_VALUE) {
                        return false;
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.hc && Math.abs(x - this.vj) <= 10.0f && Math.abs(y - this.wh) <= 10.0f && jrVar != null) {
                sf();
                jrVar.pcc(this.ork, gmVar, gmVar);
                return true;
            }
            if (this.pcc == 0 && jrVar != null) {
                sf();
                pcc(jrVar, this.vy, gmVar);
                return true;
            }
            int sf = kj.sf(this.tmg, x - this.vj);
            int sf2 = kj.sf(this.tmg, y - this.wh);
            if (TextUtils.equals(this.vh, "up")) {
                sf = -sf2;
            } else if (TextUtils.equals(this.vh, "down")) {
                sf = sf2;
            } else if (TextUtils.equals(this.vh, "left")) {
                sf = -sf;
            } else if (!TextUtils.equals(this.vh, "right")) {
                sf = (int) Math.abs(Math.sqrt(Math.pow(sf2, 2.0d) + Math.pow(sf, 2.0d)));
            }
            if (sf < this.pcc) {
                sf();
                pcc(gmVar);
                return false;
            }
            if (jrVar != null) {
                sf();
                pcc(jrVar, this.vy, gmVar);
                return true;
            }
            sf();
        } else {
            this.vj = motionEvent.getX();
            this.wh = motionEvent.getY();
        }
        return true;
    }

    private void pcc(jr jrVar, hc hcVar, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        if (this.sf <= 0) {
            pcc(gmVar);
            return;
        }
        if (!this.oo.get()) {
            pcc(gmVar);
            return;
        }
        jrVar.pcc(hcVar, gmVar, gmVar);
        int i = this.sf;
        if (i != Integer.MAX_VALUE) {
            this.sf = i - 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r12 != 6) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean sf(jr jrVar, com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                        int pointerId2 = motionEvent.getPointerId(i);
                        if (this.qf.containsKey(Integer.valueOf(pointerId2)) && this.kj.containsKey(Integer.valueOf(pointerId2))) {
                            "ACTION_CANCEL for pointer ".concat(String.valueOf(pointerId2));
                            pcc(pointerId2);
                        }
                    }
                    return false;
                }
                if (actionMasked != 5) {
                }
            }
            if (this.qf.containsKey(Integer.valueOf(pointerId)) && this.kj.containsKey(Integer.valueOf(pointerId))) {
                float floatValue = this.qf.get(Integer.valueOf(pointerId)).floatValue();
                float floatValue2 = this.kj.get(Integer.valueOf(pointerId)).floatValue();
                float x = motionEvent.getX(actionIndex);
                float y = motionEvent.getY(actionIndex);
                if (this.hc && Math.abs(x - floatValue) <= 10.0f && Math.abs(y - floatValue2) <= 10.0f && jrVar != null) {
                    pcc(pointerId);
                    jrVar.pcc(this.ork, gmVar, gmVar);
                    return true;
                }
                if (this.pcc == 0 && jrVar != null) {
                    pcc(pointerId);
                    pcc(jrVar, this.vy, gmVar);
                    return true;
                }
                int sf = kj.sf(this.tmg, x - floatValue);
                int sf2 = kj.sf(this.tmg, y - floatValue2);
                if (TextUtils.equals(this.vh, "up")) {
                    sf = -sf2;
                } else if (TextUtils.equals(this.vh, "down")) {
                    sf = sf2;
                } else if (TextUtils.equals(this.vh, "left")) {
                    sf = -sf;
                } else if (!TextUtils.equals(this.vh, "right")) {
                    sf = (int) Math.abs(Math.sqrt(Math.pow(sf2, 2.0d) + Math.pow(sf, 2.0d)));
                }
                if (sf >= this.pcc) {
                    if (jrVar != null) {
                        pcc(pointerId);
                        pcc(jrVar, this.vy, gmVar);
                        return true;
                    }
                    return true;
                }
                pcc(pointerId);
                "Non-slide event for pointer ".concat(String.valueOf(pointerId));
                pcc(gmVar);
            }
            return false;
        }
        this.qf.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getX(actionIndex)));
        this.kj.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getY(actionIndex)));
        Objects.toString(this.qf.get(Integer.valueOf(pointerId)));
        Objects.toString(this.kj.get(Integer.valueOf(pointerId)));
        return true;
    }

    public void pcc() {
        if (this.gm == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.sf.vj.1
            @Override // java.lang.Runnable
            public void run() {
                vj.this.oo.set(false);
            }
        }, this.gm);
    }

    private void pcc(int i) {
        this.qf.remove(Integer.valueOf(i));
        this.kj.remove(Integer.valueOf(i));
    }

    public boolean pcc(jr jrVar, com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent, boolean z) {
        pcc pccVar = this.dax;
        if (pccVar != null) {
            if (pccVar.pcc(motionEvent)) {
                return false;
            }
            this.dax.pcc(gmVar, motionEvent);
        }
        if (this.jr) {
            return sf(jrVar, gmVar, motionEvent, z);
        }
        return gm(jrVar, gmVar, motionEvent, z);
    }

    private void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        pcc pccVar = this.dax;
        if (pccVar != null) {
            pccVar.pcc(gmVar);
        }
    }

    public vj(Context context, hc hcVar, boolean z, boolean z2, boolean z3) {
        this.tmg = context;
        this.vy = hcVar;
        this.hc = z;
        this.gbb = z2;
        this.jr = z3;
        gm();
    }

    private void gm() {
        if (this.gbb) {
            this.dax = new pcc();
        }
        hc hcVar = this.vy;
        if (hcVar == null) {
            return;
        }
        this.pcc = hcVar.gm().optInt("slideThreshold");
        this.vh = this.vy.gm().optString("slideDirection");
        this.sf = this.vy.gm().optInt("frequency", Integer.MAX_VALUE);
        this.gm = this.vy.gm().optInt("effectiveDuration", Integer.MAX_VALUE);
        this.oo.get();
    }

    public void sf() {
        this.vj = Float.MIN_VALUE;
        this.wh = Float.MIN_VALUE;
        this.qf.clear();
        this.kj.clear();
    }
}
