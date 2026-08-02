package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;

/* loaded from: classes3.dex */
public class p0 extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    public String f38913a;

    /* renamed from: b, reason: collision with root package name */
    public SVGLength f38914b;

    /* renamed from: c, reason: collision with root package name */
    public SVGLength f38915c;

    /* renamed from: d, reason: collision with root package name */
    public SVGLength f38916d;

    /* renamed from: e, reason: collision with root package name */
    public SVGLength f38917e;

    public p0(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        Canvas canvas2;
        Paint paint2;
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f38913a);
        if (definedTemplate == null) {
            E6.a.K(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f38913a + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f38914b), (float) relativeOnHeight(this.f38915c));
        boolean z10 = definedTemplate instanceof RenderableView;
        if (z10) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int saveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof T) {
            canvas2 = canvas;
            paint2 = paint;
            ((T) definedTemplate).z(canvas2, paint2, f10, (float) relativeOnWidth(this.f38916d), (float) relativeOnHeight(this.f38917e));
        } else {
            canvas2 = canvas;
            paint2 = paint;
            definedTemplate.draw(canvas2, paint2, f10 * this.mOpacity);
        }
        RectF rectF = new RectF();
        getPath(canvas2, paint2).computeBounds(rectF, true);
        canvas2.getMatrix().mapRect(rectF);
        setClientRect(rectF);
        definedTemplate.restoreCanvas(canvas2, saveAndSetupCanvas);
        if (z10) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f38913a);
        if (definedTemplate == null) {
            E6.a.K(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f38913a + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f38914b), (float) relativeOnHeight(this.f38915c));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f38913a);
        if (definedTemplate != null) {
            int hitTest = definedTemplate.hitTest(fArr2);
            if (hitTest != -1) {
                return (definedTemplate.isResponsible() || hitTest != definedTemplate.getId()) ? hitTest : getId();
            }
            return -1;
        }
        E6.a.K(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f38913a + " is not defined.");
        return -1;
    }

    public void o(Dynamic dynamic) {
        this.f38917e = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(String str) {
        this.f38913a = str;
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f38916d = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f38914b = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f38915c = SVGLength.b(dynamic);
        invalidate();
    }
}
