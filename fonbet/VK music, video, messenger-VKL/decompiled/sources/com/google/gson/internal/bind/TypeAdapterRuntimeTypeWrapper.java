package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import xsna.xtp0;

/* loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
    public final Gson a;
    public final TypeAdapter<T> b;
    public final Type c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.a = gson;
        this.b = typeAdapter;
        this.c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public final T b(JsonReader jsonReader) throws IOException {
        return this.b.b(jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, T t) throws IOException {
        ?? r0 = this.c;
        Class<?> cls = (t == null || !(r0 == Object.class || (r0 instanceof TypeVariable) || (r0 instanceof Class))) ? r0 : t.getClass();
        TypeAdapter<T> typeAdapter = this.b;
        if (cls != r0) {
            TypeAdapter<T> adapter = this.a.getAdapter(xtp0.get((Type) cls));
            if (!(adapter instanceof ReflectiveTypeAdapterFactory.Adapter) || (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                typeAdapter = adapter;
            }
        }
        typeAdapter.c(jsonWriter, t);
    }
}
