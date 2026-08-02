package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class a implements GenericArrayType, Type {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Type f71856a;

    public a(@NotNull Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f71856a = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return Intrinsics.d(this.f71856a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public final Type getGenericComponentType() {
        return this.f71856a;
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public final String getTypeName() {
        return w.b(this.f71856a) + "[]";
    }

    public final int hashCode() {
        return this.f71856a.hashCode();
    }

    @NotNull
    public final String toString() {
        return getTypeName();
    }
}
