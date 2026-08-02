package ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation.TravelSearchSortAndFilterVO;
import ru.ozon.app.android.travel.molecules.dto.travelButtonWithIcon.TravelButtonWithIconDTO;
import ru.ozon.app.android.travel.molecules.dto.travelFiltersButton.TravelFiltersButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.travelSorting.TravelSortingDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.travelButtonWithIcon.TravelButtonWithIconVO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.app.android.travel.molecules.view.travelSorting.TravelSortingVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/data/TravelSearchSortAndFilterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/data/TravelSearchSortAndFilterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/data/TravelSearchSortAndFilterDTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelSearchSortAndFilterMapper implements Function2<TravelSearchSortAndFilterDTO, d, List<? extends TravelSearchSortAndFilterVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelSearchSortAndFilterVO> invoke(@NotNull TravelSearchSortAndFilterDTO state, @NotNull d widgetInfo) {
        boolean z11;
        TravelButtonWithIconVO travelButtonWithIconVO;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TravelSortingDTO sorting = state.getSorting();
        TravelSortingVO vo = sorting != null ? MapperExtKt.toVO(sorting, Long.valueOf(hashCode)) : null;
        boolean z12 = false;
        if (state.getSorting() != null) {
            z11 = false;
            z12 = true;
        } else {
            z11 = false;
        }
        TravelButtonWithIconDTO priceCalendarText = state.getPriceCalendarText();
        if (priceCalendarText != null) {
            TextAtomWithIcon buttonText = priceCalendarText.getButtonText();
            AtomActionDTO action = priceCalendarText.getAction();
            travelButtonWithIconVO = new TravelButtonWithIconVO(buttonText, action != null ? AtomActionMapperKt.toAtomAction(action, priceCalendarText.getTrackingInfo()) : null);
        } else {
            travelButtonWithIconVO = null;
        }
        boolean z13 = state.getTravelFiltersButton() != null ? true : z11;
        TravelFiltersButtonDTO travelFiltersButton = state.getTravelFiltersButton();
        TravelFiltersButtonVO vo2 = travelFiltersButton != null ? MapperExtKt.toVO(travelFiltersButton, Long.valueOf(hashCode)) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new TravelSearchSortAndFilterVO(hashCode, vo, z12, travelButtonWithIconVO, z13, vo2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
