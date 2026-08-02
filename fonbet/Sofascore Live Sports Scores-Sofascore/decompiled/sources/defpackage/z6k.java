package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class z6k {
    public static final uea a;

    static {
        ih2 ih2Var = new ih2(", ");
        a = new uea(ih2Var, ih2Var);
    }

    public static void a(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                z1a.u(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    public static Type b(Type type) {
        if (!(type instanceof WildcardType)) {
            return u6k.c.a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        z1a.r("Wildcard cannot have more than one lower bounds.", lowerBounds.length <= 1);
        if (lowerBounds.length == 1) {
            return new c(new Type[]{b(lowerBounds[0])}, new Type[]{Object.class}, 2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        z1a.r("Wildcard should have only one upper bound.", upperBounds.length == 1);
        return new c(new Type[0], new Type[]{b(upperBounds[0])}, 2);
    }

    public static TypeVariable c(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        y6k y6kVar = new y6k(new x6k(genericDeclaration, str, typeArr));
        z1a.q(TypeVariable.class, "%s is not an interface", TypeVariable.class.isInterface());
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, y6kVar));
    }
}
