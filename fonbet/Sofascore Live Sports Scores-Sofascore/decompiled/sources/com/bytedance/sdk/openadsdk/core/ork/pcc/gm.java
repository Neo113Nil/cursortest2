package com.bytedance.sdk.openadsdk.core.ork.pcc;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements com.bytedance.sdk.openadsdk.hc.pcc {
    private final View pcc;

    public gm(View view) {
        this.pcc = view;
    }

    @Override // com.bytedance.sdk.openadsdk.hc.pcc
    public int pcc() {
        View view = this.pcc;
        int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
        return measuredHeight <= 0 ? rj.vj(lu.pcc()) : measuredHeight;
    }

    @Override // com.bytedance.sdk.openadsdk.hc.pcc
    public int sf() {
        View view = this.pcc;
        int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
        return measuredWidth <= 0 ? rj.gm(lu.pcc()) : measuredWidth;
    }
}
