package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes3.dex */
public class T extends B {

    /* renamed from: f, reason: collision with root package name */
    public float f38775f;

    /* renamed from: g, reason: collision with root package name */
    public float f38776g;

    /* renamed from: h, reason: collision with root package name */
    public float f38777h;

    /* renamed from: i, reason: collision with root package name */
    public float f38778i;

    /* renamed from: j, reason: collision with root package name */
    public String f38779j;

    /* renamed from: k, reason: collision with root package name */
    public int f38780k;

    public T(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        saveDefinition();
    }

    public void setAlign(String str) {
        this.f38779j = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f38780k = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f38775f = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f38776g = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f38778i = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f38777h = f10;
        invalidate();
    }

    public void z(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        if (this.f38779j != null) {
            float f13 = this.f38775f;
            float f14 = this.mScale;
            float f15 = this.f38776g;
            canvas.concat(q0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f38777h) * f14, (f15 + this.f38778i) * f14), new RectF(0.0f, 0.0f, f11, f12), this.f38779j, this.f38780k));
            super.draw(canvas, paint, f10);
        }
    }
}
