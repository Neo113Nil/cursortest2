package ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.view;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/view/TravelSortingV2SkeletonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp32", "placeholder1", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "placeholder2", "placeholder3", "placeholder4", "placeholder5", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelSortingV2SkeletonView extends LinearLayout {
    public static final int $stable = RoundedShimmerView.$stable;
    private final int dp32;
    private final int dp8;

    @NotNull
    private final RoundedShimmerView placeholder1;

    @NotNull
    private final RoundedShimmerView placeholder2;

    @NotNull
    private final RoundedShimmerView placeholder3;

    @NotNull
    private final RoundedShimmerView placeholder4;

    @NotNull
    private final RoundedShimmerView placeholder5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelSortingV2SkeletonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = UiExtKt.toPx(32, context);
        this.dp32 = px2;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UiExtKt.toPx(40, context), px2);
        layoutParams.setMarginStart(UiExtKt.toPx(16, context));
        roundedShimmerView.setLayoutParams(layoutParams);
        this.placeholder1 = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(UiExtKt.toPx(100, context), px2);
        layoutParams2.setMarginStart(px);
        roundedShimmerView2.setLayoutParams(layoutParams2);
        this.placeholder2 = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(UiExtKt.toPx(76, context), px2);
        layoutParams3.setMarginStart(px);
        roundedShimmerView3.setLayoutParams(layoutParams3);
        this.placeholder3 = roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(UiExtKt.toPx(96, context), px2);
        layoutParams4.setMarginStart(px);
        roundedShimmerView4.setLayoutParams(layoutParams4);
        this.placeholder4 = roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(UiExtKt.toPx(110, context), px2);
        layoutParams5.setMarginStart(px);
        roundedShimmerView5.setLayoutParams(layoutParams5);
        this.placeholder5 = roundedShimmerView5;
        setOrientation(0);
        addView(roundedShimmerView);
        addView(roundedShimmerView2);
        addView(roundedShimmerView3);
        addView(roundedShimmerView4);
        addView(roundedShimmerView5);
    }
}
