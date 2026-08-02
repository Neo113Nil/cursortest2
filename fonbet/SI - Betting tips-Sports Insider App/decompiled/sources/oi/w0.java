package oi;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w0 implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f21350a;

    public w0(Type type) {
        this.f21350a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && z0.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f21350a;
    }

    public final int hashCode() {
        return this.f21350a.hashCode();
    }

    public final String toString() {
        return z0.r(this.f21350a) + "[]";
    }
}
