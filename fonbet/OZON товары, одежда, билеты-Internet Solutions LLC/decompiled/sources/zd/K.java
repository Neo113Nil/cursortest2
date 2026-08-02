package zd;

import Jd.InterfaceC3391a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class K extends H implements Jd.B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WildcardType f108811a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.collections.K f108812b;

    public K(@NotNull WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f108811a = reflectType;
        this.f108812b = kotlin.collections.K.f71697a;
    }

    @Override // Jd.B
    public final boolean G() {
        Intrinsics.checkNotNullExpressionValue(this.f108811a.getUpperBounds(), "getUpperBounds(...)");
        return !Intrinsics.d(C7705l.F(r0), Object.class);
    }

    @Override // zd.H
    public final Type I() {
        return this.f108811a;
    }

    @Override // Jd.d
    @NotNull
    public final Collection<InterfaceC3391a> getAnnotations() {
        return this.f108812b;
    }

    @Override // Jd.B
    public final H y() {
        WildcardType wildcardType = this.f108811a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object Y11 = C7705l.Y(lowerBounds);
            Intrinsics.checkNotNullExpressionValue(Y11, "single(...)");
            Type type = (Type) Y11;
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
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) C7705l.Y(upperBounds);
        if (Intrinsics.d(type2, Object.class)) {
            return null;
        }
        Intrinsics.f(type2);
        Intrinsics.checkNotNullParameter(type2, "type");
        boolean z12 = type2 instanceof Class;
        if (z12) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new C11098F(cls2);
            }
        }
        return ((type2 instanceof GenericArrayType) || (z12 && ((Class) type2).isArray())) ? new l(type2) : type2 instanceof WildcardType ? new K((WildcardType) type2) : new w(type2);
    }
}
