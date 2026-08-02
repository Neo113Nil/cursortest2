package com.bytedance.sdk.openadsdk.core.hc.vj.sf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends com.bytedance.adsdk.ugeno.oo.oo.gm {
    private String vh;

    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        Object obj;
        Map<String, Object> map = this.vj;
        if (map == null || map.size() <= 0 || (obj = this.vj.get("id")) == null) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf)) {
            return false;
        }
        Object obj2 = this.vj.get("state");
        if (obj2 != null) {
            this.vh = String.valueOf(obj2);
        }
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.sf;
        com.bytedance.adsdk.ugeno.sf.gm sf = gmVar.sf(gmVar);
        if (sf == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.sf.gm vj = sf.vj(valueOf);
        if (vj instanceof com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc) {
            ((com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc) vj).pcc(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.hc.vj.sf.sf.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (!TextUtils.equals(sf.this.vh, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).pcc == null) {
                        return;
                    }
                    ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).pcc.pcc(((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).sf, ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).wh, ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).gm.sf(), ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).gm);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (!TextUtils.equals(sf.this.vh, "start") || ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).pcc == null) {
                        return;
                    }
                    ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).pcc.pcc(((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).sf, ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).wh, ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).gm.sf(), ((com.bytedance.adsdk.ugeno.oo.oo.gm) sf.this).gm);
                }
            });
        }
        return false;
    }
}
