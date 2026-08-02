package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import eg.c0;
import eg.m0;
import jg.d;
import jg.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lg.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/sports/insider/ui/views/ResponsibleGamingBtn;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setArimoBoldTypeface", "(Landroid/graphics/Typeface;)V", "setArimoRegularTypeface", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResponsibleGamingBtn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponsibleGamingBtn.kt\ncom/sports/insider/ui/views/ResponsibleGamingBtn\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,403:1\n1#2:404\n404#3:405\n44#4,8:406\n44#4,8:414\n27#4,7:422\n*S KotlinDebug\n*F\n+ 1 ResponsibleGamingBtn.kt\ncom/sports/insider/ui/views/ResponsibleGamingBtn\n*L\n293#1:405\n295#1:406,8\n300#1:414,8\n306#1:422,7\n*E\n"})
/* loaded from: classes.dex */
public final class ResponsibleGamingBtn extends View {
    public final float A;
    public final float B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public final float f7859a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7860b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7861c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7862d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7863e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7864f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7865g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7866h;

    /* renamed from: i, reason: collision with root package name */
    public String f7867i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7868k;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f7869l;

    /* renamed from: m, reason: collision with root package name */
    public Typeface f7870m;

    /* renamed from: n, reason: collision with root package name */
    public final d f7871n;

    /* renamed from: o, reason: collision with root package name */
    public final float f7872o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f7873p;
    public final Paint q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f7874r;

    /* renamed from: s, reason: collision with root package name */
    public final TextPaint f7875s;

    /* renamed from: t, reason: collision with root package name */
    public final TextPaint f7876t;

    /* renamed from: u, reason: collision with root package name */
    public StaticLayout f7877u;

    /* renamed from: v, reason: collision with root package name */
    public StaticLayout f7878v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f7879w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f7880x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f7881y;

    /* renamed from: z, reason: collision with root package name */
    public final Path f7882z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponsibleGamingBtn(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7859a = 250.0f;
        this.f7860b = 50.0f;
        this.f7861c = 16.0f;
        this.f7862d = 25.3f;
        this.f7863e = 16.0f;
        this.f7864f = 3.8f;
        this.f7865g = 5.0f;
        this.f7866h = 3.0f;
        this.f7867i = String.valueOf((char) 8594);
        this.j = "Responsible gaming";
        this.f7868k = 1.9f;
        e eVar = m0.f9201a;
        this.f7871n = c0.b(q.f18523a);
        this.f7872o = 14.0f;
        Paint paint = new Paint(1);
        this.f7873p = paint;
        Paint paint2 = new Paint(1);
        this.q = paint2;
        Paint paint3 = new Paint(1);
        this.f7874r = paint3;
        TextPaint textPaint = new TextPaint(1);
        this.f7875s = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f7876t = textPaint2;
        this.f7879w = new RectF();
        this.f7880x = new RectF();
        this.f7881y = new RectF();
        this.f7882z = new Path();
        this.A = 24.0f;
        this.B = 56.0f;
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        f6 = f6 <= 0.0f ? 1.0f : f6;
        this.A *= f6;
        this.B *= f6;
        this.f7872o *= f6;
        this.f7859a *= f6;
        this.f7860b *= f6;
        this.f7861c *= f6;
        this.f7865g *= f6;
        this.f7866h *= f6;
        this.f7862d *= f6;
        this.f7864f *= f6;
        this.f7863e *= f6;
        this.f7868k *= f6;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(this.f7868k);
        paint.setAlpha(63);
        paint2.setStyle(style);
        paint2.setColor(-1);
        paint2.setStrokeWidth(this.f7868k);
        paint2.setAlpha(127);
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(this.f7868k);
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setTextSize(this.f7872o);
        textPaint2.setColor(-1);
        textPaint2.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint2.setTextSize(this.f7872o);
    }

