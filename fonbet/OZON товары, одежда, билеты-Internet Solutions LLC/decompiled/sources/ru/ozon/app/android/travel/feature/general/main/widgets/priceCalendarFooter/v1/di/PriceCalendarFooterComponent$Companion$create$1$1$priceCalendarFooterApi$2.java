package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterApi;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterApi;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterApi;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceCalendarFooterComponent$Companion$create$1$1$priceCalendarFooterApi$2 extends AbstractC7737t implements Function0<PriceCalendarFooterApi> {
    final /* synthetic */ PriceCalendarFooterComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCalendarFooterComponent$Companion$create$1$1$priceCalendarFooterApi$2(PriceCalendarFooterComponent$Companion$create$1$1 priceCalendarFooterComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = priceCalendarFooterComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PriceCalendarFooterApi invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        return (PriceCalendarFooterApi) networkComponentApi.getRetrofit().create(PriceCalendarFooterApi.class);
    }
}
