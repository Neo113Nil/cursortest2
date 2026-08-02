package com.google.gson;

import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class Gson$FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public x f6205a = null;

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        x xVar = this.f6205a;
        if (xVar != null) {
            return xVar.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        x xVar = this.f6205a;
        if (xVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        xVar.c(bVar, obj);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final x d() {
        x xVar = this.f6205a;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
