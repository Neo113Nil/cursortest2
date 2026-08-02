package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2VO;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatter;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "timerFormatter", "<init>", "(Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;)V", "state", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TimerTextHelper;", "timerTextHelper", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TimerTextHelper;", "getTimerTextHelper$common_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TimerTextHelper;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2Mapper implements Function2<TotalPriceWithButtonV2DTO, d, List<? extends TotalPriceWithButtonV2VO>> {

    @NotNull
    private final TimerTextHelper timerTextHelper;

    public TotalPriceWithButtonV2Mapper(@NotNull TimerFormatter timerFormatter) {
        Intrinsics.checkNotNullParameter(timerFormatter, "timerFormatter");
        this.timerTextHelper = new TimerTextHelper(timerFormatter);
    }

    @NotNull
    /* renamed from: getTimerTextHelper$common_prodGoogleAllVendorsRelease, reason: from getter */
    public final TimerTextHelper getTimerTextHelper() {
        return this.timerTextHelper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TotalPriceWithButtonV2VO> invoke(@NotNull TotalPriceWithButtonV2DTO state, @NotNull d widgetInfo) {
        TextDTO textDTO;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TotalPriceWithButtonV2VO.TimerVO timerVO = (state.getCountdownTitle() == null || state.getCountdownTime() == null) ? null : new TotalPriceWithButtonV2VO.TimerVO(state.getCountdownTitle(), this.timerTextHelper.getInitialTimerText(state.getCountdownTime(), state.getCountdownTitle()), state.getCountdownIcon(), state.getCountdownColor());
        TextDTO title = state.getTitle();
        IconDTO titleIcon = state.getTitleIcon();
        PriceDTO titlePrice = state.getTitlePrice();
        CommonControlSettings titleCommon = state.getTitleCommon();
        AtomAction atomAction = titleCommon != null ? titleCommon.toAtomAction() : null;
        TextDTO subtitle = state.getSubtitle();
        PriceDTO subtitlePrice = state.getSubtitlePrice();
        ButtonV3DTO nextButton = state.getNextButton();
        TextDTO agreement = state.getAgreement();
        if (agreement != null) {
            agreement.setTagSupported(true);
            Unit unit = Unit.f71690a;
            textDTO = agreement;
        } else {
            textDTO = null;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new TotalPriceWithButtonV2VO(hashCode, timerVO, title, titleIcon, titlePrice, atomAction, subtitle, subtitlePrice, nextButton, textDTO, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null));
    }
}
