package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3545w extends AbstractC3527e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f38952a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC3544v f38953b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC3544v f38954c;

    /* renamed from: d, reason: collision with root package name */
    public final FilterRegion f38955d;

    public C3545w(ReactContext reactContext) {
        super(reactContext);
        this.f38952a = new HashMap();
        this.f38955d = new FilterRegion();
    }

    public Bitmap o(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        this.f38952a.clear();
        this.f38952a.put("SourceGraphic", bitmap);
        this.f38952a.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmap));
        this.f38952a.put("BackgroundImage", bitmap2);
        this.f38952a.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(bitmap2));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Rect cropRect = this.f38955d.getCropRect(this, this.f38953b, rectF);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof AbstractC3539q) {
                AbstractC3539q abstractC3539q = (AbstractC3539q) childAt;
                createBitmap.eraseColor(0);
                FilterRegion filterRegion = abstractC3539q.f38919b;
                EnumC3544v enumC3544v = this.f38954c;
                Rect cropRect2 = filterRegion.getCropRect(abstractC3539q, enumC3544v, enumC3544v == EnumC3544v.USER_SPACE_ON_USE ? new RectF(cropRect) : rectF);
                canvas.drawBitmap(abstractC3539q.o(this.f38952a, bitmap), cropRect2, cropRect2, (Paint) null);
                bitmap = createBitmap.copy(Bitmap.Config.ARGB_8888, true);
                String p10 = abstractC3539q.p();
                if (p10 != null) {
                    this.f38952a.put(p10, bitmap);
                }
            } else {
                Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
            }
        }
        createBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, cropRect, cropRect, (Paint) null);
        return createBitmap;
    }

    public void p(String str) {
        this.f38953b = EnumC3544v.b(str);
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f38955d.setHeight(dynamic);
        invalidate();
    }

    public void r(String str) {
        this.f38954c = EnumC3544v.b(str);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f38955d.setWidth(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }

    public void t(Dynamic dynamic) {
        this.f38955d.setX(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f38955d.setY(dynamic);
        invalidate();
    }
}
