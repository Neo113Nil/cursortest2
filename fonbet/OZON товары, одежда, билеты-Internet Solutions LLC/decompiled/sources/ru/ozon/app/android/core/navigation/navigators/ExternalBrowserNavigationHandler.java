package ru.ozon.app.android.core.navigation.navigators;

import android.net.Uri;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.core.navigation.destinations.ExternalBrowserDestination;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/core/navigation/navigators/ExternalBrowserNavigationHandler;", "Lru/ozon/app/android/core/navigation/navigators/BaseExternalNavigationHandler;", "Lru/ozon/app/android/core/navigation/destinations/ExternalBrowserDestination;", "<init>", "()V", "Landroid/net/Uri;", "", "isOzonUrl", "(Landroid/net/Uri;)Z", "Landroidx/fragment/app/r;", "activity", "destination", "", "navigateInternal", "(Landroidx/fragment/app/r;Lru/ozon/app/android/core/navigation/destinations/ExternalBrowserDestination;)V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExternalBrowserNavigationHandler extends BaseExternalNavigationHandler<ExternalBrowserDestination> {
    private final boolean isOzonUrl(Uri uri) {
        String host = uri.getHost();
        return host != null && (h.A(host, "ozon.ru", false) || h.e0(host, "select.", false));
    }

    @Override // ru.ozon.app.android.core.navigation.navigators.BaseExternalNavigationHandler
    public void navigateInternal(@NotNull r activity, @NotNull ExternalBrowserDestination destination) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!canOpenInNonBrowserApp(activity, destination) || isOzonUrl(destination.getUri())) {
            openInCustomTabs(activity, destination);
        } else {
            openInAppOrBrowser(activity, destination);
        }
    }
}
