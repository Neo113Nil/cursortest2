package org.chromium.net.impl;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.Proxy;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes10.dex */
final class VersionSafeProxyCallback {
    private static final int PROXY_CALLBACK_API_LEVEL = 38;
    private final Proxy.Callback mBackend;
    private final Executor mExecutor;

    private boolean apiContainsProxyCallbackClass() {
        return VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel() >= 38;
    }

    VersionSafeProxyCallback(Executor executor, Proxy.Callback backend) {
        if (!apiContainsProxyCallbackClass()) {
            throw new AssertionError(String.format("This should not have been created: the Cronet API being used has an ApiLevel of %s, but ProxyCallback was added in ApiLevel %s", Integer.valueOf(VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel()), 38));
        }
        this.mExecutor = (Executor) Objects.requireNonNull(executor);
        this.mBackend = (Proxy.Callback) Objects.requireNonNull(backend);
    }

    Executor getExecutor() {
        return this.mExecutor;
    }

    void onBeforeTunnelRequest(Proxy.Callback.Request request) {
        this.mBackend.onBeforeTunnelRequest(request);
    }

    boolean onTunnelHeadersReceived(List<Map.Entry<String, String>> responseHeaders, int statusCode) {
        return this.mBackend.onTunnelHeadersReceived(responseHeaders, statusCode);
    }
}
