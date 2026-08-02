package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3538p extends AbstractC3539q {

    /* renamed from: c, reason: collision with root package name */
    public String f38910c;

    /* renamed from: d, reason: collision with root package name */
    public SVGLength f38911d;

    /* renamed from: e, reason: collision with root package name */
    public SVGLength f38912e;

    public C3538p(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC3539q
    public Bitmap o(HashMap hashMap, Bitmap bitmap) {
        Bitmap q10 = AbstractC3539q.q(hashMap, bitmap, this.f38910c);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        SVGLength sVGLength = this.f38911d;
        float relativeOnWidth = sVGLength != null ? (float) relativeOnWidth(sVGLength) : 0.0f;
        SVGLength sVGLength2 = this.f38912e;
        RectF rectF = new RectF(0.0f, 0.0f, relativeOnWidth, sVGLength2 != null ? (float) relativeOnHeight(sVGLength2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        float f10 = rectF.left;
        if (f10 >= 0.0f) {
            f10 = rectF.width();
        }
        float f11 = rectF.top;
        if (f11 >= 0.0f) {
            f11 = rectF.height();
        }
        canvas.drawBitmap(q10, f10, f11, (Paint) null);
        return createBitmap;
    }

    public void w(Dynamic dynamic) {
        this.f38911d = SVGLength.b(dynamic);
        invalidate();
    }

    public void x(Dynamic dynamic) {
        this.f38912e = SVGLength.b(dynamic);
        invalidate();
    }

    public void y(String str) {
        this.f38910c = str;
        invalidate();
    }
}
