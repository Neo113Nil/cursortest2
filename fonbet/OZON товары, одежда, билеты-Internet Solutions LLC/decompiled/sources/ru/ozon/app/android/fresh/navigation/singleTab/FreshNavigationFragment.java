package ru.ozon.app.android.fresh.navigation.singleTab;

import C.h0;
import EZ.h;
import GZ.g;
import GZ.l;
import Pc.a;
import Sc.o;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.activity.C;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import fk0.c;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.navigation.FreshScreenState;
import ru.ozon.app.android.fresh.navigation.FreshViewModel;
import ru.ozon.app.android.fresh.navigation.FreshViewModelImpl;
import ru.ozon.app.android.fresh.navigation.R$layout;
import ru.ozon.app.android.fresh.navigation.databinding.FragmentFreshNavigationBinding;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.fresh.navigation.di.components.DaggerFreshTabNavigationFragmentComponent;
import ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi;
import ru.ozon.app.android.fresh.navigation.di.components.FreshTabNavigationFragmentComponent;
import ru.ozon.app.android.fresh.navigation.tab.FreshNavigationHelper;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.handlers.page.PdpPageInfo;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import wZ.C10464f;

@Metadata(d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001Y\b\u0000\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0004J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0004R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lru/ozon/app/android/fresh/navigation/singleTab/FreshNavigationFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "<init>", "()V", "Lru/ozon/app/android/fresh/navigation/FreshScreenState;", "state", "", "setScreenState", "(Lru/ozon/app/android/fresh/navigation/FreshScreenState;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "shouldOpenMainPage", "(Landroid/os/Bundle;)Z", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "handleRedirect", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "LEZ/h;", "holder", "LEZ/h;", "getHolder", "()LEZ/h;", "setHolder", "(LEZ/h;)V", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/FreshViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel", "()LPc/a;", "setPViewModel", "(LPc/a;)V", "Lru/ozon/app/android/fresh/navigation/singleTab/FreshFragmentNavigator;", "navigator", "Lru/ozon/app/android/fresh/navigation/singleTab/FreshFragmentNavigator;", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "cacheHolderTabActivityDelegate", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "getCacheHolderTabActivityDelegate", "()Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "setCacheHolderTabActivityDelegate", "(Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;)V", "Lru/ozon/app/android/fresh/navigation/tab/FreshNavigationHelper;", "freshNavigationHelper", "Lru/ozon/app/android/fresh/navigation/tab/FreshNavigationHelper;", "getFreshNavigationHelper", "()Lru/ozon/app/android/fresh/navigation/tab/FreshNavigationHelper;", "setFreshNavigationHelper", "(Lru/ozon/app/android/fresh/navigation/tab/FreshNavigationHelper;)V", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "pdpInBottomSheetHandler", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "getPdpInBottomSheetHandler", "()Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "setPdpInBottomSheetHandler", "(Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lru/ozon/app/android/fresh/navigation/FreshViewModel;", "viewModel", "Lru/ozon/app/android/fresh/navigation/FreshViewModel;", "Lru/ozon/app/android/fresh/navigation/databinding/FragmentFreshNavigationBinding;", "_binding", "Lru/ozon/app/android/fresh/navigation/databinding/FragmentFreshNavigationBinding;", "ru/ozon/app/android/fresh/navigation/singleTab/FreshNavigationFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/fresh/navigation/singleTab/FreshNavigationFragment$onBackPressedCallback$1;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshNavigationFragment extends ComponentCallbacksC5392m implements CacheHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentFreshNavigationBinding _binding;
    public CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate;
    public FreshNavigationHelper freshNavigationHelper;

    @NotNull
    private final Handler handler;
    public h holder;
    private FreshFragmentNavigator navigator;

    @NotNull
    private final FreshNavigationFragment$onBackPressedCallback$1 onBackPressedCallback;
    public g ozonRouter;
    public a<FreshViewModelImpl> pViewModel;
    public FreshPdpInBottomSheetHandler pdpInBottomSheetHandler;
    private FreshViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/singleTab/FreshNavigationFragment$Companion;", "", "<init>", "()V", "newInstance", "Lru/ozon/app/android/fresh/navigation/singleTab/FreshNavigationFragment;", "deeplink", "", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FreshNavigationFragment newInstance(String deeplink) {
            FreshNavigationFragment freshNavigationFragment = new FreshNavigationFragment();
            Bundle bundle = new Bundle();
            bundle.putString("supermarket", deeplink);
            freshNavigationFragment.setArguments(bundle);
            return freshNavigationFragment;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ru.ozon.app.android.fresh.navigation.singleTab.FreshNavigationFragment$onBackPressedCallback$1] */
    public FreshNavigationFragment() {
        super(R$layout.fragment_fresh_navigation);
        this.handler = new Handler(Looper.getMainLooper());
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.fresh.navigation.singleTab.FreshNavigationFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                l.a(FreshNavigationFragment.this.getOzonRouter());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleRedirect$lambda$1(FreshNavigationFragment freshNavigationFragment, String str) {
        g.a.a(freshNavigationFragment.getOzonRouter(), freshNavigationFragment.getPdpInBottomSheetHandler().markDeeplinkAsFreshExternal(str), null, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(FreshScreenState state) {
        ScreenState.Loading loading;
        FragmentFreshNavigationBinding fragmentFreshNavigationBinding = this._binding;
        if (fragmentFreshNavigationBinding == null) {
            return;
        }
        if (Intrinsics.d(state, FreshScreenState.Idle.INSTANCE)) {
            loading = null;
        } else {
            if (!Intrinsics.d(state, FreshScreenState.Loading.INSTANCE)) {
                throw new o();
            }
            loading = new ScreenState.Loading();
        }
        fragmentFreshNavigationBinding.screenState.showState(loading);
    }

    private final boolean shouldOpenMainPage(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            return false;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("supermarket") : null;
        return ((string != null ? getFreshNavigationHelper().getPageInfo(string) : null) instanceof PdpPageInfo) && getPdpInBottomSheetHandler().shouldOpenInBottomSheet(false, true);
    }

    @NotNull
    public final CacheHolderTabActivityDelegate getCacheHolderTabActivityDelegate() {
        CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate = this.cacheHolderTabActivityDelegate;
        if (cacheHolderTabActivityDelegate != null) {
            return cacheHolderTabActivityDelegate;
        }
        Intrinsics.n("cacheHolderTabActivityDelegate");
        throw null;
    }

    @NotNull
    public final FreshNavigationHelper getFreshNavigationHelper() {
        FreshNavigationHelper freshNavigationHelper = this.freshNavigationHelper;
        if (freshNavigationHelper != null) {
            return freshNavigationHelper;
        }
        Intrinsics.n("freshNavigationHelper");
        throw null;
    }

    @NotNull
    public final h getHolder() {
        h hVar = this.holder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("holder");
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
    public final a<FreshViewModelImpl> getPViewModel() {
        a<FreshViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @NotNull
    public final FreshPdpInBottomSheetHandler getPdpInBottomSheetHandler() {
        FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler = this.pdpInBottomSheetHandler;
        if (freshPdpInBottomSheetHandler != null) {
            return freshPdpInBottomSheetHandler;
        }
        Intrinsics.n("pdpInBottomSheetHandler");
        throw null;
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool */
    public RecycledAtomPool getAtomPool() {
        return getCacheHolderTabActivityDelegate().getAtomPool();
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public c getPrefetchViewPool() {
        return getCacheHolderTabActivityDelegate().getPrefetchViewPool();
    }

    public final void handleRedirect() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("supermarket") : null;
        if (string != null) {
            this.handler.post(new h0(6, this, string));
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("supermarket");
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FreshTabNavigationFragmentComponent.Factory factory = DaggerFreshTabNavigationFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage.b(ContextComponentDependencies.class);
        C6740b dependencyStorage2 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, TabsComponentApi.class).getDependencyStorage();
        if (TabsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsComponentApi is not DiComponent");
        }
        TabsComponentApi tabsComponentApi = (TabsComponentApi) dependencyStorage3.b(TabsComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage4.b(ComposerComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, FreshNavigationComponentApi.class).getDependencyStorage();
        if (FreshNavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FreshNavigationComponentApi is not DiComponent");
        }
        FreshNavigationComponentApi freshNavigationComponentApi = (FreshNavigationComponentApi) dependencyStorage5.b(FreshNavigationComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage6.b(AnalyticsComponentApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, CartServiceApi.class).getDependencyStorage();
        if (CartServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartServiceApi is not DiComponent");
        }
        CartServiceApi cartServiceApi = (CartServiceApi) dependencyStorage7.b(CartServiceApi.class);
        C6740b dependencyStorage8 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage8.b(NetworkComponentApi.class);
        C6740b dependencyStorage9 = C6739a.b(this, TabsUiControllerComponentApi.class).getDependencyStorage();
        if (TabsUiControllerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsUiControllerComponentApi is not DiComponent");
        }
        TabsUiControllerComponentApi tabsUiControllerComponentApi = (TabsUiControllerComponentApi) dependencyStorage9.b(TabsUiControllerComponentApi.class);
        C6740b dependencyStorage10 = C6739a.b(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) dependencyStorage10.b(AnalyticsScreenStorageComponentApi.class);
        C6740b dependencyStorage11 = C6739a.b(this, AndroidPlatformComponentDependencies.class).getDependencyStorage();
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        factory.create(contextComponentDependencies, navigationComponentApi, tabsComponentApi, composerComponentApi, freshNavigationComponentApi, analyticsComponentApi, cartServiceApi, networkComponentApi, tabsUiControllerComponentApi, analyticsScreenStorageComponentApi, (AndroidPlatformComponentDependencies) dependencyStorage11.b(AndroidPlatformComponentDependencies.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FreshViewModel freshViewModel = (FreshViewModel) new z0(C10464f.a(this), new z0.c() { // from class: ru.ozon.app.android.fresh.navigation.singleTab.FreshNavigationFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FreshViewModelImpl freshViewModelImpl = FreshNavigationFragment.this.getPViewModel().get();
                Intrinsics.g(freshViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return freshViewModelImpl;
            }
        }).a(FreshViewModelImpl.class);
        this.viewModel = freshViewModel;
        if (freshViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        M4.c savedStateRegistry = getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "<get-savedStateRegistry>(...)");
        freshViewModel.init(savedStateRegistry);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this._binding = FragmentFreshNavigationBinding.bind(view);
        this.navigator = new FreshFragmentNavigator(this, shouldOpenMainPage(savedInstanceState));
        h holder = getHolder();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        FreshFragmentNavigator freshFragmentNavigator = this.navigator;
        if (freshFragmentNavigator == null) {
            Intrinsics.n("navigator");
            throw null;
        }
        yZ.h.b(holder, viewLifecycleOwner, freshFragmentNavigator);
        FreshViewModel freshViewModel = this.viewModel;
        if (freshViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        freshViewModel.getScreenState().observe(getViewLifecycleOwner(), new FreshNavigationFragment$sam$androidx_lifecycle_Observer$0(new FreshNavigationFragment$onViewCreated$1(this)));
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner2, this.onBackPressedCallback);
        handleRedirect();
    }
}
