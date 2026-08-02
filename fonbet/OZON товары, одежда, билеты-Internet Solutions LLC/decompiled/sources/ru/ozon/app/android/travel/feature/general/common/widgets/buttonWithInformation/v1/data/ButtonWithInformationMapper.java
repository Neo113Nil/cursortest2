package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.data.ButtonWithInformationDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.ButtonWithInformationVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO;Ll20/d;)Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWithInformationMapper implements Function2<ButtonWithInformationDTO, d, List<? extends ButtonWithInformationVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ButtonWithInformationVO> invoke(@NotNull ButtonWithInformationDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        Price price = state.getPrice();
        ButtonV3Atom.SmallIconButton infoButton = state.getInfoButton();
        ButtonV3Atom paymentButton = state.getPaymentButton();
        if (paymentButton == null && (paymentButton = state.getLargeActionButton()) == null && (paymentButton = state.getSmallActionButton()) == null) {
            return K.f71697a;
        }
        ButtonV3Atom buttonV3Atom = paymentButton;
        ButtonWithInformationVO.ButtonWidthVO buttonWidthVO = state.getButtonWidth() == ButtonWithInformationDTO.ButtonWidthDTO.MATCH_CENTER ? ButtonWithInformationVO.ButtonWidthVO.MATCH_CENTER : state.getButtonWidth() == ButtonWithInformationDTO.ButtonWidthDTO.WRAP_CONTENT ? ButtonWithInformationVO.ButtonWidthVO.WRAP_CONTENT : state.getButtonWidth() == ButtonWithInformationDTO.ButtonWidthDTO.MATCH_PARENT ? ButtonWithInformationVO.ButtonWidthVO.MATCH_PARENT : state.getPaymentButton() != null ? ButtonWithInformationVO.ButtonWidthVO.MATCH_CENTER : state.getLargeActionButton() != null ? ButtonWithInformationVO.ButtonWidthVO.MATCH_PARENT : ButtonWithInformationVO.ButtonWidthVO.WRAP_CONTENT;
        BadgeDTO topBadge = state.getTopBadge();
        CellDTO notificationCell = state.getNotificationCell();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ButtonWithInformationVO(hashCode, title, price, infoButton, buttonV3Atom, buttonWidthVO, topBadge, notificationCell, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
