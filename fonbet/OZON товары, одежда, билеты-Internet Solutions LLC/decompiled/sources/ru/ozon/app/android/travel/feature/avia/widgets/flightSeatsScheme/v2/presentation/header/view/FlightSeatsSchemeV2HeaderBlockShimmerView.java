package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.view;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J4\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/view/FlightSeatsSchemeV2HeaderBlockShimmerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dpF8", "", "dp20", "", "dp24", "dp28", "dp240", "addChildren", "", "createShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "width", "height", "radius", "startMargin", "topMargin", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2HeaderBlockShimmerView extends FrameLayout {
    private final int dp20;
    private final int dp24;
    private final int dp240;
    private final int dp28;
    private final float dpF8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2HeaderBlockShimmerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dpF8 = ResourceExtKt.toPxF(8, context);
        this.dp20 = UiExtKt.toPx(20, context);
        this.dp24 = UiExtKt.toPx(24, context);
        this.dp28 = UiExtKt.toPx(28, context);
        this.dp240 = UiExtKt.toPx(240, context);
        addChildren();
    }

    private final void addChildren() {
        float f7 = this.dpF8;
        addView(createShimmerView$default(this, this.dp240, this.dp24, f7, 0, 0, 24, null));
        addView(createShimmerView$default(this, -1, this.dp20, f7, 0, this.dp28, 8, null));
    }

    private final RoundedShimmerView createShimmerView(int width, int height, float radius, int startMargin, int topMargin) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
        layoutParams.setMarginStart(startMargin);
        layoutParams.topMargin = topMargin;
        roundedShimmerView.setLayoutParams(layoutParams);
        roundedShimmerView.setCornerRadius(radius);
        return roundedShimmerView;
    }

    static /* synthetic */ RoundedShimmerView createShimmerView$default(FlightSeatsSchemeV2HeaderBlockShimmerView flightSeatsSchemeV2HeaderBlockShimmerView, int i11, int i12, float f7, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i13 = 0;
        }
        if ((i15 & 16) != 0) {
            i14 = 0;
        }
        return flightSeatsSchemeV2HeaderBlockShimmerView.createShimmerView(i11, i12, f7, i13, i14);
    }
}
