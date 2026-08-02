package org.maplibre.android.annotations;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes10.dex */
final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private RectF f79586a;

    /* renamed from: b, reason: collision with root package name */
    private float f79587b;

    /* renamed from: c, reason: collision with root package name */
    private float f79588c;

    /* renamed from: d, reason: collision with root package name */
    private float f79589d;

    /* renamed from: e, reason: collision with root package name */
    private float f79590e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private Paint f79591f;

    /* renamed from: g, reason: collision with root package name */
    private float f79592g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f79593h;

    /* renamed from: i, reason: collision with root package name */
    private Path f79594i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private Path f79595j;

    b(@NonNull RectF rectF, @NonNull a aVar, float f7, float f11, float f12, float f13, int i11, float f14, int i12) {
        Paint paint = new Paint(1);
        this.f79591f = paint;
        Path path = new Path();
        this.f79595j = path;
        this.f79586a = rectF;
        this.f79587b = f7;
        this.f79588c = f11;
        this.f79589d = f12;
        this.f79590e = f13;
        paint.setColor(i11);
        this.f79592g = f14;
        if (f14 <= 0.0f) {
            c(aVar, path, 0.0f);
            return;
        }
        Paint paint2 = new Paint(1);
        this.f79593h = paint2;
        paint2.setColor(i12);
        Path path2 = new Path();
        this.f79594i = path2;
        c(aVar, path, f14);
        c(aVar, path2, 0.0f);
    }

    private void a(@NonNull RectF rectF, @NonNull Path path, float f7) {
        path.moveTo(rectF.left + f7, rectF.top + f7);
        path.lineTo(rectF.right - f7, rectF.top + f7);
        float f11 = rectF.right - f7;
        float f12 = rectF.bottom;
        float f13 = this.f79588c;
        path.lineTo(f11, (f12 - f13) - f7);
        float f14 = rectF.left;
        float f15 = this.f79587b;
        float f16 = this.f79589d;
        float f17 = f7 / 2.0f;
        path.lineTo(((f14 + f15) + f16) - f17, (rectF.bottom - f13) - f7);
        path.lineTo((f15 / 2.0f) + rectF.left + f16, (rectF.bottom - f7) - f7);
        path.lineTo(rectF.left + f16 + f17, (rectF.bottom - f13) - f7);
        path.lineTo(rectF.left + f16 + f7, (rectF.bottom - f13) - f7);
        path.lineTo(rectF.left + f7, (rectF.bottom - f13) - f7);
        path.lineTo(rectF.left + f7, rectF.top + f7);
        path.close();
    }

    private void b(@NonNull RectF rectF, @NonNull Path path, float f7) {
        float f11 = rectF.left;
        float f12 = this.f79587b;
        path.moveTo(f11 + f12 + f7, rectF.top + f7);
        path.lineTo(rectF.width() - f7, rectF.top + f7);
        path.lineTo(rectF.right - f7, rectF.bottom - f7);
        path.lineTo(rectF.left + f12 + f7, rectF.bottom - f7);
        float f13 = rectF.left + f12 + f7;
        float f14 = this.f79588c;
        float f15 = this.f79589d;
        float f16 = f7 / 2.0f;
        path.lineTo(f13, (f14 + f15) - f16);
        path.lineTo(rectF.left + f7 + f7, (f14 / 2.0f) + f15);
        path.lineTo(rectF.left + f12 + f7, f15 + f16);
        path.lineTo(rectF.left + f12 + f7, rectF.top + f7);
        path.close();
    }

    private void c(@NonNull a aVar, @NonNull Path path, float f7) {
        int a11 = aVar.a();
        float f11 = this.f79589d;
        float f12 = this.f79587b;
        float f13 = this.f79588c;
        float f14 = this.f79590e;
        RectF rectF = this.f79586a;
        if (a11 == 0) {
            if (f14 <= 0.0f) {
                b(rectF, path, f7);
                return;
            }
            if (f7 > 0.0f && f7 > f14) {
                b(rectF, path, f7);
                return;
            }
            path.moveTo(rectF.left + f12 + f14 + f7, rectF.top + f7);
            path.lineTo((rectF.width() - f14) - f7, rectF.top + f7);
            float f15 = rectF.right;
            float f16 = rectF.top;
            path.arcTo(new RectF(f15 - f14, f16 + f7, f15 - f7, f16 + f14), 270.0f, 90.0f);
            path.lineTo(rectF.right - f7, (rectF.bottom - f14) - f7);
            float f17 = rectF.right;
            float f18 = rectF.bottom;
            path.arcTo(new RectF(f17 - f14, f18 - f14, f17 - f7, f18 - f7), 0.0f, 90.0f);
            path.lineTo(rectF.left + f12 + f14 + f7, rectF.bottom - f7);
            float f19 = rectF.left;
            float f21 = rectF.bottom;
            path.arcTo(new RectF(f19 + f12 + f7, f21 - f14, f19 + f14 + f12, f21 - f7), 90.0f, 90.0f);
            float f22 = f7 / 2.0f;
            path.lineTo(rectF.left + f12 + f7, (f13 + f11) - f22);
            path.lineTo(rectF.left + f7 + f7, (f13 / 2.0f) + f11);
            path.lineTo(rectF.left + f12 + f7, f11 + f22);
            path.lineTo(rectF.left + f12 + f7, rectF.top + f14 + f7);
            float f23 = rectF.left;
            float f24 = rectF.top;
            path.arcTo(new RectF(f23 + f12 + f7, f7 + f24, f23 + f14 + f12, f14 + f24), 180.0f, 90.0f);
            path.close();
            return;
        }
        if (a11 == 1) {
            if (f14 <= 0.0f) {
                d(rectF, path, f7);
                return;
            }
            if (f7 > 0.0f && f7 > f14) {
                d(rectF, path, f7);
                return;
            }
            path.moveTo(rectF.left + f14 + f7, rectF.top + f7);
            path.lineTo(((rectF.width() - f14) - f12) - f7, rectF.top + f7);
            float f25 = rectF.right;
            float f26 = rectF.top;
            path.arcTo(new RectF((f25 - f14) - f12, f26 + f7, (f25 - f12) - f7, f26 + f14), 270.0f, 90.0f);
            float f27 = f7 / 2.0f;
            path.lineTo((rectF.right - f12) - f7, f11 + f27);
            path.lineTo((rectF.right - f7) - f7, (f13 / 2.0f) + f11);
            path.lineTo((rectF.right - f12) - f7, (f11 + f13) - f27);
            path.lineTo((rectF.right - f12) - f7, (rectF.bottom - f14) - f7);
            float f28 = rectF.right;
            float f29 = rectF.bottom;
            path.arcTo(new RectF((f28 - f14) - f12, f29 - f14, (f28 - f12) - f7, f29 - f7), 0.0f, 90.0f);
            path.lineTo(rectF.left + f12 + f7, rectF.bottom - f7);
            float f31 = rectF.left;
            float f32 = rectF.bottom;
            path.arcTo(new RectF(f31 + f7, f32 - f14, f31 + f14, f32 - f7), 90.0f, 90.0f);
            float f33 = rectF.left;
            float f34 = rectF.top;
            path.arcTo(new RectF(f33 + f7, f7 + f34, f33 + f14, f14 + f34), 180.0f, 90.0f);
            path.close();
            return;
        }
        if (a11 == 2) {
            if (f14 <= 0.0f) {
                e(rectF, path, f7);
                return;
            }
            if (f7 > 0.0f && f7 > f14) {
                e(rectF, path, f7);
                return;
            }
            path.moveTo(Math.min(f11, f14) + rectF.left + f7, rectF.top + f13 + f7);
            float f35 = f7 / 2.0f;
            path.lineTo(rectF.left + f11 + f35, rectF.top + f13 + f7);
            path.lineTo((f12 / 2.0f) + rectF.left + f11, rectF.top + f7 + f7);
            path.lineTo(((rectF.left + f12) + f11) - f35, rectF.top + f13 + f7);
            path.lineTo((rectF.right - f14) - f7, rectF.top + f13 + f7);
            float f36 = rectF.right;
            float f37 = rectF.top;
            path.arcTo(new RectF(f36 - f14, f37 + f13 + f7, f36 - f7, f37 + f14 + f13), 270.0f, 90.0f);
            path.lineTo(rectF.right - f7, (rectF.bottom - f14) - f7);
            float f38 = rectF.right;
            float f39 = rectF.bottom;
            path.arcTo(new RectF(f38 - f14, f39 - f14, f38 - f7, f39 - f7), 0.0f, 90.0f);
            path.lineTo(rectF.left + f14 + f7, rectF.bottom - f7);
            float f41 = rectF.left;
            float f42 = rectF.bottom;
            path.arcTo(new RectF(f41 + f7, f42 - f14, f41 + f14, f42 - f7), 90.0f, 90.0f);
            path.lineTo(rectF.left + f7, rectF.top + f13 + f14 + f7);
            float f43 = rectF.left;
            float f44 = rectF.top;
            path.arcTo(new RectF(f43 + f7, f44 + f13 + f7, f43 + f14, f14 + f44 + f13), 180.0f, 90.0f);
            path.close();
            return;
        }
        if (a11 != 3) {
            return;
        }
        if (f14 <= 0.0f) {
            a(rectF, path, f7);
            return;
        }
        if (f7 > 0.0f && f7 > f14) {
            a(rectF, path, f7);
            return;
        }
        path.moveTo(rectF.left + f14 + f7, rectF.top + f7);
        path.lineTo((rectF.width() - f14) - f7, rectF.top + f7);
        float f45 = rectF.right;
        float f46 = rectF.top;
        path.arcTo(new RectF(f45 - f14, f46 + f7, f45 - f7, f46 + f14), 270.0f, 90.0f);
        path.lineTo(rectF.right - f7, ((rectF.bottom - f13) - f14) - f7);
        float f47 = rectF.right;
        float f48 = rectF.bottom;
        path.arcTo(new RectF(f47 - f14, (f48 - f14) - f13, f47 - f7, (f48 - f13) - f7), 0.0f, 90.0f);
        float f49 = f7 / 2.0f;
        path.lineTo(((rectF.left + f12) + f11) - f49, (rectF.bottom - f13) - f7);
        path.lineTo((f12 / 2.0f) + rectF.left + f11, (rectF.bottom - f7) - f7);
        path.lineTo(rectF.left + f11 + f49, (rectF.bottom - f13) - f7);
        path.lineTo(Math.min(f14, f11) + rectF.left + f7, (rectF.bottom - f13) - f7);
        float f51 = rectF.left;
        float f52 = rectF.bottom;
        path.arcTo(new RectF(f51 + f7, (f52 - f14) - f13, f51 + f14, (f52 - f13) - f7), 90.0f, 90.0f);
        path.lineTo(rectF.left + f7, rectF.top + f14 + f7);
        float f53 = rectF.left;
        float f54 = rectF.top;
        path.arcTo(new RectF(f53 + f7, f7 + f54, f53 + f14, f14 + f54), 180.0f, 90.0f);
        path.close();
    }

    private void d(@NonNull RectF rectF, @NonNull Path path, float f7) {
        path.moveTo(rectF.left + f7, rectF.top + f7);
        float width = rectF.width();
        float f11 = this.f79587b;
        path.lineTo((width - f11) - f7, rectF.top + f7);
        float f12 = (rectF.right - f11) - f7;
        float f13 = f7 / 2.0f;
        float f14 = this.f79589d;
        path.lineTo(f12, f14 + f13);
        float f15 = (rectF.right - f7) - f7;
        float f16 = this.f79588c;
        path.lineTo(f15, (f16 / 2.0f) + f14);
        path.lineTo((rectF.right - f11) - f7, (f14 + f16) - f13);
        path.lineTo((rectF.right - f11) - f7, rectF.bottom - f7);
        path.lineTo(rectF.left + f7, rectF.bottom - f7);
        path.lineTo(rectF.left + f7, rectF.top + f7);
        path.close();
    }

    private void e(@NonNull RectF rectF, @NonNull Path path, float f7) {
        float f11 = rectF.left;
        float f12 = this.f79589d;
        float f13 = rectF.top;
        float f14 = this.f79588c;
        path.moveTo(f11 + f12 + f7, f13 + f14 + f7);
        float f15 = f7 / 2.0f;
        path.lineTo(rectF.left + f12 + f15, rectF.top + f14 + f7);
        float f16 = rectF.left;
        float f17 = this.f79587b;
        path.lineTo((f17 / 2.0f) + f16 + f12, rectF.top + f7 + f7);
        path.lineTo(((rectF.left + f17) + f12) - f15, rectF.top + f14 + f7);
        path.lineTo(rectF.right - f7, rectF.top + f14 + f7);
        path.lineTo(rectF.right - f7, rectF.bottom - f7);
        path.lineTo(rectF.left + f7, rectF.bottom - f7);
        path.lineTo(rectF.left + f7, rectF.top + f14 + f7);
        path.lineTo(rectF.left + f12 + f7, rectF.top + f14 + f7);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.f79592g > 0.0f) {
            canvas.drawPath(this.f79594i, this.f79593h);
        }
        canvas.drawPath(this.f79595j, this.f79591f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f79586a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f79586a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f79591f.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f79591f.setColorFilter(colorFilter);
    }
}
