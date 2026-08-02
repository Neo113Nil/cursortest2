package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.databinding.WidgetSearchResultsGridBinding;
import ru.ozon.app.android.search.producttilebuttons.binders.ButtonsBinder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.bindstrategy.BindStrategyPicker;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.AdultImagesModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridBindStrategy;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridMultiFrameBindStrategy;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders.Srv2GridDefaultViewStateBinder;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.videocover.VideoTileDelegate;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u001b\u0010'\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/Srv2GridBindStrategyPicker;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/bindstrategy/BindStrategyPicker;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/strategy/Srv2GridBindStrategy;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;", "buttonsBinder", "LPc/a;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinderProvider", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;", "pinchToZoomOnboardingDelegate", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;", "viewBinding", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;LPc/a;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;Lru/ozon/app/android/videocover/VideoTileDelegate;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;)V", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AdultImagesModel;", "adultDelegate", "createBindStrategy", "(Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/strategy/Srv2GridBindStrategy;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;", "LPc/a;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "activeStrategy$delegate", "LSc/j;", "getActiveStrategy", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/strategy/Srv2GridBindStrategy;", "activeStrategy", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Srv2GridBindStrategyPicker extends BindStrategyPicker<Srv2GridBindStrategy> {

    /* renamed from: activeStrategy$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j activeStrategy;

    @NotNull
    private final ButtonsBinder buttonsBinder;

    @NotNull
    private final a<FrameBinder> frameBinderProvider;

    @NotNull
    private final CommonOnboardingRepository onboardingRepository;

    @NotNull
    private final PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Srv2GridBindStrategyPicker(@NotNull ComposerReferences refs, @NotNull ButtonsBinder buttonsBinder, @NotNull a<FrameBinder> frameBinderProvider, @NotNull PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate, @NotNull VideoTileDelegate videoTileDelegate, @NotNull AdultHandler adultHandler, @NotNull WidgetSearchResultsGridBinding viewBinding, @NotNull FeatureChecker featureChecker, @NotNull CommonOnboardingRepository onboardingRepository) {
        super(featureChecker, adultHandler);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(buttonsBinder, "buttonsBinder");
        Intrinsics.checkNotNullParameter(frameBinderProvider, "frameBinderProvider");
        Intrinsics.checkNotNullParameter(pinchToZoomOnboardingDelegate, "pinchToZoomOnboardingDelegate");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        this.refs = refs;
        this.buttonsBinder = buttonsBinder;
        this.frameBinderProvider = frameBinderProvider;
        this.pinchToZoomOnboardingDelegate = pinchToZoomOnboardingDelegate;
        this.videoTileDelegate = videoTileDelegate;
        this.onboardingRepository = onboardingRepository;
        this.activeStrategy = k.b(new Srv2GridBindStrategyPicker$activeStrategy$2(this, viewBinding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Srv2GridBindStrategy createBindStrategy(WidgetSearchResultsGridBinding viewBinding, ComposerReferences refs, ButtonsBinder buttonsBinder, AdultDelegate<AdultImagesModel> adultDelegate) {
        Srv2GridDefaultViewStateBinder srv2GridDefaultViewStateBinder = new Srv2GridDefaultViewStateBinder(refs, buttonsBinder, adultDelegate, this.pinchToZoomOnboardingDelegate, this.videoTileDelegate, this.onboardingRepository);
        ConstraintLayout constraintLayout = viewBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        FrameBinder frameBinder = this.frameBinderProvider.get();
        Intrinsics.checkNotNullExpressionValue(frameBinder, "get(...)");
        return new Srv2GridMultiFrameBindStrategy(srv2GridDefaultViewStateBinder, refs, constraintLayout, frameBinder);
    }

    @NotNull
    public Srv2GridBindStrategy getActiveStrategy() {
        return (Srv2GridBindStrategy) this.activeStrategy.getValue();
    }
}
