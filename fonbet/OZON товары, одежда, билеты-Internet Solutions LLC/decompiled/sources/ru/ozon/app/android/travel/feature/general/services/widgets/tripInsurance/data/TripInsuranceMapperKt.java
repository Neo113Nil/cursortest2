package ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.data;

import WZ.x;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.presentation.TripInsuranceVI;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;", "Ll20/d;", "widgetInfo", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;", "toVI", "(Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;Ll20/d;Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;", "services_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TripInsuranceMapperKt {
    @NotNull
    public static final TripInsuranceVI toVI(@NotNull TripInsuranceDTO tripInsuranceDTO, @NotNull d widgetInfo, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(tripInsuranceDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(context, "context");
        long hashCode = widgetInfo.d().hashCode();
        CellDTO.CellText title = tripInsuranceDTO.getAdditionalInfo().getCompensationLimit().getCenterBlock().getTitle();
        CellDTO mobileHeader = tripInsuranceDTO.getMobileHeader();
        List<CellDTO> benefits = tripInsuranceDTO.getBenefits();
        TextDTO textDTO = new TextDTO(title.getText(), null, null, null, null, null, TextPreset.PRESET_CUSTOM, title.getTypographyToken(), title.getTextColor(), null, null, null, null, false, null, null, null, null, null, 523838, null);
        CellDTO.RightBlock rightBlock = tripInsuranceDTO.getAdditionalInfo().getCompensationLimit().getRightBlock();
        TripInsuranceVI.AdditionalInfo additionalInfo = new TripInsuranceVI.AdditionalInfo(textDTO, rightBlock != null ? rightBlock.getIcon() : null, tripInsuranceDTO.getAdditionalInfo().getImage(), C7811b0.b(StyleParser.INSTANCE.parseColor(context, tripInsuranceDTO.getAdditionalInfo().getBgColor(), UniColors.BG_PRIMARY.getResId())), tripInsuranceDTO.getAdditionalInfo().getCommon().toAtomAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = tripInsuranceDTO.getTrackingInfo();
        return new TripInsuranceVI(hashCode, mobileHeader, benefits, additionalInfo, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }
}
