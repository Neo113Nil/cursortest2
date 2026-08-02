package oi;

import j$.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class x0 implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f21353a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f21354b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f21355c;

    public x0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            z0.d(type3);
        }
        this.f21353a = type;
        this.f21354b = type2;
        this.f21355c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && z0.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f21355c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f21353a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f21354b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f21355c) ^ this.f21354b.hashCode();
        Type type = this.f21353a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f21355c;
        int length = typeArr.length;
        Type type = this.f21354b;
        if (length == 0) {
            return z0.r(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(z0.r(type));
        sb2.append("<");
        sb2.append(z0.r(typeArr[0]));
        for (int i5 = 1; i5 < typeArr.length; i5++) {
            sb2.append(", ");
            sb2.append(z0.r(typeArr[i5]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
