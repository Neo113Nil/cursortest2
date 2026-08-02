package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nac extends com.bytedance.sdk.openadsdk.core.jr.sf.wh implements View.OnClickListener {
    private boolean nac;

    public nac(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, com.bytedance.sdk.openadsdk.oo.qf qfVar, boolean z) {
        super(context, ofVar, false, str, false, false, qfVar);
        this.nac = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z);
    }

    private void gpj() {
        qf();
        RelativeLayout relativeLayout = this.qf;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.pcc.kez().f, this.pcc.kez().b, this.pcc.kez().a, this.kj, this.pcc);
            }
        }
        lu();
    }

    private void lu() {
        rj.pcc((View) this.qf, 0);
        rj.pcc((View) this.kj, 0);
        rj.pcc((View) this.ork, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh
    public void gm() {
        if (this.nac) {
            super.gm();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.vy;
        if (imageView != null && imageView.getVisibility() == 0) {
            rj.vj(this.qf);
        }
        gm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh, android.view.View
    public void onWindowFocusChanged(boolean z) {
        ImageView imageView = this.vy;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            gpj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh, android.view.View
    public void onWindowVisibilityChanged(int i) {
        ImageView imageView = this.vy;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            gpj();
        }
    }

    public void oo() {
        ImageView imageView = this.ork;
        if (imageView != null) {
            rj.pcc((View) imageView, 8);
        }
    }

    public void pcc(int i, int i2) {
        com.bytedance.sdk.openadsdk.core.jr.sf.gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.sf(i, i2);
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.nac = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        com.bytedance.sdk.openadsdk.core.jr.sf.gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.vj(z);
        }
    }

    public void setShowAdInteractionView(boolean z) {
        com.bytedance.sdk.openadsdk.core.jr.sf.vj tmg;
        com.bytedance.sdk.openadsdk.core.jr.sf.gm gmVar = this.sf;
        if (gmVar == null || (tmg = gmVar.tmg()) == null) {
            return;
        }
        tmg.pcc(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh
    public void sf() {
        if (!this.vj || !tsz.sf(this.tmg)) {
            this.oo = false;
        }
        super.sf();
    }

    public void vj() {
        qf();
        rj.pcc((View) this.qf, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh
    public void pcc(boolean z) {
    }
}
