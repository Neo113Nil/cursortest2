package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork extends oo {
    private pcc oo;
    private float vj;
    private float wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class pcc {
        private View sf;

        public pcc(View view) {
            this.sf = view;
        }

        public void pcc(int i) {
            if (!PlayerKt.E_SPORTS_TOP.equals(ork.this.sf.pcc())) {
                ViewGroup.LayoutParams layoutParams = this.sf.getLayoutParams();
                layoutParams.height = i;
                this.sf.setLayoutParams(layoutParams);
                this.sf.requestLayout();
                return;
            }
            if (ork.this.gm instanceof ViewGroup) {
                for (int i2 = 0; i2 < ((ViewGroup) ork.this.gm).getChildCount(); i2++) {
                    ((ViewGroup) ork.this.gm).getChildAt(i2).setTranslationY(i - ork.this.vj);
                }
            }
            ork orkVar = ork.this;
            orkVar.gm.setTranslationY(orkVar.vj - i);
        }
    }

    public ork(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    public List<ObjectAnimator> pcc() {
        int i;
        String str;
        View view = this.gm;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj)) {
            this.gm = (View) this.gm.getParent();
        }
        this.gm.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.sf.ork() * 1000.0d));
        this.oo = new pcc(this.gm);
        final int i2 = this.gm.getLayoutParams().height;
        this.vj = i2;
        this.wh = this.gm.getLayoutParams().width;
        if ("left".equals(this.sf.pcc()) || "right".equals(this.sf.pcc())) {
            i = (int) this.wh;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.oo, str, 0, i).setDuration((int) (this.sf.ork() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        arrayList.add(pcc(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.ork.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ork.this.oo.pcc(i2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return arrayList;
    }
}
