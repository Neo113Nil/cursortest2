package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/OopsButton;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOopsButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OopsButton.kt\ncom/sports/insider/ui/views/OopsButton\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,369:1\n1#2:370\n404#3:371\n404#3:372\n404#3:373\n135#4,8:374\n27#4,7:382\n*S KotlinDebug\n*F\n+ 1 OopsButton.kt\ncom/sports/insider/ui/views/OopsButton\n*L\n101#1:371\n102#1:372\n103#1:373\n154#1:374,8\n164#1:382,7\n*E\n"})
/* loaded from: classes.dex */
public final class OopsButton extends View {

    /* renamed from: a, reason: collision with root package name */
    public final String f7730a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f7731b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f7732c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f7733d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7734e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7735f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7736g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7737h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7738i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public float f7739k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f7740l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f7741m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f7742n;

    /* renamed from: o, reason: collision with root package name */
    public StaticLayout f7743o;

    /* renamed from: p, reason: collision with root package name */
    public float f7744p;
    public float q;

    /* renamed from: r, reason: collision with root package name */
    public final DisplayMetrics f7745r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OopsButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7730a = "Oops";
        Paint paint = new Paint(1);
        this.f7731b = paint;
        Paint paint2 = new Paint(1);
        this.f7732c = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f7733d = textPaint;
        this.f7735f = 37.0f;
        this.f7736g = 16.0f;
        this.f7737h = 19.0f;
        this.f7739k = 1.0f;
        this.f7740l = new RectF();
        this.f7741m = new RectF();
        this.f7742n = new RectF();
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.f7745r = displayMetrics;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        float f10 = f6 > 0.0f ? f6 : 1.0f;
        this.f7735f = 37.0f * f10;
        this.f7736g = 16.0f * f10;
        this.f7738i = Color.parseColor("#20003F");
        this.j = Color.parseColor("#C8C8C8");
        Color.parseColor("#8020003F");
        DisplayMetrics displayMetrics3 = this.f7745r;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics3;
        }
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        this.f7737h = Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, 19.0f, displayMetrics2) : displayMetrics2.scaledDensity * 19.0f;
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setColor(this.f7738i);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setTextSize(this.f7737h);
        textPaint.setTextAlign(Paint.Align.CENTER);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setStyle(style);
        paint2.setColor(this.j);
    }

    public final void a() {
        this.f7739k = 1.0f;
        this.f7734e = false;
        this.f7740l.setEmpty();
        this.f7741m.setEmpty();
        this.f7742n.setEmpty();
        this.f7743o = null;
    }

    public final void b(int i5, int i10) {
        if (i5 <= 0 || i10 <= 0) {
            a();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        float f10 = paddingBottom - paddingTop;
        if (f10 <= 0.0f || f6 <= 0.0f) {
            a();
            return;
        }
        this.f7744p = (f6 / 2.0f) + paddingStart;
        this.q = (f10 / 2.0f) + paddingTop;
        float f11 = this.f7736g;
        float f12 = paddingStart + f11;
        float f13 = paddingTop + f11;
        float f14 = (paddingBottom - f11) - f13;
        float f15 = (paddingEnd - f11) - f12;
        RectF rectF = this.f7740l;
        RectF rectF2 = this.f7742n;
        RectF rectF3 = this.f7741m;
        if (f14 <= 0.0f || f15 <= 0.0f) {
            rectF3.setEmpty();
            rectF2.setEmpty();
            this.f7743o = null;
            rectF.left = paddingStart;
            rectF.top = paddingTop;
            rectF.right = paddingEnd;
            rectF.bottom = paddingBottom;
            return;
        }
        StaticLayout c2 = c((int) f15);
        if (c2 == null || c2.getHeight() <= 0 || c2.getWidth() <= 0) {
            rectF3.setEmpty();
            rectF2.setEmpty();
            this.f7743o = null;
            rectF.left = paddingStart;
            rectF.top = paddingTop;
            rectF.right = paddingEnd;
            rectF.bottom = paddingBottom;
            return;
        }
        float width = c2.getWidth();
        float height = c2.getHeight();
        float f16 = f12 + ((f15 - width) / 2.0f);
        float f17 = f13 + ((f14 - height) / 2.0f);
        float f18 = width + f16;
        float f19 = height + f17;
        float width2 = c2.getWidth() / 2.0f;
        rectF3.left = f16 + width2;
        rectF3.top = f17;
        rectF3.right = width2 + f18;
        rectF3.bottom = f19;
        rectF2.left = f16;
        rectF2.top = f17;
        rectF2.right = f18;
        rectF2.bottom = f19;
        this.f7743o = c2;
        rectF.left = paddingStart;
        rectF.top = paddingTop;
        rectF.right = paddingEnd;
        rectF.bottom = paddingBottom;
    }

    public final StaticLayout c(int i5) {
        String str = this.f7730a;
        if (str.length() == 0 || StringsKt.H(str) || i5 <= 5) {
            return null;
        }
        TextPaint textPaint = this.f7733d;
        return StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, Math.min(i5, (int) textPaint.measureText(str))).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i5).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f7740l;
        if (rectF.isEmpty()) {
            return;
        }
        float f6 = this.f7739k;
        canvas.scale(f6, f6, this.f7744p, this.q);
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            float f10 = this.f7735f;
            canvas.drawRoundRect(rectF, f10, f10, this.f7734e ? this.f7732c : this.f7731b);
            canvas.restoreToCount(save);
            RectF rectF2 = this.f7742n;
            StaticLayout staticLayout = this.f7743o;
            if (staticLayout != null) {
                save = canvas.save();
                try {
                    if (!rectF2.isEmpty()) {
                        canvas.clipRect(rectF2);
                    }
                    RectF rectF3 = this.f7741m;
                    canvas.translate(rectF3.left, rectF3.top);
                    staticLayout.draw(canvas);
                    canvas.restoreToCount(save);
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float paddingEnd = (this.f7736g * 2.0f) + getPaddingEnd() + getPaddingStart();
        float f6 = size - paddingEnd;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        int width = (int) ((c((int) f6) != null ? r4.getWidth() : 0) + paddingEnd);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(width, size);
        } else if (mode != 1073741824) {
            size = width;
        }
        float paddingBottom = (this.f7736g * 2.0f) + getPaddingBottom() + getPaddingTop();
        float paddingStart = ((size - getPaddingStart()) - getPaddingEnd()) - (this.f7736g * 2.0f);
        int height = (int) ((c((int) (paddingStart >= 0.0f ? paddingStart : 0.0f)) != null ? r0.getHeight() : 0) + paddingBottom);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(height, size2);
        } else if (mode2 != 1073741824) {
            size2 = height;
        }
        int resolveSize = View.resolveSize(size, i5);
        int resolveSize2 = View.resolveSize(size2, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        b(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        if (i11 == i5 && i12 == i10) {
            invalidate();
        } else {
            b(i5, i10);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        RectF rectF = this.f7740l;
        if (action == 0) {
            if (!rectF.isEmpty()) {
                float f6 = rectF.left;
                float f10 = rectF.right;
                float x10 = event.getX();
                if (f6 <= x10 && x10 <= f10) {
                    float f11 = rectF.top;
                    float f12 = rectF.bottom;
                    float y5 = event.getY();
                    if (f11 <= y5 && y5 <= f12) {
                        this.f7734e = true;
                        this.f7739k = 0.99f;
                        invalidate();
                        return true;
                    }
                }
            }
            return false;
        }
        if (action != 1 && action != 3) {
            return super.onTouchEvent(event);
        }
        this.f7734e = false;
        this.f7739k = 1.0f;
        invalidate();
        if (event.getAction() == 1 && !rectF.isEmpty()) {
            float f13 = rectF.left;
            float f14 = rectF.right;
            float x11 = event.getX();
            if (f13 <= x11 && x11 <= f14) {
                float f15 = rectF.top;
                float f16 = rectF.bottom;
                float y10 = event.getY();
                if (f15 <= y10 && y10 <= f16) {
                    super.performClick();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }
}
