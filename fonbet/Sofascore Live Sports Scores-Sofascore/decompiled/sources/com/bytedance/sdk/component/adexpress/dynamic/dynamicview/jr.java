package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr extends wh {
    String pcc;
    com.bytedance.sdk.component.adexpress.dynamic.oo.kj sf;

    public jr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, String str) {
        super(context, dynamicRootView, kjVar);
        this.pcc = str;
        this.sf = kjVar;
        com.bytedance.sdk.component.adexpress.wh.ork lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.wh.ork getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar = this.hc;
        if (kjVar == null || kjVar.ork() == null || this.vh == null || TextUtils.isEmpty(this.pcc)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = this.hc.ork().vj();
        String gh = vj != null ? vj.gh() : "";
        if (TextUtils.isEmpty(gh)) {
            return null;
        }
        String o = fc6.o(new StringBuilder(), this.pcc, "static/lotties/", gh, ".json");
        com.bytedance.sdk.component.adexpress.wh.ork orkVar = new com.bytedance.sdk.component.adexpress.wh.ork(this.vh);
        orkVar.setImageLottieTosPath(o);
        orkVar.kj();
        return orkVar;
    }
}
