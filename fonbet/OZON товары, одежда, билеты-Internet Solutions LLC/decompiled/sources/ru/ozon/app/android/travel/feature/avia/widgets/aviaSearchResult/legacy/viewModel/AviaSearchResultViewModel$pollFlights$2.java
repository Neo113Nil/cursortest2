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

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "kotlin.jvm.PlatformType", "dto", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$pollFlights$2 extends AbstractC7737t implements Function1<ActionV2Response<AviaSearchResultV3DTO>, AviaSearchResultVO> {
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$pollFlights$2(AviaSearchResultViewModel aviaSearchResultViewModel) {
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
            aviaSearchResultVO2 = this.this$0.lastVo;
            if (aviaSearchResultVO2 == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(aviaSearchResultVO2.getId()), null, 2, null);
        } else {
            tVar = null;
        }
        singleLiveEvent.postValue(new AviaSearchResultViewModel.TrackingData(tVar, dto.getTrackingPayloads()));
        aviaSearchResultV3Mapper = this.this$0.mapperV3;
        aviaSearchResultVO = this.this$0.lastVo;
        if (aviaSearchResultVO != null) {
            return AviaSearchResultV3Mapper.mapSearchResult$default(aviaSearchResultV3Mapper, aviaSearchResultV3DTO, aviaSearchResultVO.getStateId(), 0, 4, null);
        }
        Intrinsics.n("lastVo");
        throw null;
    }
}
