package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    public final c f38119a;

    public static final class Adapter<E> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final TypeAdapter f38120a;

        /* renamed from: b, reason: collision with root package name */
        public final h f38121b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, h hVar) {
            this.f38120a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f38121b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection read(Jb.a aVar) {
            if (aVar.Y1() == Jb.b.NULL) {
                aVar.n1();
                return null;
            }
            Collection collection = (Collection) this.f38121b.a();
            aVar.p();
            while (aVar.hasNext()) {
                collection.add(this.f38120a.read(aVar));
            }
            aVar.n();
            return collection;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(Jb.c cVar, Collection collection) {
            if (collection == null) {
                cVar.T1();
                return;
            }
            cVar.r();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f38120a.write(cVar, it.next());
            }
            cVar.U();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f38119a = cVar;
    }

    @Override // com.google.gson.v
    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h10 = com.google.gson.internal.b.h(type, rawType);
        return new Adapter(gson, h10, gson.o(TypeToken.get(h10)), this.f38119a.b(typeToken));
    }
}
