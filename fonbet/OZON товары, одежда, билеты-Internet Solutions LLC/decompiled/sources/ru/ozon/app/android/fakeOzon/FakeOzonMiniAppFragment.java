package ru.ozon.app.android.fakeOzon;

import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment;
import ru.ozon.app.android.navigation.miniapp.MiniAppHostFragment;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;
import ru.ozon.app.android.storefront.feature.miniapp.R$style;
import ru.ozon.uni.atoms.af.pool.CacheHolder;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fakeOzon/FakeOzonMiniAppFragment;", "Lru/ozon/app/android/navigation/miniapp/MiniAppHostFragment;", "Lru/ozon/app/android/permission/PermissionRequester;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "miniApp", "deeplink", "Landroidx/fragment/app/m;", "createRootFragment", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "", "getThemeId", "()I", "themeId", "Companion", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeOzonMiniAppFragment extends MiniAppHostFragment implements PermissionRequester, CacheHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private PermissionRequest.Builder permissionRequestBuilder;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fakeOzon/FakeOzonMiniAppFragment$Companion;", "", "<init>", "()V", "", "miniAppName", "deeplink", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(@NotNull String miniAppName, String deeplink) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            FakeOzonMiniAppFragment fakeOzonMiniAppFragment = new FakeOzonMiniAppFragment();
            Bundle bundle = new Bundle();
            bundle.putString("mini_app_param", miniAppName);
            bundle.putString("ru.ozon.compass.ARG_REDIRECT_DEEPLINK", deeplink);
            fakeOzonMiniAppFragment.setArguments(bundle);
            return fakeOzonMiniAppFragment;
        }

        private Companion() {
        }
    }

    @Override // BZ.h
    @NotNull
    public ComponentCallbacksC5392m createRootFragment(@NotNull String miniApp, String deeplink) {
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        return FakeOzonTabNavigationFragment.INSTANCE.newInstance(miniApp, deeplink);
    }

    @Override // xZ.l
    public int getThemeId() {
        return R$style.FakeOzonTheme;
    }

    @Override // BZ.h, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        this.permissionRequestBuilder = new PermissionRequest.Builder(this);
        super.onCreate(savedInstanceState);
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
