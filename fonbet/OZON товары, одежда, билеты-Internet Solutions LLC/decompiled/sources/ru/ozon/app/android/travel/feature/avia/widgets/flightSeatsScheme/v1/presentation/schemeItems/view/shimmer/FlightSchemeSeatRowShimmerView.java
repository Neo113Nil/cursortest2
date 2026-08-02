package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.shimmer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J:\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeSeatRowShimmerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "shimmerBackground", "Landroid/graphics/drawable/Drawable;", "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V", "setUp", "", "addChildren", "createShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "size", "", "background", "gravity", "startOffset", "endOffset", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeSeatRowShimmerView extends FrameLayout {
    private final Drawable shimmerBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeSeatRowShimmerView(@NotNull Context context, Drawable drawable) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shimmerBackground = drawable;
        setUp();
        addChildren();
    }

    private final void addChildren() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(40, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = UiExtKt.toPx(8, context2);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            addView(createShimmerView$default(this, px, this.shimmerBackground, 0, i11, 0, 20, null));
            i11 += px + px2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 3; i14++) {
            addView(createShimmerView$default(this, px, this.shimmerBackground, 8388613, 0, i13, 8, null));
            i13 += px + px2;
        }
    }

    private final RoundedShimmerView createShimmerView(int size, Drawable background, int gravity, int startOffset, int endOffset) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size, size, gravity);
        layoutParams.setMarginStart(startOffset);
        layoutParams.setMarginEnd(endOffset);
        roundedShimmerView.setLayoutParams(layoutParams);
        View childAt = roundedShimmerView.getChildAt(0);
        if (childAt != null) {
            childAt.setBackground(background);
        }
        return roundedShimmerView;
    }

    static /* synthetic */ RoundedShimmerView createShimmerView$default(FlightSchemeSeatRowShimmerView flightSchemeSeatRowShimmerView, int i11, Drawable drawable, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            i12 = 8388659;
        }
        return flightSchemeSeatRowShimmerView.createShimmerView(i11, drawable, i12, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0 : i14);
    }

    private final void setUp() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = UiExtKt.toPx(4, context2);
        setPadding(px, px2, px, px2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context3, R$attr.layerFloor1));
    }
}
