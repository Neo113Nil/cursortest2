package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/data/AviaCheckTariffsPriceDetailsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/data/AviaCheckTariffsPriceDetailsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/data/AviaCheckTariffsPriceDetailsDTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsPriceDetailsMapper implements Function2<AviaCheckTariffsPriceDetailsDTO, d, List<? extends AviaCheckTariffsPriceDetailsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AviaCheckTariffsPriceDetailsVO> invoke(@NotNull AviaCheckTariffsPriceDetailsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ButtonV3DTO continueButton = state.getContinueButton();
        ButtonV3DTO scrollToWidgetButton = state.getScrollToWidgetButton();
        CellDTO luggage = state.getLuggage();
        TextDTO priceDescription = state.getPriceDescription();
        Map<String, TokenizedTrackingInfo> viewTracking = state.getViewTracking();
        return C7714v.a0(new AviaCheckTariffsPriceDetailsVO(hashCode, continueButton, scrollToWidgetButton, luggage, priceDescription, viewTracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(viewTracking, Long.valueOf(hashCode), null, 2, null) : null, state.getShouldAnimateLuggageAppearance(), state.getScrollToWidgetButton() == null));
    }
}
