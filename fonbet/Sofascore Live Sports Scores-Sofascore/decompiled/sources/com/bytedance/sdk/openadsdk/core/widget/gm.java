package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends com.bytedance.sdk.openadsdk.core.wh.oo {
    public gm(Context context) {
        super(context);
        pcc();
    }

    public void pcc(int i, of ofVar) {
        if (ofVar.on() || (ofVar.uxz() && ofVar.of())) {
            rj.pcc((View) this, 0);
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc((int) rj.pcc(getContext(), i, true), this, ofVar);
        }
    }

    private void pcc() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.nac.jum);
    }
}
