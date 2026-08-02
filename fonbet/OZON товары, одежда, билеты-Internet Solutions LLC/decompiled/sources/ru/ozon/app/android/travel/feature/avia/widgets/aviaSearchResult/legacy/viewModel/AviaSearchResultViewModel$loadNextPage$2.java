package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel;

import androidx.lifecycle.V;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "vo", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$loadNextPage$2 extends AbstractC7737t implements Function1<AviaSearchResultVO, Unit> {
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$loadNextPage$2(AviaSearchResultViewModel aviaSearchResultViewModel) {
        super(1);
        this.this$0 = aviaSearchResultViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AviaSearchResultVO aviaSearchResultVO) {
        invoke2(aviaSearchResultVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AviaSearchResultVO vo) {
        AviaSearchResultVO aviaSearchResultVO;
        AviaSearchResultVO aviaSearchResultVO2;
        List applyBonusPayState;
        AviaSearchResultVO aviaSearchResultVO3;
        SingleLiveEvent singleLiveEvent;
        AviaSearchResultVO aviaSearchResultVO4;
        boolean z11;
        V v11;
        Intrinsics.checkNotNullParameter(vo, "vo");
        aviaSearchResultVO = this.this$0.lastVo;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        List<AviaSearchResultVO.AviaSearchResultItemVO> resultItems = aviaSearchResultVO.getResultItems();
        AviaSearchResultViewModel aviaSearchResultViewModel = this.this$0;
        List<AviaSearchResultVO.AviaSearchResultItemVO> resultItems2 = vo.getResultItems();
        aviaSearchResultVO2 = this.this$0.lastVo;
        if (aviaSearchResultVO2 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        applyBonusPayState = aviaSearchResultViewModel.applyBonusPayState(resultItems2, aviaSearchResultVO2.getIsBonusPay());
        List c11 = U.c(C7714v.p0(applyBonusPayState, resultItems));
        this.this$0.isLoadingNextPage = false;
        this.this$0.isPaginationCompleted = vo.getResultItems().isEmpty();
        AviaSearchResultViewModel aviaSearchResultViewModel2 = this.this$0;
        aviaSearchResultVO3 = aviaSearchResultViewModel2.lastVo;
        if (aviaSearchResultVO3 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        aviaSearchResultViewModel2.lastVo = AviaSearchResultVO.copy$default(aviaSearchResultVO3, 0L, null, c11, null, null, null, null, vo.getLazyLoadAction(), false, false, false, 1915, null);
        singleLiveEvent = this.this$0.updateVoLiveData;
        aviaSearchResultVO4 = this.this$0.lastVo;
        if (aviaSearchResultVO4 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        singleLiveEvent.setValue(new AviaSearchResultViewModel.UpdateVoResult(aviaSearchResultVO4, false));
        z11 = this.this$0.isPaginationCompleted;
        if (z11) {
            return;
        }
        v11 = this.this$0.resultLiveData;
        v11.setValue(new AviaSearchResultViewModel.Result(c11, null, 2, null));
    }
}
