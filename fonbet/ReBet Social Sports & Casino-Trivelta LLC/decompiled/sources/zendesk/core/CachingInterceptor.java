package zendesk.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ld.AbstractC5459a;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
class CachingInterceptor implements Interceptor {
    private static final String LOG_TAG = "CachingInterceptor";
    private final BaseStorage cache;
    private final Map<String, Lock> locks = new HashMap();

    public CachingInterceptor(BaseStorage baseStorage) {
        this.cache = baseStorage;
    }

    private Response createResponse(int i10, Request request, ResponseBody responseBody) {
        Response.Builder builder = new Response.Builder();
        if (responseBody != null) {
            builder.body(responseBody);
        } else {
            AbstractC5459a.i(LOG_TAG, "Response body is null", new Object[0]);
        }
        return builder.code(i10).message(request.method()).request(request).protocol(Protocol.HTTP_1_1).build();
    }

    private Response loadData(String str, Interceptor.Chain chain) {
        int i10;
        ResponseBody responseBody;
        ResponseBody responseBody2 = (ResponseBody) this.cache.get(str, ResponseBody.class);
        if (responseBody2 == null) {
            AbstractC5459a.b(LOG_TAG, "Response not cached, loading it from the network. | %s", str);
            Response proceed = chain.proceed(chain.request());
            if (proceed.isSuccessful()) {
                MediaType mediaType = proceed.body().get$contentType();
                byte[] bytes = proceed.body().bytes();
                this.cache.put(str, ResponseBody.create(mediaType, bytes));
                responseBody = ResponseBody.create(mediaType, bytes);
            } else {
                AbstractC5459a.b(LOG_TAG, "Unable to load data from network. | %s", str);
                responseBody = proceed.body();
            }
            i10 = proceed.code();
        } else {
            i10 = 200;
            responseBody = responseBody2;
        }
        return createResponse(i10, chain.request(), responseBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Lock reentrantLock;
        String url = chain.request().url().getUrl();
        synchronized (this.locks) {
            try {
                if (this.locks.containsKey(url)) {
                    reentrantLock = this.locks.get(url);
                } else {
                    reentrantLock = new ReentrantLock();
                    this.locks.put(url, reentrantLock);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            reentrantLock.lock();
            return loadData(url, chain);
        } finally {
            reentrantLock.unlock();
        }
    }
}
