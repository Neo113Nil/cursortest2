package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.C3523a;

/* loaded from: classes3.dex */
public class G extends B {

    /* renamed from: f, reason: collision with root package name */
    public SVGLength f38666f;

    /* renamed from: g, reason: collision with root package name */
    public SVGLength f38667g;

    /* renamed from: h, reason: collision with root package name */
    public SVGLength f38668h;

    /* renamed from: i, reason: collision with root package name */
    public SVGLength f38669i;

    /* renamed from: j, reason: collision with root package name */
    public C3523a.b f38670j;

    /* renamed from: k, reason: collision with root package name */
    public C3523a.b f38671k;

    /* renamed from: l, reason: collision with root package name */
    public a f38672l;

    public enum a {
        LUMINANCE,
        ALPHA
    }

    public G(ReactContext reactContext) {
        super(reactContext);
        this.f38670j = C3523a.b.OBJECT_BOUNDING_BOX;
        this.f38672l = a.LUMINANCE;
    }

    public C3523a.b A() {
        return this.f38670j;
    }

    public void B(Dynamic dynamic) {
        this.f38669i = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(int i10) {
        if (i10 == 0) {
            this.f38671k = C3523a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f38671k = C3523a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void D(int i10) {
        if (i10 == 0) {
            this.f38672l = a.LUMINANCE;
        } else if (i10 == 1) {
            this.f38672l = a.ALPHA;
        }
        invalidate();
    }

    public void E(int i10) {
        if (i10 == 0) {
            this.f38670j = C3523a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f38670j = C3523a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f38668h = SVGLength.b(dynamic);
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f38666f = SVGLength.b(dynamic);
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f38667g = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    public a z() {
        return this.f38672l;
    }
}
