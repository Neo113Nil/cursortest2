package io.ably.lib.http;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.ably.lib.http.HttpCore;
import io.ably.lib.network.HttpCall;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.util.Log;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* loaded from: classes9.dex */
public class HttpScheduler implements AutoCloseable {
    protected static final String TAG = "io.ably.lib.http.HttpScheduler";
    protected final CloseableExecutor executor;
    private final HttpCore httpCore;

    public <T> Future<T> get(String str, Param[] paramArr, Param[] paramArr2, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, "GET", paramArr, paramArr2, null, responseHandler, z, callback);
    }

    public <T> Future<T> put(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, "PUT", paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    public <T> Future<T> post(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, "POST", paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    public <T> Future<T> patch(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, "PATCH", paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    public <T> Future<T> del(String str, Param[] paramArr, Param[] paramArr2, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, "DELETE", paramArr, paramArr2, null, responseHandler, z, callback);
    }

    public <T> Future<T> exec(String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, str2, paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    private class UrlRequest<T> extends AsyncRequest<T> {
        private final URL url;

        private UrlRequest(URL url, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, Callback<T> callback) {
            super(str, paramArr, paramArr2, requestBody, responseHandler, callback);
            this.url = url;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                setResult(httpExecuteWithRetry(this.url));
            } catch (AblyException e) {
                setError(e.errorInfo);
            } finally {
                disposeConnection();
            }
        }
    }

    private class AblyRequestWithRetry<T> extends AsyncRequest<T> {
        private final String host;
        private final String path;
        private final Boolean requireAblyAuth;

        private AblyRequestWithRetry(String str, String str2, String str3, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
            super(str3, paramArr, paramArr2, requestBody, responseHandler, callback);
            this.host = str;
            this.path = str2;
            this.requireAblyAuth = Boolean.valueOf(z);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.result = httpExecuteWithRetry(this.host, this.path, this.requireAblyAuth.booleanValue());
                setResult(this.result);
            } catch (AblyException e) {
                setError(e.errorInfo);
            } finally {
                disposeConnection();
            }
        }
    }

    private class AblyRequestWithFallback<T> extends AsyncRequest<T> {
        private final String path;
        private final boolean requireAblyAuth;

        private AblyRequestWithFallback(String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
            super(str2, paramArr, paramArr2, requestBody, responseHandler, callback);
            this.path = str;
            this.requireAblyAuth = z;
        }

        private String extendMessage(String str) {
            return Param.getFirst(this.params, SDKAnalyticsEvents.PARAMETER_REQUEST_ID) == null ? str : String.format(Locale.ROOT, "%s request_id=%s", str, Param.getFirst(this.params, SDKAnalyticsEvents.PARAMETER_REQUEST_ID));
        }

        @Override // java.lang.Runnable
        public void run() {
            String preferredHost = HttpScheduler.this.httpCore.hosts.getPreferredHost();
            int i = HttpScheduler.this.httpCore.hosts.fallbackHostsRemaining(preferredHost) > 0 ? HttpScheduler.this.httpCore.options.httpMaxRetryCount : 0;
            while (!this.isCancelled) {
                try {
                    try {
                        this.result = httpExecuteWithRetry(preferredHost, this.path, this.requireAblyAuth);
                        setResult(this.result);
                        HttpScheduler.this.httpCore.hosts.setPreferredHost(preferredHost, true);
                    } catch (AblyException e) {
                        e.errorInfo.message = extendMessage(e.errorInfo.message);
                        setError(e.errorInfo);
                    }
                } catch (AblyException.HostFailedException e2) {
                    i--;
                    if (i < 0) {
                        e2.errorInfo.message = extendMessage(e2.errorInfo.message);
                        setError(e2.errorInfo);
                    } else {
                        try {
                            Log.d(HttpScheduler.TAG, extendMessage("Connection failed to host `" + preferredHost + "`. Searching for new host..."));
                            preferredHost = HttpScheduler.this.httpCore.hosts.getFallback(preferredHost);
                            if (preferredHost == null) {
                                e2.errorInfo.message = extendMessage(e2.errorInfo.message);
                                setError(e2.errorInfo);
                            } else {
                                Log.d(HttpScheduler.TAG, extendMessage("Switched to `" + preferredHost + "`."));
                                disposeConnection();
                            }
                        } catch (Throwable th) {
                            disposeConnection();
                            throw th;
                        }
                    }
                }
                disposeConnection();
                return;
            }
        }
    }

    private abstract class AsyncRequest<T> implements Future<T>, Runnable {
        protected final Callback<T> callback;
        protected ErrorInfo err;
        protected final Param[] headers;
        protected HttpCall httpCall;
        protected boolean isCancelled;
        protected boolean isDone;
        protected final String method;
        protected final Param[] params;
        protected final HttpCore.RequestBody requestBody;
        protected final HttpCore.ResponseHandler<T> responseHandler;
        protected T result;

        private AsyncRequest(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, Callback<T> callback) {
            this.isCancelled = false;
            this.isDone = false;
            this.method = str;
            this.headers = paramArr;
            this.params = paramArr2;
            this.requestBody = requestBody;
            this.responseHandler = responseHandler;
            this.callback = callback;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            this.isCancelled = true;
            return disposeConnection();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.isCancelled;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.isDone;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            synchronized (this) {
                while (!this.isDone) {
                    wait();
                }
                if (this.err != null) {
                    throw new ExecutionException(AblyException.fromErrorInfo(this.err));
                }
            }
            return this.result;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            long millis = timeUnit.toMillis(j);
            long currentTimeMillis = System.currentTimeMillis() + millis;
            synchronized (this) {
                while (millis > 0) {
                    wait(millis);
                    if (this.isDone) {
                        break;
                    }
                    millis = currentTimeMillis - System.currentTimeMillis();
                }
                if (!this.isDone) {
                    throw new TimeoutException();
                }
                if (this.err != null) {
                    throw new ExecutionException(AblyException.fromErrorInfo(this.err));
                }
            }
            return this.result;
        }

        protected T httpExecuteWithRetry(URL url) throws AblyException {
            return (T) HttpScheduler.this.httpCore.httpExecuteWithRetry(url, this.method, this.headers, this.requestBody, this.responseHandler, false);
        }

        protected T httpExecuteWithRetry(String str, String str2, boolean z) throws AblyException {
            return (T) HttpScheduler.this.httpCore.httpExecuteWithRetry(HttpUtils.buildURL(HttpScheduler.this.httpCore.scheme, str, HttpScheduler.this.httpCore.port, str2, this.params), this.method, this.headers, this.requestBody, this.responseHandler, z);
        }

        protected void setResult(T t) {
            synchronized (this) {
                this.result = t;
                this.isDone = true;
                notifyAll();
            }
            Callback<T> callback = this.callback;
            if (callback != null) {
                callback.onSuccess(t);
            }
        }

        protected void setError(ErrorInfo errorInfo) {
            synchronized (this) {
                this.err = errorInfo;
                this.isDone = true;
                notifyAll();
            }
            Callback<T> callback = this.callback;
            if (callback != null) {
                callback.onError(errorInfo);
            }
        }

        protected synchronized boolean disposeConnection() {
            boolean z;
            HttpCall httpCall = this.httpCall;
            z = httpCall != null;
            if (z) {
                httpCall.cancel();
                this.httpCall = null;
            }
            return z;
        }
    }

    protected HttpScheduler(HttpCore httpCore, CloseableExecutor closeableExecutor) {
        this.httpCore = httpCore;
        this.executor = closeableExecutor;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        UByte$$ExternalSyntheticBackport0.m13543m((Object) this.executor);
    }

    public <T> Future<T> httpExecute(URL url, String str, Param[] paramArr, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, Callback<T> callback) {
        UrlRequest urlRequest = new UrlRequest(url, str, paramArr, null, requestBody, responseHandler, callback);
        this.executor.execute(urlRequest);
        return urlRequest;
    }

    public <T> Future<T> ablyHttpExecuteWithFallback(String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        AblyRequestWithFallback ablyRequestWithFallback = new AblyRequestWithFallback(str, str2, paramArr, paramArr2, requestBody, responseHandler, z, callback);
        this.executor.execute(ablyRequestWithFallback);
        return ablyRequestWithFallback;
    }

    public <T> Future<T> ablyHttpExecuteWithRetry(String str, String str2, String str3, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        AblyRequestWithRetry ablyRequestWithRetry = new AblyRequestWithRetry(str, str2, str3, paramArr, paramArr2, requestBody, responseHandler, z, callback);
        this.executor.execute(ablyRequestWithRetry);
        return ablyRequestWithRetry;
    }

    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }
}
