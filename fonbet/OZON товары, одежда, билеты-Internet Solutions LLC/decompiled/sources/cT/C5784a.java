package cT;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding.TravelCarriageSelectV3MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3MultiFrameBindDelegate;

/* renamed from: cT.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C5784a implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56862b;

    public /* synthetic */ C5784a(Object obj, int i11) {
        this.f56861a = i11;
        this.f56862b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindStep1$lambda$0;
        Unit bindSteps$lambda$4;
        Unit steps$lambda$2;
        switch (this.f56861a) {
            case 0:
                bindStep1$lambda$0 = TravelCarriageSelectV3MultiFrameBindDelegate.bindStep1$lambda$0((TravelCarriageSelectV3MultiFrameBindDelegate) this.f56862b);
                return bindStep1$lambda$0;
            case 1:
                bindSteps$lambda$4 = TravelRailwaySearchResultsV3MultiFrameBindDelegate.bindSteps$lambda$4((TravelRailwaySearchResultsV3MultiFrameBindDelegate) this.f56862b);
                return bindSteps$lambda$4;
            default:
                steps$lambda$2 = CartSplitV2ProductWidgetViewHolder.steps$lambda$2((CartSplitV2ProductWidgetViewHolder) this.f56862b);
                return steps$lambda$2;
        }
    }
}
