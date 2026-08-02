package ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom;

import W10.c;
import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksDelegate;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.BasePriceV4ViewHolder;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4SizeResolver;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00150$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomViewHolder;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/BasePriceV4ViewHolder;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Bottom;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomView;", "view", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/PriceV4SizeResolver;", "onboardingResolver", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "partnerBanksDelegate", "<init>", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomView;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/widgets/priceV4/presentation/PriceV4SizeResolver;Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Bottom;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Bottom;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "()V", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomView;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/PriceV4SizeResolver;", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "topBadgeWidth", "I", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV4BottomViewHolder extends BasePriceV4ViewHolder<PriceV4VoWrapper.Bottom> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PriceV4SizeResolver onboardingResolver;

    @NotNull
    private final PartnerBanksDelegate partnerBanksDelegate;

    @NotNull
    private final l tokenizedAnalytics;
    private int topBadgeWidth;

    @NotNull
    private final PriceV4BottomView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceV4BottomViewHolder(@NotNull PriceV4BottomView view, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences composerReferences, @NotNull PriceV4SizeResolver onboardingResolver, @NotNull PartnerBanksDelegate partnerBanksDelegate) {
        super(view, onBoardingViewModel, composerReferences);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(onboardingResolver, "onboardingResolver");
        Intrinsics.checkNotNullParameter(partnerBanksDelegate, "partnerBanksDelegate");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onboardingResolver = onboardingResolver;
        this.partnerBanksDelegate = partnerBanksDelegate;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.onboardingResolver.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PriceV4VoWrapper.Bottom item, @NotNull d info) {
        String str;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
        this.topBadgeWidth = item.getTopBadgeWidth();
        PriceV4SizeResolver priceV4SizeResolver = this.onboardingResolver;
        OnBoardingDTO onboarding = item.getOnboarding();
        if (onboarding != null) {
            str = onboarding.getOnboardingKey();
            if (str == null) {
                str = "installment_onboarding_is_shown";
            }
        } else {
            str = null;
        }
        priceV4SizeResolver.setBottomBadgeConfig(str, this.view, new PriceV4BottomViewHolder$bind$2(item, this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PriceV4VoWrapper.Bottom item, @NotNull c trackingData, f viewedPond) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        t mapToTokenizedEvent$default2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getTrackingInfo();
        if (trackingInfo2 != null && (mapToTokenizedEvent$default2 = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(item.getId()), null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default2, null, 2, null);
        }
        PriceDTO price = item.getPrice();
        if (price != null && (trackingInfo = price.getTrackingInfo()) != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
        }
        this.partnerBanksDelegate.trackView();
    }
}
