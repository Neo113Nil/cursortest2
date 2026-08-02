package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.directFlightsShimmer;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/directFlightsShimmer/AviaSearchResultV4DirectFlightsCellItemShimmerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp8", "dpf12", "", "dp24", "dp28", "dp40", "dp72", "dp108", "icon", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitleItem1", "subTitleItem2", "subTitleItem3", "price", "setupConstraints", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4DirectFlightsCellItemShimmerView extends ConstraintLayout {
    public static final int $stable = RoundedShimmerView.$stable;
    private final int dp108;
    private final int dp24;
    private final int dp28;
    private final int dp4;
    private final int dp40;
    private final int dp72;
    private final int dp8;
    private final float dpf12;

    @NotNull
    private final RoundedShimmerView icon;

    @NotNull
    private final RoundedShimmerView price;

    @NotNull
    private final RoundedShimmerView subTitleItem1;

    @NotNull
    private final RoundedShimmerView subTitleItem2;

    @NotNull
    private final RoundedShimmerView subTitleItem3;

    @NotNull
    private final RoundedShimmerView title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchResultV4DirectFlightsCellItemShimmerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        float pxF = ResourceExtKt.toPxF(12, context);
        this.dpf12 = pxF;
        int px = ResourceExtKt.toPx(24, context);
        this.dp24 = px;
        int px2 = ResourceExtKt.toPx(28, context);
        this.dp28 = px2;
        int px3 = ResourceExtKt.toPx(40, context);
        this.dp40 = px3;
        int px4 = ResourceExtKt.toPx(72, context);
        this.dp72 = px4;
        int px5 = ResourceExtKt.toPx(108, context);
        this.dp108 = px5;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(R$id.aviaSearchResultV4DirectFlightsCellItemShimmerIcon);
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(px, px));
        roundedShimmerView.setCornerRadius(pxF);
        addView(roundedShimmerView);
        this.icon = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView2.setId(R$id.aviaSearchResultV4DirectFlightsCellItemShimmerTitle);
        roundedShimmerView2.setLayoutParams(new ConstraintLayout.b(px4, px));
        addView(roundedShimmerView2);
        this.title = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView3.setId(R$id.aviaSearchResultV4DirectFlightsCellItemShimmerSubtitle1);
        roundedShimmerView3.setLayoutParams(new ConstraintLayout.b(px3, px));
        addView(roundedShimmerView3);
        this.subTitleItem1 = roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView4.setId(R$id.aviaSearchResultV4DirectFlightsCellItemShimmerSubtitle2);
        roundedShimmerView4.setLayoutParams(new ConstraintLayout.b(px3, px));
        addView(roundedShimmerView4);
        this.subTitleItem2 = roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView5.setId(R$id.aviaSearchResultV4DirectFlightsCellItemShimmerSubtitle3);
        roundedShimmerView5.setLayoutParams(new ConstraintLayout.b(px3, px));
        addView(roundedShimmerView5);
        this.subTitleItem3 = roundedShimmerView5;
        RoundedShimmerView roundedShimmerView6 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView6.setId(R$id.aviaSearchResultV4DirectFlightsCellItemShimmerPrice);
        roundedShimmerView6.setLayoutParams(new ConstraintLayout.b(px5, px2));
        addView(roundedShimmerView6);
        this.price = roundedShimmerView6;
        setupConstraints();
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AviaSearchResultV4DirectFlightsCellItemShimmerView$setupConstraints$1(this));
    }
}
