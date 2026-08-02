package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.shimmer;

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

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJA\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0003\u0010\u0010\u001a\u00020\f2\b\b\u0003\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0017¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeSeatRowShimmerViewV2;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "shimmerBackground", "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V", "", "setUp", "()V", "addChildren", "", "size", "background", "gravity", "startOffset", "endOffset", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "createShimmerView", "(ILandroid/graphics/drawable/Drawable;III)Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "Landroid/graphics/drawable/Drawable;", "dp4", "I", "getDp4", "()I", "dp8", "getDp8", "dp44", "getDp44", "dp16", "getDp16", "backgroundColor", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeSeatRowShimmerViewV2 extends FrameLayout {
    private final int backgroundColor;
    private final int dp16;
    private final int dp4;
    private final int dp44;
    private final int dp8;
    private final Drawable shimmerBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeSeatRowShimmerViewV2(@NotNull Context context, Drawable drawable) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shimmerBackground = drawable;
        this.dp4 = UiExtKt.toPx(4, context);
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp44 = UiExtKt.toPx(44, context);
        this.dp16 = UiExtKt.toPx(16, context);
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        setUp();
        addChildren();
    }

    private final void addChildren() {
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            addView(createShimmerView$default(this, this.dp44, this.shimmerBackground, 0, i11, 0, 20, null));
            i11 += this.dp44 + this.dp8;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 3; i14++) {
            addView(createShimmerView$default(this, this.dp44, this.shimmerBackground, 8388613, 0, i13, 8, null));
            i13 += this.dp44 + this.dp8;
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

    static /* synthetic */ RoundedShimmerView createShimmerView$default(FlightSchemeSeatRowShimmerViewV2 flightSchemeSeatRowShimmerViewV2, int i11, Drawable drawable, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            i12 = 8388659;
        }
        return flightSchemeSeatRowShimmerViewV2.createShimmerView(i11, drawable, i12, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0 : i14);
    }

    private final void setUp() {
        int i11 = this.dp8;
        int i12 = this.dp4;
        setPadding(i11, i12, i11, i12);
        setBackgroundColor(this.backgroundColor);
    }
}
