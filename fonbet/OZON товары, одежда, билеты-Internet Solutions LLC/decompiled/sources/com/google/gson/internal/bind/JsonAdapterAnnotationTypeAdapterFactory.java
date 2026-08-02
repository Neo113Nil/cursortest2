package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.g;
import com.google.gson.m;
import com.google.gson.t;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements t {

    /* renamed from: c, reason: collision with root package name */
    private static final t f59844c;

    /* renamed from: d, reason: collision with root package name */
    private static final t f59845d;

    /* renamed from: a, reason: collision with root package name */
    private final g f59846a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f59847b = new ConcurrentHashMap();

    private static class DummyTypeAdapterFactory implements t {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }

        /* synthetic */ DummyTypeAdapterFactory(int i11) {
            this();
        }
    }

    static {
        int i11 = 0;
        f59844c = new DummyTypeAdapterFactory(i11);
        f59845d = new DummyTypeAdapterFactory(i11);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(g gVar) {
        this.f59846a = gVar;
    }

    final TypeAdapter<?> a(g gVar, Gson gson, com.google.gson.reflect.a<?> aVar, J8.a aVar2, boolean z11) {
        TypeAdapter<?> typeAdapter;
        Object f7 = gVar.b(com.google.gson.reflect.a.get((Class) aVar2.value()), true).f();
        boolean nullSafe = aVar2.nullSafe();
        if (f7 instanceof TypeAdapter) {
            typeAdapter = (TypeAdapter) f7;
        } else if (f7 instanceof t) {
            t tVar = (t) f7;
            if (z11) {
                t tVar2 = (t) this.f59847b.putIfAbsent(aVar.getRawType(), tVar);
                if (tVar2 != null) {
                    tVar = tVar2;
                }
            }
            typeAdapter = tVar.create(gson, aVar);
        } else {
            boolean z12 = f7 instanceof m;
            if (!z12 && !(f7 instanceof i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + f7.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z12 ? (m) f7 : null, f7 instanceof i ? (i) f7 : null, gson, aVar, z11 ? f59844c : f59845d, nullSafe);
            nullSafe = false;
            typeAdapter = treeTypeAdapter;
        }
        return (typeAdapter == null || !nullSafe) ? typeAdapter : typeAdapter.nullSafe();
    }

    public final boolean b(t tVar, com.google.gson.reflect.a aVar) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(tVar);
        if (tVar != f59844c) {
            Class rawType = aVar.getRawType();
            ConcurrentHashMap concurrentHashMap = this.f59847b;
            t tVar2 = (t) concurrentHashMap.get(rawType);
            if (tVar2 == null) {
                J8.a aVar2 = (J8.a) rawType.getAnnotation(J8.a.class);
                if (aVar2 == null) {
                    return false;
                }
                Class<?> value = aVar2.value();
                if (!t.class.isAssignableFrom(value)) {
                    return false;
                }
                t tVar3 = (t) this.f59846a.b(com.google.gson.reflect.a.get((Class) value), true).f();
                t tVar4 = (t) concurrentHashMap.putIfAbsent(rawType, tVar3);
                if (tVar4 != null) {
                    tVar3 = tVar4;
                }
                if (tVar3 != tVar) {
                    return false;
                }
            } else if (tVar2 != tVar) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.gson.t
    public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        J8.a aVar2 = (J8.a) aVar.getRawType().getAnnotation(J8.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (TypeAdapter<T>) a(this.f59846a, gson, aVar, aVar2, true);
    }
}
