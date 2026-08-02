package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3524b extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    public SVGLength f38794a;

    /* renamed from: b, reason: collision with root package name */
    public SVGLength f38795b;

    /* renamed from: c, reason: collision with root package name */
    public SVGLength f38796c;

    public C3524b(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f38794a);
        double relativeOnHeight = relativeOnHeight(this.f38795b);
        double relativeOnOther = relativeOnOther(this.f38796c);
        path.addCircle((float) relativeOnWidth, (float) relativeOnHeight, (float) relativeOnOther, Path.Direction.CW);
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d10 = relativeOnHeight - relativeOnOther;
        arrayList.add(new H(EnumC3529g.kCGPathElementMoveToPoint, new L[]{new L(relativeOnWidth, d10)}));
        ArrayList<H> arrayList2 = this.elements;
        EnumC3529g enumC3529g = EnumC3529g.kCGPathElementAddLineToPoint;
        double d11 = relativeOnWidth + relativeOnOther;
        arrayList2.add(new H(enumC3529g, new L[]{new L(relativeOnWidth, d10), new L(d11, relativeOnHeight)}));
        double d12 = relativeOnHeight + relativeOnOther;
        this.elements.add(new H(enumC3529g, new L[]{new L(d11, relativeOnHeight), new L(relativeOnWidth, d12)}));
        ArrayList<H> arrayList3 = this.elements;
        L l10 = new L(relativeOnWidth, d12);
        double d13 = relativeOnWidth - relativeOnOther;
        arrayList3.add(new H(enumC3529g, new L[]{l10, new L(d13, relativeOnHeight)}));
        this.elements.add(new H(enumC3529g, new L[]{new L(d13, relativeOnHeight), new L(relativeOnWidth, d10)}));
        return path;
    }

    public void o(Dynamic dynamic) {
        this.f38794a = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(Dynamic dynamic) {
        this.f38795b = SVGLength.b(dynamic);
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f38796c = SVGLength.b(dynamic);
        invalidate();
    }
}
