package org.chromium.net;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class Proxy {
    public static final int HTTP = 0;
    public static final int HTTPS = 1;
    private final Callback mCallback;
    private final Executor mExecutor;
    private final String mHost;
    private final int mPort;
    private final int mScheme;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Scheme {
    }

    public static abstract class Callback {

        public static abstract class Request implements AutoCloseable {
            @Override // java.lang.AutoCloseable
            public abstract void close();

            public abstract void proceed(List<Map.Entry<String, String>> extraHeaders);
        }

        public abstract boolean onTunnelHeadersReceived(List<Map.Entry<String, String>> responseHeaders, int statusCode);

        public void onBeforeTunnelRequest(Request request) {
            try {
                List<Map.Entry<String, String>> onBeforeTunnelRequest = onBeforeTunnelRequest();
                if (onBeforeTunnelRequest != null) {
                    request.proceed(onBeforeTunnelRequest);
                }
                if (request != null) {
                    request.close();
                }
            } catch (Throwable th) {
                if (request != null) {
                    try {
                        request.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Deprecated
        public List<Map.Entry<String, String>> onBeforeTunnelRequest() {
            throw new UnsupportedOperationException("At least one overload of onBeforeTunnelRequest must be overridden");
        }
    }

    public Proxy(int scheme, String host, int port, Executor executor, Callback callback) {
        if (scheme != 0 && scheme != 1) {
            throw new IllegalArgumentException(String.format("Unknown scheme %s", Integer.valueOf(scheme)));
        }
        this.mScheme = scheme;
        this.mHost = (String) Objects.requireNonNull(host);
        this.mPort = port;
        this.mExecutor = (Executor) Objects.requireNonNull(executor);
        this.mCallback = (Callback) Objects.requireNonNull(callback);
    }

    @Deprecated
    public Proxy(int scheme, String host, int port, Callback callback) {
        this(scheme, host, port, new Executor() { // from class: org.chromium.net.Proxy$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, callback);
    }

    public int getScheme() {
        return this.mScheme;
    }

    public String getHost() {
        return this.mHost;
    }

    public int getPort() {
        return this.mPort;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public Callback getCallback() {
        return this.mCallback;
    }
}
