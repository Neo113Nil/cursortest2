package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountViewKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2FooterBlockShimmerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dpF8", "", "dp32", "", "dp105", "addChildren", "", "createShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "width", "height", "radius", "startMargin", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2FooterBlockShimmerView extends FrameLayout {
    private final int dp105;
    private final int dp32;
    private final float dpF8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2FooterBlockShimmerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dpF8 = ResourceExtKt.toPxF(8, context);
        this.dp32 = UiExtKt.toPx(32, context);
        this.dp105 = UiExtKt.toPx(105, context);
        addChildren();
    }

    private final void addChildren() {
        float f7 = this.dpF8;
        addView(createShimmerView$default(this, this.dp105, this.dp32, f7, 0, 8, null));
        int i11 = this.dp105;
        addView(createShimmerView(i11, this.dp32, f7, ProgressiveDiscountViewKt.getDp8() + i11));
    }

    private final RoundedShimmerView createShimmerView(int width, int height, float radius, int startMargin) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
        layoutParams.setMarginStart(startMargin);
        layoutParams.topMargin = layoutParams.topMargin;
        roundedShimmerView.setLayoutParams(layoutParams);
        roundedShimmerView.setCornerRadius(radius);
        return roundedShimmerView;
    }

    static /* synthetic */ RoundedShimmerView createShimmerView$default(FlightSeatsSchemeV2FooterBlockShimmerView flightSeatsSchemeV2FooterBlockShimmerView, int i11, int i12, float f7, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return flightSeatsSchemeV2FooterBlockShimmerView.createShimmerView(i11, i12, f7, i13);
    }
}
