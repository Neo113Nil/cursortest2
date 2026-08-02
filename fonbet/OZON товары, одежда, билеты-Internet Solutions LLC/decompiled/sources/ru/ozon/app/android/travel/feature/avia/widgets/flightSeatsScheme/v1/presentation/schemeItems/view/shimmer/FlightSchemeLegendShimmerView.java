package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.shimmer;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeLegendShimmerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setUp", "", "addChildren", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeLegendShimmerView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeLegendShimmerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setUp();
        addChildren();
    }

    private final void addChildren() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(18, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        addView(ShimmerViewExtensionKt.createShimmerView$default(this, ResourceExtKt.toPx(160, context2), px, null, 0, 0, 0, 0, 124, null));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        addView(ShimmerViewExtensionKt.createShimmerView$default(this, ResourceExtKt.toPx(64, context3), px, null, 8388661, 0, 0, 0, 116, null));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int px2 = ResourceExtKt.toPx(4, context4);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int px3 = ResourceExtKt.toPx(12, context5);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        int px4 = ResourceExtKt.toPx(58, context6);
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        int px5 = ResourceExtKt.toPx(3, context7);
        int i11 = 0;
        int i12 = 0;
        while (i12 < 4) {
            int i13 = px3;
            addView(ShimmerViewExtensionKt.createShimmerView$default(this, px3, px3, null, 8388691, i11, 0, px5, 36, null));
            int i14 = i11 + i13 + px2;
            int i15 = px4;
            addView(ShimmerViewExtensionKt.createShimmerView$default(this, i15, px, null, 8388691, i14, 0, 0, 100, null));
            i11 = i14 + i15 + i13;
            i12++;
            px4 = i15;
            px3 = i13;
            px5 = px5;
        }
    }

    private final void setUp() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackground(roundedBackgroundProducer.produce(themeColor, ResourceExtKt.toPxF(20, context2)));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setMinimumHeight(ResourceExtKt.toPx(80, context3));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context4);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int px2 = ResourceExtKt.toPx(8, context5);
        setPadding(px, px2, px, px2);
    }
}
