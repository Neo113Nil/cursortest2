package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.di;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "invoke", "()LWZ/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class OrderDoneTotalWidgetComponent$Companion$create$1$tokenizedAnalytics$2 extends AbstractC7737t implements Function0<l> {
    final /* synthetic */ OrderDoneTotalWidgetComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDoneTotalWidgetComponent$Companion$create$1$tokenizedAnalytics$2(OrderDoneTotalWidgetComponent$Companion$create$1 orderDoneTotalWidgetComponent$Companion$create$1) {
        super(0);
        this.this$0 = orderDoneTotalWidgetComponent$Companion$create$1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final l invoke() {
        RetainComposerComponentApi retainComposerComponentApi;
        retainComposerComponentApi = this.this$0.retainComposerComponentApi;
        return retainComposerComponentApi.getTokenizedAnalytics();
    }
}
