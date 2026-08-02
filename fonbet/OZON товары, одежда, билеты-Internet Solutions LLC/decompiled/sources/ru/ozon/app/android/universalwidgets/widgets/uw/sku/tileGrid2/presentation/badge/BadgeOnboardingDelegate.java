package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge;

import android.view.View;
import androidx.core.view.Y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.OnboardingFeature;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingCutConfig;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegate;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegateImpl;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0002\b\u00030\fj\u0006\u0012\u0002\b\u0003`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0002\b\u00030\fj\u0006\u0012\u0002\b\u0003`\r¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/BadgeOnboardingDelegate;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "item", "Landroid/view/View;", "recyclerItemView", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "getOrCreateOnBoardingDelegate", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Landroid/view/View;Lru/ozon/composer/ui/widget/k;)Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "", "widgetId", "", "trackOnboardingView", "(Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;J)V", "badgeView", "showOnboardingIfNeeded", "(Landroid/view/View;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Landroid/view/View;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingDelegate", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BadgeOnboardingDelegate {
    private OnboardingDelegate onboardingDelegate;

    @NotNull
    private final CommonOnboardingRepository onboardingRepository;

    @NotNull
    private final ComposerReferences references;

    public BadgeOnboardingDelegate(@NotNull ComposerReferences references, @NotNull CommonOnboardingRepository onboardingRepository) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        this.references = references;
        this.onboardingRepository = onboardingRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingDelegate getOrCreateOnBoardingDelegate(TileGrid2VO item, View recyclerItemView, k<?> widgetViewHolder) {
        OnboardingModel onboarding;
        TileGrid2VO.BadgeOnboardingVO badgeOnboarding = item.getBadgeOnboarding();
        if (badgeOnboarding == null || (onboarding = badgeOnboarding.getOnboarding()) == null) {
            return null;
        }
        OnboardingDelegate onboardingDelegate = this.onboardingDelegate;
        if (onboardingDelegate != null) {
            return onboardingDelegate;
        }
        OnboardingDelegateImpl onboardingDelegateImpl = new OnboardingDelegateImpl(this.references, recyclerItemView, widgetViewHolder);
        onboardingDelegateImpl.setOnShownListener(new BadgeOnboardingDelegate$getOrCreateOnBoardingDelegate$1$1$1(this, onboarding, item));
        this.onboardingDelegate = onboardingDelegateImpl;
        return onboardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackOnboardingView(OnboardingModel onboardingModel, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo = onboardingModel.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null), null, 2, null);
        }
    }

    public final void showOnboardingIfNeeded(@NotNull final View badgeView, @NotNull final TileGrid2VO item, final View recyclerItemView, @NotNull final k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(badgeView, "badgeView");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        final TileGrid2VO.BadgeOnboardingVO badgeOnboarding = item.getBadgeOnboarding();
        if (badgeOnboarding == null) {
            return;
        }
        if (this.onboardingRepository.canShowOnboarding(badgeOnboarding.getOnboardingKey(), OnboardingFeature.TILE_GRID_2_BADGE_ONBOARDING.getMaxShowCount())) {
            this.onboardingRepository.onStartShowOnboarding();
            int i11 = Y.f42258g;
            if (!badgeView.isLaidOut() || badgeView.isLayoutRequested()) {
                badgeView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge.BadgeOnboardingDelegate$showOnboardingIfNeeded$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        float badgeCornerRadius = TileGrid2VO.BadgeOnboardingVO.this.getBadgeCornerRadius();
                        float backgroundCornerRadius = TileGrid2VO.BadgeOnboardingVO.this.getBackgroundCornerRadius();
                        int backgroundPadding = TileGrid2VO.BadgeOnboardingVO.this.getBackgroundPadding();
                        OnboardingDelegate orCreateOnBoardingDelegate = this.getOrCreateOnBoardingDelegate(item, recyclerItemView, widgetViewHolder);
                        if (orCreateOnBoardingDelegate != null) {
                            OnboardingDelegate.DefaultImpls.bind$default(orCreateOnBoardingDelegate, badgeView, new OnboardingCutConfig(backgroundPadding, backgroundCornerRadius, badgeCornerRadius), null, TileGrid2VO.BadgeOnboardingVO.this.getOnboarding(), 4, null);
                        }
                    }
                });
                return;
            }
            float badgeCornerRadius = badgeOnboarding.getBadgeCornerRadius();
            float backgroundCornerRadius = badgeOnboarding.getBackgroundCornerRadius();
            int backgroundPadding = badgeOnboarding.getBackgroundPadding();
            OnboardingDelegate orCreateOnBoardingDelegate = getOrCreateOnBoardingDelegate(item, recyclerItemView, widgetViewHolder);
            if (orCreateOnBoardingDelegate != null) {
                OnboardingDelegate.DefaultImpls.bind$default(orCreateOnBoardingDelegate, badgeView, new OnboardingCutConfig(backgroundPadding, backgroundCornerRadius, badgeCornerRadius), null, badgeOnboarding.getOnboarding(), 4, null);
            }
        }
    }
}
