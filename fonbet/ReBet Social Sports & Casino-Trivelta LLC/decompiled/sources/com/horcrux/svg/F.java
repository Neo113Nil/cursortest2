package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes3.dex */
public class F extends B {

    /* renamed from: f, reason: collision with root package name */
    public SVGLength f38653f;

    /* renamed from: g, reason: collision with root package name */
    public SVGLength f38654g;

    /* renamed from: h, reason: collision with root package name */
    public SVGLength f38655h;

    /* renamed from: i, reason: collision with root package name */
    public SVGLength f38656i;

    /* renamed from: j, reason: collision with root package name */
    public String f38657j;

    /* renamed from: k, reason: collision with root package name */
    public String f38658k;

    /* renamed from: l, reason: collision with root package name */
    public float f38659l;

    /* renamed from: m, reason: collision with root package name */
    public float f38660m;

    /* renamed from: n, reason: collision with root package name */
    public float f38661n;

    /* renamed from: o, reason: collision with root package name */
    public float f38662o;

    /* renamed from: p, reason: collision with root package name */
    public String f38663p;

    /* renamed from: q, reason: collision with root package name */
    public int f38664q;

    /* renamed from: r, reason: collision with root package name */
    public Matrix f38665r;

    public F(ReactContext reactContext) {
        super(reactContext);
        this.f38665r = new Matrix();
    }

    public void A(Dynamic dynamic) {
        this.f38656i = SVGLength.b(dynamic);
        invalidate();
    }

    public void B(String str) {
        this.f38657j = str;
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f38655h = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(String str) {
        this.f38658k = str;
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f38653f = SVGLength.b(dynamic);
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f38654g = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f38663p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f38664q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f38659l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f38660m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f38662o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f38661n = f10;
        invalidate();
    }

    public void z(Canvas canvas, Paint paint, float f10, N n10, float f11) {
        int saveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f38665r.reset();
        L l10 = n10.f38713b;
        this.f38665r.setTranslate((float) l10.f38703a, (float) l10.f38704b);
        double parseDouble = "auto".equals(this.f38658k) ? -1.0d : Double.parseDouble(this.f38658k);
        if (parseDouble == -1.0d) {
            parseDouble = n10.f38714c;
        }
        this.f38665r.preRotate(((float) parseDouble) + 180.0f);
        if ("strokeWidth".equals(this.f38657j)) {
            Matrix matrix = this.f38665r;
            float f12 = this.mScale;
            matrix.preScale(f11 / f12, f11 / f12);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) relativeOnWidth(this.f38655h), (float) relativeOnHeight(this.f38656i));
        if (this.f38663p != null) {
            float f13 = this.f38659l;
            float f14 = this.mScale;
            float f15 = this.f38660m;
            Matrix a10 = q0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f38661n) * f14, (f15 + this.f38662o) * f14), rectF, this.f38663p, this.f38664q);
            float[] fArr = new float[9];
            a10.getValues(fArr);
            this.f38665r.preScale(fArr[0], fArr[4]);
        }
        this.f38665r.preTranslate((float) (-relativeOnWidth(this.f38653f)), (float) (-relativeOnHeight(this.f38654g)));
        canvas.concat(this.f38665r);
        o(canvas, paint, f10);
        restoreCanvas(canvas, saveAndSetupCanvas);
    }
}
