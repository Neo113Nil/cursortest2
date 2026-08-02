package ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.data;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.data.ToursDetailsAccordionDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.presentation.ToursDetailsAccordionVI;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI;", "toVI", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI;", "tours_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursDetailsAccordionMapperKt {
    @NotNull
    public static final ToursDetailsAccordionVI toVI(@NotNull ToursDetailsAccordionDTO toursDetailsAccordionDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(toursDetailsAccordionDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = toursDetailsAccordionDTO.getTitle();
        IconDTO icon = toursDetailsAccordionDTO.getIcon();
        CellDTO cell = toursDetailsAccordionDTO.getContent().getCell();
        List<BadgeDTO> badges = toursDetailsAccordionDTO.getContent().getBadges();
        if (badges == null) {
            badges = K.f71697a;
        }
        List<BadgeDTO> badges2 = toursDetailsAccordionDTO.getContent().getBadges();
        boolean z11 = !(badges2 == null || badges2.isEmpty());
        ToursDetailsAccordionDTO.CellBlock cellBlock = toursDetailsAccordionDTO.getContent().getCellBlock();
        ToursDetailsAccordionVI.ContentVO contentVO = new ToursDetailsAccordionVI.ContentVO(cell, badges, z11, cellBlock != null ? new ToursDetailsAccordionVI.CellBlockVO(cellBlock.getTitle(), cellBlock.getCells(), cellBlock.getCornerRadius(), cellBlock.getBackgroundColor()) : null);
        Map<String, TokenizedTrackingInfo> trackingInfo = toursDetailsAccordionDTO.getTrackingInfo();
        return new ToursDetailsAccordionVI(hashCode, title, icon, contentVO, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }
}
