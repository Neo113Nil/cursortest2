package ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.di.NightsRangeSelectorV3Component;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3ViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NightsRangeSelectorV3ViewMapper$createHolder$1 extends AbstractC7737t implements Function0<NightsRangeSelectorV3ViewModel> {
    final /* synthetic */ NightsRangeSelectorV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NightsRangeSelectorV3ViewMapper$createHolder$1(NightsRangeSelectorV3ViewMapper nightsRangeSelectorV3ViewMapper) {
        super(0);
        this.this$0 = nightsRangeSelectorV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NightsRangeSelectorV3ViewModel invoke() {
        NightsRangeSelectorV3Component nightsRangeSelectorV3Component;
        nightsRangeSelectorV3Component = this.this$0.component;
        return nightsRangeSelectorV3Component.getViewModel();
    }
}
