package com.sports.insider.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import da.s;
import g0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sports/insider/ui/views/ShadowLayoutSimple;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "shadowColor", "", "setShadowColor", "(I)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShadowLayoutSimple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowLayoutSimple.kt\ncom/sports/insider/ui/views/ShadowLayoutSimple\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,239:1\n27#2:240\n83#3,6:241\n*S KotlinDebug\n*F\n+ 1 ShadowLayoutSimple.kt\ncom/sports/insider/ui/views/ShadowLayoutSimple\n*L\n126#1:240\n165#1:241,6\n*E\n"})
/* loaded from: classes.dex */
public final class ShadowLayoutSimple extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f7883a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7884b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7885c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7886d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7887e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f7888f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f7889g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f7890h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7891i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7892k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7893l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f7894m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f7895n;

    /* renamed from: o, reason: collision with root package name */
    public float f7896o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7897p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowLayoutSimple(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint(1);
        this.f7888f = paint;
        Paint paint2 = new Paint(1);
        this.f7889g = paint2;
        this.f7890h = new Path();
        this.f7894m = new RectF();
        this.f7895n = new RectF();
        this.f7897p = true;
        this.f7883a = 704643072;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, s.f8356f);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.f7897p = true;
                this.f7885c = obtainStyledAttributes.getDimension(0, 0.0f);
                float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
                this.f7884b = dimension;
                if (dimension == 0.0f) {
                    this.f7897p = false;
                }
                this.f7886d = obtainStyledAttributes.getDimension(3, 0.0f);
                this.f7887e = obtainStyledAttributes.getDimension(4, 0.0f);
                this.f7883a = obtainStyledAttributes.getColor(1, 704643072);
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        }
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setColor(-1);
        if (this.f7897p) {
            float f6 = this.f7884b;
            if (f6 > 0.0f) {
                int abs = (int) (Math.abs(this.f7886d) + f6);
                int abs2 = (int) (Math.abs(this.f7887e) + this.f7884b);
                this.f7891i = abs;
                this.j = abs2;
                this.f7892k = abs;
                this.f7893l = abs2;
                setPadding(abs, abs2, abs, abs2);
            }
        }
    }

    public final void a(int i5, int i10) {
        float f6 = this.f7891i;
        RectF rectF = this.f7894m;
        rectF.left = f6;
        float f10 = this.j;
        rectF.top = f10;
        rectF.right = i5 - this.f7892k;
        float f11 = i10 - this.f7893l;
        rectF.bottom = f11;
        float f12 = (f11 - f10) / 2.0f;
        float f13 = this.f7885c;
        if (f13 <= f12) {
            f12 = f13;
        }
        this.f7896o = f12;
    }

    public final void b(int i5, int i10) {
        if (!this.f7897p) {
            setBackgroundColor(0);
            return;
        }
        int i11 = this.f7883a;
        if (getAlpha() >= 0.0f && getAlpha() <= 255.0f && Color.alpha(i11) == 255) {
            this.f7883a = c.e(i11, 42);
        }
        int i12 = this.f7883a;
        float f6 = 4;
        float f10 = this.f7886d / f6;
        float f11 = this.f7887e / f6;
        int i13 = i5 / 4;
        if (i13 == 0) {
            i13 = 1;
        }
        int i14 = i10 / 4;
        int i15 = i14 != 0 ? i14 : 1;
        float f12 = this.f7885c / f6;
        float f13 = this.f7884b / f6;
        Bitmap createBitmap = Bitmap.createBitmap(i13, i15, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = this.f7895n;
        rectF.left = f13;
        rectF.top = f13;
        rectF.right = i13 - f13;
        float f14 = i15 - f13;
        rectF.bottom = f14;
        if (f11 > 0.0f) {
            rectF.top = f13 + f11;
            rectF.bottom = f14 - f11;
        } else if (f11 < 0.0f) {
            rectF.top = Math.abs(f11) + f13;
            rectF.bottom -= Math.abs(f11);
        }
        if (f10 > 0.0f) {
            rectF.left += f10;
            rectF.right -= f10;
        } else if (f10 < 0.0f) {
            rectF.left = Math.abs(f10) + rectF.left;
            rectF.right -= Math.abs(f10);
        }
        Paint paint = this.f7888f;
        paint.setColor(0);
        if (!isInEditMode()) {
            paint.setShadowLayer(f13 / 2, f10, f11, i12);
        }
        canvas.drawRoundRect(rectF, f12, f12, paint);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        setBackground(new BitmapDrawable(resources, createBitmap));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getChildAt(0) != null) {
            Path path = this.f7890h;
            path.rewind();
            float f6 = this.f7896o;
            path.addRoundRect(this.f7894m, f6, f6, Path.Direction.CW);
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f6 = this.f7896o;
        canvas.drawRoundRect(this.f7894m, f6, f6, this.f7889g);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildAt(0) == null) {
            this.f7897p = false;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        a(i5, i10);
        b(i5, i10);
    }

    public final void setShadowColor(int shadowColor) {
        this.f7883a = shadowColor;
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        a(getWidth(), getHeight());
        b(getWidth(), getHeight());
    }
}
