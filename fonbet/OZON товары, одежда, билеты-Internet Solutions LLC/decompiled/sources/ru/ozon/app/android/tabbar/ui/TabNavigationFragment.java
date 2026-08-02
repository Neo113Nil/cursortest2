package ru.ozon.app.android.tabbar.ui;

import Ae.C2399j;
import Ae.C2408n0;
import EZ.h;
import GZ.g;
import GZ.l;
import NZ.a;
import OZ.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import aM.f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.C;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.DaggerTabNavigationFragmentComponent;
import ru.ozon.app.android.di.TabNavigationFragmentComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.TabConfigViewModel;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.LocalTabConfig;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.TabNavigationFragment;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.behavior.FragmentContainerBehavior;
import ru.ozon.app.android.tabbar.ui.behavior.OffsetExtensionsKt;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0006\u0089\u0001\u0095\u0001\u0098\u0001\b&\u0018\u0000 ¦\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002¦\u0001B\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\fJ\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b)\u0010'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J\u0017\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\tJ\u0017\u00105\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\tJ\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<H\u0016¢\u0006\u0004\b=\u0010>J)\u0010C\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\bE\u0010\fJ\u000f\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010\fJ\u0011\u0010H\u001a\u0004\u0018\u00010GH\u0014¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\nH\u0002¢\u0006\u0004\bJ\u0010\fJ\u0019\u0010L\u001a\u00020\n2\b\u0010K\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bL\u0010\u0019J\u0017\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020GH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010M\u001a\u00020GH\u0002¢\u0006\u0004\bP\u0010OJ)\u0010W\u001a\u00020V2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020Q2\b\u0010U\u001a\u0004\u0018\u00010TH\u0002¢\u0006\u0004\bW\u0010XJ\u001f\u0010Y\u001a\u00020V2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020QH\u0002¢\u0006\u0004\bY\u0010ZR\"\u0010\\\u001a\u00020[8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010c\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR(\u0010k\u001a\b\u0012\u0004\u0012\u00020j0i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010r\u001a\u00020q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R)\u0010\u0080\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010M\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010\u008c\u0001R \u0010\u0091\u0001\u001a\u00020j8DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R$\u0010\u009c\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001¨\u0006§\u0001"}, d2 = {"Lru/ozon/app/android/tabbar/ui/TabNavigationFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;", "", "layoutRes", "<init>", "(I)V", "", "clearResources", "()V", "Landroid/view/LayoutInflater;", "inflater", "LX4/a;", "initViewBinding", "(Landroid/view/LayoutInflater;)LX4/a;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "offset", "setBottomOffset", "setMaxBottomOffset", "getMaxBottomOffset", "()I", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroyView", "onDetach", "Lru/ozon/app/android/tabbar/data/TabConfig;", "getTabConfig", "()Lru/ozon/app/android/tabbar/data/TabConfig;", "initBehavior", "arguments", "handleArguments", "config", "bindNavigator", "(Lru/ozon/app/android/tabbar/data/TabConfig;)V", "bindBottomNavigation", "Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", "current", "old", "", "deeplink", "", "navigateTab", "(Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Ljava/lang/String;)Z", "onNavigationItemSelected", "(Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;)Z", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "setNavigatorHolder", "(LEZ/h;)V", "LPc/a;", "Lru/ozon/app/android/tabbar/TabConfigViewModel;", "tabConfigViewModel", "LPc/a;", "getTabConfigViewModel", "()LPc/a;", "setTabConfigViewModel", "(LPc/a;)V", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "cacheHolderTabActivityDelegate", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "getCacheHolderTabActivityDelegate", "()Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "setCacheHolderTabActivityDelegate", "(Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "bottomNavigationControllerFactory", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "getBottomNavigationControllerFactory", "()Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "setBottomNavigationControllerFactory", "(Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;)V", "Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;", "tabBarAnalytics", "Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;", "getTabBarAnalytics", "()Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;", "setTabBarAnalytics", "(Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "bottomNavigationController", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "ru/ozon/app/android/tabbar/ui/TabNavigationFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/tabbar/ui/TabNavigationFragment$onBackPressedCallback$1;", "Lru/ozon/app/android/tabbar/data/TabConfig;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/tabbar/TabConfigViewModel;", "viewModel", "LNZ/a;", "navigator", "LNZ/a;", "ru/ozon/app/android/tabbar/ui/TabNavigationFragment$tabFragmentListener$1", "tabFragmentListener", "Lru/ozon/app/android/tabbar/ui/TabNavigationFragment$tabFragmentListener$1;", "ru/ozon/app/android/tabbar/ui/TabNavigationFragment$tabChildFragmentListener$1", "tabChildFragmentListener", "Lru/ozon/app/android/tabbar/ui/TabNavigationFragment$tabChildFragmentListener$1;", "Ljava/util/WeakHashMap;", "childFragments", "Ljava/util/WeakHashMap;", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "getBottomNavigation", "()Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "bottomNavigation", "Landroidx/fragment/app/FragmentContainerView;", "getRootContainer", "()Landroidx/fragment/app/FragmentContainerView;", "rootContainer", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TabNavigationFragment extends ComponentCallbacksC5392m implements BottomNavigationStateController, BottomNavigationAnimationController, CacheHolder, ExternalOffsetHandler {
    private BottomNavigationController bottomNavigationController;
    public BottomNavigationController.Factory bottomNavigationControllerFactory;
    public CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate;

    @NotNull
    private final WeakHashMap<ComponentCallbacksC5392m, Unit> childFragments;
    private TabConfig config;
    private a navigator;
    public h navigatorHolder;

    @NotNull
    private final TabNavigationFragment$onBackPressedCallback$1 onBackPressedCallback;
    public g router;
    public TabBarAnalytics tabBarAnalytics;

    @NotNull
    private final TabNavigationFragment$tabChildFragmentListener$1 tabChildFragmentListener;
    public Pc.a<TabConfigViewModel> tabConfigViewModel;

    @NotNull
    private final TabNavigationFragment$tabFragmentListener$1 tabFragmentListener;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* JADX WARN: Type inference failed for: r1v1, types: [ru.ozon.app.android.tabbar.ui.TabNavigationFragment$onBackPressedCallback$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ru.ozon.app.android.tabbar.ui.TabNavigationFragment$tabFragmentListener$1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ru.ozon.app.android.tabbar.ui.TabNavigationFragment$tabChildFragmentListener$1] */
    public TabNavigationFragment(int i11) {
        super(i11);
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.tabbar.ui.TabNavigationFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                l.a(TabNavigationFragment.this.getRouter());
            }
        };
        this.viewModel = k.b(new TabNavigationFragment$viewModel$2(this));
        this.tabFragmentListener = new G.m() { // from class: ru.ozon.app.android.tabbar.ui.TabNavigationFragment$tabFragmentListener$1
            @Override // androidx.fragment.app.G.m
            public void onFragmentAttached(G fm, ComponentCallbacksC5392m fragment, Context context) {
                TabNavigationFragment$tabChildFragmentListener$1 tabNavigationFragment$tabChildFragmentListener$1;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(context, "context");
                super.onFragmentAttached(fm, fragment, context);
                G childFragmentManager = fragment.getChildFragmentManager();
                tabNavigationFragment$tabChildFragmentListener$1 = TabNavigationFragment.this.tabChildFragmentListener;
                childFragmentManager.Y0(tabNavigationFragment$tabChildFragmentListener$1, false);
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentDetached(G fm, ComponentCallbacksC5392m fragment) {
                TabNavigationFragment$tabChildFragmentListener$1 tabNavigationFragment$tabChildFragmentListener$1;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                super.onFragmentDetached(fm, fragment);
                G childFragmentManager = fragment.getChildFragmentManager();
                tabNavigationFragment$tabChildFragmentListener$1 = TabNavigationFragment.this.tabChildFragmentListener;
                childFragmentManager.t1(tabNavigationFragment$tabChildFragmentListener$1);
            }
        };
        this.tabChildFragmentListener = new G.m() { // from class: ru.ozon.app.android.tabbar.ui.TabNavigationFragment$tabChildFragmentListener$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.fragment.app.G.m
            public void onFragmentViewCreated(G fm, ComponentCallbacksC5392m fragment, View view, Bundle savedInstanceState) {
                WeakHashMap weakHashMap;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(view, "view");
                super.onFragmentViewCreated(fm, fragment, view, savedInstanceState);
                weakHashMap = TabNavigationFragment.this.childFragments;
                weakHashMap.put(fragment, null);
                ExternalOffsetHandler externalOffsetHandler = fragment instanceof ExternalOffsetHandler ? (ExternalOffsetHandler) fragment : null;
                if (externalOffsetHandler != null) {
                    externalOffsetHandler.setMaxBottomOffset(TabNavigationFragment.this.getBottomNavigation().getMeasuredHeight());
                }
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentViewDestroyed(G fm, ComponentCallbacksC5392m fragment) {
                WeakHashMap weakHashMap;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                super.onFragmentViewDestroyed(fm, fragment);
                weakHashMap = TabNavigationFragment.this.childFragments;
                weakHashMap.remove(fragment);
            }
        };
        this.childFragments = new WeakHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindBottomNavigation(TabConfig config) {
        OnBottomNavigationItemSelectedListener onBottomNavigationItemSelectedListener;
        if (config instanceof RemoteTabConfig) {
            RemoteTabConfig remoteTabConfig = (RemoteTabConfig) config;
            List<BottomNavigationItem> tabItems = remoteTabConfig.getTabItems();
            BottomNavigationController bottomNavigationController = this.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            bottomNavigationController.setItemColors(remoteTabConfig.getActiveColorsConfig(), this instanceof SelectTabNavigationFragment ? new InactiveColorsConfig(UniColors.GRAPHIC_TERTIARY.getToken(), null, 2, null) : new InactiveColorsConfig(null, remoteTabConfig.getBottomNavigationConfig().getInactiveTextColorToken(), 1, null));
            BottomNavigationController bottomNavigationController2 = this.bottomNavigationController;
            if (bottomNavigationController2 == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            bottomNavigationController2.setItems(tabItems, remoteTabConfig.getBottomNavigationConfig());
            f fVar = new f(tabItems, this);
            getBottomNavigation().setOnNavigationItemLongClicked(new TabNavigationFragment$bindBottomNavigation$2(tabItems, this));
            onBottomNavigationItemSelectedListener = fVar;
        } else {
            if (!(config instanceof LocalTabConfig)) {
                throw new o();
            }
            final LocalTabConfig localTabConfig = (LocalTabConfig) config;
            onBottomNavigationItemSelectedListener = new OnBottomNavigationItemSelectedListener() { // from class: aM.g
                @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
                public final boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
                    boolean bindBottomNavigation$lambda$6;
                    bindBottomNavigation$lambda$6 = TabNavigationFragment.bindBottomNavigation$lambda$6(LocalTabConfig.this, this, bottomMenuItem, bottomMenuItem2);
                    return bindBottomNavigation$lambda$6;
                }
            };
        }
        BottomNavigationController bottomNavigationController3 = this.bottomNavigationController;
        if (bottomNavigationController3 == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController3.setOnSelectedItemIdChanged(new TabNavigationFragment$bindBottomNavigation$4$1(getViewModel()));
        bottomNavigationController3.init();
        BottomNavigationController.setOnNavigationItemSelectedListener$default(bottomNavigationController3, 0L, onBottomNavigationItemSelectedListener, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindBottomNavigation$lambda$5(List list, TabNavigationFragment tabNavigationFragment, BottomMenuItem current, BottomMenuItem old) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(old, "old");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) it.next();
            if (bottomNavigationItem.getId() == current.getId()) {
                return tabNavigationFragment.navigateTab(current, old, bottomNavigationItem.getDeeplink());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindBottomNavigation$lambda$6(TabConfig tabConfig, TabNavigationFragment tabNavigationFragment, BottomMenuItem current, BottomMenuItem old) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(old, "old");
        return tabNavigationFragment.navigateTab(current, old, ((LocalTabConfig) tabConfig).getTabNavigatorConfig().b().get(Integer.valueOf(current.getId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindNavigator(TabConfig config) {
        TabNavigationFragment tabNavigationFragment;
        a aVar = this.navigator;
        if (aVar == null) {
            int id2 = getRootContainer().getId();
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            tabNavigationFragment = this;
            a aVar2 = new a(tabNavigationFragment, childFragmentManager, id2, config.getTabNavigatorConfig(), null, 16, null);
            BottomNavigationController bottomNavigationController = tabNavigationFragment.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            aVar2.setOnTabChangeListener(bottomNavigationController);
            getCacheHolderTabActivityDelegate().init(aVar2);
            tabNavigationFragment.navigator = aVar2;
        } else {
            if (aVar == null) {
                Intrinsics.n("navigator");
                throw null;
            }
            aVar.setTabConfig(config.getTabNavigatorConfig());
            tabNavigationFragment = this;
        }
        h navigatorHolder = getNavigatorHolder();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        a aVar3 = tabNavigationFragment.navigator;
        if (aVar3 != null) {
            yZ.h.b(navigatorHolder, viewLifecycleOwner, aVar3);
        } else {
            Intrinsics.n("navigator");
            throw null;
        }
    }

    private final void handleArguments(Bundle arguments) {
        String string = arguments != null ? arguments.getString("ru.ozon.app.android.ui.TabNavigationFragment.EXTRA_REDIRECT_DESTINATION") : null;
        if (string == null || kotlin.text.h.K(string)) {
            return;
        }
        g.a.a(getRouter(), string, null, null, 6);
    }

    private final void initBehavior() {
        ViewGroup.LayoutParams layoutParams = getRootContainer().getLayoutParams();
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
                EZ.g.navigate$default(aVar, EZ.f.a(new e(current.getId())), 0, 2, null);
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

    public abstract void clearResources();

    @NotNull
    public abstract OzonBottomNavigationView getBottomNavigation();

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
        return getBottomNavigation().getMeasuredHeight();
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
    public abstract FragmentContainerView getRootContainer();

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
    public final TabBarAnalytics getTabBarAnalytics() {
        TabBarAnalytics tabBarAnalytics = this.tabBarAnalytics;
        if (tabBarAnalytics != null) {
            return tabBarAnalytics;
        }
        Intrinsics.n("tabBarAnalytics");
        throw null;
    }

    protected TabConfig getTabConfig() {
        return getViewModel().getTabConfig("main");
    }

    @NotNull
    public final Pc.a<TabConfigViewModel> getTabConfigViewModel() {
        Pc.a<TabConfigViewModel> aVar = this.tabConfigViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("tabConfigViewModel");
        throw null;
    }

    @NotNull
    protected final TabConfigViewModel getViewModel() {
        Object value = this.viewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TabConfigViewModel) value;
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

    @NotNull
    public abstract X4.a initViewBinding(@NotNull LayoutInflater inflater);

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
        TabNavigationFragmentComponent.Factory factory = DaggerTabNavigationFragmentComponent.factory();
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
        C6740b dependencyStorage5 = C6739a.b(this, AndroidPlatformComponentDependencies.class).getDependencyStorage();
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        factory.create(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, (AndroidPlatformComponentDependencies) dependencyStorage5.b(AndroidPlatformComponentDependencies.class)).inject(this);
        super.onAttach(context);
        getChildFragmentManager().Y0(this.tabFragmentListener, false);
        this.bottomNavigationController = getBottomNavigationControllerFactory().create(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.config == null) {
            this.config = getTabConfig();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View constraintLayout = initViewBinding(inflater).getConstraintLayout();
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
        clearResources();
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
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController.configureBottomView(getBottomNavigation());
        C2408n0 c2408n0 = new C2408n0(C5427n.a(getViewModel().getTabConfigState(), getViewLifecycleOwner().getLifecycle(), AbstractC5434v.b.STARTED), new TabNavigationFragment$onViewCreated$1(this, null));
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2399j.C(c2408n0, K.a(viewLifecycleOwner));
        TabConfig tabConfig = this.config;
        if (tabConfig != null) {
            bindBottomNavigation(tabConfig);
            bindNavigator(tabConfig);
        } else {
            handleArguments(getArguments());
        }
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner2, this.onBackPressedCallback);
        initBehavior();
        final OzonBottomNavigationView bottomNavigation = getBottomNavigation();
        bottomNavigation.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.tabbar.ui.TabNavigationFragment$onViewCreated$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (bottomNavigation.getMeasuredWidth() <= 0 || bottomNavigation.getMeasuredHeight() <= 0) {
                    return;
                }
                bottomNavigation.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.setMaxBottomOffset(((OzonBottomNavigationView) bottomNavigation).getMeasuredHeight());
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
        BottomNavigationConfig bottomNavigationConfig;
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController.show();
        setMaxBottomOffset(getBottomNavigation().getMeasuredHeight());
        TabConfig tabConfig = this.config;
        RemoteTabConfig remoteTabConfig = tabConfig instanceof RemoteTabConfig ? (RemoteTabConfig) tabConfig : null;
        if (remoteTabConfig == null || (bottomNavigationConfig = remoteTabConfig.getBottomNavigationConfig()) == null) {
            return;
        }
        BottomNavigationController bottomNavigationController2 = this.bottomNavigationController;
        if (bottomNavigationController2 != null) {
            bottomNavigationController2.updateNavigationBarBackgroundColor(bottomNavigationConfig);
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
