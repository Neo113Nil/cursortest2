package com.bytedance.sdk.openadsdk.core.hc.vj.pcc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oo.wh;
import com.bytedance.adsdk.ugeno.sf.gm;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends com.bytedance.adsdk.ugeno.oo.sf.pcc {
    public pcc(gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        Object obj;
        gm gmVar;
        gm sf;
        Map<String, Object> map = this.wh;
        if (map == null || map.isEmpty() || (obj = this.wh.get("id")) == null) {
            return;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf) || (sf = (gmVar = this.gm).sf(gmVar)) == null) {
            return;
        }
        gm vj = sf.vj(valueOf);
        if (vj instanceof com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc) {
            com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc pccVar = (com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc) vj;
            pccVar.oo();
            pccVar.pcc(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.hc.vj.pcc.pcc.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    pcc.this.gm();
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void sf() {
    }
}
