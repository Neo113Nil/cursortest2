package ru.ozon.app.android.fakeOzon.tab;

import E.D;
import EZ.h;
import GZ.g;
import GZ.l;
import NZ.a;
import OZ.e;
import OZ.f;
import Sc.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.C;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.G;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fk0.c;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fakeOzon.di.DaggerFakeMainTabNavigationFragmentComponent;
import ru.ozon.app.android.fakeOzon.di.FakeMainTabNavigationFragmentComponent;
import ru.ozon.app.android.fakeOzon.tab.FakeMainState;
import ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.handlers.page.CategoryPageInfo;
import ru.ozon.app.android.navigation.handlers.page.PdpPageInfo;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storefront.feature.miniapp.R$id;
import ru.ozon.app.android.storefront.feature.miniapp.databinding.FragmentFakeozonTabNavigationBinding;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.LocalTabConfig;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.tabbar.ui.behavior.FragmentContainerBehavior;
import ru.ozon.app.android.tabbar.ui.behavior.OffsetExtensionsKt;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;
import ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import wZ.C10464f;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n*\u0006\u0088\u0001\u008e\u0001\u0091\u0001\b\u0000\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u009d\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0007J\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0007J\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010 J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b1\u00102J\u0011\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\n\u0018\u000106j\u0004\u0018\u0001`7H\u0016¢\u0006\u0004\b8\u00109J)\u0010>\u001a\u00020\n2\u0006\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010\u0007J\u000f\u0010A\u001a\u00020\nH\u0016¢\u0006\u0004\bA\u0010\u0007J\u000f\u0010B\u001a\u00020\nH\u0002¢\u0006\u0004\bB\u0010\u0007J!\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\bE\u0010FJ!\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u00020G2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bK\u0010LJ)\u0010S\u001a\u00020R2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020M2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020R2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0002¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u0004\u0018\u00010W2\b\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\bX\u0010YJ\u0019\u0010[\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b[\u0010\u0010R\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010d\u001a\u00020c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010r\u001a\u00020q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR(\u0010z\u001a\b\u0012\u0004\u0012\u00020y0x8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R$\u0010\u0095\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0099\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u008b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009e\u0001"}, d2 = {"Lru/ozon/app/android/fakeOzon/tab/FakeOzonTabNavigationFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "", "offset", "setBottomOffset", "(I)V", "setMaxBottomOffset", "getMaxBottomOffset", "()I", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroyView", "onDetach", "initBehavior", "Lru/ozon/app/android/fakeOzon/tab/FakeMainState$Success;", "state", "handleSuccessfulState", "(Lru/ozon/app/android/fakeOzon/tab/FakeMainState$Success;Landroid/os/Bundle;)V", "Lru/ozon/app/android/tabbar/data/TabConfig;", "config", "bindNavigator", "(Lru/ozon/app/android/tabbar/data/TabConfig;Landroid/os/Bundle;)V", "bindBottomNavigation", "(Lru/ozon/app/android/tabbar/data/TabConfig;)V", "Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", "current", "old", "", "deeplink", "", "navigateTab", "(Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Ljava/lang/String;)Z", "onNavigationItemSelected", "(Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;)Z", "LOZ/f;", "getDestination", "(Ljava/lang/String;Landroid/os/Bundle;)LOZ/f;", "arguments", "handleArguments", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "setNavigatorHolder", "(LEZ/h;)V", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "cacheHolderTabActivityDelegate", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "getCacheHolderTabActivityDelegate", "()Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "setCacheHolderTabActivityDelegate", "(Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "bottomNavigationControllerFactory", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "getBottomNavigationControllerFactory", "()Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "setBottomNavigationControllerFactory", "(Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;)V", "LPc/a;", "Lru/ozon/app/android/fakeOzon/tab/FakeMainViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider$miniapp_prodGoogleAllVendorsRelease", "()LPc/a;", "setViewModelProvider$miniapp_prodGoogleAllVendorsRelease", "(LPc/a;)V", "miniAppName", "Ljava/lang/String;", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "bottomNavigationController", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "LNZ/a;", "navigator", "LNZ/a;", "ru/ozon/app/android/fakeOzon/tab/FakeOzonTabNavigationFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/fakeOzon/tab/FakeOzonTabNavigationFragment$onBackPressedCallback$1;", "Lru/ozon/app/android/storefront/feature/miniapp/databinding/FragmentFakeozonTabNavigationBinding;", "_binding", "Lru/ozon/app/android/storefront/feature/miniapp/databinding/FragmentFakeozonTabNavigationBinding;", "ru/ozon/app/android/fakeOzon/tab/FakeOzonTabNavigationFragment$tabFragmentListener$1", "tabFragmentListener", "Lru/ozon/app/android/fakeOzon/tab/FakeOzonTabNavigationFragment$tabFragmentListener$1;", "ru/ozon/app/android/fakeOzon/tab/FakeOzonTabNavigationFragment$tabChildFragmentListener$1", "tabChildFragmentListener", "Lru/ozon/app/android/fakeOzon/tab/FakeOzonTabNavigationFragment$tabChildFragmentListener$1;", "Ljava/util/WeakHashMap;", "childFragments", "Ljava/util/WeakHashMap;", "getViewModel", "()Lru/ozon/app/android/fakeOzon/tab/FakeMainViewModel;", "viewModel", "getBinding", "()Lru/ozon/app/android/storefront/feature/miniapp/databinding/FragmentFakeozonTabNavigationBinding;", "binding", "Companion", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeOzonTabNavigationFragment extends ComponentCallbacksC5392m implements BottomNavigationStateController, BottomNavigationAnimationController, CacheHolder, ExternalOffsetHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentFakeozonTabNavigationBinding _binding;
    private BottomNavigationController bottomNavigationController;
    public BottomNavigationController.Factory bottomNavigationControllerFactory;
    public CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate;
    private String miniAppName;
    private a navigator;
    public h navigatorHolder;
    public g router;
    public Pc.a<FakeMainViewModel> viewModelProvider;

    @NotNull
    private final FakeOzonTabNavigationFragment$onBackPressedCallback$1 onBackPressedCallback = new C() { // from class: ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment$onBackPressedCallback$1
        {
            super(true);
        }

        @Override // androidx.activity.C
        public void handleOnBackPressed() {
            l.a(FakeOzonTabNavigationFragment.this.getRouter());
        }
    };

    @NotNull
    private final FakeOzonTabNavigationFragment$tabFragmentListener$1 tabFragmentListener = new G.m() { // from class: ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment$tabFragmentListener$1
        @Override // androidx.fragment.app.G.m
        public void onFragmentAttached(G manager, ComponentCallbacksC5392m fragment, Context context) {
            FakeOzonTabNavigationFragment$tabChildFragmentListener$1 fakeOzonTabNavigationFragment$tabChildFragmentListener$1;
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(context, "context");
            super.onFragmentAttached(manager, fragment, context);
            G childFragmentManager = fragment.getChildFragmentManager();
            fakeOzonTabNavigationFragment$tabChildFragmentListener$1 = FakeOzonTabNavigationFragment.this.tabChildFragmentListener;
            childFragmentManager.Y0(fakeOzonTabNavigationFragment$tabChildFragmentListener$1, false);
        }

        @Override // androidx.fragment.app.G.m
        public void onFragmentDetached(G manager, ComponentCallbacksC5392m fragment) {
            FakeOzonTabNavigationFragment$tabChildFragmentListener$1 fakeOzonTabNavigationFragment$tabChildFragmentListener$1;
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            super.onFragmentDetached(manager, fragment);
            G childFragmentManager = fragment.getChildFragmentManager();
            fakeOzonTabNavigationFragment$tabChildFragmentListener$1 = FakeOzonTabNavigationFragment.this.tabChildFragmentListener;
            childFragmentManager.t1(fakeOzonTabNavigationFragment$tabChildFragmentListener$1);
        }
    };

    @NotNull
    private final FakeOzonTabNavigationFragment$tabChildFragmentListener$1 tabChildFragmentListener = new G.m() { // from class: ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment$tabChildFragmentListener$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.G.m
        public void onFragmentViewCreated(G manager, ComponentCallbacksC5392m fragment, View view, Bundle savedInstanceState) {
            WeakHashMap weakHashMap;
            FragmentFakeozonTabNavigationBinding binding;
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(view, "view");
            super.onFragmentViewCreated(manager, fragment, view, savedInstanceState);
            weakHashMap = FakeOzonTabNavigationFragment.this.childFragments;
            weakHashMap.put(fragment, null);
            ExternalOffsetHandler externalOffsetHandler = fragment instanceof ExternalOffsetHandler ? (ExternalOffsetHandler) fragment : null;
            if (externalOffsetHandler != null) {
                binding = FakeOzonTabNavigationFragment.this.getBinding();
                externalOffsetHandler.setMaxBottomOffset(binding.bottomNavigation.getMeasuredHeight());
            }
        }

        @Override // androidx.fragment.app.G.m
        public void onFragmentViewDestroyed(G manager, ComponentCallbacksC5392m fragment) {
            WeakHashMap weakHashMap;
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            super.onFragmentViewDestroyed(manager, fragment);
            weakHashMap = FakeOzonTabNavigationFragment.this.childFragments;
            weakHashMap.remove(fragment);
        }
    };

    @NotNull
    private final WeakHashMap<ComponentCallbacksC5392m, Unit> childFragments = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fakeOzon/tab/FakeOzonTabNavigationFragment$Companion;", "", "<init>", "()V", "", "miniAppName", "redirectDeeplink", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "EXTRA_MINI_APP", "Ljava/lang/String;", "EXTRA_REDIRECT_DESTINATION", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(@NotNull String miniAppName, String redirectDeeplink) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment = new FakeOzonTabNavigationFragment();
            fakeOzonTabNavigationFragment.setArguments(d.b(new Pair("ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment.EXTRA_MINI_APP", miniAppName), new Pair("ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment.EXTRA_REDIRECT_DESTINATION", redirectDeeplink)));
            return fakeOzonTabNavigationFragment;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [Ns.c] */
    private final void bindBottomNavigation(TabConfig config) {
        D d11;
        if (config instanceof RemoteTabConfig) {
            RemoteTabConfig remoteTabConfig = (RemoteTabConfig) config;
            final List<BottomNavigationItem> tabItems = remoteTabConfig.getTabItems();
            BottomNavigationController bottomNavigationController = this.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            BottomNavigationController.setItemColors$default(bottomNavigationController, remoteTabConfig.getActiveColorsConfig(), null, 2, null);
            BottomNavigationController bottomNavigationController2 = this.bottomNavigationController;
            if (bottomNavigationController2 == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            BottomNavigationController.setItems$default(bottomNavigationController2, tabItems, null, 2, null);
            d11 = new OnBottomNavigationItemSelectedListener() { // from class: Ns.c
                @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
                public final boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
                    boolean bindBottomNavigation$lambda$8;
                    bindBottomNavigation$lambda$8 = FakeOzonTabNavigationFragment.bindBottomNavigation$lambda$8(tabItems, this, bottomMenuItem, bottomMenuItem2);
                    return bindBottomNavigation$lambda$8;
                }
            };
        } else {
            if (!(config instanceof LocalTabConfig)) {
                throw new o();
            }
            d11 = new D((LocalTabConfig) config, this);
        }
        BottomNavigationController bottomNavigationController3 = this.bottomNavigationController;
        if (bottomNavigationController3 == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController3.init();
        BottomNavigationController bottomNavigationController4 = this.bottomNavigationController;
        if (bottomNavigationController4 != null) {
            BottomNavigationController.setOnNavigationItemSelectedListener$default(bottomNavigationController4, 0L, d11, 1, null);
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindBottomNavigation$lambda$8(List list, FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment, BottomMenuItem current, BottomMenuItem old) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(old, "old");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) it.next();
            if (bottomNavigationItem.getId() == current.getId()) {
                return fakeOzonTabNavigationFragment.navigateTab(current, old, bottomNavigationItem.getDeeplink());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindBottomNavigation$lambda$9(TabConfig tabConfig, FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment, BottomMenuItem current, BottomMenuItem old) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(old, "old");
        return fakeOzonTabNavigationFragment.navigateTab(current, old, ((LocalTabConfig) tabConfig).getTabNavigatorConfig().b().get(Integer.valueOf(current.getId())));
    }

    private final void bindNavigator(TabConfig config, Bundle savedInstanceState) {
        f fVar;
        FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment.EXTRA_REDIRECT_DESTINATION") : null;
        a aVar = this.navigator;
        if (aVar == null) {
            int i11 = R$id.rootContainer;
            NZ.h tabNavigatorConfig = config.getTabNavigatorConfig();
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            f destination = getDestination(string, savedInstanceState);
            if (destination != null) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    arguments2.remove("ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment.EXTRA_REDIRECT_DESTINATION");
                }
                fVar = destination;
            } else {
                fVar = null;
            }
            fakeOzonTabNavigationFragment = this;
            DZ.a aVar2 = new DZ.a(fakeOzonTabNavigationFragment, childFragmentManager, i11, tabNavigatorConfig, fVar);
            BottomNavigationController bottomNavigationController = fakeOzonTabNavigationFragment.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            aVar2.setOnTabChangeListener(bottomNavigationController);
            getCacheHolderTabActivityDelegate().init(aVar2);
            fakeOzonTabNavigationFragment.navigator = aVar2;
        } else {
            if (aVar == null) {
                Intrinsics.n("navigator");
                throw null;
            }
            aVar.setTabConfig(config.getTabNavigatorConfig());
            fakeOzonTabNavigationFragment = this;
        }
        h navigatorHolder = getNavigatorHolder();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        a aVar3 = fakeOzonTabNavigationFragment.navigator;
        if (aVar3 == null) {
            Intrinsics.n("navigator");
            throw null;
        }
        yZ.h.b(navigatorHolder, viewLifecycleOwner, aVar3);
        if (savedInstanceState == null) {
            handleArguments(getArguments());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentFakeozonTabNavigationBinding getBinding() {
        FragmentFakeozonTabNavigationBinding fragmentFakeozonTabNavigationBinding = this._binding;
        if (fragmentFakeozonTabNavigationBinding != null) {
            return fragmentFakeozonTabNavigationBinding;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final f getDestination(String deeplink, Bundle savedInstanceState) {
        if (savedInstanceState != null || deeplink == null) {
            return null;
        }
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        JZ.a a11 = ((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).getDeeplinkPageResolver().a(deeplink);
        if ((a11 instanceof PdpPageInfo) || (a11 instanceof CategoryPageInfo)) {
            return new OZ.d((int) System.nanoTime(), deeplink);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FakeMainViewModel getViewModel() {
        w0 a11 = new z0(C10464f.a(this), new z0.c() { // from class: ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment$special$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FakeMainViewModel fakeMainViewModel = FakeOzonTabNavigationFragment.this.getViewModelProvider$miniapp_prodGoogleAllVendorsRelease().get();
                Intrinsics.g(fakeMainViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return fakeMainViewModel;
            }
        }).a(FakeMainViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return (FakeMainViewModel) a11;
    }

    private final void handleArguments(Bundle arguments) {
        String string;
        if (arguments == null || (string = arguments.getString("ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment.EXTRA_REDIRECT_DESTINATION")) == null) {
            return;
        }
        arguments.remove("ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment.EXTRA_REDIRECT_DESTINATION");
        if (kotlin.text.h.K(string)) {
            return;
        }
        g.a.a(getRouter(), string, null, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessfulState(FakeMainState.Success state, Bundle savedInstanceState) {
        getBinding().screenState.showState(null);
        CoordinatorLayout contentCl = getBinding().contentCl;
        Intrinsics.checkNotNullExpressionValue(contentCl, "contentCl");
        ViewExtKt.show(contentCl);
        RemoteTabConfig config = state.getConfig();
        bindBottomNavigation(config);
        bindNavigator(config, savedInstanceState);
    }

    private final void initBehavior() {
        FragmentContainerView rootContainer = getBinding().rootContainer;
        Intrinsics.checkNotNullExpressionValue(rootContainer, "rootContainer");
        ViewGroup.LayoutParams layoutParams = rootContainer.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            layoutParams = null;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        Object c11 = fVar != null ? fVar.c() : null;
        FragmentContainerBehavior fragmentContainerBehavior = c11 instanceof FragmentContainerBehavior ? (FragmentContainerBehavior) c11 : null;
        if (fragmentContainerBehavior != null) {
            fragmentContainerBehavior.setExternalOffsetHandler(this);
        }
    }

    private final boolean navigateTab(BottomMenuItem current, BottomMenuItem old, String deeplink) {
        if (current.getBehavior() != BottomNavigationBehavior.BEHAVIOR_TYPE_REDIRECT || deeplink == null) {
            return onNavigationItemSelected(current, old);
        }
        g.a.a(getRouter(), deeplink, null, null, 6);
        return false;
    }

    private final boolean onNavigationItemSelected(BottomMenuItem current, BottomMenuItem old) {
        if (!Intrinsics.d(current, old)) {
            a aVar = this.navigator;
            if (aVar != null) {
                EZ.g.navigate$default(aVar, EZ.f.a(new e(current.getId(), null)), 0, 2, null);
                return true;
            }
            Intrinsics.n("navigator");
            throw null;
        }
        a aVar2 = this.navigator;
        if (aVar2 == null) {
            Intrinsics.n("navigator");
            throw null;
        }
        NZ.g activeTabOrNull = aVar2.activeTabOrNull();
        if (activeTabOrNull == null || activeTabOrNull.clearBackStack()) {
            return true;
        }
        activeTabOrNull.scrollToTop();
        return true;
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

    @Override // ru.ozon.app.android.uikit.container.ExternalOffsetHandler
    public int getMaxBottomOffset() {
        return getBinding().bottomNavigation.getMeasuredHeight();
    }

    @NotNull
    public final h getNavigatorHolder() {
        h hVar = this.navigatorHolder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("navigatorHolder");
        throw null;
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool */
    public RecycledAtomPool getAtomPool() {
        return getCacheHolderTabActivityDelegate().getAtomPool();
    }

    @NotNull
    public final g getRouter() {
        g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @NotNull
    public final Pc.a<FakeMainViewModel> getViewModelProvider$miniapp_prodGoogleAllVendorsRelease() {
        Pc.a<FakeMainViewModel> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewModelProvider");
        throw null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public c getPrefetchViewPool() {
        return getCacheHolderTabActivityDelegate().getPrefetchViewPool();
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigation() {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController.gone();
        setBottomOffset(0);
        setMaxBottomOffset(0);
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigationWithAnimation(long duration) {
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
        FakeMainTabNavigationFragmentComponent.Factory factory = DaggerFakeMainTabNavigationFragmentComponent.factory();
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
        C6740b dependencyStorage4 = C6739a.b(this, TabsUiControllerComponentApi.class).getDependencyStorage();
        if (TabsUiControllerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsUiControllerComponentApi is not DiComponent");
        }
        TabsUiControllerComponentApi tabsUiControllerComponentApi = (TabsUiControllerComponentApi) dependencyStorage4.b(TabsUiControllerComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, CartServiceApi.class).getDependencyStorage();
        if (CartServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartServiceApi is not DiComponent");
        }
        CartServiceApi cartServiceApi = (CartServiceApi) dependencyStorage5.b(CartServiceApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage6.b(NetworkComponentApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, AndroidPlatformComponentDependencies.class).getDependencyStorage();
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        factory.create(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, cartServiceApi, networkComponentApi, (AndroidPlatformComponentDependencies) dependencyStorage7.b(AndroidPlatformComponentDependencies.class)).inject(this);
        super.onAttach(context);
        getChildFragmentManager().Y0(this.tabFragmentListener, false);
        this.bottomNavigationController = getBottomNavigationControllerFactory().create(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment.EXTRA_MINI_APP") : null;
        Intrinsics.f(string);
        this.miniAppName = string;
        FakeMainViewModel viewModel = getViewModel();
        M4.c savedStateRegistry = getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "<get-savedStateRegistry>(...)");
        viewModel.init(savedStateRegistry);
        if (savedInstanceState == null) {
            FakeMainViewModel viewModel2 = getViewModel();
            String str = this.miniAppName;
            if (str != null) {
                viewModel2.getTabConfig(str);
            } else {
                Intrinsics.n("miniAppName");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentFakeozonTabNavigationBinding.inflate(inflater, null, false);
        FrameLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController.unbind();
        this._binding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDetach() {
        getChildFragmentManager().t1(this.tabFragmentListener);
        super.onDetach();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().screenState.setListener(new FakeOzonTabNavigationFragment$onViewCreated$1(this));
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        OzonBottomNavigationView bottomNavigation = getBinding().bottomNavigation;
        Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
        bottomNavigationController.configureBottomView(bottomNavigation);
        LiveDataOperatorsKt.distinct(getViewModel().getState()).observe(getViewLifecycleOwner(), new FakeOzonTabNavigationFragment$sam$androidx_lifecycle_Observer$0(new FakeOzonTabNavigationFragment$onViewCreated$2(this, savedInstanceState)));
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.onBackPressedCallback);
        initBehavior();
        final OzonBottomNavigationView ozonBottomNavigationView = getBinding().bottomNavigation;
        ozonBottomNavigationView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment$onViewCreated$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (ozonBottomNavigationView.getMeasuredWidth() <= 0 || ozonBottomNavigationView.getMeasuredHeight() <= 0) {
                    return;
                }
                ozonBottomNavigationView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.setMaxBottomOffset(((OzonBottomNavigationView) ozonBottomNavigationView).getMeasuredHeight());
            }
        });
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.uikit.container.ExternalOffsetHandler
    public void setBottomOffset(int offset) {
        View view;
        Iterator<Map.Entry<ComponentCallbacksC5392m, Unit>> it = this.childFragments.entrySet().iterator();
        while (it.hasNext()) {
            ComponentCallbacksC5392m key = it.next().getKey();
            if (key instanceof ExternalOffsetHandler) {
                ((ExternalOffsetHandler) key).setBottomOffset(offset);
            } else if (!(key instanceof DialogInterfaceOnCancelListenerC5390k) && (view = key.getView()) != null) {
                OffsetExtensionsKt.safeUpdateBottomMargin(view, offset);
            }
        }
    }

    @Override // ru.ozon.app.android.uikit.container.ExternalOffsetHandler
    public void setMaxBottomOffset(int offset) {
        Iterator<Map.Entry<ComponentCallbacksC5392m, Unit>> it = this.childFragments.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC5431s interfaceC5431s = (ComponentCallbacksC5392m) it.next().getKey();
            ExternalOffsetHandler externalOffsetHandler = interfaceC5431s instanceof ExternalOffsetHandler ? (ExternalOffsetHandler) interfaceC5431s : null;
            if (externalOffsetHandler != null) {
                externalOffsetHandler.setMaxBottomOffset(offset);
            }
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void showBottomNavigation() {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController.show();
        FragmentFakeozonTabNavigationBinding fragmentFakeozonTabNavigationBinding = this._binding;
        if (fragmentFakeozonTabNavigationBinding != null) {
            setMaxBottomOffset(fragmentFakeozonTabNavigationBinding.bottomNavigation.getMeasuredHeight());
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
