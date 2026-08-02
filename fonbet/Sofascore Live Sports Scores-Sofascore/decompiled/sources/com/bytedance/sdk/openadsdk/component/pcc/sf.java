package com.bytedance.sdk.openadsdk.component.pcc;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.ork;
import com.bytedance.sdk.openadsdk.core.ork.vy;
import com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static void pcc(com.bytedance.sdk.openadsdk.core.gm.sf sfVar, of ofVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(ofVar.ptr()));
        hashMap.put("openad_creative_type", of.vj(ofVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(atb.gm(ofVar) ? 3 : 1));
        sfVar.pcc(hashMap);
    }

    public static vy sf(of ofVar, Activity activity, final com.bytedance.sdk.openadsdk.component.kj.pcc pccVar, com.bytedance.sdk.openadsdk.component.vy.sf sfVar) {
        vy vyVar = new vy(activity.getApplicationContext(), ofVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.pcc.sf.2
            @Override // com.bytedance.sdk.openadsdk.core.gm.pcc, com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(pccVar.gm()));
                pcc(hashMap);
                super.pcc(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        vyVar.sf(sfVar);
        pcc(activity.getApplicationContext(), ofVar, vyVar);
        pcc(vyVar, ofVar);
        return vyVar;
    }

    public static ork pcc(of ofVar, Activity activity, final com.bytedance.sdk.openadsdk.component.kj.pcc pccVar, com.bytedance.sdk.openadsdk.component.vy.sf sfVar) {
        ork orkVar = new ork(activity, ofVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.pcc.sf.1
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(pccVar.gm()));
                pcc(hashMap);
                super.pcc(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        orkVar.sf(sfVar);
        pcc(activity.getApplicationContext(), ofVar, orkVar);
        pcc(orkVar, ofVar);
        return orkVar;
    }

    public static pcc pcc(of ofVar, Activity activity, com.bytedance.sdk.openadsdk.component.kj.pcc pccVar) {
        pcc pccVar2 = new pcc(activity.getApplicationContext(), ofVar, "open_ad", 4, pccVar);
        pccVar2.sf(activity.findViewById(R.id.content));
        pcc(activity.getApplicationContext(), ofVar, pccVar2);
        pcc(pccVar2, ofVar);
        return pccVar2;
    }

    private static void pcc(Context context, of ofVar, com.bytedance.sdk.openadsdk.core.gm.sf sfVar) {
        if (ofVar == null || ofVar.az() != 4) {
            return;
        }
        sfVar.pcc(oo.pcc(context, "open_ad"));
    }
}
