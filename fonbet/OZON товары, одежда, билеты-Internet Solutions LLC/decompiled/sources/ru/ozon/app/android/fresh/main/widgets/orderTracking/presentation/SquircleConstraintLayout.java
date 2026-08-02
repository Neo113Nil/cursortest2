package ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation;

import Sc.r;
import Sc.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$styleable;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/SquircleConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defaultHorizontalRadius", "", "defaultVerticalRadius", "horizontalRadius", "verticalRadius", "paint", "Landroid/graphics/Paint;", "squirclePath", "Landroid/graphics/Path;", "onSizeChanged", "", "w", "", "h", "oldw", "oldh", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "initArguments", "attributeSet", "getSquirclePathRoundedCorners", "rect", "Landroid/graphics/RectF;", "radiusH", "radiusW", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SquircleConstraintLayout extends ConstraintLayout {
    private final float defaultHorizontalRadius;
    private final float defaultVerticalRadius;
    private float horizontalRadius;

    @NotNull
    private final Paint paint;

    @NotNull
    private Path squirclePath;
    private float verticalRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquircleConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(23);
        this.defaultHorizontalRadius = pxF;
        float pxF2 = ResourceExtKt.toPxF(23);
        this.defaultVerticalRadius = pxF2;
        this.horizontalRadius = pxF;
        this.verticalRadius = pxF2;
        this.squirclePath = new Path();
        Paint paint = new Paint();
        paint.setColor(a.getColor(context, R$color.oz_semantic_ctrl_neutral_pale));
        this.paint = paint;
        initArguments(attributeSet);
    }

    private final Path getSquirclePathRoundedCorners(RectF rect, float radiusH, float radiusW) {
        float f7 = rect.left;
        float f11 = rect.right;
        float f12 = rect.top;
        float f13 = rect.bottom;
        Path path = new Path();
        float f14 = f13 - radiusH;
        path.moveTo(f7, f14);
        float f15 = radiusH + f12;
        path.lineTo(f7, f15);
        float f16 = f7 + radiusW;
        path.quadTo(f7, f12, f16, f12);
        float f17 = f11 - radiusW;
        path.lineTo(f17, f12);
        path.quadTo(f11, f12, f11, f15);
        path.lineTo(f11, f14);
        path.quadTo(f11, f13, f17, f13);
        path.lineTo(f16, f13);
        path.quadTo(f7, f13, f7, f14);
        return path;
    }

    private final void initArguments(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.SquircleConstraintLayout, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                r.Companion companion = r.INSTANCE;
                this.horizontalRadius = obtainStyledAttributes.getDimension(R$styleable.SquircleConstraintLayout_width_radius, this.defaultHorizontalRadius);
                this.verticalRadius = obtainStyledAttributes.getDimension(R$styleable.SquircleConstraintLayout_width_radius, this.defaultVerticalRadius);
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                s.a(th2);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.squirclePath, this.paint);
        canvas.clipPath(this.squirclePath);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        this.squirclePath = getSquirclePathRoundedCorners(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.verticalRadius, this.horizontalRadius);
    }
}
