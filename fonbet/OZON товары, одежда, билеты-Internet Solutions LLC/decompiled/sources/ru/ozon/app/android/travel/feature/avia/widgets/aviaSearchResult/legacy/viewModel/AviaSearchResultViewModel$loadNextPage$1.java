package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.AviaSearchResultV3DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchResultV3Mapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "dto", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$loadNextPage$1 extends AbstractC7737t implements Function1<ActionV2Response<AviaSearchResultV3DTO>, AviaSearchResultVO> {
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$loadNextPage$1(AviaSearchResultViewModel aviaSearchResultViewModel) {
        super(1);
        this.this$0 = aviaSearchResultViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AviaSearchResultVO invoke(ActionV2Response<AviaSearchResultV3DTO> dto) {
        SingleLiveEvent singleLiveEvent;
        t tVar;
        AviaSearchResultV3Mapper aviaSearchResultV3Mapper;
        AviaSearchResultVO aviaSearchResultVO;
        AviaSearchResultVO aviaSearchResultVO2;
        AviaSearchResultVO aviaSearchResultVO3;
        Intrinsics.checkNotNullParameter(dto, "dto");
        ActionV2ExtensionsKt.ensureSuccessful(dto);
        AviaSearchResultV3DTO data = dto.getData();
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AviaSearchResultV3DTO aviaSearchResultV3DTO = data;
        singleLiveEvent = this.this$0.trackingLiveData;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        if (trackingInfo != null) {
            aviaSearchResultVO3 = this.this$0.lastVo;
            if (aviaSearchResultVO3 == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(aviaSearchResultVO3.getId()), null, 2, null);
        } else {
            tVar = null;
        }
        singleLiveEvent.postValue(new AviaSearchResultViewModel.TrackingData(tVar, dto.getTrackingPayloads()));
        aviaSearchResultV3Mapper = this.this$0.mapperV3;
        aviaSearchResultVO = this.this$0.lastVo;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        String stateId = aviaSearchResultVO.getStateId();
        aviaSearchResultVO2 = this.this$0.lastVo;
        if (aviaSearchResultVO2 != null) {
            return aviaSearchResultV3Mapper.mapSearchResult(aviaSearchResultV3DTO, stateId, aviaSearchResultVO2.getResultItems().size());
        }
        Intrinsics.n("lastVo");
        throw null;
    }
}
