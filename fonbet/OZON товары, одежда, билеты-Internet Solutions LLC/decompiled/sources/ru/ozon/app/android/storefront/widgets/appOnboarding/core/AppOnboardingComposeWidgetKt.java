package ru.ozon.app.android.storefront.widgets.appOnboarding.core;

import G.g;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.navigation.utils.DeeplinkExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "appOnboardingWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "Landroid/net/Uri;", "referrer", ImagesContract.URL, "", "associateReferrer", "(Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;Landroid/net/Uri;Landroid/net/Uri;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppOnboardingComposeWidgetKt {
    @NotNull
    public static final i appOnboardingWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("cms", "appOnboarding", null, new AppOnboardingComposeWidgetKt$appOnboardingWidget$1(jsonDeserializer), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void associateReferrer(AppLaunchAnalytics appLaunchAnalytics, Uri uri, Uri uri2) {
        String c11 = DeeplinkExtKt.isDeeplink(uri2) ? g.c(uri2.getAuthority(), "/", uri2.getPath()) : uri2.getPath();
        if (c11 == null || h.K(c11)) {
            return;
        }
        String uri3 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        appLaunchAnalytics.associateReferrer(c11, uri3);
    }
}
