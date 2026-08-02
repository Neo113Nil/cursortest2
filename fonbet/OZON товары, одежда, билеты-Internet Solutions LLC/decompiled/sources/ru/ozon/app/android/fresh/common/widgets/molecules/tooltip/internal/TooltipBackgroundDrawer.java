package ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.internal;

import Pk0.h;
import Sc.o;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.TooltipBeakPosition;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipBackgroundDrawer;", "", "", "beakHeight", "<init>", "(I)V", "width", "height", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipBeakPosition;", "beakPosition", "", "onSizeChanged", "(IILru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipBeakPosition;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "color", "setBackgroundColor", "I", "", "backgroundRadius", "F", "getBackgroundRadius", "()F", "setBackgroundRadius", "(F)V", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "backgroundBounds", "Landroid/graphics/RectF;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TooltipBackgroundDrawer {
    private float backgroundRadius;
    private final int beakHeight;

    @NotNull
    private final Paint backgroundPaint = h.a(true);

    @NotNull
    private final RectF backgroundBounds = new RectF();

    public TooltipBackgroundDrawer(int i11) {
        this.beakHeight = i11;
    }

    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.backgroundBounds;
        float f7 = this.backgroundRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.backgroundPaint);
    }

    public final void onSizeChanged(int width, int height, @NotNull TooltipBeakPosition beakPosition) {
        float f7;
        float f11;
        float f12;
        Intrinsics.checkNotNullParameter(beakPosition, "beakPosition");
        boolean z11 = beakPosition instanceof TooltipBeakPosition.Vertical;
        float f13 = 0.0f;
        if (z11 || Intrinsics.d(beakPosition, TooltipBeakPosition.Right.INSTANCE)) {
            f7 = 0.0f;
        } else {
            if (!Intrinsics.d(beakPosition, TooltipBeakPosition.Left.INSTANCE)) {
                throw new o();
            }
            f7 = this.beakHeight;
        }
        boolean z12 = beakPosition instanceof TooltipBeakPosition.Vertical.Top;
        if (z12) {
            f13 = this.beakHeight;
        } else if (!(beakPosition instanceof TooltipBeakPosition.Vertical.Bottom) && !(beakPosition instanceof TooltipBeakPosition.Horizontal)) {
            throw new o();
        }
        if (beakPosition instanceof TooltipBeakPosition.Vertical.Bottom) {
            f11 = height - this.beakHeight;
        } else {
            if (!z12 && !(beakPosition instanceof TooltipBeakPosition.Horizontal)) {
                throw new o();
            }
            f11 = height;
        }
        if (z11 || Intrinsics.d(beakPosition, TooltipBeakPosition.Left.INSTANCE)) {
            f12 = width;
        } else {
            if (!Intrinsics.d(beakPosition, TooltipBeakPosition.Right.INSTANCE)) {
                throw new o();
            }
            f12 = width - this.beakHeight;
        }
        this.backgroundBounds.set(f7, f13, f12, f11);
    }

    public final void setBackgroundColor(int color) {
        this.backgroundPaint.setColor(color);
    }

    public final void setBackgroundRadius(float f7) {
        this.backgroundRadius = f7;
    }
}
