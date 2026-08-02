package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr extends oo {
    public jr(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    public List<ObjectAnimator> pcc() {
        float f;
        float pcc = com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.sf.wh());
        float pcc2 = com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.sf.qf());
        boolean equals = "reverse".equals(this.sf.dax());
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (equals) {
            f = pcc2;
            pcc2 = 0.0f;
            f2 = pcc;
            pcc = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.oo.sf.pcc(this.gm.getContext())) {
            pcc = -pcc;
            f2 = -f2;
        }
        this.gm.setTranslationX(pcc);
        this.gm.setTranslationY(pcc2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "translationX", pcc, f2).setDuration((int) (this.sf.ork() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.gm, "translationY", pcc2, f).setDuration((int) (this.sf.ork() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        arrayList.add(pcc(duration2));
        return arrayList;
    }
}
