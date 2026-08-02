package zd;

import Jd.InterfaceC3390A;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.D, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11096D extends AbstractC11095C implements Jd.q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Method f108801a;

    public C11096D(@NotNull Method member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f108801a = member;
    }

    @Override // Jd.q
    public final H C() {
        Type type = this.f108801a.getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(type, "getGenericReturnType(...)");
        Intrinsics.checkNotNullParameter(type, "type");
        boolean z11 = type instanceof Class;
        if (z11) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                return new C11098F(cls);
            }
        }
        return ((type instanceof GenericArrayType) || (z11 && ((Class) type).isArray())) ? new l(type) : type instanceof WildcardType ? new K((WildcardType) type) : new w(type);
    }

    @Override // Jd.q
    public final boolean H() {
        Object value = this.f108801a.getDefaultValue();
        Object obj = null;
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            obj = C11104f.h(value.getClass()) ? new z(null, (Enum) value) : value instanceof Annotation ? new C11107i(null, (Annotation) value) : value instanceof Object[] ? new C11109k(null, (Object[]) value) : value instanceof Class ? new v(null, (Class) value) : new C11094B(null, value);
        }
        return obj != null;
    }

    @Override // zd.AbstractC11095C
    public final Member I() {
        return this.f108801a;
    }

    @NotNull
    public final Method K() {
        return this.f108801a;
    }

    @Override // Jd.q
    @NotNull
    public final List<InterfaceC3390A> f() {
        Method method = this.f108801a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
        return J(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // Jd.y
    @NotNull
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f108801a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new I(typeVariable));
        }
        return arrayList;
    }
}
