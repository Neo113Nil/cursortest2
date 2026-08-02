package io.intercom.android.sdk.api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes9.dex */
class RetryInterceptor implements Interceptor {
    private static final int MAX_RETRIES = 3;
    private final Sleeper sleeper;

    public RetryInterceptor(Sleeper sleeper) {
        this.sleeper = sleeper;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        int i = 0;
        while (i <= 3) {
            try {
                return chain.proceed(chain.request());
            } catch (IOException e) {
                if (i == 3) {
                    throw e;
                }
                i++;
                this.sleeper.sleep(getRetryTimer(i));
            }
        }
        throw new IOException("request failed due to network errors");
    }

    static int getRetryTimer(int i) {
        return (int) Math.pow(2.0d, i);
    }

    public static class Sleeper {
        public void sleep(int i) {
            try {
                TimeUnit.SECONDS.sleep(i);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
