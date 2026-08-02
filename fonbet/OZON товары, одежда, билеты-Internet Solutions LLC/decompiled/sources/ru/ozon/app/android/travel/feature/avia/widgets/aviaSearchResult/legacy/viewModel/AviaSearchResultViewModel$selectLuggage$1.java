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
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchResultV3Mapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchV3SelectLuggageResponse;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;", "kotlin.jvm.PlatformType", "dto", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchV3SelectLuggageResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$selectLuggage$1 extends AbstractC7737t implements Function1<ActionV2Response<AviaSearchV3SelectLuggageResponse>, AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3> {
    final /* synthetic */ AviaSearchResultVO.AviaSearchResultItemVO.Flight $oldItem;
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$selectLuggage$1(AviaSearchResultViewModel aviaSearchResultViewModel, AviaSearchResultVO.AviaSearchResultItemVO.Flight flight) {
        super(1);
        this.this$0 = aviaSearchResultViewModel;
        this.$oldItem = flight;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 invoke(ActionV2Response<AviaSearchV3SelectLuggageResponse> dto) {
        SingleLiveEvent singleLiveEvent;
        AviaSearchResultV3Mapper aviaSearchResultV3Mapper;
        AviaSearchResultVO aviaSearchResultVO;
        Intrinsics.checkNotNullParameter(dto, "dto");
        ActionV2ExtensionsKt.ensureSuccessful(dto);
        AviaSearchV3SelectLuggageResponse data = dto.getData();
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AviaSearchV3SelectLuggageResponse aviaSearchV3SelectLuggageResponse = data;
        singleLiveEvent = this.this$0.trackingLiveData;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        t tVar = null;
        if (trackingInfo != null) {
            aviaSearchResultVO = this.this$0.lastVo;
            if (aviaSearchResultVO == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(aviaSearchResultVO.getId()), null, 2, null);
        }
        singleLiveEvent.postValue(new AviaSearchResultViewModel.TrackingData(tVar, dto.getTrackingPayloads()));
        AviaSearchResultViewModel aviaSearchResultViewModel = this.this$0;
        AviaSearchResultVO.AviaSearchResultItemVO.Flight flight = this.$oldItem;
        aviaSearchResultV3Mapper = aviaSearchResultViewModel.mapperV3;
        Intrinsics.g(flight, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3");
        return aviaSearchResultV3Mapper.updateFlightItem((AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3) flight, aviaSearchV3SelectLuggageResponse.getLuggageTabs(), aviaSearchV3SelectLuggageResponse.getPremiumBadge(), aviaSearchV3SelectLuggageResponse.getBonusPremiumBadge(), aviaSearchV3SelectLuggageResponse.getSimplePrice(), aviaSearchV3SelectLuggageResponse.getBonusPrice(), aviaSearchV3SelectLuggageResponse.getSmallButton(), aviaSearchV3SelectLuggageResponse.getBonusSmallButton(), aviaSearchV3SelectLuggageResponse.getCardClickAction(), aviaSearchV3SelectLuggageResponse.getBonusCardClickAction(), aviaSearchV3SelectLuggageResponse.getCardClickTrackingInfo(), false);
    }
}
