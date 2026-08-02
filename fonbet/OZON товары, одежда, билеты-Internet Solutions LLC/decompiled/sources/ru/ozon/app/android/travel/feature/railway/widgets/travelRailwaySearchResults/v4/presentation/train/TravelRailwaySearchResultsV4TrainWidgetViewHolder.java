package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train;

import Bs.ViewOnClickListenerC2671b;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import androidx.core.view.Y;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV4MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view.TravelRailwaySearchResultsV4TrainView;
import ru.ozon.app.android.travel.utils.extensions.OnboardingExtensionsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010(\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010#J\u0017\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u0010#J)\u00105\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R$\u0010?\u001a\u0012\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00190<j\u0002`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TrainView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV4MultiFrameBindDelegate;", "multiFrameBindDelegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TrainView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV4MultiFrameBindDelegate;LVg/d;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LWZ/l;)V", "", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingApp", "", "allOnboardingKeys", "", "verifyAndStartOnboarding", "(Ljava/util/List;Ljava/util/List;)V", "onBoarding", "startOnboarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "vo", "bindOnBoarding", "initDelegate", "setUpRootView", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO;Ll20/d;)V", "onAttach", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TrainView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV4MultiFrameBindDelegate;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "onboardingCornerRadius", "F", "", "onboardingMargin", "I", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lxe/B0;", "onboardingJob", "Lxe/B0;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4TrainWidgetViewHolder extends k<TravelRailwaySearchResultsV4TrainVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelRailwaySearchResultsV4TrainView containerView;

    @NotNull
    private final TravelRailwaySearchResultsV4MultiFrameBindDelegate multiFrameBindDelegate;
    private OnBoardingDelegate onBoardingDelegate;
    private final float onboardingCornerRadius;
    private B0 onboardingJob;
    private final int onboardingMargin;

    @NotNull
    private final BaseOnBoardingViewModel onboardingViewModel;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySearchResultsV4TrainWidgetViewHolder(@NotNull TravelRailwaySearchResultsV4TrainView containerView, @NotNull ComposerReferences references, @NotNull TravelRailwaySearchResultsV4MultiFrameBindDelegate multiFrameBindDelegate, @NotNull d customActionHandlersStoreFactory, @NotNull BaseOnBoardingViewModel onboardingViewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(multiFrameBindDelegate, "multiFrameBindDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.multiFrameBindDelegate = multiFrameBindDelegate;
        this.onboardingViewModel = onboardingViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelRailwaySearchResultsV4TrainWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        this.onboardingCornerRadius = ResourceExtKt.toPxF(10, getContext());
        this.onboardingMargin = ResourceExtKt.toPx(8, getContext());
        setUpRootView();
        containerView.setupView(buildHandler, references.getComposerViewPoolProvider().getViewPool());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnBoarding(final OnBoardingDTO vo) {
        final View onboardingView = this.containerView.getOnboardingView();
        int i11 = Y.f42258g;
        if (!onboardingView.isLaidOut() || onboardingView.isLayoutRequested()) {
            onboardingView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainWidgetViewHolder$bindOnBoarding$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    ComposerExtKt.withPageTag(TravelRailwaySearchResultsV4TrainWidgetViewHolder.this.references.getContainer(), new TravelRailwaySearchResultsV4TrainWidgetViewHolder$bindOnBoarding$1$1(TravelRailwaySearchResultsV4TrainWidgetViewHolder.this, vo, onboardingView));
                }
            });
        } else {
            ComposerExtKt.withPageTag(this.references.getContainer(), new TravelRailwaySearchResultsV4TrainWidgetViewHolder$bindOnBoarding$1$1(this, vo, onboardingView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        String onboardingKey = onBoarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "travel_railway_search_results_v3_onboarding_key";
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.references, this.itemView, onBoarding, this, this.onboardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new TravelRailwaySearchResultsV4TrainWidgetViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    private final void setUpRootView() {
        this.containerView.setOnClickListener(new ViewOnClickListenerC2671b(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRootView$lambda$2(TravelRailwaySearchResultsV4TrainWidgetViewHolder travelRailwaySearchResultsV4TrainWidgetViewHolder, View view) {
        AtomAction selectTrainAction;
        TravelRailwaySearchResultsV4TrainVO boundData = travelRailwaySearchResultsV4TrainWidgetViewHolder.getBoundData();
        if (boundData == null || (selectTrainAction = boundData.getSelectTrainAction()) == null) {
            return;
        }
        travelRailwaySearchResultsV4TrainWidgetViewHolder.actionHandler.invoke(selectTrainAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOnboarding(OnBoardingDTO onBoarding) {
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.onboardingJob = onBoarding != null ? OnboardingExtensionsKt.showOnboardingWithDelay(onBoarding, U7.d.c(this.references), K.a(this), new TravelRailwaySearchResultsV4TrainWidgetViewHolder$startOnboarding$1(this)) : null;
    }

    private final void verifyAndStartOnboarding(List<OnBoardingDTO> onboardingApp, List<String> allOnboardingKeys) {
        ComposerExtKt.withPageTag(this.references.getContainer(), new TravelRailwaySearchResultsV4TrainWidgetViewHolder$verifyAndStartOnboarding$1(allOnboardingKeys, this, onboardingApp));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.multiFrameBindDelegate.onAttach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.multiFrameBindDelegate.onDetach();
        ComposerExtKt.withPageTag(this.references.getContainer(), new TravelRailwaySearchResultsV4TrainWidgetViewHolder$onDetach$1(this));
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.onboardingJob = null;
        this.onBoardingDelegate = null;
        super.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.multiFrameBindDelegate.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.multiFrameBindDelegate.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelRailwaySearchResultsV4TrainVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.multiFrameBindDelegate.bind(item, this.actionHandler);
        verifyAndStartOnboarding(item.getOnboardingApp(), item.getAllOnboardingKeys());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelRailwaySearchResultsV4TrainVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelRailwaySearchResultsV4TrainWidgetViewHolder) item, trackingData, viewedPond);
        t viewTokenizedEvent = item.getViewTokenizedEvent();
        if (viewTokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, viewTokenizedEvent, null);
        }
    }
}
