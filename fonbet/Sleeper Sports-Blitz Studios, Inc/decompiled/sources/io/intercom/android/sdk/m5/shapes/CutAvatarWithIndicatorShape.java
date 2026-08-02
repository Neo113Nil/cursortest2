package io.intercom.android.sdk.m5.shapes;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CutAvatarWithIndicatorShape.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/shapes/CutAvatarWithIndicatorShape;", "Landroidx/compose/ui/graphics/Shape;", "shape", "indicatorSize", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Landroidx/compose/ui/graphics/Shape;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "createOutline", "Landroidx/compose/ui/graphics/Outline;", RRWebVideoEvent.JsonKeys.SIZE, "Landroidx/compose/ui/geometry/Size;", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "getOffset", "Landroidx/compose/ui/geometry/Offset;", "indicatorCutSizePx", "", "cutDifference", "yOffset", "getOffset-XPhi94U", "(JFFFLandroidx/compose/ui/unit/LayoutDirection;)J", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CutAvatarWithIndicatorShape implements Shape {
    public static final int $stable = 0;
    private final float indicatorSize;
    private final Shape shape;

    /* compiled from: CutAvatarWithIndicatorShape.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CutAvatarWithIndicatorShape(Shape shape, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, f);
    }

    private CutAvatarWithIndicatorShape(Shape shape, float f) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        this.indicatorSize = f;
    }

    /* renamed from: getOffset-XPhi94U, reason: not valid java name */
    private final long m12604getOffsetXPhi94U(long size, float indicatorCutSizePx, float cutDifference, float yOffset, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            return Offset.m5763constructorimpl((Float.floatToRawIntBits((Float.intBitsToFloat((int) (size >> 32)) - indicatorCutSizePx) + cutDifference) << 32) | (Float.floatToRawIntBits(yOffset) & 4294967295L));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Offset.m5763constructorimpl((Float.floatToRawIntBits(0.0f - cutDifference) << 32) | (Float.floatToRawIntBits(yOffset) & 4294967295L));
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo646createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float f = 2;
        float mo744toPx0680j_4 = density.mo744toPx0680j_4(Dp.m8798constructorimpl(f));
        float mo744toPx0680j_42 = density.mo744toPx0680j_4(this.indicatorSize) + (f * mo744toPx0680j_4);
        RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
        Path Path = AndroidPath_androidKt.Path();
        OutlineKt.addOutline(Path, this.shape.mo646createOutlinePq9zytI(size, layoutDirection, density));
        Path Path2 = AndroidPath_androidKt.Path();
        OutlineKt.addOutline(Path2, circleShape.mo646createOutlinePq9zytI(Size.m5831constructorimpl((Float.floatToRawIntBits(mo744toPx0680j_42) << 32) | (Float.floatToRawIntBits(mo744toPx0680j_42) & 4294967295L)), layoutDirection, density));
        Path Path3 = AndroidPath_androidKt.Path();
        Path3.mo5903addPathUv8p0NA(Path2, m12604getOffsetXPhi94U(size, mo744toPx0680j_42, mo744toPx0680j_4, (Float.intBitsToFloat((int) (size & 4294967295L)) - mo744toPx0680j_42) + mo744toPx0680j_4, layoutDirection));
        Path Path4 = AndroidPath_androidKt.Path();
        Path4.mo5905opN5in7k0(Path, Path3, PathOperation.INSTANCE.m6343getDifferenceb3I0S0c());
        return new Outline.Generic(Path4);
    }
}
