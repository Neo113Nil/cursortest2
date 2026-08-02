package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaSearchResultFragment$onComposerCreated$5$2 extends C7735q implements Function2<AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem, Integer, Unit> {
    AviaSearchResultFragment$onComposerCreated$5$2(Object obj) {
        super(2, obj, AviaSearchResultViewModel.class, "onDropDownBannerClicked", "onDropDownBannerClicked(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem dropDownBannerItem, Integer num) {
        invoke(dropDownBannerItem, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem p02, int i11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AviaSearchResultViewModel) this.receiver).onDropDownBannerClicked(p02, i11);
    }
}
