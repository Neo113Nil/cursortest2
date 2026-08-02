package ru.ozon.app.android.fresh.navigation;

import B90.C2614p;
import DZ.a;
import EZ.h;
import GZ.g;
import GZ.l;
import NZ.j;
import Sc.o;
import U7.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.C;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fk0.c;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.common.flags.FreshTurnOffTabBarElevationFeatureFlag;
import ru.ozon.app.android.fresh.navigation.FreshScreenState;
import ru.ozon.app.android.fresh.navigation.databinding.FragmentFreshTabBinding;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.fresh.navigation.di.components.DaggerFreshTabNavigationFragmentComponent;
import ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi;
import ru.ozon.app.android.fresh.navigation.di.components.FreshTabNavigationFragmentComponent;
import ru.ozon.app.android.fresh.navigation.tab.FreshNavigationHelper;
import ru.ozon.app.android.fresh.navigation.tab.FreshTabFragmentFactory;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.handlers.page.PdpPageInfo;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.ui.ActiveColorsConfig;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.InactiveColorsConfig;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.core.UniColors;
import wZ.C10464f;

@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b*\u0002\u0088\u0001\u0018\u0000 \u0092\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0092\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0007J)\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u0007J\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010\"J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\n\u0018\u000101j\u0004\u0018\u0001`2H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J!\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u0002092\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u00020\n2\u0006\u0010:\u001a\u0002092\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b=\u0010<J\u001d\u0010A\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002¢\u0006\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Z\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010o\u001a\u00020n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010y\u001a\u00020x8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u00020{8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u007f\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0080\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u008e\u0001\u001a\u000f\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\u00160\u008b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0093\u0001"}, d2 = {"Lru/ozon/app/android/fresh/navigation/FreshTabNavigationFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "LNZ/j;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "Lru/ozon/app/android/fresh/navigation/FreshScreenState;", "state", "setScreenState", "(Lru/ozon/app/android/fresh/navigation/FreshScreenState;)V", "Lru/ozon/app/android/fresh/navigation/FreshActivityTabBarState;", "screenState", "setTabsState", "(Lru/ozon/app/android/fresh/navigation/FreshActivityTabBarState;Landroid/os/Bundle;)V", "bindNavigator", "", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", DynamicElementDTO.TABS, "processArguments", "(Ljava/util/List;)V", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "LEZ/h;", "holder", "LEZ/h;", "getHolder", "()LEZ/h;", "setHolder", "(LEZ/h;)V", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/FreshViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel", "()LPc/a;", "setPViewModel", "(LPc/a;)V", "Lru/ozon/app/android/fresh/navigation/tab/FreshNavigationHelper;", "freshNavigationHelper", "Lru/ozon/app/android/fresh/navigation/tab/FreshNavigationHelper;", "getFreshNavigationHelper", "()Lru/ozon/app/android/fresh/navigation/tab/FreshNavigationHelper;", "setFreshNavigationHelper", "(Lru/ozon/app/android/fresh/navigation/tab/FreshNavigationHelper;)V", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "cacheHolderTabActivityDelegate", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "getCacheHolderTabActivityDelegate", "()Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "setCacheHolderTabActivityDelegate", "(Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "bottomNavigationControllerFactory", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "getBottomNavigationControllerFactory", "()Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "setBottomNavigationControllerFactory", "(Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;)V", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "pdpInBottomSheetHandler", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "getPdpInBottomSheetHandler", "()Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "setPdpInBottomSheetHandler", "(Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "bottomNavigationController", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "Lru/ozon/app/android/fresh/navigation/FreshViewModel;", "viewModel", "Lru/ozon/app/android/fresh/navigation/FreshViewModel;", "LDZ/a;", "navigator", "LDZ/a;", "", "miniAppName", "Ljava/lang/String;", "", "processCurrentIntent", "Z", "referrerMiniAppName", "Lru/ozon/app/android/fresh/navigation/databinding/FragmentFreshTabBinding;", "_binding", "Lru/ozon/app/android/fresh/navigation/databinding/FragmentFreshTabBinding;", "ru/ozon/app/android/fresh/navigation/FreshTabNavigationFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/fresh/navigation/FreshTabNavigationFragment$onBackPressedCallback$1;", "", "getPathConfig", "()Ljava/util/Map;", "pathConfig", "getShouldTurnOffTabBarElevation", "()Z", "shouldTurnOffTabBarElevation", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTabNavigationFragment extends ComponentCallbacksC5392m implements BottomNavigationStateController, BottomNavigationAnimationController, CacheHolder, j {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_MINI_APP;

    @NotNull
    private static final String EXTRA_REFERRER_MINI_APP;

    @NotNull
    private static final String clazzName;
    private FragmentFreshTabBinding _binding;
    private BottomNavigationController bottomNavigationController;
    public BottomNavigationController.Factory bottomNavigationControllerFactory;
    public CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate;
    public FreshNavigationHelper freshNavigationHelper;
    public h holder;
    private String miniAppName;
    private a navigator;

    @NotNull
    private final FreshTabNavigationFragment$onBackPressedCallback$1 onBackPressedCallback;
    public g ozonRouter;
    public Pc.a<FreshViewModelImpl> pViewModel;
    public FreshPdpInBottomSheetHandler pdpInBottomSheetHandler;
    private boolean processCurrentIntent;
    private String referrerMiniAppName;
    private FreshViewModel viewModel;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/FreshTabNavigationFragment$Companion;", "", "<init>", "()V", "", "miniAppName", "referrerMiniAppName", "deeplink", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "clazzName", "Ljava/lang/String;", "EXTRA_MINI_APP", "EXTRA_REFERRER_MINI_APP", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(@NotNull String miniAppName, String referrerMiniAppName, String deeplink) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            Bundle bundle = new Bundle();
            FreshTabNavigationFragment freshTabNavigationFragment = new FreshTabNavigationFragment();
            bundle.putString("supermarket", deeplink);
            bundle.putString(FreshTabNavigationFragment.EXTRA_MINI_APP, miniAppName);
            bundle.putString(FreshTabNavigationFragment.EXTRA_REFERRER_MINI_APP, referrerMiniAppName);
            freshTabNavigationFragment.setArguments(bundle);
            return freshTabNavigationFragment;
        }

        private Companion() {
        }
    }

    static {
        String canonicalName = FreshTabNavigationFragment.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "ru.ozon.app.android.express.presentation.ExpressTabNavigationFragment";
        }
        clazzName = canonicalName;
        EXTRA_MINI_APP = d.e(canonicalName, ".EXTRA_MINI_APP");
        EXTRA_REFERRER_MINI_APP = d.e(canonicalName, ".EXTRA_REFERRER_MINI_APP");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ru.ozon.app.android.fresh.navigation.FreshTabNavigationFragment$onBackPressedCallback$1] */
    public FreshTabNavigationFragment() {
        super(R$layout.fragment_fresh_tab);
        this.processCurrentIntent = true;
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.fresh.navigation.FreshTabNavigationFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                l.a(FreshTabNavigationFragment.this.getOzonRouter());
            }
        };
    }

    private final void bindNavigator(FreshActivityTabBarState screenState, Bundle savedInstanceState) {
        FreshTabNavigationFragment freshTabNavigationFragment;
        a aVar = this.navigator;
        if (aVar == null) {
            String string = requireArguments().getString("supermarket");
            JZ.a pageInfo = string != null ? getFreshNavigationHelper().getPageInfo(string) : null;
            if (string != null && (pageInfo instanceof PdpPageInfo)) {
                string = getPdpInBottomSheetHandler().markDeeplinkAsFreshExternal(string);
                requireArguments().putString("supermarket", string);
            }
            int i11 = R$id.rootContainer;
            NZ.h tabsConfig = screenState.getTabsConfig();
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            FreshNavigationHelper freshNavigationHelper = getFreshNavigationHelper();
            Bundle requireArguments = requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
            freshTabNavigationFragment = this;
            a aVar2 = new a(freshTabNavigationFragment, childFragmentManager, i11, tabsConfig, freshNavigationHelper.getDestination(savedInstanceState, requireArguments, string, pageInfo));
            BottomNavigationController bottomNavigationController = freshTabNavigationFragment.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            aVar2.setOnTabChangeListener(bottomNavigationController);
            aVar2.setFragmentFactory(new FreshTabFragmentFactory());
            getCacheHolderTabActivityDelegate().init(aVar2);
            freshTabNavigationFragment.navigator = aVar2;
            if (savedInstanceState == null && freshTabNavigationFragment.processCurrentIntent) {
                processArguments(screenState.getTabs());
            }
        } else {
            if (aVar == null) {
                Intrinsics.n("navigator");
                throw null;
            }
            aVar.setTabConfig(screenState.getTabsConfig());
            freshTabNavigationFragment = this;
        }
        h holder = getHolder();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        a aVar3 = freshTabNavigationFragment.navigator;
        if (aVar3 != null) {
            yZ.h.b(holder, viewLifecycleOwner, aVar3);
        } else {
            Intrinsics.n("navigator");
            throw null;
        }
    }

    private final boolean getShouldTurnOffTabBarElevation() {
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        return ((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getFeatureChecker().isEnabled(FreshTurnOffTabBarElevationFeatureFlag.INSTANCE);
    }

    private final void processArguments(List<BottomNavigationItem> tabs) {
        this.processCurrentIntent = false;
        FreshNavigationHelper freshNavigationHelper = getFreshNavigationHelper();
        Bundle requireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
        freshNavigationHelper.handleArgs(requireArguments, tabs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(FreshScreenState state) {
        FragmentFreshTabBinding fragmentFreshTabBinding = this._binding;
        if (fragmentFreshTabBinding == null) {
            return;
        }
        if (Intrinsics.d(state, FreshScreenState.Idle.INSTANCE)) {
            fragmentFreshTabBinding.screenState.showState(null);
        } else {
            if (!Intrinsics.d(state, FreshScreenState.Loading.INSTANCE)) {
                throw new o();
            }
            fragmentFreshTabBinding.screenState.showState(new ScreenState.Loading());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTabsState(FreshActivityTabBarState screenState, Bundle savedInstanceState) {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        BottomNavigationController.setItems$default(bottomNavigationController, screenState.getTabs(), null, 2, null);
        BottomNavigationController bottomNavigationController2 = this.bottomNavigationController;
        if (bottomNavigationController2 == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        ActiveColorsConfig activeColorsConfig = screenState.getActiveColorsConfig();
        UniColors uniColors = UniColors.TEXT_ORIGINALPRICE_AVAILABLE;
        bottomNavigationController2.setItemColors(activeColorsConfig, new InactiveColorsConfig(uniColors.getToken(), uniColors.getToken()));
        BottomNavigationController bottomNavigationController3 = this.bottomNavigationController;
        if (bottomNavigationController3 == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController3.init();
        bindNavigator(screenState, savedInstanceState);
        BottomNavigationController bottomNavigationController4 = this.bottomNavigationController;
        if (bottomNavigationController4 != null) {
            BottomNavigationController.setOnNavigationItemSelectedListener$default(bottomNavigationController4, 0L, new C2614p(this), 1, null);
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTabsState$lambda$1(FreshTabNavigationFragment freshTabNavigationFragment, BottomMenuItem current, BottomMenuItem old) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(old, "old");
        FreshNavigationHelper freshNavigationHelper = freshTabNavigationFragment.getFreshNavigationHelper();
        a aVar = freshTabNavigationFragment.navigator;
        if (aVar != null) {
            return freshNavigationHelper.onNavigationItemSelected(current, old, aVar);
        }
        Intrinsics.n("navigator");
        throw null;
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void addListener(@NotNull BottomNavigationAnimationStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            bottomNavigationController.addListener(listener);
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    @NotNull
    public TranslateAnimationState getBottomNavigationAnimationState() {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            return bottomNavigationController.getTranslateAnimationState();
        }
        Intrinsics.n("bottomNavigationController");
        throw null;
    }

    @NotNull
    public final BottomNavigationController.Factory getBottomNavigationControllerFactory() {
        BottomNavigationController.Factory factory = this.bottomNavigationControllerFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.n("bottomNavigationControllerFactory");
        throw null;
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
    public final Pc.a<FreshViewModelImpl> getPViewModel() {
        Pc.a<FreshViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // NZ.j
    @NotNull
    public Map<String, Integer> getPathConfig() {
        a aVar = this.navigator;
        if (aVar != null) {
            return aVar.getPathConfig();
        }
        Intrinsics.n("navigator");
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

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigation() {
        FragmentFreshTabBinding fragmentFreshTabBinding = this._binding;
        if (fragmentFreshTabBinding == null) {
            return;
        }
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController.gone();
        View separatorForDarkTheme = fragmentFreshTabBinding.separatorForDarkTheme;
        Intrinsics.checkNotNullExpressionValue(separatorForDarkTheme, "separatorForDarkTheme");
        ViewExtKt.gone(separatorForDarkTheme);
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigationWithAnimation(long duration) {
        FragmentFreshTabBinding fragmentFreshTabBinding = this._binding;
        if (fragmentFreshTabBinding == null) {
            return;
        }
        View separatorForDarkTheme = fragmentFreshTabBinding.separatorForDarkTheme;
        Intrinsics.checkNotNullExpressionValue(separatorForDarkTheme, "separatorForDarkTheme");
        ViewExtKt.gone(separatorForDarkTheme);
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            bottomNavigationController.hideWithAnimation(duration);
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void hideBottomNavigationWithTranslationAnimation(long duration) {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            bottomNavigationController.hideWithTranslationAnimation(duration);
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ComponentCallbacksC5392m w02 = getChildFragmentManager().w0();
        if (w02 != null) {
            w02.onActivityResult(requestCode, resultCode, data);
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
        this.bottomNavigationController = getBottomNavigationControllerFactory().create(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(EXTRA_MINI_APP) : null;
        Intrinsics.f(string);
        this.miniAppName = string;
        Bundle arguments2 = getArguments();
        this.referrerMiniAppName = arguments2 != null ? arguments2.getString(EXTRA_REFERRER_MINI_APP) : null;
        FreshViewModel freshViewModel = (FreshViewModel) new z0(C10464f.a(this), new z0.c() { // from class: ru.ozon.app.android.fresh.navigation.FreshTabNavigationFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FreshViewModelImpl freshViewModelImpl = FreshTabNavigationFragment.this.getPViewModel().get();
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
        if (savedInstanceState == null) {
            FreshViewModel freshViewModel2 = this.viewModel;
            if (freshViewModel2 != null) {
                freshViewModel2.downloadNewTabConfig(requireActivity().getIntent().getStringExtra("supermarket"));
            } else {
                Intrinsics.n("viewModel");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            bottomNavigationController.unbind();
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (ru.ozon.uni.android.uikit.extensions.ThemeExtKt.isDarkThemeActive(r1) == true) goto L13;
     */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        boolean z11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentFreshTabBinding bind = FragmentFreshTabBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this._binding = bind;
        if (getShouldTurnOffTabBarElevation()) {
            bind.bottomNavigation.setElevation(0.0f);
        }
        View separatorForDarkTheme = bind.separatorForDarkTheme;
        Intrinsics.checkNotNullExpressionValue(separatorForDarkTheme, "separatorForDarkTheme");
        if (!getShouldTurnOffTabBarElevation() && (r1 = getContext()) != null) {
            z11 = true;
        }
        z11 = false;
        separatorForDarkTheme.setVisibility(z11 ? 0 : 8);
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        OzonBottomNavigationView bottomNavigation = bind.bottomNavigation;
        Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
        bottomNavigationController.configureBottomView(bottomNavigation);
        FreshViewModel freshViewModel = this.viewModel;
        if (freshViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        FreshActivityTabBarState value = freshViewModel.getTabsState().getValue();
        if (value != null) {
            bindNavigator(value, savedInstanceState);
        }
        FreshViewModel freshViewModel2 = this.viewModel;
        if (freshViewModel2 == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        freshViewModel2.getTabsState().observe(getViewLifecycleOwner(), new FreshTabNavigationFragment$sam$androidx_lifecycle_Observer$0(new FreshTabNavigationFragment$onViewCreated$1(this, savedInstanceState)));
        FreshViewModel freshViewModel3 = this.viewModel;
        if (freshViewModel3 == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        freshViewModel3.getScreenState().observe(getViewLifecycleOwner(), new FreshTabNavigationFragment$sam$androidx_lifecycle_Observer$0(new FreshTabNavigationFragment$onViewCreated$2(this)));
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.onBackPressedCallback);
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void removeListener(@NotNull BottomNavigationAnimationStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            bottomNavigationController.removeListener(listener);
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void showBottomNavigation() {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            bottomNavigationController.show();
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void showBottomNavigationWithAnimation(long duration) {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            bottomNavigationController.showWithAnimation(duration);
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void showBottomNavigationWithTranslationAnimation(long duration) {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            bottomNavigationController.showWithTranslationAnimation(duration);
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }
}
