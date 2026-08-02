package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends com.bytedance.sdk.openadsdk.core.wh.gm {
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;

    public kj(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        super(sfVar.kun);
        this.pcc = sfVar;
        if (sfVar.ywp != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        RFEndCardBackUpLayout qf;
        sfVar.pcc(this);
        if (this.pcc.pcc != 1 && (qf = sfVar.qf()) != null) {
            addView(qf, new FrameLayout.LayoutParams(-1, -1));
        }
        pcc(sfVar.kj(), this);
        pcc(sfVar.vy(), this);
    }

    private void pcc(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
