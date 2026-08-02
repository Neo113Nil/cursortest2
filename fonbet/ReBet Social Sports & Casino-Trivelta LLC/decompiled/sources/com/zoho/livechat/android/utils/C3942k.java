package com.zoho.livechat.android.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* renamed from: com.zoho.livechat.android.utils.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3942k implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f44554a;

    /* renamed from: b, reason: collision with root package name */
    public final float f44555b;

    /* renamed from: c, reason: collision with root package name */
    public final float f44556c;

    public C3942k(int i10, float f10, float f11) {
        this.f44554a = i10;
        this.f44555b = f10;
        this.f44556c = f11;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f44554a);
        float f10 = i10;
        canvas.drawRect(f10, i12, f10 + (i11 * this.f44555b), i14, paint);
        paint.setStyle(style);
        paint.setColor(color);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return (int) (this.f44555b + this.f44556c);
    }
}
