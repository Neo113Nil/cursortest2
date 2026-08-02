package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PricesHistogramViewModel$onFindTicketsClicked$4 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ PricesHistogramViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramViewModel$onFindTicketsClicked$4(PricesHistogramViewModel pricesHistogramViewModel) {
        super(1);
        this.this$0 = pricesHistogramViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        SingleLiveEvent<PricesHistogramViewModel.Action> actionLiveData = this.this$0.getActionLiveData();
        Intrinsics.f(atomAction);
        actionLiveData.setValue(new PricesHistogramViewModel.Action.Success(atomAction));
    }
}
