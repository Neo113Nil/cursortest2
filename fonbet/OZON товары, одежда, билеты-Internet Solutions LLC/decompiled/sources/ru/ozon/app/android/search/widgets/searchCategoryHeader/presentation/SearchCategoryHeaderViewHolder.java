package ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation;

import GI.c;
import GI.d;
import WZ.t;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.view.Y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.OnboardingFeature;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingCutConfig;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegate;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegateImpl;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 62\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00016B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u000eJ3\u0010(\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010$\u001a\u00060\"j\u0002`#2\u000e\u0010'\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderViewGroup;", "container", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "<init>", "(Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;)V", "", "bindOnBoarding", "()V", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "onboardingVO", "bindOnboardingDelegate", "(Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;)V", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "getOrCreateOnBoardingDelegate", "()Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "", "widgetId", "trackOnboardingView", "(Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;J)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderVO;Ll20/d;)V", "onDetach", "onViewOutOfVisibleBounds", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderViewGroup;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingDelegate", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchCategoryHeaderViewHolder extends k<SearchCategoryHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final SearchCategoryHeaderViewGroup container;

    @NotNull
    private final Handler handler;
    private OnboardingDelegate onboardingDelegate;

    @NotNull
    private final CommonOnboardingRepository onboardingRepository;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float VIEW_CORNER_RADIUS = UiExtKt.toPxF(4);
    private static final float BACKGROUND_CORNER_RADIUS = UiExtKt.toPxF(8);
    private static final int BACKGROUND_PADDING = UiExtKt.toPx(6);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderViewHolder$Companion;", "", "<init>", "()V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCategoryHeaderViewHolder(@NotNull SearchCategoryHeaderViewGroup container, @NotNull ComposerReferences composerReferences, @NotNull CommonOnboardingRepository onboardingRepository) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        this.container = container;
        this.composerReferences = composerReferences;
        this.onboardingRepository = onboardingRepository;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.handler = new Handler(Looper.getMainLooper());
        container.setOnClickListener(new c(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SearchCategoryHeaderViewHolder searchCategoryHeaderViewHolder, View view) {
        SearchCategoryHeaderVO boundedData = searchCategoryHeaderViewHolder.getBoundedData();
        if (boundedData != null) {
            searchCategoryHeaderViewHolder.actionHandler.invoke(boundedData.getSelectionAction());
        }
    }

    private final void bindOnBoarding() {
        OnboardingModel onboarding;
        SearchCategoryHeaderVO boundedData = getBoundedData();
        if (boundedData == null || (onboarding = boundedData.getOnboarding()) == null) {
            return;
        }
        OnboardingFeature onboardingFeature = OnboardingFeature.SEARCH_CATEGORY_HEADER_ONBOARDING;
        if (this.onboardingRepository.canShowOnboarding(OnboardingFeature.key$default(onboardingFeature, null, 1, null), onboardingFeature.getMaxShowCount())) {
            this.onboardingRepository.onStartShowOnboarding();
            this.handler.postDelayed(new d(0, this, onboarding), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnboardingDelegate(final OnboardingModel onboardingVO) {
        final CategoryNameTextView categoryName = this.container.getCategoryName();
        int i11 = Y.f42258g;
        if (!categoryName.isLaidOut() || categoryName.isLayoutRequested()) {
            categoryName.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation.SearchCategoryHeaderViewHolder$bindOnboardingDelegate$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    float f7 = SearchCategoryHeaderViewHolder.VIEW_CORNER_RADIUS;
                    float f11 = SearchCategoryHeaderViewHolder.BACKGROUND_CORNER_RADIUS;
                    int i12 = SearchCategoryHeaderViewHolder.BACKGROUND_PADDING;
                    OnboardingDelegate orCreateOnBoardingDelegate = SearchCategoryHeaderViewHolder.this.getOrCreateOnBoardingDelegate();
                    if (orCreateOnBoardingDelegate != null) {
                        OnboardingDelegate.DefaultImpls.bind$default(orCreateOnBoardingDelegate, categoryName, new OnboardingCutConfig(i12, f11, f7), null, onboardingVO, 4, null);
                    }
                }
            });
            return;
        }
        float f7 = VIEW_CORNER_RADIUS;
        float f11 = BACKGROUND_CORNER_RADIUS;
        int i12 = BACKGROUND_PADDING;
        OnboardingDelegate orCreateOnBoardingDelegate = getOrCreateOnBoardingDelegate();
        if (orCreateOnBoardingDelegate != null) {
            OnboardingDelegate.DefaultImpls.bind$default(orCreateOnBoardingDelegate, categoryName, new OnboardingCutConfig(i12, f11, f7), null, onboardingVO, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingDelegate getOrCreateOnBoardingDelegate() {
        SearchCategoryHeaderVO boundedData = getBoundedData();
        if (boundedData == null) {
            return null;
        }
        OnboardingDelegate onboardingDelegate = this.onboardingDelegate;
        if (onboardingDelegate != null) {
            return onboardingDelegate;
        }
        OnboardingDelegateImpl onboardingDelegateImpl = new OnboardingDelegateImpl(this.composerReferences, this.container, this);
        onboardingDelegateImpl.setOnShownListener(new SearchCategoryHeaderViewHolder$getOrCreateOnBoardingDelegate$1$1$1(this, boundedData));
        this.onboardingDelegate = onboardingDelegateImpl;
        return onboardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackOnboardingView(OnboardingModel onboardingModel, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo = onboardingModel.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null), null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.handler.removeCallbacksAndMessages(null);
        this.onboardingDelegate = null;
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        OnboardingDelegate onboardingDelegate = this.onboardingDelegate;
        if (onboardingDelegate != null) {
            onboardingDelegate.unbind();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchCategoryHeaderVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.container.bind(item, this.actionHandler);
        bindOnBoarding();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchCategoryHeaderVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
