package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends View {
    private final RectF gm;
    private int kj;
    private Paint oo;
    private int pcc;
    private Paint qf;
    private int sf;
    private Paint vj;
    private int wh;

    public vy(Context context) {
        super(context);
        this.gm = new RectF();
        pcc();
    }

    private void pcc() {
        Paint paint = new Paint();
        this.oo = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.qf = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.vj = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.gm;
        int i = this.wh;
        canvas.drawRoundRect(rectF, i, i, this.vj);
        RectF rectF2 = this.gm;
        int i2 = this.wh;
        canvas.drawRoundRect(rectF2, i2, i2, this.oo);
        int i3 = this.pcc;
        int i4 = this.sf;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.qf);
        int i5 = this.pcc;
        int i6 = this.sf;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.qf);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.pcc = i;
        this.sf = i2;
        RectF rectF = this.gm;
        int i5 = this.kj;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }

    public void setBgColor(int i) {
        this.vj.setStyle(Paint.Style.FILL);
        this.vj.setColor(i);
    }

    public void setDislikeColor(int i) {
        this.qf.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.qf.setStrokeWidth(i);
    }

    public void setRadius(int i) {
        this.wh = i;
    }

    public void setStrokeColor(int i) {
        this.oo.setStyle(Paint.Style.STROKE);
        this.oo.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.oo.setStrokeWidth(i);
        this.kj = i;
    }
}
