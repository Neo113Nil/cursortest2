package org.chromium.net.urlconnection;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Objects;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes10.dex */
public class CronetURLStreamHandlerFactory implements URLStreamHandlerFactory {
    private final ExperimentalCronetEngine mCronetEngine;

    public CronetURLStreamHandlerFactory(ExperimentalCronetEngine cronetEngine) {
        this.mCronetEngine = (ExperimentalCronetEngine) Objects.requireNonNull(cronetEngine, "CronetEngine is null.");
    }

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String protocol) {
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new CronetHttpURLStreamHandler(this.mCronetEngine);
        }
        return null;
    }
}
