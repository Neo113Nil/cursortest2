package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import EZ.f;
import EZ.h;
import GZ.g;
import GZ.l;
import NZ.j;
import OZ.e;
import Pc.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fJ.C6477d;
import fk0.c;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.travel.feature.general.common.databinding.FragmentTravelTabBinding;
import ru.ozon.app.android.travel.feature.general.common.tab.di.DaggerTravelTabNavigationFragmentComponent;
import ru.ozon.app.android.travel.feature.general.common.tab.di.TravelTabNavigationFragmentComponent;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabScreenState;
import ru.ozon.app.android.travel.ui.tabs.di.TravelUnpaidOrderStorageApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b*\u0002\u0085\u0001\b\u0007\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0094\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0007J)\u0010!\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0007J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u0007J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b+\u0010(J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0011\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\n\u0018\u000107j\u0004\u0018\u0001`8H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0002¢\u0006\u0004\b;\u0010\u0007J\u000f\u0010<\u001a\u00020\nH\u0002¢\u0006\u0004\b<\u0010\u0007J\u000f\u0010=\u001a\u00020\nH\u0002¢\u0006\u0004\b=\u0010\u0007J\u0017\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\n2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\n2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010\u0007J\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0002¢\u0006\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Z\u001a\u00020Y8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR(\u0010i\u001a\b\u0012\u0004\u0012\u00020h0g8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010p\u001a\u00020o8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u00020{8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010zR\u0019\u0010\u0080\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R$\u0010\u0090\u0001\u001a\u000f\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u001c0\u008d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0093\u0001\u001a\u00020O8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0095\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabNavigationFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "LNZ/j;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "createBadgeDrawer", "setUpScreenState", "observeStateChanges", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabScreenState$Success;", "state", "handleSuccessState", "(Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabScreenState$Success;)V", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "config", "bindNavigator", "(Lru/ozon/app/android/tabbar/data/RemoteTabConfig;)V", "configureBottomNavigationController", "observeBadgeChanges", "LNZ/g;", "tabNavigator", "onSelectedTabClicked", "(LNZ/g;)V", "", "consumeDeeplink", "()Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/general/common/databinding/FragmentTravelTabBinding;", "_binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/FragmentTravelTabBinding;", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter$common_prodGoogleAllVendorsRelease", "()LGZ/g;", "setOzonRouter$common_prodGoogleAllVendorsRelease", "(LGZ/g;)V", "LEZ/h;", "holder", "LEZ/h;", "getHolder$common_prodGoogleAllVendorsRelease", "()LEZ/h;", "setHolder$common_prodGoogleAllVendorsRelease", "(LEZ/h;)V", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "cacheHolderTabActivityDelegate", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "getCacheHolderTabActivityDelegate$common_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "setCacheHolderTabActivityDelegate$common_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;)V", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel$common_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$common_prodGoogleAllVendorsRelease", "(LPc/a;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "bottomNavigationControllerFactory", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "getBottomNavigationControllerFactory", "()Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "setBottomNavigationControllerFactory", "(Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "bottomNavigationController", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "referrerMiniAppName", "Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabViewModel;", "viewModel", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabViewModel;", "miniAppName", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelMiniAppTabNavigator;", "navigator", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelMiniAppTabNavigator;", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelBottomNavigationBadgeDrawer;", "badgeDrawer", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelBottomNavigationBadgeDrawer;", "ru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabNavigationFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabNavigationFragment$onBackPressedCallback$1;", "Lnc/a;", "disposables", "Lnc/a;", "navigationTabWithId", "I", "", "getPathConfig", "()Ljava/util/Map;", "pathConfig", "getBinding", "()Lru/ozon/app/android/travel/feature/general/common/databinding/FragmentTravelTabBinding;", "binding", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelTabNavigationFragment extends ComponentCallbacksC5392m implements BottomNavigationStateController, BottomNavigationAnimationController, CacheHolder, j {
    private FragmentTravelTabBinding _binding;
    private TravelBottomNavigationBadgeDrawer badgeDrawer;
    private BottomNavigationController bottomNavigationController;
    public BottomNavigationController.Factory bottomNavigationControllerFactory;
    public CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate;
    public h holder;
    private String miniAppName;
    private TravelMiniAppTabNavigator navigator;
    public g ozonRouter;
    public a<TravelTabViewModelImpl> pViewModel;
    private String referrerMiniAppName;
    private TravelTabViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final TravelTabNavigationFragment$onBackPressedCallback$1 onBackPressedCallback = new C() { // from class: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabNavigationFragment$onBackPressedCallback$1
        {
            super(true);
        }

        @Override // androidx.activity.C
        public void handleOnBackPressed() {
            l.a(TravelTabNavigationFragment.this.getOzonRouter$common_prodGoogleAllVendorsRelease());
        }
    };

    @NotNull
    private final C8486a disposables = new C8486a();
    private final int navigationTabWithId = R$id.menu_tickets;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabNavigationFragment$Companion;", "", "<init>", "()V", "", "miniAppName", "referrerMiniAppName", "deeplink", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "CLASS_NAME", "Ljava/lang/String;", "EXTRA_MINI_APP_NAME", "EXTRA_REFERRER_MINI_APP_NAME", "EXTRA_DEEPLINK", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(@NotNull String miniAppName, String referrerMiniAppName, String deeplink) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            Bundle bundle = new Bundle();
            TravelTabNavigationFragment travelTabNavigationFragment = new TravelTabNavigationFragment();
            bundle.putString("TravelMainActivity.ExtraKey.MiniAppName", miniAppName);
            bundle.putString("TravelMainActivity.ExtraKey.Deeplink", deeplink);
            bundle.putString("TravelMainActivity.ExtraKey.ReferrerMiniAppName", referrerMiniAppName);
            travelTabNavigationFragment.setArguments(bundle);
            return travelTabNavigationFragment;
        }

        private Companion() {
        }
    }

    private final void bindNavigator(RemoteTabConfig config) {
        TravelMiniAppTabNavigator travelMiniAppTabNavigator = this.navigator;
        if (travelMiniAppTabNavigator != null) {
            travelMiniAppTabNavigator.setTabConfig(config.getTabNavigatorConfig());
        } else {
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            TravelMiniAppTabNavigator travelMiniAppTabNavigator2 = new TravelMiniAppTabNavigator(ru.ozon.app.android.travel.feature.general.common.R$id.rootContainer, config.getTabNavigatorConfig(), this, childFragmentManager);
            this.navigator = travelMiniAppTabNavigator2;
            BottomNavigationController bottomNavigationController = this.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            travelMiniAppTabNavigator2.setOnTabChangeListener(bottomNavigationController);
            CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate$common_prodGoogleAllVendorsRelease = getCacheHolderTabActivityDelegate$common_prodGoogleAllVendorsRelease();
            TravelMiniAppTabNavigator travelMiniAppTabNavigator3 = this.navigator;
            if (travelMiniAppTabNavigator3 == null) {
                Intrinsics.n("navigator");
                throw null;
            }
            cacheHolderTabActivityDelegate$common_prodGoogleAllVendorsRelease.init(travelMiniAppTabNavigator3);
        }
        h holder$common_prodGoogleAllVendorsRelease = getHolder$common_prodGoogleAllVendorsRelease();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        TravelMiniAppTabNavigator travelMiniAppTabNavigator4 = this.navigator;
        if (travelMiniAppTabNavigator4 != null) {
            yZ.h.b(holder$common_prodGoogleAllVendorsRelease, viewLifecycleOwner, travelMiniAppTabNavigator4);
        } else {
            Intrinsics.n("navigator");
            throw null;
        }
    }

    private final void configureBottomNavigationController(RemoteTabConfig config) {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        BottomNavigationController.setItems$default(bottomNavigationController, config.getTabItems(), null, 2, null);
        BottomNavigationController.setItemColors$default(bottomNavigationController, config.getActiveColorsConfig(), null, 2, null);
        bottomNavigationController.init();
        observeBadgeChanges();
        BottomNavigationController.setOnNavigationItemSelectedListener$default(bottomNavigationController, 0L, new C6477d(config, this), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configureBottomNavigationController$lambda$5$lambda$4(RemoteTabConfig remoteTabConfig, TravelTabNavigationFragment travelTabNavigationFragment, BottomMenuItem current, BottomMenuItem old) {
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
            if (bottomNavigationItem != null) {
                g.a.a(travelTabNavigationFragment.getOzonRouter$common_prodGoogleAllVendorsRelease(), bottomNavigationItem.getDeeplink(), null, null, 6);
            }
            return false;
        }
        if (!current.equals(old)) {
            TravelMiniAppTabNavigator travelMiniAppTabNavigator = travelTabNavigationFragment.navigator;
            if (travelMiniAppTabNavigator != null) {
                EZ.g.navigate$default(travelMiniAppTabNavigator, f.a(new e(current.getId(), null)), 0, 2, null);
                return true;
            }
            Intrinsics.n("navigator");
            throw null;
        }
        TravelMiniAppTabNavigator travelMiniAppTabNavigator2 = travelTabNavigationFragment.navigator;
        if (travelMiniAppTabNavigator2 == null) {
            Intrinsics.n("navigator");
            throw null;
        }
        NZ.g activeTabOrNull = travelMiniAppTabNavigator2.activeTabOrNull();
        if (activeTabOrNull == null) {
            return true;
        }
        travelTabNavigationFragment.onSelectedTabClicked(activeTabOrNull);
        return true;
    }

    private final String consumeDeeplink() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("TravelMainActivity.ExtraKey.Deeplink") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("TravelMainActivity.ExtraKey.Deeplink");
        }
        return string;
    }

    private final void createBadgeDrawer() {
        OzonBottomNavigationView bottomNavigation = getBinding().bottomNavigation;
        Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
        this.badgeDrawer = new TravelBottomNavigationBadgeDrawer(bottomNavigation, this.navigationTabWithId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentTravelTabBinding getBinding() {
        FragmentTravelTabBinding fragmentTravelTabBinding = this._binding;
        Intrinsics.f(fragmentTravelTabBinding);
        return fragmentTravelTabBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessState(TravelTabScreenState.Success state) {
        getBinding().screenState.showState(null);
        configureBottomNavigationController(state.getConfig());
        bindNavigator(state.getConfig());
        String consumeDeeplink = consumeDeeplink();
        if (consumeDeeplink != null) {
            g.a.a(getOzonRouter$common_prodGoogleAllVendorsRelease(), consumeDeeplink, null, null, 6);
        }
    }

    private final void observeBadgeChanges() {
        TravelTabViewModel travelTabViewModel = this.viewModel;
        if (travelTabViewModel != null) {
            travelTabViewModel.getOrderCount().observe(getViewLifecycleOwner(), new TravelTabNavigationFragment$sam$androidx_lifecycle_Observer$0(new TravelTabNavigationFragment$observeBadgeChanges$1(this)));
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    private final void observeStateChanges() {
        TravelTabViewModel travelTabViewModel = this.viewModel;
        if (travelTabViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        TravelTabScreenState value = travelTabViewModel.getScreenState().getValue();
        if (value instanceof TravelTabScreenState.Success) {
            bindNavigator(((TravelTabScreenState.Success) value).getConfig());
        }
        TravelTabViewModel travelTabViewModel2 = this.viewModel;
        if (travelTabViewModel2 != null) {
            travelTabViewModel2.getScreenState().observe(getViewLifecycleOwner(), new TravelTabNavigationFragment$sam$androidx_lifecycle_Observer$0(new TravelTabNavigationFragment$observeStateChanges$1(this)));
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    private final void onSelectedTabClicked(NZ.g tabNavigator) {
        if (tabNavigator.clearBackStack()) {
            return;
        }
        tabNavigator.scrollToTop();
    }

    private final void setUpScreenState() {
        getBinding().screenState.setListener(new TravelTabNavigationFragment$setUpScreenState$1(this));
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
    public final CacheHolderTabActivityDelegate getCacheHolderTabActivityDelegate$common_prodGoogleAllVendorsRelease() {
        CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate = this.cacheHolderTabActivityDelegate;
        if (cacheHolderTabActivityDelegate != null) {
            return cacheHolderTabActivityDelegate;
        }
        Intrinsics.n("cacheHolderTabActivityDelegate");
        throw null;
    }

    @NotNull
    public final h getHolder$common_prodGoogleAllVendorsRelease() {
        h hVar = this.holder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("holder");
        throw null;
    }

    @NotNull
    public final g getOzonRouter$common_prodGoogleAllVendorsRelease() {
        g gVar = this.ozonRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("ozonRouter");
        throw null;
    }

    @NotNull
    public final a<TravelTabViewModelImpl> getPViewModel$common_prodGoogleAllVendorsRelease() {
        a<TravelTabViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // NZ.j
    @NotNull
    public Map<String, Integer> getPathConfig() {
        TravelMiniAppTabNavigator travelMiniAppTabNavigator = this.navigator;
        if (travelMiniAppTabNavigator == null) {
            return U.c();
        }
        if (travelMiniAppTabNavigator != null) {
            return travelMiniAppTabNavigator.getPathConfig();
        }
        Intrinsics.n("navigator");
        throw null;
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool */
    public RecycledAtomPool getAtomPool() {
        return getCacheHolderTabActivityDelegate$common_prodGoogleAllVendorsRelease().getAtomPool();
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public c getPrefetchViewPool() {
        return getCacheHolderTabActivityDelegate$common_prodGoogleAllVendorsRelease().getPrefetchViewPool();
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigation() {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController.gone();
        View separatorForDarkTheme = getBinding().separatorForDarkTheme;
        Intrinsics.checkNotNullExpressionValue(separatorForDarkTheme, "separatorForDarkTheme");
        ViewExtKt.gone(separatorForDarkTheme);
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigationWithAnimation(long duration) {
        View separatorForDarkTheme = getBinding().separatorForDarkTheme;
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
        TravelTabNavigationFragmentComponent.Factory factory = DaggerTravelTabNavigationFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage.b(ContextComponentDependencies.class);
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
        C6740b dependencyStorage4 = C6739a.b(this, TabsComponentApi.class).getDependencyStorage();
        if (TabsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsComponentApi is not DiComponent");
        }
        TabsComponentApi tabsComponentApi = (TabsComponentApi) dependencyStorage4.b(TabsComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, TabsUiControllerComponentApi.class).getDependencyStorage();
        if (TabsUiControllerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsUiControllerComponentApi is not DiComponent");
        }
        TabsUiControllerComponentApi tabsUiControllerComponentApi = (TabsUiControllerComponentApi) dependencyStorage5.b(TabsUiControllerComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, TravelUnpaidOrderStorageApi.class).getDependencyStorage();
        if (TravelUnpaidOrderStorageApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TravelUnpaidOrderStorageApi is not DiComponent");
        }
        TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi = (TravelUnpaidOrderStorageApi) dependencyStorage6.b(TravelUnpaidOrderStorageApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, CoroutineDispatchersComponentApi.class).getDependencyStorage();
        if (CoroutineDispatchersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CoroutineDispatchersComponentApi is not DiComponent");
        }
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) dependencyStorage7.b(CoroutineDispatchersComponentApi.class);
        C6740b dependencyStorage8 = C6739a.b(this, AndroidPlatformComponentDependencies.class).getDependencyStorage();
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        factory.create(contextComponentDependencies, networkComponentApi, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, travelUnpaidOrderStorageApi, coroutineDispatchersComponentApi, (AndroidPlatformComponentDependencies) dependencyStorage8.b(AndroidPlatformComponentDependencies.class)).inject(this);
        super.onAttach(context);
        this.bottomNavigationController = getBottomNavigationControllerFactory().create(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.viewModel = (TravelTabViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabNavigationFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TravelTabViewModelImpl travelTabViewModelImpl = TravelTabNavigationFragment.this.getPViewModel$common_prodGoogleAllVendorsRelease().get();
                Intrinsics.g(travelTabViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return travelTabViewModelImpl;
            }
        }).a(TravelTabViewModelImpl.class);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("TravelMainActivity.ExtraKey.MiniAppName") : null;
        if (string == null) {
            string = "";
        }
        this.miniAppName = string;
        Bundle arguments2 = getArguments();
        this.referrerMiniAppName = arguments2 != null ? arguments2.getString("TravelMainActivity.ExtraKey.ReferrerMiniAppName") : null;
        TravelTabViewModel travelTabViewModel = this.viewModel;
        if (travelTabViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        M4.c savedStateRegistry = getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "<get-savedStateRegistry>(...)");
        travelTabViewModel.init(savedStateRegistry);
        if (savedInstanceState == null) {
            String str = this.miniAppName;
            if (str != null) {
                travelTabViewModel.observeConfigChanges(str, this.referrerMiniAppName);
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
        this._binding = FragmentTravelTabBinding.inflate(getLayoutInflater(), container, false);
        CoordinatorLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        this.disposables.d();
        this.badgeDrawer = null;
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
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        createBadgeDrawer();
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

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void showBottomNavigation() {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController.show();
        Context context = getContext();
        if (context == null || !ThemeExtKt.isDarkThemeActive(context)) {
            View separatorForDarkTheme = getBinding().separatorForDarkTheme;
            Intrinsics.checkNotNullExpressionValue(separatorForDarkTheme, "separatorForDarkTheme");
            ViewExtKt.gone(separatorForDarkTheme);
        } else {
            View separatorForDarkTheme2 = getBinding().separatorForDarkTheme;
            Intrinsics.checkNotNullExpressionValue(separatorForDarkTheme2, "separatorForDarkTheme");
            ViewExtKt.show(separatorForDarkTheme2);
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void showBottomNavigationWithAnimation(long duration) {
        Context context = getContext();
        if (context == null || !ThemeExtKt.isDarkThemeActive(context)) {
            View separatorForDarkTheme = getBinding().separatorForDarkTheme;
            Intrinsics.checkNotNullExpressionValue(separatorForDarkTheme, "separatorForDarkTheme");
            ViewExtKt.gone(separatorForDarkTheme);
        } else {
            View separatorForDarkTheme2 = getBinding().separatorForDarkTheme;
            Intrinsics.checkNotNullExpressionValue(separatorForDarkTheme2, "separatorForDarkTheme");
            ViewExtKt.show(separatorForDarkTheme2);
        }
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
