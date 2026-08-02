package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.SVGLength;

/* loaded from: classes3.dex */
public class FilterRegion {
    SVGLength mH;
    SVGLength mW;
    SVGLength mX;
    SVGLength mY;

    private double getRelativeOrDefault(VirtualView virtualView, SVGLength sVGLength, float f10, double d10) {
        return (sVGLength == null || sVGLength.f38737b == SVGLength.UnitType.UNKNOWN) ? d10 : virtualView.relativeOn(sVGLength, f10);
    }

    public Rect getCropRect(VirtualView virtualView, EnumC3544v enumC3544v, RectF rectF) {
        double d10;
        double relativeOrDefault;
        double d11;
        double d12;
        if (rectF == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (enumC3544v == EnumC3544v.OBJECT_BOUNDING_BOX) {
            d10 = rectF.left + virtualView.relativeOnFraction(this.mX, rectF.width());
            d12 = rectF.top + virtualView.relativeOnFraction(this.mY, rectF.height());
            d11 = virtualView.relativeOnFraction(this.mW, rectF.width());
            relativeOrDefault = virtualView.relativeOnFraction(this.mH, rectF.height());
        } else {
            float canvasWidth = virtualView.getSvgView().getCanvasWidth();
            float canvasHeight = virtualView.getSvgView().getCanvasHeight();
            double relativeOrDefault2 = getRelativeOrDefault(virtualView, this.mX, canvasWidth, rectF.left);
            double relativeOrDefault3 = getRelativeOrDefault(virtualView, this.mY, canvasHeight, rectF.top);
            double relativeOrDefault4 = getRelativeOrDefault(virtualView, this.mW, canvasWidth, rectF.width());
            d10 = relativeOrDefault2;
            relativeOrDefault = getRelativeOrDefault(virtualView, this.mH, canvasHeight, rectF.height());
            d11 = relativeOrDefault4;
            d12 = relativeOrDefault3;
        }
        return new Rect((int) d10, (int) d12, (int) (d10 + d11), (int) (d12 + relativeOrDefault));
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.b(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.b(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.b(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.b(dynamic);
    }
}
