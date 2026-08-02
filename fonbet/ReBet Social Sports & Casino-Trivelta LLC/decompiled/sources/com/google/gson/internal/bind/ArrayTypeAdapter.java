package com.google.gson.internal.bind;

import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter {

    /* renamed from: c, reason: collision with root package name */
    public static final v f38116c = new v() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.v
        public TypeAdapter create(Gson gson, TypeToken typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g10 = com.google.gson.internal.b.g(type);
            return new ArrayTypeAdapter(gson, gson.o(TypeToken.get(g10)), com.google.gson.internal.b.k(g10));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Class f38117a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter f38118b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.f38118b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f38117a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public Object read(Jb.a aVar) {
        if (aVar.Y1() == Jb.b.NULL) {
            aVar.n1();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.p();
        while (aVar.hasNext()) {
            arrayList.add(this.f38118b.read(aVar));
        }
        aVar.n();
        int size = arrayList.size();
        if (!this.f38117a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f38117a, size));
        }
        Object newInstance = Array.newInstance((Class<?>) this.f38117a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.T1();
            return;
        }
        cVar.r();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f38118b.write(cVar, Array.get(obj, i10));
        }
        cVar.U();
    }
}
