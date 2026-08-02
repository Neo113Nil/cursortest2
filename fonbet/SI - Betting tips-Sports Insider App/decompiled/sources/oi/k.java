package oi;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k extends e {
    @Override // oi.e
    public final f a(Type type, Annotation[] annotationArr, androidx.appcompat.widget.a0 a0Var) {
        if (z0.h(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type g10 = z0.g(0, (ParameterizedType) type);
        if (z0.h(g10) != s0.class) {
            return new i(0, g10);
        }
        if (!(g10 instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new i(1, z0.g(0, (ParameterizedType) g10));
    }
}
