package nd;

import Sc.InterfaceC4008j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class Q0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final R0 f76903a;

    /* renamed from: b, reason: collision with root package name */
    private final int f76904b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f76905c;

    public Q0(R0 r02, int i11, InterfaceC4008j interfaceC4008j) {
        this.f76903a = r02;
        this.f76904b = i11;
        this.f76905c = interfaceC4008j;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        R0 r02 = this.f76903a;
        Type f7 = r02.f();
        if (f7 instanceof Class) {
            Class cls = (Class) f7;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            Intrinsics.f(componentType);
            return componentType;
        }
        boolean z11 = f7 instanceof GenericArrayType;
        int i11 = this.f76904b;
        if (z11) {
            if (i11 == 0) {
                Type genericComponentType = ((GenericArrayType) f7).getGenericComponentType();
                Intrinsics.f(genericComponentType);
                return genericComponentType;
            }
            throw new V0("Array type has been queried for a non-0th argument: " + r02);
        }
        if (!(f7 instanceof ParameterizedType)) {
            throw new V0("Non-generic type has been queried for arguments: " + r02);
        }
        Type type = (Type) ((List) this.f76905c.getValue()).get(i11);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) C7705l.F(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            type2 = (Type) C7705l.C(upperBounds);
        }
        Intrinsics.f(type2);
        return type2;
    }
}
