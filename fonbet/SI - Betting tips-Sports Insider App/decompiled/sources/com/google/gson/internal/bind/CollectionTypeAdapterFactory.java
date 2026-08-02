package com.google.gson.internal.bind;

import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import m3.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements y {

    /* renamed from: a, reason: collision with root package name */
    public final f f6228a;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class Adapter<E> extends x {

        /* renamed from: a, reason: collision with root package name */
        public final x f6229a;

        /* renamed from: b, reason: collision with root package name */
        public final l f6230b;

        public Adapter(x xVar, l lVar) {
            this.f6229a = xVar;
            this.f6230b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.x
        public final Object b(r9.a aVar) {
            if (aVar.i0() == 9) {
                aVar.c0();
                return null;
            }
            Collection collection = (Collection) this.f6230b.d();
            aVar.c();
            while (aVar.C()) {
                collection.add(((TypeAdapterRuntimeTypeWrapper) this.f6229a).f6264b.b(aVar));
            }
            aVar.t();
            return collection;
        }

        @Override // com.google.gson.x
        public final void c(r9.b bVar, Object obj) {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.C();
                return;
            }
            bVar.k();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f6229a.c(bVar, it.next());
            }
            bVar.t();
        }
    }

    public CollectionTypeAdapterFactory(f fVar) {
        this.f6228a = fVar;
    }

    @Override // com.google.gson.y
    public final x a(j jVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.e.b(Collection.class.isAssignableFrom(rawType));
        Type j = com.google.gson.internal.e.j(type, rawType, com.google.gson.internal.e.g(type, rawType, Collection.class), new HashMap());
        Class cls = j instanceof ParameterizedType ? ((ParameterizedType) j).getActualTypeArguments()[0] : Object.class;
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(jVar, jVar.c(TypeToken.get(cls)), cls), this.f6228a.j(typeToken, false));
    }
}
