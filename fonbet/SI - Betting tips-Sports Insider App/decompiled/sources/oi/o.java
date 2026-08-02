package oi;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f21281a;

    public o(Executor executor) {
        this.f21281a = executor;
    }

    @Override // oi.e
    public final f a(Type type, Annotation[] annotationArr, androidx.appcompat.widget.a0 a0Var) {
        if (z0.h(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new d7.e(13, z0.g(0, (ParameterizedType) type), z0.k(annotationArr, u0.class) ? null : this.f21281a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
