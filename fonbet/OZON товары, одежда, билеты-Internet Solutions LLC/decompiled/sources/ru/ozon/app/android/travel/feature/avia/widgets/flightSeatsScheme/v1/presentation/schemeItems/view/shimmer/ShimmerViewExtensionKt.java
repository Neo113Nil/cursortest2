package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.shimmer;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aY\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"createShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "Landroid/widget/FrameLayout;", "width", "", "height", "radius", "", "gravity", "startOffset", "endOffset", "bottomOffset", "(Landroid/widget/FrameLayout;IILjava/lang/Float;IIII)Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ShimmerViewExtensionKt {
    @NotNull
    public static final RoundedShimmerView createShimmerView(@NotNull FrameLayout frameLayout, int i11, int i12, Float f7, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(frameLayout, "<this>");
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12, i13);
        layoutParams.setMarginStart(i14);
        layoutParams.setMarginEnd(i15);
        layoutParams.bottomMargin = i16;
        roundedShimmerView.setLayoutParams(layoutParams);
        if (f7 != null) {
            roundedShimmerView.setCornerRadius(f7.floatValue());
        }
        return roundedShimmerView;
    }

    public static /* synthetic */ RoundedShimmerView createShimmerView$default(FrameLayout frameLayout, int i11, int i12, Float f7, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 4) != 0) {
            f7 = null;
        }
        Float f11 = f7;
        if ((i17 & 8) != 0) {
            i13 = 8388659;
        }
        return createShimmerView(frameLayout, i11, i12, f11, i13, (i17 & 16) != 0 ? 0 : i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }
}
