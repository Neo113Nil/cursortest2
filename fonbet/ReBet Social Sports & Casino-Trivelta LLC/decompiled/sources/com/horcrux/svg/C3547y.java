package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ViewProps;

/* renamed from: com.horcrux.svg.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3547y extends B {

    /* renamed from: f, reason: collision with root package name */
    public SVGLength f38972f;

    /* renamed from: g, reason: collision with root package name */
    public SVGLength f38973g;

    /* renamed from: h, reason: collision with root package name */
    public SVGLength f38974h;

    /* renamed from: i, reason: collision with root package name */
    public SVGLength f38975i;

    /* renamed from: j, reason: collision with root package name */
    public Bitmap f38976j;

    /* renamed from: k, reason: collision with root package name */
    public Canvas f38977k;

    public C3547y(ReactContext reactContext) {
        super(reactContext);
        this.f38976j = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f38977k = new Canvas(this.f38976j);
    }

    public void A(Dynamic dynamic) {
        this.f38974h = SVGLength.b(dynamic);
        invalidate();
    }

    public void B(Dynamic dynamic) {
        this.f38972f = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f38973g = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f38977k);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        float relativeOnWidth = (float) relativeOnWidth(this.f38972f);
        float relativeOnHeight = (float) relativeOnHeight(this.f38973g);
        float relativeOnWidth2 = (float) relativeOnWidth(this.f38974h);
        float relativeOnHeight2 = (float) relativeOnHeight(this.f38975i);
        canvas.translate(relativeOnWidth, relativeOnHeight);
        canvas.clipRect(0.0f, 0.0f, relativeOnWidth2, relativeOnHeight2);
        super.draw(canvas, paint, f10);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(this.f38977k, view, j10);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        super.invalidate();
        SvgView svgView = getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
    }

    @Override // com.horcrux.svg.B
    public void o(Canvas canvas, Paint paint, float f10) {
        u();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!ViewProps.NONE.equals(virtualView.mDisplay)) {
                        boolean z10 = virtualView instanceof RenderableView;
                        if (z10) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f10);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                        if (z10) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    int save = canvas.save();
                    canvas.translate(childAt.getLeft(), childAt.getTop());
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        canvas.concat(matrix);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(save);
                }
            }
        }
        setClientRect(rectF);
        t();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public void z(Dynamic dynamic) {
        this.f38975i = SVGLength.b(dynamic);
        invalidate();
    }
}
