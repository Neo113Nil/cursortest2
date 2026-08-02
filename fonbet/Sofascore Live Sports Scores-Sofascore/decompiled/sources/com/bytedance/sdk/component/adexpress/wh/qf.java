package com.bytedance.sdk.component.adexpress.wh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends fum {
    private AnimatorSet gm;
    private TextView pcc;
    private View sf;

    public qf(Context context) {
        super(context);
        this.gm = new AnimatorSet();
        sf(context);
    }

    private void oo() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.sf, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), -3.0f));
        ofFloat.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.sf, "alpha", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat2.setRepeatCount(-1);
        this.gm.playTogether(ofFloat, ofFloat2);
        this.gm.setDuration(1000L);
        this.gm.start();
    }

    private void sf(Context context) {
        View pcc = com.bytedance.sdk.component.adexpress.gm.pcc.pcc(context);
        this.sf = pcc;
        addView(pcc);
        setClipChildren(false);
        this.pcc = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.fum
    public void pcc() {
        oo();
    }

    public void setButtonText(String str) {
        if (this.pcc == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.pcc.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.fum
    public void pcc(Context context) {
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.fum
    public void sf() {
        this.gm.cancel();
    }
}
