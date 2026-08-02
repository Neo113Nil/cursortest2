package ru.ozon.app.android.initializers.appsflyer;

import GZ.g;
import Py.a;
import Py.b;
import Sc.r;
import Sc.s;
import android.annotation.SuppressLint;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerDeeplinkResult;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/initializers/appsflyer/AppsFlyerActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "appLaunchAnalytics", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;", "appsFlyerConversionStorage", "LGZ/g;", "router", "<init>", "(Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;LGZ/g;)V", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;", "result", "", "navigate", "(Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;)V", "Landroid/net/Uri;", "appendFromQuery", "(Landroid/net/Uri;)Landroid/net/Uri;", "init", "()V", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;", "LGZ/g;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsFlyerActionInitializer implements ActionInitializer {

    @NotNull
    private final AppLaunchAnalytics appLaunchAnalytics;

    @NotNull
    private final AppsFlyerConversionStorage appsFlyerConversionStorage;

    @NotNull
    private final g router;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/initializers/appsflyer/AppsFlyerActionInitializer$Companion;", "", "<init>", "()V", "FROM", "", "FROM_APP_ICON", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AppsFlyerActionInitializer(@NotNull AppLaunchAnalytics appLaunchAnalytics, @NotNull AppsFlyerConversionStorage appsFlyerConversionStorage, @NotNull g router) {
        Intrinsics.checkNotNullParameter(appLaunchAnalytics, "appLaunchAnalytics");
        Intrinsics.checkNotNullParameter(appsFlyerConversionStorage, "appsFlyerConversionStorage");
        Intrinsics.checkNotNullParameter(router, "router");
        this.appLaunchAnalytics = appLaunchAnalytics;
        this.appsFlyerConversionStorage = appsFlyerConversionStorage;
        this.router = router;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.r$b] */
    private final Uri appendFromQuery(Uri uri) {
        Uri uri2;
        try {
            r.Companion companion = r.INSTANCE;
            uri2 = uri.buildUpon().appendQueryParameter("from", "from_app_icon").build();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            uri2 = s.a(th2);
        }
        if (!(uri2 instanceof r.b)) {
            uri = uri2;
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigate(AppsFlyerDeeplinkResult result) {
        String uri;
        Uri link = result.getLink();
        if (link == null || Intrinsics.d(link.getAuthority(), "open") || Intrinsics.d(link.getAuthority(), "payment")) {
            link = null;
        }
        this.appLaunchAnalytics.trackCampaign(appendFromQuery(link == null ? LinkGenerator.INSTANCE.home() : link), null);
        if (link == null || (uri = link.toString()) == null) {
            return;
        }
        g.a.a(this.router, uri, null, null, 6);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    @SuppressLint({"CheckResult"})
    public void init() {
        this.appsFlyerConversionStorage.start();
        this.appsFlyerConversionStorage.observeDeferredResult().subscribe(new a(new AppsFlyerActionInitializer$init$1(this), 0), new b(AppsFlyerActionInitializer$init$2.INSTANCE, 0));
    }
}
