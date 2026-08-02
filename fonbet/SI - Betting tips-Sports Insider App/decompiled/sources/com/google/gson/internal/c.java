package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Type f6312a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f6313b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f6314c;

    public c(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f6312a = type == null ? null : e.a(type);
        this.f6313b = e.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f6314c = typeArr2;
        int length = typeArr2.length;
        for (int i5 = 0; i5 < length; i5++) {
            Objects.requireNonNull(this.f6314c[i5]);
            e.c(this.f6314c[i5]);
            Type[] typeArr3 = this.f6314c;
            typeArr3[i5] = e.a(typeArr3[i5]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && e.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f6314c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f6312a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f6313b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f6314c) ^ this.f6313b.hashCode();
        Type type = this.f6312a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f6314c;
        int length = typeArr.length;
        Type type = this.f6313b;
        if (length == 0) {
            return e.k(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(e.k(type));
        sb2.append("<");
        sb2.append(e.k(typeArr[0]));
        for (int i5 = 1; i5 < length; i5++) {
            sb2.append(", ");
            sb2.append(e.k(typeArr[i5]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
