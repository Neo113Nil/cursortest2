package com.zoho.livechat.android.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: com.zoho.livechat.android.utils.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3940i implements LeadingMarginSpan {

    /* renamed from: e, reason: collision with root package name */
    public static Path f44545e;

    /* renamed from: a, reason: collision with root package name */
    public final int f44546a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f44547b = true;

    /* renamed from: c, reason: collision with root package name */
    public final int f44548c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44549d;

    public C3940i(int i10, int i11, int i12) {
        this.f44546a = i10;
        this.f44548c = i12;
        this.f44549d = i11;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        if (((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint.Style style = paint.getStyle();
            if (this.f44547b) {
                i17 = paint.getColor();
                paint.setColor(this.f44548c);
            } else {
                i17 = 0;
            }
            paint.setStyle(Paint.Style.FILL);
            if (canvas.isHardwareAccelerated()) {
                if (f44545e == null) {
                    Path path = new Path();
                    f44545e = path;
                    path.addCircle(0.0f, 0.0f, this.f44549d + 1.2f, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate(i10 + i11 + this.f44549d, (i12 + i14) / 2.0f);
                canvas.drawPath(f44545e, paint);
                canvas.restore();
            } else {
                int i18 = i10 + i11;
                canvas.drawCircle(i18 + r5, (i12 + i14) / 2.0f, this.f44549d, paint);
            }
            if (this.f44547b) {
                paint.setColor(i17);
            }
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return (this.f44549d * 2) + this.f44546a;
    }
}
