package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTOKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$BonusInfo;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DTO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DtoWrapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.info.PriceV2InfoVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2InfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Info;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/info/PriceV2InfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Info;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV2InfoMapper implements Function2<PriceV2DtoWrapper.Info, d, List<? extends PriceV2InfoVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PriceV2InfoVO> invoke(@NotNull PriceV2DtoWrapper.Info state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        List<PriceV2DTO.BonusInfo> infoCards = state.getInfoCards();
        ArrayList arrayList = new ArrayList(C7714v.z(infoCards, 10));
        int i11 = 0;
        for (Object obj : infoCards) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            PriceV2DTO.BonusInfo bonusInfo = (PriceV2DTO.BonusInfo) obj;
            boolean z11 = state.getIsLastItem() && i11 == C7714v.P(state.getInfoCards());
            Icon icon = bonusInfo.getIcon();
            AtomActionDTO action = bonusInfo.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, bonusInfo.getTrackingInfo()) : null;
            OnBoardingDTO commonOnboarding = bonusInfo.getCommonOnboarding();
            if (commonOnboarding == null) {
                PDPOnBoardingDTO onboarding = bonusInfo.getOnboarding();
                commonOnboarding = onboarding != null ? PDPOnBoardingDTOKt.toCommonOnboardingDTO$default(onboarding, ImageAspectRatio.RATIO_4_3, 0, null, 6, null) : null;
            }
            TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(bonusInfo.getText(), null, null, null, null, null, null, null, null, null, null, null, true, 2047, null);
            Icon icon2 = bonusInfo.getIcon();
            AtomActionDTO action2 = bonusInfo.getAction();
            arrayList.add(new PriceV2InfoVO(widgetId, new PriceV2VO$BonusInfo(dsTextAtom$default, icon2, action2 != null ? AtomActionMapperKt.toAtomAction(action2, bonusInfo.getTrackingInfo()) : null), icon, atomAction, commonOnboarding, z11, (z11 && state.getShowBottomRounding().booleanValue()) ? CornersConfig.BOTTOM : CornersConfig.NONE));
            i11 = i12;
        }
        return arrayList;
    }
}
