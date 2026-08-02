package retrofit2.adapter.rxjava2;

import io.reactivex.AbstractC7094b;
import io.reactivex.h;
import io.reactivex.k;
import io.reactivex.p;
import io.reactivex.x;
import io.reactivex.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: classes6.dex */
public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {
    private final boolean isAsync;
    private final x scheduler;

    private RxJava2CallAdapterFactory(x xVar, boolean z11) {
        this.scheduler = xVar;
        this.isAsync = z11;
    }

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory(null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory(null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(x xVar) {
        if (xVar != null) {
            return new RxJava2CallAdapterFactory(xVar, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type type2;
        boolean z11;
        boolean z12;
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        if (rawType == AbstractC7094b.class) {
            return new RxJava2CallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        boolean z13 = rawType == h.class;
        boolean z14 = rawType == y.class;
        boolean z15 = rawType == k.class;
        if (rawType != p.class && !z13 && !z14 && !z15) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z13 ? !z14 ? z15 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound);
        if (rawType2 == Response.class) {
            if (!(parameterUpperBound instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            type2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z12 = false;
            z11 = false;
        } else if (rawType2 != Result.class) {
            type2 = parameterUpperBound;
            z11 = true;
            z12 = false;
        } else {
            if (!(parameterUpperBound instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            type2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z12 = true;
            z11 = false;
        }
        return new RxJava2CallAdapter(type2, this.scheduler, this.isAsync, z12, z11, z13, z14, z15, false);
    }
}
