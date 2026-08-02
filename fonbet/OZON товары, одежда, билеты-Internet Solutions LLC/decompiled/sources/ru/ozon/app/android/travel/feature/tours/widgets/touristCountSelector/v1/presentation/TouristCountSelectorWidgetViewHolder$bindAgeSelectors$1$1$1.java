package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation;

import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class TouristCountSelectorWidgetViewHolder$bindAgeSelectors$1$1$1 extends C7735q implements InterfaceC6511n<TouristCountSelectorVO.AgeSelectorVO, List<? extends String>, Function1<? super String, ? extends Unit>, Unit> {
    TouristCountSelectorWidgetViewHolder$bindAgeSelectors$1$1$1(Object obj) {
        super(3, obj, TouristCountSelectorViewModel.class, "onSelectorClicked", "onSelectorClicked(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(TouristCountSelectorVO.AgeSelectorVO ageSelectorVO, List<? extends String> list, Function1<? super String, ? extends Unit> function1) {
        invoke2(ageSelectorVO, (List<String>) list, (Function1<? super String, Unit>) function1);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TouristCountSelectorVO.AgeSelectorVO p02, List<String> p12, Function1<? super String, Unit> p22) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        ((TouristCountSelectorViewModel) this.receiver).onSelectorClicked(p02, p12, p22);
    }
}
