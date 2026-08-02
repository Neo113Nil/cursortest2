package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.data.ToursLoaderApi;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/data/ToursLoaderApi;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/data/ToursLoaderApi;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursLoaderComponent$Companion$create$1$1$toursLoaderApi$2 extends AbstractC7737t implements Function0<ToursLoaderApi> {
    final /* synthetic */ ToursLoaderComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursLoaderComponent$Companion$create$1$1$toursLoaderApi$2(ToursLoaderComponent$Companion$create$1$1 toursLoaderComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = toursLoaderComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ToursLoaderApi invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        return (ToursLoaderApi) networkComponentApi.getRetrofit().create(ToursLoaderApi.class);
    }
}
