package org.chromium.net.impl;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* loaded from: classes10.dex */
class AndroidUrlRequestStatusListenerWrapper implements UrlRequest$StatusListener {
    private final UrlRequest.StatusListener mBackend;

    public AndroidUrlRequestStatusListenerWrapper(UrlRequest.StatusListener backend) {
        this.mBackend = backend;
    }

    public void onStatus(int i) {
        this.mBackend.onStatus(i);
    }
}
