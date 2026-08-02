package y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f68176a;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f68178c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f68179d;

    /* renamed from: e, reason: collision with root package name */
    public float f68180e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f68183h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f68184i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f68185j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f68181f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f68182g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f68186k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f68177b = new Paint(5);

    public d(ColorStateList colorStateList, float f10) {
        this.f68176a = f10;
        e(colorStateList);
        this.f68178c = new RectF();
        this.f68179d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f68183h;
    }

    public float c() {
        return this.f68180e;
    }

    public float d() {
        return this.f68176a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f68177b;
        if (this.f68184i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f68184i);
            z10 = true;
        }
        RectF rectF = this.f68178c;
        float f10 = this.f68176a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f68183h = colorStateList;
        this.f68177b.setColor(colorStateList.getColorForState(getState(), this.f68183h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f68180e && this.f68181f == z10 && this.f68182g == z11) {
            return;
        }
        this.f68180e = f10;
        this.f68181f = z10;
        this.f68182g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f68179d, this.f68176a);
    }

    public void h(float f10) {
        if (f10 == this.f68176a) {
            return;
        }
        this.f68176a = f10;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f68178c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f68179d.set(rect);
        if (this.f68181f) {
            this.f68179d.inset((int) Math.ceil(e.a(this.f68180e, this.f68176a, this.f68182g)), (int) Math.ceil(e.b(this.f68180e, this.f68176a, this.f68182g)));
            this.f68178c.set(this.f68179d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f68185j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f68183h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f68183h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f68177b.getColor();
        if (z10) {
            this.f68177b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f68185j;
        if (colorStateList2 == null || (mode = this.f68186k) == null) {
            return z10;
        }
        this.f68184i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f68177b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f68177b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f68185j = colorStateList;
        this.f68184i = a(colorStateList, this.f68186k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f68186k = mode;
        this.f68184i = a(this.f68185j, mode);
        invalidateSelf();
    }
}
