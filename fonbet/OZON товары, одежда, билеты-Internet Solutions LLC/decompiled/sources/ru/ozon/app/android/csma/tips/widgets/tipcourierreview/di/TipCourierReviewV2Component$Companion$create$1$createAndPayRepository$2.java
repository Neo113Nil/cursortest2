package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TipCourierReviewV2Component$Companion$create$1$createAndPayRepository$2 extends AbstractC7737t implements Function0<CreateAndPayRepository> {
    final /* synthetic */ TipCourierReviewV2Component$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TipCourierReviewV2Component$Companion$create$1$createAndPayRepository$2(TipCourierReviewV2Component$Companion$create$1 tipCourierReviewV2Component$Companion$create$1) {
        super(0);
        this.this$0 = tipCourierReviewV2Component$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CreateAndPayRepository invoke() {
        ActionComponentApi actionComponentApi;
        actionComponentApi = this.this$0.actionComponentApi;
        return new CreateAndPayRepository(actionComponentApi.getActionRepository());
    }
}
