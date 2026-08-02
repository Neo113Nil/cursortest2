package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.h;
import com.google.gson.internal.l;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    public final c f38129a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38130b;

    public final class Adapter<K, V> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final TypeAdapter f38131a;

        /* renamed from: b, reason: collision with root package name */
        public final TypeAdapter f38132b;

        /* renamed from: c, reason: collision with root package name */
        public final h f38133c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, h hVar) {
            this.f38131a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f38132b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f38133c = hVar;
        }

        public final String a(com.google.gson.h hVar) {
            if (!hVar.l()) {
                if (hVar.j()) {
                    return "null";
                }
                throw new AssertionError();
            }
            n f10 = hVar.f();
            if (f10.q()) {
                return String.valueOf(f10.n());
            }
            if (f10.o()) {
                return Boolean.toString(f10.a());
            }
            if (f10.r()) {
                return f10.h();
            }
            throw new AssertionError();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map read(Jb.a aVar) {
            Jb.b Y12 = aVar.Y1();
            if (Y12 == Jb.b.NULL) {
                aVar.n1();
                return null;
            }
            Map map = (Map) this.f38133c.a();
            if (Y12 != Jb.b.BEGIN_ARRAY) {
                aVar.m();
                while (aVar.hasNext()) {
                    e.f38277a.a(aVar);
                    Object read = this.f38131a.read(aVar);
                    if (map.put(read, this.f38132b.read(aVar)) != null) {
                        throw new q("duplicate key: " + read);
                    }
                }
                aVar.t();
                return map;
            }
            aVar.p();
            while (aVar.hasNext()) {
                aVar.p();
                Object read2 = this.f38131a.read(aVar);
                if (map.put(read2, this.f38132b.read(aVar)) != null) {
                    throw new q("duplicate key: " + read2);
                }
                aVar.n();
            }
            aVar.n();
            return map;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(Jb.c cVar, Map map) {
            if (map == null) {
                cVar.T1();
                return;
            }
            if (!MapTypeAdapterFactory.this.f38130b) {
                cVar.B();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.n1(String.valueOf(entry.getKey()));
                    this.f38132b.write(cVar, entry.getValue());
                }
                cVar.w0();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.h jsonTree = this.f38131a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.i() || jsonTree.k();
            }
            if (!z10) {
                cVar.B();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.n1(a((com.google.gson.h) arrayList.get(i10)));
                    this.f38132b.write(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.w0();
                return;
            }
            cVar.r();
            int size2 = arrayList.size();
            while (i10 < size2) {
                cVar.r();
                l.b((com.google.gson.h) arrayList.get(i10), cVar);
                this.f38132b.write(cVar, arrayList2.get(i10));
                cVar.U();
                i10++;
            }
            cVar.U();
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z10) {
        this.f38129a = cVar;
        this.f38130b = z10;
    }

    public final TypeAdapter a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f38212f : gson.o(TypeToken.get(type));
    }

    @Override // com.google.gson.v
    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] j10 = com.google.gson.internal.b.j(type, rawType);
        return new Adapter(gson, j10[0], a(gson, j10[0]), j10[1], gson.o(TypeToken.get(j10[1])), this.f38129a.b(typeToken));
    }
}
