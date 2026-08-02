package ru.ozon.app.android.pdp.widgets.brand.core.dsButton;

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
import ru.ozon.app.android.pdp.widgets.brand.presentation.ButtonBrandVO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/core/dsButton/ButtonBrandMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/brand/presentation/ButtonBrandVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonBrandMapper implements Function2<BrandDTO, d, List<? extends ButtonBrandVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ButtonBrandVO> invoke(@NotNull BrandDTO state, @NotNull d widgetInfo) {
        OnBoardingDTO onBoardingDTO;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        AtomDTO cell = state.getCell();
        List<ButtonBrandVO> list = null;
        r3 = null;
        OnBoardingDTO onBoardingDTO2 = null;
        ButtonV3DTO buttonV3DTO = cell instanceof ButtonV3DTO ? (ButtonV3DTO) cell : null;
        if (buttonV3DTO != null) {
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
            OnBoardingDTO commonOnboarding = state.getCommonOnboarding();
            if (commonOnboarding == null) {
                PDPOnBoardingDTO onboarding = state.getOnboarding();
                if (onboarding != null) {
                    PDPOnBoardingDTO pDPOnBoardingDTO = Intrinsics.d(state.isOriginalGoods(), Boolean.TRUE) ? onboarding : null;
                    if (pDPOnBoardingDTO != null) {
                        onBoardingDTO2 = PDPOnBoardingDTOKt.toCommonOnboardingDTO$default(pDPOnBoardingDTO, null, 0, null, 7, null);
                    }
                }
                onBoardingDTO = onBoardingDTO2;
            } else {
                onBoardingDTO = commonOnboarding;
            }
            String json = state.getJson();
            if (json == null) {
                json = "";
            }
            list = C7714v.a0(new ButtonBrandVO(hashCode, tokenizedEvent$default, buttonV3DTO, onBoardingDTO, json));
        }
        return list == null ? K.f71697a : list;
    }
}
