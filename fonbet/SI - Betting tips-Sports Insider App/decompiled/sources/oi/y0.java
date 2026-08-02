package oi;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y0 implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f21359a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f21360b;

    public y0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            z0.d(typeArr[0]);
            this.f21360b = null;
            this.f21359a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        z0.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f21360b = typeArr2[0];
        this.f21359a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && z0.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f21360b;
        return type != null ? new Type[]{type} : z0.f21363a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f21359a};
    }

    public final int hashCode() {
        Type type = this.f21360b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f21359a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f21360b;
        if (type != null) {
            return "? super " + z0.r(type);
        }
        Type type2 = this.f21359a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + z0.r(type2);
    }
}
