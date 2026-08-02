package ru.ozon.app.android.cart.ui.tooltip.internal;

import Pk0.h;
import Sc.o;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipBeakPosition;
import ru.ozon.app.android.cart.ui.tooltip.internal.CartTooltipView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/internal/CartBeakDrawer;", "", "beakSpec", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipView$BeakSpecification;", "<init>", "(Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipView$BeakSpecification;)V", "backgroundPaint", "Landroid/graphics/Paint;", "beakPath", "Landroid/graphics/Path;", "onSizeChanged", "", "viewAnchorX", "", "width", "", "height", "beakPosition", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setColor", "color", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartBeakDrawer {

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Path beakPath;

    @NotNull
    private final CartTooltipView.BeakSpecification beakSpec;

    public CartBeakDrawer(@NotNull CartTooltipView.BeakSpecification beakSpec) {
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

    public final void onSizeChanged(float viewAnchorX, int width, int height, @NotNull CartTooltipBeakPosition beakPosition) {
        Intrinsics.checkNotNullParameter(beakPosition, "beakPosition");
        this.beakPath.reset();
        if (!(beakPosition instanceof CartTooltipBeakPosition.Vertical)) {
            boolean z11 = beakPosition instanceof CartTooltipBeakPosition.Left;
            float height2 = z11 ? this.beakSpec.getHeight() : width - this.beakSpec.getHeight();
            float f7 = height / 2;
            float widthHalf = f7 - this.beakSpec.getWidthHalf();
            float height3 = z11 ? height2 - this.beakSpec.getHeight() : this.beakSpec.getHeight() + height2;
            float widthHalf2 = this.beakSpec.getWidthHalf() + f7;
            this.beakPath.moveTo(height2, widthHalf);
            this.beakPath.lineTo(height3, f7);
            this.beakPath.lineTo(height2, widthHalf2);
            return;
        }
        CartTooltipBeakPosition.Vertical vertical = (CartTooltipBeakPosition.Vertical) beakPosition;
        if ((vertical instanceof CartTooltipBeakPosition.TopCenter) || Intrinsics.d(vertical, CartTooltipBeakPosition.BottomCenter.INSTANCE)) {
            viewAnchorX = width / 2;
        } else if (!(vertical instanceof CartTooltipBeakPosition.TopCustom) && !Intrinsics.d(vertical, CartTooltipBeakPosition.BottomCustom.INSTANCE)) {
            throw new o();
        }
        float widthHalf3 = viewAnchorX - this.beakSpec.getWidthHalf();
        float widthHalf4 = this.beakSpec.getWidthHalf() + viewAnchorX;
        boolean z12 = beakPosition instanceof CartTooltipBeakPosition.Vertical.Bottom;
        float height4 = z12 ? height - this.beakSpec.getHeight() : this.beakSpec.getHeight();
        float f11 = z12 ? height : 0.0f;
        this.beakPath.moveTo(widthHalf3, height4);
        this.beakPath.lineTo(viewAnchorX, f11);
        this.beakPath.lineTo(widthHalf4, height4);
    }

    public final void setColor(int color) {
        this.backgroundPaint.setColor(color);
    }
}
