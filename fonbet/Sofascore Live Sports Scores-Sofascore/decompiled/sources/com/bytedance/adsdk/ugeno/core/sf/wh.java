package com.bytedance.adsdk.ugeno.core.sf;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.core.jr;
import com.bytedance.adsdk.ugeno.qf.vy;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh implements vy.pcc {
    private jr gm;
    private Context oo;
    private boolean pcc;
    private Handler qf = new vy(Looper.getMainLooper(), this);
    private int sf;
    private hc vj;
    private com.bytedance.adsdk.ugeno.sf.gm wh;

    public wh(Context context, hc hcVar, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        this.oo = context;
        this.vj = hcVar;
        this.wh = gmVar;
    }

    public void pcc() {
        hc hcVar = this.vj;
        if (hcVar == null) {
            return;
        }
        JSONObject gm = hcVar.gm();
        try {
            this.sf = Integer.parseInt(com.bytedance.adsdk.ugeno.gm.sf.pcc(gm.optString("interval", "8000"), this.wh.tmg()));
            this.pcc = gm.optBoolean("repeat");
            this.qf.sendEmptyMessageDelayed(1001, this.sf);
        } catch (NumberFormatException unused) {
        }
    }

    public void pcc(jr jrVar) {
        this.gm = jrVar;
    }

    @Override // com.bytedance.adsdk.ugeno.qf.vy.pcc
    public void pcc(Message message) {
        if (message.what != 1001) {
            return;
        }
        jr jrVar = this.gm;
        if (jrVar != null) {
            hc hcVar = this.vj;
            com.bytedance.adsdk.ugeno.sf.gm gmVar = this.wh;
            jrVar.pcc(hcVar, gmVar, gmVar);
        }
        boolean z = this.pcc;
        Handler handler = this.qf;
        if (z) {
            handler.sendEmptyMessageDelayed(1001, this.sf);
        } else {
            handler.removeMessages(1001);
        }
    }
}
