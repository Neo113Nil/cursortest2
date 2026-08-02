package io.ably.lib.http;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;

/* loaded from: classes9.dex */
public class Http implements AutoCloseable {
    private final AsyncHttpScheduler asyncHttp;
    private final SyncHttpScheduler syncHttp;

    public interface Execute<Result> {
        void execute(HttpScheduler httpScheduler, Callback<Result> callback) throws AblyException;
    }

    public Http(AsyncHttpScheduler asyncHttpScheduler, SyncHttpScheduler syncHttpScheduler) {
        this.asyncHttp = asyncHttpScheduler;
        this.syncHttp = syncHttpScheduler;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.asyncHttp.close();
    }

    public void connect() {
        this.asyncHttp.connect();
    }

    public Http exchangeHttpCore(HttpCore httpCore) {
        return new Http(this.asyncHttp.exchangeHttpCore(httpCore), new SyncHttpScheduler(httpCore));
    }

    public class Request<Result> {
        private final Execute<Result> execute;

        Request(Execute<Result> execute) {
            this.execute = execute;
        }

        public Result sync() throws AblyException {
            final SyncExecuteResult syncExecuteResult = new SyncExecuteResult();
            this.execute.execute(Http.this.syncHttp, new Callback<Result>() { // from class: io.ably.lib.http.Http.Request.1
                @Override // io.ably.lib.types.Callback
                public void onSuccess(Result result) {
                    syncExecuteResult.ok = result;
                }

                @Override // io.ably.lib.types.Callback
                public void onError(ErrorInfo errorInfo) {
                    syncExecuteResult.error = errorInfo;
                }
            });
            if (syncExecuteResult.error != null) {
                throw AblyException.fromErrorInfo(syncExecuteResult.error);
            }
            return syncExecuteResult.ok;
        }

        public void async(Callback<Result> callback) {
            try {
                this.execute.execute(Http.this.asyncHttp, callback);
            } catch (AblyException e) {
                callback.onError(e.errorInfo);
            }
        }
    }

    public <Result> Request<Result> request(Execute<Result> execute) {
        return new Request<>(execute);
    }

    public <Result> Request<Result> failedRequest(final AblyException ablyException) {
        return new Request<>(new Execute<Result>() { // from class: io.ably.lib.http.Http.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, final Callback<Result> callback) throws AblyException {
                httpScheduler.execute(new Runnable() { // from class: io.ably.lib.http.Http.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        callback.onError(ablyException.errorInfo);
                    }
                });
            }
        });
    }

    private static class SyncExecuteResult<Result> {
        public ErrorInfo error;
        public Result ok;

        private SyncExecuteResult() {
            this.ok = null;
            this.error = null;
        }
    }
}
