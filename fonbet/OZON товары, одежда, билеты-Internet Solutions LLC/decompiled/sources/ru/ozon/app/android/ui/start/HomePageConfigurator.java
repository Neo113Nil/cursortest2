package ru.ozon.app.android.ui.start;

import Pc.a;
import Tc.j;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import gk0.n;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import l10.InterfaceC7851b;
import oZ.InterfaceC8677a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerViewPoolProvider;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.domain.flags.DoubleHomeInstanceLoggingEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.precreation.PreCreateWidgetsFacade;
import ru.ozon.app.android.precreation.flags.HomePreCreateWidgetsNewConfigurationFlag;
import ru.ozon.app.android.storefrontcommonwidgets.utils.SingleInstanceLogger;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.flags.PrecreateViewsTileGrid2Flag;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders.TopRightButtonProductFavoriteMoleculeViewHolder;
import ru.ozon.app.android.update.InAppUpdateController;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceWithDiscountView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B/\b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0010J)\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b)\u0010&R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010.\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/ui/start/HomePageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LoZ/a;", "LPc/a;", "Lru/ozon/app/android/ui/start/HomePageViewModelImpl;", "vmProvider", "Lru/ozon/app/android/update/InAppUpdateController;", "inAppUpdateController", "Lru/ozon/app/android/precreation/PreCreateWidgetsFacade;", "preCreateWidgetsFacade", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LPc/a;Lru/ozon/app/android/update/InAppUpdateController;Lru/ozon/app/android/precreation/PreCreateWidgetsFacade;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "fillPreCreationViewPoolIfNeeded", "()V", "Lru/ozon/app/android/ui/start/UpdateDeeplink;", "link", "onUpdateDeeplink", "(Lru/ozon/app/android/ui/start/UpdateDeeplink;)V", "onComposerInitialized", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "deeplink", "", "refresh", "onAnchorReturn", "(Ljava/lang/String;Z)V", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onResume", "onPause", "onDestroy", "LPc/a;", "Lru/ozon/app/android/update/InAppUpdateController;", "Lru/ozon/app/android/precreation/PreCreateWidgetsFacade;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "isDoubleHomeLoggingEnabled", "Z", "Lru/ozon/app/android/ui/start/HomePageViewModel;", "viewModel", "Lru/ozon/app/android/ui/start/HomePageViewModel;", "Landroid/os/Handler;", "dialogHandler", "Landroid/os/Handler;", "Landroidx/fragment/app/r;", "getActivity", "()Landroidx/fragment/app/r;", "activity", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomePageConfigurator extends ComposerScreenConfig.PageConfigurator implements InterfaceC8677a {
    private static boolean poolIsInitialized;

    @NotNull
    private final Handler dialogHandler;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final InAppUpdateController inAppUpdateController;
    private final boolean isDoubleHomeLoggingEnabled;

    @NotNull
    private final PreCreateWidgetsFacade preCreateWidgetsFacade;
    private HomePageViewModel viewModel;

    @NotNull
    private final a<HomePageViewModelImpl> vmProvider;
    public static final int $stable = 8;

    public HomePageConfigurator(@NotNull a<HomePageViewModelImpl> vmProvider, @NotNull InAppUpdateController inAppUpdateController, @NotNull PreCreateWidgetsFacade preCreateWidgetsFacade, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(vmProvider, "vmProvider");
        Intrinsics.checkNotNullParameter(inAppUpdateController, "inAppUpdateController");
        Intrinsics.checkNotNullParameter(preCreateWidgetsFacade, "preCreateWidgetsFacade");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.vmProvider = vmProvider;
        this.inAppUpdateController = inAppUpdateController;
        this.preCreateWidgetsFacade = preCreateWidgetsFacade;
        this.featureChecker = featureChecker;
        this.isDoubleHomeLoggingEnabled = featureChecker.isEnabled(DoubleHomeInstanceLoggingEnabled.INSTANCE);
        this.dialogHandler = new Handler(Looper.getMainLooper());
    }

    private final void fillPreCreationViewPoolIfNeeded() {
        List<n> preCreateInfos = this.preCreateWidgetsFacade.getPreCreateInfos(getActivity(), HomePreCreateWidgetsNewConfigurationFlag.INSTANCE);
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 != null) {
            q qVar = q.f64554a;
            r requireActivity = c11.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            String componentCallbacksC5392m = c11.toString();
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC5392m, "toString(...)");
            qVar.e(requireActivity, componentCallbacksC5392m, preCreateInfos);
        }
        if (poolIsInitialized) {
            return;
        }
        poolIsInitialized = true;
        r a11 = getContainer().a();
        if (a11 != null) {
            q qVar2 = q.f64554a;
            j builder = new j();
            d[] elements = {N.b(BadgeView.class), N.b(PriceWithDiscountView.class), N.b(PriceView.class), N.b(TextAtomView.class), N.b(SmallIconButtonView.class), N.b(SmallBorderlessButtonView.class), N.b(ButtonV3View.class)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            builder.addAll(C7705l.j0(elements));
            if (this.featureChecker.isEnabled(PrecreateViewsTileGrid2Flag.INSTANCE)) {
                builder.add(N.b(StockBarView.class));
            }
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            qVar2.d(a11, builder.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r getActivity() {
        return getContainer().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateDeeplink(UpdateDeeplink link) {
        this.inAppUpdateController.startUpdate(getActivity(), link.getInfo());
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.inAppUpdateController.handleResult(requestCode, resultCode);
    }

    @Override // oZ.InterfaceC8677a
    public void onAnchorReturn(@NotNull String deeplink, boolean refresh) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, deeplink, null, null, null, 14);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ComposerViewPoolProvider composerViewPoolProvider;
        RecyclerView.u viewPool;
        ComposerViewPoolProvider composerViewPoolProvider2;
        RecyclerView.u viewPool2;
        ComposerViewPoolProvider composerViewPoolProvider3;
        RecyclerView.u viewPool3;
        if (this.featureChecker.isEnabled(PrecreateViewsTileGrid2Flag.INSTANCE)) {
            ConfiguratorReferences references = getReferences();
            if (references != null && (composerViewPoolProvider3 = references.getComposerViewPoolProvider()) != null && (viewPool3 = composerViewPoolProvider3.getViewPool()) != null) {
                viewPool3.setMaxRecycledViews(R$id.imageItemViewType, 15);
            }
            ConfiguratorReferences references2 = getReferences();
            if (references2 != null && (composerViewPoolProvider2 = references2.getComposerViewPoolProvider()) != null && (viewPool2 = composerViewPoolProvider2.getViewPool()) != null) {
                viewPool2.setMaxRecycledViews(R$id.videoItemViewType, 10);
            }
            ConfiguratorReferences references3 = getReferences();
            if (references3 != null && (composerViewPoolProvider = references3.getComposerViewPoolProvider()) != null && (viewPool = composerViewPoolProvider.getViewPool()) != null) {
                viewPool.setMaxRecycledViews(TopRightButtonProductFavoriteMoleculeViewHolder.INSTANCE.getLAYOUT_ID(), 15);
            }
        }
        fillPreCreationViewPoolIfNeeded();
        getOwner().getLifecycle().a(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.isDoubleHomeLoggingEnabled) {
            SingleInstanceLogger.INSTANCE.onInstanceCreated();
        }
        HomePageViewModel homePageViewModel = (HomePageViewModel) new z0(getActivity(), new z0.c() { // from class: ru.ozon.app.android.ui.start.HomePageConfigurator$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = HomePageConfigurator.this.vmProvider;
                HomePageViewModelImpl homePageViewModelImpl = (HomePageViewModelImpl) aVar.get();
                Intrinsics.g(homePageViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return homePageViewModelImpl;
            }
        }).a(HomePageViewModelImpl.class);
        this.viewModel = homePageViewModel;
        if (homePageViewModel != null) {
            homePageViewModel.getLaunchStateLiveData().observe(owner, new HomePageConfigurator$sam$androidx_lifecycle_Observer$0(new HomePageConfigurator$onCreate$2(this)));
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        owner.getLifecycle().e(this);
        if (this.isDoubleHomeLoggingEnabled) {
            SingleInstanceLogger.INSTANCE.onInstanceDestroyed();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.dialogHandler.removeCallbacksAndMessages(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        HomePageViewModel homePageViewModel = this.viewModel;
        if (homePageViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        homePageViewModel.checkLaunchState();
        HomePageViewModel homePageViewModel2 = this.viewModel;
        if (homePageViewModel2 != null) {
            homePageViewModel2.getProtectionAppDialog().a(owner, new HomePageConfigurator$onResume$1(this));
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }
}
