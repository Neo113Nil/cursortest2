package com.sports.insider.ui.views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/FloatingActionButton;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\ncom/sports/insider/ui/views/FloatingActionButton\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,347:1\n1#2:348\n404#3:349\n404#3:350\n27#4,7:351\n135#4,8:358\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\ncom/sports/insider/ui/views/FloatingActionButton\n*L\n108#1:349\n109#1:350\n197#1:351,7\n202#1:358,8\n*E\n"})
/* loaded from: classes.dex */
public final class FloatingActionButton extends View {

    /* renamed from: a, reason: collision with root package name */
    public final float f7438a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7439b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7440c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7441d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f7442e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f7443f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7444g;

    /* renamed from: h, reason: collision with root package name */
    public RippleDrawable f7445h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7446i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f7447k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f7448l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f7449m;

    /* renamed from: n, reason: collision with root package name */
    public float f7450n;

    /* renamed from: o, reason: collision with root package name */
    public float f7451o;

    /* renamed from: p, reason: collision with root package name */
    public final float f7452p;
    public final float q;

    /* renamed from: r, reason: collision with root package name */
    public final float f7453r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f7454s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f7455t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f7456u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f7457v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7438a = 20.0f;
        this.f7439b = 40.0f;
        this.f7440c = 11.0f;
        this.f7441d = 1.0f;
        this.f7442e = new Paint(1);
        this.f7443f = new Paint(1);
        this.f7444g = 1.0f;
        this.f7447k = new Path();
        this.f7448l = new RectF();
        this.f7449m = new RectF();
        this.f7452p = 1.0f;
        this.q = 1.0f;
        this.f7453r = 1.0f;
        this.f7454s = new int[]{-1};
        this.f7455t = new int[0];
        this.f7456u = new int[]{R.attr.state_enabled};
        int[] iArr = new int[2];
        int i5 = 0;
        while (i5 < 2) {
            iArr[i5] = i5 == 0 ? R.attr.state_pressed : 16842910;
            i5++;
        }
        this.f7457v = iArr;
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        f6 = f6 <= 0.0f ? this.f7441d : f6;
        this.f7444g = f6;
        this.f7452p = this.f7452p * f6;
        float sqrt = (float) Math.sqrt((r1 * r1) / 2.0f);
        this.q = sqrt;
        this.f7453r = sqrt * 2;
        float f10 = this.f7439b;
        float f11 = this.f7444g;
        float f12 = f10 * f11;
        this.f7439b = f12;
        this.f7440c *= f11;
        this.f7438a = f12 / 2.0f;
        this.f7446i = Color.parseColor("#2A377C");
        int parseColor = Color.parseColor("#18012E");
        this.j = parseColor;
        this.f7454s[0] = parseColor;
        setElevation(this.f7444g * 10.0f);
        setOutlineProvider(new r(this));
        Paint paint = this.f7442e;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f7446i);
        Paint paint2 = this.f7443f;
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setColor(-1);
        paint2.setStrokeWidth(this.f7452p);
        c();
    }

    public final void a() {
        this.f7448l.setEmpty();
        setPressed(false);
        RippleDrawable rippleDrawable = this.f7445h;
        if (rippleDrawable != null) {
            rippleDrawable.setState(this.f7455t);
        }
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
        float f11 = this.f7440c;
        float f12 = f11 / 2.0f;
        float f13 = this.q;
        float f14 = f12 + f13;
        float f15 = ((f6 - f11) / 2.0f) + paddingStart;
        float f16 = ((f10 - f14) / 2.0f) + paddingTop;
        float f17 = f15 + f11;
        float f18 = f16 + f14;
        float f19 = f15 - f13;
        float f20 = f16 - f13;
        float f21 = f17 + f13;
        float f22 = f18 + f13;
        Path path = this.f7447k;
        path.rewind();
        path.moveTo(0.0f, f12);
        path.lineTo(f11 / 2.0f, 0.0f);
        path.lineTo(f11, f12);
        path.lineTo(f11 - this.q, f14);
        path.lineTo(this.f7440c / 2.0f, this.f7453r + 0.0f);
        float f23 = this.f7440c / 2.0f;
        float f24 = this.q;
        path.lineTo(f24, f23 + f24);
        path.close();
        this.f7449m.set(f19, f20, f21, f22);
        RectF rectF = this.f7448l;
        rectF.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        this.f7450n = rectF.centerX();
        this.f7451o = rectF.centerY();
        if (!rectF.isEmpty()) {
            int i11 = (int) rectF.left;
            int i12 = (int) rectF.top;
            int i13 = (int) rectF.right;
            int i14 = (int) rectF.bottom;
            RippleDrawable rippleDrawable = this.f7445h;
            if (rippleDrawable != null) {
                rippleDrawable.setBounds(i11, i12, i13, i14);
                rippleDrawable.setHotspotBounds(i11, i12, i13, i14);
            }
        }
        invalidate();
    }

    public final void c() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f7454s[0]);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(this.j);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setShape(new OvalShape());
        this.f7445h = new RippleDrawable(valueOf, null, shapeDrawable);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() > 0 && getHeight() > 0) {
            b(getWidth(), getHeight());
        }
        if (this.f7445h == null) {
            c();
        }
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
        if (this.f7448l.isEmpty()) {
            return;
        }
        int save = canvas.save();
        try {
            canvas.drawCircle(this.f7450n, this.f7451o, this.f7438a, this.f7442e);
            canvas.restoreToCount(save);
            RippleDrawable rippleDrawable = this.f7445h;
            if (rippleDrawable != null) {
                rippleDrawable.draw(canvas);
            }
            RectF rectF = this.f7449m;
            if (rectF.isEmpty()) {
                return;
            }
            save = canvas.save();
            canvas.clipRect(rectF);
            try {
                float f6 = rectF.left;
                float f10 = this.q;
                canvas.translate(f6 + f10, rectF.top + f10);
                canvas.drawPath(this.f7447k, this.f7443f);
            } finally {
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
        int i11 = (int) this.f7439b;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(i11, size);
        } else if (mode != 1073741824) {
            size = i11;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(i11, size2);
        } else if (mode2 != 1073741824) {
            size2 = i11;
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        int resolveSize = View.resolveSize(valueOf.intValue(), i5);
        int resolveSize2 = View.resolveSize(valueOf2.intValue(), i10);
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
        RectF rectF = this.f7448l;
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
                        setPressed(true);
                        RippleDrawable rippleDrawable = this.f7445h;
                        if (rippleDrawable != null) {
                            rippleDrawable.setHotspot(event.getX(), event.getY());
                        }
                        RippleDrawable rippleDrawable2 = this.f7445h;
                        if (rippleDrawable2 != null) {
                            rippleDrawable2.setState(this.f7457v);
                        }
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
        setPressed(false);
        RippleDrawable rippleDrawable3 = this.f7445h;
        if (rippleDrawable3 != null) {
            rippleDrawable3.setState(this.f7456u);
        }
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
