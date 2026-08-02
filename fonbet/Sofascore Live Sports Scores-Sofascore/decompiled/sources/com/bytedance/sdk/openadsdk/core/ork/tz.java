package com.bytedance.sdk.openadsdk.core.ork;

import android.view.View;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tz extends com.bytedance.sdk.component.adexpress.sf.pcc<pcc> {
    private final View gm;
    private com.bytedance.sdk.component.adexpress.sf.gm oo;
    AtomicBoolean pcc = new AtomicBoolean(false);
    private pcc sf;
    private com.bytedance.sdk.component.adexpress.sf.qf vj;
    private final com.bytedance.sdk.component.adexpress.sf.hc wh;

    public tz(View view, com.bytedance.sdk.component.adexpress.sf.hc hcVar) {
        this.gm = view;
        this.wh = hcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        if (this.pcc.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.sf.gm gmVar = this.oo;
        if (gmVar == null || !gmVar.pcc((fum) this.gm, 0)) {
            this.vj.pcc(107, "backup false");
            return;
        }
        this.wh.vj().wh();
        pcc pccVar = (pcc) this.gm.findViewWithTag("tt_express_backup_fl_tag_26");
        this.sf = pccVar;
        if (pccVar == null) {
            this.vj.pcc(107, "backupview is null");
            return;
        }
        com.bytedance.sdk.component.adexpress.sf.gbb gbbVar = new com.bytedance.sdk.component.adexpress.sf.gbb();
        pcc pccVar2 = this.sf;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float realWidth = pccVar2 == null ? 0.0f : pccVar2.getRealWidth();
        pcc pccVar3 = this.sf;
        if (pccVar3 != null) {
            f = pccVar3.getRealHeight();
        }
        gbbVar.pcc(true);
        gbbVar.pcc(realWidth);
        gbbVar.sf(f);
        this.vj.pcc(this.sf, gbbVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    public void pcc(com.bytedance.sdk.component.adexpress.sf.qf qfVar) {
        this.vj = qfVar;
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.tz.1
            @Override // java.lang.Runnable
            public void run() {
                tz.this.sf();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public pcc vj() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.pcc
    public void pcc(com.bytedance.sdk.component.adexpress.sf.gm gmVar) {
        this.oo = gmVar;
    }
}
