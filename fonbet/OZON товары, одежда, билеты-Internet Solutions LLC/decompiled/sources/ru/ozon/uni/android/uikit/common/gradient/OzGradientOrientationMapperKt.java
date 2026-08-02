package ru.ozon.uni.android.uikit.common.gradient;

import Sc.o;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"getCoordinates", "", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "bounds", "Landroid/graphics/Rect;", "sizePx", "", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OzGradientOrientationMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            try {
                iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDrawable.Orientation.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GradientDrawable.Orientation.TL_BR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final float[] getCoordinates(@NotNull GradientDrawable.Orientation orientation, @NotNull Rect bounds) {
        float f7;
        float f11;
        float f12;
        float f13;
        Intrinsics.checkNotNullParameter(orientation, "<this>");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        RectF rectF = new RectF(bounds);
        switch (WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()]) {
            case 1:
                f7 = rectF.left;
                f11 = rectF.top;
                f12 = rectF.bottom;
                f13 = f7;
                return new float[]{f7, f11, f13, f12};
            case 2:
                f7 = rectF.right;
                f11 = rectF.top;
                f13 = rectF.left;
                f12 = rectF.bottom;
                return new float[]{f7, f11, f13, f12};
            case 3:
                f7 = rectF.right;
                f11 = rectF.top;
                f13 = rectF.left;
                f12 = f11;
                return new float[]{f7, f11, f13, f12};
            case 4:
                f7 = rectF.right;
                f11 = rectF.bottom;
                f13 = rectF.left;
                f12 = rectF.top;
                return new float[]{f7, f11, f13, f12};
            case 5:
                f7 = rectF.left;
                f11 = rectF.bottom;
                f12 = rectF.top;
                f13 = f7;
                return new float[]{f7, f11, f13, f12};
            case 6:
                f7 = rectF.left;
                f11 = rectF.bottom;
                f13 = rectF.right;
                f12 = rectF.top;
                return new float[]{f7, f11, f13, f12};
            case 7:
                f7 = rectF.left;
                f11 = rectF.top;
                f13 = rectF.right;
                f12 = f11;
                return new float[]{f7, f11, f13, f12};
            case 8:
                f7 = rectF.left;
                f11 = rectF.top;
                f13 = rectF.right;
                f12 = rectF.bottom;
                return new float[]{f7, f11, f13, f12};
            default:
                throw new o();
        }
    }

    @NotNull
    public static final float[] getCoordinates(@NotNull GradientDrawable.Orientation orientation, int i11) {
        Intrinsics.checkNotNullParameter(orientation, "<this>");
        return getCoordinates(orientation, new Rect(0, 0, i11, i11));
    }
}
