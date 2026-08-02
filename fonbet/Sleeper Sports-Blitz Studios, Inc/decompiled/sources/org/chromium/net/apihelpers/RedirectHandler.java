package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;

/* loaded from: classes10.dex */
public interface RedirectHandler {
    boolean shouldFollowRedirect(UrlResponseInfo info, String newLocationUrl) throws Exception;
}
