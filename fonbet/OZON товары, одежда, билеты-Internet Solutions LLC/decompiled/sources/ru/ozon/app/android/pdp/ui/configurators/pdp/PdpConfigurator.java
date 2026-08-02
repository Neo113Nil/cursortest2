package ru.ozon.app.android.pdp.ui.configurators.pdp;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Hs.d;
import Hs.e;
import Pc.a;
import a00.C4911f;
import a00.h;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import gk0.o;
import gk0.p;
import gk0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel;
import ru.ozon.app.android.pdp.flags.PdpWidgetImagePlaceholderFlag;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.pdp.ui.configurators.comparison.RefreshObject;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModelImpl;
import ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints.HelpfulHintsInfoStorage;
import ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints.HelpfulHintsVO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.PdpScreenStateHolder$CacheState;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.di.WidgetImagePlaceholderComponent;
import ru.ozon.app.android.pdp.utils.ScrollDirectionHandler;
import ru.ozon.app.android.pdp.utils.ScrollDirectionHandlerKt;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.app.android.video.VideoPosition;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 R2\u00020\u0001:\u0001RBM\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\u0015J)\u0010'\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010\u001cJ\u0017\u0010*\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010\u001cJ\u0017\u0010+\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010\u001cJ\u0017\u0010,\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010\u001cJ\u0017\u0010-\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b-\u0010\u001cJ#\u00103\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.2\n\u00102\u001a\u000600j\u0002`1H\u0016¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010.2\n\u00102\u001a\u000600j\u0002`1H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010IR\u0016\u0010M\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010IR\u0014\u0010Q\u001a\u00020N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/PdpConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/ComparisonRefreshViewModel;", "pRefreshViewModel", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModelImpl;", "pGalleryViewModel", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/pdp/ui/configurators/pdp/screenstateholder/PdpScreenStateHolder$CacheState;", "pdpScreenStateHolder", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineScreenWidgetsData", "<init>", "(LPc/a;LPc/a;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/pdp/ui/configurators/pdp/screenstateholder/PdpScreenStateHolder$CacheState;Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;)V", "", "observeChangeFavoritesEvents", "()V", "", "shouldRefresh", "()Z", "Landroidx/lifecycle/J;", "owner", "cacheCurrentLifecycleState", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "ref", "setupWidgetImagePlaceholderAdapter", "(Lru/ozon/app/android/composer/ConfiguratorReferences;)V", "onComposerInitialized", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onCreate", "onStart", "onResume", "onPause", "onStop", "Landroid/os/Bundle;", "outState", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "onSaveInstanceState", "(Landroid/os/Bundle;La00/h;)V", "onRestoreInstanceState", "onDestroy", "LPc/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/screenstateholder/PdpScreenStateHolder$CacheState;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lnc/a;", "refreshDisposable", "Lnc/a;", "Lru/ozon/app/android/pdp/utils/ScrollDirectionHandler;", "scrollHandler", "Lru/ozon/app/android/pdp/utils/ScrollDirectionHandler;", "pdpRefreshViewModel", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/ComparisonRefreshViewModel;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "galleryViewModel", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "isRefreshOnResume", "Z", "previewStatusBarColor", "Ljava/lang/Integer;", "isSelect", "isFresh", "Landroidx/fragment/app/r;", "getActivity", "()Landroidx/fragment/app/r;", "activity", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdpConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final CartService cartService;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;

    @NotNull
    private final FeatureChecker featureChecker;
    private GalleryV3ViewModel galleryViewModel;
    private boolean isFresh;
    private boolean isRefreshOnResume;
    private boolean isSelect;

    @NotNull
    private final a<GalleryV3ViewModelImpl> pGalleryViewModel;

    @NotNull
    private final a<ComparisonRefreshViewModel> pRefreshViewModel;

    @NotNull
    private final PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;
    private ComparisonRefreshViewModel pdpRefreshViewModel;

    @NotNull
    private final PdpScreenStateHolder$CacheState pdpScreenStateHolder;
    private Integer previewStatusBarColor;

    @NotNull
    private final C8486a refreshDisposable;

    @NotNull
    private final ScrollDirectionHandler scrollHandler;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/PdpConfigurator$Companion;", "", "<init>", "()V", "VIDEO_POSITION", "", "VIDEO_POSITION_REQUEST_CODE", "", "GALLERY_V4_IMAGE_CREATION_COUNT", "GALLERY_V5_IMAGE_CREATION_COUNT", "CELL_CREATION_COUNT", "RECYCLER_VIEW_COUNT", "PRODUCT_IMAGE_URL_CACHE_KEY", "PRODUCT_PRICE_CACHE_KEY", "PRODUCT_NAME_CACHE_KEY", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PdpConfigurator(@NotNull a<ComparisonRefreshViewModel> pRefreshViewModel, @NotNull a<GalleryV3ViewModelImpl> pGalleryViewModel, @NotNull CartService cartService, @NotNull FavoriteInteractor favoriteInteractor, @NotNull FeatureChecker featureChecker, @NotNull PdpScreenStateHolder$CacheState pdpScreenStateHolder, @NotNull PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData) {
        Intrinsics.checkNotNullParameter(pRefreshViewModel, "pRefreshViewModel");
        Intrinsics.checkNotNullParameter(pGalleryViewModel, "pGalleryViewModel");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(pdpScreenStateHolder, "pdpScreenStateHolder");
        Intrinsics.checkNotNullParameter(pdpOfflineScreenWidgetsData, "pdpOfflineScreenWidgetsData");
        this.pRefreshViewModel = pRefreshViewModel;
        this.pGalleryViewModel = pGalleryViewModel;
        this.cartService = cartService;
        this.favoriteInteractor = favoriteInteractor;
        this.featureChecker = featureChecker;
        this.pdpScreenStateHolder = pdpScreenStateHolder;
        this.pdpOfflineScreenWidgetsData = pdpOfflineScreenWidgetsData;
        this.refreshDisposable = new C8486a();
        this.scrollHandler = new ScrollDirectionHandler();
    }

    private final void cacheCurrentLifecycleState(J owner) {
        this.pdpScreenStateHolder.cacheState(owner.getLifecycle().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r getActivity() {
        return getContainer().i();
    }

    private final void observeChangeFavoritesEvents() {
        C8486a c8486a = this.refreshDisposable;
        InterfaceC8487b subscribe = this.favoriteInteractor.favoriteChangeEvents().subscribeOn(Mc.a.b()).filter(new d(PdpConfigurator$observeChangeFavoritesEvents$1.INSTANCE, 12)).observeOn(C8125a.a()).subscribe(new e(PdpConfigurator$observeChangeFavoritesEvents$2.INSTANCE, 10));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeChangeFavoritesEvents$lambda$7(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    private final void setupWidgetImagePlaceholderAdapter(ConfiguratorReferences ref) {
        WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;
        C7475g composerWidgetComponentStorage;
        if (this.featureChecker.isEnabled(PdpWidgetImagePlaceholderFlag.INSTANCE)) {
            ConfiguratorReferences references = getReferences();
            WidgetImagePlaceholderComponent widgetImagePlaceholderComponent = (WidgetImagePlaceholderComponent) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(WidgetImagePlaceholderComponent.class));
            if (widgetImagePlaceholderComponent == null || (widgetImagePlaceholderAdapter = widgetImagePlaceholderComponent.getWidgetImagePlaceholderAdapter()) == null) {
                return;
            }
            widgetImagePlaceholderAdapter.initNewPage(ref);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRefresh() {
        C4911f ownerContainer;
        J f7;
        AbstractC5434v lifecycle;
        ConfiguratorReferences references = getReferences();
        return ((references == null || (ownerContainer = references.getOwnerContainer()) == null || (f7 = ownerContainer.f()) == null || (lifecycle = f7.getLifecycle()) == null) ? null : lifecycle.b()) != AbstractC5434v.b.RESUMED;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        InterfaceC7851b controller;
        VideoPosition videoPosition;
        Object parcelableExtra;
        if (resultCode == -1) {
            if (requestCode == 1703) {
                ConfiguratorReferences references = getReferences();
                if (references == null || (controller = references.getController()) == null) {
                    return;
                }
                InterfaceC7851b.a.a(controller, null, null, null, null, 15);
                return;
            }
            if (requestCode != 2023) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (data != null) {
                    parcelableExtra = data.getParcelableExtra("VIDEO_POSITION_KEY", VideoPosition.class);
                    videoPosition = (VideoPosition) parcelableExtra;
                }
                videoPosition = null;
            } else {
                if (data != null) {
                    videoPosition = (VideoPosition) data.getParcelableExtra("VIDEO_POSITION_KEY");
                }
                videoPosition = null;
            }
            if (videoPosition != null) {
                GalleryV3ViewModel galleryV3ViewModel = this.galleryViewModel;
                if (galleryV3ViewModel != null) {
                    galleryV3ViewModel.setVideoPosition(videoPosition);
                } else {
                    Intrinsics.n("galleryViewModel");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (ru.ozon.app.android.navigation.miniapp.MiniAppExtKt.isExpress(r1 != null ? r1.getContext() : null) != false) goto L26;
     */
    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onComposerInitialized() {
        Window window;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) ((references2 == null || (composerWidgetComponentStorage = references2.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(AndroidPlatformComponentApi.class));
        AppType appType = androidPlatformComponentApi != null ? androidPlatformComponentApi.getAppType() : null;
        boolean z11 = false;
        this.isSelect = appType == AppType.SELECT;
        if (appType != AppType.FRESH) {
            ComponentCallbacksC5392m c11 = getContainer().c();
        }
        z11 = true;
        this.isFresh = z11;
        r a11 = getContainer().a();
        if (a11 != null && (window = a11.getWindow()) != null) {
            this.previewStatusBarColor = Integer.valueOf(window.getStatusBarColor());
        }
        setupWidgetImagePlaceholderAdapter(references);
        this.pdpRefreshViewModel = (ComparisonRefreshViewModel) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.ui.configurators.pdp.PdpConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = PdpConfigurator.this.pRefreshViewModel;
                ComparisonRefreshViewModel comparisonRefreshViewModel = (ComparisonRefreshViewModel) aVar.get();
                Intrinsics.g(comparisonRefreshViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return comparisonRefreshViewModel;
            }
        }).a(ComparisonRefreshViewModel.class);
        this.galleryViewModel = (GalleryV3ViewModel) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.ui.configurators.pdp.PdpConfigurator$onComposerInitialized$$inlined$createViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = PdpConfigurator.this.pGalleryViewModel;
                GalleryV3ViewModelImpl galleryV3ViewModelImpl = (GalleryV3ViewModelImpl) aVar.get();
                Intrinsics.g(galleryV3ViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return galleryV3ViewModelImpl;
            }
        }).a(GalleryV3ViewModelImpl.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(3, new PdpConfigurator$onComposerInitialized$4(this)));
        arrayList.add(new p(2, new PdpConfigurator$onComposerInitialized$5(this)));
        arrayList.add(new p(3, new PdpConfigurator$onComposerInitialized$6(this)));
        arrayList.add(new p(5, new PdpConfigurator$onComposerInitialized$7(this)));
        arrayList.add(new p(1, new PdpConfigurator$onComposerInitialized$8(this)));
        arrayList.add(new p(2, new PdpConfigurator$onComposerInitialized$9(this)));
        arrayList.add(new p(3, new PdpConfigurator$onComposerInitialized$10(this)));
        arrayList.add(new o(R$layout.widget_nutrition_info_v2, 1, getActivity()));
        arrayList.add(new o(R$layout.pdp_widget_rich_content, 1, getActivity()));
        arrayList.add(new o(R$layout.pdp_widget_text_description, 1, getActivity()));
        arrayList.add(new p(1, new PdpConfigurator$onComposerInitialized$11(this)));
        ComponentCallbacksC5392m c12 = references.getOwnerContainer().c();
        if (c12 != null) {
            q qVar = q.f64554a;
            String componentCallbacksC5392m = c12.toString();
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC5392m, "toString(...)");
            qVar.f(componentCallbacksC5392m, arrayList);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        cacheCurrentLifecycleState(owner);
        observeChangeFavoritesEvents();
        Iterator<Map.Entry<Long, CartItemInfo>> it = this.cartService.getCartState().getItems().entrySet().iterator();
        while (it.hasNext()) {
            HelpfulHintsInfoStorage.INSTANCE.addToSetOfSku(String.valueOf(it.next().getKey().longValue()), 0, HelpfulHintsVO.NotificationBehavior.ADD_TO_CART);
        }
        C2399j.C(new C(new C2408n0(RefreshObject.INSTANCE.observeRefreshState(), new PdpConfigurator$onCreate$2(this, null)), new PdpConfigurator$onCreate$3(null)), K.a(owner));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        C4911f ownerContainer;
        Integer num;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!this.isSelect && (num = this.previewStatusBarColor) != null) {
            StatusBarController.INSTANCE.setStatusBarBackgroundColor(getContainer().c(), StatusBarController.UpdateReason.Recovery.INSTANCE, num.intValue());
        }
        ConfiguratorReferences references = getReferences();
        if (references != null && (ownerContainer = references.getOwnerContainer()) != null) {
            ComposerExtKt.withPageTag(ownerContainer, new PdpConfigurator$onDestroy$2(OnBoardingDisplayOnPageRepository.Default.INSTANCE));
        }
        this.pdpOfflineScreenWidgetsData.clear();
        cacheCurrentLifecycleState(owner);
        if (this.refreshDisposable.isDisposed()) {
            return;
        }
        this.refreshDisposable.dispose();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        RecyclerView composerRecyclerViewOrNull;
        Intrinsics.checkNotNullParameter(owner, "owner");
        cacheCurrentLifecycleState(owner);
        GalleryV3ViewModel galleryV3ViewModel = this.galleryViewModel;
        if (galleryV3ViewModel == null) {
            Intrinsics.n("galleryViewModel");
            throw null;
        }
        galleryV3ViewModel.onPauseVideoItem();
        ViewGroup rootView = ContextExtKt.getRootView(getContainer().c());
        if (rootView == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) == null) {
            return;
        }
        ScrollDirectionHandlerKt.removeScrollDirectionHandler(composerRecyclerViewOrNull, this.scrollHandler);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onRestoreInstanceState(Bundle outState, @NotNull h viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        super.onRestoreInstanceState(outState, viewModelOwnerProvider);
        if (outState != null) {
            PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData = this.pdpOfflineScreenWidgetsData;
            String string = outState.getString("PRODUCT_IMAGE_URL_CACHE");
            Parcelable parcelable = outState.getParcelable("PRODUCT_PRICE_CACHE");
            PriceDTO priceDTO = parcelable instanceof PriceDTO ? (PriceDTO) parcelable : null;
            String string2 = outState.getString("PRODUCT_NAME_CACHE");
            pdpOfflineScreenWidgetsData.save(new PdpOfflineScreenWidgetsDataModel.Base(string, priceDTO, string2 != null ? OzonSpannableStringKt.toOzonSpannableString(string2) : null));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        InterfaceC7851b controller;
        RecyclerView composerRecyclerViewOrNull;
        Intrinsics.checkNotNullParameter(owner, "owner");
        cacheCurrentLifecycleState(owner);
        ViewGroup rootView = ContextExtKt.getRootView(getContainer().c());
        if (rootView != null && (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) != null) {
            ScrollDirectionHandlerKt.addScrollDirectionHandler(composerRecyclerViewOrNull, this.scrollHandler);
        }
        GalleryV3ViewModel galleryV3ViewModel = this.galleryViewModel;
        if (galleryV3ViewModel == null) {
            Intrinsics.n("galleryViewModel");
            throw null;
        }
        galleryV3ViewModel.onResumeVideoItem();
        if (this.isRefreshOnResume) {
            ConfiguratorReferences references = getReferences();
            if (references != null && (controller = references.getController()) != null) {
                InterfaceC7851b.a.a(controller, null, null, null, null, 15);
            }
            this.isRefreshOnResume = false;
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onSaveInstanceState(@NotNull Bundle outState, @NotNull h viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        super.onSaveInstanceState(outState, viewModelOwnerProvider);
        outState.putString("PRODUCT_IMAGE_URL_CACHE", this.pdpOfflineScreenWidgetsData.productImageUrl());
        outState.putParcelable("PRODUCT_PRICE_CACHE", this.pdpOfflineScreenWidgetsData.productPrice());
        outState.putString("PRODUCT_NAME_CACHE", String.valueOf(this.pdpOfflineScreenWidgetsData.productName()));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        ComponentCallbacksC5392m c11;
        View view;
        Context context;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!this.isSelect && !this.isFresh && (c11 = getContainer().c()) != null && (view = c11.getView()) != null && (context = view.getContext()) != null) {
            StatusBarController.INSTANCE.setStatusBarBackgroundColor(getContainer().c(), StatusBarController.UpdateReason.NewState.INSTANCE, androidx.core.content.a.getColor(context, UniColors.LAYER_FLOOR_1.getResId()));
        }
        cacheCurrentLifecycleState(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        cacheCurrentLifecycleState(owner);
    }
}
