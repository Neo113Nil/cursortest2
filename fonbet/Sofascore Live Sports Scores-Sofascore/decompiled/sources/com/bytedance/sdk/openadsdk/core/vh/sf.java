package com.bytedance.sdk.openadsdk.core.vh;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.ork.hc;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.yt.vj;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static final Long pcc = 0L;
    private AtomicBoolean sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        static final sf pcc = new sf();
    }

    private sf() {
        this.sf = new AtomicBoolean(false);
    }

    private void dax() {
        if (pcc().vj() || this.sf.getAndSet(true)) {
            return;
        }
        ApmHelper.initAPM();
        vj.sf();
        hc.sf();
        com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().sf();
    }

    public void gbb() {
        pcc().sf();
    }

    public int gm() {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "app_reg", -1);
    }

    public long hc() {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "allow_req_time", pcc.longValue());
    }

    public void jr() {
        dax();
    }

    public int kj() {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "user_compliance_status", -1);
    }

    public boolean oo() {
        long hc = hc();
        return tmg() && hc != 0 && System.currentTimeMillis() < hc;
    }

    public boolean ork() {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "user_compliance_status", -1) == -1;
    }

    public void pcc(final oo ooVar, final boolean z) {
        gm gmVar = new gm();
        gmVar.pcc(new oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.sf.1
            @Override // com.bytedance.sdk.openadsdk.core.vh.oo
            public void pcc(boolean z2) {
                if (!z2) {
                    ooVar.pcc(false);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.vh.pcc pccVar = new com.bytedance.sdk.openadsdk.core.vh.pcc(z);
                pccVar.pcc(new oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.sf.1.1
                    @Override // com.bytedance.sdk.openadsdk.core.vh.oo
                    public void pcc(boolean z3) {
                        ooVar.pcc(z3);
                    }
                });
                pccVar.pcc();
            }
        });
        gmVar.pcc();
    }

    public boolean qf() {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "app_reg", -1) == -1;
    }

    public void sf() {
        String hoh = vh.sf().hoh();
        if (TextUtils.isEmpty(hoh)) {
            return;
        }
        if (TextUtils.equals("true", hoh)) {
            pcc(1);
        } else if (TextUtils.equals("false", hoh)) {
            pcc(0);
        }
    }

    public boolean tmg() {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "user_compliance_status", -1) == 3;
    }

    public boolean vh() {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "user_compliance_status", -1) == 1;
    }

    public boolean vj() {
        return (!oo() && wh() && vy()) ? false : true;
    }

    public boolean vy() {
        int pcc2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "user_compliance_status", -1);
        return pcc2 == 1 || pcc2 == 2;
    }

    public boolean wh() {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "app_reg", -1) == 1;
    }

    public void pcc(int i) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "app_reg", Integer.valueOf(i));
    }

    public void pcc(long j) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "allow_req_time", Long.valueOf(j));
    }

    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "user_compliance_status_reason", str);
    }

    public static sf pcc() {
        return pcc.pcc;
    }

    public void sf(int i) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "user_compliance_status", Integer.valueOf(i));
    }
}