    public static StaticLayout f(TextPaint textPaint, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence)) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) textPaint.measureText(charSequence.toString())).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoBoldTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7870m, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f7870m = typeface;
            this.f7876t.setTypeface(typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoRegularTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7869l, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.f7869l = typeface;
            this.f7875s.setTypeface(typeface);
        }
    }

    public final void c() {
        this.f7879w.setEmpty();
        this.f7880x.setEmpty();
        this.f7881y.setEmpty();
        this.f7882z.rewind();
    }

    public final boolean d(float f6, float f10) {
        RectF rectF = this.f7879w;
        float f11 = rectF.left;
        if (f6 > rectF.right || f11 > f6) {
            return false;
        }
        return f10 <= rectF.bottom && rectF.top <= f10;
    }

    public final void e(int i5, int i10) {
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (i5 <= 0 || i10 <= 0) {
            c();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f15 = paddingEnd - paddingStart;
        float f16 = paddingBottom - paddingTop;
        float f17 = (f16 / 2.0f) + paddingTop;
        if (f16 <= 0.0f || f15 <= 0.0f) {
            c();
            return;
        }
        float f18 = this.f7861c + paddingStart;
        StaticLayout staticLayout = this.f7877u;
        if (staticLayout != null) {
            f6 = staticLayout.getWidth() + f18;
            float height = staticLayout.getHeight();
            f11 = f16 > height ? ((f16 - height) / 2.0f) + paddingTop : paddingTop;
            f10 = height + f11;
        } else {
            f6 = f18;
            f10 = paddingTop;
            f11 = f10;
        }
        this.f7880x.set(f18, f11, f6, f10);
        float f19 = f6 + this.f7865g;
        StaticLayout staticLayout2 = this.f7878v;
        if (staticLayout2 != null) {
            f14 = staticLayout2.getWidth() + f19;
            float height2 = staticLayout2.getHeight();
            f13 = f16 > height2 ? (((f16 - height2) / 2.0f) - this.f7866h) + paddingTop : paddingTop;
            f12 = height2 + f13;
        } else {
            f12 = paddingTop;
            f13 = f12;
            f14 = f19;
        }
        this.f7881y.set(f19, f13, f14, f12);
        float sqrt = (this.f7864f * 2.0f) / ((float) Math.sqrt(2.0f));
        float f20 = (paddingEnd - this.f7862d) - sqrt;
        Path path = this.f7882z;
        path.rewind();
        path.moveTo(f20, f17 - sqrt);
        path.lineTo(f20 + sqrt, f17);
        path.lineTo(f20, sqrt + f17);
        this.f7879w.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        e(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        if (this.C) {
            c0.h(this.f7871n.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#20003F"));
        RectF rectF = this.f7880x;
        if (!rectF.isEmpty()) {
            float f6 = rectF.left;
            float f10 = rectF.top;
            save = canvas.save();
            canvas.translate(f6, f10);
            try {
                StaticLayout staticLayout = this.f7877u;
                if (staticLayout != null) {
                    staticLayout.draw(canvas);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        RectF rectF2 = this.f7881y;
        if (!rectF2.isEmpty()) {
            float f11 = rectF2.left;
            float f12 = rectF2.top;
            save = canvas.save();
            canvas.translate(f11, f12);
            try {
                StaticLayout staticLayout2 = this.f7878v;
                if (staticLayout2 != null) {
                    staticLayout2.draw(canvas);
                }
            } finally {
            }
        }
        Path path = this.f7882z;
        if (path.isEmpty()) {
            return;
        }
        save = canvas.save();
        try {
            canvas.drawPath(path, this.f7874r);
            canvas.translate(-this.f7863e, 0.0f);
            canvas.drawPath(path, this.q);
            canvas.translate(-this.f7863e, 0.0f);
            canvas.drawPath(path, this.f7873p);
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        this.f7877u = f(this.f7875s, this.j);
        this.f7878v = f(this.f7876t, this.f7867i);
        float width = paddingEnd + this.f7861c + (this.f7877u != null ? r3.getWidth() : 0) + this.f7865g + (this.f7878v != null ? r3.getWidth() : 0) + this.f7865g + this.B + this.f7862d;
        float f6 = this.f7859a;
        if (width < f6) {
            width = f6;
        }
        int i11 = (int) width;
        float f10 = paddingBottom;
        StaticLayout staticLayout = this.f7877u;
        int height = staticLayout != null ? staticLayout.getHeight() : 0;
        float max = Math.max(Math.max(height, this.f7878v != null ? r6.getHeight() : 0), this.A) + f10;
        float f11 = this.f7860b;
        if (max < f11) {
            max = f11;
        }
        int i12 = (int) max;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(i11, size);
        } else if (mode != 1073741824) {
            size = i11;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(i12, size2);
        } else if (mode2 != 1073741824) {
            size2 = i12;
        }
        setMeasuredDimension(size, size2);
        e(size, size2);
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
            e(i5, i10);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        RectF rectF = this.f7879w;
        if (action == 0) {
            if (rectF.isEmpty()) {
                return false;
            }
            return d(event.getX(), event.getY());
        }
        if (action != 1 && action != 3) {
            return super.onTouchEvent(event);
        }
        if (event.getAction() != 1 || rectF.isEmpty() || !d(event.getX(), event.getY())) {
            return false;
        }
        super.performClick();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }
}
