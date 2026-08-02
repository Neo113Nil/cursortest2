package com.sports.insider.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import da.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/FrameGradient;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FrameGradient extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f7458a;

    /* renamed from: b, reason: collision with root package name */
    public int f7459b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7460c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7461d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7462e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f7463f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f7464g;

    /* renamed from: h, reason: collision with root package name */
    public final DisplayMetrics f7465h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7466i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f7467k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f7468l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameGradient(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7460c = -1;
        this.f7461d = -65536;
        this.f7462e = -16776961;
        this.f7463f = new Paint(1);
        this.f7464g = new Paint(1);
        this.f7467k = new Path();
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.f7468l = iArr;
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.f7465h = displayMetrics;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f8354d);
            this.f7460c = obtainStyledAttributes.getColor(0, this.f7460c);
            this.f7461d = obtainStyledAttributes.getColor(2, this.f7461d);
            this.f7462e = obtainStyledAttributes.getColor(1, this.f7462e);
            obtainStyledAttributes.recycle();
        }
        iArr[0] = this.f7461d;
        iArr[1] = this.f7462e;
        Paint paint = this.f7463f;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(this.f7460c);
        float f6 = 20;
        DisplayMetrics displayMetrics2 = this.f7465h;
        DisplayMetrics displayMetrics3 = null;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        this.f7466i = f6 * displayMetrics2.density;
        float f10 = 2;
        DisplayMetrics displayMetrics4 = this.f7465h;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics3 = displayMetrics4;
        }
        this.j = f10 * displayMetrics3.density;
        float f11 = this.f7459b / 2.0f;
        new LinearGradient(0.0f, f11, this.f7458a, f11, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint2 = this.f7464g;
        paint2.setStyle(style);
        paint2.setShader(paint2.getShader());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f6 = this.j / 2.0f;
        float f10 = this.f7466i;
        canvas.drawRoundRect(0.0f, f6, this.f7458a, this.f7459b - f6, f10, f10, this.f7463f);
        Path path = this.f7467k;
        path.rewind();
        float f11 = this.j;
        float f12 = f11 / 2.0f;
        float f13 = this.f7466i - f11;
        Path.Direction direction = Path.Direction.CCW;
        path.addRoundRect(f11, f12 + f11, this.f7458a - f11, (this.f7459b - f11) - f12, f13, f13, direction);
        a.c(canvas, path);
        path.rewind();
        float f14 = this.j / 2.0f;
        float f15 = this.f7466i;
        path.addRoundRect(0.0f, f14, this.f7458a, this.f7459b - f14, f15, f15, direction);
        canvas.drawPath(path, this.f7464g);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(getSuggestedMinimumWidth(), size);
        }
        this.f7458a = size;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getSuggestedMinimumHeight(), size2);
        }
        this.f7459b = size2;
        setMeasuredDimension(this.f7458a, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f7459b = i10;
        this.f7458a = i5;
        int i13 = this.f7459b;
        this.f7464g.setShader(new LinearGradient(0.0f, i13 / 2.0f, this.f7458a, i13 / 2.0f, this.f7468l, (float[]) null, Shader.TileMode.CLAMP));
    }
}
