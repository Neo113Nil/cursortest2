package ru.ozon.app.android.fresh.navigation.deeplinks;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.utils.UriExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandlerImpl;", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "<init>", "()V", "markDeeplinkAsFreshExternal", "", "deeplink", "removeFreshExternalMarkFromDeeplink", "Landroid/net/Uri;", "hasDeeplinkFreshExternalMark", "", "shouldOpenInBottomSheet", "isFreshContext", "hasExternalMark", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshPdpInBottomSheetHandlerImpl implements FreshPdpInBottomSheetHandler {
    @Override // ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler
    public boolean hasDeeplinkFreshExternalMark(@NotNull Uri deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.d(deeplink.getQueryParameter("is_fresh_external"), "true");
    }

    @Override // ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler
    @NotNull
    public String markDeeplinkAsFreshExternal(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String uri = Uri.parse(deeplink).buildUpon().appendQueryParameter("is_fresh_external", "true").build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @Override // ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler
    @NotNull
    public Uri removeFreshExternalMarkFromDeeplink(@NotNull Uri deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return UriExtKt.removeQueryParameter(deeplink, "is_fresh_external");
    }

    @Override // ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler
    public boolean shouldOpenInBottomSheet(boolean isFreshContext, boolean hasExternalMark) {
        return isFreshContext && !hasExternalMark;
    }
}
