package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter;

import Tl.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter.SectionsAdapter;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.PaymentVO;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SectionsAdapter$ItemViewHolder$buttonsAdapter$1$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ SectionsAdapter.ItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionsAdapter$ItemViewHolder$buttonsAdapter$1$2(SectionsAdapter.ItemViewHolder itemViewHolder) {
        super(1);
        this.this$0 = itemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click click) {
        PaymentVO paymentVO;
        CreateAndPayViewModel createAndPayViewModel;
        k kVar;
        if (b.i(click, "action", "paymentInfo")) {
            paymentVO = this.this$0.paymentInfo;
            if (paymentVO == null) {
                Lm0.a.f17149a.e("paymentInfo was null", new Object[0]);
                return;
            }
            SectionsAdapter.ItemViewHolder itemViewHolder = this.this$0;
            createAndPayViewModel = itemViewHolder.createAndPayViewModel;
            String link = paymentVO.getLink();
            Map<String, String> body = paymentVO.getBody();
            kVar = itemViewHolder.parentVH;
            createAndPayViewModel.pay(link, body, kVar.getTrackingData());
        }
    }
}
