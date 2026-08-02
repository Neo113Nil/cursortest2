package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import j$.util.concurrent.ConcurrentHashMap;
import m3.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements y {

    /* renamed from: c, reason: collision with root package name */
    public static final y f6238c;

    /* renamed from: a, reason: collision with root package name */
    public final f f6239a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6240b = new ConcurrentHashMap();

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class DummyTypeAdapterFactory implements y {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.y
        public final x a(j jVar, TypeToken typeToken) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i5) {
            this();
        }
    }

    static {
        int i5 = 0;
        f6238c = new DummyTypeAdapterFactory(i5);
        new DummyTypeAdapterFactory(i5);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(f fVar) {
        this.f6239a = fVar;
    }

    @Override // com.google.gson.y
    public final x a(j jVar, TypeToken typeToken) {
        o9.a aVar = (o9.a) typeToken.getRawType().getAnnotation(o9.a.class);
        if (aVar == null) {
            return null;
        }
        return b(this.f6239a, jVar, typeToken, aVar, true);
    }

    public final x b(f fVar, j jVar, TypeToken typeToken, o9.a aVar, boolean z5) {
        x a7;
        Object d10 = fVar.j(TypeToken.get(aVar.value()), true).d();
        boolean nullSafe = aVar.nullSafe();
        if (d10 instanceof x) {
            a7 = (x) d10;
        } else {
            if (!(d10 instanceof y)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + d10.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            y yVar = (y) d10;
            if (z5) {
                y yVar2 = (y) this.f6240b.putIfAbsent(typeToken.getRawType(), yVar);
                if (yVar2 != null) {
                    yVar = yVar2;
                }
            }
            a7 = yVar.a(jVar, typeToken);
        }
        return (a7 == null || !nullSafe) ? a7 : a7.a();
    }
}
