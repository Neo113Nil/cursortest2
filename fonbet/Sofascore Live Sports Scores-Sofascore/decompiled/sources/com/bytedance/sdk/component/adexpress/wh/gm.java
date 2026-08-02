package com.bytedance.sdk.component.adexpress.wh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.atb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends FrameLayout {
    private ImageView gm;
    private TextView oo;
    private Context pcc;
    private ImageView sf;
    private dax vj;
    private AnimatorSet wh;

    public gm(@NonNull Context context) {
        super(context);
        this.wh = new AnimatorSet();
        this.pcc = context;
        vj();
        wh();
    }

    private void vj() {
        FrameLayout frameLayout = new FrameLayout(this.pcc);
        this.vj = new dax(this.pcc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 95.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.vj, layoutParams);
        this.sf = new ImageView(this.pcc);
        int pcc = atb.pcc(this.pcc, 60.0f);
        this.sf.setImageDrawable(com.bytedance.sdk.component.adexpress.oo.kj.pcc(1, null, null, new int[]{pcc, pcc}, Integer.valueOf(atb.pcc(this.pcc, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 75.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.sf, layoutParams2);
        this.gm = new ImageView(this.pcc);
        int pcc2 = atb.pcc(this.pcc, 50.0f);
        this.gm.setImageDrawable(com.bytedance.sdk.component.adexpress.oo.kj.pcc(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{pcc2, pcc2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 63.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.gm, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.pcc);
        this.oo = textView;
        textView.setTextColor(-1);
        this.oo.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.oo, layoutParams4);
    }

    private void wh() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.gm, "scaleX", 1.0f, 0.9f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.gm, "scaleY", 1.0f, 0.9f);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.wh.setDuration(800L);
        this.wh.playTogether(ofFloat, ofFloat2);
    }

    public void gm() {
        this.vj.pcc();
    }

    public void oo() {
        this.vj.sf();
        this.vj.gm();
    }

    public void pcc() {
        this.wh.start();
    }

    public void setGuideText(String str) {
        this.oo.setText(str);
    }

    public void sf() {
        this.wh.cancel();
    }
}
