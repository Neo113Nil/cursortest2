package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

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
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.miniapp.MiniAppHostFragment;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;
import ru.ozon.app.android.travel.feature.general.common.R$style;
import ru.ozon.app.android.travel.feature.general.common.tab.di.DaggerTravelMiniAppComponent;
import ru.ozon.app.android.travel.feature.general.common.tab.di.TravelMiniAppComponent;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabNavigationFragment;
import ru.ozon.app.android.travel.map.di.TravelMapApi;
import ru.ozon.app.android.travel.map.flags.TravelOzonMapNewProviderFlow;
import ru.ozon.app.android.travel.utils.TravelHostFragment;
import ru.ozon.uni.atoms.af.pool.CacheHolder;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00014B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\t2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelMiniAppFragment;", "Lru/ozon/app/android/navigation/miniapp/MiniAppHostFragment;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/permission/PermissionRequester;", "Lru/ozon/app/android/travel/utils/TravelHostFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "miniApp", "deeplink", "Landroidx/fragment/app/m;", "createRootFragment", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "", "themeId", "I", "getThemeId", "()I", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/SwitchMapProviderObserver;", "switchMapProviderObserver", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/SwitchMapProviderObserver;", "getSwitchMapProviderObserver$common_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/travel/feature/general/common/tab/presentation/SwitchMapProviderObserver;", "setSwitchMapProviderObserver$common_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/travel/feature/general/common/tab/presentation/SwitchMapProviderObserver;)V", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService$common_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/network/abtool/FeatureService;", "setFeatureService$common_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelMiniAppFragment extends MiniAppHostFragment implements CacheHolder, PermissionRequester, TravelHostFragment {
    public FeatureService featureService;
    private PermissionRequest.Builder permissionRequestBuilder;
    public SwitchMapProviderObserver switchMapProviderObserver;
    private final int themeId = R$style.TravelTabTheme;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelMiniAppFragment$Companion;", "", "<init>", "()V", "", "deeplink", "miniAppName", "referrerMiniAppName", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(String deeplink, @NotNull String miniAppName, @NotNull String referrerMiniAppName) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            Intrinsics.checkNotNullParameter(referrerMiniAppName, "referrerMiniAppName");
            TravelMiniAppFragment travelMiniAppFragment = new TravelMiniAppFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ru.ozon.compass.ARG_REDIRECT_DEEPLINK", deeplink);
            bundle.putString("mini_app_param", miniAppName);
            bundle.putString("ru.ozon.compass.ARG_REFERRER_MINI_APP", referrerMiniAppName);
            travelMiniAppFragment.setArguments(bundle);
            return travelMiniAppFragment;
        }

        private Companion() {
        }
    }

    @Override // BZ.h
    @NotNull
    public ComponentCallbacksC5392m createRootFragment(@NotNull String miniApp, String deeplink) {
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        TravelTabNavigationFragment.Companion companion = TravelTabNavigationFragment.INSTANCE;
        Bundle arguments = getArguments();
        return companion.newInstance(miniApp, arguments != null ? arguments.getString("ru.ozon.compass.ARG_REFERRER_MINI_APP") : null, deeplink);
    }

    @NotNull
    public final FeatureService getFeatureService$common_prodGoogleAllVendorsRelease() {
        FeatureService featureService = this.featureService;
        if (featureService != null) {
            return featureService;
        }
        Intrinsics.n("featureService");
        throw null;
    }

    @NotNull
    public final SwitchMapProviderObserver getSwitchMapProviderObserver$common_prodGoogleAllVendorsRelease() {
        SwitchMapProviderObserver switchMapProviderObserver = this.switchMapProviderObserver;
        if (switchMapProviderObserver != null) {
            return switchMapProviderObserver;
        }
        Intrinsics.n("switchMapProviderObserver");
        throw null;
    }

    @Override // xZ.l
    public int getThemeId() {
        return this.themeId;
    }

    @Override // BZ.h, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        TravelMiniAppComponent.Factory factory = DaggerTravelMiniAppComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage.b(ContextComponentDependencies.class);
        C6740b dependencyStorage2 = C6739a.b(this, LocationComponentApi.class).getDependencyStorage();
        if (LocationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LocationComponentApi is not DiComponent");
        }
        LocationComponentApi locationComponentApi = (LocationComponentApi) dependencyStorage2.b(LocationComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage3.b(NavigationComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, TravelMapApi.class).getDependencyStorage();
        if (TravelMapApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TravelMapApi is not DiComponent");
        }
        TravelMapApi travelMapApi = (TravelMapApi) dependencyStorage4.b(TravelMapApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        factory.create(contextComponentDependencies, locationComponentApi, navigationComponentApi, travelMapApi, (NetworkComponentApi) dependencyStorage5.b(NetworkComponentApi.class)).inject(this);
    }

    @Override // BZ.h, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        this.permissionRequestBuilder = new PermissionRequest.Builder(this);
        super.onCreate(savedInstanceState);
    }

    @Override // BZ.h, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getFeatureService$common_prodGoogleAllVendorsRelease().getBooleanKey(TravelOzonMapNewProviderFlow.INSTANCE)) {
            return;
        }
        getViewLifecycleOwner().getLifecycle().a(getSwitchMapProviderObserver$common_prodGoogleAllVendorsRelease());
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
