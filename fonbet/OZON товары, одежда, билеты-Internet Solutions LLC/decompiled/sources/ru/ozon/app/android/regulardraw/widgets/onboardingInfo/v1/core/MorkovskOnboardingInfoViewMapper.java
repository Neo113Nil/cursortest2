package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.core;

import WZ.t;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVOKt;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.data.MorkovskOnboardingInfoDTO;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.di.MorkovskOnboardingInfoComponent;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.presentation.MorkovskOnboardingInfoVO;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.presentation.MorkovskOnboardingInfoViewHolder;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/core/MorkovskOnboardingInfoViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/di/MorkovskOnboardingInfoComponent;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MorkovskOnboardingInfoViewMapper extends OverlayWidgetScreenViewItemMapper2<MorkovskOnboardingInfoComponent, MorkovskOnboardingInfoDTO, MorkovskOnboardingInfoVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r
    @NotNull
    public AbstractC6065b<MorkovskOnboardingInfoVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new MorkovskOnboardingInfoViewHolder(container, component().getMorkovskOnboardingDelegate(), component().getActionV2Repository(), component().getFeatureChecker(), component().getTokenizedAnalytics());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<MorkovskOnboardingInfoComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return MorkovskOnboardingInfoComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<MorkovskOnboardingInfoVO> map(@NotNull MorkovskOnboardingInfoDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        String image = state.getWelcomeStep().getImage();
        String actionText = state.getWelcomeStep().getActionText();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getWelcomeStep().getTrackingInfo();
        MorkovskOnboardingInfoVO.WelcomeStepVO welcomeStepVO = new MorkovskOnboardingInfoVO.WelcomeStepVO(image, actionText, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
        String tooltipImage = state.getTooltipImage();
        String tooltipText = state.getBalanceStep().getTooltipText();
        String actionText2 = state.getBalanceStep().getActionText();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getBalanceStep().getTrackingInfo();
        MorkovskOnboardingInfoVO.BalanceStepVO balanceStepVO = new MorkovskOnboardingInfoVO.BalanceStepVO(tooltipImage, tooltipText, actionText2, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null);
        String tooltipImage2 = state.getTooltipImage();
        String tooltipText2 = state.getProgressStep().getTooltipText();
        Map<String, TokenizedTrackingInfo> trackingInfo3 = state.getProgressStep().getTrackingInfo();
        MorkovskOnboardingInfoVO.ProgressStepVO progressStepVO = new MorkovskOnboardingInfoVO.ProgressStepVO(tooltipImage2, tooltipText2, trackingInfo3 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo3, Long.valueOf(hashCode), null, 2, null) : null);
        String tooltipImage3 = state.getTooltipImage();
        String tooltipText3 = state.getRouteStep().getTooltipText();
        String skipButtonText = state.getRouteStep().getSkipButtonText();
        Map<String, TokenizedTrackingInfo> skipButtonTrackingInfo = state.getRouteStep().getSkipButtonTrackingInfo();
        t mapToTokenizedEvent$default = skipButtonTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(skipButtonTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo4 = state.getRouteStep().getTrackingInfo();
        MorkovskOnboardingInfoVO.RouteStepVO routeStepVO = new MorkovskOnboardingInfoVO.RouteStepVO(tooltipImage3, tooltipText3, skipButtonText, mapToTokenizedEvent$default, trackingInfo4 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo4, Long.valueOf(hashCode), null, 2, null) : null);
        String prizeText = state.getPrizeStep().getPrizeText();
        String prizeImage = state.getPrizeStep().getPrizeImage();
        String tooltipImage4 = state.getTooltipImage();
        String tooltipText4 = state.getPrizeStep().getTooltipText();
        MorkovskCurrencyBadgeDTO carrotsExchangeRate = state.getPrizeStep().getCarrotsExchangeRate();
        MorkovskCurrencyBadgeVO.Size size = MorkovskCurrencyBadgeVO.Size.SMALL;
        MorkovskCurrencyBadgeVO map = MorkovskCurrencyBadgeVOKt.map(carrotsExchangeRate, size);
        MorkovskCurrencyBadgeVO map2 = MorkovskCurrencyBadgeVOKt.map(state.getPrizeStep().getTicketsExchangeRate(), size);
        MorkovskShadowButtonDTO finishButton = state.getPrizeStep().getFinishButton();
        Map<String, TokenizedTrackingInfo> trackingInfo5 = state.getPrizeStep().getTrackingInfo();
        return C7714v.a0(new MorkovskOnboardingInfoVO(hashCode, welcomeStepVO, balanceStepVO, progressStepVO, routeStepVO, new MorkovskOnboardingInfoVO.PrizeStepVO(prizeText, prizeImage, tooltipImage4, tooltipText4, map, map2, finishButton, trackingInfo5 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo5, Long.valueOf(hashCode), null, 2, null) : null)));
    }
}
