package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryGroupComponent$Companion$create$1$postRefreshHandlerFactory$2 extends AbstractC7737t implements Function0<PostRefreshHandlerFactory> {
    final /* synthetic */ DeliveryGroupComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryGroupComponent$Companion$create$1$postRefreshHandlerFactory$2(DeliveryGroupComponent$Companion$create$1 deliveryGroupComponent$Companion$create$1) {
        super(0);
        this.this$0 = deliveryGroupComponent$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PostRefreshHandlerFactory invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        return new PostRefreshHandlerFactory(networkComponentApi.getJsonDeserializer());
    }
}
