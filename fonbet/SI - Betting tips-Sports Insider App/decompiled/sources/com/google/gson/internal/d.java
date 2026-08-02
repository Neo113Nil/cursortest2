package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Type f6315a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f6316b;

    public d(Type[] typeArr, Type[] typeArr2) {
        e.b(typeArr2.length <= 1);
        e.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            e.c(typeArr[0]);
            this.f6316b = null;
            this.f6315a = e.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        e.c(typeArr2[0]);
        e.b(typeArr[0] == Object.class);
        this.f6316b = e.a(typeArr2[0]);
        this.f6315a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && e.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f6316b;
        return type != null ? new Type[]{type} : e.f6317a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f6315a};
    }

    public final int hashCode() {
        Type type = this.f6316b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f6315a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f6316b;
        if (type != null) {
            return "? super " + e.k(type);
        }
        Type type2 = this.f6315a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + e.k(type2);
    }
}
