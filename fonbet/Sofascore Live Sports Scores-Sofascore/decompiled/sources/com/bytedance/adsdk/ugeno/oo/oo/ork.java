package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.qf.vy;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork extends gm implements vy.pcc {
    private int gbb;
    private Handler hc;
    private int tmg;
    private int vh;

    public ork(Context context) {
        super(context);
        this.tmg = 0;
        this.hc = new com.bytedance.adsdk.ugeno.qf.vy(Looper.getMainLooper(), this);
        this.gbb = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        int i;
        Map<String, Object> map = this.vj;
        if (map != null) {
            Object obj = map.get("loop");
            if (obj != null) {
                i = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj), 1);
                this.vh = i;
            } else {
                this.vh = 1;
                i = 1;
            }
            if (i <= 0) {
                this.gbb = -1;
            } else {
                this.gbb = i;
            }
            Object obj2 = this.vj.get(IronSourceConstants.EVENTS_DURATION);
            if (obj2 == null) {
                this.tmg = 0;
            } else {
                this.tmg = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj2), 0);
            }
        }
        this.hc.sendEmptyMessageDelayed(1001, this.tmg);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.qf.vy.pcc
    public void pcc(Message message) {
        int i;
        int i2;
        if (message.what != 1001) {
            return;
        }
        this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
        int i3 = this.gbb - 1;
        this.gbb = i3;
        if (i3 < 0 && (i2 = this.tmg) != 0) {
            this.hc.sendEmptyMessageDelayed(1001, i2);
        } else if (i3 > 0 && (i = this.tmg) != 0) {
            this.hc.sendEmptyMessageDelayed(1001, i);
        } else {
            this.hc.removeMessages(1001);
        }
    }
}
