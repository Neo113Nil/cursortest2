package ru.ozon.app.android.web.webview;

import GZ.g;
import GZ.j;
import GZ.k;
import GZ.l;
import HZ.a;
import We.A;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.flags.AppLikeWebViewFlag;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/web/webview/WebViewRouterImpl;", "Lru/ozon/app/android/web/webview/WebViewRouter;", "LGZ/g;", "ozonRouter", "LHZ/a;", "deeplinkHandlersCache", "LGZ/k;", "routeFactory", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LGZ/g;LHZ/a;LGZ/k;Lru/ozon/app/android/network/di/NetworkComponentConfig;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "deeplink", "", "", "properties", "", "openDeeplink", "(Ljava/lang/String;Ljava/util/Map;)Z", "", "dismissAndRedirect", "(Ljava/lang/String;)V", "popBackStack", "()V", "LGZ/g;", "LHZ/a;", "LGZ/k;", "Lru/ozon/app/android/network/abtool/FeatureService;", "apiTopPrivateDomain", "Ljava/lang/String;", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewRouterImpl implements WebViewRouter {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final String apiTopPrivateDomain;

    @NotNull
    private final a deeplinkHandlersCache;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final k routeFactory;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/web/webview/WebViewRouterImpl$Companion;", "", "<init>", "()V", "DEEPLINK_PREFIX", "", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public WebViewRouterImpl(@NotNull g ozonRouter, @NotNull a deeplinkHandlersCache, @NotNull k routeFactory, @NotNull NetworkComponentConfig networkComponentConfig, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        Intrinsics.checkNotNullParameter(networkComponentConfig, "networkComponentConfig");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.ozonRouter = ozonRouter;
        this.deeplinkHandlersCache = deeplinkHandlersCache;
        this.routeFactory = routeFactory;
        this.featureService = featureService;
        A.b bVar = A.f33515l;
        String apiUrl = networkComponentConfig.getApiUrl();
        bVar.getClass();
        this.apiTopPrivateDomain = A.b.c(apiUrl).v();
    }

    @Override // ru.ozon.app.android.web.webview.WebViewRouter
    public void dismissAndRedirect(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        l.a(this.ozonRouter);
        g.a.a(this.ozonRouter, deeplink, null, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0 != null ? r0.v() : null, r5.apiTopPrivateDomain) == false) goto L23;
     */
    @Override // ru.ozon.app.android.web.webview.WebViewRouter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean openDeeplink(@NotNull String deeplink, @NotNull Map<String, ? extends Object> properties) {
        IZ.a b11;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (!this.featureService.getBooleanKey(AppLikeWebViewFlag.INSTANCE)) {
            if (!h.e0(deeplink, "ozon://", false)) {
                A.f33515l.getClass();
                A e11 = A.b.e(deeplink);
            }
            j b12 = k.b(this.routeFactory, deeplink, properties, 4);
            if (b12 != null && (b11 = this.deeplinkHandlersCache.b(b12)) != null && b11.canHandle(b12)) {
                return g.a.a(this.ozonRouter, deeplink, properties, null, 4);
            }
        }
        return false;
    }

    @Override // ru.ozon.app.android.web.webview.WebViewRouter
    public void popBackStack() {
        l.a(this.ozonRouter);
    }
}
