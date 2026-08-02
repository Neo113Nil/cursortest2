package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rok extends ImageSpan {
    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.getClass();
        charSequence.getClass();
        paint.getClass();
        Drawable drawable = getDrawable();
        canvas.save();
        int i6 = paint.getFontMetricsInt().descent;
        canvas.translate(f, ((i4 + i6) - ((i6 - r2.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        charSequence.getClass();
        Rect bounds = getDrawable().getBounds();
        bounds.getClass();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int i5 = ((i3 - i4) / 2) + i4;
            int i6 = (bounds.bottom - bounds.top) / 2;
            int i7 = i5 - i6;
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            int i8 = i5 + i6;
            fontMetricsInt.bottom = i8;
            fontMetricsInt.descent = i8;
        }
        return bounds.right;
    }
}
