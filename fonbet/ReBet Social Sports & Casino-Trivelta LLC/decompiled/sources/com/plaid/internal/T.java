package com.plaid.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

@SourceDebugExtension({"SMAP\nCoroutineCallAdapterFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineCallAdapterFactory.kt\ncom/plaid/internal/core/networking/coroutine/CoroutineCallAdapterFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
/* loaded from: classes3.dex */
public final class T extends CallAdapter.Factory {
    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public final CallAdapter<?, ?> get(@NotNull Type returnType, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.areEqual(Call.class, CallAdapter.Factory.getRawType(returnType))) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>");
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
        if (!Intrinsics.areEqual(CallAdapter.Factory.getRawType(parameterUpperBound), AbstractC3654i4.class)) {
            return null;
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
        }
        ParameterizedType parameterizedType = (ParameterizedType) parameterUpperBound;
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, parameterizedType);
        Converter nextResponseBodyConverter = retrofit.nextResponseBodyConverter(null, CallAdapter.Factory.getParameterUpperBound(1, parameterizedType), annotations);
        Intrinsics.checkNotNull(parameterUpperBound2);
        Intrinsics.checkNotNull(nextResponseBodyConverter);
        return new S(parameterUpperBound2, nextResponseBodyConverter);
    }
}
