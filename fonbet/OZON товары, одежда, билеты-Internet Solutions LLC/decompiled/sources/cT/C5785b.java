package cT;

import kotlin.Unit;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridMultiFrameBindStrategy;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding.TravelCarriageSelectV3MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3MultiFrameBindDelegate;

/* renamed from: cT.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C5785b implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56864b;

    public /* synthetic */ C5785b(Object obj, int i11) {
        this.f56863a = i11;
        this.f56864b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindStep2$lambda$1;
        Unit bindSteps$lambda$5;
        Unit bindStep1$lambda$0;
        switch (this.f56863a) {
            case 0:
                bindStep2$lambda$1 = TravelCarriageSelectV3MultiFrameBindDelegate.bindStep2$lambda$1((TravelCarriageSelectV3MultiFrameBindDelegate) this.f56864b);
                return bindStep2$lambda$1;
            case 1:
                bindSteps$lambda$5 = TravelRailwaySearchResultsV3MultiFrameBindDelegate.bindSteps$lambda$5((TravelRailwaySearchResultsV3MultiFrameBindDelegate) this.f56864b);
                return bindSteps$lambda$5;
            default:
                bindStep1$lambda$0 = Srv2GridMultiFrameBindStrategy.bindStep1$lambda$0((Srv2GridMultiFrameBindStrategy) this.f56864b);
                return bindStep1$lambda$0;
        }
    }
}
