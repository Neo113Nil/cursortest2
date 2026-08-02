package com.bytedance.adsdk.ugeno.vy.vj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.qf.kj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends FrameLayout {
    private double gm;
    private oo kj;
    private float oo;
    private float pcc;
    private Context qf;
    private float sf;
    private LinearLayout vj;
    private LinearLayout wh;

    public pcc(Context context) {
        super(context);
        this.qf = context;
        this.vj = new LinearLayout(context);
        this.wh = new LinearLayout(context);
        this.vj.setOrientation(0);
        this.vj.setGravity(8388611);
        this.wh.setOrientation(0);
        this.wh.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.pcc, (int) this.sf);
        float f = this.oo;
        layoutParams.leftMargin = (int) f;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.pcc(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.pcc(i, i2);
        }
        super.onMeasure(i, i2);
        this.vj.measure(i, i2);
        double floor = Math.floor(this.gm);
        float f = this.oo;
        this.wh.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.gm - floor) * this.pcc) + ((f + f + r2) * floor) + f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.vj.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void pcc(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.vj.removeAllViews();
        this.wh.removeAllViews();
        this.pcc = (int) kj.pcc(this.qf, f);
        this.sf = (int) kj.pcc(this.qf, f);
        this.gm = d;
        this.oo = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            pcc(starImageView, "tt_ugen_rating_star");
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.wh.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            pcc(starImageView2, "tt_ugen_rating_star");
            starImageView2.setColorFilter(i2);
            this.vj.addView(starImageView2);
        }
        addView(this.vj);
        addView(this.wh);
        requestLayout();
    }

    public void pcc(ImageView imageView, String str) {
        imageView.setImageResource(com.bytedance.adsdk.ugeno.qf.oo.sf(this.qf, str));
    }

    public void pcc(oo ooVar) {
        this.kj = ooVar;
    }
}
