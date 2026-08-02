package com.bytedance.adsdk.ugeno.pcc;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj implements qf {
    private float gm;
    private float oo;
    private View pcc;
    private float sf;
    private float vj;
    private float wh;

    public kj(View view) {
        this.pcc = view;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getRipple() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getRubIn() {
        return this.wh;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getShine() {
        return this.oo;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getStretch() {
        return this.vj;
    }

    public void gm(float f) {
        View view = this.pcc;
        if (view == null) {
            return;
        }
        this.oo = f;
        view.postInvalidate();
    }

    public void oo(float f) {
        this.vj = f;
        this.pcc.postInvalidate();
    }

    public void pcc(int i) {
        View view = this.pcc;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i);
        }
    }

    public void sf(float f) {
        View view = this.pcc;
        if (view == null) {
            return;
        }
        this.gm = f;
        view.postInvalidate();
    }

    public void vj(float f) {
        this.wh = f;
        this.pcc.postInvalidate();
    }

    public float pcc() {
        return this.sf;
    }

    public void pcc(float f) {
        View view = this.pcc;
        if (view == null) {
            return;
        }
        this.sf = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }
}
