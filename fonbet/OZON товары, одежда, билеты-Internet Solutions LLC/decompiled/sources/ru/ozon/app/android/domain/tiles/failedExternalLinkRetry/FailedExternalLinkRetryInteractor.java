package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;", "", "getFailedExternalLink", "", "setExternalLink", "", "deeplink", "Landroid/net/Uri;", "originLink", "modifyRedirectLink", "requestLink", "redirectLink", "setSuccessLink", "link", "markFailedLink", "clearData", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FailedExternalLinkRetryInteractor {
    void clearData();

    String getFailedExternalLink();

    void markFailedLink();

    void modifyRedirectLink(@NotNull String requestLink, @NotNull String redirectLink);

    void setExternalLink(@NotNull Uri deeplink, @NotNull Uri originLink);

    void setSuccessLink(@NotNull String link);
}
