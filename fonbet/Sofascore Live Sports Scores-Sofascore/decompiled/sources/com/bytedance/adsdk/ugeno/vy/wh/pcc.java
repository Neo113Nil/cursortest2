package com.bytedance.adsdk.ugeno.vy.wh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.pcc.kj;
import com.bytedance.adsdk.ugeno.pcc.qf;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends TextView implements IAnimation, qf {
    private kj gm;
    private float oo;
    private oo pcc;
    private float qf;
    private float sf;
    private float vj;
    private float wh;

    public pcc(Context context) {
        super(context);
        this.oo = -1.0f;
        this.wh = 1.0f;
        this.qf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.gm = new kj(this);
    }

    private void pcc(int i, int i2) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i2 <= 0 || i <= 0 || this.vj == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        TextPaint paint = getPaint();
        float f = this.vj;
        int pcc = pcc(text, paint, i, f);
        while (pcc > i2) {
            float f2 = this.oo;
            if (f <= f2) {
                break;
            }
            f = Math.max(f - 1.0f, f2);
            pcc = pcc(text, paint, i, f);
        }
        "resizeText: targetSize: ".concat(String.valueOf(f));
        setTextSize(0, f);
        setLineSpacing(this.qf, this.wh);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.sf(canvas);
        }
    }

    public float getBorderRadius() {
        return this.gm.pcc();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.pcc.qf
    public float getRipple() {
        return this.sf;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getRubIn() {
        return this.gm.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getShine() {
        return this.gm.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getStretch() {
        return this.gm.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.pcc(canvas, this);
            this.pcc.pcc(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.pcc(i, i2, i3, i4);
        }
        if (z && this.oo > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            pcc(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        oo ooVar = this.pcc;
        if (ooVar == null) {
            super.onMeasure(i, i2);
        } else {
            int[] pcc = ooVar.pcc(i, i2);
            super.onMeasure(pcc[0], pcc[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.gm.pcc(i);
    }

    public void setBorderRadius(float f) {
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.pcc(f);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.wh = f2;
        this.qf = f;
    }

    public void setMinTextSize(float f) {
        this.oo = f;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.sf = f;
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.sf(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.vj(f);
        }
    }

    public void setShine(float f) {
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.gm(f);
        }
    }

    public void setStretch(float f) {
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.oo(f);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.vj = getTextSize();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.vj = getTextSize();
    }

    public void pcc(oo ooVar) {
        this.pcc = ooVar;
    }

    private int pcc(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        return new StaticLayout(charSequence, textPaint2, i, Layout.Alignment.ALIGN_NORMAL, this.wh, this.qf, true).getHeight();
    }
}
