package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterDTO;Ll20/d;)Ljava/util/List;", "dto", "", "widgetId", "mapFooter", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterDTO;J)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarFooterMapper implements Function2<PriceCalendarFooterDTO, d, List<? extends PriceCalendarFooterVO>> {
    @NotNull
    public final PriceCalendarFooterVO mapFooter(@NotNull PriceCalendarFooterDTO dto, long widgetId) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        TextAtom informer = dto.getInformer();
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> toggles = dto.getToggles();
        ButtonV3Atom.SmallIconButton resetButton = dto.getResetButton();
        ButtonV3Atom.LargeButton confirmButton = dto.getConfirmButton();
        AtomActionDTO updateWidgetState = dto.getUpdateWidgetState();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return new PriceCalendarFooterVO(widgetId, informer, toggles, resetButton, confirmButton, updateWidgetState, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PriceCalendarFooterVO> invoke(@NotNull PriceCalendarFooterDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapFooter(state, widgetInfo.d().hashCode()));
    }
}
