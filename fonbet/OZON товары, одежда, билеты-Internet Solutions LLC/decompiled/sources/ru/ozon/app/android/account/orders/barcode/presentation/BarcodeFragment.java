package ru.ozon.app.android.account.orders.barcode.presentation;

import A00.a;
import B90.C2612n;
import B90.C2613o;
import BZ.e;
import Dc0.j;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.Q;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import j10.InterfaceC7238a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.di.BarcodeComponent;
import ru.ozon.app.android.account.orders.barcode.di.DaggerBarcodeComponent;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.viewmodel.BarcodeViewModel;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ViewModel;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.app.android.cs_orders.databinding.FragmentBarcodeBinding;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0007*\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0004R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010SR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010TR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010M\u001a\u0004\bW\u0010X¨\u0006]²\u0006\f\u0010\\\u001a\u00020[8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Host;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "fragment", "Lru/ozon/app/android/composer/ComposerFragmentController;", "composer", "onComposerCreated", "(Landroidx/fragment/app/m;Lru/ozon/app/android/composer/ComposerFragmentController;)V", "Lru/ozon/app/android/cs_orders/databinding/FragmentBarcodeBinding;", "setUpToolbar", "(Lru/ozon/app/android/cs_orders/databinding/FragmentBarcodeBinding;)V", "", "hideCacheScreen", "switchLayouts", "(Z)V", "setUpObservers", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "viewModel", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "getViewModel", "()Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "setViewModel", "(Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;)V", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "setAppType", "(Lru/ozon/app/android/utils/AppType;)V", "LBZ/e;", "miniAppConfigHolder", "LBZ/e;", "getMiniAppConfigHolder", "()LBZ/e;", "setMiniAppConfigHolder", "(LBZ/e;)V", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;", "brightnessChanger", "Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;", "getBrightnessChanger", "()Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;", "setBrightnessChanger", "(Lru/ozon/app/android/account/orders/barcode/presentation/utils/ScreenBrightnessChanger;)V", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel;", "commonBarcodeV2ViewModel$delegate", "LSc/j;", "getCommonBarcodeV2ViewModel", "()Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel;", "commonBarcodeV2ViewModel", "binding", "Lru/ozon/app/android/cs_orders/databinding/FragmentBarcodeBinding;", "Z", "Lru/ozon/app/android/composer/ComposerFragmentController;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "barcodesComposerFragment$delegate", "getBarcodesComposerFragment", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "barcodesComposerFragment", "Companion", "LBZ/d;", "config", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeFragment extends ComponentCallbacksC5392m implements ComposerFragment.Host {
    public AppType appType;
    private FragmentBarcodeBinding binding;
    public ScreenBrightnessChanger brightnessChanger;
    private ComposerFragmentController composer;
    private boolean hideCacheScreen;
    public e miniAppConfigHolder;
    public g ozonRouter;
    public BarcodeViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: commonBarcodeV2ViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j commonBarcodeV2ViewModel = b0.b(this, N.b(CommonBarcodeV2ViewModel.class), new BarcodeFragment$special$$inlined$activityViewModels$default$1(this), new BarcodeFragment$special$$inlined$activityViewModels$default$2(null, this), new BarcodeFragment$special$$inlined$activityViewModels$default$3(this));

    /* renamed from: barcodesComposerFragment$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j barcodesComposerFragment = k.b(new BarcodeFragment$barcodesComposerFragment$2(this));

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeFragment$Companion;", "", "<init>", "()V", "TAG", "", "COMPOSER_TAG", "ARG_DEEPLINK", "ARG_TITLE_RES", "newInstance", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeFragment;", "deeplink", "titleRes", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BarcodeFragment newInstance(@NotNull String deeplink, int titleRes) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            BarcodeFragment barcodeFragment = new BarcodeFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_DEEPLINK", deeplink);
            bundle.putInt("ARG_TITLE_RES", titleRes);
            barcodeFragment.setArguments(bundle);
            return barcodeFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerFragment getBarcodesComposerFragment() {
        return (ComposerFragment) this.barcodesComposerFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonBarcodeV2ViewModel getCommonBarcodeV2ViewModel() {
        return (CommonBarcodeV2ViewModel) this.commonBarcodeV2ViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(BarcodeFragment barcodeFragment) {
        InterfaceC7851b controller;
        barcodeFragment.getViewModel().manualSwipeRefresh();
        ComposerFragmentController composerFragmentController = barcodeFragment.composer;
        if (composerFragmentController == null || (controller = composerFragmentController.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, null, 15);
    }

    private final void setUpObservers() {
        getViewModel().getViewState().observe(getViewLifecycleOwner(), new BarcodeFragment$sam$androidx_lifecycle_Observer$0(new BarcodeFragment$setUpObservers$1(this)));
    }

    private final void setUpToolbar(FragmentBarcodeBinding fragmentBarcodeBinding) {
        Y.J(fragmentBarcodeBinding.toolbar, new C2613o(this, 6));
        fragmentBarcodeBinding.toolbarTitle.setText(requireArguments().getInt("ARG_TITLE_RES"));
        fragmentBarcodeBinding.toolbarBack.setOnClickListener(new j(this, 8));
        AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int i11 = appTokensProvider.isSelect(requireContext) ? R$attr.layerFloor0 : R$attr.layerFloor1;
        LinearLayout linearLayout = fragmentBarcodeBinding.toolbar;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        linearLayout.setBackgroundColor(ThemeExtKt.themeColor(requireContext2, i11));
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        int i12 = appTokensProvider.isSelect(requireContext3) ? R$attr.textPrimaryOnDark : R$attr.textPrimary;
        AppCompatTextView appCompatTextView = fragmentBarcodeBinding.toolbarTitle;
        Context requireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(requireContext4, i12));
        Context requireContext5 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
        int i13 = appTokensProvider.isSelect(requireContext5) ? R$attr.graphicTertiaryOnDark : R$attr.graphicTertiary;
        AppCompatImageView toolbarBack = fragmentBarcodeBinding.toolbarBack;
        Intrinsics.checkNotNullExpressionValue(toolbarBack, "toolbarBack");
        Context requireContext6 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
        ThemeExtKt.tint(toolbarBack, Integer.valueOf(ThemeExtKt.themeColor(requireContext6, i13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 setUpToolbar$lambda$3(BarcodeFragment barcodeFragment, View view, C5353y0 insets) {
        InterfaceC7238a<l> composerStore;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, insets.f(1).f42127b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
        ComposerFragmentController composerFragmentController = barcodeFragment.composer;
        if (composerFragmentController != null && (composerStore = composerFragmentController.getComposerStore()) != null) {
            composerStore.c(new a.C2363d(insets));
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpToolbar$lambda$4(BarcodeFragment barcodeFragment, View view) {
        barcodeFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchLayouts(boolean hideCacheScreen) {
        this.hideCacheScreen = hideCacheScreen;
        FragmentBarcodeBinding fragmentBarcodeBinding = this.binding;
        if (fragmentBarcodeBinding != null) {
            ComposeView barcodeComposeView = fragmentBarcodeBinding.barcodeComposeView;
            Intrinsics.checkNotNullExpressionValue(barcodeComposeView, "barcodeComposeView");
            barcodeComposeView.setVisibility(hideCacheScreen ? 8 : 0);
            LinearLayout toolbar = fragmentBarcodeBinding.toolbar;
            Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
            toolbar.setVisibility(hideCacheScreen ? 8 : 0);
            FragmentContainerView composerContainer = fragmentBarcodeBinding.composerContainer;
            Intrinsics.checkNotNullExpressionValue(composerContainer, "composerContainer");
            composerContainer.setVisibility(hideCacheScreen ? 0 : 8);
        }
    }

    @NotNull
    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.n("appType");
        throw null;
    }

    @NotNull
    public final ScreenBrightnessChanger getBrightnessChanger() {
        ScreenBrightnessChanger screenBrightnessChanger = this.brightnessChanger;
        if (screenBrightnessChanger != null) {
            return screenBrightnessChanger;
        }
        Intrinsics.n("brightnessChanger");
        throw null;
    }

    @NotNull
    public final e getMiniAppConfigHolder() {
        e eVar = this.miniAppConfigHolder;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.n("miniAppConfigHolder");
        throw null;
    }

    @NotNull
    public final g getOzonRouter() {
        g gVar = this.ozonRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("ozonRouter");
        throw null;
    }

    @NotNull
    public final BarcodeViewModel getViewModel() {
        BarcodeViewModel barcodeViewModel = this.viewModel;
        if (barcodeViewModel != null) {
            return barcodeViewModel;
        }
        Intrinsics.n("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BarcodeComponent.Factory factory = DaggerBarcodeComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, BarcodeCacheComponentApi.class).getDependencyStorage();
        if (BarcodeCacheComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component BarcodeCacheComponentApi is not DiComponent");
        }
        BarcodeCacheComponentApi barcodeCacheComponentApi = (BarcodeCacheComponentApi) dependencyStorage.b(BarcodeCacheComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage2.b(NetworkComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage3.b(NavigationComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage4.b(ComposerComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage5.b(ActionComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage6.b(ContextComponentDependencies.class);
        C6740b dependencyStorage7 = C6739a.b(this, ComposerFragmentComponentDependencies.class).getDependencyStorage();
        if (ComposerFragmentComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerFragmentComponentDependencies is not DiComponent");
        }
        ComposerFragmentComponentDependencies composerFragmentComponentDependencies = (ComposerFragmentComponentDependencies) dependencyStorage7.b(ComposerFragmentComponentDependencies.class);
        C6740b dependencyStorage8 = C6739a.b(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        factory.create(barcodeCacheComponentApi, networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, composerFragmentComponentDependencies, (AndroidPlatformComponentApi) dependencyStorage8.b(AndroidPlatformComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull ComposerFragmentController composerFragmentController, i iVar) {
        ComposerFragment.Host.DefaultImpls.onComposerCreated(this, componentCallbacksC5392m, composerFragmentController, iVar);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Q p11 = getChildFragmentManager().p();
        p11.r(R$id.composerContainer, getBarcodesComposerFragment(), "COMPOSER_TAG");
        p11.k();
        getViewModel().waitForComposerPageToLoad();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentBarcodeBinding bind = FragmentBarcodeBinding.bind(inflater.inflate(R$layout.fragment_barcode, container, false));
        this.binding = bind;
        if (bind != null) {
            return bind.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        ScreenBrightnessChanger brightnessChanger = getBrightnessChanger();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        brightnessChanger.returnUserBrightness(requireActivity, true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        ScreenBrightnessChanger brightnessChanger = getBrightnessChanger();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        brightnessChanger.increaseBrightness(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentBarcodeBinding fragmentBarcodeBinding = this.binding;
        if (fragmentBarcodeBinding != null) {
            setUpToolbar(fragmentBarcodeBinding);
            fragmentBarcodeBinding.swipeRefreshLayout.setOnRefreshListener(new C2612n(this));
        }
        setUpObservers();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComposerFragmentController composer) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(composer, "composer");
        ComposerFragment.Host.DefaultImpls.onComposerCreated(this, fragment, composer);
        this.composer = composer;
        composer.getController().getEvents().observe(getViewLifecycleOwner(), new BarcodeFragment$sam$androidx_lifecycle_Observer$0(new BarcodeFragment$onComposerCreated$1(this)));
    }
}
