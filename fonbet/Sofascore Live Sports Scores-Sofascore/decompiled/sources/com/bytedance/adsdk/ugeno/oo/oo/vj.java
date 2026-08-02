package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.oo.hc;
import com.sofascore.model.mvvm.model.Season;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends gm {
    private AtomicBoolean dax;
    private AtomicInteger gbb;
    private hc gpj;
    private int hc;
    private int jr;
    private String lu;
    private int nac;
    private float tmg;
    private float vh;

    public vj(Context context) {
        super(context);
        this.hc = 0;
        this.gbb = new AtomicInteger(Integer.MAX_VALUE);
        this.jr = Integer.MAX_VALUE;
        this.dax = new AtomicBoolean(true);
        this.nac = 0;
        this.lu = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        Object obj;
        Object obj2;
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, Object> map = this.vj;
        if (map != null) {
            Object obj3 = map.get("direction");
            String str = Season.YEAR_ALL_TIME;
            if (obj3 != null && !TextUtils.isEmpty(String.valueOf(obj3))) {
                str = String.valueOf(obj3);
            }
            this.lu = str;
            Object obj4 = this.vj.get("distance");
            if (obj4 == null) {
                this.hc = 0;
            } else {
                this.hc = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj4), 0);
            }
            if (this.gbb.get() == Integer.MAX_VALUE && (obj2 = this.vj.get("frequency")) != null) {
                this.gbb.set(com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj2), Integer.MAX_VALUE));
            }
            if (this.jr == Integer.MAX_VALUE && (obj = this.vj.get("effectiveDuration")) != null) {
                this.jr = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj), Integer.MAX_VALUE);
            }
            Object obj5 = this.vj.get("inView");
            if (obj5 != null) {
                this.nac = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj5), 0);
            }
            Objects.toString(this.gbb);
            this.dax.get();
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        pcc();
        hc hcVar = this.gpj;
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.sf;
        return hcVar != null ? hcVar.pcc(gmVar, motionEvent, this.pcc, this, this.lu, this.hc, this.gbb, this.nac, this.dax.get()) : pcc(gmVar, motionEvent);
    }

    private void pcc() {
        if (this.jr == Integer.MAX_VALUE || this.sf == null || System.currentTimeMillis() - this.sf.qy() < this.jr) {
            return;
        }
        this.dax.set(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r4.equals("right") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.vh = motionEvent.getX();
            this.tmg = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.hc == 0 && this.pcc != null) {
                return pcc(gmVar, x, y);
            }
            int sf = com.bytedance.adsdk.ugeno.qf.kj.sf(this.ork, x - this.vh);
            int sf2 = com.bytedance.adsdk.ugeno.qf.kj.sf(this.ork, y - this.tmg);
            String str = this.lu;
            switch (str.hashCode()) {
                case 3739:
                    if (str.equals("up")) {
                        sf = -sf2;
                        break;
                    }
                    sf = (int) Math.abs(Math.sqrt(Math.pow(sf2, 2.0d) + Math.pow(sf, 2.0d)));
                    break;
                case 96673:
                    str.equals(Season.YEAR_ALL_TIME);
                    sf = (int) Math.abs(Math.sqrt(Math.pow(sf2, 2.0d) + Math.pow(sf, 2.0d)));
                    break;
                case 3089570:
                    if (str.equals("down")) {
                        sf = sf2;
                        break;
                    }
                    sf = (int) Math.abs(Math.sqrt(Math.pow(sf2, 2.0d) + Math.pow(sf, 2.0d)));
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        sf = -sf;
                        break;
                    }
                    sf = (int) Math.abs(Math.sqrt(Math.pow(sf2, 2.0d) + Math.pow(sf, 2.0d)));
                    break;
                case 108511772:
                    break;
                default:
                    sf = (int) Math.abs(Math.sqrt(Math.pow(sf2, 2.0d) + Math.pow(sf, 2.0d)));
                    break;
            }
            if (sf < this.hc) {
                return false;
            }
            if (this.pcc != null) {
                this.vh = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.tmg = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return pcc(gmVar, x, y);
            }
        }
        return true;
    }

    private boolean pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, float f, float f2) {
        if (this.gbb.get() <= 0 || !this.dax.get()) {
            return false;
        }
        if (this.nac == 1 && !pcc(gmVar.vh(), f, f2)) {
            return false;
        }
        this.pcc.pcc(gmVar, this.wh, this.gm.sf(), this.gm);
        if (this.gbb.get() != Integer.MAX_VALUE) {
            this.gbb.decrementAndGet();
        }
        return true;
    }

    private boolean pcc(View view, float f, float f2) {
        return f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < ((float) view.getWidth()) && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < ((float) view.getHeight());
    }

    public void pcc(hc hcVar) {
        this.gpj = hcVar;
    }
}
