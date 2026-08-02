package com.bytedance.sdk.openadsdk.component.reward.gm.sf;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.pcc.jr;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm {
    private of gm;
    private com.bytedance.sdk.openadsdk.component.reward.gm.pcc.pcc kj;
    private ViewGroup oo;
    private Activity pcc;
    private jr qf;
    private com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf sf;
    private ViewGroup vj;
    private PAGLogoView vy;
    private AtomicBoolean wh = new AtomicBoolean(false);
    private AtomicBoolean ork = new AtomicBoolean(false);

    public gm(Activity activity, of ofVar, ViewGroup viewGroup, ViewGroup viewGroup2, com.bytedance.sdk.openadsdk.core.ork.pcc.pcc pccVar) {
        this.pcc = activity;
        this.gm = ofVar;
        this.vj = viewGroup2;
        this.oo = viewGroup;
        this.sf = new com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf(this.pcc, this.gm);
        this.qf = (jr) pccVar;
    }

    private void sf(final String str) {
        this.vy = PAGLogoView.createPAGLogoViewByMaterial(this.pcc, this.gm);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        layoutParams.leftMargin = rj.sf(this.pcc, 16.0f);
        layoutParams.bottomMargin = rj.sf(this.pcc, 21.0f);
        if (this.vy.getParent() != null) {
            ((ViewGroup) this.vy.getParent()).removeView(this.vy);
        }
        this.vj.addView(this.vy, layoutParams);
        this.vy.bringToFront();
        this.vy.setVisibility(8);
        this.vy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pcc(gm.this.pcc, gm.this.gm, str);
                } catch (Throwable th) {
                    lo.gm("UnifyLandingPage", th.getMessage());
                }
            }
        });
    }

    public void gm() {
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm
    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.oo ooVar) {
        if (ooVar == null || this.sf == null) {
            return;
        }
        System.currentTimeMillis();
        this.wh.set(true);
        this.sf.pcc(ooVar);
        if (ooVar.sf() == 1) {
            sf(ooVar);
            return;
        }
        if (ooVar.sf() == 2) {
            this.ork.set(true);
            if (this.sf.oo()) {
                this.sf.vj();
                if (this.sf.wh()) {
                    pcc();
                }
            } else {
                sf(ooVar);
                this.sf.vj();
            }
            if (this.sf.getParent() != null) {
                ((ViewGroup) this.sf.getParent()).removeView(this.sf);
            }
            this.oo.addView(this.sf, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    private void sf(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.oo ooVar) {
        sf(ooVar.vy());
        this.sf.gm();
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.pcc pccVar = new com.bytedance.sdk.openadsdk.component.reward.gm.pcc.pcc(ooVar);
        this.kj = pccVar;
        this.qf.pcc(pccVar);
    }

    public void sf() {
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.kj();
        }
    }

    public void pcc() {
        if (this.vy == null || !this.ork.get()) {
            return;
        }
        this.vy.setVisibility(0);
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.vj vjVar) {
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.setLoadStatusListener(vjVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm
    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.qf();
            this.wh.set(false);
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.pcc pccVar = this.kj;
        if (pccVar != null) {
            pccVar.pcc(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm
    public void pcc(String str, boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.pcc pccVar = this.kj;
        if (pccVar != null) {
            pccVar.pcc(z);
        }
    }
}
