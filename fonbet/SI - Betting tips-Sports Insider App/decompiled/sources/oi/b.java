package oi;

import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21241a;

    public /* synthetic */ b(int i5) {
        this.f21241a = i5;
    }

    @Override // oi.l
    public m a(Type type) {
        switch (this.f21241a) {
            case 0:
                if (gh.m0.class.isAssignableFrom(z0.h(type))) {
                    return a.f21227d;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    @Override // oi.l
    public final m b(Type type, Annotation[] annotationArr, androidx.appcompat.widget.a0 a0Var) {
        switch (this.f21241a) {
            case 0:
                if (type == gh.r0.class) {
                    return z0.k(annotationArr, qi.w.class) ? a.f21228e : a.f21226c;
                }
                if (type == Void.class) {
                    return a.f21230g;
                }
                if (z0.f21364b && type == Unit.class) {
                    return a.f21229f;
                }
                return null;
            default:
                if (z0.h(type) != Optional.class) {
                    return null;
                }
                return new i2.d(24, a0Var.A(z0.g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
