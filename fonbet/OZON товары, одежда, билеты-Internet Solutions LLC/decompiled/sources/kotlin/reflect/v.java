package kotlin.reflect;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class v implements TypeVariable<GenericDeclaration>, Type {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f71861a;

    public v(@NotNull r typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f71861a = typeParameter;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !Intrinsics.d(this.f71861a.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public final Type[] getBounds() {
        Type c11;
        List<q> upperBounds = this.f71861a.getUpperBounds();
        ArrayList arrayList = new ArrayList(C7714v.z(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            c11 = w.c((q) it.next(), true);
            arrayList.add(c11);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public final GenericDeclaration getGenericDeclaration() {
        throw new Sc.p(Nk.a.b("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f71861a));
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public final String getName() {
        return this.f71861a.getName();
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public final String getTypeName() {
        return this.f71861a.getName();
    }

    public final int hashCode() {
        this.f71861a.getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    @NotNull
    public final String toString() {
        return this.f71861a.getName();
    }
}
