package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OrderToursChangeFormViewModel$submitForm$4 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ OrderToursChangeFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderToursChangeFormViewModel$submitForm$4(OrderToursChangeFormViewModel orderToursChangeFormViewModel) {
        super(1);
        this.this$0 = orderToursChangeFormViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        SingleLiveEvent singleLiveEvent;
        singleLiveEvent = this.this$0.actionLiveData;
        Intrinsics.f(atomAction);
        singleLiveEvent.setValue(new OrderToursChangeFormViewModel.Action.HandleAction(atomAction));
    }
}
