package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.data;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.data.InsuranceCarouselDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsuranceCarouselMapper implements Function2<InsuranceCarouselDTO, d, List<? extends InsuranceCarouselVI>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InsuranceCarouselVI> invoke(@NotNull InsuranceCarouselDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        ImageDTO logoImage = state.getLogoImage();
        Map<String, TokenizedTrackingInfo> viewTracking = state.getViewTracking();
        t d11 = viewTracking != null ? x.d(viewTracking, widgetInfo) : null;
        Iterator<InsuranceCarouselDTO.InsuranceCarouselCardDTO> it = state.getInsurances().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().isSelected()) {
                break;
            }
            i11++;
        }
        int i12 = i11;
        TestInfo testInfo = state.getTestInfo();
        List<InsuranceCarouselDTO.InsuranceCarouselCardDTO> insurances = state.getInsurances();
        ArrayList arrayList = new ArrayList(C7714v.z(insurances, 10));
        for (InsuranceCarouselDTO.InsuranceCarouselCardDTO insuranceCarouselCardDTO : insurances) {
            long hashCode2 = insuranceCarouselCardDTO.getTitle().hashCode();
            TextDTO title2 = insuranceCarouselCardDTO.getTitle();
            TextDTO subtitleText = insuranceCarouselCardDTO.getSubtitleText();
            PriceDTO subtitlePrice = insuranceCarouselCardDTO.getSubtitlePrice();
            List<CellDTO> benefits = insuranceCarouselCardDTO.getBenefits();
            BadgeDTO badge = insuranceCarouselCardDTO.getBadge();
            ButtonV3DTO button = insuranceCarouselCardDTO.getButton();
            String borderColor = insuranceCarouselCardDTO.getBorderColor();
            if (borderColor == null) {
                borderColor = UniTheme.INSTANCE.getColorTokens().getGraphicNeutral().getId();
            }
            boolean isSelected = insuranceCarouselCardDTO.isSelected();
            Map<String, TokenizedTrackingInfo> trackingInfo = insuranceCarouselCardDTO.getCommon().getTrackingInfo();
            arrayList.add(new InsuranceCarouselVI.InsuranceCarouselCardVI(hashCode2, title2, subtitleText, subtitlePrice, benefits, badge, button, borderColor, isSelected, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null, insuranceCarouselCardDTO.getCommon().getTestInfo(), insuranceCarouselCardDTO.getCommon().toAtomAction()));
        }
        return C7714v.a0(new InsuranceCarouselVI(hashCode, logoImage, title, subtitle, arrayList, testInfo, d11, i12));
    }
}
