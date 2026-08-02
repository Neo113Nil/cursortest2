package ru.ozon.app.android.travel.molecules.view.tripRoute;

import B90.C2619v;
import Ej.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import y7.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u00152\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020 H\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010'\u001a\u00020 H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/molecules/view/tripRoute/TravelVerticalAirlineIconViewGroup;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "centerX", "", "iconSize", "radius", "verticalOffset", "separatorPaint", "Landroid/graphics/Paint;", "paintWidthCompensation", "startAngle", "sweepAngle", "onSizeChanged", "", "width", "height", "oldw", "oldh", "onDrawForeground", "canvas", "Landroid/graphics/Canvas;", "bindOrGone", "icons", "", "", "createAndBindLogoImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "marginTop", "iconUrl", "createAndBindAmountTextView", "Lru/ozon/app/android/travel/molecules/view/tripRoute/AmountTextView;", "amount", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelVerticalAirlineIconViewGroup extends FrameLayout {
    private float centerX;
    private final int iconSize;
    private final float paintWidthCompensation;
    private final float radius;

    @NotNull
    private final Paint separatorPaint;
    private final float startAngle;
    private final float sweepAngle;
    private final int verticalOffset;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TravelVerticalAirlineIconViewGroup(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AmountTextView createAndBindAmountTextView(int marginTop, String amount) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AmountTextView amountTextView = new AmountTextView(context);
        int i11 = this.iconSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11);
        layoutParams.topMargin = marginTop;
        amountTextView.setLayoutParams(layoutParams);
        amountTextView.setText(amount);
        return amountTextView;
    }

    private final ShapeableImageView createAndBindLogoImageView(int marginTop, String iconUrl) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(getContext());
        int i11 = this.iconSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11);
        layoutParams.topMargin = marginTop;
        shapeableImageView.setLayoutParams(layoutParams);
        k kVar = new k();
        C2619v c2619v = new C2619v();
        k.a aVar = new k.a(kVar);
        aVar.d(c2619v);
        shapeableImageView.setShapeAppearanceModel(aVar.a());
        ImageViewExtKt.load$default(shapeableImageView, iconUrl, null, null, null, null, false, null, 126, null);
        return shapeableImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createAndBindLogoImageView$lambda$4$lambda$3(RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        float f7 = 2;
        return Math.min(bounds.width() / f7, bounds.height() / f7);
    }

    public final void bindOrGone(List<String> icons) {
        List<String> list = icons;
        boolean z11 = list == null || list.isEmpty();
        setVisibility(z11 ? 8 : 0);
        if (z11) {
            return;
        }
        if (icons == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        removeAllViews();
        Iterator<String> it = icons.iterator();
        addView(createAndBindLogoImageView(0, it.next()));
        if (it.hasNext()) {
            addView(createAndBindLogoImageView(this.verticalOffset, it.next()));
        }
        if (it.hasNext()) {
            addView(createAndBindAmountTextView(this.verticalOffset * 2, b.a(icons.size() - 2, "+")));
        }
    }

    @Override // android.view.View
    public void onDrawForeground(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDrawForeground(canvas);
        float paddingTop = getPaddingTop() + this.verticalOffset;
        int childCount = getChildCount() - 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            float f7 = this.centerX;
            float f11 = this.radius;
            float f12 = this.paintWidthCompensation;
            canvas.drawArc((f7 - f11) - f12, paddingTop - f12, f7 + f11 + f12, f12 + this.iconSize + paddingTop, this.startAngle, this.sweepAngle, false, this.separatorPaint);
            paddingTop += this.verticalOffset;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        this.centerX = (((width - getPaddingRight()) - r2) / 2.0f) + getPaddingLeft();
    }

    public /* synthetic */ TravelVerticalAirlineIconViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelVerticalAirlineIconViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int ceil = (int) Math.ceil(ResourceExtKt.toPxF(24, context));
        this.iconSize = ceil;
        this.radius = ceil / 2.0f;
        this.verticalOffset = (int) Math.ceil(ResourceExtKt.toPxF(20, context));
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ResourceExtKt.toPxF(1, context));
        this.separatorPaint = paint;
        this.paintWidthCompensation = paint.getStrokeWidth() / 2;
        this.startAngle = 225.0f;
        this.sweepAngle = 90.0f;
        setWillNotDraw(false);
    }
}
