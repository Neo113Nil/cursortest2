package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f59894a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f59895b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f59896c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f59894a = gson;
        this.f59895b = typeAdapter;
        this.f59896c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(JsonReader jsonReader) throws IOException {
        return this.f59895b.read(jsonReader);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if ((r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(JsonWriter jsonWriter, T t2) throws IOException {
        TypeAdapter<T> a11;
        ?? r02 = this.f59896c;
        Class<?> cls = (t2 == null || !((r02 instanceof Class) || (r02 instanceof TypeVariable))) ? r02 : t2.getClass();
        TypeAdapter<T> typeAdapter = this.f59895b;
        if (cls != r02) {
            TypeAdapter<T> e11 = this.f59894a.e(com.google.gson.reflect.a.get((Type) cls));
            if (e11 instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = typeAdapter;
                while ((typeAdapter2 instanceof SerializationDelegatingTypeAdapter) && (a11 = ((SerializationDelegatingTypeAdapter) typeAdapter2).a()) != typeAdapter2) {
                    typeAdapter2 = a11;
                }
            }
            typeAdapter = e11;
        }
        typeAdapter.write(jsonWriter, t2);
    }
}
