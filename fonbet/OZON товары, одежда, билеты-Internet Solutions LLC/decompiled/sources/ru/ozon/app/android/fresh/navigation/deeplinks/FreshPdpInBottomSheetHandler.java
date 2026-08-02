package ru.ozon.app.android.fresh.navigation.deeplinks;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "", "markDeeplinkAsFreshExternal", "", "deeplink", "removeFreshExternalMarkFromDeeplink", "Landroid/net/Uri;", "hasDeeplinkFreshExternalMark", "", "shouldOpenInBottomSheet", "isFreshContext", "hasExternalMark", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FreshPdpInBottomSheetHandler {
    boolean hasDeeplinkFreshExternalMark(@NotNull Uri deeplink);

    @NotNull
    String markDeeplinkAsFreshExternal(@NotNull String deeplink);

    @NotNull
    Uri removeFreshExternalMarkFromDeeplink(@NotNull Uri deeplink);

    boolean shouldOpenInBottomSheet(boolean isFreshContext, boolean hasExternalMark);
}
