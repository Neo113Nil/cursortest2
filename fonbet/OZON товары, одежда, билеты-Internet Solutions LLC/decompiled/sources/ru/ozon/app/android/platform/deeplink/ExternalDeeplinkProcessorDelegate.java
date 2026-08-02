package ru.ozon.app.android.platform.deeplink;

import GZ.c;
import GZ.g;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.utils.DeeplinkExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\f\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "appLaunchAnalytics", "LGZ/g;", "router", "<init>", "(Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;LGZ/g;)V", "Landroid/net/Uri;", "uri", "referrerUri", "", "navigate", "(Landroid/net/Uri;Landroid/net/Uri;)V", "referrer", "processAndTrackExternalLink", "(Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;", "navigateByExternalLink", ImagesContract.URL, "associateReferrer", "Landroid/content/Intent;", "intent", "clearDeeplinkArgsInIntent", "(Landroid/content/Intent;)V", "", "hasExternalDeeplink", "(Landroid/content/Intent;)Z", "getReferrer", "(Landroid/content/Intent;)Landroid/net/Uri;", "getDeeplink", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "LGZ/g;", "Companion", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExternalDeeplinkProcessorDelegate {

    @NotNull
    private final AppLaunchAnalytics appLaunchAnalytics;

    @NotNull
    private final g router;

    public ExternalDeeplinkProcessorDelegate(@NotNull AppLaunchAnalytics appLaunchAnalytics, @NotNull g router) {
        Intrinsics.checkNotNullParameter(appLaunchAnalytics, "appLaunchAnalytics");
        Intrinsics.checkNotNullParameter(router, "router");
        this.appLaunchAnalytics = appLaunchAnalytics;
        this.router = router;
    }

    private final void associateReferrer(Uri referrer, Uri url) {
        String c11 = DeeplinkExtKt.isDeeplink(url) ? G.g.c(url.getAuthority(), "/", url.getPath()) : url.getPath();
        if (c11 == null || h.K(c11)) {
            return;
        }
        AppLaunchAnalytics appLaunchAnalytics = this.appLaunchAnalytics;
        String uri = referrer.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        appLaunchAnalytics.associateReferrer(c11, uri);
    }

    private final void clearDeeplinkArgsInIntent(Intent intent) {
        intent.removeExtra("dkaDeeplink");
        intent.removeExtra("dkaReferrer");
    }

    private final void navigateByExternalLink(Uri uri, Uri referrer) {
        if (referrer != null) {
            associateReferrer(referrer, uri);
        }
        g gVar = this.router;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        gVar.a(uri2, U.c(), c.EXTERNAL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r3 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Uri processAndTrackExternalLink(Uri uri, Uri referrer) {
        if (uri != null) {
            if (Intrinsics.d(uri.getAuthority(), "open") || Intrinsics.d(uri.getAuthority(), "payment")) {
                uri = null;
            }
        }
        uri = LinkGenerator.INSTANCE.home();
        this.appLaunchAnalytics.trackCampaign(uri, referrer);
        return uri;
    }

    public final Uri getDeeplink(Intent intent) {
        if (intent != null) {
            return (Uri) intent.getParcelableExtra("dkaDeeplink");
        }
        return null;
    }

    public final Uri getReferrer(Intent intent) {
        if (intent != null) {
            return (Uri) intent.getParcelableExtra("dkaReferrer");
        }
        return null;
    }

    public final boolean hasExternalDeeplink(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("dkaDeeplink");
        }
        return false;
    }

    public final void navigate(Intent intent) {
        if (intent != null) {
            if ((intent.hasExtra("dkaDeeplink") ? intent : null) == null) {
                return;
            }
            navigate((Uri) intent.getParcelableExtra("dkaDeeplink"), (Uri) intent.getParcelableExtra("dkaReferrer"));
            clearDeeplinkArgsInIntent(intent);
        }
    }

    private final void navigate(Uri uri, Uri referrerUri) {
        navigateByExternalLink(processAndTrackExternalLink(uri, referrerUri), referrerUri);
    }
}
