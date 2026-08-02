package ru.ozon.app.android.rfbs.deliverycomplain.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/csma/api/ComposerActionApi;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/csma/api/ComposerActionApi;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryComplainWidgetComponent$Companion$create$1$composerActionApi$2 extends AbstractC7737t implements Function0<ComposerActionApi> {
    final /* synthetic */ DeliveryComplainWidgetComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryComplainWidgetComponent$Companion$create$1$composerActionApi$2(DeliveryComplainWidgetComponent$Companion$create$1 deliveryComplainWidgetComponent$Companion$create$1) {
        super(0);
        this.this$0 = deliveryComplainWidgetComponent$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ComposerActionApi invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        return (ComposerActionApi) networkComponentApi.getRetrofit().create(ComposerActionApi.class);
    }
}
