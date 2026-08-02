package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.view;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/view/StaticCouponListGradientDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cornerRadius", "", "bind", "", "background", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "bindSolid", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors$Solid;", "bindSolid-YU51ovU", "(Ljava/lang/Integer;)V", "bindGradient", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors$Gradient;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListGradientDrawable extends GradientDrawable {
    private final float cornerRadius;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StaticCouponListBackground.GradientDirection.values().length];
            try {
                iArr[StaticCouponListBackground.GradientDirection.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.TOP_RIGHT_LEFT_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.BOTTOM_RIGHT_TOP_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.BOTTOM_LEFT_TOP_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.TOP_LEFT_BOTTOM_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StaticCouponListGradientDrawable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cornerRadius = ResourceExtKt.toPxF(8, context);
    }

    private final void bindGradient(StaticCouponListBackground.Colors.Gradient background) {
        GradientDrawable.Orientation orientation;
        switch (WhenMappings.$EnumSwitchMapping$0[background.getGradientDirection().ordinal()]) {
            case 1:
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                break;
            case 2:
                orientation = GradientDrawable.Orientation.TR_BL;
                break;
            case 3:
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                break;
            case 4:
                orientation = GradientDrawable.Orientation.BR_TL;
                break;
            case 5:
                orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                break;
            case 6:
                orientation = GradientDrawable.Orientation.BL_TR;
                break;
            case 7:
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                break;
            case 8:
                orientation = GradientDrawable.Orientation.TL_BR;
                break;
            default:
                throw new o();
        }
        setOrientation(orientation);
        if (background.getFromColor() == null || background.getToColor() == null) {
            return;
        }
        setColors(new int[]{background.getFromColor().intValue(), background.getToColor().intValue()});
    }

    /* renamed from: bindSolid-YU51ovU, reason: not valid java name */
    private final void m803bindSolidYU51ovU(Integer background) {
        if (background != null) {
            setColor(background.intValue());
        }
    }

    public final void bind(@NotNull StaticCouponListBackground background) {
        Intrinsics.checkNotNullParameter(background, "background");
        setShape(0);
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = this.cornerRadius;
        }
        setCornerRadii(fArr);
        StaticCouponListBackground.Colors colors = background.getColors();
        if (colors instanceof StaticCouponListBackground.Colors.Solid) {
            m803bindSolidYU51ovU(((StaticCouponListBackground.Colors.Solid) colors).getColor());
        } else {
            if (!(colors instanceof StaticCouponListBackground.Colors.Gradient)) {
                throw new o();
            }
            bindGradient((StaticCouponListBackground.Colors.Gradient) colors);
        }
    }
}
