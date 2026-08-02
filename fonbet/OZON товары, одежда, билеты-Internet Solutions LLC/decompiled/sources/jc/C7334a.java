package jc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* renamed from: jc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C7334a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f69656a;

    C7334a() {
        Paint paint = new Paint(1);
        this.f69656a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    final void a(int i11, int i12) {
        Paint paint = this.f69656a;
        paint.setStrokeWidth(i11);
        paint.setColor(i12);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Paint paint = this.f69656a;
        if (paint.getStrokeWidth() > 0.0f) {
            canvas.drawRect(getBounds(), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
