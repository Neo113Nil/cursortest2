package ru.ozon.app.android.orderdetails.timeLeft.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TimeLeftWidgetViewHolder$onAction$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ TimeLeftWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeLeftWidgetViewHolder$onAction$1(TimeLeftWidgetViewHolder timeLeftWidgetViewHolder) {
        super(1);
        this.this$0 = timeLeftWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        CreateAndPayViewModel createAndPayViewModel;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(action, "action");
        createAndPayViewModel = this.this$0.createAndPayViewModel;
        String link = action.getLink();
        if (link == null || (params = action.getParams()) == null) {
            return;
        }
        createAndPayViewModel.pay(link, params, this.this$0.getTrackingData());
    }
}
