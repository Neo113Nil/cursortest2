package com.sports.insider.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import da.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/DiagramSection;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDiagramSection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagramSection.kt\ncom/sports/insider/ui/views/DiagramSection\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,342:1\n404#2:343\n404#2:344\n404#2:345\n*S KotlinDebug\n*F\n+ 1 DiagramSection.kt\ncom/sports/insider/ui/views/DiagramSection\n*L\n77#1:343\n78#1:344\n79#1:345\n*E\n"})
/* loaded from: classes.dex */
public final class DiagramSection extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f7335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7337c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7338d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7339e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7340f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f7341g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f7342h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f7343i;
    public final Path j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f7344k;

    /* renamed from: l, reason: collision with root package name */
    public final Path f7345l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f7346m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f7347n;

    /* renamed from: o, reason: collision with root package name */
    public float f7348o;

    /* renamed from: p, reason: collision with root package name */
    public float f7349p;
    public float q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagramSection(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7338d = 35.0f;
        this.f7339e = 1.0f;
        this.f7340f = 4.0f;
        Paint paint = new Paint(1);
        this.f7341g = paint;
        Paint paint2 = new Paint(1);
        this.f7342h = paint2;
        Paint paint3 = new Paint(1);
        this.f7343i = paint3;
        this.j = new Path();
        this.f7344k = new Path();
        this.f7345l = new Path();
        RectF rectF = new RectF();
        this.f7346m = rectF;
        RectF rectF2 = new RectF();
        this.f7347n = rectF2;
        float f6 = getResources().getDisplayMetrics().density;
        this.f7339e = f6;
        float f10 = 35;
        this.f7338d = f6 * f10;
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, s.f8351a, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.f7338d = obtainStyledAttributes.getDimension(0, f10 * this.f7339e);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f7335a = Color.parseColor("#9c1616");
        this.f7336b = Color.parseColor("#169c16");
        this.f7337c = Color.parseColor("#9db7cb");
        this.f7340f *= this.f7339e;
        paint.setDither(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.f7340f);
        paint.setColor(this.f7336b);
        paint2.setDither(true);
        paint2.setStyle(style);
        paint2.setStrokeJoin(join);
        paint2.setStrokeCap(cap);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(this.f7340f);
        paint2.setColor(this.f7335a);
        paint3.setDither(true);
        paint3.setStyle(style);
        paint3.setStrokeJoin(join);
        paint3.setStrokeCap(cap);
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(this.f7340f);
        paint3.setColor(this.f7337c);
        float f11 = 2;
        float f12 = this.f7338d * f11;
        rectF.set(0.0f, 0.0f, f12, f12);
        float f13 = this.f7340f;
        float f14 = (this.f7338d * f11) - f13;
        rectF2.set(f13, f13, f14, f14);
        if (isInEditMode()) {
            a(4, 5, 6);
        }
    }

    public final void a(int i5, int i10, int i11) {
        int i12 = (i5 < 0 ? 0 : i5) + (i10 < 0 ? 0 : i10) + (i11 < 0 ? 0 : i11);
        if (i12 == 0) {
            this.f7348o = 0.0f;
            this.f7349p = 0.0f;
            this.q = 0.0f;
            invalidate();
            return;
        }
        float f6 = (i12 <= 1 ? 359.999f : 360.0f) / i12;
        float f10 = i5 * f6;
        if (f10 == 360.0f) {
            f10 = 359.999f;
        }
        this.f7348o = f10;
        float f11 = i10 * f6;
        if (f11 == 360.0f) {
            f11 = 359.999f;
        }
        this.f7349p = f11;
        float f12 = f6 * i11;
        this.q = f12 != 360.0f ? f12 : 359.999f;
        RectF rectF = this.f7346m;
        boolean isEmpty = rectF.isEmpty();
        Path path = this.f7345l;
        Path path2 = this.f7344k;
        Path path3 = this.j;
        if (!isEmpty) {
            RectF rectF2 = this.f7347n;
            if (!rectF2.isEmpty()) {
                path3.rewind();
                path3.arcTo(rectF, 0.0f, this.f7348o, false);
                float f13 = this.f7348o;
                path3.arcTo(rectF2, 0.0f + f13, -f13, false);
                path3.close();
                path2.rewind();
                path2.arcTo(rectF, this.f7348o, this.f7349p, false);
                float f14 = this.f7348o;
                float f15 = this.f7349p;
                path2.arcTo(rectF2, f14 + f15, -f15, false);
                path2.close();
                path.rewind();
                path.arcTo(rectF, this.f7348o + this.f7349p, this.q, false);
                float f16 = this.f7348o + this.f7349p;
                float f17 = this.q;
                path.arcTo(rectF2, f16 + f17, -f17, false);
                path.close();
                invalidate();
            }
        }
        path3.rewind();
        path2.rewind();
        path.rewind();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f6 = this.f7338d;
        canvas.rotate(-90.0f, f6, f6);
        if (this.f7348o != 0.0f) {
            Path path = this.j;
            if (!path.isEmpty()) {
                canvas.drawPath(path, this.f7341g);
            }
        }
        if (this.f7349p != 0.0f) {
            Path path2 = this.f7344k;
            if (!path2.isEmpty()) {
                canvas.drawPath(path2, this.f7342h);
            }
        }
        if (this.q == 0.0f) {
            return;
        }
        Path path3 = this.f7345l;
        if (path3.isEmpty()) {
            return;
        }
        canvas.drawPath(path3, this.f7343i);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        float f6 = 2;
        float f10 = this.f7338d;
        int i11 = (int) (f10 * f6);
        int i12 = (int) (f10 * f6);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, size);
        } else if (mode == 1073741824) {
            i11 = size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            i12 = Math.min(i12, size2);
        } else if (mode2 == 1073741824) {
            i12 = size2;
        }
        setMeasuredDimension(i11, i12);
    }
}
