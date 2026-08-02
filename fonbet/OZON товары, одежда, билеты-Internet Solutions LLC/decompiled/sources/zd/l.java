package zd;

import Jd.InterfaceC3391a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class l extends H implements Jd.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Type f108836a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final H f108837b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.collections.K f108838c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull Type reflectType) {
        H lVar;
        H h11;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f108836a = reflectType;
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    Class<?> type = cls.getComponentType();
                    Intrinsics.checkNotNullExpressionValue(type, "getComponentType(...)");
                    Intrinsics.checkNotNullParameter(type, "type");
                    lVar = (type == 0 || !type.isPrimitive()) ? ((type instanceof GenericArrayType) || (type != 0 && type.isArray())) ? new l(type) : type instanceof WildcardType ? new K((WildcardType) type) : new w(type) : new C11098F(type);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        Type type2 = ((GenericArrayType) reflectType).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(type2, "getGenericComponentType(...)");
        Intrinsics.checkNotNullParameter(type2, "type");
        boolean z11 = type2 instanceof Class;
        if (z11) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                h11 = new C11098F(cls2);
                this.f108837b = h11;
                this.f108838c = kotlin.collections.K.f71697a;
            }
        }
        lVar = ((type2 instanceof GenericArrayType) || (z11 && ((Class) type2).isArray())) ? new l(type2) : type2 instanceof WildcardType ? new K((WildcardType) type2) : new w(type2);
        h11 = lVar;
        this.f108837b = h11;
        this.f108838c = kotlin.collections.K.f71697a;
    }

    @Override // Jd.f
    public final H B() {
        return this.f108837b;
    }

    @Override // zd.H
    @NotNull
    protected final Type I() {
        return this.f108836a;
    }

    @Override // Jd.d
    @NotNull
    public final Collection<InterfaceC3391a> getAnnotations() {
        return this.f108838c;
    }
}
