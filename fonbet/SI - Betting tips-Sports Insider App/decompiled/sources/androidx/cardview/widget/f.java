package androidx.cardview.widget;

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

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f1040a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1041b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f1042c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1043d;

    /* renamed from: e, reason: collision with root package name */
    public float f1044e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f1047h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f1048i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1045f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1046g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f1049k = PorterDuff.Mode.SRC_IN;

    public f(float f6, ColorStateList colorStateList) {
        this.f1040a = f6;
        Paint paint = new Paint(5);
        this.f1041b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f1047h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f1047h.getDefaultColor()));
        this.f1042c = new RectF();
        this.f1043d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f6 = rect.left;
        float f10 = rect.top;
        float f11 = rect.right;
        float f12 = rect.bottom;
        RectF rectF = this.f1042c;
        rectF.set(f6, f10, f11, f12);
        Rect rect2 = this.f1043d;
        rect2.set(rect);
        if (this.f1045f) {
            rect2.inset((int) Math.ceil(g.a(this.f1044e, this.f1040a, this.f1046g)), (int) Math.ceil(g.b(this.f1044e, this.f1040a, this.f1046g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z5;
        PorterDuffColorFilter porterDuffColorFilter = this.f1048i;
        Paint paint = this.f1041b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z5 = false;
        } else {
            paint.setColorFilter(this.f1048i);
            z5 = true;
        }
        RectF rectF = this.f1042c;
        float f6 = this.f1040a;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (z5) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f1043d, this.f1040a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f1047h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1047h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f1041b;
        boolean z5 = colorForState != paint.getColor();
        if (z5) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.f1049k) == null) {
            return z5;
        }
        this.f1048i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        this.f1041b.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1041b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f1048i = a(colorStateList, this.f1049k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f1049k = mode;
        this.f1048i = a(this.j, mode);
        invalidateSelf();
    }
}
