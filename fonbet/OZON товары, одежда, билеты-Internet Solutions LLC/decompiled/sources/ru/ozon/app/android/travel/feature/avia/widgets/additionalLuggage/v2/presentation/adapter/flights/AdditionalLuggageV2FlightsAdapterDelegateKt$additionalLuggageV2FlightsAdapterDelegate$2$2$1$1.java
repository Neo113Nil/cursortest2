package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$2$1$1 extends AbstractC7737t implements Function1<AdditionalLuggageV2VO.LuggageItem, AdditionalLuggageV2VO.LuggageItem> {
    final /* synthetic */ AdditionalLuggageV2VO.LuggageItem $luggageItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$2$1$1(AdditionalLuggageV2VO.LuggageItem luggageItem) {
        super(1);
        this.$luggageItem = luggageItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AdditionalLuggageV2VO.LuggageItem invoke(AdditionalLuggageV2VO.LuggageItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$luggageItem;
    }
}
