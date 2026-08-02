package cT;

import kotlin.Unit;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridMultiFrameBindStrategy;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding.TravelCarriageSelectV3MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3MultiFrameBindDelegate;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56866b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f56865a = i11;
        this.f56866b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindStep3$lambda$2;
        Unit steps$lambda$3$lambda$0;
        Unit bindSteps$lambda$6;
        Unit bindStep2$lambda$1;
        switch (this.f56865a) {
            case 0:
                bindStep3$lambda$2 = TravelCarriageSelectV3MultiFrameBindDelegate.bindStep3$lambda$2((TravelCarriageSelectV3MultiFrameBindDelegate) this.f56866b);
                return bindStep3$lambda$2;
            case 1:
                steps$lambda$3$lambda$0 = CheckoutTotalViewHolder.steps$lambda$3$lambda$0((CheckoutTotalViewHolder) this.f56866b);
                return steps$lambda$3$lambda$0;
            case 2:
                bindSteps$lambda$6 = TravelRailwaySearchResultsV3MultiFrameBindDelegate.bindSteps$lambda$6((TravelRailwaySearchResultsV3MultiFrameBindDelegate) this.f56866b);
                return bindSteps$lambda$6;
            default:
                bindStep2$lambda$1 = Srv2GridMultiFrameBindStrategy.bindStep2$lambda$1((Srv2GridMultiFrameBindStrategy) this.f56866b);
                return bindStep2$lambda$1;
        }
    }
}
