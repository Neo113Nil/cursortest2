package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel;

import io.reactivex.C;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.AviaSearchResultV3DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$pollFlights$1 extends AbstractC7737t implements Function1<Unit, C<? extends ActionV2Response<AviaSearchResultV3DTO>>> {
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$pollFlights$1(AviaSearchResultViewModel aviaSearchResultViewModel) {
        super(1);
        this.this$0 = aviaSearchResultViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends ActionV2Response<AviaSearchResultV3DTO>> invoke(Unit it) {
        AviaSearchResultVO aviaSearchResultVO;
        AviaSearchResultVO aviaSearchResultVO2;
        ActionV2Repository actionV2Repository;
        Intrinsics.checkNotNullParameter(it, "it");
        aviaSearchResultVO = this.this$0.lastVo;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        String link = aviaSearchResultVO.getPollingAction().getLink();
        if (link == null) {
            link = "";
        }
        aviaSearchResultVO2 = this.this$0.lastVo;
        if (aviaSearchResultVO2 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        Map<String, String> params = aviaSearchResultVO2.getPollingAction().getParams();
        if (params == null) {
            params = U.c();
        }
        actionV2Repository = this.this$0.actionRepository;
        return actionV2Repository.callAction(new ActionV2Request(params, link, true), AviaSearchResultV3DTO.class);
    }
}
