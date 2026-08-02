package ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.R$styleable;
import ru.ozon.app.android.travel.utils.utils.PathProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J(\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0014J\u0012\u0010)\u001a\u00020\u001e2\b\b\u0001\u0010*\u001a\u00020\u0007H\u0016J\u0012\u0010+\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0019\u0010.\u001a\u00020\u001e2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020\u0007J\u000e\u00101\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\fJ\b\u00102\u001a\u00020\u001eH\u0014R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "radius", "getRadius", "()F", "setRadius", "(F)V", "borderPathProvider", "Lru/ozon/app/android/travel/utils/utils/PathProvider;", "getBorderPathProvider", "()Lru/ozon/app/android/travel/utils/utils/PathProvider;", "backgroundPathProvider", "getBackgroundPathProvider", "borderPaint", "Landroid/graphics/Paint;", "getBorderPaint", "()Landroid/graphics/Paint;", "mBackgroundColor", "setWillNotDraw", "", "willNotDraw", "", "onSizeChanged", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setBackgroundColor", "color", "setBackground", "background", "Landroid/graphics/drawable/Drawable;", "setBorderColor", "(Ljava/lang/Integer;)V", "getBorderColor", "setBorderWidth", "fillPaths", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ConstraintLayoutWithBorder extends ConstraintLayout {

    @NotNull
    private final PathProvider backgroundPathProvider;

    @NotNull
    private final Paint borderPaint;

    @NotNull
    private final PathProvider borderPathProvider;
    private int mBackgroundColor;
    private float radius;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutWithBorder(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected void fillPaths() {
        float width = getWidth();
        float height = getHeight();
        this.backgroundPathProvider.fillBorder(width, height, this.radius, 0.0f);
        this.borderPathProvider.fillBorder(width, height, this.radius, this.borderPaint.getStrokeWidth());
    }

    @NotNull
    protected final PathProvider getBackgroundPathProvider() {
        return this.backgroundPathProvider;
    }

    public final int getBorderColor() {
        return this.borderPaint.getColor();
    }

    @NotNull
    protected final Paint getBorderPaint() {
        return this.borderPaint;
    }

    @NotNull
    protected final PathProvider getBorderPathProvider() {
        return this.borderPathProvider;
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.backgroundPathProvider.getPath());
        int i11 = this.mBackgroundColor;
        if (i11 != 0) {
            canvas.drawColor(i11);
        }
        if (this.borderPaint.getColor() != 0) {
            canvas.drawPath(this.borderPathProvider.getPath(), this.borderPaint);
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        fillPaths();
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.mBackgroundColor = color;
        invalidate();
    }

    public void setBorderColor(Integer color) {
        this.borderPaint.setColor(color != null ? color.intValue() : 0);
        invalidate();
    }

    public final void setBorderWidth(float width) {
        this.borderPaint.setStrokeWidth(width);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder$setBorderWidth$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ConstraintLayoutWithBorder.this.fillPaths();
                    ConstraintLayoutWithBorder.this.invalidate();
                }
            });
        } else {
            fillPaths();
            invalidate();
        }
    }

    public final void setRadius(float f7) {
        if (f7 == this.radius) {
            return;
        }
        this.radius = f7;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder$special$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ConstraintLayoutWithBorder.this.fillPaths();
                    ConstraintLayoutWithBorder.this.invalidate();
                }
            });
        } else {
            fillPaths();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setWillNotDraw(boolean willNotDraw) {
    }

    public /* synthetic */ ConstraintLayoutWithBorder(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutWithBorder(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.radius = ResourceExtKt.toPxF(6, context);
        this.borderPathProvider = new PathProvider();
        this.backgroundPathProvider = new PathProvider();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ResourceExtKt.toPxF(2, context));
        paint.setColor(0);
        this.borderPaint = paint;
        this.mBackgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        super.setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayoutWithBorder, i11, i12);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            paint.setStrokeWidth(obtainStyledAttributes.getDimension(R$styleable.ConstraintLayoutWithBorder_clwbBorderWidth, paint.getStrokeWidth()));
            if (obtainStyledAttributes.hasValue(R$styleable.ConstraintLayoutWithBorder_clwbBorderColor)) {
                paint.setColor(obtainStyledAttributes.getColor(R$styleable.ConstraintLayoutWithBorder_clwbBorderColor, ThemeExtKt.themeColor(context, R$attr.bgActionPrimary)));
            }
            if (obtainStyledAttributes.hasValue(R$styleable.ConstraintLayoutWithBorder_clwbBackgroundColor)) {
                this.mBackgroundColor = obtainStyledAttributes.getColor(R$styleable.ConstraintLayoutWithBorder_clwbBackgroundColor, ThemeExtKt.themeColor(context, R$attr.layerFloor1));
            }
            setRadius(obtainStyledAttributes.getDimension(R$styleable.ConstraintLayoutWithBorder_clwbCornerRadius, this.radius));
            Unit unit = Unit.f71690a;
            obtainStyledAttributes.recycle();
        }
    }
}
