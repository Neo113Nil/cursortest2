package com.plaid.internal;

import com.plaid.internal.AbstractC3654i4;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;

/* loaded from: classes3.dex */
public final class U<S, E> implements Call<AbstractC3654i4<? extends S, ? extends E>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Call<S> f39647a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Converter<ResponseBody, E> f39648b;

    public static final class a implements Callback<S> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback<AbstractC3654i4<S, E>> f39649a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U<S, E> f39650b;

        public a(Callback<AbstractC3654i4<S, E>> callback, U<S, E> u10) {
            this.f39649a = callback;
            this.f39650b = u10;
        }

        @Override // retrofit2.Callback
        public final void onFailure(@NotNull Call<S> call, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f39649a.onResponse(this.f39650b, Response.success(throwable instanceof IOException ? new AbstractC3654i4.b((IOException) throwable) : new AbstractC3654i4.d(throwable)));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
        @Override // retrofit2.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onResponse(@NotNull Call<S> call, @NotNull Response<S> response) {
            E e10;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            S body = response.body();
            int code = response.code();
            ResponseBody errorBody = response.errorBody();
            if (response.isSuccessful()) {
                if (body != null) {
                    this.f39649a.onResponse(this.f39650b, Response.success(new AbstractC3654i4.c(body)));
                    return;
                } else {
                    this.f39649a.onResponse(this.f39650b, Response.success(new AbstractC3654i4.d(null)));
                    return;
                }
            }
            if (errorBody != null && errorBody.getContentLength() != 0) {
                try {
                    e10 = this.f39650b.f39648b.convert(errorBody);
                } catch (Exception unused) {
                }
                if (e10 == null) {
                    this.f39649a.onResponse(this.f39650b, Response.success(new AbstractC3654i4.a(e10, code)));
                    return;
                } else {
                    this.f39649a.onResponse(this.f39650b, Response.success(new AbstractC3654i4.d(null)));
                    return;
                }
            }
            e10 = null;
            if (e10 == null) {
            }
        }
    }

    public U(@NotNull Call<S> delegate, @NotNull Converter<ResponseBody, E> errorConverter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(errorConverter, "errorConverter");
        this.f39647a = delegate;
        this.f39648b = errorConverter;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.f39647a.cancel();
    }

    @Override // retrofit2.Call
    public final void enqueue(@NotNull Callback<AbstractC3654i4<S, E>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f39647a.enqueue(new a(callback, this));
    }

    @Override // retrofit2.Call
    @NotNull
    public final Response<AbstractC3654i4<S, E>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f39647a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f39647a.isExecuted();
    }

    @Override // retrofit2.Call
    @NotNull
    public final Request request() {
        Request request = this.f39647a.request();
        Intrinsics.checkNotNullExpressionValue(request, "request(...)");
        return request;
    }

    @Override // retrofit2.Call
    @NotNull
    public final ti.H timeout() {
        ti.H timeout = this.f39647a.timeout();
        Intrinsics.checkNotNullExpressionValue(timeout, "timeout(...)");
        return timeout;
    }

    @Override // retrofit2.Call
    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final U<S, E> m110clone() {
        Call<S> m110clone = this.f39647a.m110clone();
        Intrinsics.checkNotNullExpressionValue(m110clone, "clone(...)");
        return new U<>(m110clone, this.f39648b);
    }
}
