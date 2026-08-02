package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.data.TravelScrollPriceCalendarMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.data.TravelScrollPriceCalendarResponse;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarVO;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO$DateTabVO;", "kotlin.jvm.PlatformType", "response", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelScrollPriceCalendarViewModel$performApiAction$1 extends AbstractC7737t implements Function1<ActionV2Response<TravelScrollPriceCalendarResponse>, List<? extends TravelScrollPriceCalendarVO.DateTabVO>> {
    final /* synthetic */ TravelScrollPriceCalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelScrollPriceCalendarViewModel$performApiAction$1(TravelScrollPriceCalendarViewModel travelScrollPriceCalendarViewModel) {
        super(1);
        this.this$0 = travelScrollPriceCalendarViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<TravelScrollPriceCalendarVO.DateTabVO> invoke(ActionV2Response<TravelScrollPriceCalendarResponse> response) {
        TravelScrollPriceCalendarMapper travelScrollPriceCalendarMapper;
        Intrinsics.checkNotNullParameter(response, "response");
        ActionV2ExtensionsKt.ensureSuccessful(response);
        TravelScrollPriceCalendarResponse data = response.getData();
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        travelScrollPriceCalendarMapper = this.this$0.mapper;
        return travelScrollPriceCalendarMapper.mapTravelScrollPriceCalendarResponse(data);
    }
}
