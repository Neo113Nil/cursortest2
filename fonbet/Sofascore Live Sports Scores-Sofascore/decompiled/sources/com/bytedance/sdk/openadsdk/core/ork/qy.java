package com.bytedance.sdk.openadsdk.core.ork;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.core.mu;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qy extends tsz {
    private Activity gpj;
    protected com.bytedance.sdk.openadsdk.core.ork.pcc.sf kj;
    private final jsj.pcc lo;
    protected final AtomicBoolean vy;

    public qy(Context context, com.bytedance.sdk.component.adexpress.sf.hc hcVar, com.bytedance.sdk.openadsdk.oo.oo.vj vjVar, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        super(context, hcVar, vjVar, ofVar);
        this.vy = new AtomicBoolean(false);
        this.lo = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.core.ork.qy.1
            @Override // com.bytedance.sdk.component.utils.jsj.pcc
            public void pcc(Context context2, Intent intent, boolean z, int i) {
                mu muVar = ((tsz) qy.this).jr;
                if (muVar != null) {
                    muVar.oo(i);
                }
            }
        };
        gpj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    public void dax() {
        if (com.bytedance.sdk.openadsdk.core.model.lo.vj(((tsz) this).tmg) || com.bytedance.sdk.component.adexpress.pcc.sf.sf.sf(((tsz) this).hc) || this.sf == null) {
            super.dax();
            return;
        }
        com.bytedance.sdk.component.adexpress.sf.qf qfVar = this.sf;
        StringBuilder sb = new StringBuilder("data null is ");
        sb.append(((tsz) this).hc == null);
        qfVar.pcc(103, sb.toString());
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    public void fum() {
        if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.gm()) {
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().sf(this.vj, ((tsz) this).jr);
        } else {
            super.fum();
        }
    }

    public void gpj() {
        if (this.vy.get()) {
            return;
        }
        this.vy.set(true);
        com.bytedance.sdk.component.utils.jsj.pcc(this.lo, ((tsz) this).ork);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    public void jr() {
        super.jr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz, com.bytedance.sdk.component.adexpress.vj.pcc
    public void kj() {
        super.kj();
        this.kj.gm();
        lo();
    }

    public void lo() {
        if (this.vy.get()) {
            this.vy.set(false);
            try {
                com.bytedance.sdk.component.utils.jsj.pcc(this.lo);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    public void lu() {
        super.lu();
        com.bytedance.sdk.openadsdk.core.ork.pcc.sf sfVar = this.kj;
        if (sfVar != null) {
            sfVar.vj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    public void nac() {
        mu muVar;
        com.bytedance.sdk.component.vy.qf qfVar = this.vj;
        if (qfVar == null || qfVar.getWebView() == null || (muVar = ((tsz) this).jr) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ork.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.core.ork.pcc.sf(muVar, this.vj, ((tsz) this).tmg);
        this.kj = sfVar;
        sfVar.oo();
        this.kj.sf();
        this.kj.pcc(this).pcc(this.gpj).pcc(((tsz) this).gbb).pcc(this.nac).pcc(((tsz) this).vh).pcc(((tsz) this).hc).pcc(this.dax).pcc();
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public com.bytedance.sdk.component.vy.qf pcc(Context context, String str) {
        return com.bytedance.sdk.component.adexpress.vj.vj.pcc().pcc(context, str);
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public void sf() {
        if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.gm()) {
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().sf(this.vj);
        } else {
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().pcc(this.vj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz, com.bytedance.sdk.component.adexpress.vj.pcc
    public void vy() {
        super.vy();
        com.bytedance.sdk.openadsdk.core.ork.pcc.sf sfVar = this.kj;
        if (sfVar != null) {
            sfVar.wh();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public void wh() {
        if (!com.bytedance.sdk.openadsdk.component.reward.gm.kj.sf() || this.vj == null) {
            return;
        }
        com.bytedance.sdk.component.utils.lo.pcc("TTAD.WebViewRender", "refreshWebView: refresh webview by console log ");
        this.vj.a_("javascript:console.log('init engine');");
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public qf.gm pcc() {
        return qf.gm.ADS_V4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz, com.bytedance.sdk.component.adexpress.vj.pcc, com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        super.pcc(gbbVar);
    }

    public void sf(Activity activity) {
        this.gpj = activity;
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public boolean sf(com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        return gbbVar.sf() && TextUtils.equals(gbbVar.jr(), "v4");
    }
}
