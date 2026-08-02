package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation;

import Pk0.h;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceTooltipView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceBeakDrawer;", "", "beakSpec", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$BeakSpecification;", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$BeakSpecification;)V", "backgroundPaint", "Landroid/graphics/Paint;", "beakPath", "Landroid/graphics/Path;", "onSizeChanged", "", "anchorX", "", "height", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setColor", "color", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceBeakDrawer {

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Path beakPath;

    @NotNull
    private final FinanceTooltipView.BeakSpecification beakSpec;

    public FinanceBeakDrawer(@NotNull FinanceTooltipView.BeakSpecification beakSpec) {
        Intrinsics.checkNotNullParameter(beakSpec, "beakSpec");
        this.beakSpec = beakSpec;
        Paint a11 = h.a(true);
        a11.setPathEffect(new CornerPathEffect(beakSpec.getRadius()));
        this.backgroundPaint = a11;
        this.beakPath = new Path();
    }

    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.beakPath, this.backgroundPaint);
    }

    public final void onSizeChanged(float anchorX, int height) {
        float widthHalf = anchorX - this.beakSpec.getWidthHalf();
        float widthHalf2 = this.beakSpec.getWidthHalf() + anchorX;
        float f7 = height;
        float height2 = f7 - this.beakSpec.getHeight();
        this.beakPath.moveTo(widthHalf, height2);
        this.beakPath.lineTo(anchorX, f7);
        this.beakPath.lineTo(widthHalf2, height2);
    }

    public final void setColor(int color) {
        this.backgroundPaint.setColor(color);
    }
}
