package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C3523a;

/* loaded from: classes3.dex */
public class E extends AbstractC3527e {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public SVGLength f38646a;

    /* renamed from: b, reason: collision with root package name */
    public SVGLength f38647b;

    /* renamed from: c, reason: collision with root package name */
    public SVGLength f38648c;

    /* renamed from: d, reason: collision with root package name */
    public SVGLength f38649d;

    /* renamed from: e, reason: collision with root package name */
    public ReadableArray f38650e;

    /* renamed from: f, reason: collision with root package name */
    public C3523a.b f38651f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f38652g;

    public E(ReactContext reactContext) {
        super(reactContext);
        this.f38651f = C3523a.b.OBJECT_BOUNDING_BOX;
        this.f38652g = null;
    }

    public void o(ReadableArray readableArray) {
        this.f38650e = readableArray;
        invalidate();
    }

    public void p(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int c10 = M.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.f38652g == null) {
                    this.f38652g = new Matrix();
                }
                this.f38652g.setValues(fArr);
            } else if (c10 != -1) {
                E6.a.K(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f38652g = null;
        }
        invalidate();
    }

    public void q(int i10) {
        if (i10 == 0) {
            this.f38651f = C3523a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f38651f = C3523a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f38646a = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f38648c = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            C3523a c3523a = new C3523a(C3523a.EnumC0540a.LINEAR_GRADIENT, new SVGLength[]{this.f38646a, this.f38647b, this.f38648c, this.f38649d}, this.f38651f);
            c3523a.e(this.f38650e);
            Matrix matrix = this.f38652g;
            if (matrix != null) {
                c3523a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f38651f == C3523a.b.USER_SPACE_ON_USE) {
                c3523a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c3523a, this.mName);
        }
    }

    public void t(Dynamic dynamic) {
        this.f38647b = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f38649d = SVGLength.b(dynamic);
        invalidate();
    }
}
