package ru.ozon.app.android.network.utils;

import android.net.Uri;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/net/Uri;", "lastRedirectUrl", "", "isNetworkRedirect", "(Landroid/net/Uri;Landroid/net/Uri;)Z", "network_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TestCookieExtensionsKt {
    public static final boolean isNetworkRedirect(Uri uri, Uri uri2) {
        if (uri != null && !uri.isOpaque() && (uri2 == null || !uri2.isOpaque())) {
            String queryParameter = uri.getQueryParameter("__rr");
            String queryParameter2 = uri2 != null ? uri2.getQueryParameter("__rr") : null;
            if (queryParameter != null && (queryParameter2 == null || queryParameter.compareTo(queryParameter2) > 0)) {
                return true;
            }
        }
        return false;
    }
}
