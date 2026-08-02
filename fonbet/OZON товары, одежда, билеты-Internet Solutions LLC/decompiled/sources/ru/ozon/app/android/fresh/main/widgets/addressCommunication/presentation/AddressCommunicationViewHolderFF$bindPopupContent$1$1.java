package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressCommunicationViewHolderFF$bindPopupContent$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ AddressCommunicationVO $item;
    final /* synthetic */ AddressCommunicationViewHolderFF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCommunicationViewHolderFF$bindPopupContent$1$1(AddressCommunicationViewHolderFF addressCommunicationViewHolderFF, AddressCommunicationVO addressCommunicationVO) {
        super(1);
        this.this$0 = addressCommunicationViewHolderFF;
        this.$item = addressCommunicationVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        Function1 function1;
        l lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        function1 = this.this$0.actionHandler;
        function1.invoke(it);
        t noButtonTokenizedEvent = this.$item.getNoButtonTokenizedEvent();
        if (noButtonTokenizedEvent != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, noButtonTokenizedEvent, null, 2, null);
        }
    }
}
