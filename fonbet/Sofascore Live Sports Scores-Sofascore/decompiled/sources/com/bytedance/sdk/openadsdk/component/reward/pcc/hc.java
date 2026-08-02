package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc {
    private final Activity gm;
    private final sf oo;
    com.bytedance.sdk.openadsdk.component.reward.top.gm pcc;
    com.bytedance.sdk.component.adexpress.dynamic.oo sf;
    private boolean vj = false;
    private boolean wh;

    public hc(sf sfVar) {
        this.gm = sfVar.rnn;
        this.oo = sfVar;
    }

    public void gm(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setShowSound(z);
    }

    public void oo(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setShowSkip(z);
    }

    public void pcc(int i) {
        View findViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar == null || gmVar.getITopLayout() == null || i == 0 || (findViewById = this.pcc.getITopLayout().findViewById(520093713)) == null || !(findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || findViewById.getWidth() <= 0 || findViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        int width = i - (findViewById.getWidth() + iArr[0]);
        if (width < rj.sf(this.gm, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin = (rj.sf(this.gm, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin;
            findViewById.requestLayout();
        }
    }

    public void sf(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo ooVar = this.sf;
        if (ooVar != null) {
            ooVar.setSoundMute(z);
        }
    }

    public void vj(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setSkipEnable(z);
    }

    public void gm() {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.showSkipButton();
    }

    public void oo() {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.clickSkip();
        }
    }

    public void vj() {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setSkipInvisiable();
    }

    public void sf() {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.showCountDownText();
    }

    public void pcc(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setShowDislike(z);
    }

    public void pcc(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setTime(String.valueOf(str), charSequence);
    }

    public void pcc(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        if (this.wh || (gmVar = this.pcc) == null) {
            return;
        }
        gmVar.setSkipText(charSequence);
    }

    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.clickSound(str);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.top.sf sfVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.setListener(sfVar);
        }
    }

    public void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo ooVar) {
        this.sf = ooVar;
    }

    public void pcc() {
        if (this.vj) {
            return;
        }
        this.vj = true;
        sf sfVar = this.oo;
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = sfVar.vgx;
        if (gmVar != null) {
            this.pcc = gmVar;
            this.wh = true;
        } else {
            gmVar = (com.bytedance.sdk.openadsdk.component.reward.top.gm) sfVar.nn.findViewById(com.bytedance.sdk.openadsdk.utils.nac.on);
            this.pcc = gmVar;
        }
        if (gmVar != null) {
            gmVar.pcc(this.oo.sf);
            if (this.oo.sf.on()) {
                pcc(false);
            } else {
                pcc(this.oo.sf.dk());
            }
        }
    }
}
