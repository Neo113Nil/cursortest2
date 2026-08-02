package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1$startupArgsService$2 extends AbstractC7737t implements Function0<StartupArgsService> {
    final /* synthetic */ OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1$startupArgsService$2(OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1 orderDoneDisclaimerWidgetComponentV2$Companion$create$1$1) {
        super(0);
        this.this$0 = orderDoneDisclaimerWidgetComponentV2$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StartupArgsService invoke() {
        StorageComponentApi storageComponentApi;
        storageComponentApi = this.this$0.storageComponentApi;
        return storageComponentApi.getStartupArgsService();
    }
}
