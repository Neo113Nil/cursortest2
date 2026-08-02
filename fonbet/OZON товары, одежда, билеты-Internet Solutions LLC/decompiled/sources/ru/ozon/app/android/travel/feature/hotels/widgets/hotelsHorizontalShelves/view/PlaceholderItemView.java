package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.view;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/view/PlaceholderItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp148", "", "dp132", "dp20", "dp14", "dp8", "dp4", "dp2", "dpf4", "", "dpf16", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlaceholderItemView extends LinearLayout {
    private final int dp132;
    private final int dp14;
    private final int dp148;
    private final int dp2;
    private final int dp20;
    private final int dp4;
    private final int dp8;
    private final float dpf16;
    private final float dpf4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(148, context);
        this.dp148 = px;
        int px2 = UiExtKt.toPx(132, context);
        this.dp132 = px2;
        int px3 = UiExtKt.toPx(20, context);
        this.dp20 = px3;
        int px4 = UiExtKt.toPx(14, context);
        this.dp14 = px4;
        int px5 = UiExtKt.toPx(8, context);
        this.dp8 = px5;
        int px6 = UiExtKt.toPx(4, context);
        this.dp4 = px6;
        int px7 = UiExtKt.toPx(2, context);
        this.dp2 = px7;
        float pxF = ResourceExtKt.toPxF(4, context);
        this.dpf4 = pxF;
        float pxF2 = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF2;
        setOrientation(1);
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(px, px);
        layoutParams.bottomMargin = px5;
        roundedShimmerView.setLayoutParams(layoutParams);
        roundedShimmerView.setCornerRadius(pxF2);
        addView(roundedShimmerView);
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(px, px3);
        layoutParams2.bottomMargin = px6;
        roundedShimmerView2.setLayoutParams(layoutParams2);
        roundedShimmerView2.setCornerRadius(pxF);
        addView(roundedShimmerView2);
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(px, px3);
        layoutParams3.bottomMargin = px6;
        roundedShimmerView3.setLayoutParams(layoutParams3);
        roundedShimmerView3.setCornerRadius(pxF);
        addView(roundedShimmerView3);
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(px2, px4);
        layoutParams4.bottomMargin = px7;
        roundedShimmerView4.setLayoutParams(layoutParams4);
        roundedShimmerView4.setCornerRadius(pxF);
        addView(roundedShimmerView4);
        RoundedShimmerView roundedShimmerView5 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(px2, px4);
        layoutParams5.bottomMargin = px7;
        roundedShimmerView5.setLayoutParams(layoutParams5);
        roundedShimmerView5.setCornerRadius(pxF);
        addView(roundedShimmerView5);
    }
}
