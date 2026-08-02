package com.google.gson;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x {
    public final x a() {
        return !(this instanceof TypeAdapter$NullSafeTypeAdapter) ? new x() { // from class: com.google.gson.TypeAdapter$NullSafeTypeAdapter
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() != 9) {
                    return x.this.b(aVar);
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                if (obj == null) {
                    bVar.C();
                } else {
                    x.this.c(bVar, obj);
                }
            }

            public final String toString() {
                return "NullSafeTypeAdapter[" + x.this + "]";
            }
        } : this;
    }

    public abstract Object b(r9.a aVar);

    public abstract void c(r9.b bVar, Object obj);
}
