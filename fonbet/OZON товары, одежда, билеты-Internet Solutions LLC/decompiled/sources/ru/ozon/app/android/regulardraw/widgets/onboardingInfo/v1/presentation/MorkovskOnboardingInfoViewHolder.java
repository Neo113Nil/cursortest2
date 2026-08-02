package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.presentation;

import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.regulardraw.flags.MegaSkipFirstOnboardingEnabled;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.OnboardingModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoViewHolder;", "Ld20/b;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO;", "Ll10/i;", "screenUiContainer", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "morkovskOnboardingDelegate", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Ll10/i;Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/network/abtool/FeatureChecker;LWZ/l;)V", "item", "", "sendMainDrawMajorScreenClosedEvent", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO;)V", "bind", "Ll10/i;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LWZ/l;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskOnboardingInfoViewHolder extends AbstractC6065b<MorkovskOnboardingInfoVO> {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final FeatureChecker featureChecker;
    private final View metricView;

    @NotNull
    private final MorkovskOnboardingDelegate morkovskOnboardingDelegate;

    @NotNull
    private final i screenUiContainer;

    @NotNull
    private final l tokenizedAnalytics;

    public MorkovskOnboardingInfoViewHolder(@NotNull i screenUiContainer, @NotNull MorkovskOnboardingDelegate morkovskOnboardingDelegate, @NotNull ActionV2Repository actionV2Repository, @NotNull FeatureChecker featureChecker, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(screenUiContainer, "screenUiContainer");
        Intrinsics.checkNotNullParameter(morkovskOnboardingDelegate, "morkovskOnboardingDelegate");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.screenUiContainer = screenUiContainer;
        this.morkovskOnboardingDelegate = morkovskOnboardingDelegate;
        this.actionV2Repository = actionV2Repository;
        this.featureChecker = featureChecker;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMainDrawMajorScreenClosedEvent(MorkovskOnboardingInfoVO item) {
        String link;
        AtomActionDTO action = item.getPrizeStep().getFinishButton().getAction();
        if (action == null || (link = action.getLink()) == null) {
            return;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getPrizeStep().getFinishButton().getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null) : null;
        if (tokenizedEvent$default != null) {
            m.a(this.tokenizedAnalytics, tokenizedEvent$default, null);
        }
        C10727i.c(K.a(this.screenUiContainer.K().f()), null, null, new MorkovskOnboardingInfoViewHolder$sendMainDrawMajorScreenClosedEvent$2(this, link, null), 3);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull MorkovskOnboardingInfoVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        MorkovskOnboardingDelegate.MorkovskOnboarding provideMorokvskOnboarding = this.morkovskOnboardingDelegate.provideMorokvskOnboarding();
        provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.FirstScreenImageModel(item.getWelcomeStep().getImage(), item.getWelcomeStep().getActionText(), item.getWelcomeStep().getWelcomeScreenViewEvent()));
        provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.SecondBalanceWithToolTipModel.ScreenInfoModel(item.getBalanceStep().getTooltipImage(), item.getBalanceStep().getTooltipText(), item.getBalanceStep().getActionText(), item.getBalanceStep().getBalanceScreenViewEvent()));
        provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.ThirdPrizeProgressTooltipModel.ScreenInfoModel(item.getProgressStep().getTooltipImage(), item.getProgressStep().getTooltipText(), item.getProgressStep().getProgressScreenViewEvent()));
        provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.FourthNavbarTooltipModel.ScreenInfoModel(item.getRouteStep().getTooltipImage(), item.getRouteStep().getTooltipText(), item.getRouteStep().getSkipButtonText(), item.getRouteStep().getSkipButtonClickEvent(), item.getRouteStep().getRouteScreenViewEvent()));
        provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.MainDrawMajorScreenModel(item.getPrizeStep().getPrizeText(), item.getPrizeStep().getPrizeImage(), item.getPrizeStep().getTooltipImage(), item.getPrizeStep().getTooltipText(), item.getPrizeStep().getCarrotsExchangeRate(), item.getPrizeStep().getTicketsExchangeRate(), item.getPrizeStep().getFinishButton(), item.getPrizeStep().getPrizeScreenViewEvent(), new MorkovskOnboardingInfoViewHolder$bind$1$1(this, item)));
        if (this.featureChecker.isEnabled(MegaSkipFirstOnboardingEnabled.INSTANCE)) {
            sendMainDrawMajorScreenClosedEvent(item);
        }
    }
}
