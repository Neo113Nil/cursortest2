package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightItem;", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2WidgetViewHolder$bind$4 extends AbstractC7737t implements Function1<AdditionalLuggageV2VO.FlightItem, AdditionalLuggageV2VO.FlightItem> {
    final /* synthetic */ AdditionalLuggageV2VO $item;
    final /* synthetic */ Object $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2WidgetViewHolder$bind$4(AdditionalLuggageV2VO additionalLuggageV2VO, Object obj) {
        super(1);
        this.$item = additionalLuggageV2VO;
        this.$payload = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AdditionalLuggageV2VO.FlightItem invoke(AdditionalLuggageV2VO.FlightItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$item.getContent().getFlights().get(((AdditionalLuggageV2OptionSelectionPayload) this.$payload).getPassengerPosition());
    }
}
