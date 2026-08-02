package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C3523a;

/* loaded from: classes3.dex */
public class K extends B {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    public SVGLength f38690f;

    /* renamed from: g, reason: collision with root package name */
    public SVGLength f38691g;

    /* renamed from: h, reason: collision with root package name */
    public SVGLength f38692h;

    /* renamed from: i, reason: collision with root package name */
    public SVGLength f38693i;

    /* renamed from: j, reason: collision with root package name */
    public C3523a.b f38694j;

    /* renamed from: k, reason: collision with root package name */
    public C3523a.b f38695k;

    /* renamed from: l, reason: collision with root package name */
    public float f38696l;

    /* renamed from: m, reason: collision with root package name */
    public float f38697m;

    /* renamed from: n, reason: collision with root package name */
    public float f38698n;

    /* renamed from: o, reason: collision with root package name */
    public float f38699o;

    /* renamed from: p, reason: collision with root package name */
    public String f38700p;

    /* renamed from: q, reason: collision with root package name */
    public int f38701q;

    /* renamed from: r, reason: collision with root package name */
    public Matrix f38702r;

    public K(ReactContext reactContext) {
        super(reactContext);
        this.f38702r = null;
    }

    public void A(int i10) {
        if (i10 == 0) {
            this.f38695k = C3523a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f38695k = C3523a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void B(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int c10 = M.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.f38702r == null) {
                    this.f38702r = new Matrix();
                }
                this.f38702r.setValues(fArr);
            } else if (c10 != -1) {
                E6.a.K(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f38702r = null;
        }
        invalidate();
    }

    public void C(int i10) {
        if (i10 == 0) {
            this.f38694j = C3523a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f38694j = C3523a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f38692h = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f38690f = SVGLength.b(dynamic);
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f38691g = SVGLength.b(dynamic);
        invalidate();
    }

    public RectF getViewBox() {
        float f10 = this.f38696l;
        float f11 = this.mScale;
        float f12 = this.f38697m;
        return new RectF(f10 * f11, f12 * f11, (f10 + this.f38698n) * f11, (f12 + this.f38699o) * f11);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            C3523a c3523a = new C3523a(C3523a.EnumC0540a.PATTERN, new SVGLength[]{this.f38690f, this.f38691g, this.f38692h, this.f38693i}, this.f38694j);
            c3523a.d(this.f38695k);
            c3523a.g(this);
            Matrix matrix = this.f38702r;
            if (matrix != null) {
                c3523a.f(matrix);
            }
            SvgView svgView = getSvgView();
            C3523a.b bVar = this.f38694j;
            C3523a.b bVar2 = C3523a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f38695k == bVar2) {
                c3523a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c3523a, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f38700p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f38701q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f38696l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f38697m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f38699o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f38698n = f10;
        invalidate();
    }

    public void z(Dynamic dynamic) {
        this.f38693i = SVGLength.b(dynamic);
        invalidate();
    }
}
