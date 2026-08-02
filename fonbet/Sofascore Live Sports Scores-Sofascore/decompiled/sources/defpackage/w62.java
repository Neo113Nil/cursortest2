package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w62 implements LeadingMarginSpan {
    public final int a;
    public final int b;
    public Path c;

    public w62(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            int i8 = this.a;
            float lineBaseline = layout != null ? layout.getLineBaseline(layout.getLineForOffset(i6)) - (i8 * 2.0f) : (i3 + i5) / 2.0f;
            float f = (i2 * i8) + i;
            if (canvas.isHardwareAccelerated()) {
                if (this.c == null) {
                    Path path = new Path();
                    path.addCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i8, Path.Direction.CW);
                    this.c = path;
                }
                canvas.save();
                canvas.translate(f, lineBaseline);
                Path path2 = this.c;
                path2.getClass();
                canvas.drawPath(path2, paint);
                canvas.restore();
            } else {
                canvas.drawCircle(f, lineBaseline, i8, paint);
            }
            paint.setStyle(style);
            paint.setColor(color);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return (this.a * 2) + this.b;
    }
}
