package org.chromium.net.urlconnection;

import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes10.dex */
class CronetHttpURLStreamHandler extends URLStreamHandler {
    private final ExperimentalCronetEngine mCronetEngine;

    public CronetHttpURLStreamHandler(ExperimentalCronetEngine cronetEngine) {
        this.mCronetEngine = cronetEngine;
    }

    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url) throws IOException {
        return this.mCronetEngine.openConnection(url);
    }

    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return this.mCronetEngine.openConnection(url, proxy);
    }
}
