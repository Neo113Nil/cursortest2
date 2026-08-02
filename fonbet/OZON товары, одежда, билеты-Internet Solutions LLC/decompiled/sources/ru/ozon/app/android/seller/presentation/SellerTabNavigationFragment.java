package ru.ozon.app.android.seller.presentation;

import DZ.a;
import EZ.h;
import GZ.g;
import GZ.l;
import NZ.j;
import OZ.e;
import OZ.f;
import U7.d;
import android.content.Context;
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
import fk0.c;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.miniapp.R$id;
import ru.ozon.app.android.miniapp.R$layout;
import ru.ozon.app.android.miniapp.databinding.FragmentSellerTabBinding;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.handlers.page.PdpPageInfo;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.seller.di.DaggerSellerTabNavigationFragmentComponent;
import ru.ozon.app.android.seller.di.SellerTabNavigationFragmentComponent;
import ru.ozon.app.android.seller.presentation.SellerState;
import ru.ozon.app.android.seller.presentation.SellerTabNavigationFragment;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b*\u0002\u0083\u0001\u0018\u0000 \u0091\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0091\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0007J\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0007J\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0007J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010(J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1H\u0016¢\u0006\u0004\b2\u00103J!\u00106\u001a\u00020\n2\u0006\u00105\u001a\u0002042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b6\u00107J%\u0010;\u001a\u0004\u0018\u00010:2\b\u00109\u001a\u0004\u0018\u0001082\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020AH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ!\u0010K\u001a\u00020\n2\u0006\u00105\u001a\u0002042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\bK\u00107R\"\u0010M\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010T\u001a\u00020S8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010[\u001a\u00020Z8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010b\u001a\u00020a8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010j\u001a\b\u0012\u0004\u0012\u00020i0h8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010q\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0016\u0010x\u001a\u00020w8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010z\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u007f\u0010{R\u001a\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R%\u0010\u008d\u0001\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u0086\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0092\u0001"}, d2 = {"Lru/ozon/app/android/seller/presentation/SellerTabNavigationFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "LNZ/j;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "Lru/ozon/app/android/seller/presentation/SellerState$Success;", "state", "showScreen", "(Lru/ozon/app/android/seller/presentation/SellerState$Success;Landroid/os/Bundle;)V", "", "deeplink", "LOZ/f;", "getDestination", "(Ljava/lang/String;Landroid/os/Bundle;)LOZ/f;", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "config", "configBottomNavigationController", "(Lru/ozon/app/android/tabbar/data/RemoteTabConfig;)V", "Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", "current", "old", "", "onNavigationItemSelected", "(Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;)Z", "LNZ/g;", "tabNavigator", "handleClickSelectedItem", "(LNZ/g;)V", "handleSuccessfulState", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "LEZ/h;", "holder", "LEZ/h;", "getHolder", "()LEZ/h;", "setHolder", "(LEZ/h;)V", "Lru/ozon/app/android/seller/presentation/SellerScreenStateCorrector;", "stateCorrector", "Lru/ozon/app/android/seller/presentation/SellerScreenStateCorrector;", "getStateCorrector$miniapp_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/seller/presentation/SellerScreenStateCorrector;", "setStateCorrector$miniapp_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/seller/presentation/SellerScreenStateCorrector;)V", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "cacheHolderTabActivityDelegate", "Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "getCacheHolderTabActivityDelegate$miniapp_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "setCacheHolderTabActivityDelegate$miniapp_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;)V", "LPc/a;", "Lru/ozon/app/android/seller/presentation/SellerViewModelImpl;", "pSellerViewModel", "LPc/a;", "getPSellerViewModel$miniapp_prodGoogleAllVendorsRelease", "()LPc/a;", "setPSellerViewModel$miniapp_prodGoogleAllVendorsRelease", "(LPc/a;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "bottomNavigationControllerFactory", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "getBottomNavigationControllerFactory", "()Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;", "setBottomNavigationControllerFactory", "(Lru/ozon/app/android/tabbar/ui/BottomNavigationController$Factory;)V", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "bottomNavigationController", "Lru/ozon/app/android/tabbar/ui/BottomNavigationController;", "referrerMiniAppName", "Ljava/lang/String;", "Lru/ozon/app/android/seller/presentation/SellerViewModel;", "sellerViewModel", "Lru/ozon/app/android/seller/presentation/SellerViewModel;", "miniAppName", "LDZ/a;", "navigator", "LDZ/a;", "ru/ozon/app/android/seller/presentation/SellerTabNavigationFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/seller/presentation/SellerTabNavigationFragment$onBackPressedCallback$1;", "Lru/ozon/app/android/miniapp/databinding/FragmentSellerTabBinding;", "mBinding", "Lru/ozon/app/android/miniapp/databinding/FragmentSellerTabBinding;", "", "", "getPathConfig", "()Ljava/util/Map;", "pathConfig", "getBinding", "()Lru/ozon/app/android/miniapp/databinding/FragmentSellerTabBinding;", "binding", "Companion", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SellerTabNavigationFragment extends ComponentCallbacksC5392m implements BottomNavigationStateController, BottomNavigationAnimationController, CacheHolder, j {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_DEEPLINK;

    @NotNull
    private static final String EXTRA_MINI_APP;

    @NotNull
    private static final String EXTRA_REFERRER_MINI_APP;

    @NotNull
    private static final String clazzName;
    private BottomNavigationController bottomNavigationController;
    public BottomNavigationController.Factory bottomNavigationControllerFactory;
    public CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate;
    public h holder;
    private FragmentSellerTabBinding mBinding;
    private String miniAppName;
    private a navigator;

    @NotNull
    private final SellerTabNavigationFragment$onBackPressedCallback$1 onBackPressedCallback;
    public g ozonRouter;
    public Pc.a<SellerViewModelImpl> pSellerViewModel;
    private String referrerMiniAppName;
    private SellerViewModel sellerViewModel;
    public SellerScreenStateCorrector stateCorrector;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/seller/presentation/SellerTabNavigationFragment$Companion;", "", "<init>", "()V", "", "miniAppName", "referrerMiniAppName", "deeplink", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "clazzName", "Ljava/lang/String;", "EXTRA_DEEPLINK", "EXTRA_MINI_APP", "EXTRA_REFERRER_MINI_APP", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(@NotNull String miniAppName, String referrerMiniAppName, String deeplink) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            Bundle bundle = new Bundle();
            SellerTabNavigationFragment sellerTabNavigationFragment = new SellerTabNavigationFragment();
            bundle.putString(SellerTabNavigationFragment.EXTRA_MINI_APP, miniAppName);
            bundle.putString(SellerTabNavigationFragment.EXTRA_DEEPLINK, deeplink);
            bundle.putString(SellerTabNavigationFragment.EXTRA_REFERRER_MINI_APP, referrerMiniAppName);
            sellerTabNavigationFragment.setArguments(bundle);
            return sellerTabNavigationFragment;
        }

        private Companion() {
        }
    }

    static {
        String canonicalName = SellerTabNavigationFragment.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "ru.ozon.app.android.seller.presentation.SellerTabNavigationFragment";
        }
        clazzName = canonicalName;
        EXTRA_DEEPLINK = d.e(canonicalName, ".EXTRA_DEEPLINK");
        EXTRA_MINI_APP = d.e(canonicalName, ".EXTRA_MINI_APP");
        EXTRA_REFERRER_MINI_APP = d.e(canonicalName, ".EXTRA_REFERRER_MINI_APP");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ru.ozon.app.android.seller.presentation.SellerTabNavigationFragment$onBackPressedCallback$1] */
    public SellerTabNavigationFragment() {
        super(R$layout.fragment_seller_tab);
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.seller.presentation.SellerTabNavigationFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                l.a(SellerTabNavigationFragment.this.getOzonRouter());
            }
        };
    }

    private final void configBottomNavigationController(final RemoteTabConfig config) {
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        OzonBottomNavigationView bottomNavigation = getBinding().bottomNavigation;
        Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
        bottomNavigationController.configureBottomView(bottomNavigation);
        BottomNavigationController bottomNavigationController2 = this.bottomNavigationController;
        if (bottomNavigationController2 == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        BottomNavigationController.setItems$default(bottomNavigationController2, config.getTabItems(), null, 2, null);
        BottomNavigationController bottomNavigationController3 = this.bottomNavigationController;
        if (bottomNavigationController3 == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        BottomNavigationController.setItemColors$default(bottomNavigationController3, config.getActiveColorsConfig(), null, 2, null);
        BottomNavigationController bottomNavigationController4 = this.bottomNavigationController;
        if (bottomNavigationController4 == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController4.init();
        BottomNavigationController bottomNavigationController5 = this.bottomNavigationController;
        if (bottomNavigationController5 != null) {
            BottomNavigationController.setOnNavigationItemSelectedListener$default(bottomNavigationController5, 0L, new OnBottomNavigationItemSelectedListener() { // from class: gJ.a
                @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
                public final boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
                    boolean configBottomNavigationController$lambda$6;
                    configBottomNavigationController$lambda$6 = SellerTabNavigationFragment.configBottomNavigationController$lambda$6(RemoteTabConfig.this, this, bottomMenuItem, bottomMenuItem2);
                    return configBottomNavigationController$lambda$6;
                }
            }, 1, null);
        } else {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configBottomNavigationController$lambda$6(RemoteTabConfig remoteTabConfig, SellerTabNavigationFragment sellerTabNavigationFragment, BottomMenuItem current, BottomMenuItem old) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(old, "old");
        for (BottomNavigationItem bottomNavigationItem : remoteTabConfig.getTabItems()) {
            if (bottomNavigationItem.getId() == current.getId()) {
                if (current.getBehavior() != BottomNavigationBehavior.BEHAVIOR_TYPE_REDIRECT) {
                    return sellerTabNavigationFragment.onNavigationItemSelected(current, old);
                }
                g.a.a(sellerTabNavigationFragment.getOzonRouter(), bottomNavigationItem.getDeeplink(), null, null, 6);
                return false;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSellerTabBinding getBinding() {
        FragmentSellerTabBinding fragmentSellerTabBinding = this.mBinding;
        Intrinsics.f(fragmentSellerTabBinding);
        return fragmentSellerTabBinding;
    }

    private final f getDestination(String deeplink, Bundle savedInstanceState) {
        if (savedInstanceState != null || deeplink == null) {
            return null;
        }
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        if (((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).getDeeplinkPageResolver().a(deeplink) instanceof PdpPageInfo) {
            return new OZ.d((int) System.nanoTime(), deeplink);
        }
        return null;
    }

    private final void handleClickSelectedItem(NZ.g tabNavigator) {
        if (tabNavigator.clearBackStack()) {
            return;
        }
        tabNavigator.scrollToTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessfulState(SellerState.Success state, Bundle savedInstanceState) {
        getBinding().screenState.showState(null);
        showScreen(state, savedInstanceState);
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
        if (activeTabOrNull == null) {
            return true;
        }
        handleClickSelectedItem(activeTabOrNull);
        return true;
    }

    private final void showScreen(SellerState.Success state, Bundle savedInstanceState) {
        Object obj;
        SellerTabNavigationFragment sellerTabNavigationFragment;
        CoordinatorLayout contentCl = getBinding().contentCl;
        Intrinsics.checkNotNullExpressionValue(contentCl, "contentCl");
        ViewExtKt.show(contentCl);
        RemoteTabConfig config = state.getConfig();
        configBottomNavigationController(config);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(EXTRA_DEEPLINK) : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove(EXTRA_DEEPLINK);
        }
        if (string != null && getStateCorrector$miniapp_prodGoogleAllVendorsRelease().shouldCorrectState(config, 1, string)) {
            config = getStateCorrector$miniapp_prodGoogleAllVendorsRelease().correctState(config, 1, string);
            string = null;
        }
        a aVar = this.navigator;
        if (aVar != null) {
            aVar.setTabConfig(config.getTabNavigatorConfig());
            sellerTabNavigationFragment = this;
        } else {
            List<BottomNavigationItem> tabItems = config.getTabItems();
            NZ.h tabNavigatorConfig = config.getTabNavigatorConfig();
            Iterator<T> it = tabItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((BottomNavigationItem) obj).getBehavior() == BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT) {
                        break;
                    }
                }
            }
            BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) obj;
            NZ.h a11 = NZ.h.a(tabNavigatorConfig, bottomNavigationItem != null ? bottomNavigationItem.getId() : tabItems.get(1).getId(), null, 2);
            int i11 = R$id.rootContainer;
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            sellerTabNavigationFragment = this;
            a aVar2 = new a(sellerTabNavigationFragment, childFragmentManager, i11, a11, getDestination(string, savedInstanceState));
            BottomNavigationController bottomNavigationController = sellerTabNavigationFragment.bottomNavigationController;
            if (bottomNavigationController == null) {
                Intrinsics.n("bottomNavigationController");
                throw null;
            }
            aVar2.setOnTabChangeListener(bottomNavigationController);
            getCacheHolderTabActivityDelegate$miniapp_prodGoogleAllVendorsRelease().init(aVar2);
            sellerTabNavigationFragment.navigator = aVar2;
        }
        h holder = getHolder();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        a aVar3 = sellerTabNavigationFragment.navigator;
        if (aVar3 == null) {
            Intrinsics.n("navigator");
            throw null;
        }
        yZ.h.b(holder, viewLifecycleOwner, aVar3);
        if (string != null) {
            g.a.a(getOzonRouter(), string, null, null, 6);
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
    public final CacheHolderTabActivityDelegate getCacheHolderTabActivityDelegate$miniapp_prodGoogleAllVendorsRelease() {
        CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate = this.cacheHolderTabActivityDelegate;
        if (cacheHolderTabActivityDelegate != null) {
            return cacheHolderTabActivityDelegate;
        }
        Intrinsics.n("cacheHolderTabActivityDelegate");
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
    public final Pc.a<SellerViewModelImpl> getPSellerViewModel$miniapp_prodGoogleAllVendorsRelease() {
        Pc.a<SellerViewModelImpl> aVar = this.pSellerViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pSellerViewModel");
        throw null;
    }

    @Override // NZ.j
    @NotNull
    public Map<String, Integer> getPathConfig() {
        Map<String, Integer> actualConfig = getStateCorrector$miniapp_prodGoogleAllVendorsRelease().actualConfig();
        if (actualConfig != null) {
            return actualConfig;
        }
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
        return getCacheHolderTabActivityDelegate$miniapp_prodGoogleAllVendorsRelease().getAtomPool();
    }

    @NotNull
    public final SellerScreenStateCorrector getStateCorrector$miniapp_prodGoogleAllVendorsRelease() {
        SellerScreenStateCorrector sellerScreenStateCorrector = this.stateCorrector;
        if (sellerScreenStateCorrector != null) {
            return sellerScreenStateCorrector;
        }
        Intrinsics.n("stateCorrector");
        throw null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public c getPrefetchViewPool() {
        return getCacheHolderTabActivityDelegate$miniapp_prodGoogleAllVendorsRelease().getPrefetchViewPool();
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
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SellerTabNavigationFragmentComponent.Factory factory = DaggerSellerTabNavigationFragmentComponent.factory();
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
        SellerViewModel sellerViewModel = (SellerViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.seller.presentation.SellerTabNavigationFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SellerViewModelImpl sellerViewModelImpl = SellerTabNavigationFragment.this.getPSellerViewModel$miniapp_prodGoogleAllVendorsRelease().get();
                Intrinsics.g(sellerViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sellerViewModelImpl;
            }
        }).a(SellerViewModelImpl.class);
        this.sellerViewModel = sellerViewModel;
        if (sellerViewModel == null) {
            Intrinsics.n("sellerViewModel");
            throw null;
        }
        M4.c savedStateRegistry = getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "<get-savedStateRegistry>(...)");
        sellerViewModel.init(savedStateRegistry);
        if (savedInstanceState == null) {
            SellerViewModel sellerViewModel2 = this.sellerViewModel;
            if (sellerViewModel2 == null) {
                Intrinsics.n("sellerViewModel");
                throw null;
            }
            String str = this.miniAppName;
            if (str != null) {
                sellerViewModel2.getTabConfig(str, this.referrerMiniAppName);
            } else {
                Intrinsics.n("miniAppName");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (onCreateView == null) {
            return null;
        }
        this.mBinding = FragmentSellerTabBinding.bind(onCreateView);
        return getBinding().getConstraintLayout();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        BottomNavigationController bottomNavigationController = this.bottomNavigationController;
        if (bottomNavigationController == null) {
            Intrinsics.n("bottomNavigationController");
            throw null;
        }
        bottomNavigationController.unbind();
        this.mBinding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().screenState.setListener(new SellerTabNavigationFragment$onViewCreated$1(this));
        SellerViewModel sellerViewModel = this.sellerViewModel;
        if (sellerViewModel == null) {
            Intrinsics.n("sellerViewModel");
            throw null;
        }
        SellerState value = sellerViewModel.getState().getValue();
        if (value instanceof SellerState.Success) {
            handleSuccessfulState((SellerState.Success) value, savedInstanceState);
        } else {
            SellerViewModel sellerViewModel2 = this.sellerViewModel;
            if (sellerViewModel2 == null) {
                Intrinsics.n("sellerViewModel");
                throw null;
            }
            LiveDataOperatorsKt.distinct(sellerViewModel2.getState()).observe(getViewLifecycleOwner(), new SellerTabNavigationFragment$sam$androidx_lifecycle_Observer$0(new SellerTabNavigationFragment$onViewCreated$2(this, savedInstanceState)));
        }
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
