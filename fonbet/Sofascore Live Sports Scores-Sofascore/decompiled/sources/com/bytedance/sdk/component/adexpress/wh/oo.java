package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends View {
    private int gbb;
    private float gm;
    private float hc;
    private List<Integer> kj;
    private int oo;
    private Paint ork;
    private int pcc;
    private boolean qf;
    private int sf;
    private float tmg;
    private Paint vh;
    private float vj;
    private List<Integer> vy;
    private int wh;

    public oo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pcc = -1;
        this.sf = -65536;
        this.gm = 18.0f;
        this.oo = 3;
        this.vj = 50.0f;
        this.wh = 2;
        this.qf = false;
        this.kj = new ArrayList();
        this.vy = new ArrayList();
        this.gbb = 24;
        gm();
    }

    private void gm() {
        Paint paint = new Paint();
        this.ork = paint;
        paint.setAntiAlias(true);
        this.ork.setStrokeWidth(this.gbb);
        this.kj.add(255);
        this.vy.add(0);
        Paint paint2 = new Paint();
        this.vh = paint2;
        paint2.setAntiAlias(true);
        this.vh.setColor(Color.parseColor("#0FFFFFFF"));
        this.vh.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.ork.setShader(new LinearGradient(this.tmg, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.hc, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.kj.size()) {
                break;
            }
            Integer num = this.kj.get(i);
            this.ork.setAlpha(num.intValue());
            Integer num2 = this.vy.get(i);
            if (this.gm + num2.intValue() < this.vj) {
                canvas.drawCircle(this.tmg, this.hc, this.gm + num2.intValue(), this.ork);
            }
            if (num.intValue() > 0 && num2.intValue() < this.vj) {
                this.kj.set(i, Integer.valueOf(num.intValue() - this.wh > 0 ? num.intValue() - (this.wh * 3) : 1));
                this.vy.set(i, Integer.valueOf(num2.intValue() + this.wh));
            }
            i++;
        }
        if (((Integer) mz1.g(1, this.vy)).intValue() >= this.vj / this.oo) {
            this.kj.add(255);
            this.vy.add(0);
        }
        if (this.vy.size() >= 3) {
            this.vy.remove(0);
            this.kj.remove(0);
        }
        this.ork.setAlpha(255);
        this.ork.setColor(this.sf);
        canvas.drawCircle(this.tmg, this.hc, this.gm, this.vh);
        if (this.qf) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        this.tmg = f;
        this.hc = i2 / 2.0f;
        float f2 = f - (this.gbb / 2.0f);
        this.vj = f2;
        this.gm = f2 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    public void pcc() {
        this.qf = true;
        invalidate();
    }

    public void setColor(int i) {
        this.pcc = i;
    }

    public void setCoreColor(int i) {
        this.sf = i;
    }

    public void setCoreRadius(int i) {
        this.gm = i;
    }

    public void setDiffuseSpeed(int i) {
        this.wh = i;
    }

    public void setDiffuseWidth(int i) {
        this.oo = i;
    }

    public void setMaxWidth(int i) {
        this.vj = i;
    }

    public void sf() {
        this.qf = false;
        this.vy.clear();
        this.kj.clear();
        this.kj.add(255);
        this.vy.add(0);
        invalidate();
    }

    public oo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public oo(Context context) {
        this(context, null);
    }
}
