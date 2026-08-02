package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c9j extends Drawable {
    public final Context a;
    public final String b;
    public final Paint c;

    public c9j(Context context, String str) {
        Typeface typeface;
        context.getClass();
        this.a = context;
        this.b = str;
        Paint paint = new Paint(1);
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold_condensed, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        paint.setTypeface(typeface);
        paint.setColor(context.getColor(R.color.n_lv_1));
        paint.setTextSize(ao2.H(14, context));
        paint.setTextAlign(Paint.Align.CENTER);
        this.c = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        Paint paint = this.c;
        canvas.drawText(this.b, centerX, centerY - ((paint.ascent() + paint.descent()) / 2.0f), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ao2.s(16, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ao2.s(8, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}
