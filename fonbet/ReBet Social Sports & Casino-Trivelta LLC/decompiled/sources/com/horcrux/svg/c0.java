package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes3.dex */
public class c0 extends o0 {

    /* renamed from: q, reason: collision with root package name */
    public String f38803q;

    /* renamed from: r, reason: collision with root package name */
    public m0 f38804r;

    /* renamed from: s, reason: collision with root package name */
    public l0 f38805s;

    /* renamed from: t, reason: collision with root package name */
    public SVGLength f38806t;

    /* renamed from: u, reason: collision with root package name */
    public k0 f38807u;

    /* renamed from: v, reason: collision with root package name */
    public n0 f38808v;

    public c0(ReactContext reactContext) {
        super(reactContext);
        this.f38807u = k0.align;
        this.f38808v = n0.exact;
    }

    @Override // com.horcrux.svg.o0
    public void K(String str) {
        this.f38807u = k0.valueOf(str);
        invalidate();
    }

    public l0 Q() {
        return this.f38805s;
    }

    public m0 R() {
        return this.f38804r;
    }

    public SVGLength S() {
        return this.f38806t;
    }

    public Path T(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f38803q);
        if (definedTemplate instanceof RenderableView) {
            return ((RenderableView) definedTemplate).getPath(canvas, paint);
        }
        return null;
    }

    public void U(String str) {
        this.f38803q = str;
        invalidate();
    }

    public void V(String str) {
        this.f38805s = l0.valueOf(str);
        invalidate();
    }

    public void W(String str) {
        this.f38804r = m0.valueOf(str);
        invalidate();
    }

    public void X(String str) {
        this.f38808v = n0.valueOf(str);
        invalidate();
    }

    public void Y(Dynamic dynamic) {
        this.f38806t = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        o(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return B(canvas, paint);
    }

    @Override // com.horcrux.svg.B
    public void t() {
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B
    public void u() {
    }
}
