package ru.ozon.app.android.cml.feature.tabs.presentation;

import EZ.f;
import EZ.h;
import GZ.g;
import GZ.l;
import NZ.j;
import OZ.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.b0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fk0.c;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.feature.tabs.R$id;
import ru.ozon.app.android.cml.feature.tabs.databinding.FragmentCmlTabsNavigationBinding;
import ru.ozon.app.android.cml.feature.tabs.di.CmlTabsNavigationFragmentComponent;
import ru.ozon.app.android.cml.feature.tabs.navigation.CmlAppTabNavigator;
import ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsNavigationFragment;
import ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsScreenState;
import ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsViewModelImpl;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.tabbar.ui.behavior.OffsetExtensionsKt;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

@Metadata(d1 = {"\u0000\u0083\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b*\u0003svy\b\u0000\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0086\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010#J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J\u0011\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104J)\u0010:\u001a\u00020\u000b2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010<\u001a\u000205H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010<\u001a\u000205H\u0016¢\u0006\u0004\b?\u0010>J\u000f\u0010@\u001a\u000205H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000bH\u0002¢\u0006\u0004\bB\u0010\bJ\u000f\u0010C\u001a\u00020\u000bH\u0002¢\u0006\u0004\bC\u0010\bJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000bH\u0002¢\u0006\u0004\bH\u0010\bJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bM\u0010GJ\u0017\u0010P\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u0011\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bl\u0010YR\u001b\u0010r\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R \u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R#\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u0002050\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00020U8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0087\u0001"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsNavigationFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;", "LNZ/j;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDetach", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "getViewPool", "()Lfk0/c;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "offset", "setBottomOffset", "(I)V", "setMaxBottomOffset", "getMaxBottomOffset", "()I", "injectDependencies", "setUpScreenState", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "config", "bindNavigator", "(Lru/ozon/app/android/tabbar/data/RemoteTabConfig;)V", "observeStateChanges", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsScreenState$Success;", "state", "handleSuccessState", "(Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsScreenState$Success;)V", "configureBottomNavigationController", "LNZ/g;", "tabNavigator", "onSelectedTabClicked", "(LNZ/g;)V", "", "consumeDeeplink", "()Ljava/lang/String;", "Lru/ozon/app/android/cml/feature/tabs/databinding/FragmentCmlTabsNavigationBinding;", "_binding", "Lru/ozon/app/android/cml/feature/tabs/databinding/FragmentCmlTabsNavigationBinding;", "referrerMiniAppName", "Ljava/lang/String;", "LGZ/g;", "ozonRouter", "LGZ/g;", "LEZ/h;", "holder", "LEZ/h;", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "cacheHolderTabActivityDelegate", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsViewModelImpl$Factory;", "viewModelFactory", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsViewModelImpl$Factory;", "Lru/ozon/app/android/cml/feature/tabs/navigation/CmlAppTabNavigator;", "navigator", "Lru/ozon/app/android/cml/feature/tabs/navigation/CmlAppTabNavigator;", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "bottomNavigationController", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "miniAppName", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsViewModelImpl;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsViewModelImpl;", "viewModel", "ru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsNavigationFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsNavigationFragment$onBackPressedCallback$1;", "ru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsNavigationFragment$tabFragmentListener$1", "tabFragmentListener", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsNavigationFragment$tabFragmentListener$1;", "ru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsNavigationFragment$tabChildFragmentListener$1", "tabChildFragmentListener", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsNavigationFragment$tabChildFragmentListener$1;", "Ljava/util/WeakHashMap;", "childFragments", "Ljava/util/WeakHashMap;", "", "getPathConfig", "()Ljava/util/Map;", "pathConfig", "getBinding", "()Lru/ozon/app/android/cml/feature/tabs/databinding/FragmentCmlTabsNavigationBinding;", "binding", "Companion", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlTabsNavigationFragment extends ComponentCallbacksC5392m implements BottomNavigationStateController, BottomNavigationAnimationController, CacheHolder, ExternalOffsetHandler, j {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentCmlTabsNavigationBinding _binding;
    private BottomNavigationController bottomNavigationController;
    private CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate;

    @NotNull
    private final WeakHashMap<ComponentCallbacksC5392m, Unit> childFragments;
    private h holder;
    private String miniAppName;
    private CmlAppTabNavigator navigator;

    @NotNull
    private final CmlTabsNavigationFragment$onBackPressedCallback$1 onBackPressedCallback;
    private g ozonRouter;
    private String referrerMiniAppName;

    @NotNull
    private final CmlTabsNavigationFragment$tabChildFragmentListener$1 tabChildFragmentListener;

    @NotNull
    private final CmlTabsNavigationFragment$tabFragmentListener$1 tabFragmentListener;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;
    private CmlTabsViewModelImpl.Factory viewModelFactory;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsNavigationFragment$Companion;", "", "<init>", "()V", "", "miniAppName", "referrerMiniAppName", "deeplink", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "CLASS_NAME", "Ljava/lang/String;", "EXTRA_MINI_APP_NAME", "EXTRA_REFERRER_MINI_APP_NAME", "EXTRA_DEEPLINK", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(@NotNull String miniAppName, String referrerMiniAppName, String deeplink) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            CmlTabsNavigationFragment cmlTabsNavigationFragment = new CmlTabsNavigationFragment();
            cmlTabsNavigationFragment.setArguments(d.b(new Pair("CmlTabsNavigationFragment.ExtraKey.MiniAppName", miniAppName), new Pair("CmlTabsNavigationFragment.ExtraKey.Deeplink", deeplink), new Pair("CmlTabsNavigationFragment.ExtraKey.ReferrerMiniAppName", referrerMiniAppName)));
            return cmlTabsNavigationFragment;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsNavigationFragment$onBackPressedCallback$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsNavigationFragment$tabFragmentListener$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsNavigationFragment$tabChildFragmentListener$1] */
    public CmlTabsNavigationFragment() {
        CmlTabsNavigationFragment$viewModel$2 cmlTabsNavigationFragment$viewModel$2 = new CmlTabsNavigationFragment$viewModel$2(this);
        InterfaceC4008j a11 = k.a(n.NONE, new CmlTabsNavigationFragment$special$$inlined$viewModels$default$2(new CmlTabsNavigationFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(CmlTabsViewModelImpl.class), new CmlTabsNavigationFragment$special$$inlined$viewModels$default$3(a11), new CmlTabsNavigationFragment$special$$inlined$viewModels$default$4(null, a11), cmlTabsNavigationFragment$viewModel$2);
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsNavigationFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                g gVar;
                gVar = CmlTabsNavigationFragment.this.ozonRouter;
                if (gVar != null) {
                    l.a(gVar);
                } else {
                    Intrinsics.n("ozonRouter");
                    throw null;
                }
            }
        };
        this.tabFragmentListener = new G.m() { // from class: ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsNavigationFragment$tabFragmentListener$1
            @Override // androidx.fragment.app.G.m
            public void onFragmentAttached(G fm, ComponentCallbacksC5392m fragment, Context context) {
                CmlTabsNavigationFragment$tabChildFragmentListener$1 cmlTabsNavigationFragment$tabChildFragmentListener$1;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(context, "context");
                super.onFragmentAttached(fm, fragment, context);
                G childFragmentManager = fragment.getChildFragmentManager();
                cmlTabsNavigationFragment$tabChildFragmentListener$1 = CmlTabsNavigationFragment.this.tabChildFragmentListener;
                childFragmentManager.Y0(cmlTabsNavigationFragment$tabChildFragmentListener$1, false);
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentDetached(G fm, ComponentCallbacksC5392m fragment) {
                CmlTabsNavigationFragment$tabChildFragmentListener$1 cmlTabsNavigationFragment$tabChildFragmentListener$1;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                super.onFragmentDetached(fm, fragment);
                G childFragmentManager = fragment.getChildFragmentManager();
                cmlTabsNavigationFragment$tabChildFragmentListener$1 = CmlTabsNavigationFragment.this.tabChildFragmentListener;
                childFragmentManager.t1(cmlTabsNavigationFragment$tabChildFragmentListener$1);
            }
        };
        this.tabChildFragmentListener = new G.m() { // from class: ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsNavigationFragment$tabChildFragmentListener$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.fragment.app.G.m
            public void onFragmentViewCreated(G fm, ComponentCallbacksC5392m fragment, View view, Bundle savedInstanceState) {
                WeakHashMap weakHashMap;
                FragmentCmlTabsNavigationBinding binding;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(view, "view");
                super.onFragmentViewCreated(fm, fragment, view, savedInstanceState);
                weakHashMap = CmlTabsNavigationFragment.this.childFragments;
                weakHashMap.put(fragment, null);
                ExternalOffsetHandler externalOffsetHandler = fragment instanceof ExternalOffsetHandler ? (ExternalOffsetHandler) fragment : null;
                if (externalOffsetHandler != null) {
                    binding = CmlTabsNavigationFragment.this.getBinding();
                    externalOffsetHandler.setMaxBottomOffset(binding.bottomNavigation.getMeasuredHeight());
                }
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentViewDestroyed(G fm, ComponentCallbacksC5392m fragment) {
                WeakHashMap weakHashMap;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                super.onFragmentViewDestroyed(fm, fragment);
                weakHashMap = CmlTabsNavigationFragment.this.childFragments;
                weakHashMap.remove(fragment);
            }
        };
        this.childFragments = new WeakHashMap<>();
    }

    private final void bindNavigator(RemoteTabConfig config) {
        CmlAppTabNavigator cmlAppTabNavigator = this.navigator;
        if (cmlAppTabNavigator == null) {
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            CmlAppTabNavigator cmlAppTabNavigator2 = new CmlAppTabNavigator(R$id.rootContainer, config.getTabNavigatorConfig(), this, childFragmentManager);
            this.navigator = cmlAppTabNavigator2;
            BottomNavigationController bottomNavigationController = this.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            cmlAppTabNavigator2.setOnTabChangeListener(bottomNavigationController);
            CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate = this.cacheHolderTabActivityDelegate;
            if (cacheHolderTabActivityDelegate == null) {
                Intrinsics.n("cacheHolderTabActivityDelegate");
                throw null;
            }
            CmlAppTabNavigator cmlAppTabNavigator3 = this.navigator;
            if (cmlAppTabNavigator3 == null) {
                Intrinsics.n("navigator");
                throw null;
            }
            cacheHolderTabActivityDelegate.init(cmlAppTabNavigator3);
        } else {
            if (cmlAppTabNavigator == null) {
                Intrinsics.n("navigator");
                throw null;
            }
            cmlAppTabNavigator.setTabConfig(config.getTabNavigatorConfig());
        }
        h hVar = this.holder;
        if (hVar == null) {
            Intrinsics.n("holder");
            throw null;
        }
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        CmlAppTabNavigator cmlAppTabNavigator4 = this.navigator;
        if (cmlAppTabNavigator4 != null) {
            yZ.h.b(hVar, viewLifecycleOwner, cmlAppTabNavigator4);
        } else {
            Intrinsics.n("navigator");
            throw null;
        }
    }

    private final void configureBottomNavigationController(final RemoteTabConfig config) {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        BottomNavigationController.setItems$default(bottomNavigationController, config.getTabItems(), null, 2, null);
        BottomNavigationController.setItemColors$default(bottomNavigationController, config.getActiveColorsConfig(), null, 2, null);
        bottomNavigationController.init();
        BottomNavigationController.setOnNavigationItemSelectedListener$default(bottomNavigationController, 0L, new OnBottomNavigationItemSelectedListener() { // from class: xq.a
            @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
            public final boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
                boolean configureBottomNavigationController$lambda$7$lambda$6;
                configureBottomNavigationController$lambda$7$lambda$6 = CmlTabsNavigationFragment.configureBottomNavigationController$lambda$7$lambda$6(RemoteTabConfig.this, this, bottomMenuItem, bottomMenuItem2);
                return configureBottomNavigationController$lambda$7$lambda$6;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configureBottomNavigationController$lambda$7$lambda$6(RemoteTabConfig remoteTabConfig, CmlTabsNavigationFragment cmlTabsNavigationFragment, BottomMenuItem current, BottomMenuItem old) {
        Object obj;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(old, "old");
        if (current.getBehavior() == BottomNavigationBehavior.BEHAVIOR_TYPE_REDIRECT) {
            Iterator<T> it = remoteTabConfig.getTabItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((BottomNavigationItem) obj).getId() == current.getId()) {
                    break;
                }
            }
            BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) obj;
            if (bottomNavigationItem == null) {
                return false;
            }
            g gVar = cmlTabsNavigationFragment.ozonRouter;
            if (gVar != null) {
                g.a.a(gVar, bottomNavigationItem.getDeeplink(), null, null, 6);
                return false;
            }
            Intrinsics.n("ozonRouter");
            throw null;
        }
        if (!current.equals(old)) {
            CmlAppTabNavigator cmlAppTabNavigator = cmlTabsNavigationFragment.navigator;
            if (cmlAppTabNavigator != null) {
                EZ.g.navigate$default(cmlAppTabNavigator, f.a(new e(current.getId(), null)), 0, 2, null);
                return true;
            }
            Intrinsics.n("navigator");
            throw null;
        }
        CmlAppTabNavigator cmlAppTabNavigator2 = cmlTabsNavigationFragment.navigator;
        if (cmlAppTabNavigator2 == null) {
            Intrinsics.n("navigator");
            throw null;
        }
        NZ.g activeTabOrNull = cmlAppTabNavigator2.activeTabOrNull();
        if (activeTabOrNull == null) {
            return true;
        }
        cmlTabsNavigationFragment.onSelectedTabClicked(activeTabOrNull);
        return true;
    }

    private final String consumeDeeplink() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("CmlTabsNavigationFragment.ExtraKey.Deeplink") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("CmlTabsNavigationFragment.ExtraKey.Deeplink");
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentCmlTabsNavigationBinding getBinding() {
        FragmentCmlTabsNavigationBinding fragmentCmlTabsNavigationBinding = this._binding;
        Intrinsics.f(fragmentCmlTabsNavigationBinding);
        return fragmentCmlTabsNavigationBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CmlTabsViewModelImpl getViewModel() {
        return (CmlTabsViewModelImpl) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessState(CmlTabsScreenState.Success state) {
        getBinding().screenState.showState(null);
        configureBottomNavigationController(state.getConfig());
        bindNavigator(state.getConfig());
        String consumeDeeplink = consumeDeeplink();
        if (consumeDeeplink != null) {
            g gVar = this.ozonRouter;
            if (gVar != null) {
                g.a.a(gVar, consumeDeeplink, null, null, 6);
            } else {
                Intrinsics.n("ozonRouter");
                throw null;
            }
        }
    }

    private final void injectDependencies() {
        CmlTabsNavigationFragmentComponent.Companion companion = CmlTabsNavigationFragmentComponent.INSTANCE;
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
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
        CmlTabsNavigationFragmentComponent create = companion.create(this, networkComponentApi, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, (AndroidPlatformComponentDependencies) dependencyStorage5.b(AndroidPlatformComponentDependencies.class));
        this.ozonRouter = create.getRouter();
        this.holder = create.getNavigatorHolder();
        this.cacheHolderTabActivityDelegate = create.getCacheHolderTabActivityDelegate();
        this.viewModelFactory = create.getViewModelFactory();
        this.bottomNavigationController = create.getBottomNavigationController();
    }

    private final void observeStateChanges() {
        CmlTabsScreenState value = getViewModel().getScreenState().getValue();
        if (value instanceof CmlTabsScreenState.Success) {
            bindNavigator(((CmlTabsScreenState.Success) value).getConfig());
        }
        getViewModel().getScreenState().observe(getViewLifecycleOwner(), new CmlTabsNavigationFragment$sam$androidx_lifecycle_Observer$0(new CmlTabsNavigationFragment$observeStateChanges$1(this)));
    }

    private final void onSelectedTabClicked(NZ.g tabNavigator) {
        if (tabNavigator.clearBackStack()) {
            return;
        }
        tabNavigator.scrollToTop();
    }

    private final void setUpScreenState() {
        getBinding().screenState.setListener(new CmlTabsNavigationFragment$setUpScreenState$1(this));
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

    @Override // ru.ozon.app.android.uikit.container.ExternalOffsetHandler
    public int getMaxBottomOffset() {
        return getBinding().bottomNavigation.getMeasuredHeight();
    }

    @Override // NZ.j
    @NotNull
    public Map<String, Integer> getPathConfig() {
        CmlAppTabNavigator cmlAppTabNavigator = this.navigator;
        if (cmlAppTabNavigator == null) {
            return U.c();
        }
        if (cmlAppTabNavigator != null) {
            return cmlAppTabNavigator.getPathConfig();
        }
        Intrinsics.n("navigator");
        throw null;
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool */
    public RecycledAtomPool getAtomPool() {
        CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate = this.cacheHolderTabActivityDelegate;
        if (cacheHolderTabActivityDelegate != null) {
            return cacheHolderTabActivityDelegate.getAtomPool();
        }
        Intrinsics.n("cacheHolderTabActivityDelegate");
        throw null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public c getPrefetchViewPool() {
        CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate = this.cacheHolderTabActivityDelegate;
        if (cacheHolderTabActivityDelegate != null) {
            return cacheHolderTabActivityDelegate.getPrefetchViewPool();
        }
        Intrinsics.n("cacheHolderTabActivityDelegate");
        throw null;
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigation() {
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
        injectDependencies();
        super.onAttach(context);
        getChildFragmentManager().Y0(this.tabFragmentListener, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("CmlTabsNavigationFragment.ExtraKey.MiniAppName") : null;
        if (string == null) {
            string = "";
        }
        this.miniAppName = string;
        Bundle arguments2 = getArguments();
        this.referrerMiniAppName = arguments2 != null ? arguments2.getString("CmlTabsNavigationFragment.ExtraKey.ReferrerMiniAppName") : null;
        CmlTabsViewModelImpl viewModel = getViewModel();
        M4.c savedStateRegistry = getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "<get-savedStateRegistry>(...)");
        viewModel.init(savedStateRegistry);
        if (savedInstanceState == null) {
            String str = this.miniAppName;
            if (str != null) {
                viewModel.loadTabConfig(str, this.referrerMiniAppName);
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
        this._binding = FragmentCmlTabsNavigationBinding.inflate(getLayoutInflater(), container, false);
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
        super.onDestroyView();
        this._binding = null;
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
        setUpScreenState();
        observeStateChanges();
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        OzonBottomNavigationView bottomNavigation = getBinding().bottomNavigation;
        Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
        bottomNavigationController.configureBottomView(bottomNavigation);
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
        FragmentCmlTabsNavigationBinding fragmentCmlTabsNavigationBinding = this._binding;
        if (fragmentCmlTabsNavigationBinding != null) {
            setMaxBottomOffset(fragmentCmlTabsNavigationBinding.bottomNavigation.getMeasuredHeight());
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
