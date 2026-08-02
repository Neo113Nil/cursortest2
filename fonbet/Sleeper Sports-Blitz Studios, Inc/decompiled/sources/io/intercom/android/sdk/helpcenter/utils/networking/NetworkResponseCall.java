package io.intercom.android.sdk.helpcenter.utils.networking;

import androidx.exifinterface.media.ExifInterface;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* compiled from: NetworkResponseCall.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00018\u00008\u00000\u0000H\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall;", ExifInterface.LATITUDE_SOUTH, "", "Lretrofit2/Call;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "delegate", "<init>", "(Lretrofit2/Call;)V", "enqueue", "", "callback", "Lretrofit2/Callback;", "isExecuted", "", "clone", "kotlin.jvm.PlatformType", "isCanceled", "cancel", "execute", "Lretrofit2/Response;", "request", "Lokhttp3/Request;", "timeout", "Lokio/Timeout;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkResponseCall<S> implements Call<NetworkResponse<? extends S>> {
    public static final int $stable = 8;
    private final Call<S> delegate;

    public NetworkResponseCall(Call<S> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<NetworkResponse<S>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.delegate.enqueue(new Callback<S>() { // from class: io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseCall$enqueue$1
            @Override // retrofit2.Callback
            public void onResponse(Call<S> call, Response<S> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                S body = response.body();
                int code = response.code();
                if (!response.isSuccessful()) {
                    callback.onResponse(this, Response.success(new NetworkResponse.ServerError(code)));
                } else if (body != null) {
                    callback.onResponse(this, Response.success(new NetworkResponse.Success(body)));
                } else {
                    callback.onResponse(this, Response.success(new NetworkResponse.ClientError(new Throwable())));
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<S> call, Throwable throwable) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                callback.onResponse(this, Response.success(throwable instanceof IOException ? new NetworkResponse.NetworkError((IOException) throwable) : new NetworkResponse.ClientError(throwable)));
            }
        });
    }

    @Override // retrofit2.Call
    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    @Override // retrofit2.Call
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public NetworkResponseCall<S> m12020clone() {
        Call<S> m12020clone = this.delegate.m12020clone();
        Intrinsics.checkNotNullExpressionValue(m12020clone, "clone(...)");
        return new NetworkResponseCall<>(m12020clone);
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override // retrofit2.Call
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // retrofit2.Call
    public Response<NetworkResponse<S>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.Call
    public Request request() {
        Request request = this.delegate.request();
        Intrinsics.checkNotNullExpressionValue(request, "request(...)");
        return request;
    }

    @Override // retrofit2.Call
    public Timeout timeout() {
        Timeout timeout = this.delegate.timeout();
        Intrinsics.checkNotNullExpressionValue(timeout, "timeout(...)");
        return timeout;
    }
}
