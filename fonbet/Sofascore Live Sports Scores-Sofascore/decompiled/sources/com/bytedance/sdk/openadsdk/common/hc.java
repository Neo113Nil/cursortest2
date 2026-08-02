package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc {
    private final Context gm;
    private boolean kj;
    private com.bytedance.sdk.component.vy.qf oo;
    private final of pcc;
    private tz qf;
    private RelativeLayout sf;
    private ImageView vj;
    private final String wh;

    public hc(Context context, of ofVar, String str, boolean z) {
        this.gm = context;
        this.pcc = ofVar;
        this.wh = str;
        this.kj = z;
        vj();
    }

    private static RelativeLayout pcc(Context context, boolean z) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new vy(context));
        qf.gm gmVar = qf.gm.LANDING_PAGE;
        new com.bytedance.sdk.component.vy.qf(context, gmVar);
        com.bytedance.sdk.component.vy.qf qfVar = z ? new com.bytedance.sdk.component.vy.qf(context, qf.gm.PRIVACY) : new com.bytedance.sdk.component.vy.qf(context, gmVar);
        qfVar.setId(com.bytedance.sdk.openadsdk.utils.nac.hpk);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.nac.wax);
        if (z) {
            relativeLayout.addView(qfVar, layoutParams);
        }
        return relativeLayout;
    }

    private void vj() {
        RelativeLayout pcc = pcc(this.gm, this.kj);
        this.sf = pcc;
        this.oo = (com.bytedance.sdk.component.vy.qf) pcc.findViewById(com.bytedance.sdk.openadsdk.utils.nac.hpk);
        tz tzVar = new tz(this.gm, (RelativeLayout) this.sf.findViewById(com.bytedance.sdk.openadsdk.utils.nac.wax), this.pcc, this.oo, this.wh, this.kj);
        this.qf = tzVar;
        this.vj = tzVar.vj();
    }

    public com.bytedance.sdk.component.vy.qf gm() {
        return this.oo;
    }

    public View oo() {
        return this.sf;
    }

    public void sf() {
        tz tzVar = this.qf;
        if (tzVar != null) {
            tzVar.gm();
        }
    }

    public void sf(String str) {
        this.qf.sf(str);
    }

    public void pcc() {
        tz tzVar = this.qf;
        if (tzVar != null) {
            tzVar.sf();
        }
    }

    public void pcc(WebView webView, qf.pcc pccVar) {
        tz tzVar = this.qf;
        if (tzVar != null) {
            tzVar.pcc(webView, pccVar);
        }
    }

    public void pcc(String str) {
        this.qf.pcc(str);
    }

    public void pcc(boolean z) {
        this.qf.pcc(z);
    }
}
