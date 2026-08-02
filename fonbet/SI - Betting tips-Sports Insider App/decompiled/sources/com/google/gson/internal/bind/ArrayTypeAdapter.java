package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends x {

    /* renamed from: c, reason: collision with root package name */
    public static final y f6225c = new y() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, TypeToken typeToken) {
            Type type = typeToken.getType();
            boolean z5 = type instanceof GenericArrayType;
            if (!z5 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z5 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(jVar, jVar.c(TypeToken.get(genericComponentType)), com.google.gson.internal.e.h(genericComponentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Class f6226a;

    /* renamed from: b, reason: collision with root package name */
    public final x f6227b;

    public ArrayTypeAdapter(j jVar, x xVar, Class cls) {
        this.f6227b = new TypeAdapterRuntimeTypeWrapper(jVar, xVar, cls);
        this.f6226a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        if (aVar.i0() == 9) {
            aVar.c0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.C()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f6227b).f6264b.b(aVar));
        }
        aVar.t();
        int size = arrayList.size();
        Class cls = this.f6226a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i5 = 0; i5 < size; i5++) {
            Array.set(newInstance, i5, arrayList.get(i5));
        }
        return newInstance;
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        if (obj == null) {
            bVar.C();
            return;
        }
        bVar.k();
        int length = Array.getLength(obj);
        for (int i5 = 0; i5 < length; i5++) {
            this.f6227b.c(bVar, Array.get(obj, i5));
        }
        bVar.t();
    }
}
