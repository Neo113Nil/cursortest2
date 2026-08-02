package ru.ozon.app.android.initializers;

import B0.C0;
import Fb0.e;
import He.b;
import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.mapsdk.common.geoproxy.model.ComposerApiHost;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/initializers/MapsActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "internetConnectionHandler", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/network/networkhandler/ConnectionHandler;)V", "", "init", "()V", "Landroid/content/Context;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "Lxe/M;", "coroutineScope", "Lxe/M;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapsActionInitializer implements ActionInitializer {

    @NotNull
    private final AppVersionService appVersionService;

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final Context context;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final EnvironmentService environmentService;

    @NotNull
    private final ConnectionHandler internetConnectionHandler;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;
    public static final int $stable = 8;

    public MapsActionInitializer(@NotNull Context context, @NotNull EnvironmentService environmentService, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull AreaLocalStore areaLocalStore, @NotNull AppVersionService appVersionService, @NotNull ConnectionHandler internetConnectionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(internetConnectionHandler, "internetConnectionHandler");
        this.context = context;
        this.environmentService = environmentService;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.areaLocalStore = areaLocalStore;
        this.appVersionService = appVersionService;
        this.internetConnectionHandler = internetConnectionHandler;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.coroutineScope = N.a(CoroutineContext.Element.a.d(b.f10879b, (H0) b11).plus(new MapsActionInitializer$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        ComposerApiHost composerApiHost;
        e eVar;
        e eVar2;
        String appName = Intrinsics.d(this.appVersionService.getAppName(), "freshapp_android") ? "fresh-mobile-android" : this.appVersionService.getAppName();
        OzonGeoProxyClient ozonGeoProxyClient = this.ozonGeoProxyClient;
        if (this.environmentService.isStage()) {
            e.Companion.getClass();
            eVar2 = e.defaultStage;
            composerApiHost = new ComposerApiHost(eVar2);
        } else {
            e.Companion.getClass();
            eVar = e.defaultProd;
            composerApiHost = new ComposerApiHost(eVar);
        }
        ozonGeoProxyClient.setConfig(appName, composerApiHost, this.areaLocalStore.getLocationUid());
        if (this.internetConnectionHandler.hasInternetConnection()) {
            C10727i.c(this.coroutineScope, null, null, new MapsActionInitializer$init$1(this, null), 3);
        }
        String[] strArr = {"yandex_logo_ru", "yandex_logo_ru_white", "yandex_logo_en", "yandex_logo_en_white"};
        for (int i11 = 0; i11 < 4; i11++) {
            this.context.getResources().getIdentifier(strArr[i11], "drawable", this.context.getPackageName());
        }
        if (BuildUtils.INSTANCE.isQaFlavor()) {
            C0.d(true);
        } else {
            C0.d(false);
        }
    }
}
