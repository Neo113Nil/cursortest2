package ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonCompletableApi;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DisposableBannerComponent$Companion$create$1$1$completableApi$2 extends AbstractC7737t implements Function0<TravelCommonCompletableApi> {
    final /* synthetic */ DisposableBannerComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisposableBannerComponent$Companion$create$1$1$completableApi$2(DisposableBannerComponent$Companion$create$1$1 disposableBannerComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = disposableBannerComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TravelCommonCompletableApi invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkApi;
        return (TravelCommonCompletableApi) networkComponentApi.getRetrofit().create(TravelCommonCompletableApi.class);
    }
}
