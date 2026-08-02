package com.plaid.internal;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: classes3.dex */
public final class S<S, E> implements CallAdapter<S, Call<AbstractC3654i4<? extends S, ? extends E>>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Type f39603a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Converter<ResponseBody, E> f39604b;

    public S(@NotNull Type successType, @NotNull Converter<ResponseBody, E> errorBodyConverter) {
        Intrinsics.checkNotNullParameter(successType, "successType");
        Intrinsics.checkNotNullParameter(errorBodyConverter, "errorBodyConverter");
        this.f39603a = successType;
        this.f39604b = errorBodyConverter;
    }

    @Override // retrofit2.CallAdapter
    public final Object adapt(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new U(call, this.f39604b);
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    public final Type responseType() {
        return this.f39603a;
    }
}
