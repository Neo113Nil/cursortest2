package zd;

import Jd.InterfaceC3390A;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class x extends AbstractC11095C implements Jd.k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Constructor<?> f108851a;

    public x(@NotNull Constructor<?> member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f108851a = member;
    }

    @Override // zd.AbstractC11095C
    public final Member I() {
        return this.f108851a;
    }

    @NotNull
    public final Constructor<?> K() {
        return this.f108851a;
    }

    @Override // Jd.k
    @NotNull
    public final List<InterfaceC3390A> f() {
        Constructor<?> constructor = this.f108851a;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        Intrinsics.f(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return kotlin.collections.K.f71697a;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C7705l.w(1, genericParameterTypes.length, genericParameterTypes);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + constructor);
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            parameterAnnotations = (Annotation[][]) C7705l.w(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
        }
        Intrinsics.f(parameterAnnotations);
        return J(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
    }

    @Override // Jd.y
    @NotNull
    public final ArrayList getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f108851a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new I(typeVariable));
        }
        return arrayList;
    }
}
