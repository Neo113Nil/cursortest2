package ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.data.InstallmentDtoWrapper$Purchase;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.InstallmentVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/purchase/InstallmentPurchaseMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentDtoWrapper$Purchase;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentDtoWrapper$Purchase;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPurchaseMapper implements Function2<InstallmentDtoWrapper$Purchase, d, List<? extends InstallmentVO.Purchase>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InstallmentVO.Purchase> invoke(@NotNull InstallmentDtoWrapper$Purchase state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        PriceWithTitle price = state.getPrice();
        AtomActionDTO action = state.getAction();
        CommonAtomIconDTO commonAtomIconDTO = null;
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
        OnBoardingDTO onboarding = state.getOnboarding();
        Integer animationTimer = state.getAnimationTimer();
        Integer valueOf = animationTimer != null ? Integer.valueOf(animationTimer.intValue() / 1000) : null;
        Map<String, TokenizedTrackingInfo> animationTrackingInfo = state.getAnimationTrackingInfo();
        t mapToTokenizedEvent$default = animationTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(animationTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null;
        Boolean showTopRounding = state.getShowTopRounding();
        boolean booleanValue = showTopRounding != null ? showTopRounding.booleanValue() : false;
        boolean hasBadges = state.getHasBadges();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t mapToTokenizedEvent$default2 = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null;
        Icon priceIcon = state.getPriceIcon();
        String background = state.getBackground();
        if (state.getAction() != null) {
            CommonAtomIconDTO chevronIcon = state.getChevronIcon();
            if (chevronIcon == null) {
                chevronIcon = new CommonAtomIconDTO(UniTheme.INSTANCE.getIconTokens().getIc_s_chevron_right_filled().getId(), UniColors.GRAPHIC_QUATERNARY.getToken());
            }
            commonAtomIconDTO = chevronIcon;
        }
        return C7714v.a0(new InstallmentVO.Purchase(widgetId, price, atomAction, valueOf, mapToTokenizedEvent$default, onboarding, booleanValue, hasBadges, null, mapToTokenizedEvent$default2, priceIcon, background, commonAtomIconDTO, 256, null));
    }
}
