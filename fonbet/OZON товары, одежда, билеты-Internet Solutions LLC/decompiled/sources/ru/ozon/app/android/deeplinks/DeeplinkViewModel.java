package ru.ozon.app.android.deeplinks;

import android.net.Uri;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ActivityInitializer;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerResolver;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import xe.C10727i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/deeplinks/DeeplinkViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ActivityInitializer;", "activityInitializer", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "onboardingInteractor", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerResolver;", "appsFlyerResolver", "<init>", "(Lru/ozon/app/android/ActivityInitializer;Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;Lru/ozon/app/android/analytics/plugins/af/AppsFlyerResolver;)V", "Landroid/net/Uri;", "uri", "referrer", "", "handleOneLink", "(Landroid/net/Uri;Landroid/net/Uri;)V", "Lru/ozon/app/android/deeplinks/ExternalDeeplink;", "processLink", "(Landroid/net/Uri;Landroid/net/Uri;)Lru/ozon/app/android/deeplinks/ExternalDeeplink;", "", "initLocation", "init", "(Z)V", "referrerUri", "getLinkForNavigate", "Lru/ozon/app/android/ActivityInitializer;", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerResolver;", "Landroidx/lifecycle/V;", "_oneLinkEvent", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "oneLinkEvent", "Landroidx/lifecycle/P;", "getOneLinkEvent", "()Landroidx/lifecycle/P;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeeplinkViewModel extends w0 {

    @NotNull
    private final V<ExternalDeeplink> _oneLinkEvent;

    @NotNull
    private final ActivityInitializer activityInitializer;

    @NotNull
    private final AppsFlyerResolver appsFlyerResolver;

    @NotNull
    private final OnboardingInteractor onboardingInteractor;

    @NotNull
    private final P<ExternalDeeplink> oneLinkEvent;

    public DeeplinkViewModel(@NotNull ActivityInitializer activityInitializer, @NotNull OnboardingInteractor onboardingInteractor, @NotNull AppsFlyerResolver appsFlyerResolver) {
        Intrinsics.checkNotNullParameter(activityInitializer, "activityInitializer");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(appsFlyerResolver, "appsFlyerResolver");
        this.activityInitializer = activityInitializer;
        this.onboardingInteractor = onboardingInteractor;
        this.appsFlyerResolver = appsFlyerResolver;
        V<ExternalDeeplink> v11 = new V<>();
        this._oneLinkEvent = v11;
        this.oneLinkEvent = v11;
    }

    private final void handleOneLink(Uri uri, Uri referrer) {
        C10727i.c(x0.a(this), null, null, new DeeplinkViewModel$handleOneLink$1(this, uri, referrer, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExternalDeeplink processLink(Uri uri, Uri referrer) {
        return new ExternalDeeplink(uri, referrer);
    }

    public final ExternalDeeplink getLinkForNavigate(Uri uri, Uri referrerUri) {
        this.onboardingInteractor.setUriData(uri, referrerUri);
        if (uri == null || !this.appsFlyerResolver.isLinkSupported(uri)) {
            return processLink(uri, referrerUri);
        }
        handleOneLink(uri, referrerUri);
        return null;
    }

    @NotNull
    public final P<ExternalDeeplink> getOneLinkEvent() {
        return this.oneLinkEvent;
    }

    public final void init(boolean initLocation) {
        this.activityInitializer.startActivityInitializationSequence(initLocation);
    }
}
