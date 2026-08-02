package com.google.gson.internal.bind;

import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes3.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f38180a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter f38181b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f38182c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f38180a = gson;
        this.f38181b = typeAdapter;
        this.f38182c = type;
    }

    public static Type a(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    public static boolean b(TypeAdapter typeAdapter) {
        TypeAdapter a10;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (a10 = ((SerializationDelegatingTypeAdapter) typeAdapter).a()) != typeAdapter) {
            typeAdapter = a10;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(Jb.a aVar) {
        return this.f38181b.read(aVar);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Object obj) {
        TypeAdapter typeAdapter = this.f38181b;
        Type a10 = a(this.f38182c, obj);
        if (a10 != this.f38182c) {
            typeAdapter = this.f38180a.o(TypeToken.get(a10));
            if ((typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !b(this.f38181b)) {
                typeAdapter = this.f38181b;
            }
        }
        typeAdapter.write(cVar, obj);
    }
}
