package com.bytedance.sdk.openadsdk.core.hc.sf.sf;

import android.content.Context;
import com.bytedance.adsdk.sf.wh;
import com.bytedance.adsdk.ugeno.oo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends wh {
    private oo pcc;

    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.sf.wh, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // com.bytedance.adsdk.sf.wh, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    public void pcc(oo ooVar) {
        this.pcc = ooVar;
    }
}
