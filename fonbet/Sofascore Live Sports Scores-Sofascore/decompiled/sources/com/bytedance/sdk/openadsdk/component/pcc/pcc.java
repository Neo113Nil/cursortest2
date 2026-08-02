package com.bytedance.sdk.openadsdk.component.pcc;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends com.bytedance.sdk.openadsdk.core.gm.pcc {
    private final com.bytedance.sdk.openadsdk.component.kj.pcc pcc;

    public pcc(@NonNull Context context, @NonNull of ofVar, @NonNull String str, int i, com.bytedance.sdk.openadsdk.component.kj.pcc pccVar) {
        super(context, ofVar, str, i);
        this.pcc = pccVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc, com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
        if (view.getTag() == "open_ad_click_button_tag") {
            pcc("click_bar");
        } else {
            pcc("click_material");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.pcc.gm()));
        pcc(hashMap);
        super.pcc(view, f, f2, f3, f4, sparseArray, z);
        vj.pcc(((com.bytedance.sdk.openadsdk.core.gm.sf) this).wh, 9);
    }
}
