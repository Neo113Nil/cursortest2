package fg0;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import uf0.InterfaceC10056a;

/* renamed from: fg0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6563b extends CallAdapter.Factory {
    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter<?, ?> get(@NotNull Type returnType, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.d(CallAdapter.Factory.getRawType(returnType), Call.class)) {
            return null;
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
        if (!Intrinsics.d(CallAdapter.Factory.getRawType(parameterUpperBound), InterfaceC10056a.class)) {
            return null;
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalArgumentException("OzonNetworkResponse должен быть параметризирован, например OzonNetworkResponse<Body>");
        }
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
        Intrinsics.f(parameterUpperBound2);
        return new C6562a(parameterUpperBound2);
    }
}
