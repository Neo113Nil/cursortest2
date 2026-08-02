package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2Api;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2Api;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2Api;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2Component$Companion$create$1$1$additionalLuggageV2Api$2 extends AbstractC7737t implements Function0<AdditionalLuggageV2Api> {
    final /* synthetic */ AdditionalLuggageV2Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2Component$Companion$create$1$1$additionalLuggageV2Api$2(AdditionalLuggageV2Component$Companion$create$1$1 additionalLuggageV2Component$Companion$create$1$1) {
        super(0);
        this.this$0 = additionalLuggageV2Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdditionalLuggageV2Api invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        return (AdditionalLuggageV2Api) networkComponentApi.getRetrofit().create(AdditionalLuggageV2Api.class);
    }
}
