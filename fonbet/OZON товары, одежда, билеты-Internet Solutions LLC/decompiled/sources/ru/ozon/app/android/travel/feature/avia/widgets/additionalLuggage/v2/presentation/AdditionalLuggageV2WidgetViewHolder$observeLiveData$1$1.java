package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2ViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$1 extends C7735q implements Function1<AdditionalLuggageV2ViewModel.UpdateTabBorder, Unit> {
    AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$1(Object obj) {
        super(1, obj, AdditionalLuggageV2WidgetViewHolder.class, "updateTabBorder", "updateTabBorder(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateTabBorder;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdditionalLuggageV2ViewModel.UpdateTabBorder updateTabBorder) {
        invoke2(updateTabBorder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdditionalLuggageV2ViewModel.UpdateTabBorder p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AdditionalLuggageV2WidgetViewHolder) this.receiver).updateTabBorder(p02);
    }
}
