package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AdditionalLuggageV2WidgetViewHolder$flightsAdapter$1 extends C7735q implements Function2<Integer, AdditionalLuggageV2VO.LuggageOptionItem, Unit> {
    AdditionalLuggageV2WidgetViewHolder$flightsAdapter$1(Object obj) {
        super(2, obj, AdditionalLuggageV2ViewModel.class, "onLuggageOptionSelected", "onLuggageOptionSelected(ILru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, AdditionalLuggageV2VO.LuggageOptionItem luggageOptionItem) {
        invoke(num.intValue(), luggageOptionItem);
        return Unit.f71690a;
    }

    public final void invoke(int i11, AdditionalLuggageV2VO.LuggageOptionItem p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((AdditionalLuggageV2ViewModel) this.receiver).onLuggageOptionSelected(i11, p12);
    }
}
