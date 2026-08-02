package ru.ozon.app.android.fresh.feature.entry.fragment;

import EZ.f;
import EZ.h;
import GZ.g;
import GZ.l;
import NZ.a;
import NZ.j;
import OZ.e;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.C;
import androidx.activity.J;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.InterfaceC5431s;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
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
import l40.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.common.flags.FreshTurnOffTabBarElevationFeatureFlag;
import ru.ozon.app.android.fresh.feature.entry.R$id;
import ru.ozon.app.android.fresh.feature.entry.R$layout;
import ru.ozon.app.android.fresh.feature.entry.databinding.FragmentOzonFreshBinding;
import ru.ozon.app.android.fresh.feature.entry.di.DaggerOzonFreshFragmentComponent;
import ru.ozon.app.android.fresh.feature.entry.di.OzonFreshFragmentComponent;
import ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.LocalTabConfig;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.ui.ActiveColorsConfig;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.InactiveColorsConfig;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.tabbar.ui.behavior.FragmentContainerBehavior;
import ru.ozon.app.android.tabbar.ui.behavior.OffsetExtensionsKt;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b*\u0006\u0096\u0001\u0099\u0001\u009c\u0001\b\u0000\u0018\u0000 ¯\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002¯\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010\"J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\bJ\u0017\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000b2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\n\u0018\u000109j\u0004\u0018\u0001`:H\u0016¢\u0006\u0004\b;\u0010<J)\u0010A\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\b\u0010@\u001a\u0004\u0018\u00010?H\u0017¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000bH\u0002¢\u0006\u0004\bC\u0010\bJ\u000f\u0010D\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010\bJ\u000f\u0010E\u001a\u00020\u000bH\u0002¢\u0006\u0004\bE\u0010\bJ\u000f\u0010F\u001a\u00020\u000bH\u0002¢\u0006\u0004\bF\u0010\bJ\u000f\u0010G\u001a\u00020\u000bH\u0002¢\u0006\u0004\bG\u0010\bJ\u000f\u0010H\u001a\u00020\u000bH\u0002¢\u0006\u0004\bH\u0010\bJ\u000f\u0010I\u001a\u00020\u000bH\u0002¢\u0006\u0004\bI\u0010\bJ\u000f\u0010J\u001a\u00020\u000bH\u0002¢\u0006\u0004\bJ\u0010\bJ\u0019\u0010L\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bL\u0010\u0011J\u0017\u0010O\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bQ\u0010PJ)\u0010X\u001a\u00020W2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020R2\b\u0010V\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010Z\u001a\u00020W2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020RH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\b\\\u0010PR\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010l\u001a\u00020k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010s\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR)\u0010{\u001a\b\u0012\u0004\u0012\u00020z0y8\u0006@\u0006X\u0087.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R$\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010¤\u0001\u001a\u00030\u009f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R$\u0010¨\u0001\u001a\u000f\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020/0¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010«\u0001\u001a\u00030\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0017\u0010®\u0001\u001a\u00020W8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006°\u0001"}, d2 = {"Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;", "LNZ/j;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDetach", "showBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "hideBottomNavigation", "", "offset", "setBottomOffset", "(I)V", "setMaxBottomOffset", "getMaxBottomOffset", "()I", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "initDependencies", "requestPushPermission", "configureNavBar", "observeViewModel", "setUpTabConfig", "addOnBackPressedListener", "initCoordinatorBehavior", "adjustBottomBarPosition", "arguments", "handleArguments", "Lru/ozon/app/android/tabbar/data/TabConfig;", "config", "bindConfig", "(Lru/ozon/app/android/tabbar/data/TabConfig;)V", "bindBottomNavigation", "Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", "currentTab", "oldTab", "", "deeplink", "", "navigateToTab", "(Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Ljava/lang/String;)Z", "onTabSelected", "(Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;)Z", "bindNavigator", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "setNavigatorHolder", "(LEZ/h;)V", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "cacheHolderTabActivityDelegate", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "getCacheHolderTabActivityDelegate", "()Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "setCacheHolderTabActivityDelegate", "(Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "bottomNavigationControllerFactory", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "getBottomNavigationControllerFactory", "()Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "setBottomNavigationControllerFactory", "(Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;)V", "LPc/a;", "Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragmentViewModelImpl;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "setViewModelProvider", "(LPc/a;)V", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "authEventsCollector", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "getAuthEventsCollector", "()Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "setAuthEventsCollector", "(Lru/ozon/app/android/account/authEvents/AuthEventsCollector;)V", "LNZ/a;", "navigator", "LNZ/a;", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "bottomNavigationController", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "tabConfig", "Lru/ozon/app/android/tabbar/data/TabConfig;", "Lru/ozon/app/android/fresh/feature/entry/databinding/FragmentOzonFreshBinding;", "_binding", "Lru/ozon/app/android/fresh/feature/entry/databinding/FragmentOzonFreshBinding;", "Ljava/util/WeakHashMap;", "children", "Ljava/util/WeakHashMap;", "ru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragment$childFragmentCallbacks$1", "childFragmentCallbacks", "Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragment$childFragmentCallbacks$1;", "ru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragment$fragmentCallbacks$1", "fragmentCallbacks", "Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragment$fragmentCallbacks$1;", "ru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragment$onBackPressedCallback$1;", "Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragmentViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragmentViewModel;", "viewModel", "", "getPathConfig", "()Ljava/util/Map;", "pathConfig", "getBinding", "()Lru/ozon/app/android/fresh/feature/entry/databinding/FragmentOzonFreshBinding;", "binding", "getShouldTurnOffTabBarElevation", "()Z", "shouldTurnOffTabBarElevation", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonFreshFragment extends ComponentCallbacksC5392m implements BottomNavigationStateController, BottomNavigationAnimationController, CacheHolder, ExternalOffsetHandler, j {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentOzonFreshBinding _binding;
    public AuthEventsCollector authEventsCollector;
    private BottomNavigationController bottomNavigationController;
    public BottomNavigationController.Factory bottomNavigationControllerFactory;
    public CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate;

    @NotNull
    private final OzonFreshFragment$childFragmentCallbacks$1 childFragmentCallbacks;

    @NotNull
    private final WeakHashMap<ComponentCallbacksC5392m, Unit> children;

    @NotNull
    private final OzonFreshFragment$fragmentCallbacks$1 fragmentCallbacks;
    private a navigator;
    public h navigatorHolder;

    @NotNull
    private final OzonFreshFragment$onBackPressedCallback$1 onBackPressedCallback;
    public g router;
    private TabConfig tabConfig;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;
    public Pc.a<OzonFreshFragmentViewModelImpl> viewModelProvider;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragment$Companion;", "", "<init>", "()V", "", "deeplink", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;)Landroidx/fragment/app/m;", "EXTRA_REDIRECT_DESTINATION", "Ljava/lang/String;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(String deeplink) {
            OzonFreshFragment ozonFreshFragment = new OzonFreshFragment();
            ozonFreshFragment.setArguments(d.b(new Pair("ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment.EXTRA_REDIRECT_DESTINATION", deeplink)));
            return ozonFreshFragment;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment$childFragmentCallbacks$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment$fragmentCallbacks$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment$onBackPressedCallback$1] */
    public OzonFreshFragment() {
        super(R$layout.fragment_ozon_fresh);
        this.children = new WeakHashMap<>();
        this.childFragmentCallbacks = new G.m() { // from class: ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment$childFragmentCallbacks$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.fragment.app.G.m
            public void onFragmentViewCreated(G fm, ComponentCallbacksC5392m fr, View view, Bundle savedInstanceState) {
                WeakHashMap weakHashMap;
                FragmentOzonFreshBinding binding;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fr, "fr");
                Intrinsics.checkNotNullParameter(view, "view");
                super.onFragmentViewCreated(fm, fr, view, savedInstanceState);
                weakHashMap = OzonFreshFragment.this.children;
                weakHashMap.put(fr, Unit.f71690a);
                ExternalOffsetHandler externalOffsetHandler = fr instanceof ExternalOffsetHandler ? (ExternalOffsetHandler) fr : null;
                if (externalOffsetHandler != null) {
                    binding = OzonFreshFragment.this.getBinding();
                    externalOffsetHandler.setMaxBottomOffset(binding.bottomNavigation.getMeasuredHeight());
                }
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentViewDestroyed(G fm, ComponentCallbacksC5392m fr) {
                WeakHashMap weakHashMap;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fr, "fr");
                weakHashMap = OzonFreshFragment.this.children;
                weakHashMap.remove(fr);
                super.onFragmentViewDestroyed(fm, fr);
            }
        };
        this.fragmentCallbacks = new G.m() { // from class: ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment$fragmentCallbacks$1
            @Override // androidx.fragment.app.G.m
            public void onFragmentAttached(G fm, ComponentCallbacksC5392m fr, Context context) {
                OzonFreshFragment$childFragmentCallbacks$1 ozonFreshFragment$childFragmentCallbacks$1;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fr, "fr");
                Intrinsics.checkNotNullParameter(context, "context");
                super.onFragmentAttached(fm, fr, context);
                G childFragmentManager = fr.getChildFragmentManager();
                ozonFreshFragment$childFragmentCallbacks$1 = OzonFreshFragment.this.childFragmentCallbacks;
                childFragmentManager.Y0(ozonFreshFragment$childFragmentCallbacks$1, false);
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentDetached(G fm, ComponentCallbacksC5392m fr) {
                OzonFreshFragment$childFragmentCallbacks$1 ozonFreshFragment$childFragmentCallbacks$1;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fr, "fr");
                G childFragmentManager = fr.getChildFragmentManager();
                ozonFreshFragment$childFragmentCallbacks$1 = OzonFreshFragment.this.childFragmentCallbacks;
                childFragmentManager.t1(ozonFreshFragment$childFragmentCallbacks$1);
                super.onFragmentDetached(fm, fr);
            }
        };
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                l.a(OzonFreshFragment.this.getRouter());
            }
        };
        this.viewModel = LazyUtilsKt.unsafeLazy(new OzonFreshFragment$viewModel$2(this));
    }

    private final void addOnBackPressedListener() {
        J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.onBackPressedCallback);
    }

    private final void adjustBottomBarPosition() {
        final OzonBottomNavigationView ozonBottomNavigationView = getBinding().bottomNavigation;
        ozonBottomNavigationView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment$adjustBottomBarPosition$$inlined$afterMeasured$1
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

    private final void bindBottomNavigation(TabConfig config) {
        OnBottomNavigationItemSelectedListener onBottomNavigationItemSelectedListener;
        if (config instanceof RemoteTabConfig) {
            RemoteTabConfig remoteTabConfig = (RemoteTabConfig) config;
            List<BottomNavigationItem> tabItems = remoteTabConfig.getTabItems();
            BottomNavigationController bottomNavigationController = this.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            BottomNavigationController.setItems$default(bottomNavigationController, tabItems, null, 2, null);
            BottomNavigationController bottomNavigationController2 = this.bottomNavigationController;
            if (bottomNavigationController2 == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            ActiveColorsConfig activeColorsConfig = remoteTabConfig.getActiveColorsConfig();
            UniColors uniColors = UniColors.TEXT_ORIGINALPRICE_AVAILABLE;
            bottomNavigationController2.setItemColors(activeColorsConfig, new InactiveColorsConfig(uniColors.getToken(), uniColors.getToken()));
            onBottomNavigationItemSelectedListener = new c(this, tabItems);
        } else {
            if (!(config instanceof LocalTabConfig)) {
                throw new o();
            }
            final LocalTabConfig localTabConfig = (LocalTabConfig) config;
            onBottomNavigationItemSelectedListener = new OnBottomNavigationItemSelectedListener() { // from class: xv.a
                @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
                public final boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
                    boolean bindBottomNavigation$lambda$6;
                    bindBottomNavigation$lambda$6 = OzonFreshFragment.bindBottomNavigation$lambda$6(OzonFreshFragment.this, localTabConfig, bottomMenuItem, bottomMenuItem2);
                    return bindBottomNavigation$lambda$6;
                }
            };
        }
        BottomNavigationController bottomNavigationController3 = this.bottomNavigationController;
        if (bottomNavigationController3 == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController3.init();
        BottomNavigationController.setOnNavigationItemSelectedListener$default(bottomNavigationController3, 0L, onBottomNavigationItemSelectedListener, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindBottomNavigation$lambda$5(OzonFreshFragment ozonFreshFragment, List list, BottomMenuItem current, BottomMenuItem old) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(old, "old");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) it.next();
            if (bottomNavigationItem.getId() == current.getId()) {
                return ozonFreshFragment.navigateToTab(current, old, bottomNavigationItem.getDeeplink());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindBottomNavigation$lambda$6(OzonFreshFragment ozonFreshFragment, TabConfig tabConfig, BottomMenuItem current, BottomMenuItem old) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(old, "old");
        return ozonFreshFragment.navigateToTab(current, old, ((LocalTabConfig) tabConfig).getTabNavigatorConfig().b().get(Integer.valueOf(current.getId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindConfig(TabConfig config) {
        bindBottomNavigation(config);
        bindNavigator(config);
    }

    private final void bindNavigator(TabConfig config) {
        OzonFreshFragment ozonFreshFragment;
        a aVar = this.navigator;
        if (aVar == null) {
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            ozonFreshFragment = this;
            a aVar2 = new a(ozonFreshFragment, childFragmentManager, R$id.rootContainer, config.getTabNavigatorConfig(), null, 16, null);
            BottomNavigationController bottomNavigationController = ozonFreshFragment.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            aVar2.setOnTabChangeListener(bottomNavigationController);
            getCacheHolderTabActivityDelegate().init(aVar2);
            ozonFreshFragment.navigator = aVar2;
        } else {
            if (aVar == null) {
                Intrinsics.n("navigator");
                throw null;
            }
            aVar.setTabConfig(config.getTabNavigatorConfig());
            ozonFreshFragment = this;
        }
        h navigatorHolder = getNavigatorHolder();
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        a aVar3 = ozonFreshFragment.navigator;
        if (aVar3 != null) {
            yZ.h.b(navigatorHolder, viewLifecycleOwner, aVar3);
        } else {
            Intrinsics.n("navigator");
            throw null;
        }
    }

    private final void configureNavBar() {
        if (getShouldTurnOffTabBarElevation()) {
            getBinding().bottomNavigation.setElevation(0.0f);
        }
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        OzonBottomNavigationView bottomNavigation = getBinding().bottomNavigation;
        Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
        bottomNavigationController.configureBottomView(bottomNavigation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentOzonFreshBinding getBinding() {
        FragmentOzonFreshBinding fragmentOzonFreshBinding = this._binding;
        if (fragmentOzonFreshBinding != null) {
            return fragmentOzonFreshBinding;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final boolean getShouldTurnOffTabBarElevation() {
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        return ((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getFeatureChecker().isEnabled(FreshTurnOffTabBarElevationFeatureFlag.INSTANCE);
    }

    private final OzonFreshFragmentViewModel getViewModel() {
        Object value = this.viewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OzonFreshFragmentViewModel) value;
    }

    private final void handleArguments(Bundle arguments) {
        String string = arguments != null ? arguments.getString("ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment.EXTRA_REDIRECT_DESTINATION") : null;
        if (string == null || kotlin.text.h.K(string)) {
            return;
        }
        g.a.a(getRouter(), string, null, null, 6);
    }

    private final void initCoordinatorBehavior() {
        FragmentContainerView rootContainer = getBinding().rootContainer;
        Intrinsics.checkNotNullExpressionValue(rootContainer, "rootContainer");
        ViewGroup.LayoutParams layoutParams = rootContainer.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            layoutParams = null;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        CoordinatorLayout.c c11 = fVar != null ? fVar.c() : null;
        if (c11 instanceof FragmentContainerBehavior) {
            ((FragmentContainerBehavior) c11).setExternalOffsetHandler(this);
        }
    }

    private final void initDependencies() {
        OzonFreshFragmentComponent.Factory factory = DaggerOzonFreshFragmentComponent.factory();
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
        C6740b dependencyStorage3 = C6739a.b(this, TabsUiControllerComponentApi.class).getDependencyStorage();
        if (TabsUiControllerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsUiControllerComponentApi is not DiComponent");
        }
        TabsUiControllerComponentApi tabsUiControllerComponentApi = (TabsUiControllerComponentApi) dependencyStorage3.b(TabsUiControllerComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, TabsComponentApi.class).getDependencyStorage();
        if (TabsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsComponentApi is not DiComponent");
        }
        TabsComponentApi tabsComponentApi = (TabsComponentApi) dependencyStorage4.b(TabsComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage5.b(NetworkComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage6.b(AccountComponentApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, AndroidPlatformComponentDependencies.class).getDependencyStorage();
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        factory.create(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, networkComponentApi, accountComponentApi, (AndroidPlatformComponentDependencies) dependencyStorage7.b(AndroidPlatformComponentDependencies.class)).inject(this);
    }

    private final boolean navigateToTab(BottomMenuItem currentTab, BottomMenuItem oldTab, String deeplink) {
        if (currentTab.getBehavior() != BottomNavigationBehavior.BEHAVIOR_TYPE_REDIRECT || deeplink == null) {
            return onTabSelected(currentTab, oldTab);
        }
        g.a.a(getRouter(), deeplink, null, null, 6);
        return false;
    }

    private final void observeViewModel() {
        getViewModel().getTabConfigLiveData().observe(getViewLifecycleOwner(), new OzonFreshFragment$sam$androidx_lifecycle_Observer$0(new OzonFreshFragment$observeViewModel$1(this)));
    }

    private final boolean onTabSelected(BottomMenuItem currentTab, BottomMenuItem oldTab) {
        if (!Intrinsics.d(currentTab, oldTab)) {
            a aVar = this.navigator;
            if (aVar != null) {
                EZ.g.navigate$default(aVar, f.a(new e(currentTab.getId(), null)), 0, 2, null);
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

    private final void requestPushPermission() {
        Context context = getContext();
        if (context == null || !PermissionExtensionsKt.isPermissionGranted(context, "android.permission.POST_NOTIFICATIONS")) {
            if (Build.VERSION.SDK_INT >= 33) {
                r activity = getActivity();
                if (activity != null) {
                    ActivitiesKt.requestPermission(activity, OzonFreshFragment$requestPushPermission$1.INSTANCE);
                    return;
                }
                return;
            }
            Intent addFlags = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456);
            r activity2 = getActivity();
            Intent putExtra = addFlags.putExtra("android.provider.extra.APP_PACKAGE", activity2 != null ? activity2.getPackageName() : null);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            startActivity(putExtra);
        }
    }

    private final void setUpTabConfig() {
        TabConfig tabConfig = this.tabConfig;
        if (tabConfig == null) {
            handleArguments(getArguments());
        } else {
            bindConfig(tabConfig);
        }
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
    public final Pc.a<OzonFreshFragmentViewModelImpl> getViewModelProvider() {
        Pc.a<OzonFreshFragmentViewModelImpl> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewModelProvider");
        throw null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public fk0.c getPrefetchViewPool() {
        return getCacheHolderTabActivityDelegate().getPrefetchViewPool();
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigation() {
        setMaxBottomOffset(0);
        setBottomOffset(0);
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController != null) {
            bottomNavigationController.gone();
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
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
    @InterfaceC3999a
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
        initDependencies();
        super.onAttach(context);
        getChildFragmentManager().Y0(this.fragmentCallbacks, false);
        this.bottomNavigationController = getBottomNavigationControllerFactory().create(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.tabConfig == null) {
            this.tabConfig = getViewModel().getTabConfig();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentOzonFreshBinding.inflate(inflater, null, false);
        CoordinatorLayout constraintLayout = getBinding().getConstraintLayout();
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
        getChildFragmentManager().t1(this.fragmentCallbacks);
        super.onDetach();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        configureNavBar();
        observeViewModel();
        setUpTabConfig();
        addOnBackPressedListener();
        initCoordinatorBehavior();
        adjustBottomBarPosition();
        requestPushPermission();
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
        Iterator<Map.Entry<ComponentCallbacksC5392m, Unit>> it = this.children.entrySet().iterator();
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
        Iterator<Map.Entry<ComponentCallbacksC5392m, Unit>> it = this.children.entrySet().iterator();
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
        FragmentOzonFreshBinding fragmentOzonFreshBinding = this._binding;
        if (fragmentOzonFreshBinding != null) {
            setMaxBottomOffset(fragmentOzonFreshBinding.bottomNavigation.getMeasuredHeight());
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
