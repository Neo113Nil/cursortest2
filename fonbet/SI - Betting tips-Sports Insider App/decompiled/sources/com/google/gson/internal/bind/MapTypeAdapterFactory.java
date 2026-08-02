package com.google.gson.internal.bind;

import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import m3.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class MapTypeAdapterFactory implements y {

    /* renamed from: a, reason: collision with root package name */
    public final f f6242a;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public final class Adapter<K, V> extends x {

        /* renamed from: a, reason: collision with root package name */
        public final x f6243a;

        /* renamed from: b, reason: collision with root package name */
        public final x f6244b;

        /* renamed from: c, reason: collision with root package name */
        public final l f6245c;

        public Adapter(MapTypeAdapterFactory mapTypeAdapterFactory, x xVar, x xVar2, l lVar) {
            this.f6243a = xVar;
            this.f6244b = xVar2;
            this.f6245c = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.x
        public final Object b(r9.a aVar) {
            int i02 = aVar.i0();
            if (i02 == 9) {
                aVar.c0();
                return null;
            }
            Map map = (Map) this.f6245c.d();
            if (i02 == 1) {
                aVar.c();
                while (aVar.C()) {
                    aVar.c();
                    Object b10 = ((TypeAdapterRuntimeTypeWrapper) this.f6243a).f6264b.b(aVar);
                    if (map.put(b10, ((TypeAdapterRuntimeTypeWrapper) this.f6244b).f6264b.b(aVar)) != null) {
                        throw new r("duplicate key: " + b10);
                    }
                    aVar.t();
                }
                aVar.t();
                return map;
            }
            aVar.k();
            while (aVar.C()) {
                m7.b.f20428c.getClass();
                int i5 = aVar.f22325g;
                if (i5 == 0) {
                    i5 = aVar.r();
                }
                if (i5 == 13) {
                    aVar.f22325g = 9;
                } else if (i5 == 12) {
                    aVar.f22325g = 8;
                } else {
                    if (i5 != 14) {
                        throw aVar.u0("a name");
                    }
                    aVar.f22325g = 10;
                }
                Object b11 = ((TypeAdapterRuntimeTypeWrapper) this.f6243a).f6264b.b(aVar);
                if (map.put(b11, ((TypeAdapterRuntimeTypeWrapper) this.f6244b).f6264b.b(aVar)) != null) {
                    throw new r("duplicate key: " + b11);
                }
            }
            aVar.w();
            return map;
        }

        @Override // com.google.gson.x
        public final void c(r9.b bVar, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                bVar.C();
                return;
            }
            bVar.n();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                bVar.y(String.valueOf(entry.getKey()));
                this.f6244b.c(bVar, entry.getValue());
            }
            bVar.w();
        }
    }

    public MapTypeAdapterFactory(f fVar) {
        this.f6242a = fVar;
    }

    @Override // com.google.gson.y
    public final x a(j jVar, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(rawType)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            com.google.gson.internal.e.b(Map.class.isAssignableFrom(rawType));
            Type j = com.google.gson.internal.e.j(type, rawType, com.google.gson.internal.e.g(type, rawType, Map.class), new HashMap());
            actualTypeArguments = j instanceof ParameterizedType ? ((ParameterizedType) j).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type type3 = actualTypeArguments[1];
        return new Adapter(this, new TypeAdapterRuntimeTypeWrapper(jVar, (type2 == Boolean.TYPE || type2 == Boolean.class) ? e.f6290c : jVar.c(TypeToken.get(type2)), type2), new TypeAdapterRuntimeTypeWrapper(jVar, jVar.c(TypeToken.get(type3)), type3), this.f6242a.j(typeToken, false));
    }
}
