package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class Q extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    public SVGLength f38727a;

    /* renamed from: b, reason: collision with root package name */
    public SVGLength f38728b;

    /* renamed from: c, reason: collision with root package name */
    public SVGLength f38729c;

    /* renamed from: d, reason: collision with root package name */
    public SVGLength f38730d;

    /* renamed from: e, reason: collision with root package name */
    public SVGLength f38731e;

    /* renamed from: f, reason: collision with root package name */
    public SVGLength f38732f;

    public Q(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Path getPath(Canvas canvas, Paint paint) {
        double relativeOnWidth;
        double relativeOnHeight;
        double d10;
        double d11;
        Path path = new Path();
        double relativeOnWidth2 = relativeOnWidth(this.f38727a);
        double relativeOnHeight2 = relativeOnHeight(this.f38728b);
        double relativeOnWidth3 = relativeOnWidth(this.f38729c);
        double relativeOnHeight3 = relativeOnHeight(this.f38730d);
        SVGLength sVGLength = this.f38731e;
        if (sVGLength == null && this.f38732f == null) {
            path.addRect((float) relativeOnWidth2, (float) relativeOnHeight2, (float) (relativeOnWidth2 + relativeOnWidth3), (float) (relativeOnHeight2 + relativeOnHeight3), Path.Direction.CW);
            path.close();
        } else {
            if (sVGLength == null) {
                relativeOnWidth = relativeOnHeight(this.f38732f);
            } else if (this.f38732f == null) {
                relativeOnWidth = relativeOnWidth(sVGLength);
            } else {
                relativeOnWidth = relativeOnWidth(sVGLength);
                relativeOnHeight = relativeOnHeight(this.f38732f);
                d10 = relativeOnWidth3 / 2.0d;
                if (relativeOnWidth > d10) {
                    relativeOnWidth = d10;
                }
                d11 = relativeOnHeight3 / 2.0d;
                if (relativeOnHeight > d11) {
                    relativeOnHeight = d11;
                }
                path.addRoundRect((float) relativeOnWidth2, (float) relativeOnHeight2, (float) (relativeOnWidth2 + relativeOnWidth3), (float) (relativeOnHeight2 + relativeOnHeight3), (float) relativeOnWidth, (float) relativeOnHeight, Path.Direction.CW);
            }
            relativeOnHeight = relativeOnWidth;
            d10 = relativeOnWidth3 / 2.0d;
            if (relativeOnWidth > d10) {
            }
            d11 = relativeOnHeight3 / 2.0d;
            if (relativeOnHeight > d11) {
            }
            path.addRoundRect((float) relativeOnWidth2, (float) relativeOnHeight2, (float) (relativeOnWidth2 + relativeOnWidth3), (float) (relativeOnHeight2 + relativeOnHeight3), (float) relativeOnWidth, (float) relativeOnHeight, Path.Direction.CW);
        }
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new H(EnumC3529g.kCGPathElementMoveToPoint, new L[]{new L(relativeOnWidth2, relativeOnHeight2)}));
        ArrayList<H> arrayList2 = this.elements;
        EnumC3529g enumC3529g = EnumC3529g.kCGPathElementAddLineToPoint;
        double d12 = relativeOnWidth3 + relativeOnWidth2;
        arrayList2.add(new H(enumC3529g, new L[]{new L(d12, relativeOnHeight2)}));
        double d13 = relativeOnHeight2 + relativeOnHeight3;
        this.elements.add(new H(enumC3529g, new L[]{new L(d12, d13)}));
        this.elements.add(new H(enumC3529g, new L[]{new L(relativeOnWidth2, d13)}));
        this.elements.add(new H(enumC3529g, new L[]{new L(relativeOnWidth2, relativeOnHeight2)}));
        return path;
    }

    public void o(Dynamic dynamic) {
        this.f38730d = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(Dynamic dynamic) {
        this.f38731e = SVGLength.b(dynamic);
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f38732f = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f38729c = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f38727a = SVGLength.b(dynamic);
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f38728b = SVGLength.b(dynamic);
        invalidate();
    }
}
