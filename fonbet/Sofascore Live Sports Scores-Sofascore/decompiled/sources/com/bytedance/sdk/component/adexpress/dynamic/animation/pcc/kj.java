package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends oo {
    public kj(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    public List<ObjectAnimator> pcc() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "rippleValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.sf.ork() * 1000.0d));
        ((ViewGroup) this.gm.getParent()).setClipChildren(false);
        ((ViewGroup) this.gm.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.gm.getParent().getParent().getParent()).setClipChildren(false);
        this.gm.setTag(2097610712, this.sf.kj());
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        return arrayList;
    }
}
