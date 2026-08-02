package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import xsna.a9y;
import xsna.k8y;
import xsna.rtp0;
import xsna.u6j;
import xsna.uay;
import xsna.xtp0;

/* loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements rtp0 {
    public final u6j b;

    public JsonAdapterAnnotationTypeAdapterFactory(u6j u6jVar) {
        this.b = u6jVar;
    }

    public static TypeAdapter b(u6j u6jVar, Gson gson, xtp0 xtp0Var, k8y k8yVar) {
        TypeAdapter treeTypeAdapter;
        Object h = u6jVar.a(xtp0.get((Class) k8yVar.value())).h();
        if (h instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) h;
        } else if (h instanceof rtp0) {
            treeTypeAdapter = ((rtp0) h).a(gson, xtp0Var);
        } else {
            boolean z = h instanceof uay;
            if (!z && !(h instanceof a9y)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + h.getClass().getName() + " as a @JsonAdapter for " + xtp0Var.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter(z ? (uay) h : null, h instanceof a9y ? (a9y) h : null, gson, xtp0Var, null);
        }
        return (treeTypeAdapter == null || !k8yVar.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.a();
    }

    @Override // xsna.rtp0
    public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
        k8y k8yVar = (k8y) xtp0Var.getRawType().getAnnotation(k8y.class);
        if (k8yVar == null) {
            return null;
        }
        return b(this.b, gson, xtp0Var, k8yVar);
    }
}
