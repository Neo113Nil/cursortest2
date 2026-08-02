package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel;

import androidx.lifecycle.V;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "vo", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$pollFlights$6 extends AbstractC7737t implements Function1<AviaSearchResultVO, Unit> {
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$pollFlights$6(AviaSearchResultViewModel aviaSearchResultViewModel) {
        super(1);
        this.this$0 = aviaSearchResultViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AviaSearchResultVO aviaSearchResultVO) {
        invoke2(aviaSearchResultVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AviaSearchResultVO aviaSearchResultVO) {
        AviaSearchResultVO aviaSearchResultVO2;
        SingleLiveEvent singleLiveEvent;
        AviaSearchResultVO aviaSearchResultVO3;
        V v11;
        if (aviaSearchResultVO != null) {
            AviaSearchResultViewModel aviaSearchResultViewModel = this.this$0;
            List<AviaSearchResultVO.AviaSearchResultItemVO> resultItems = aviaSearchResultVO.getResultItems();
            aviaSearchResultVO2 = aviaSearchResultViewModel.lastVo;
            if (aviaSearchResultVO2 == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            aviaSearchResultViewModel.lastVo = AviaSearchResultVO.copy$default(aviaSearchResultVO2, 0L, null, resultItems, null, null, null, aviaSearchResultVO.getPollingAction(), aviaSearchResultVO.getLazyLoadAction(), aviaSearchResultVO.getIsAllDone(), false, false, 1595, null);
            if (aviaSearchResultVO.getIsAllDone() || !resultItems.isEmpty()) {
                singleLiveEvent = aviaSearchResultViewModel.updateVoLiveData;
                aviaSearchResultVO3 = aviaSearchResultViewModel.lastVo;
                if (aviaSearchResultVO3 == null) {
                    Intrinsics.n("lastVo");
                    throw null;
                }
                singleLiveEvent.setValue(new AviaSearchResultViewModel.UpdateVoResult(aviaSearchResultVO3, aviaSearchResultVO.getIsAllDone()));
                v11 = aviaSearchResultViewModel.resultLiveData;
                v11.setValue(new AviaSearchResultViewModel.Result(resultItems, new AviaSearchResultViewModel$pollFlights$6$1$1(aviaSearchResultViewModel)));
            }
            if (aviaSearchResultVO.getIsAllDone()) {
                aviaSearchResultViewModel.hideQuickFiltersSkeleton();
                aviaSearchResultViewModel.hideProgressBar();
            }
        }
    }
}
