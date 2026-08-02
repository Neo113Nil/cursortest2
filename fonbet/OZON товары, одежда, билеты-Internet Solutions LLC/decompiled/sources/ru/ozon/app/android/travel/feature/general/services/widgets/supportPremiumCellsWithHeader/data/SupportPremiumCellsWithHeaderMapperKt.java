package ru.ozon.app.android.travel.feature.general.services.widgets.supportPremiumCellsWithHeader.data;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportPremiumCellsWithHeader.data.SupportPremiumCellsWithHeaderDTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportPremiumCellsWithHeader.presentation.SupportPremiumCellsWithHeaderVI;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVI", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/presentation/SupportPremiumCellsWithHeaderVI;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO;", "widgetId", "", "services_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportPremiumCellsWithHeaderMapperKt {
    @NotNull
    public static final SupportPremiumCellsWithHeaderVI toVI(@NotNull SupportPremiumCellsWithHeaderDTO supportPremiumCellsWithHeaderDTO, @NotNull String widgetId) {
        List<CellDTO> list;
        Intrinsics.checkNotNullParameter(supportPremiumCellsWithHeaderDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        long hashCode = widgetId.hashCode();
        String backgroundColor = supportPremiumCellsWithHeaderDTO.getBackgroundColor();
        String backgroundImageApp = supportPremiumCellsWithHeaderDTO.getBackgroundImageApp();
        ImageDTO image = supportPremiumCellsWithHeaderDTO.getImage();
        SupportPremiumCellsWithHeaderDTO.HeaderContentDTO headerContent = supportPremiumCellsWithHeaderDTO.getHeaderContent();
        TextDTO titleLeft = headerContent != null ? headerContent.getTitleLeft() : null;
        SupportPremiumCellsWithHeaderDTO.HeaderContentDTO headerContent2 = supportPremiumCellsWithHeaderDTO.getHeaderContent();
        TextDTO titleMid = headerContent2 != null ? headerContent2.getTitleMid() : null;
        SupportPremiumCellsWithHeaderDTO.HeaderContentDTO headerContent3 = supportPremiumCellsWithHeaderDTO.getHeaderContent();
        ImageDTO titleRight = headerContent3 != null ? headerContent3.getTitleRight() : null;
        SupportPremiumCellsWithHeaderDTO.HeaderContentDTO headerContent4 = supportPremiumCellsWithHeaderDTO.getHeaderContent();
        TextDTO subtitle = headerContent4 != null ? headerContent4.getSubtitle() : null;
        SupportPremiumCellsWithHeaderDTO.HeaderContentDTO headerContent5 = supportPremiumCellsWithHeaderDTO.getHeaderContent();
        BadgeDTO badge = headerContent5 != null ? headerContent5.getBadge() : null;
        SupportPremiumCellsWithHeaderDTO.CellBlockDTO cellBlockDTO = (SupportPremiumCellsWithHeaderDTO.CellBlockDTO) C7714v.M(supportPremiumCellsWithHeaderDTO.getCellBlocks());
        if (cellBlockDTO == null || (list = cellBlockDTO.getCells()) == null) {
            list = K.f71697a;
        }
        SupportPremiumCellsWithHeaderDTO.CellBlockDTO cellBlockDTO2 = (SupportPremiumCellsWithHeaderDTO.CellBlockDTO) C7714v.M(supportPremiumCellsWithHeaderDTO.getCellBlocks());
        String backgroundColor2 = cellBlockDTO2 != null ? cellBlockDTO2.getBackgroundColor() : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = supportPremiumCellsWithHeaderDTO.getTrackingInfo();
        return new SupportPremiumCellsWithHeaderVI(hashCode, backgroundColor, backgroundImageApp, image, titleLeft, titleMid, titleRight, subtitle, badge, list, backgroundColor2, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }
}
