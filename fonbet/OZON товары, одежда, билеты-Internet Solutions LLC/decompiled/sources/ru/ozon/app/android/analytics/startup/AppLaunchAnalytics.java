package ru.ozon.app.android.analytics.startup;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "", "associateReferrer", "", "deeplinkPath", "", "referrer", "referrerForUrl", "path", "trackCampaign", "deeplink", "Landroid/net/Uri;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppLaunchAnalytics {
    void associateReferrer(@NotNull String deeplinkPath, @NotNull String referrer);

    String referrerForUrl(@NotNull String path);

    void trackCampaign(@NotNull Uri deeplink, Uri referrer);
}
