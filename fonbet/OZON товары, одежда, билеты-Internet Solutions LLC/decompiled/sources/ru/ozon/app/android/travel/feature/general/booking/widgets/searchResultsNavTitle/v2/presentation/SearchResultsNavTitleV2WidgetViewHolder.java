package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.core.view.Y;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.view.SearchResultsNavTitleV2View;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.OnboardingExtensionsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\"\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00110)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u0004\u0018\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/presentation/SearchResultsNavTitleV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/presentation/SearchResultsNavTitleV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LWZ/l;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "vo", "", "bindOnBoarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "onBoarding", "initDelegate", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/presentation/SearchResultsNavTitleV2VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/presentation/SearchResultsNavTitleV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/view/SearchResultsNavTitleV2View;", "navTitleView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/view/SearchResultsNavTitleV2View;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lxe/B0;", "onboardingJob", "Lxe/B0;", "", "onboardingCornerRadius", "F", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchResultsNavTitleV2WidgetViewHolder extends k<SearchResultsNavTitleV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final SearchResultsNavTitleV2View navTitleView;
    private OnBoardingDelegate onBoardingDelegate;
    private final float onboardingCornerRadius;
    private B0 onboardingJob;

    @NotNull
    private final BaseOnBoardingViewModel onboardingViewModel;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsNavTitleV2WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull BaseOnBoardingViewModel onboardingViewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.onboardingViewModel = onboardingViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.navTitleView = containerView instanceof SearchResultsNavTitleV2View ? (SearchResultsNavTitleV2View) containerView : null;
        this.onboardingCornerRadius = ResourceExtKt.toPxF(20, getContext());
        ViewExtensionsKt.centerInToolbar(containerView, references, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnBoarding(final OnBoardingDTO vo) {
        SearchResultsNavTitleV2View searchResultsNavTitleV2View = this.navTitleView;
        if (searchResultsNavTitleV2View == null) {
            return;
        }
        int i11 = Y.f42258g;
        if (!searchResultsNavTitleV2View.isLaidOut() || searchResultsNavTitleV2View.isLayoutRequested()) {
            searchResultsNavTitleV2View.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.presentation.SearchResultsNavTitleV2WidgetViewHolder$bindOnBoarding$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    ComposerExtKt.withPageTag(SearchResultsNavTitleV2WidgetViewHolder.this.references.getContainer(), new SearchResultsNavTitleV2WidgetViewHolder$bindOnBoarding$1$1(SearchResultsNavTitleV2WidgetViewHolder.this, vo));
                }
            });
        } else {
            ComposerExtKt.withPageTag(this.references.getContainer(), new SearchResultsNavTitleV2WidgetViewHolder$bindOnBoarding$1$1(this, vo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        String onboardingKey = onBoarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "search_results_nav_title_v2_onboarding_key";
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.references, this.navTitleView, onBoarding, this, this.onboardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new SearchResultsNavTitleV2WidgetViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        ComposerExtKt.withPageTag(this.references.getContainer(), new SearchResultsNavTitleV2WidgetViewHolder$onDetach$1(this));
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.onboardingJob = null;
        this.onBoardingDelegate = null;
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchResultsNavTitleV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SearchResultsNavTitleV2View searchResultsNavTitleV2View = this.navTitleView;
        if (searchResultsNavTitleV2View != null) {
            searchResultsNavTitleV2View.bind(item, this.actionHandler);
        }
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        OnBoardingDTO onboarding = item.getOnboarding();
        this.onboardingJob = onboarding != null ? OnboardingExtensionsKt.showOnboardingWithDelay(onboarding, U7.d.c(this.references), K.a(this), new SearchResultsNavTitleV2WidgetViewHolder$bind$1(this)) : null;
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchResultsNavTitleV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SearchResultsNavTitleV2WidgetViewHolder) item, trackingData, viewedPond);
        t viewEvents = item.getViewEvents();
        if (viewEvents != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvents, null, 2, null);
        }
    }
}
