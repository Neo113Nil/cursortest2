package io.sentry;

import io.sentry.UpdateStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes9.dex */
public final class NoOpDistributionApi implements IDistributionApi {
    private static final NoOpDistributionApi instance = new NoOpDistributionApi();

    @Override // io.sentry.IDistributionApi
    public void downloadUpdate(UpdateInfo updateInfo) {
    }

    @Override // io.sentry.IDistributionApi
    public boolean isEnabled() {
        return false;
    }

    private NoOpDistributionApi() {
    }

    public static NoOpDistributionApi getInstance() {
        return instance;
    }

    @Override // io.sentry.IDistributionApi
    public UpdateStatus checkForUpdateBlocking() {
        return UpdateStatus.UpToDate.getInstance();
    }

    @Override // io.sentry.IDistributionApi
    public Future<UpdateStatus> checkForUpdate() {
        return new CompletedFuture(UpdateStatus.UpToDate.getInstance());
    }

    private static final class CompletedFuture<T> implements Future<T> {
        private final T result;

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        CompletedFuture(T t) {
            this.result = t;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException {
            return this.result;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
            return this.result;
        }
    }
}
