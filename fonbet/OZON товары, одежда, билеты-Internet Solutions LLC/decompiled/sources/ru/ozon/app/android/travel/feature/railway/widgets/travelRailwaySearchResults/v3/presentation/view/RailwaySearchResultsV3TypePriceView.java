package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.Space;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.TravelRailwaySearchResultsV3TrainVO;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TypePriceView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "typeName", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "seatsCount", "space", "Landroid/widget/Space;", "typePrice", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$CarriageTypeVO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwaySearchResultsV3TypePriceView extends LinearLayout {
    private final int dp4;

    @NotNull
    private final TextAtomV2View seatsCount;

    @NotNull
    private final Space space;

    @NotNull
    private final TextAtomV2View typeName;

    @NotNull
    private final PriceAtomView typePrice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwaySearchResultsV3TypePriceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(4, context);
        this.dp4 = px;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(px);
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        this.typeName = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View2.setTextIsSelectable(false);
        this.seatsCount = textAtomV2View2;
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        this.space = space;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        priceAtomView = priceAtomView == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
        layoutParams2.setMarginStart(px);
        priceAtomView.setLayoutParams(layoutParams2);
        this.typePrice = priceAtomView;
        setOrientation(0);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(space);
        addView(priceAtomView);
    }

    public final void bind(@NotNull TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.typeName, item.getTypeName(), null, 2, null);
        TextHolderKt.bind$default(this.seatsCount, item.getSeatsCount(), null, 2, null);
        PriceAtomHolderKt.bindOrGone$default(this.typePrice, item.getTypePrice(), null, 2, null);
    }
}
