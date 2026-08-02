package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C3523a;

/* loaded from: classes3.dex */
public class P extends AbstractC3527e {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public SVGLength f38718a;

    /* renamed from: b, reason: collision with root package name */
    public SVGLength f38719b;

    /* renamed from: c, reason: collision with root package name */
    public SVGLength f38720c;

    /* renamed from: d, reason: collision with root package name */
    public SVGLength f38721d;

    /* renamed from: e, reason: collision with root package name */
    public SVGLength f38722e;

    /* renamed from: f, reason: collision with root package name */
    public SVGLength f38723f;

    /* renamed from: g, reason: collision with root package name */
    public ReadableArray f38724g;

    /* renamed from: h, reason: collision with root package name */
    public C3523a.b f38725h;

    /* renamed from: i, reason: collision with root package name */
    public Matrix f38726i;

    public P(ReactContext reactContext) {
        super(reactContext);
        this.f38726i = null;
    }

    public void o(Dynamic dynamic) {
        this.f38722e = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(Dynamic dynamic) {
        this.f38723f = SVGLength.b(dynamic);
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f38718a = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f38719b = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(ReadableArray readableArray) {
        this.f38724g = readableArray;
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            C3523a c3523a = new C3523a(C3523a.EnumC0540a.RADIAL_GRADIENT, new SVGLength[]{this.f38718a, this.f38719b, this.f38720c, this.f38721d, this.f38722e, this.f38723f}, this.f38725h);
            c3523a.e(this.f38724g);
            Matrix matrix = this.f38726i;
            if (matrix != null) {
                c3523a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f38725h == C3523a.b.USER_SPACE_ON_USE) {
                c3523a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c3523a, this.mName);
        }
    }

    public void t(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int c10 = M.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.f38726i == null) {
                    this.f38726i = new Matrix();
                }
                this.f38726i.setValues(fArr);
            } else if (c10 != -1) {
                E6.a.K(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f38726i = null;
        }
        invalidate();
    }

    public void u(int i10) {
        if (i10 == 0) {
            this.f38725h = C3523a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f38725h = C3523a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f38720c = SVGLength.b(dynamic);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f38721d = SVGLength.b(dynamic);
        invalidate();
    }
}
