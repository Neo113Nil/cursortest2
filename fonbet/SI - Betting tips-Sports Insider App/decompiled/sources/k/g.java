package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends Drawable {

    /* renamed from: l, reason: collision with root package name */
    public static final float f18614l = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f18615a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18616b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18617c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18618d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18619e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18620f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f18621g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18622h;

    /* renamed from: i, reason: collision with root package name */
    public float f18623i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18624k;

    public g(Context context) {
        Paint paint = new Paint();
        this.f18615a = paint;
        this.f18621g = new Path();
        this.f18624k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, i.a.f10842n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.j = (float) (Math.cos(f18614l) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z5 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f18620f != z5) {
            this.f18620f = z5;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f18619e) {
            this.f18619e = round;
            invalidateSelf();
        }
        this.f18622h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f18617c = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f18616b = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f18618d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f6, float f10, float f11) {
        return d9.e.w(f10, f6, f11, f6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z5 = false;
        int i5 = this.f18624k;
        if (i5 != 0 && (i5 == 1 || (i5 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z5 = true;
        }
        float f6 = this.f18616b;
        float sqrt = (float) Math.sqrt(f6 * f6 * 2.0f);
        float f10 = this.f18623i;
        float f11 = this.f18617c;
        float a7 = a(f11, sqrt, f10);
        float a10 = a(f11, this.f18618d, this.f18623i);
        float round = Math.round(a(0.0f, this.j, this.f18623i));
        float a11 = a(0.0f, f18614l, this.f18623i);
        float a12 = a(z5 ? 0.0f : -180.0f, z5 ? 180.0f : 0.0f, this.f18623i);
        double d10 = a7;
        double d11 = a11;
        float round2 = Math.round(Math.cos(d11) * d10);
        float round3 = Math.round(Math.sin(d11) * d10);
        Path path = this.f18621g;
        path.rewind();
        float f12 = this.f18619e;
        Paint paint = this.f18615a;
        float a13 = a(f12 + paint.getStrokeWidth(), -this.j, this.f18623i);
        float f13 = (-a10) / 2.0f;
        path.moveTo(f13 + round, 0.0f);
        path.rLineTo(a10 - (round * 2.0f), 0.0f);
        path.moveTo(f13, a13);
        path.rLineTo(round2, round3);
        path.moveTo(f13, -a13);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f18619e + ((((int) (height - (r7 * 2.0f))) / 4) * 2));
        if (this.f18620f) {
            canvas.rotate(a12 * (z5 ? -1 : 1));
        } else if (z5) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f18622h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f18622h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        Paint paint = this.f18615a;
        if (i5 != paint.getAlpha()) {
            paint.setAlpha(i5);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18615a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f6) {
        if (this.f18623i != f6) {
            this.f18623i = f6;
            invalidateSelf();
        }
    }
}
