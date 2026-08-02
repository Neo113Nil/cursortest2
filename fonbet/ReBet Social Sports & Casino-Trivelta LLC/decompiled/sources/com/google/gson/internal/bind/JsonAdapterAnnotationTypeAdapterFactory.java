package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.c;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;

/* loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    public final c f38128a;

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f38128a = cVar;
    }

    public TypeAdapter a(c cVar, Gson gson, TypeToken typeToken, Gb.b bVar) {
        TypeAdapter typeAdapter;
        Object a10 = cVar.b(TypeToken.get(bVar.value())).a();
        boolean nullSafe = bVar.nullSafe();
        if (a10 instanceof TypeAdapter) {
            typeAdapter = (TypeAdapter) a10;
        } else if (a10 instanceof v) {
            typeAdapter = ((v) a10).create(gson, typeToken);
        } else {
            boolean z10 = a10 instanceof p;
            if (!z10 && !(a10 instanceof g)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z10 ? (p) a10 : null, a10 instanceof g ? (g) a10 : null, gson, typeToken, null, nullSafe);
            nullSafe = false;
            typeAdapter = treeTypeAdapter;
        }
        return (typeAdapter == null || !nullSafe) ? typeAdapter : typeAdapter.nullSafe();
    }

    @Override // com.google.gson.v
    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Gb.b bVar = (Gb.b) typeToken.getRawType().getAnnotation(Gb.b.class);
        if (bVar == null) {
            return null;
        }
        return a(this.f38128a, gson, typeToken, bVar);
    }
}
