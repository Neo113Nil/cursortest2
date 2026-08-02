package ru.ozon.app.android.account.orders.commonBarcodeV2;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.orders.commonBarcodeV2.data.CommonBarcodeV2Mapper;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CommonBarcodeV2Component$Companion$create$1$mapper$2 extends AbstractC7737t implements Function0<CommonBarcodeV2Mapper> {
    final /* synthetic */ C7475g $storage;
    final /* synthetic */ CommonBarcodeV2Component$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeV2Component$Companion$create$1$mapper$2(CommonBarcodeV2Component$Companion$create$1 commonBarcodeV2Component$Companion$create$1, C7475g c7475g) {
        super(0);
        this.this$0 = commonBarcodeV2Component$Companion$create$1;
        this.$storage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CommonBarcodeV2Mapper invoke() {
        return new CommonBarcodeV2Mapper(this.this$0.getAppType(), ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getFeatureChecker());
    }
}
