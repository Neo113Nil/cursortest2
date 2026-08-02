package ru.ozon.app.android.fresh.navigation;

import Rg.b;
import Sg.a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n10.InterfaceC8417a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.fresh.navigation.di.components.DaggerFreshScreenComponent;
import ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi;
import ru.ozon.app.android.fresh.navigation.di.components.FreshScreenComponent;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.miniapp.MiniAppHostFragment;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;
import ru.ozon.uni.atoms.af.pool.CacheHolder;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001:B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0007J#\u0010\u001f\u001a\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u0007J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/navigation/FreshTabMiniAppFragment;", "Lru/ozon/app/android/navigation/miniapp/MiniAppHostFragment;", "Ln10/a;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/permission/PermissionRequester;", "LRg/b;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "miniApp", "deeplink", "Landroidx/fragment/app/m;", "createRootFragment", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "pageViewChanged", "LSg/a;", "getAnalyticsScreenStorage", "()LSg/a;", "Lru/ozon/app/android/fresh/navigation/FreshViewModel;", "viewModel", "Lru/ozon/app/android/fresh/navigation/FreshViewModel;", "getViewModel$navigation_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/fresh/navigation/FreshViewModel;", "setViewModel$navigation_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/fresh/navigation/FreshViewModel;)V", "Lru/ozon/app/android/fresh/navigation/FreshMapAppNameDelegate;", "freshMapAppNameDelegate", "Lru/ozon/app/android/fresh/navigation/FreshMapAppNameDelegate;", "getFreshMapAppNameDelegate$navigation_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/fresh/navigation/FreshMapAppNameDelegate;", "setFreshMapAppNameDelegate$navigation_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/fresh/navigation/FreshMapAppNameDelegate;)V", "", "themeId", "I", "getThemeId", "()I", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTabMiniAppFragment extends MiniAppHostFragment implements InterfaceC8417a, CacheHolder, PermissionRequester, b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public FreshMapAppNameDelegate freshMapAppNameDelegate;
    private PermissionRequest.Builder permissionRequestBuilder;
    private final int themeId = R$style.FreshActivityTheme;
    public FreshViewModel viewModel;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/FreshTabMiniAppFragment$Companion;", "", "<init>", "()V", "", "miniAppName", "referrerMiniAppName", "deeplink", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(@NotNull String miniAppName, String referrerMiniAppName, String deeplink) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            FreshTabMiniAppFragment freshTabMiniAppFragment = new FreshTabMiniAppFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ru.ozon.compass.ARG_REDIRECT_DEEPLINK", deeplink);
            bundle.putString("mini_app_param", miniAppName);
            bundle.putString("ru.ozon.compass.ARG_REFERRER_MINI_APP", referrerMiniAppName);
            freshTabMiniAppFragment.setArguments(bundle);
            return freshTabMiniAppFragment;
        }

        private Companion() {
        }
    }

    @Override // BZ.h
    @NotNull
    public ComponentCallbacksC5392m createRootFragment(@NotNull String miniApp, String deeplink) {
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        return FreshTabNavigationFragment.INSTANCE.newInstance(miniApp, requireArguments().getString("ru.ozon.compass.ARG_REFERRER_MINI_APP"), deeplink);
    }

    @Override // Rg.b
    @NotNull
    public a getAnalyticsScreenStorage() {
        return getViewModel$navigation_prodGoogleAllVendorsRelease().getAnalyticsScreenStorage();
    }

    @NotNull
    public final FreshMapAppNameDelegate getFreshMapAppNameDelegate$navigation_prodGoogleAllVendorsRelease() {
        FreshMapAppNameDelegate freshMapAppNameDelegate = this.freshMapAppNameDelegate;
        if (freshMapAppNameDelegate != null) {
            return freshMapAppNameDelegate;
        }
        Intrinsics.n("freshMapAppNameDelegate");
        throw null;
    }

    @Override // xZ.l
    public int getThemeId() {
        return this.themeId;
    }

    @NotNull
    public final FreshViewModel getViewModel$navigation_prodGoogleAllVendorsRelease() {
        FreshViewModel freshViewModel = this.viewModel;
        if (freshViewModel != null) {
            return freshViewModel;
        }
        Intrinsics.n("viewModel");
        throw null;
    }

    @Override // BZ.h, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FreshScreenComponent.Factory factory = DaggerFreshScreenComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage.b(AnalyticsComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage3.b(ComposerComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage4.b(AccountComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage5.b(NetworkComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, FreshNavigationComponentApi.class).getDependencyStorage();
        if (FreshNavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FreshNavigationComponentApi is not DiComponent");
        }
        FreshNavigationComponentApi freshNavigationComponentApi = (FreshNavigationComponentApi) dependencyStorage6.b(FreshNavigationComponentApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, CartServiceApi.class).getDependencyStorage();
        if (CartServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartServiceApi is not DiComponent");
        }
        CartServiceApi cartServiceApi = (CartServiceApi) dependencyStorage7.b(CartServiceApi.class);
        C6740b dependencyStorage8 = C6739a.b(this, LocationComponentApi.class).getDependencyStorage();
        if (LocationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LocationComponentApi is not DiComponent");
        }
        LocationComponentApi locationComponentApi = (LocationComponentApi) dependencyStorage8.b(LocationComponentApi.class);
        C6740b dependencyStorage9 = C6739a.b(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        factory.create(analyticsComponentApi, navigationComponentApi, composerComponentApi, accountComponentApi, networkComponentApi, freshNavigationComponentApi, cartServiceApi, locationComponentApi, (AnalyticsScreenStorageComponentApi) dependencyStorage9.b(AnalyticsScreenStorageComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // BZ.h, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        this.permissionRequestBuilder = new PermissionRequest.Builder(this);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        getViewModel$navigation_prodGoogleAllVendorsRelease().onClosed();
        super.onDestroy();
    }

    @Override // BZ.h, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getLifecycle().a(getFreshMapAppNameDelegate$navigation_prodGoogleAllVendorsRelease());
    }

    @Override // n10.InterfaceC8417a
    public void pageViewChanged() {
        getViewModel$navigation_prodGoogleAllVendorsRelease().pageViewChanged();
    }

    @Override // ru.ozon.app.android.permission.PermissionRequester
    public void requestPermission(@NotNull Function1<? super PermissionRequest.Builder, Unit> buildPermissionRequest) {
        Intrinsics.checkNotNullParameter(buildPermissionRequest, "buildPermissionRequest");
        PermissionRequest.Builder builder = this.permissionRequestBuilder;
        if (builder == null) {
            Intrinsics.n("permissionRequestBuilder");
            throw null;
        }
        buildPermissionRequest.invoke(builder);
        builder.build().execute();
    }
}
