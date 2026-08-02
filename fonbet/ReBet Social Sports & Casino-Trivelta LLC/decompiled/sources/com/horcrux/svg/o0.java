package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class o0 extends B {

    /* renamed from: f, reason: collision with root package name */
    public SVGLength f38899f;

    /* renamed from: g, reason: collision with root package name */
    public SVGLength f38900g;

    /* renamed from: h, reason: collision with root package name */
    public String f38901h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f38902i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f38903j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f38904k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f38905l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f38906m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f38907n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f38908o;

    /* renamed from: p, reason: collision with root package name */
    public double f38909p;

    public o0(ReactContext reactContext) {
        super(reactContext);
        this.f38899f = null;
        this.f38900g = null;
        this.f38901h = null;
        this.f38902i = j0.spacing;
        this.f38909p = Double.NaN;
    }

    public String A() {
        String str;
        if (this.f38901h == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof o0) && (str = ((o0) parent).f38901h) != null) {
                    this.f38901h = str;
                    return str;
                }
            }
        }
        return this.f38901h;
    }

    public Path B(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        u();
        this.mPath = super.getPath(canvas, paint);
        t();
        return this.mPath;
    }

    public double C(Paint paint) {
        if (!Double.isNaN(this.f38909p)) {
            return this.f38909p;
        }
        double d10 = 0.0d;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof o0) {
                d10 += ((o0) childAt).C(paint);
            }
        }
        this.f38909p = d10;
        return d10;
    }

    public o0 D() {
        ArrayList arrayList = s().f38988a;
        ViewParent parent = getParent();
        o0 o0Var = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof o0) && ((C3546x) arrayList.get(size)).f38966j != h0.start && o0Var.f38904k == null; size--) {
            o0Var = (o0) parent;
            parent = o0Var.getParent();
        }
        return o0Var;
    }

    public o0 E() {
        ViewParent parent = getParent();
        o0 o0Var = this;
        while (parent instanceof o0) {
            o0Var = (o0) parent;
            parent = o0Var.getParent();
        }
        return o0Var;
    }

    public void F(Dynamic dynamic) {
        this.f38901h = SVGLength.c(dynamic);
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f38907n = SVGLength.a(dynamic);
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f38908o = SVGLength.a(dynamic);
        invalidate();
    }

    public void I(Dynamic dynamic) {
        this.f38899f = SVGLength.b(dynamic);
        invalidate();
    }

    public void J(String str) {
        this.f38902i = j0.valueOf(str);
        invalidate();
    }

    public void K(String str) {
        this.f38903j = d0.b(str);
        invalidate();
    }

    public void L(Dynamic dynamic) {
        this.f38904k = SVGLength.a(dynamic);
        invalidate();
    }

    public void M(Dynamic dynamic) {
        this.f38905l = SVGLength.a(dynamic);
        invalidate();
    }

    public void N(Dynamic dynamic) {
        this.f38906m = SVGLength.a(dynamic);
        invalidate();
    }

    public void O(Dynamic dynamic) {
        this.f38900g = SVGLength.b(dynamic);
        invalidate();
    }

    public void P(Dynamic dynamic) {
        String c10 = SVGLength.c(dynamic);
        if (c10 != null) {
            String trim = c10.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.f38903j = d0.b(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f38903j = d0.baseline;
            }
            try {
                this.f38901h = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f38901h = null;
            }
        } else {
            this.f38903j = d0.baseline;
            this.f38901h = null;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.f38909p = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        y(canvas);
        clip(canvas, paint);
        B(canvas, paint);
        u();
        o(canvas, paint, f10);
        t();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        y(canvas);
        return B(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (this.mPath == null) {
            return;
        }
        super.invalidate();
        E().clearChildCache();
    }

    @Override // com.horcrux.svg.B
    public Path r(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.B
    public void u() {
        s().p(((this instanceof c0) || (this instanceof b0)) ? false : true, this, this.f38626a, this.f38904k, this.f38905l, this.f38907n, this.f38908o, this.f38906m);
    }

    public d0 z() {
        d0 d0Var;
        if (this.f38903j == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof o0) && (d0Var = ((o0) parent).f38903j) != null) {
                    this.f38903j = d0Var;
                    return d0Var;
                }
            }
        }
        if (this.f38903j == null) {
            this.f38903j = d0.baseline;
        }
        return this.f38903j;
    }
}
