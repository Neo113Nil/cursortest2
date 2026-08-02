package io.ably.lib.http;

import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.BasePaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.sentry.protocol.SentryThread;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public class BasePaginatedQuery<T> implements HttpCore.ResponseHandler<BasePaginatedResult<T>> {
    protected static Pattern linkPattern = Pattern.compile("\\s*<(.*)>;\\s*rel=\"(.*)\"");
    protected static Pattern urlPattern = Pattern.compile("\\./(.*)\\?(.*)");
    private final HttpCore.BodyHandler<T> bodyHandler;
    private final Http http;
    private final String path;
    private final HttpCore.RequestBody requestBody;
    private final Param[] requestHeaders;
    private final Param[] requestParams;

    public BasePaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.BodyHandler<T> bodyHandler) {
        this(http, str, paramArr, paramArr2, null, bodyHandler);
    }

    public BasePaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.BodyHandler<T> bodyHandler) {
        this.http = http;
        this.path = str;
        this.requestHeaders = paramArr;
        this.requestParams = paramArr2;
        this.requestBody = requestBody;
        this.bodyHandler = bodyHandler;
    }

    public ResultRequest<T> get() {
        return new ResultRequest<>(exec("GET"));
    }

    public Http.Request<BasePaginatedResult<T>> exec(final String str) {
        return this.http.request(new Http.Execute<BasePaginatedResult<T>>() { // from class: io.ably.lib.http.BasePaginatedQuery.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<BasePaginatedResult<T>> callback) throws AblyException {
                httpScheduler.exec(BasePaginatedQuery.this.path, str, BasePaginatedQuery.this.requestHeaders, BasePaginatedQuery.this.requestParams, BasePaginatedQuery.this.requestBody, this, true, callback);
            }
        });
    }

    private class ResultPage implements BasePaginatedResult<T> {
        private T[] contents;
        private String relCurrent;
        private String relFirst;
        private String relNext;

        private ResultPage(T[] tArr, Collection<String> collection) throws AblyException {
            this.contents = tArr;
            if (collection != null) {
                HashMap<String, String> parseLinks = BasePaginatedQuery.parseLinks(collection);
                this.relFirst = parseLinks.get("first");
                this.relCurrent = parseLinks.get(SentryThread.JsonKeys.CURRENT);
                this.relNext = parseLinks.get("next");
            }
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public T[] items() {
            return this.contents;
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public Http.Request<BasePaginatedResult<T>> first() {
            return getRel(this.relFirst);
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public Http.Request<BasePaginatedResult<T>> current() {
            return getRel(this.relCurrent);
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public Http.Request<BasePaginatedResult<T>> next() {
            return getRel(this.relNext);
        }

        private Http.Request<BasePaginatedResult<T>> getRel(final String str) {
            return BasePaginatedQuery.this.http.request(new Http.Execute<BasePaginatedResult<T>>() { // from class: io.ably.lib.http.BasePaginatedQuery.ResultPage.1
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<BasePaginatedResult<T>> callback) throws AblyException {
                    if (str == null) {
                        callback.onSuccess(null);
                        return;
                    }
                    Matcher matcher = BasePaginatedQuery.urlPattern.matcher(str);
                    if (!matcher.matches()) {
                        throw AblyException.fromErrorInfo(new ErrorInfo("Unexpected link URL format", 500, 50000));
                    }
                    String[] split = matcher.group(2).split("&");
                    Param[] paramArr = new Param[split.length];
                    for (int i = 0; i < split.length; i++) {
                        try {
                            String[] split2 = split[i].split("=");
                            paramArr[i] = new Param(split2[0], URLDecoder.decode(split2[1], "UTF-8"));
                        } catch (UnsupportedEncodingException unused) {
                        }
                    }
                    httpScheduler.get(BasePaginatedQuery.this.path, BasePaginatedQuery.this.requestHeaders, paramArr, BasePaginatedQuery.this, true, callback);
                }
            });
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public boolean hasFirst() {
            return this.relFirst != null;
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public boolean hasCurrent() {
            return this.relCurrent != null;
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public boolean hasNext() {
            return this.relNext != null;
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public boolean isLast() {
            return this.relNext == null;
        }
    }

    @Override // io.ably.lib.http.HttpCore.ResponseHandler
    public BasePaginatedResult<T> handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
        if (errorInfo != null) {
            throw AblyException.fromErrorInfo(errorInfo);
        }
        return new ResultPage(this.bodyHandler.handleResponseBody(response.contentType, response.body), response.getHeaderFields("Link"));
    }

    protected static HashMap<String, String> parseLinks(Collection<String> collection) {
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            Matcher matcher = linkPattern.matcher(it.next());
            if (matcher.matches()) {
                String group = matcher.group(1);
                for (String str : matcher.group(2).toLowerCase(Locale.ENGLISH).split("\\s")) {
                    hashMap.put(str, group);
                }
            }
        }
        return hashMap;
    }

    public static class ResultRequest<T> {
        private final Http.Request<BasePaginatedResult<T>> wrappedRequest;

        private ResultRequest(Http.Request<BasePaginatedResult<T>> request) {
            this.wrappedRequest = request;
        }

        public PaginatedResult<T> sync() throws AblyException {
            return new SyncResultPage(this.wrappedRequest.sync());
        }

        public void async(final Callback<AsyncPaginatedResult<T>> callback) {
            this.wrappedRequest.async(new Callback<BasePaginatedResult<T>>() { // from class: io.ably.lib.http.BasePaginatedQuery.ResultRequest.1
                @Override // io.ably.lib.types.Callback
                public void onSuccess(BasePaginatedResult<T> basePaginatedResult) {
                    callback.onSuccess(new AsyncResultPage(basePaginatedResult));
                }

                @Override // io.ably.lib.types.Callback
                public void onError(ErrorInfo errorInfo) {
                    callback.onError(errorInfo);
                }
            });
        }

        public static class Failed<T> extends ResultRequest<T> {
            private final AblyException reason;

            /* JADX WARN: Multi-variable type inference failed */
            public Failed(AblyException ablyException) {
                super(null);
                this.reason = ablyException;
            }

            @Override // io.ably.lib.http.BasePaginatedQuery.ResultRequest
            public PaginatedResult<T> sync() throws AblyException {
                throw this.reason;
            }

            @Override // io.ably.lib.http.BasePaginatedQuery.ResultRequest
            public void async(Callback<AsyncPaginatedResult<T>> callback) {
                callback.onError(this.reason.errorInfo);
            }
        }
    }

    private static abstract class ResultPageWrapper<T> {
        protected final BasePaginatedResult<T> resultBase;

        protected ResultPageWrapper(BasePaginatedResult<T> basePaginatedResult) {
            this.resultBase = basePaginatedResult;
        }

        public T[] items() {
            return this.resultBase.items();
        }

        public boolean hasFirst() {
            return this.resultBase.hasFirst();
        }

        public boolean hasCurrent() {
            return this.resultBase.hasCurrent();
        }

        public boolean hasNext() {
            return this.resultBase.hasNext();
        }

        public boolean isLast() {
            return this.resultBase.isLast();
        }
    }

    private static class SyncResultPage<T> extends ResultPageWrapper<T> implements PaginatedResult<T> {
        SyncResultPage(BasePaginatedResult<T> basePaginatedResult) {
            super(basePaginatedResult);
        }

        @Override // io.ably.lib.types.PaginatedResult
        public PaginatedResult<T> first() throws AblyException {
            return new SyncResultPage(this.resultBase.first().sync());
        }

        @Override // io.ably.lib.types.PaginatedResult
        public PaginatedResult<T> current() throws AblyException {
            return new SyncResultPage(this.resultBase.current().sync());
        }

        @Override // io.ably.lib.types.PaginatedResult
        public PaginatedResult<T> next() throws AblyException {
            return new SyncResultPage(this.resultBase.next().sync());
        }
    }

    private static class AsyncResultPage<T> extends ResultPageWrapper<T> implements AsyncPaginatedResult<T> {
        AsyncResultPage(BasePaginatedResult<T> basePaginatedResult) {
            super(basePaginatedResult);
        }

        @Override // io.ably.lib.types.AsyncPaginatedResult
        public void first(Callback<AsyncPaginatedResult<T>> callback) {
            this.resultBase.first().async(new CallbackBridge(callback));
        }

        @Override // io.ably.lib.types.AsyncPaginatedResult
        public void current(Callback<AsyncPaginatedResult<T>> callback) {
            this.resultBase.current().async(new CallbackBridge(callback));
        }

        @Override // io.ably.lib.types.AsyncPaginatedResult
        public void next(Callback<AsyncPaginatedResult<T>> callback) {
            this.resultBase.next().async(new CallbackBridge(callback));
        }
    }

    private static class CallbackBridge<T> implements Callback<BasePaginatedResult<T>> {
        private final Callback<AsyncPaginatedResult<T>> callback;

        CallbackBridge(Callback<AsyncPaginatedResult<T>> callback) {
            this.callback = callback;
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(BasePaginatedResult<T> basePaginatedResult) {
            this.callback.onSuccess(new AsyncResultPage(basePaginatedResult));
        }

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            this.callback.onError(errorInfo);
        }
    }
}
