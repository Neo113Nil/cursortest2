package ru.ozon.app.android.storefront.deeplinkhandlers;

import GZ.j;
import J.d;
import KZ.c;
import Sc.InterfaceC4008j;
import Sc.k;
import We.A;
import android.app.Application;
import android.net.Uri;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.flags.AppLikeWebViewFlag;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00060\u000bj\u0002`\f2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/OzonWebViewDeeplinkInterceptor;", "LKZ/c;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Landroid/net/Uri$Builder;", "Landroid/net/Uri;", "sourceUri", "copyQueryParams", "(Landroid/net/Uri$Builder;Landroid/net/Uri;)Landroid/net/Uri$Builder;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canIntercept", "(LGZ/j;)Z", "intercept", "(LGZ/j;)LGZ/j;", "Landroid/app/Application;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi$delegate", "LSc/j;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService$delegate", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig$delegate", "getNetworkComponentConfig", "()Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonWebViewDeeplinkInterceptor implements c {

    @NotNull
    private final Application application;

    /* renamed from: featureService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureService;

    /* renamed from: networkComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j networkComponentApi;

    /* renamed from: networkComponentConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j networkComponentConfig;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/OzonWebViewDeeplinkInterceptor$Companion;", "", "<init>", "()V", "URL_SCHEME", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OzonWebViewDeeplinkInterceptor(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.networkComponentApi = k.b(new OzonWebViewDeeplinkInterceptor$networkComponentApi$2(this));
        this.featureService = k.b(new OzonWebViewDeeplinkInterceptor$featureService$2(this));
        this.networkComponentConfig = k.b(new OzonWebViewDeeplinkInterceptor$networkComponentConfig$2(this));
    }

    private final Uri.Builder copyQueryParams(Uri.Builder builder, Uri uri) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                builder.appendQueryParameter(str, queryParameter);
            }
        }
        return builder;
    }

    private final FeatureService getFeatureService() {
        return (FeatureService) this.featureService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkComponentApi getNetworkComponentApi() {
        return (NetworkComponentApi) this.networkComponentApi.getValue();
    }

    private final NetworkComponentConfig getNetworkComponentConfig() {
        return (NetworkComponentConfig) this.networkComponentConfig.getValue();
    }

    @Override // KZ.c
    public boolean canIntercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return getFeatureService().getBooleanKey(AppLikeWebViewFlag.INSTANCE) && Intrinsics.d(route.b().getScheme(), "ozon");
    }

    @Override // KZ.a
    @NotNull
    public j intercept(@NotNull j route) {
        if (d.d(route, "route", "web")) {
            return route;
        }
        A.b bVar = A.f33515l;
        String apiUrl = getNetworkComponentConfig().getApiUrl();
        bVar.getClass();
        Uri build = new Uri.Builder().scheme("https").authority(A.b.c(apiUrl).v()).path(route.b().getAuthority() + route.b().getEncodedPath()).build();
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Uri.Builder appendQueryParameter = LinkGenerator.webView$default(linkGenerator, uri, null, false, true, 6, null).buildUpon().appendQueryParameter("isFullScreen", "true");
        Intrinsics.checkNotNullExpressionValue(appendQueryParameter, "appendQueryParameter(...)");
        Uri build2 = copyQueryParams(appendQueryParameter, route.b()).build();
        Intrinsics.f(build2);
        return j.a(route, build2);
    }
}
