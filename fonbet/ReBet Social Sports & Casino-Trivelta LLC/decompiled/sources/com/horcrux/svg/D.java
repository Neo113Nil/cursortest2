package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class D extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    public SVGLength f38642a;

    /* renamed from: b, reason: collision with root package name */
    public SVGLength f38643b;

    /* renamed from: c, reason: collision with root package name */
    public SVGLength f38644c;

    /* renamed from: d, reason: collision with root package name */
    public SVGLength f38645d;

    public D(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f38642a);
        double relativeOnHeight = relativeOnHeight(this.f38643b);
        double relativeOnWidth2 = relativeOnWidth(this.f38644c);
        double relativeOnHeight2 = relativeOnHeight(this.f38645d);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new H(EnumC3529g.kCGPathElementMoveToPoint, new L[]{new L(relativeOnWidth, relativeOnHeight)}));
        this.elements.add(new H(EnumC3529g.kCGPathElementAddLineToPoint, new L[]{new L(relativeOnWidth2, relativeOnHeight2)}));
        return path;
    }

    public void o(Dynamic dynamic) {
        this.f38642a = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(Dynamic dynamic) {
        this.f38644c = SVGLength.b(dynamic);
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f38643b = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f38645d = SVGLength.b(dynamic);
        invalidate();
    }
}
