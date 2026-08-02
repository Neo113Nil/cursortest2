package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3530h extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    public SVGLength f38854a;

    /* renamed from: b, reason: collision with root package name */
    public SVGLength f38855b;

    /* renamed from: c, reason: collision with root package name */
    public SVGLength f38856c;

    /* renamed from: d, reason: collision with root package name */
    public SVGLength f38857d;

    public C3530h(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f38854a);
        double relativeOnHeight = relativeOnHeight(this.f38855b);
        double relativeOnWidth2 = relativeOnWidth(this.f38856c);
        double relativeOnHeight2 = relativeOnHeight(this.f38857d);
        double d10 = relativeOnWidth - relativeOnWidth2;
        double d11 = relativeOnHeight - relativeOnHeight2;
        double d12 = relativeOnWidth + relativeOnWidth2;
        double d13 = relativeOnHeight + relativeOnHeight2;
        path.addOval(new RectF((float) d10, (float) d11, (float) d12, (float) d13), Path.Direction.CW);
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new H(EnumC3529g.kCGPathElementMoveToPoint, new L[]{new L(relativeOnWidth, d11)}));
        ArrayList<H> arrayList2 = this.elements;
        EnumC3529g enumC3529g = EnumC3529g.kCGPathElementAddLineToPoint;
        arrayList2.add(new H(enumC3529g, new L[]{new L(relativeOnWidth, d11), new L(d12, relativeOnHeight)}));
        this.elements.add(new H(enumC3529g, new L[]{new L(d12, relativeOnHeight), new L(relativeOnWidth, d13)}));
        this.elements.add(new H(enumC3529g, new L[]{new L(relativeOnWidth, d13), new L(d10, relativeOnHeight)}));
        this.elements.add(new H(enumC3529g, new L[]{new L(d10, relativeOnHeight), new L(relativeOnWidth, d11)}));
        return path;
    }

    public void o(Dynamic dynamic) {
        this.f38854a = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(Dynamic dynamic) {
        this.f38855b = SVGLength.b(dynamic);
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f38856c = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f38857d = SVGLength.b(dynamic);
        invalidate();
    }
}
