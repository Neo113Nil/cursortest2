package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4TypePriceView$special$$inlined$preCreationViewPool$default$6 extends AbstractC7737t implements Function1<PriceAtomView, Unit> {
    final /* synthetic */ TravelRailwaySearchResultsV4TypePriceView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySearchResultsV4TypePriceView$special$$inlined$preCreationViewPool$default$6(TravelRailwaySearchResultsV4TypePriceView travelRailwaySearchResultsV4TypePriceView) {
        super(1);
        this.this$0 = travelRailwaySearchResultsV4TypePriceView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PriceAtomView priceAtomView) {
        invoke(priceAtomView);
        return Unit.f71690a;
    }

    public final void invoke(PriceAtomView PreCreationViewPoolDelegate) {
        int i11;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 0.0f);
        i11 = this.this$0.dp4;
        layoutParams.setMarginStart(i11);
        PreCreationViewPoolDelegate.setLayoutParams(layoutParams);
    }
}
