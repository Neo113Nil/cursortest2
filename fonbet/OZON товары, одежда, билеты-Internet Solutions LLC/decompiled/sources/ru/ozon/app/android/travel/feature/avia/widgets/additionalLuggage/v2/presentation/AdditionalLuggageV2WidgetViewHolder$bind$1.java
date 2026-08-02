package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$PassengerTabVO;", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2WidgetViewHolder$bind$1 extends AbstractC7737t implements Function1<AdditionalLuggageV2VO.PassengerTabVO, AdditionalLuggageV2VO.PassengerTabVO> {
    final /* synthetic */ Object $payload;
    final /* synthetic */ List<AdditionalLuggageV2VO.PassengerTabVO> $tabs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2WidgetViewHolder$bind$1(List<AdditionalLuggageV2VO.PassengerTabVO> list, Object obj) {
        super(1);
        this.$tabs = list;
        this.$payload = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AdditionalLuggageV2VO.PassengerTabVO invoke(AdditionalLuggageV2VO.PassengerTabVO it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$tabs.get(((AdditionalLuggageV2TabSelectionPayload) this.$payload).getOldPosition());
    }
}
