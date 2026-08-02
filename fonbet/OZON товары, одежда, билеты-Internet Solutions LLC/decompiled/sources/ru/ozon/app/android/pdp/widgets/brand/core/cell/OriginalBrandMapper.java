package ru.ozon.app.android.pdp.widgets.brand.core.cell;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTOKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BrandDTO;
import ru.ozon.app.android.pdp.widgets.brand.presentation.OriginalBrandVO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/core/cell/OriginalBrandMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/brand/presentation/OriginalBrandVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OriginalBrandMapper implements Function2<BrandDTO, d, List<? extends OriginalBrandVO>> {
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<OriginalBrandVO> invoke(@NotNull BrandDTO state, @NotNull d widgetInfo) {
        OnBoardingDTO onBoardingDTO;
        String backgroundColor;
        String json;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        AtomDTO cell = state.getCell();
        List<OriginalBrandVO> list = null;
        DisclosureIconTitleSubtitleCellDTO disclosureIconTitleSubtitleCellDTO = cell instanceof DisclosureIconTitleSubtitleCellDTO ? (DisclosureIconTitleSubtitleCellDTO) cell : null;
        if (disclosureIconTitleSubtitleCellDTO != null) {
            IconDTO icon = disclosureIconTitleSubtitleCellDTO.getIcon();
            DisclosureIconTitleSubtitleCellDTO copy$default = DisclosureIconTitleSubtitleCellDTO.copy$default(disclosureIconTitleSubtitleCellDTO, null, null, null, null, null, icon != null ? IconDTO.copy$default(icon, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, IconDTO.FitType.FIT_CENTER, 65503, null) : null, 31, null);
            OnBoardingDTO commonOnboarding = state.getCommonOnboarding();
            if (commonOnboarding == null) {
                PDPOnBoardingDTO onboarding = state.getOnboarding();
                if (onboarding != null) {
                    PDPOnBoardingDTO pDPOnBoardingDTO = Intrinsics.d(state.isOriginalGoods(), Boolean.TRUE) ? onboarding : null;
                    if (pDPOnBoardingDTO != null) {
                        commonOnboarding = PDPOnBoardingDTOKt.toCommonOnboardingDTO$default(pDPOnBoardingDTO, null, 0, null, 7, null);
                    }
                }
                onBoardingDTO = null;
                backgroundColor = state.getBackgroundColor();
                if (backgroundColor == null) {
                    backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
                }
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                t tokenizedEvent$default = trackingInfo == null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
                IconDTO icon2 = disclosureIconTitleSubtitleCellDTO.getIcon();
                String backgroundImage = icon2 != null ? icon2.getBackgroundImage() : null;
                json = state.getJson();
                if (json == null) {
                    json = "";
                }
                list = C7714v.a0(new OriginalBrandVO(hashCode, backgroundColor, tokenizedEvent$default, copy$default, backgroundImage, onBoardingDTO, json));
            }
            onBoardingDTO = commonOnboarding;
            backgroundColor = state.getBackgroundColor();
            if (backgroundColor == null) {
            }
            Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
            if (trackingInfo2 == null) {
            }
            IconDTO icon22 = disclosureIconTitleSubtitleCellDTO.getIcon();
            if (icon22 != null) {
            }
            json = state.getJson();
            if (json == null) {
            }
            list = C7714v.a0(new OriginalBrandVO(hashCode, backgroundColor, tokenizedEvent$default, copy$default, backgroundImage, onBoardingDTO, json));
        }
        return list == null ? K.f71697a : list;
    }
}
