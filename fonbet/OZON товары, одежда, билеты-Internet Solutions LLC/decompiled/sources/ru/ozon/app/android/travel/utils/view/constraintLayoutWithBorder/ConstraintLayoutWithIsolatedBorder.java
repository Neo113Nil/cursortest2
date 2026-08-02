package ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\u001e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithIsolatedBorder;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "backgroundPaint", "Landroid/graphics/Paint;", "borderRadius", "", "backgroundRadius", "spaceBetweenBorderAndBackground", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setBackgroundColor", "color", "fillPaths", "setCorners", "spaceBetween", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ConstraintLayoutWithIsolatedBorder extends ConstraintLayoutWithBorder {

    @NotNull
    private final Paint backgroundPaint;
    private float backgroundRadius;
    private float borderRadius;
    private float spaceBetweenBorderAndBackground;

    public /* synthetic */ ConstraintLayoutWithIsolatedBorder(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder
    protected void fillPaths() {
        float width = getWidth();
        float height = getHeight();
        getBackgroundPathProvider().fillBackground(width, height, this.backgroundRadius, this.spaceBetweenBorderAndBackground);
        getBorderPathProvider().fillBorder(width, height, this.borderRadius, getBorderPaint().getStrokeWidth());
    }

    @Override // ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.drawPath(getBorderPathProvider().getPath(), getBorderPaint());
        if (this.backgroundPaint.getColor() != 0) {
            canvas.drawPath(getBackgroundPathProvider().getPath(), this.backgroundPaint);
        }
    }

    @Override // ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder, android.view.View
    public void setBackgroundColor(int color) {
        this.backgroundPaint.setColor(color);
        invalidate();
    }

    public final void setCorners(float borderRadius, float backgroundRadius, float spaceBetween) {
        this.borderRadius = borderRadius;
        this.backgroundRadius = backgroundRadius;
        this.spaceBetweenBorderAndBackground = spaceBetween;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithIsolatedBorder$setCorners$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ConstraintLayoutWithIsolatedBorder.this.fillPaths();
                    ConstraintLayoutWithIsolatedBorder.this.invalidate();
                }
            });
        } else {
            fillPaths();
            invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutWithIsolatedBorder(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        this.backgroundPaint = paint;
    }
}
