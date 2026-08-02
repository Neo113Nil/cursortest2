package jd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public class d extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f53961b;

    /* renamed from: d, reason: collision with root package name */
    public int f53963d;

    /* renamed from: e, reason: collision with root package name */
    public int f53964e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f53960a = new Paint(2);

    /* renamed from: c, reason: collision with root package name */
    public int f53962c = 255;

    public d(Bitmap bitmap) {
        b(bitmap);
    }

    public Bitmap a() {
        return this.f53961b;
    }

    public void b(Bitmap bitmap) {
        this.f53961b = bitmap;
        if (bitmap != null) {
            this.f53963d = bitmap.getWidth();
            this.f53964e = this.f53961b.getHeight();
        } else {
            this.f53964e = 0;
            this.f53963d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f53961b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f53961b, (Rect) null, getBounds(), this.f53960a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f53962c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f53964e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f53963d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f53964e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f53963d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f53962c = i10;
        this.f53960a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f53960a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f53960a.setFilterBitmap(z10);
    }
}
