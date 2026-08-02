package ru.ozon.app.android.cml.feature.tabs.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.feature.tabs.R$style;
import ru.ozon.app.android.cml.feature.tabs.di.CmlMiniAppComponent;
import ru.ozon.app.android.cml.feature.tabs.di.DaggerCmlMiniAppComponent;
import ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsNavigationFragment;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.miniapp.MiniAppHostFragment;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;
import ru.ozon.uni.atoms.af.pool.CacheHolder;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/presentation/CmlMiniAppFragment;", "Lru/ozon/app/android/navigation/miniapp/MiniAppHostFragment;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/permission/PermissionRequester;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "miniApp", "deeplink", "Landroidx/fragment/app/m;", "createRootFragment", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "", "themeId", "I", "getThemeId", "()I", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "Lru/ozon/app/android/cml/feature/tabs/presentation/SwitchMapProviderObserver;", "switchMapProviderObserver", "Lru/ozon/app/android/cml/feature/tabs/presentation/SwitchMapProviderObserver;", "Companion", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlMiniAppFragment extends MiniAppHostFragment implements CacheHolder, PermissionRequester {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private PermissionRequest.Builder permissionRequestBuilder;
    private SwitchMapProviderObserver switchMapProviderObserver;
    private final int themeId = R$style.CmlTabsTheme;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/presentation/CmlMiniAppFragment$Companion;", "", "<init>", "()V", "", "deeplink", "miniAppName", "referrerMiniAppName", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(String deeplink, @NotNull String miniAppName, String referrerMiniAppName) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            CmlMiniAppFragment cmlMiniAppFragment = new CmlMiniAppFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ru.ozon.compass.ARG_REDIRECT_DEEPLINK", deeplink);
            bundle.putString("mini_app_param", miniAppName);
            bundle.putString("ru.ozon.compass.ARG_REFERRER_MINI_APP", referrerMiniAppName);
            cmlMiniAppFragment.setArguments(bundle);
            return cmlMiniAppFragment;
        }

        private Companion() {
        }
    }

    @Override // BZ.h
    @NotNull
    public ComponentCallbacksC5392m createRootFragment(@NotNull String miniApp, String deeplink) {
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        CmlTabsNavigationFragment.Companion companion = CmlTabsNavigationFragment.INSTANCE;
        Bundle arguments = getArguments();
        return companion.newInstance(miniApp, arguments != null ? arguments.getString("ru.ozon.compass.ARG_REFERRER_MINI_APP") : null, deeplink);
    }

    @Override // xZ.l
    public int getThemeId() {
        return this.themeId;
    }

    @Override // BZ.h, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        CmlMiniAppComponent.Factory factory = DaggerCmlMiniAppComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, LocationComponentApi.class).getDependencyStorage();
        if (LocationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LocationComponentApi is not DiComponent");
        }
        this.switchMapProviderObserver = factory.create((LocationComponentApi) dependencyStorage.b(LocationComponentApi.class)).provideSwitchMapObserver();
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
        AbstractC5434v lifecycle = getViewLifecycleOwner().getLifecycle();
        SwitchMapProviderObserver switchMapProviderObserver = this.switchMapProviderObserver;
        if (switchMapProviderObserver != null) {
            lifecycle.a(switchMapProviderObserver);
        } else {
            Intrinsics.n("switchMapProviderObserver");
            throw null;
        }
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
