package com.bytedance.sdk.openadsdk.tz.pcc;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.hc.qf;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends pcc {
    private qf gm;
    private final FrameLayout oo;
    private volatile boolean sf;
    private FrameLayout vj;
    private String wh;

    public sf(Context context, of ofVar, int i, boolean z, FrameLayout frameLayout, String str) {
        super(context, ofVar, i, z, frameLayout);
        this.oo = frameLayout;
        this.wh = str;
        sf(false);
        int gm = rj.gm(context);
        int vj = rj.vj(context);
        if (i == 1) {
            if (gm <= vj) {
                this.pcc.layout(0, 0, gm, vj);
                return;
            }
        } else {
            if (i != 2) {
                return;
            }
            if (gm > vj) {
                this.pcc.layout(0, 0, gm, vj);
                return;
            }
        }
        this.pcc.layout(0, 0, vj, gm);
    }

    public void kj() {
        super.pcc(true, new qf() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.sf.1
            @Override // com.bytedance.sdk.openadsdk.hc.qf
            public void pcc() {
                qf qfVar = sf.this.gm;
                sf sfVar = sf.this;
                if (qfVar != null) {
                    sfVar.gm.pcc();
                } else {
                    sfVar.sf = true;
                }
            }
        });
    }

    public void pcc(FrameLayout frameLayout, qf qfVar) {
        this.vj = frameLayout;
        frameLayout.addView(this.oo);
        this.gm = qfVar;
        if (this.sf) {
            this.gm.pcc();
        }
    }

    public String vy() {
        return this.wh;
    }

    @Override // com.bytedance.sdk.openadsdk.tz.pcc.pcc
    public void pcc() {
        this.vj.setVisibility(0);
        super.pcc();
    }
}
