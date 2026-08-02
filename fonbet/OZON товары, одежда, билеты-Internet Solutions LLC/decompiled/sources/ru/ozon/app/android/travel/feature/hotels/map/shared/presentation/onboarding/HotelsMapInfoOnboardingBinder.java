package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.onboarding;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgets;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgetsImpl;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/onboarding/HotelsMapInfoOnboardingBinder;", "", "Landroidx/lifecycle/J;", "lifecycleOwner", "", "widgetId", "Ll10/i;", "container", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "onboardingViewModel", "<init>", "(Landroidx/lifecycle/J;Ljava/lang/Long;Ll10/i;Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;)V", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "getConfig", "(Landroid/view/View;)Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "", "key", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "initDelegate", "(Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "bind", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Landroid/view/View;)V", "onStop", "()V", "Landroidx/lifecycle/J;", "Ljava/lang/Long;", "Ll10/i;", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateForOverlayWidgets;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateForOverlayWidgets;", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoOnboardingBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final i container;

    @NotNull
    private final J lifecycleOwner;
    private OnBoardingDelegateForOverlayWidgets onBoardingDelegate;

    @NotNull
    private final TravelOnboardingViewModel onboardingViewModel;
    private final Long widgetId;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/onboarding/HotelsMapInfoOnboardingBinder$Companion;", "", "<init>", "()V", "KEY", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HotelsMapInfoOnboardingBinder(@NotNull J lifecycleOwner, Long l11, @NotNull i container, @NotNull TravelOnboardingViewModel onboardingViewModel) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        this.lifecycleOwner = lifecycleOwner;
        this.widgetId = l11;
        this.container = container;
        this.onboardingViewModel = onboardingViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnBoardingCutConfig getConfig(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        return new OnBoardingCutConfig(null, null, null, null, null, null, gradientDrawable != null ? Float.valueOf(gradientDrawable.getCornerRadius()) : null, false, 191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(String key, OnBoardingDTO onboarding) {
        OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegateForOverlayWidgetsImpl = new OnBoardingDelegateForOverlayWidgetsImpl(this.container, this.lifecycleOwner, this.widgetId, key, onboarding, this.onboardingViewModel);
        onBoardingDelegateForOverlayWidgetsImpl.setOnShownListener(new HotelsMapInfoOnboardingBinder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateForOverlayWidgetsImpl;
    }

    public final void bind(@NotNull final OnBoardingDTO onboarding, @NotNull final View view) {
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.onboarding.HotelsMapInfoOnboardingBinder$bind$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    String onboardingKey = OnBoardingDTO.this.getOnboardingKey();
                    if (onboardingKey == null) {
                        onboardingKey = "travel_hotels_map_info_onboarding_key";
                    }
                    ComposerExtKt.withPageTag(this.container, new HotelsMapInfoOnboardingBinder$bind$1$1(this, onboardingKey, OnBoardingDTO.this, view));
                }
            });
            return;
        }
        String onboardingKey = onboarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "travel_hotels_map_info_onboarding_key";
        }
        ComposerExtKt.withPageTag(this.container, new HotelsMapInfoOnboardingBinder$bind$1$1(this, onboardingKey, onboarding, view));
    }

    public final void onStop() {
        ComposerExtKt.withPageTag(this.container, new HotelsMapInfoOnboardingBinder$onStop$1(this));
        OnBoardingDelegateForOverlayWidgets onBoardingDelegateForOverlayWidgets = this.onBoardingDelegate;
        if (onBoardingDelegateForOverlayWidgets != null) {
            onBoardingDelegateForOverlayWidgets.unbind();
        }
        this.onBoardingDelegate = null;
    }
}
