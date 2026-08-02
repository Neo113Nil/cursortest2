package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu extends pcc {
    private FrameLayout hc;
    private FrameLayout pcc;
    private fum tmg;

    public lu(@NonNull Context context) {
        super(context);
        this.sf = context;
    }

    private void gm() {
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this.sf);
        this.pcc = gmVar;
        addView(gmVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(this.sf);
        this.hc = gmVar2;
        this.pcc.addView(gmVar2, new FrameLayout.LayoutParams(-1, -1));
        this.hc.removeAllViews();
    }

    private void sf() {
        this.qf = rj.sf(this.sf, this.tmg.getExpectExpressWidth());
        this.kj = rj.sf(this.sf, this.tmg.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.qf, this.kj);
        }
        layoutParams.width = this.qf;
        layoutParams.height = this.kj;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.gm.pv();
        gm();
    }

    public View getBackupContainerBackgroundView() {
        return this.pcc;
    }

    public FrameLayout getVideoContainer() {
        return this.hc;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, fum fumVar, ViewGroup viewGroup) {
        if (ofVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.gm = ofVar;
        this.tmg = fumVar;
        if (ofVar.hh() == 7) {
            this.wh = "rewarded_video";
        } else {
            this.wh = "fullscreen_interstitial_ad";
        }
        sf();
        if (com.bytedance.sdk.openadsdk.core.model.lo.gm(ofVar)) {
            this.tmg.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.tmg.addView(this, layoutParams);
        }
        int i = com.bytedance.sdk.openadsdk.utils.nac.pjm;
        View findViewById = viewGroup.findViewById(i);
        if (findViewById != null) {
            Object tag = findViewById.getTag(i);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(str, findViewById);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.pcc
    public void pcc(View view, int i, com.bytedance.sdk.openadsdk.core.model.dax daxVar) {
        fum fumVar = this.tmg;
        if (fumVar != null) {
            fumVar.pcc(view, i, daxVar);
        }
    }
}
