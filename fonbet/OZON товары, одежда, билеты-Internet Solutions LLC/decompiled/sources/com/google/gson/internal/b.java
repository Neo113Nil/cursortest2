package com.google.gson.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import n8.InterfaceC8452b;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements o, n8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f59828a;

    public /* synthetic */ b(Object obj) {
        this.f59828a = obj;
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return w8.e.d((n8.w) this.f59828a, interfaceC8452b);
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        Type type = (Type) this.f59828a;
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new com.google.gson.j("Invalid EnumMap type: " + type.toString());
    }
}
