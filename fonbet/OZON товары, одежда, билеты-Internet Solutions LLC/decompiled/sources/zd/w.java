package zd;

import Jd.InterfaceC3391a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class w extends H implements Jd.j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Type f108849a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y f108850b;

    public w(@NotNull Type reflectType) {
        y uVar;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f108849a = reflectType;
        if (reflectType instanceof Class) {
            uVar = new u((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            uVar = new I((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            Intrinsics.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            uVar = new u((Class) rawType);
        }
        this.f108850b = uVar;
    }

    @Override // zd.H
    @NotNull
    public final Type I() {
        return this.f108849a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Jd.i, zd.y] */
    @Override // Jd.j
    @NotNull
    public final Jd.i d() {
        return this.f108850b;
    }

    @Override // Jd.d
    @NotNull
    public final Collection<InterfaceC3391a> getAnnotations() {
        return kotlin.collections.K.f71697a;
    }

    @Override // zd.H, Jd.d
    public final InterfaceC3391a j(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // Jd.j
    @NotNull
    public final ArrayList k() {
        Jd.w lVar;
        List<Type> d11 = C11104f.d(this.f108849a);
        ArrayList arrayList = new ArrayList(C7714v.z(d11, 10));
        for (Type type : d11) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z11 = type instanceof Class;
            if (z11) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    lVar = new C11098F(cls);
                    arrayList.add(lVar);
                }
            }
            lVar = ((type instanceof GenericArrayType) || (z11 && ((Class) type).isArray())) ? new l(type) : type instanceof WildcardType ? new K((WildcardType) type) : new w(type);
            arrayList.add(lVar);
        }
        return arrayList;
    }

    @Override // Jd.j
    @NotNull
    public final String m() {
        return this.f108849a.toString();
    }

    @Override // Jd.j
    @NotNull
    public final String t() {
        throw new UnsupportedOperationException("Type not found: " + this.f108849a);
    }

    @Override // Jd.j
    public final boolean z() {
        Type type = this.f108849a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }
}
